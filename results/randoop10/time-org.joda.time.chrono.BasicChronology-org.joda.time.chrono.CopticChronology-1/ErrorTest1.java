import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0501");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField11 = copticChronology0.months();
        org.joda.time.DurationField durationField12 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField15 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField1, and durationField11", !(durationField15.compareTo(durationField1) == 0) || (Math.signum(durationField15.compareTo(durationField11)) == Math.signum(durationField1.compareTo(durationField11))));
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0502");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        int int9 = copticChronology0.getMinimumDaysInFirstWeek();
        java.lang.String str10 = copticChronology0.toString();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField11", Math.signum(durationField6.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField6)));
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0503");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField13 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField18 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField19 = copticChronology0.weekyears();
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField21 = copticChronology20.seconds();
        org.joda.time.DurationField durationField22 = copticChronology20.years();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology24 = copticChronology20.withZone(dateTimeZone23);
        java.lang.String str26 = dateTimeZone23.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField28 = copticChronology27.millisOfSecond();
        long long32 = copticChronology27.add(35L, 0L, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        long long36 = copticChronology27.add(readablePeriod33, (long) (short) 0, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone37 = copticChronology27.getZone();
        boolean boolean39 = dateTimeZone37.isStandardOffset((long) (short) 1);
        boolean boolean41 = dateTimeZone37.isStandardOffset((long) ' ');
        long long44 = dateTimeZone37.adjustOffset((long) (short) 10, false);
        org.joda.time.Chronology chronology45 = copticChronology0.withZone(dateTimeZone37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField22", (durationField19.compareTo(durationField22) == 0) == durationField19.equals(durationField22));
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0504");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = copticChronology3.seconds();
        org.joda.time.DurationField durationField5 = copticChronology3.years();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = copticChronology3.withZone(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getNameKey((long) 1);
        org.joda.time.Chronology chronology10 = copticChronology0.withZone(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.year();
        org.joda.time.DurationField durationField14 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField14", (durationField5.compareTo(durationField14) == 0) == durationField5.equals(durationField14));
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0505");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField13 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.weekyearOfCentury();
        org.joda.time.Chronology chronology15 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField16 = chronology15.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField1, and durationField11", !(durationField16.compareTo(durationField1) == 0) || (Math.signum(durationField16.compareTo(durationField11)) == Math.signum(durationField1.compareTo(durationField11))));
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0506");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField3 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField6", Math.signum(durationField3.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField3)));
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0507");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.yearOfEra();
        org.joda.time.Chronology chronology16 = copticChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology7.centuryOfEra();
        org.joda.time.Chronology chronology18 = copticChronology7.withUTC();
        org.joda.time.DateTimeZone dateTimeZone19 = copticChronology7.getZone();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology7.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology7.secondOfDay();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology7.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology7.monthOfYear();
        org.joda.time.DurationField durationField24 = copticChronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField1, and durationField2", !(durationField24.compareTo(durationField1) == 0) || (Math.signum(durationField24.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0508");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = copticChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfCentury();
        org.joda.time.Chronology chronology10 = copticChronology0.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = copticChronology11.seconds();
        org.joda.time.DurationField durationField13 = copticChronology11.years();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology15 = copticChronology11.withZone(dateTimeZone14);
        java.lang.String str17 = dateTimeZone14.getName((long) (byte) 1);
        int int19 = dateTimeZone14.getOffsetFromLocal((long) 0);
        boolean boolean21 = dateTimeZone14.isStandardOffset(0L);
        int int23 = dateTimeZone14.getOffset((long) 115200000);
        long long26 = dateTimeZone14.adjustOffset(8280000022L, false);
        org.joda.time.Chronology chronology27 = chronology10.withZone(dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField13", (durationField6.compareTo(durationField13) == 0) == durationField6.equals(durationField13));
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0509");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.year();
        org.joda.time.DurationField durationField7 = copticChronology0.minutes();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField2", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0510");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) -1);
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone11);
        org.joda.time.DurationField durationField13 = copticChronology12.centuries();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology12.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology12.weekOfWeekyear();
        boolean boolean16 = copticChronology0.equals((java.lang.Object) dateTimeField15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField13", (durationField7.compareTo(durationField13) == 0) == durationField7.equals(durationField13));
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0511");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.days();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, 0);
        org.joda.time.Chronology chronology10 = copticChronology0.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField11 = copticChronology0.centuries();
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField6, and durationField11", !(durationField12.compareTo(durationField6) == 0) || (Math.signum(durationField12.compareTo(durationField11)) == Math.signum(durationField6.compareTo(durationField11))));
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0512");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField5, and durationField3", !(durationField3.compareTo(durationField5) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField5.compareTo(durationField3))));
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0513");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.joda.time.DurationField durationField8 = copticChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField7", Math.signum(durationField1.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField1)));
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0514");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.Chronology chronology4 = copticChronology0.withUTC();
        org.joda.time.DateTimeZone dateTimeZone5 = chronology4.getZone();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = copticChronology6.eras();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology6.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField7", Math.signum(durationField3.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField3)));
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0515");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = copticChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField10 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField12 = copticChronology0.centuries();
        org.joda.time.DurationField durationField13 = copticChronology0.weeks();
        org.joda.time.DurationField durationField14 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.dayOfYear();
        long long19 = copticChronology0.add((-360000024L), 360000100L, 3600000);
        org.joda.time.DurationField durationField20 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField3, and durationField4", !(durationField20.compareTo(durationField3) == 0) || (Math.signum(durationField20.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0516");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.hourOfHalfday();
        long long13 = copticChronology8.add((long) ' ', 359999999L, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology8.clockhourOfDay();
        org.joda.time.DurationField durationField15 = copticChronology8.months();
        org.joda.time.DurationField durationField16 = copticChronology8.weekyears();
        org.joda.time.DurationField durationField17 = copticChronology8.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField16", (durationField2.compareTo(durationField16) == 0) == durationField2.equals(durationField16));
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0517");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        int int9 = copticChronology0.getMinimumDaysInFirstWeek();
        java.lang.String str10 = copticChronology0.toString();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField11", Math.signum(durationField6.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField6)));
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0518");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology0.hours();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField1, and durationField3", !(durationField5.compareTo(durationField1) == 0) || (Math.signum(durationField5.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0519");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 35L, (int) (short) 1);
        org.joda.time.DurationField durationField10 = copticChronology0.days();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField1, and durationField2", !(durationField11.compareTo(durationField1) == 0) || (Math.signum(durationField11.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0520");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = copticChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.millisOfSecond();
        java.lang.String str12 = copticChronology0.toString();
        int int13 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField14 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField3, and durationField4", !(durationField14.compareTo(durationField3) == 0) || (Math.signum(durationField14.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0521");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField10 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField12 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField14 = copticChronology0.centuries();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = copticChronology0.add(readablePeriod15, 18909300000L, 0);
        org.joda.time.DurationField durationField19 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField3, and durationField4", !(durationField19.compareTo(durationField3) == 0) || (Math.signum(durationField19.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0522");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology0.add(readablePeriod10, (-115084794600L), (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField15 = copticChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField15, and durationField9", !(durationField9.compareTo(durationField15) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField15.compareTo(durationField9))));
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0523");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.yearOfEra();
        org.joda.time.Chronology chronology16 = copticChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology7.centuryOfEra();
        org.joda.time.Chronology chronology18 = copticChronology7.withUTC();
        org.joda.time.DateTimeZone dateTimeZone19 = copticChronology7.getZone();
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology20.monthOfYear();
        org.joda.time.DurationField durationField22 = copticChronology20.weekyears();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long26 = dateTimeZone24.nextTransition((long) 3600000);
        long long28 = dateTimeZone24.nextTransition((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = dateTimeZone24.isLocalDateTimeGap(localDateTime29);
        long long33 = dateTimeZone24.convertLocalToUTC(5L, false);
        org.joda.time.Chronology chronology34 = copticChronology20.withZone(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField22", (durationField2.compareTo(durationField22) == 0) == durationField2.equals(durationField22));
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0524");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.year();
        java.lang.String str7 = copticChronology0.toString();
        org.joda.time.DurationField durationField8 = copticChronology0.days();
        org.joda.time.DurationField durationField9 = copticChronology0.months();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology0.add(readablePeriod10, 359999999L, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField15 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField3, and durationField4", !(durationField15.compareTo(durationField3) == 0) || (Math.signum(durationField15.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0525");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.joda.time.DurationField durationField12 = copticChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField12, and durationField11", !(durationField11.compareTo(durationField12) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField12.compareTo(durationField11))));
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0526");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone3.getShortName((long) ' ', locale5);
        org.joda.time.Chronology chronology7 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfHalfday();
        java.lang.String str9 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField11 = copticChronology0.hours();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology0.getZone();
        org.joda.time.DurationField durationField13 = copticChronology0.days();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = copticChronology0.add(readablePeriod14, 241010L, 37920000);
        org.joda.time.DurationField durationField18 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField11, and durationField13", !(durationField18.compareTo(durationField11) == 0) || (Math.signum(durationField18.compareTo(durationField13)) == Math.signum(durationField11.compareTo(durationField13))));
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0527");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 359999999L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = copticChronology11.eras();
        org.joda.time.DurationField durationField13 = copticChronology11.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField12", Math.signum(durationField1.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField1)));
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0528");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.centuryOfEra();
        org.joda.time.DurationField durationField12 = copticChronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField12", (durationField2.compareTo(durationField12) == 0) == durationField2.equals(durationField12));
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0529");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology12.getZone();
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) copticChronology12);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.millisOfDay();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology17.minuteOfDay();
        java.lang.String str20 = copticChronology17.toString();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology17.secondOfDay();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology17.dayOfYear();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology17.hourOfDay();
        org.joda.time.DurationField durationField24 = copticChronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField1, and durationField2", !(durationField24.compareTo(durationField1) == 0) || (Math.signum(durationField24.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0530");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.weekyearOfCentury();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField13 = copticChronology12.seconds();
        org.joda.time.DurationField durationField14 = copticChronology12.years();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology16 = copticChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = copticChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology12.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = copticChronology12.getZone();
        boolean boolean21 = dateTimeZone19.isStandardOffset(20L);
        org.joda.time.Chronology chronology22 = copticChronology7.withZone(dateTimeZone19);
        org.joda.time.DurationField durationField23 = copticChronology7.seconds();
        org.joda.time.DurationField durationField24 = copticChronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField1, and durationField2", !(durationField24.compareTo(durationField1) == 0) || (Math.signum(durationField24.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0531");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField6", Math.signum(durationField3.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField3)));
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0532");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology6.secondOfMinute();
        org.joda.time.DurationField durationField9 = copticChronology6.halfdays();
        org.joda.time.DurationField durationField10 = copticChronology6.months();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology6.halfdayOfDay();
        org.joda.time.DurationField durationField12 = copticChronology6.weekyears();
        org.joda.time.DurationField durationField13 = copticChronology6.centuries();
        org.joda.time.DurationField durationField14 = copticChronology6.millis();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology6.dayOfYear();
        org.joda.time.DurationField durationField16 = copticChronology6.millis();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology6.monthOfYear();
        org.joda.time.DurationField durationField18 = copticChronology6.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology6.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology6.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = copticChronology6.getZone();
        int int23 = dateTimeZone21.getOffset(90L);
        long long27 = dateTimeZone21.convertLocalToUTC((-3599901L), true, 3600001L);
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone21.getName(89L, locale29);
        org.joda.time.Chronology chronology31 = copticChronology0.withZone(dateTimeZone21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField12", (durationField3.compareTo(durationField12) == 0) == durationField3.equals(durationField12));
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0533");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.days();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology9.year();
        org.joda.time.DurationField durationField12 = copticChronology9.hours();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology9.minuteOfDay();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField15 = copticChronology14.seconds();
        org.joda.time.DurationField durationField16 = copticChronology14.years();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology18 = copticChronology14.withZone(dateTimeZone17);
        boolean boolean19 = dateTimeZone17.isFixed();
        java.lang.String str20 = dateTimeZone17.getID();
        org.joda.time.Chronology chronology21 = copticChronology9.withZone(dateTimeZone17);
        org.joda.time.Chronology chronology22 = copticChronology0.withZone(dateTimeZone17);
        org.joda.time.DurationField durationField23 = chronology22.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField3, and durationField6", !(durationField23.compareTo(durationField3) == 0) || (Math.signum(durationField23.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0534");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = copticChronology8.seconds();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology8.add(readablePeriod10, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology8.secondOfDay();
        org.joda.time.DurationField durationField15 = copticChronology8.weekyears();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forID("+00:00");
        java.lang.String str18 = dateTimeZone17.getID();
        boolean boolean19 = dateTimeZone17.isFixed();
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone17.getShortName((long) (-1), locale21);
        org.joda.time.Chronology chronology23 = copticChronology8.withZone(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField24 = copticChronology8.weekyearOfCentury();
        boolean boolean25 = copticChronology0.equals((java.lang.Object) copticChronology8);
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField27 = copticChronology26.seconds();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        long long31 = copticChronology26.add(readablePeriod28, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        long long35 = copticChronology26.add(readablePeriod32, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone36 = copticChronology26.getZone();
        long long39 = dateTimeZone36.adjustOffset(10L, true);
        int int41 = dateTimeZone36.getOffsetFromLocal((long) 'a');
        long long43 = dateTimeZone36.previousTransition(5L);
        org.joda.time.chrono.CopticChronology copticChronology44 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField45 = copticChronology44.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField46 = copticChronology44.secondOfMinute();
        org.joda.time.DurationField durationField47 = copticChronology44.halfdays();
        int int48 = copticChronology44.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField49 = copticChronology44.months();
        org.joda.time.DateTimeField dateTimeField50 = copticChronology44.year();
        org.joda.time.DateTimeZone dateTimeZone51 = copticChronology44.getZone();
        java.lang.String str52 = dateTimeZone51.toString();
        java.lang.String str54 = dateTimeZone51.getShortName((long) 189300000);
        long long57 = dateTimeZone51.convertLocalToUTC((-359999989L), false);
        java.lang.String str59 = dateTimeZone51.getShortName(0L);
        long long61 = dateTimeZone36.getMillisKeepLocal(dateTimeZone51, (-3599868L));
        org.joda.time.Chronology chronology62 = copticChronology0.withZone(dateTimeZone36);
        org.joda.time.DurationField durationField63 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField63, durationField6, and durationField9", !(durationField63.compareTo(durationField6) == 0) || (Math.signum(durationField63.compareTo(durationField9)) == Math.signum(durationField6.compareTo(durationField9))));
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0535");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        long long10 = copticChronology0.add((-5L), 3600004L, (-3600000));
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = copticChronology11.seconds();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = copticChronology11.add(readablePeriod13, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = copticChronology11.add(readablePeriod17, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology11.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone22 = copticChronology11.getZone();
        long long24 = dateTimeZone22.nextTransition(3600001L);
        java.lang.String str26 = dateTimeZone22.getName((long) 360000000);
        int int28 = dateTimeZone22.getStandardOffset(0L);
        long long32 = dateTimeZone22.convertLocalToUTC(34L, true, (-187199990L));
        org.joda.time.Chronology chronology33 = copticChronology0.withZone(dateTimeZone22);
        org.joda.time.DurationField durationField34 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField34, durationField1, and durationField2", !(durationField34.compareTo(durationField1) == 0) || (Math.signum(durationField34.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0536");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField17 = copticChronology0.eras();
        org.joda.time.DurationField durationField18 = copticChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField17", Math.signum(durationField1.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField1)));
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0537");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.era();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField10 = copticChronology9.seconds();
        org.joda.time.DurationField durationField11 = copticChronology9.years();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology13 = copticChronology9.withZone(dateTimeZone12);
        java.lang.String str15 = dateTimeZone12.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField17 = copticChronology16.millisOfSecond();
        org.joda.time.DurationField durationField18 = copticChronology16.centuries();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = copticChronology16.add(readablePeriod19, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField23 = copticChronology16.year();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology16.yearOfEra();
        org.joda.time.DurationField durationField25 = copticChronology16.seconds();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology16.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology16.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology28 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField29 = copticChronology28.seconds();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        long long33 = copticChronology28.add(readablePeriod30, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        long long37 = copticChronology28.add(readablePeriod34, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone38 = copticChronology28.getZone();
        long long41 = dateTimeZone38.adjustOffset(10L, true);
        int int43 = dateTimeZone38.getOffsetFromLocal((long) 'a');
        org.joda.time.Chronology chronology44 = copticChronology16.withZone(dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone45 = copticChronology16.getZone();
        org.joda.time.Chronology chronology46 = chronology8.withZone(dateTimeZone45);
        long long48 = dateTimeZone45.nextTransition((-356400001L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField25", (durationField1.compareTo(durationField25) == 0) == durationField1.equals(durationField25));
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0538");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) 1, (int) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.year();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = copticChronology10.seconds();
        org.joda.time.DurationField durationField12 = copticChronology10.years();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology14 = copticChronology10.withZone(dateTimeZone13);
        java.lang.String str16 = dateTimeZone13.getNameKey((long) 1);
        org.joda.time.Chronology chronology17 = copticChronology7.withZone(dateTimeZone13);
        long long20 = dateTimeZone13.convertLocalToUTC((long) 0, true);
        long long22 = dateTimeZone13.convertUTCToLocal((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        long long26 = dateTimeZone13.getMillisKeepLocal(dateTimeZone24, (long) 100);
        org.joda.time.Chronology chronology27 = copticChronology0.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField28 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField29 = copticChronology0.seconds();
        org.joda.time.chrono.CopticChronology copticChronology30 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology30.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology30.year();
        org.joda.time.chrono.CopticChronology copticChronology33 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField34 = copticChronology33.seconds();
        org.joda.time.DurationField durationField35 = copticChronology33.years();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology37 = copticChronology33.withZone(dateTimeZone36);
        java.lang.String str39 = dateTimeZone36.getNameKey((long) 1);
        org.joda.time.Chronology chronology40 = copticChronology30.withZone(dateTimeZone36);
        long long43 = dateTimeZone36.convertLocalToUTC((long) 0, true);
        long long45 = dateTimeZone36.convertUTCToLocal((long) (short) -1);
        java.lang.String str46 = dateTimeZone36.getID();
        long long48 = dateTimeZone36.previousTransition((long) (short) -1);
        boolean boolean49 = dateTimeZone36.isFixed();
        int int51 = dateTimeZone36.getOffsetFromLocal((long) (byte) -1);
        java.lang.String str53 = dateTimeZone36.getNameKey((-100L));
        org.joda.time.Chronology chronology54 = copticChronology0.withZone(dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField55 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField56 = copticChronology0.hours();
        org.joda.time.DurationField durationField57 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField57, durationField2, and durationField11", !(durationField57.compareTo(durationField2) == 0) || (Math.signum(durationField57.compareTo(durationField11)) == Math.signum(durationField2.compareTo(durationField11))));
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0539");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField7", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField7)) == Math.signum(durationField1.compareTo(durationField7))));
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0540");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology5.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology5.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology5.eras();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology5.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology5.getZone();
        int int12 = dateTimeZone10.getOffsetFromLocal((long) (short) 0);
        long long16 = dateTimeZone10.convertLocalToUTC(5L, false, (-53175657599990L));
        long long18 = dateTimeZone10.convertUTCToLocal(3599969L);
        long long20 = dateTimeZone10.nextTransition((-356399996L));
        java.lang.String str21 = dateTimeZone10.toString();
        org.joda.time.Chronology chronology22 = copticChronology0.withZone(dateTimeZone10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField8", Math.signum(durationField3.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField3)));
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0541");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField7 = copticChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField7, and durationField3", !(durationField3.compareTo(durationField7) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField7.compareTo(durationField3))));
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0542");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField8, and durationField3", !(durationField3.compareTo(durationField8) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField8.compareTo(durationField3))));
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0543");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = copticChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.era();
        org.joda.time.DurationField durationField10 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField12 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField12", (durationField6.compareTo(durationField12) == 0) == durationField6.equals(durationField12));
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0544");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField6, and durationField8", !(durationField13.compareTo(durationField6) == 0) || (Math.signum(durationField13.compareTo(durationField8)) == Math.signum(durationField6.compareTo(durationField8))));
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0545");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology8.getZone();
        org.joda.time.DurationField durationField11 = copticChronology8.months();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology8.add(readablePeriod12, (long) (short) -1, (int) '#');
        org.joda.time.DateTimeField dateTimeField16 = copticChronology8.yearOfCentury();
        org.joda.time.DurationField durationField17 = copticChronology8.days();
        org.joda.time.DurationField durationField18 = copticChronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField1, and durationField2", !(durationField18.compareTo(durationField1) == 0) || (Math.signum(durationField18.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0546");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfEra();
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = copticChronology5.seconds();
        org.joda.time.DurationField durationField7 = copticChronology5.years();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology9 = copticChronology5.withZone(dateTimeZone8);
        java.lang.String str11 = dateTimeZone8.getNameKey((long) 1);
        int int13 = dateTimeZone8.getStandardOffset((long) (short) 0);
        org.joda.time.Chronology chronology14 = copticChronology0.withZone(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology18.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone20 = copticChronology18.getZone();
        long long24 = copticChronology18.add(10L, 359999999L, (-1));
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        long long28 = copticChronology18.add(readablePeriod25, (long) 360000000, (int) (short) 1);
        org.joda.time.DurationField durationField29 = copticChronology18.centuries();
        org.joda.time.DurationField durationField30 = copticChronology18.centuries();
        boolean boolean31 = copticChronology0.equals((java.lang.Object) copticChronology18);
        org.joda.time.DurationField durationField32 = copticChronology18.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField32, durationField6, and durationField7", !(durationField32.compareTo(durationField6) == 0) || (Math.signum(durationField32.compareTo(durationField7)) == Math.signum(durationField6.compareTo(durationField7))));
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0547");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField2", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0548");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone4 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField1, and durationField2", !(durationField6.compareTo(durationField1) == 0) || (Math.signum(durationField6.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0549");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = copticChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField10 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.secondOfMinute();
        java.lang.String str13 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField15 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField15", (durationField6.compareTo(durationField15) == 0) == durationField6.equals(durationField15));
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0550");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField9 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.halfdayOfDay();
        long long16 = copticChronology0.add((-809639981433L), (-105L), (int) 'a');
        org.joda.time.DurationField durationField17 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField6, and durationField9", !(durationField17.compareTo(durationField6) == 0) || (Math.signum(durationField17.compareTo(durationField9)) == Math.signum(durationField6.compareTo(durationField9))));
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0551");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField5 = copticChronology0.minutes();
        org.joda.time.DurationField durationField6 = copticChronology0.minutes();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = copticChronology0.add(readablePeriod8, (-37919995L), (int) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField7", (durationField2.compareTo(durationField7) == 0) == durationField2.equals(durationField7));
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0552");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField2", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0553");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField11 = copticChronology0.millis();
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField5, and durationField11", !(durationField12.compareTo(durationField5) == 0) || (Math.signum(durationField12.compareTo(durationField11)) == Math.signum(durationField5.compareTo(durationField11))));
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0554");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        long long9 = copticChronology0.add((long) 100, (long) (-1), 10);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DurationField durationField11 = copticChronology0.millis();
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField3, and durationField11", !(durationField12.compareTo(durationField3) == 0) || (Math.signum(durationField12.compareTo(durationField11)) == Math.signum(durationField3.compareTo(durationField11))));
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0555");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.Chronology chronology2 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = copticChronology5.seconds();
        org.joda.time.DurationField durationField7 = copticChronology5.years();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology9 = copticChronology5.withZone(dateTimeZone8);
        java.lang.String str11 = dateTimeZone8.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.millisOfSecond();
        long long17 = copticChronology12.add(35L, 0L, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = copticChronology12.add(readablePeriod18, (long) (short) 0, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = copticChronology12.getZone();
        boolean boolean24 = dateTimeZone22.isStandardOffset((long) (short) 1);
        org.joda.time.Chronology chronology25 = copticChronology0.withZone(dateTimeZone22);
        org.joda.time.DurationField durationField26 = chronology25.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField3, and durationField4", !(durationField26.compareTo(durationField3) == 0) || (Math.signum(durationField26.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0556");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.DurationField durationField3 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.year();
        org.joda.time.DurationField durationField5 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField3, and durationField5", !(durationField7.compareTo(durationField3) == 0) || (Math.signum(durationField7.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0557");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.millisOfDay();
        org.joda.time.Chronology chronology13 = copticChronology0.withUTC();
        org.joda.time.Chronology chronology14 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField15 = chronology14.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField15, and durationField9", !(durationField9.compareTo(durationField15) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField15.compareTo(durationField9))));
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0558");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField10 = copticChronology7.centuries();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology7.hourOfDay();
        org.joda.time.DurationField durationField13 = copticChronology7.minutes();
        org.joda.time.DurationField durationField14 = copticChronology7.millis();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.secondOfDay();
        org.joda.time.DurationField durationField16 = copticChronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField1, and durationField2", !(durationField16.compareTo(durationField1) == 0) || (Math.signum(durationField16.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0559");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField12 = copticChronology0.minutes();
        int int13 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.millisOfSecond();
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField18 = copticChronology17.seconds();
        org.joda.time.DurationField durationField19 = copticChronology17.hours();
        org.joda.time.DurationField durationField20 = copticChronology17.minutes();
        org.joda.time.DateTimeZone dateTimeZone21 = copticChronology17.getZone();
        long long23 = dateTimeZone21.nextTransition(5L);
        java.util.TimeZone timeZone24 = dateTimeZone21.toTimeZone();
        org.joda.time.Chronology chronology25 = copticChronology0.withZone(dateTimeZone21);
        org.joda.time.DurationField durationField26 = copticChronology0.millis();
        org.joda.time.DurationField durationField27 = copticChronology0.weeks();
        org.joda.time.DurationField durationField28 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField1, and durationField12", !(durationField28.compareTo(durationField1) == 0) || (Math.signum(durationField28.compareTo(durationField12)) == Math.signum(durationField1.compareTo(durationField12))));
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0560");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.joda.time.DurationField durationField8 = copticChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField7", Math.signum(durationField3.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField3)));
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0561");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(100);
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = copticChronology2.seconds();
        org.joda.time.DurationField durationField4 = copticChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.yearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology2.seconds();
        org.joda.time.DurationField durationField7 = copticChronology2.centuries();
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) copticChronology2);
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology9.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.Chronology chronology13 = copticChronology9.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology9.year();
        org.joda.time.DateTimeZone dateTimeZone15 = copticChronology9.getZone();
        long long19 = dateTimeZone15.convertLocalToUTC(100L, false, 1L);
        java.lang.String str20 = dateTimeZone15.getID();
        org.joda.time.Chronology chronology21 = copticChronology2.withZone(dateTimeZone15);
        long long24 = dateTimeZone15.adjustOffset(189300004L, false);
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField26 = copticChronology25.seconds();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        long long30 = copticChronology25.add(readablePeriod27, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        long long34 = copticChronology25.add(readablePeriod31, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField35 = copticChronology25.minuteOfDay();
        org.joda.time.DurationField durationField36 = copticChronology25.centuries();
        org.joda.time.chrono.CopticChronology copticChronology37 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField38 = copticChronology37.seconds();
        org.joda.time.DurationField durationField39 = copticChronology37.years();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology41 = copticChronology37.withZone(dateTimeZone40);
        boolean boolean42 = dateTimeZone40.isFixed();
        java.lang.String str43 = dateTimeZone40.getID();
        org.joda.time.Chronology chronology44 = copticChronology25.withZone(dateTimeZone40);
        long long47 = dateTimeZone40.convertLocalToUTC((-359999989L), false);
        long long49 = dateTimeZone40.convertUTCToLocal(1L);
        long long51 = dateTimeZone15.getMillisKeepLocal(dateTimeZone40, 236L);
        java.lang.String str52 = dateTimeZone40.getID();
        org.joda.time.chrono.CopticChronology copticChronology53 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField54 = copticChronology53.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField55 = copticChronology53.secondOfMinute();
        org.joda.time.DurationField durationField56 = copticChronology53.halfdays();
        org.joda.time.DurationField durationField57 = copticChronology53.months();
        org.joda.time.DateTimeField dateTimeField58 = copticChronology53.halfdayOfDay();
        org.joda.time.DurationField durationField59 = copticChronology53.weekyears();
        java.lang.Object obj60 = null;
        boolean boolean61 = copticChronology53.equals(obj60);
        org.joda.time.DateTimeField dateTimeField62 = copticChronology53.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField63 = copticChronology53.year();
        org.joda.time.DateTimeField dateTimeField64 = copticChronology53.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField65 = copticChronology53.dayOfMonth();
        org.joda.time.DurationField durationField66 = copticChronology53.halfdays();
        org.joda.time.DurationField durationField67 = copticChronology53.months();
        org.joda.time.DateTimeField dateTimeField68 = copticChronology53.year();
        org.joda.time.DateTimeField dateTimeField69 = copticChronology53.hourOfDay();
        org.joda.time.DurationField durationField70 = copticChronology53.weeks();
        org.joda.time.DateTimeField dateTimeField71 = copticChronology53.dayOfYear();
        boolean boolean72 = dateTimeZone40.equals((java.lang.Object) dateTimeField71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField59", (durationField4.compareTo(durationField59) == 0) == durationField4.equals(durationField59));
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0562");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.era();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours(100);
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = copticChronology11.seconds();
        org.joda.time.DurationField durationField13 = copticChronology11.years();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology11.yearOfCentury();
        org.joda.time.DurationField durationField15 = copticChronology11.seconds();
        org.joda.time.DurationField durationField16 = copticChronology11.centuries();
        boolean boolean17 = dateTimeZone10.equals((java.lang.Object) copticChronology11);
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology18.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology18.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.Chronology chronology22 = copticChronology18.withZone(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = copticChronology18.year();
        org.joda.time.DateTimeZone dateTimeZone24 = copticChronology18.getZone();
        long long28 = dateTimeZone24.convertLocalToUTC(100L, false, 1L);
        java.lang.String str29 = dateTimeZone24.getID();
        org.joda.time.Chronology chronology30 = copticChronology11.withZone(dateTimeZone24);
        java.lang.String str32 = dateTimeZone24.getName((long) (byte) 0);
        org.joda.time.Chronology chronology33 = copticChronology0.withZone(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField34 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField36 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField36, durationField3, and durationField6", !(durationField36.compareTo(durationField3) == 0) || (Math.signum(durationField36.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0563");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        long long9 = copticChronology0.add((long) 100, (long) (-1), 10);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField11", Math.signum(durationField3.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField3)));
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0564");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.Chronology chronology2 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfSecond();
        int int7 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField8 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField9", Math.signum(durationField3.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField3)));
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0565");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = chronology4.millis();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = chronology4.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = chronology4.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField7", (durationField2.compareTo(durationField7) == 0) == durationField2.equals(durationField7));
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0566");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone11 = copticChronology0.getZone();
        org.joda.time.DurationField durationField12 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField12", (durationField6.compareTo(durationField12) == 0) == durationField6.equals(durationField12));
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0567");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forID("+00:00");
        java.lang.String str10 = dateTimeZone9.getID();
        boolean boolean11 = dateTimeZone9.isFixed();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone9.getShortName((long) (-1), locale13);
        org.joda.time.Chronology chronology15 = copticChronology0.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField16 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField16", (durationField7.compareTo(durationField16) == 0) == durationField7.equals(durationField16));
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0568");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField1, and durationField2", !(durationField5.compareTo(durationField1) == 0) || (Math.signum(durationField5.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0569");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField8, and durationField3", !(durationField3.compareTo(durationField8) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField8.compareTo(durationField3))));
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0570");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology8.getZone();
        org.joda.time.DurationField durationField11 = copticChronology8.months();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology8.add(readablePeriod12, (long) (short) -1, (int) '#');
        org.joda.time.DateTimeField dateTimeField16 = copticChronology8.yearOfCentury();
        org.joda.time.DurationField durationField17 = copticChronology8.days();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology8.secondOfDay();
        org.joda.time.DurationField durationField19 = copticChronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField1, and durationField2", !(durationField19.compareTo(durationField1) == 0) || (Math.signum(durationField19.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0571");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.joda.time.DurationField durationField8 = copticChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField8, and durationField3", !(durationField3.compareTo(durationField8) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField8.compareTo(durationField3))));
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0572");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        long long12 = copticChronology7.add(35L, 0L, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = copticChronology7.add(readablePeriod13, (long) (short) 0, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone17 = copticChronology7.getZone();
        org.joda.time.DurationField durationField18 = copticChronology7.minutes();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology7.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology7.weekyearOfCentury();
        org.joda.time.DurationField durationField21 = copticChronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField1, and durationField2", !(durationField21.compareTo(durationField1) == 0) || (Math.signum(durationField21.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0573");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        int int8 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.Chronology chronology9 = copticChronology0.withUTC();
        long long13 = chronology9.add((-115199994600L), 115200000L, (int) (short) 1);
        org.joda.time.DurationField durationField14 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField1, and durationField2", !(durationField14.compareTo(durationField1) == 0) || (Math.signum(durationField14.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0574");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(100);
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = copticChronology2.seconds();
        org.joda.time.DurationField durationField4 = copticChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.yearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology2.seconds();
        org.joda.time.DurationField durationField7 = copticChronology2.centuries();
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) copticChronology2);
        long long12 = copticChronology2.add(90L, 32L, (-1));
        org.joda.time.DateTimeField dateTimeField13 = copticChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology2.minuteOfDay();
        org.joda.time.DurationField durationField15 = copticChronology2.seconds();
        org.joda.time.DurationField durationField16 = copticChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField3, and durationField4", !(durationField16.compareTo(durationField3) == 0) || (Math.signum(durationField16.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0575");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology0.add(readablePeriod10, (-115084794600L), (int) (byte) 100);
        org.joda.time.DurationField durationField14 = copticChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField14, and durationField9", !(durationField9.compareTo(durationField14) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField14.compareTo(durationField9))));
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0576");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField4 = copticChronology0.weeks();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField1, and durationField4", !(durationField5.compareTo(durationField1) == 0) || (Math.signum(durationField5.compareTo(durationField4)) == Math.signum(durationField1.compareTo(durationField4))));
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0577");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 359999999L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = copticChronology11.eras();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology11.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField12", Math.signum(durationField1.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField1)));
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0578");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.era();
        org.joda.time.DurationField durationField10 = copticChronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField10", (durationField2.compareTo(durationField10) == 0) == durationField2.equals(durationField10));
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0579");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField6 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.era();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField10 = copticChronology9.seconds();
        org.joda.time.DurationField durationField11 = copticChronology9.years();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology13 = copticChronology9.withZone(dateTimeZone12);
        java.lang.String str15 = dateTimeZone12.getNameKey((long) 1);
        int int17 = dateTimeZone12.getStandardOffset((long) (short) 0);
        boolean boolean19 = dateTimeZone12.isStandardOffset((long) (byte) -1);
        int int21 = dateTimeZone12.getOffsetFromLocal((-15356790L));
        org.joda.time.Chronology chronology22 = copticChronology0.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField23 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField24 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField6, and durationField10", !(durationField24.compareTo(durationField6) == 0) || (Math.signum(durationField24.compareTo(durationField10)) == Math.signum(durationField6.compareTo(durationField10))));
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0580");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.Chronology chronology2 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = copticChronology0.add(readablePeriod5, 4L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField10 = copticChronology0.weeks();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = copticChronology0.add(readablePeriod11, (long) 36000000, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField16 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField3, and durationField10", !(durationField16.compareTo(durationField3) == 0) || (Math.signum(durationField16.compareTo(durationField10)) == Math.signum(durationField3.compareTo(durationField10))));
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0581");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.era();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField2", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0582");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.era();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours(100);
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = copticChronology11.seconds();
        org.joda.time.DurationField durationField13 = copticChronology11.years();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology11.yearOfCentury();
        org.joda.time.DurationField durationField15 = copticChronology11.seconds();
        org.joda.time.DurationField durationField16 = copticChronology11.centuries();
        boolean boolean17 = dateTimeZone10.equals((java.lang.Object) copticChronology11);
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology18.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology18.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.Chronology chronology22 = copticChronology18.withZone(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = copticChronology18.year();
        org.joda.time.DateTimeZone dateTimeZone24 = copticChronology18.getZone();
        long long28 = dateTimeZone24.convertLocalToUTC(100L, false, 1L);
        java.lang.String str29 = dateTimeZone24.getID();
        org.joda.time.Chronology chronology30 = copticChronology11.withZone(dateTimeZone24);
        java.lang.String str32 = dateTimeZone24.getName((long) (byte) 0);
        org.joda.time.Chronology chronology33 = copticChronology0.withZone(dateTimeZone24);
        org.joda.time.DurationField durationField34 = copticChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone35 = copticChronology0.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField34", (durationField13.compareTo(durationField34) == 0) == durationField13.equals(durationField34));
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0583");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.millisOfDay();
        org.joda.time.Chronology chronology10 = copticChronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology8.hourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology8.weekyear();
        org.joda.time.DurationField durationField15 = copticChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology8.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField15", (durationField2.compareTo(durationField15) == 0) == durationField2.equals(durationField15));
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0584");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.weeks();
        int int10 = copticChronology7.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField11 = copticChronology7.weekyears();
        org.joda.time.DurationField durationField12 = copticChronology7.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField11", (durationField2.compareTo(durationField11) == 0) == durationField2.equals(durationField11));
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0585");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.yearOfEra();
        org.joda.time.Chronology chronology16 = copticChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology7.yearOfCentury();
        java.lang.String str18 = copticChronology7.toString();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology7.year();
        org.joda.time.DurationField durationField20 = copticChronology7.years();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology7.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField20", (durationField2.compareTo(durationField20) == 0) == durationField2.equals(durationField20));
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0586");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology8.getZone();
        org.joda.time.DurationField durationField11 = copticChronology8.months();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology8.add(readablePeriod12, (long) (short) -1, (int) '#');
        org.joda.time.DateTimeField dateTimeField16 = copticChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology8.minuteOfHour();
        org.joda.time.DurationField durationField18 = copticChronology8.hours();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology8.monthOfYear();
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField21 = copticChronology20.seconds();
        org.joda.time.DurationField durationField22 = copticChronology20.minutes();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology20.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology20.weekOfWeekyear();
        org.joda.time.DurationField durationField25 = copticChronology20.weeks();
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology26.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology26.secondOfMinute();
        org.joda.time.DurationField durationField29 = copticChronology26.halfdays();
        org.joda.time.DurationField durationField30 = copticChronology26.months();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology26.halfdayOfDay();
        org.joda.time.DurationField durationField32 = copticChronology26.weekyears();
        java.lang.Object obj33 = null;
        boolean boolean34 = copticChronology26.equals(obj33);
        org.joda.time.DateTimeField dateTimeField35 = copticChronology26.era();
        org.joda.time.Chronology chronology36 = copticChronology26.withUTC();
        org.joda.time.DateTimeZone dateTimeZone37 = copticChronology26.getZone();
        org.joda.time.Chronology chronology38 = copticChronology20.withZone(dateTimeZone37);
        org.joda.time.chrono.CopticChronology copticChronology40 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone37, (int) (byte) 1);
        org.joda.time.chrono.CopticChronology copticChronology41 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField42 = copticChronology41.seconds();
        org.joda.time.DurationField durationField43 = copticChronology41.hours();
        org.joda.time.DurationField durationField44 = copticChronology41.seconds();
        org.joda.time.DurationField durationField45 = copticChronology41.halfdays();
        org.joda.time.DateTimeField dateTimeField46 = copticChronology41.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField47 = copticChronology41.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField48 = copticChronology41.clockhourOfDay();
        org.joda.time.DurationField durationField49 = copticChronology41.halfdays();
        org.joda.time.DateTimeField dateTimeField50 = copticChronology41.hourOfDay();
        org.joda.time.DateTimeField dateTimeField51 = copticChronology41.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone52 = copticChronology41.getZone();
        org.joda.time.Chronology chronology53 = copticChronology40.withZone(dateTimeZone52);
        org.joda.time.Chronology chronology54 = copticChronology8.withZone(dateTimeZone52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField32", (durationField2.compareTo(durationField32) == 0) == durationField2.equals(durationField32));
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0587");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        int int5 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField7 = copticChronology6.seconds();
        org.joda.time.DurationField durationField8 = copticChronology6.years();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology10 = copticChronology6.withZone(dateTimeZone9);
        boolean boolean11 = dateTimeZone9.isFixed();
        java.lang.String str12 = dateTimeZone9.getID();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone9, 4);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.millisOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology14.year();
        org.joda.time.DurationField durationField17 = copticChronology14.halfdays();
        org.joda.time.DateTimeZone dateTimeZone18 = copticChronology14.getZone();
        org.joda.time.Chronology chronology19 = copticChronology0.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField17", (durationField3.compareTo(durationField17) == 0) == durationField3.equals(durationField17));
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0588");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField9 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField10 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.dayOfWeek();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField15 = copticChronology14.seconds();
        org.joda.time.DurationField durationField16 = copticChronology14.years();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology18 = copticChronology14.withZone(dateTimeZone17);
        java.lang.String str20 = dateTimeZone17.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField22 = copticChronology21.millisOfSecond();
        org.joda.time.DurationField durationField23 = copticChronology21.centuries();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = copticChronology21.add(readablePeriod24, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField28 = copticChronology21.year();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology21.yearOfEra();
        org.joda.time.Chronology chronology30 = copticChronology21.withUTC();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology21.centuryOfEra();
        org.joda.time.Chronology chronology32 = copticChronology21.withUTC();
        org.joda.time.DateTimeZone dateTimeZone33 = copticChronology21.getZone();
        int int35 = dateTimeZone33.getOffset(549300000L);
        org.joda.time.Chronology chronology36 = copticChronology0.withZone(dateTimeZone33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField16", (durationField9.compareTo(durationField16) == 0) == durationField9.equals(durationField16));
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0589");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology12.year();
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField16 = copticChronology15.seconds();
        org.joda.time.DurationField durationField17 = copticChronology15.years();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology19 = copticChronology15.withZone(dateTimeZone18);
        java.lang.String str21 = dateTimeZone18.getNameKey((long) 1);
        org.joda.time.Chronology chronology22 = copticChronology12.withZone(dateTimeZone18);
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = copticChronology23.seconds();
        org.joda.time.DurationField durationField25 = copticChronology23.years();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology27 = copticChronology23.withZone(dateTimeZone26);
        java.lang.String str29 = dateTimeZone26.getNameKey((long) 1);
        int int31 = dateTimeZone26.getStandardOffset((long) (short) 0);
        long long33 = dateTimeZone18.getMillisKeepLocal(dateTimeZone26, (long) (short) 10);
        long long37 = dateTimeZone26.convertLocalToUTC(32L, true, (long) (-1));
        long long39 = dateTimeZone11.getMillisKeepLocal(dateTimeZone26, (long) (-1));
        java.lang.String str41 = dateTimeZone26.getName(35L);
        org.joda.time.chrono.CopticChronology copticChronology42 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField43 = copticChronology42.weekOfWeekyear();
        org.joda.time.DurationField durationField44 = copticChronology42.millis();
        org.joda.time.DurationField durationField45 = copticChronology42.minutes();
        org.joda.time.DurationField durationField46 = copticChronology42.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField46, durationField1, and durationField17", !(durationField46.compareTo(durationField1) == 0) || (Math.signum(durationField46.compareTo(durationField17)) == Math.signum(durationField1.compareTo(durationField17))));
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0590");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.Chronology chronology7 = copticChronology0.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology9.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.Chronology chronology13 = copticChronology9.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology9.year();
        org.joda.time.DateTimeZone dateTimeZone15 = copticChronology9.getZone();
        long long19 = dateTimeZone15.convertLocalToUTC(100L, false, 1L);
        java.lang.String str20 = dateTimeZone15.getID();
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone15.getOffset(readableInstant21);
        org.joda.time.Chronology chronology23 = copticChronology8.withZone(dateTimeZone15);
        org.joda.time.Chronology chronology24 = copticChronology0.withZone(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone25 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology26.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology26.secondOfMinute();
        org.joda.time.DurationField durationField29 = copticChronology26.halfdays();
        org.joda.time.DurationField durationField30 = copticChronology26.months();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology26.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology26.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology26.clockhourOfHalfday();
        org.joda.time.DurationField durationField34 = copticChronology26.millis();
        org.joda.time.DurationField durationField35 = copticChronology26.hours();
        org.joda.time.chrono.CopticChronology copticChronology36 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField37 = copticChronology36.seconds();
        org.joda.time.DurationField durationField38 = copticChronology36.years();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology40 = copticChronology36.withZone(dateTimeZone39);
        java.lang.String str42 = dateTimeZone39.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology43 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone39);
        org.joda.time.chrono.CopticChronology copticChronology44 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone39);
        org.joda.time.Chronology chronology45 = copticChronology26.withZone(dateTimeZone39);
        org.joda.time.DateTimeField dateTimeField46 = copticChronology26.dayOfWeek();
        boolean boolean47 = copticChronology0.equals((java.lang.Object) copticChronology26);
        org.joda.time.DateTimeField dateTimeField48 = copticChronology0.era();
        org.joda.time.DurationField durationField49 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField49, durationField3, and durationField29", !(durationField49.compareTo(durationField3) == 0) || (Math.signum(durationField49.compareTo(durationField29)) == Math.signum(durationField3.compareTo(durationField29))));
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0591");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.monthOfYear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.hourOfDay();
        org.joda.time.DurationField durationField11 = copticChronology7.years();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology7.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField11", (durationField2.compareTo(durationField11) == 0) == durationField2.equals(durationField11));
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0592");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.millisOfDay();
        org.joda.time.Chronology chronology13 = copticChronology0.withUTC();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology0.getZone();
        org.joda.time.DurationField durationField15 = copticChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField15, and durationField9", !(durationField9.compareTo(durationField15) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField15.compareTo(durationField9))));
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0593");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.yearOfCentury();
        org.joda.time.DurationField durationField11 = copticChronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology7.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField11", (durationField2.compareTo(durationField11) == 0) == durationField2.equals(durationField11));
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0594");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfEra();
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = copticChronology5.seconds();
        org.joda.time.DurationField durationField7 = copticChronology5.years();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology9 = copticChronology5.withZone(dateTimeZone8);
        java.lang.String str11 = dateTimeZone8.getNameKey((long) 1);
        int int13 = dateTimeZone8.getStandardOffset((long) (short) 0);
        org.joda.time.Chronology chronology14 = copticChronology0.withZone(dateTimeZone8);
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology15.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.Chronology chronology19 = copticChronology15.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = copticChronology15.year();
        org.joda.time.DurationField durationField21 = copticChronology15.months();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology15.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology15.yearOfEra();
        int int24 = copticChronology15.getMinimumDaysInFirstWeek();
        boolean boolean26 = copticChronology15.equals((java.lang.Object) 999L);
        org.joda.time.DurationField durationField27 = copticChronology15.weekyears();
        boolean boolean28 = dateTimeZone8.equals((java.lang.Object) durationField27);
        org.joda.time.chrono.CopticChronology copticChronology29 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology29.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology29.secondOfMinute();
        org.joda.time.DurationField durationField32 = copticChronology29.halfdays();
        org.joda.time.DurationField durationField33 = copticChronology29.months();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology29.halfdayOfDay();
        org.joda.time.DurationField durationField35 = copticChronology29.weekyears();
        org.joda.time.DurationField durationField36 = copticChronology29.centuries();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology29.secondOfDay();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology29.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField39 = copticChronology29.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField40 = copticChronology29.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology29.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField42 = copticChronology29.era();
        boolean boolean43 = dateTimeZone8.equals((java.lang.Object) dateTimeField42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField27", (durationField7.compareTo(durationField27) == 0) == durationField7.equals(durationField27));
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0595");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = copticChronology0.weeks();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = copticChronology0.add(readablePeriod9, 0L, 360000000);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField14 = copticChronology0.hours();
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField16 = copticChronology15.seconds();
        org.joda.time.DurationField durationField17 = copticChronology15.hours();
        org.joda.time.DurationField durationField18 = copticChronology15.seconds();
        org.joda.time.DurationField durationField19 = copticChronology15.halfdays();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology15.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology15.halfdayOfDay();
        org.joda.time.DurationField durationField22 = copticChronology15.hours();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology15.dayOfYear();
        org.joda.time.DurationField durationField24 = copticChronology15.days();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology15.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology15.clockhourOfDay();
        org.joda.time.DurationField durationField27 = copticChronology15.years();
        org.joda.time.chrono.CopticChronology copticChronology28 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField29 = copticChronology28.seconds();
        org.joda.time.DurationField durationField30 = copticChronology28.millis();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology28.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology28.minuteOfDay();
        org.joda.time.DurationField durationField33 = copticChronology28.seconds();
        org.joda.time.DateTimeZone dateTimeZone34 = copticChronology28.getZone();
        boolean boolean36 = dateTimeZone34.isStandardOffset((-359999989L));
        org.joda.time.Chronology chronology37 = copticChronology15.withZone(dateTimeZone34);
        org.joda.time.Chronology chronology38 = copticChronology0.withZone(dateTimeZone34);
        org.joda.time.DurationField durationField39 = chronology38.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField39, durationField6, and durationField8", !(durationField39.compareTo(durationField6) == 0) || (Math.signum(durationField39.compareTo(durationField8)) == Math.signum(durationField6.compareTo(durationField8))));
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0596");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfHalfday();
        long long14 = copticChronology0.getDateTimeMillis(5L, (int) (byte) 0, 4, 35, (int) (byte) 10);
        org.joda.time.DurationField durationField15 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField17 = copticChronology0.months();
        org.joda.time.DurationField durationField18 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField18", (durationField15.compareTo(durationField18) == 0) == durationField15.equals(durationField18));
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0597");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField9 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.weekOfWeekyear();
        org.joda.time.Chronology chronology12 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField4", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0598");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField5 = copticChronology0.minutes();
        org.joda.time.DurationField durationField6 = copticChronology0.years();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology9.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.Chronology chronology13 = copticChronology9.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology9.year();
        org.joda.time.DateTimeZone dateTimeZone15 = copticChronology9.getZone();
        long long19 = dateTimeZone15.convertLocalToUTC(100L, false, 1L);
        java.lang.String str20 = dateTimeZone15.getID();
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone15.getOffset(readableInstant21);
        org.joda.time.Chronology chronology23 = copticChronology8.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField24 = chronology23.era();
        org.joda.time.Chronology chronology25 = chronology23.withUTC();
        boolean boolean26 = copticChronology0.equals((java.lang.Object) chronology23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField7", (durationField2.compareTo(durationField7) == 0) == durationField2.equals(durationField7));
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0599");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyearOfCentury();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField6, and durationField9", !(durationField10.compareTo(durationField6) == 0) || (Math.signum(durationField10.compareTo(durationField9)) == Math.signum(durationField6.compareTo(durationField9))));
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0600");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.weeks();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = copticChronology8.seconds();
        org.joda.time.DurationField durationField10 = copticChronology8.years();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology12 = copticChronology8.withZone(dateTimeZone11);
        java.lang.String str14 = dateTimeZone11.getNameKey((long) 1);
        int int16 = dateTimeZone11.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        boolean boolean19 = dateTimeZone11.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology20.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone22 = copticChronology20.getZone();
        boolean boolean23 = dateTimeZone11.equals((java.lang.Object) copticChronology20);
        boolean boolean24 = dateTimeZone11.isFixed();
        org.joda.time.Chronology chronology25 = copticChronology0.withZone(dateTimeZone11);
        org.joda.time.DurationField durationField26 = copticChronology0.millis();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        long long30 = copticChronology0.add(readablePeriod27, (-359999968L), (-3600000));
        org.joda.time.DurationField durationField31 = copticChronology0.centuries();
        org.joda.time.DateTimeZone dateTimeZone32 = copticChronology0.getZone();
        org.joda.time.DurationField durationField33 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField33, durationField3, and durationField5", !(durationField33.compareTo(durationField3) == 0) || (Math.signum(durationField33.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0601");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DurationField durationField9 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField4", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0602");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField11 = copticChronology0.months();
        org.joda.time.DurationField durationField12 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.halfdayOfDay();
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology15.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.Chronology chronology19 = copticChronology15.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = copticChronology15.year();
        org.joda.time.DateTimeZone dateTimeZone21 = copticChronology15.getZone();
        long long25 = dateTimeZone21.convertLocalToUTC(100L, false, 1L);
        long long27 = dateTimeZone21.nextTransition((long) 0);
        org.joda.time.Chronology chronology28 = copticChronology0.withZone(dateTimeZone21);
        long long34 = copticChronology0.getDateTimeMillis(36000035L, (int) (byte) 0, (int) ' ', 52, (int) (byte) 100);
        org.joda.time.DurationField durationField35 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField35, durationField1, and durationField11", !(durationField35.compareTo(durationField1) == 0) || (Math.signum(durationField35.compareTo(durationField11)) == Math.signum(durationField1.compareTo(durationField11))));
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0603");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology7.minuteOfDay();
        org.joda.time.DurationField durationField18 = copticChronology7.years();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology7.weekOfWeekyear();
        java.lang.Class<?> wildcardClass20 = dateTimeField19.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField18", (durationField2.compareTo(durationField18) == 0) == durationField2.equals(durationField18));
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0604");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DurationField durationField4 = copticChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField3", Math.signum(durationField2.compareTo(durationField3)) == -Math.signum(durationField3.compareTo(durationField2)));
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0605");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        java.lang.String str8 = copticChronology0.toString();
        java.lang.String str9 = copticChronology0.toString();
        org.joda.time.DurationField durationField10 = copticChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField10, and durationField3", !(durationField3.compareTo(durationField10) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField10.compareTo(durationField3))));
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0606");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology10.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology10.secondOfMinute();
        org.joda.time.DurationField durationField13 = copticChronology10.weeks();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology10.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology10.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone16 = copticChronology10.getZone();
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone16.isLocalDateTimeGap(localDateTime17);
        org.joda.time.Chronology chronology19 = copticChronology0.withZone(dateTimeZone16);
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField21 = copticChronology20.seconds();
        org.joda.time.DurationField durationField22 = copticChronology20.years();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology24 = copticChronology20.withZone(dateTimeZone23);
        java.lang.String str26 = dateTimeZone23.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField28 = copticChronology27.millisOfSecond();
        long long32 = copticChronology27.add(35L, 0L, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        long long36 = copticChronology27.add(readablePeriod33, (long) (short) 0, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone37 = copticChronology27.getZone();
        boolean boolean39 = dateTimeZone37.isStandardOffset((long) (short) 1);
        boolean boolean41 = dateTimeZone37.isStandardOffset((long) ' ');
        long long44 = dateTimeZone37.adjustOffset((long) (short) 10, false);
        int int46 = dateTimeZone37.getOffset(90L);
        int int48 = dateTimeZone37.getStandardOffset((-2275L));
        org.joda.time.Chronology chronology49 = copticChronology0.withZone(dateTimeZone37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField22", (durationField8.compareTo(durationField22) == 0) == durationField8.equals(durationField22));
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0607");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        long long10 = copticChronology0.add((-187199990L), (long) (short) 0, 189300000);
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology11.year();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField15 = copticChronology14.seconds();
        org.joda.time.DurationField durationField16 = copticChronology14.years();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology18 = copticChronology14.withZone(dateTimeZone17);
        java.lang.String str20 = dateTimeZone17.getNameKey((long) 1);
        org.joda.time.Chronology chronology21 = copticChronology11.withZone(dateTimeZone17);
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField23 = copticChronology22.seconds();
        org.joda.time.DurationField durationField24 = copticChronology22.years();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology26 = copticChronology22.withZone(dateTimeZone25);
        java.lang.String str28 = dateTimeZone25.getNameKey((long) 1);
        int int30 = dateTimeZone25.getStandardOffset((long) (short) 0);
        long long32 = dateTimeZone17.getMillisKeepLocal(dateTimeZone25, (long) (short) 10);
        int int34 = dateTimeZone17.getStandardOffset((long) (byte) 100);
        long long37 = dateTimeZone17.convertLocalToUTC((long) (byte) 0, true);
        java.util.Locale locale39 = null;
        java.lang.String str40 = dateTimeZone17.getShortName(999L, locale39);
        org.joda.time.Chronology chronology41 = copticChronology0.withZone(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField42 = copticChronology0.dayOfYear();
        int int43 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField44 = copticChronology0.centuries();
        org.joda.time.DurationField durationField45 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField45, durationField1, and durationField2", !(durationField45.compareTo(durationField1) == 0) || (Math.signum(durationField45.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0608");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DurationField durationField7 = copticChronology0.years();
        org.joda.time.DurationField durationField8 = copticChronology0.weeks();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField3, and durationField6", !(durationField9.compareTo(durationField3) == 0) || (Math.signum(durationField9.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0609");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = copticChronology0.add(readablePeriod9, 0L, 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField8", Math.signum(durationField3.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField3)));
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0610");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = copticChronology7.add(readablePeriod16, (long) (short) 0, 10);
        org.joda.time.DurationField durationField20 = copticChronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology7.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField20", (durationField2.compareTo(durationField20) == 0) == durationField2.equals(durationField20));
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0611");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfEra();
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = copticChronology5.seconds();
        org.joda.time.DurationField durationField7 = copticChronology5.years();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology9 = copticChronology5.withZone(dateTimeZone8);
        java.lang.String str11 = dateTimeZone8.getNameKey((long) 1);
        int int13 = dateTimeZone8.getStandardOffset((long) (short) 0);
        org.joda.time.Chronology chronology14 = copticChronology0.withZone(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField15 = chronology14.era();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.hourOfDay();
        org.joda.time.DurationField durationField17 = chronology14.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField6, and durationField7", !(durationField17.compareTo(durationField6) == 0) || (Math.signum(durationField17.compareTo(durationField7)) == Math.signum(durationField6.compareTo(durationField7))));
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0612");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.years();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.year();
        org.joda.time.DurationField durationField4 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField1, and durationField2", !(durationField4.compareTo(durationField1) == 0) || (Math.signum(durationField4.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0613");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField8 = copticChronology0.centuries();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField8", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField8)) == Math.signum(durationField1.compareTo(durationField8))));
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0614");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfHalfday();
        long long14 = copticChronology0.getDateTimeMillis(5L, (int) (byte) 0, 4, 35, (int) (byte) 10);
        org.joda.time.DurationField durationField15 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField17 = copticChronology0.months();
        org.joda.time.DurationField durationField18 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField18", (durationField15.compareTo(durationField18) == 0) == durationField15.equals(durationField18));
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0615");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        java.lang.String str14 = copticChronology7.toString();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.yearOfEra();
        org.joda.time.DurationField durationField16 = copticChronology7.weekyears();
        org.joda.time.Chronology chronology17 = copticChronology7.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField16", (durationField2.compareTo(durationField16) == 0) == durationField2.equals(durationField16));
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0616");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology12.getZone();
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) copticChronology12);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.millisOfDay();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology17.minuteOfDay();
        org.joda.time.Chronology chronology20 = copticChronology17.withUTC();
        org.joda.time.DurationField durationField21 = copticChronology17.years();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology17.millisOfSecond();
        java.lang.String str23 = copticChronology17.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField21", (durationField2.compareTo(durationField21) == 0) == durationField2.equals(durationField21));
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0617");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology12.getZone();
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) copticChronology12);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.millisOfDay();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology17.minuteOfDay();
        org.joda.time.Chronology chronology20 = copticChronology17.withUTC();
        org.joda.time.DurationField durationField21 = copticChronology17.years();
        org.joda.time.DurationField durationField22 = copticChronology17.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField21", (durationField2.compareTo(durationField21) == 0) == durationField2.equals(durationField21));
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0618");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField6 = copticChronology0.years();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField2", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0619");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField6 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.era();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.Chronology chronology9 = copticChronology0.withUTC();
        java.lang.String str10 = copticChronology0.toString();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = copticChronology11.seconds();
        org.joda.time.DurationField durationField13 = copticChronology11.years();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology15 = copticChronology11.withZone(dateTimeZone14);
        java.lang.String str17 = dateTimeZone14.getName((long) (byte) 1);
        java.lang.String str18 = dateTimeZone14.getID();
        java.lang.String str19 = dateTimeZone14.toString();
        org.joda.time.Chronology chronology20 = copticChronology0.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField22 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField3, and durationField8", !(durationField22.compareTo(durationField3) == 0) || (Math.signum(durationField22.compareTo(durationField8)) == Math.signum(durationField3.compareTo(durationField8))));
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0620");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField9 = copticChronology0.seconds();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField10", Math.signum(durationField9.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField9)));
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0621");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = copticChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.era();
        org.joda.time.DurationField durationField10 = copticChronology0.centuries();
        org.joda.time.DurationField durationField11 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField13 = copticChronology0.months();
        org.joda.time.DurationField durationField14 = copticChronology0.years();
        org.joda.time.DurationField durationField15 = copticChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField14", (durationField6.compareTo(durationField14) == 0) == durationField6.equals(durationField14));
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0622");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = copticChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.era();
        org.joda.time.DurationField durationField10 = copticChronology0.centuries();
        org.joda.time.DurationField durationField11 = copticChronology0.millis();
        org.joda.time.DurationField durationField12 = copticChronology0.millis();
        org.joda.time.DurationField durationField13 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField15 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField3, and durationField4", !(durationField15.compareTo(durationField3) == 0) || (Math.signum(durationField15.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0623");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DurationField durationField9 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField4", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0624");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = copticChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.era();
        org.joda.time.DurationField durationField10 = copticChronology0.centuries();
        org.joda.time.DurationField durationField11 = copticChronology0.millis();
        org.joda.time.DurationField durationField12 = copticChronology0.years();
        org.joda.time.DurationField durationField13 = copticChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField12", (durationField6.compareTo(durationField12) == 0) == durationField6.equals(durationField12));
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0625");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.yearOfCentury();
        org.joda.time.DurationField durationField11 = copticChronology7.weekyears();
        org.joda.time.DurationField durationField12 = copticChronology7.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField11", (durationField2.compareTo(durationField11) == 0) == durationField2.equals(durationField11));
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0626");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = copticChronology3.seconds();
        org.joda.time.DurationField durationField5 = copticChronology3.years();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = copticChronology3.withZone(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getNameKey((long) 1);
        org.joda.time.Chronology chronology10 = copticChronology0.withZone(dateTimeZone6);
        long long13 = dateTimeZone6.convertLocalToUTC((long) 0, true);
        long long15 = dateTimeZone6.convertUTCToLocal((long) (byte) 100);
        long long17 = dateTimeZone6.convertUTCToLocal((long) ' ');
        long long19 = dateTimeZone6.nextTransition((-359999989L));
        long long21 = dateTimeZone6.convertUTCToLocal((long) '#');
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology22.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone24 = copticChronology22.getZone();
        org.joda.time.Chronology chronology25 = copticChronology22.withUTC();
        boolean boolean26 = dateTimeZone6.equals((java.lang.Object) copticChronology22);
        org.joda.time.DurationField durationField27 = copticChronology22.millis();
        org.joda.time.DurationField durationField28 = copticChronology22.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField4, and durationField5", !(durationField28.compareTo(durationField4) == 0) || (Math.signum(durationField28.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0627");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.era();
        java.lang.String str10 = copticChronology0.toString();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology11.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = copticChronology11.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology11.year();
        org.joda.time.DateTimeZone dateTimeZone17 = copticChronology11.getZone();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology11.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology11.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = copticChronology11.add(readablePeriod20, 0L, (int) (short) -1);
        org.joda.time.DateTimeField dateTimeField24 = copticChronology11.clockhourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology25.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology25.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.Chronology chronology29 = copticChronology25.withZone(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField30 = copticChronology25.year();
        org.joda.time.DateTimeZone dateTimeZone31 = copticChronology25.getZone();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology25.hourOfHalfday();
        org.joda.time.DurationField durationField33 = copticChronology25.millis();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean35 = dateTimeZone34.isFixed();
        org.joda.time.chrono.CopticChronology copticChronology36 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology36.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology36.year();
        org.joda.time.chrono.CopticChronology copticChronology39 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField40 = copticChronology39.seconds();
        org.joda.time.DurationField durationField41 = copticChronology39.years();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology43 = copticChronology39.withZone(dateTimeZone42);
        java.lang.String str45 = dateTimeZone42.getNameKey((long) 1);
        org.joda.time.Chronology chronology46 = copticChronology36.withZone(dateTimeZone42);
        long long49 = dateTimeZone42.convertLocalToUTC((long) 0, true);
        boolean boolean51 = dateTimeZone42.isStandardOffset((long) (short) 1);
        long long53 = dateTimeZone34.getMillisKeepLocal(dateTimeZone42, 35L);
        org.joda.time.Chronology chronology54 = copticChronology25.withZone(dateTimeZone34);
        int int56 = dateTimeZone34.getOffset((long) 360000000);
        long long58 = dateTimeZone34.nextTransition((long) (short) -1);
        org.joda.time.Chronology chronology59 = copticChronology11.withZone(dateTimeZone34);
        org.joda.time.Chronology chronology60 = copticChronology0.withZone(dateTimeZone34);
        org.joda.time.DurationField durationField61 = chronology60.months();
        org.joda.time.DurationField durationField62 = chronology60.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField61", (durationField5.compareTo(durationField61) == 0) == durationField5.equals(durationField61));
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0628");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        long long7 = copticChronology0.add((-318479989L), 35999999899L, 115200000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField3", Math.signum(durationField2.compareTo(durationField3)) == -Math.signum(durationField3.compareTo(durationField2)));
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0629");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField7", (durationField2.compareTo(durationField7) == 0) == durationField2.equals(durationField7));
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0630");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekyear();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = copticChronology0.add(readablePeriod11, 0L, 0);
        org.joda.time.DurationField durationField15 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField3, and durationField4", !(durationField15.compareTo(durationField3) == 0) || (Math.signum(durationField15.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0631");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.centuries();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = copticChronology0.add(readablePeriod4, (long) (short) 100, 100);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField9 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField9", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField9)) == Math.signum(durationField3.compareTo(durationField9))));
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0632");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField8 = copticChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField8, and durationField3", !(durationField3.compareTo(durationField8) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField8.compareTo(durationField3))));
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0633");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField10 = copticChronology0.years();
        org.joda.time.DurationField durationField11 = copticChronology0.days();
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField3, and durationField5", !(durationField12.compareTo(durationField3) == 0) || (Math.signum(durationField12.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0634");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.era();
        java.lang.String str4 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = copticChronology0.add(readablePeriod7, 0L, (int) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField6", Math.signum(durationField1.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField1)));
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0635");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField5, and durationField3", !(durationField3.compareTo(durationField5) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField5.compareTo(durationField3))));
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0636");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = copticChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField10 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField14 = copticChronology0.minutes();
        org.joda.time.DurationField durationField15 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.year();
        org.joda.time.Chronology chronology17 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField18 = copticChronology0.years();
        org.joda.time.DurationField durationField19 = copticChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField18", (durationField6.compareTo(durationField18) == 0) == durationField6.equals(durationField18));
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0637");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField12 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField12", (durationField6.compareTo(durationField12) == 0) == durationField6.equals(durationField12));
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0638");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.era();
        java.lang.String str4 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        java.lang.String str7 = copticChronology0.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField6", Math.signum(durationField1.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField1)));
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0639");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DurationField durationField7 = copticChronology0.years();
        org.joda.time.DurationField durationField8 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField10 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField10", (durationField7.compareTo(durationField10) == 0) == durationField7.equals(durationField10));
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0640");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        int int9 = copticChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField8", (durationField2.compareTo(durationField8) == 0) == durationField2.equals(durationField8));
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0641");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = copticChronology0.minutes();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = copticChronology0.add(readablePeriod8, 5L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField14 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField1, and durationField7", !(durationField14.compareTo(durationField1) == 0) || (Math.signum(durationField14.compareTo(durationField7)) == Math.signum(durationField1.compareTo(durationField7))));
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0642");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField15 = copticChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField15, and durationField12", !(durationField12.compareTo(durationField15) == 0) || (Math.signum(durationField12.compareTo(durationField12)) == Math.signum(durationField15.compareTo(durationField12))));
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0643");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DurationField durationField9 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField12 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField12", (durationField6.compareTo(durationField12) == 0) == durationField6.equals(durationField12));
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0644");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.hourOfHalfday();
        long long13 = copticChronology8.add((long) ' ', 359999999L, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology8.minuteOfHour();
        org.joda.time.DurationField durationField15 = copticChronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology8.millisOfSecond();
        org.joda.time.DurationField durationField17 = copticChronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField1, and durationField2", !(durationField17.compareTo(durationField1) == 0) || (Math.signum(durationField17.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0645");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DurationField durationField9 = copticChronology0.seconds();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField4", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0646");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField4", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0647");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfHalfday();
        long long14 = copticChronology0.getDateTimeMillis(5L, (int) (byte) 0, 4, 35, (int) (byte) 10);
        org.joda.time.DurationField durationField15 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField17 = copticChronology0.months();
        org.joda.time.DurationField durationField18 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField18", (durationField15.compareTo(durationField18) == 0) == durationField15.equals(durationField18));
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0648");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone13 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField15 = copticChronology14.seconds();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = copticChronology14.add(readablePeriod16, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.Chronology chronology20 = copticChronology14.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology21.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology21.year();
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField25 = copticChronology24.seconds();
        org.joda.time.DurationField durationField26 = copticChronology24.years();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology28 = copticChronology24.withZone(dateTimeZone27);
        java.lang.String str30 = dateTimeZone27.getNameKey((long) 1);
        org.joda.time.Chronology chronology31 = copticChronology21.withZone(dateTimeZone27);
        long long34 = dateTimeZone27.convertLocalToUTC((long) 0, true);
        boolean boolean36 = dateTimeZone27.isStandardOffset((long) (short) 1);
        org.joda.time.Chronology chronology37 = copticChronology14.withZone(dateTimeZone27);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        long long42 = dateTimeZone27.convertLocalToUTC(277200000L, true, 132L);
        long long44 = dateTimeZone13.getMillisKeepLocal(dateTimeZone27, 149L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField12 and durationField15", Math.signum(durationField12.compareTo(durationField15)) == -Math.signum(durationField15.compareTo(durationField12)));
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0649");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        long long13 = dateTimeZone10.adjustOffset(10L, true);
        long long15 = dateTimeZone10.convertUTCToLocal(99L);
        long long18 = dateTimeZone10.adjustOffset((-1L), true);
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology19.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology19.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.Chronology chronology23 = copticChronology19.withZone(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField24 = copticChronology19.year();
        org.joda.time.DurationField durationField25 = copticChronology19.months();
        org.joda.time.DurationField durationField26 = copticChronology19.months();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology19.weekyearOfCentury();
        long long31 = copticChronology19.add(210L, 3600035L, (int) (byte) 100);
        boolean boolean32 = dateTimeZone10.equals((java.lang.Object) copticChronology19);
        org.joda.time.DurationField durationField33 = copticChronology19.years();
        org.joda.time.DurationField durationField34 = copticChronology19.days();
        org.joda.time.DurationField durationField35 = copticChronology19.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField35, durationField1, and durationField25", !(durationField35.compareTo(durationField1) == 0) || (Math.signum(durationField35.compareTo(durationField25)) == Math.signum(durationField1.compareTo(durationField25))));
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0650");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone4 = copticChronology0.getZone();
        org.joda.time.DurationField durationField5 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.year();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField2", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0651");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.yearOfEra();
        org.joda.time.Chronology chronology16 = copticChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology7.centuryOfEra();
        org.joda.time.Chronology chronology18 = copticChronology7.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.Chronology chronology20 = copticChronology19.withUTC();
        org.joda.time.DurationField durationField21 = copticChronology19.years();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        long long25 = copticChronology19.add(readablePeriod22, (long) 1, (int) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology26.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology26.year();
        org.joda.time.chrono.CopticChronology copticChronology29 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField30 = copticChronology29.seconds();
        org.joda.time.DurationField durationField31 = copticChronology29.years();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology33 = copticChronology29.withZone(dateTimeZone32);
        java.lang.String str35 = dateTimeZone32.getNameKey((long) 1);
        org.joda.time.Chronology chronology36 = copticChronology26.withZone(dateTimeZone32);
        long long39 = dateTimeZone32.convertLocalToUTC((long) 0, true);
        long long41 = dateTimeZone32.convertUTCToLocal((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        long long45 = dateTimeZone32.getMillisKeepLocal(dateTimeZone43, (long) 100);
        org.joda.time.Chronology chronology46 = copticChronology19.withZone(dateTimeZone32);
        java.lang.String str48 = dateTimeZone32.getName(3600001L);
        org.joda.time.Chronology chronology49 = chronology18.withZone(dateTimeZone32);
        org.joda.time.chrono.CopticChronology copticChronology50 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField51 = copticChronology50.dayOfMonth();
        org.joda.time.DurationField durationField52 = copticChronology50.weekyears();
        org.joda.time.DurationField durationField53 = copticChronology50.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField52", (durationField2.compareTo(durationField52) == 0) == durationField2.equals(durationField52));
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0652");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        long long10 = copticChronology0.add((-187199990L), (long) (short) 0, 189300000);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.yearOfEra();
        java.lang.String str12 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField15 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField1, and durationField2", !(durationField15.compareTo(durationField1) == 0) || (Math.signum(durationField15.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0653");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DurationField durationField4 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.joda.time.DurationField durationField8 = copticChronology0.centuries();
        org.joda.time.DurationField durationField9 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.yearOfEra();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField14 = copticChronology13.seconds();
        org.joda.time.DurationField durationField15 = copticChronology13.years();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology17 = copticChronology13.withZone(dateTimeZone16);
        java.lang.String str19 = dateTimeZone16.getNameKey((long) 1);
        int int21 = dateTimeZone16.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        boolean boolean24 = dateTimeZone16.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology25.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone27 = copticChronology25.getZone();
        boolean boolean28 = dateTimeZone16.equals((java.lang.Object) copticChronology25);
        org.joda.time.DateTimeField dateTimeField29 = copticChronology25.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology25.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone31 = copticChronology25.getZone();
        java.lang.String str33 = dateTimeZone31.getName((-105L));
        org.joda.time.chrono.CopticChronology copticChronology34 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField35 = copticChronology34.seconds();
        org.joda.time.DurationField durationField36 = copticChronology34.years();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology38 = copticChronology34.withZone(dateTimeZone37);
        org.joda.time.LocalDateTime localDateTime39 = null;
        boolean boolean40 = dateTimeZone37.isLocalDateTimeGap(localDateTime39);
        java.util.Locale locale42 = null;
        java.lang.String str43 = dateTimeZone37.getName((long) (byte) -1, locale42);
        java.util.Locale locale45 = null;
        java.lang.String str46 = dateTimeZone37.getShortName((long) ' ', locale45);
        long long48 = dateTimeZone31.getMillisKeepLocal(dateTimeZone37, (-1692068644798805L));
        org.joda.time.chrono.CopticChronology copticChronology49 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField50 = copticChronology49.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField51 = copticChronology49.year();
        org.joda.time.chrono.CopticChronology copticChronology52 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField53 = copticChronology52.seconds();
        org.joda.time.DurationField durationField54 = copticChronology52.years();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology56 = copticChronology52.withZone(dateTimeZone55);
        java.lang.String str58 = dateTimeZone55.getNameKey((long) 1);
        org.joda.time.Chronology chronology59 = copticChronology49.withZone(dateTimeZone55);
        long long62 = dateTimeZone55.convertLocalToUTC((long) 0, true);
        boolean boolean64 = dateTimeZone55.isStandardOffset((long) (short) 1);
        org.joda.time.ReadableInstant readableInstant65 = null;
        int int66 = dateTimeZone55.getOffset(readableInstant65);
        java.util.Locale locale68 = null;
        java.lang.String str69 = dateTimeZone55.getShortName(3600004L, locale68);
        org.joda.time.chrono.CopticChronology copticChronology70 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone55);
        org.joda.time.DateTimeField dateTimeField71 = copticChronology70.halfdayOfDay();
        boolean boolean72 = dateTimeZone31.equals((java.lang.Object) dateTimeField71);
        java.lang.String str74 = dateTimeZone31.getNameKey((-7178255810700000L));
        boolean boolean75 = dateTimeZone31.isFixed();
        org.joda.time.Chronology chronology76 = copticChronology0.withZone(dateTimeZone31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField15", (durationField9.compareTo(durationField15) == 0) == durationField9.equals(durationField15));
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0654");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DurationField durationField3 = copticChronology0.days();
        org.joda.time.DurationField durationField4 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField8", (durationField4.compareTo(durationField8) == 0) == durationField4.equals(durationField8));
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0655");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField5 = copticChronology0.weeks();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology6.secondOfMinute();
        org.joda.time.DurationField durationField9 = copticChronology6.halfdays();
        org.joda.time.DurationField durationField10 = copticChronology6.months();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology6.halfdayOfDay();
        org.joda.time.DurationField durationField12 = copticChronology6.weekyears();
        java.lang.Object obj13 = null;
        boolean boolean14 = copticChronology6.equals(obj13);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology6.era();
        org.joda.time.Chronology chronology16 = copticChronology6.withUTC();
        org.joda.time.DateTimeZone dateTimeZone17 = copticChronology6.getZone();
        org.joda.time.Chronology chronology18 = copticChronology0.withZone(dateTimeZone17);
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone17, (int) (byte) 1);
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField22 = copticChronology21.seconds();
        org.joda.time.DurationField durationField23 = copticChronology21.hours();
        org.joda.time.DurationField durationField24 = copticChronology21.seconds();
        org.joda.time.DurationField durationField25 = copticChronology21.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology21.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology21.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology21.clockhourOfDay();
        org.joda.time.DurationField durationField29 = copticChronology21.halfdays();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology21.hourOfDay();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology21.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone32 = copticChronology21.getZone();
        org.joda.time.Chronology chronology33 = copticChronology20.withZone(dateTimeZone32);
        org.joda.time.DurationField durationField34 = chronology33.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField34, durationField1, and durationField2", !(durationField34.compareTo(durationField1) == 0) || (Math.signum(durationField34.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0656");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.joda.time.DurationField durationField11 = copticChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField11, and durationField10", !(durationField10.compareTo(durationField11) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField11.compareTo(durationField10))));
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0657");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField9 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField10 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField11 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField11", (durationField9.compareTo(durationField11) == 0) == durationField9.equals(durationField11));
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0658");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.yearOfEra();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField15 = copticChronology14.seconds();
        org.joda.time.DurationField durationField16 = copticChronology14.years();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology18 = copticChronology14.withZone(dateTimeZone17);
        java.lang.String str20 = dateTimeZone17.getNameKey((long) 1);
        int int22 = dateTimeZone17.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        boolean boolean25 = dateTimeZone17.isStandardOffset((long) (short) 10);
        long long28 = dateTimeZone17.adjustOffset(0L, false);
        org.joda.time.Chronology chronology29 = copticChronology0.withZone(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField30 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology0.year();
        org.joda.time.DurationField durationField32 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField32, durationField1, and durationField11", !(durationField32.compareTo(durationField1) == 0) || (Math.signum(durationField32.compareTo(durationField11)) == Math.signum(durationField1.compareTo(durationField11))));
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0659");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(100);
        boolean boolean2 = dateTimeZone1.isFixed();
        int int4 = dateTimeZone1.getOffsetFromLocal((long) 0);
        java.lang.String str6 = dateTimeZone1.getShortName((long) 4);
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1, 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.hourOfHalfday();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = copticChronology11.seconds();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = copticChronology11.add(readablePeriod13, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField17 = copticChronology11.secondOfMinute();
        org.joda.time.DurationField durationField18 = copticChronology11.days();
        boolean boolean19 = copticChronology8.equals((java.lang.Object) copticChronology11);
        org.joda.time.DurationField durationField20 = copticChronology8.seconds();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology8.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField20", (durationField12.compareTo(durationField20) == 0) == durationField12.equals(durationField20));
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0660");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField13 = copticChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField13, and durationField11", !(durationField11.compareTo(durationField13) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField13.compareTo(durationField11))));
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0661");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = copticChronology0.minutes();
        org.joda.time.DurationField durationField7 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField6, and durationField7", !(durationField8.compareTo(durationField6) == 0) || (Math.signum(durationField8.compareTo(durationField7)) == Math.signum(durationField6.compareTo(durationField7))));
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0662");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology7.yearOfEra();
        org.joda.time.DurationField durationField17 = copticChronology7.weekyears();
        org.joda.time.DateTimeZone dateTimeZone18 = copticChronology7.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField17", (durationField2.compareTo(durationField17) == 0) == durationField2.equals(durationField17));
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0663");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfMonth();
        long long9 = copticChronology0.add((long) 360000000, 86L, (int) (byte) 100);
        org.joda.time.DurationField durationField10 = copticChronology0.hours();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField1, and durationField4", !(durationField11.compareTo(durationField1) == 0) || (Math.signum(durationField11.compareTo(durationField4)) == Math.signum(durationField1.compareTo(durationField4))));
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0664");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone13 = copticChronology0.getZone();
        org.joda.time.Chronology chronology14 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.weekyearOfCentury();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField17 = copticChronology16.seconds();
        org.joda.time.DurationField durationField18 = copticChronology16.years();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology20 = copticChronology16.withZone(dateTimeZone19);
        org.joda.time.DurationField durationField21 = copticChronology16.seconds();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology16.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone23 = copticChronology16.getZone();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forID("+00:00:00.004");
        org.joda.time.Chronology chronology26 = copticChronology16.withZone(dateTimeZone25);
        java.lang.String str27 = chronology26.toString();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        long long31 = chronology26.add(readablePeriod28, (-46790000L), 360000000);
        org.joda.time.DateTimeField dateTimeField32 = chronology26.millisOfDay();
        org.joda.time.DurationField durationField33 = chronology26.months();
        boolean boolean34 = copticChronology0.equals((java.lang.Object) durationField33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField12 and durationField17", Math.signum(durationField12.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField12)));
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0665");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.joda.time.DurationField durationField9 = copticChronology0.millis();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField6", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0666");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(100);
        boolean boolean2 = dateTimeZone1.isFixed();
        int int4 = dateTimeZone1.getOffsetFromLocal((long) 0);
        java.lang.String str6 = dateTimeZone1.getShortName((long) 4);
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1, 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.hourOfHalfday();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = copticChronology11.seconds();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = copticChronology11.add(readablePeriod13, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField17 = copticChronology11.secondOfMinute();
        org.joda.time.DurationField durationField18 = copticChronology11.days();
        boolean boolean19 = copticChronology8.equals((java.lang.Object) copticChronology11);
        org.joda.time.DurationField durationField20 = copticChronology8.seconds();
        org.joda.time.DateTimeZone dateTimeZone21 = copticChronology8.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField20", (durationField12.compareTo(durationField20) == 0) == durationField12.equals(durationField20));
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0667");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.Chronology chronology2 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfHalfday();
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = copticChronology5.seconds();
        org.joda.time.DurationField durationField7 = copticChronology5.years();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology9 = copticChronology5.withZone(dateTimeZone8);
        boolean boolean10 = dateTimeZone8.isFixed();
        long long12 = dateTimeZone8.convertUTCToLocal(10L);
        org.joda.time.Chronology chronology13 = copticChronology0.withZone(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField16 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField17 = copticChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField16", (durationField7.compareTo(durationField16) == 0) == durationField7.equals(durationField16));
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0668");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.dayOfMonth();
        org.joda.time.Chronology chronology14 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField16 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField1, and durationField11", !(durationField16.compareTo(durationField1) == 0) || (Math.signum(durationField16.compareTo(durationField11)) == Math.signum(durationField1.compareTo(durationField11))));
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0669");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField5 = copticChronology0.weeks();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DurationField durationField7 = copticChronology0.millis();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField3, and durationField5", !(durationField8.compareTo(durationField3) == 0) || (Math.signum(durationField8.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0670");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DurationField durationField9 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField3, and durationField4", !(durationField12.compareTo(durationField3) == 0) || (Math.signum(durationField12.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0671");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.year();
        org.joda.time.DurationField durationField8 = copticChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField8, and durationField3", !(durationField3.compareTo(durationField8) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField8.compareTo(durationField3))));
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0672");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField7, and durationField3", !(durationField3.compareTo(durationField7) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField7.compareTo(durationField3))));
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0673");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = copticChronology0.withZone(dateTimeZone14);
        org.joda.time.Chronology chronology16 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField17 = copticChronology0.months();
        org.joda.time.DurationField durationField18 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField1, and durationField17", !(durationField18.compareTo(durationField1) == 0) || (Math.signum(durationField18.compareTo(durationField17)) == Math.signum(durationField1.compareTo(durationField17))));
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0674");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology10.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology10.secondOfMinute();
        org.joda.time.DurationField durationField13 = copticChronology10.weeks();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology10.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology10.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone16 = copticChronology10.getZone();
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone16.isLocalDateTimeGap(localDateTime17);
        org.joda.time.Chronology chronology19 = copticChronology0.withZone(dateTimeZone16);
        org.joda.time.DurationField durationField20 = chronology19.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField5, and durationField7", !(durationField20.compareTo(durationField5) == 0) || (Math.signum(durationField20.compareTo(durationField7)) == Math.signum(durationField5.compareTo(durationField7))));
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0675");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.era();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField2", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0676");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField5 = copticChronology0.minutes();
        org.joda.time.DurationField durationField6 = copticChronology0.years();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField7", (durationField2.compareTo(durationField7) == 0) == durationField2.equals(durationField7));
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0677");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 5L, 4);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        long long17 = copticChronology0.getDateTimeMillis(999L, (int) (byte) 0, (int) (short) 1, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField11", Math.signum(durationField3.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField3)));
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0678");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.yearOfEra();
        long long6 = copticChronology0.add(210L, 3600035L, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone11 = copticChronology9.getZone();
        java.lang.String str13 = dateTimeZone11.getNameKey((long) ' ');
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField15 = copticChronology14.seconds();
        org.joda.time.DurationField durationField16 = copticChronology14.years();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology18 = copticChronology14.withZone(dateTimeZone17);
        int int20 = dateTimeZone17.getOffset((long) 0);
        int int22 = dateTimeZone17.getOffset((long) (byte) 1);
        boolean boolean23 = dateTimeZone11.equals((java.lang.Object) dateTimeZone17);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone17.getOffset(readableInstant24);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone17.getShortName(1L, locale27);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        boolean boolean31 = dateTimeZone17.isStandardOffset(97L);
        java.util.TimeZone timeZone32 = dateTimeZone17.toTimeZone();
        int int34 = dateTimeZone17.getOffset(2605679999997L);
        long long38 = dateTimeZone17.convertLocalToUTC(999L, false, (long) 189300000);
        org.joda.time.Chronology chronology39 = copticChronology0.withZone(dateTimeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField15", Math.signum(durationField8.compareTo(durationField15)) == -Math.signum(durationField15.compareTo(durationField8)));
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0679");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.joda.time.DurationField durationField8 = copticChronology0.hours();
        long long12 = copticChronology0.add(3210L, 52L, 189300000);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField16 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField3, and durationField5", !(durationField16.compareTo(durationField3) == 0) || (Math.signum(durationField16.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0680");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField3 = copticChronology0.months();
        org.joda.time.DurationField durationField4 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField2, and durationField3", !(durationField4.compareTo(durationField2) == 0) || (Math.signum(durationField4.compareTo(durationField3)) == Math.signum(durationField2.compareTo(durationField3))));
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0681");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.monthOfYear();
        org.joda.time.DurationField durationField10 = copticChronology7.centuries();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.dayOfMonth();
        org.joda.time.DurationField durationField12 = copticChronology7.millis();
        org.joda.time.DurationField durationField13 = copticChronology7.weeks();
        org.joda.time.DurationField durationField14 = copticChronology7.seconds();
        org.joda.time.DurationField durationField15 = copticChronology7.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField14", (durationField1.compareTo(durationField14) == 0) == durationField1.equals(durationField14));
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0682");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = copticChronology0.add(readablePeriod9, 0L, (int) (short) -1);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField14 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField16 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.Chronology chronology19 = copticChronology0.withZone(dateTimeZone18);
        org.joda.time.DurationField durationField20 = chronology19.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField14, and durationField16", !(durationField20.compareTo(durationField14) == 0) || (Math.signum(durationField20.compareTo(durationField16)) == Math.signum(durationField14.compareTo(durationField16))));
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0683");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField6", Math.signum(durationField3.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField3)));
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0684");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.Chronology chronology5 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField6 = copticChronology0.seconds();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField2", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0685");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField3", Math.signum(durationField1.compareTo(durationField3)) == -Math.signum(durationField3.compareTo(durationField1)));
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0686");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.yearOfEra();
        org.joda.time.Chronology chronology16 = copticChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology7.yearOfCentury();
        org.joda.time.DurationField durationField18 = copticChronology7.days();
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology19.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology19.secondOfMinute();
        org.joda.time.DurationField durationField22 = copticChronology19.weeks();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology19.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology19.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone25 = copticChronology19.getZone();
        org.joda.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = dateTimeZone25.isLocalDateTimeGap(localDateTime26);
        org.joda.time.Chronology chronology28 = copticChronology7.withZone(dateTimeZone25);
        org.joda.time.DurationField durationField29 = copticChronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology7.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField29", (durationField2.compareTo(durationField29) == 0) == durationField2.equals(durationField29));
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0687");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = copticChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology0.getZone();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField7", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField7)) == Math.signum(durationField1.compareTo(durationField7))));
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0688");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.centuries();
        org.joda.time.DurationField durationField4 = copticChronology0.eras();
        long long8 = copticChronology0.add(189300100L, (-12960014399985L), 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField4", Math.signum(durationField3.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField3)));
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0689");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField8", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField8)) == Math.signum(durationField3.compareTo(durationField8))));
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0690");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField3, and durationField5", !(durationField7.compareTo(durationField3) == 0) || (Math.signum(durationField7.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0691");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology1.add(readablePeriod3, 999L, 3600000);
        int int7 = copticChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField8 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField9 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField9", Math.signum(durationField8.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField8)));
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0692");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.minutes();
        org.joda.time.DurationField durationField4 = copticChronology0.centuries();
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology6.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = copticChronology6.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology6.year();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology6.getZone();
        long long16 = dateTimeZone12.convertLocalToUTC(100L, false, 1L);
        java.lang.String str17 = dateTimeZone12.getID();
        long long21 = dateTimeZone12.convertLocalToUTC((long) (short) 0, false, 10L);
        org.joda.time.Chronology chronology22 = copticChronology0.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField23 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField26 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology0.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField26", (durationField5.compareTo(durationField26) == 0) == durationField5.equals(durationField26));
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0693");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.era();
        java.lang.String str4 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField6", Math.signum(durationField1.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField1)));
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0694");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfSecond();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = copticChronology8.seconds();
        org.joda.time.DurationField durationField10 = copticChronology8.years();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology12 = copticChronology8.withZone(dateTimeZone11);
        boolean boolean13 = dateTimeZone11.isFixed();
        java.lang.String str14 = dateTimeZone11.getID();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone11, 4);
        org.joda.time.DateTimeField dateTimeField17 = copticChronology16.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone18 = copticChronology16.getZone();
        long long20 = dateTimeZone18.previousTransition((long) '#');
        long long22 = dateTimeZone18.nextTransition((-3L));
        org.joda.time.Chronology chronology23 = copticChronology0.withZone(dateTimeZone18);
        org.joda.time.DurationField durationField24 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField1, and durationField2", !(durationField24.compareTo(durationField1) == 0) || (Math.signum(durationField24.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0695");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.centuries();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField7", (durationField2.compareTo(durationField7) == 0) == durationField2.equals(durationField7));
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0696");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField8 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.centuryOfEra();
        org.joda.time.Chronology chronology11 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField1, and durationField8", !(durationField12.compareTo(durationField1) == 0) || (Math.signum(durationField12.compareTo(durationField8)) == Math.signum(durationField1.compareTo(durationField8))));
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0697");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField10 = copticChronology0.minutes();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField5", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0698");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.joda.time.DurationField durationField8 = copticChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField7", Math.signum(durationField3.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField3)));
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0699");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = copticChronology0.add(readablePeriod9, (-52087708799990L), 97);
        org.joda.time.DurationField durationField13 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField13", (durationField6.compareTo(durationField13) == 0) == durationField6.equals(durationField13));
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0700");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(100);
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = copticChronology2.seconds();
        org.joda.time.DurationField durationField4 = copticChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.yearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology2.seconds();
        org.joda.time.DurationField durationField7 = copticChronology2.centuries();
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) copticChronology2);
        long long12 = copticChronology2.add(90L, 32L, (-1));
        org.joda.time.DateTimeField dateTimeField13 = copticChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology2.minuteOfDay();
        org.joda.time.DurationField durationField15 = copticChronology2.weekyears();
        org.joda.time.Chronology chronology16 = copticChronology2.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField15", (durationField4.compareTo(durationField15) == 0) == durationField4.equals(durationField15));
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0701");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.Chronology chronology2 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField8", Math.signum(durationField3.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField3)));
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0702");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.monthOfYear();
        org.joda.time.DurationField durationField10 = copticChronology7.centuries();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.dayOfMonth();
        org.joda.time.DurationField durationField12 = copticChronology7.millis();
        org.joda.time.DurationField durationField13 = copticChronology7.weeks();
        long long17 = copticChronology7.add(135L, (-359999900L), 189300000);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology7.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone19 = copticChronology7.getZone();
        org.joda.time.DurationField durationField20 = copticChronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology7.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField20", (durationField2.compareTo(durationField20) == 0) == durationField2.equals(durationField20));
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0703");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DurationField durationField4 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField2", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0704");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField5 = copticChronology0.weeks();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology6.secondOfMinute();
        org.joda.time.DurationField durationField9 = copticChronology6.halfdays();
        org.joda.time.DurationField durationField10 = copticChronology6.months();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology6.halfdayOfDay();
        org.joda.time.DurationField durationField12 = copticChronology6.weekyears();
        java.lang.Object obj13 = null;
        boolean boolean14 = copticChronology6.equals(obj13);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology6.era();
        org.joda.time.Chronology chronology16 = copticChronology6.withUTC();
        org.joda.time.DateTimeZone dateTimeZone17 = copticChronology6.getZone();
        org.joda.time.Chronology chronology18 = copticChronology0.withZone(dateTimeZone17);
        org.joda.time.DurationField durationField19 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField1, and durationField2", !(durationField19.compareTo(durationField1) == 0) || (Math.signum(durationField19.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0705");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DurationField durationField3 = copticChronology0.days();
        org.joda.time.DurationField durationField4 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField9 = copticChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField8", (durationField4.compareTo(durationField8) == 0) == durationField4.equals(durationField8));
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0706");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.halfdayOfDay();
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology15.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.Chronology chronology19 = copticChronology15.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = copticChronology15.year();
        org.joda.time.DateTimeZone dateTimeZone21 = copticChronology15.getZone();
        long long25 = dateTimeZone21.convertLocalToUTC(100L, false, 1L);
        java.lang.String str26 = dateTimeZone21.getID();
        int int28 = dateTimeZone21.getOffsetFromLocal((long) (short) 10);
        boolean boolean29 = dateTimeZone21.isFixed();
        org.joda.time.Chronology chronology30 = copticChronology0.withZone(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField31 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField33 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField33, durationField1, and durationField11", !(durationField33.compareTo(durationField1) == 0) || (Math.signum(durationField33.compareTo(durationField11)) == Math.signum(durationField1.compareTo(durationField11))));
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0707");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField11 = copticChronology0.months();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology0.add(readablePeriod12, 90L, 100);
        org.joda.time.DurationField durationField16 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField18 = copticChronology0.months();
        org.joda.time.Chronology chronology19 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField20 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField21 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField24 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology0.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField24", (durationField20.compareTo(durationField24) == 0) == durationField20.equals(durationField24));
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0708");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology0.add(readablePeriod12, (long) ' ', (int) ' ');
        org.joda.time.DurationField durationField16 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField17 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology18.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone20 = copticChronology18.getZone();
        java.lang.String str22 = dateTimeZone20.getNameKey((long) ' ');
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = copticChronology23.seconds();
        org.joda.time.DurationField durationField25 = copticChronology23.years();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology27 = copticChronology23.withZone(dateTimeZone26);
        int int29 = dateTimeZone26.getOffset((long) 0);
        int int31 = dateTimeZone26.getOffset((long) (byte) 1);
        boolean boolean32 = dateTimeZone20.equals((java.lang.Object) dateTimeZone26);
        org.joda.time.ReadableInstant readableInstant33 = null;
        int int34 = dateTimeZone26.getOffset(readableInstant33);
        java.util.TimeZone timeZone35 = dateTimeZone26.toTimeZone();
        org.joda.time.chrono.CopticChronology copticChronology36 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone26);
        org.joda.time.Chronology chronology37 = copticChronology0.withZone(dateTimeZone26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField25", (durationField16.compareTo(durationField25) == 0) == durationField16.equals(durationField25));
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0709");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.year();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = copticChronology10.seconds();
        org.joda.time.DurationField durationField12 = copticChronology10.years();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology14 = copticChronology10.withZone(dateTimeZone13);
        java.lang.String str16 = dateTimeZone13.getNameKey((long) 1);
        org.joda.time.Chronology chronology17 = copticChronology7.withZone(dateTimeZone13);
        long long20 = dateTimeZone13.convertLocalToUTC((long) 0, true);
        boolean boolean22 = dateTimeZone13.isStandardOffset((long) (short) 1);
        org.joda.time.Chronology chronology23 = copticChronology0.withZone(dateTimeZone13);
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology24.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology24.secondOfMinute();
        org.joda.time.DurationField durationField27 = copticChronology24.halfdays();
        org.joda.time.DurationField durationField28 = copticChronology24.months();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology24.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology24.year();
        java.lang.String str31 = copticChronology24.toString();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology24.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology24.hourOfHalfday();
        boolean boolean34 = dateTimeZone13.equals((java.lang.Object) dateTimeField33);
        org.joda.time.chrono.CopticChronology copticChronology35 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology35.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology35.secondOfMinute();
        org.joda.time.DurationField durationField38 = copticChronology35.halfdays();
        org.joda.time.DurationField durationField39 = copticChronology35.months();
        org.joda.time.DateTimeField dateTimeField40 = copticChronology35.halfdayOfDay();
        org.joda.time.DurationField durationField41 = copticChronology35.weekyears();
        java.lang.Object obj42 = null;
        boolean boolean43 = copticChronology35.equals(obj42);
        org.joda.time.DateTimeField dateTimeField44 = copticChronology35.era();
        org.joda.time.Chronology chronology45 = copticChronology35.withUTC();
        org.joda.time.DateTimeZone dateTimeZone46 = copticChronology35.getZone();
        org.joda.time.chrono.CopticChronology copticChronology47 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField48 = copticChronology47.seconds();
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        long long52 = copticChronology47.add(readablePeriod49, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        long long56 = copticChronology47.add(readablePeriod53, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField57 = copticChronology47.monthOfYear();
        org.joda.time.DurationField durationField58 = copticChronology47.months();
        org.joda.time.DurationField durationField59 = copticChronology47.months();
        org.joda.time.DurationField durationField60 = copticChronology47.days();
        boolean boolean61 = dateTimeZone46.equals((java.lang.Object) durationField60);
        boolean boolean63 = dateTimeZone46.isStandardOffset((long) 1);
        long long65 = dateTimeZone13.getMillisKeepLocal(dateTimeZone46, (long) 363120000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField41", (durationField12.compareTo(durationField41) == 0) == durationField12.equals(durationField41));
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0710");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = copticChronology3.seconds();
        org.joda.time.DurationField durationField5 = copticChronology3.years();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = copticChronology3.withZone(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getNameKey((long) 1);
        org.joda.time.Chronology chronology10 = copticChronology0.withZone(dateTimeZone6);
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = copticChronology11.seconds();
        org.joda.time.DurationField durationField13 = copticChronology11.years();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology15 = copticChronology11.withZone(dateTimeZone14);
        java.lang.String str17 = dateTimeZone14.getNameKey((long) 1);
        int int19 = dateTimeZone14.getStandardOffset((long) (short) 0);
        long long21 = dateTimeZone6.getMillisKeepLocal(dateTimeZone14, (long) (short) 10);
        long long24 = dateTimeZone14.adjustOffset((-82799999L), true);
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField26 = copticChronology25.seconds();
        org.joda.time.DurationField durationField27 = copticChronology25.years();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology29 = copticChronology25.withZone(dateTimeZone28);
        boolean boolean30 = dateTimeZone28.isFixed();
        java.lang.String str31 = dateTimeZone28.getID();
        org.joda.time.chrono.CopticChronology copticChronology33 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone28, 4);
        org.joda.time.DateTimeField dateTimeField34 = copticChronology33.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone35 = copticChronology33.getZone();
        long long37 = dateTimeZone14.getMillisKeepLocal(dateTimeZone35, 3600001L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        long long40 = dateTimeZone14.nextTransition(684000000L);
        org.joda.time.chrono.CopticChronology copticChronology41 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField42 = copticChronology41.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField43 = copticChronology41.secondOfMinute();
        org.joda.time.DurationField durationField44 = copticChronology41.halfdays();
        org.joda.time.DurationField durationField45 = copticChronology41.months();
        org.joda.time.DateTimeField dateTimeField46 = copticChronology41.halfdayOfDay();
        org.joda.time.DurationField durationField47 = copticChronology41.weekyears();
        java.lang.Object obj48 = null;
        boolean boolean49 = copticChronology41.equals(obj48);
        org.joda.time.DateTimeField dateTimeField50 = copticChronology41.yearOfCentury();
        org.joda.time.DurationField durationField51 = copticChronology41.weeks();
        org.joda.time.DurationField durationField52 = copticChronology41.millis();
        boolean boolean53 = dateTimeZone14.equals((java.lang.Object) copticChronology41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField47", (durationField5.compareTo(durationField47) == 0) == durationField5.equals(durationField47));
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0711");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.year();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.secondOfMinute();
        org.joda.time.DurationField durationField10 = copticChronology7.halfdays();
        int int11 = copticChronology7.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology7.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.weekyearOfCentury();
        boolean boolean16 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField18 = copticChronology17.seconds();
        org.joda.time.DurationField durationField19 = copticChronology17.years();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology21 = copticChronology17.withZone(dateTimeZone20);
        java.lang.String str23 = dateTimeZone20.getNameKey((long) 1);
        int int25 = dateTimeZone20.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        long long28 = dateTimeZone20.nextTransition((long) (byte) 10);
        java.lang.String str30 = dateTimeZone20.getName((long) 1);
        org.joda.time.Chronology chronology31 = copticChronology0.withZone(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField32 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField35 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField35, durationField3, and durationField4", !(durationField35.compareTo(durationField3) == 0) || (Math.signum(durationField35.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0712");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DurationField durationField4 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.joda.time.DurationField durationField8 = copticChronology0.centuries();
        org.joda.time.DurationField durationField9 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField14 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField1, and durationField2", !(durationField14.compareTo(durationField1) == 0) || (Math.signum(durationField14.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0713");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = copticChronology0.add(readablePeriod7, (long) 0, (int) (short) -1);
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField11", Math.signum(durationField3.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField3)));
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0714");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.monthOfYear();
        org.joda.time.DurationField durationField10 = copticChronology7.centuries();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.dayOfMonth();
        org.joda.time.DurationField durationField12 = copticChronology7.millis();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology13.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology13.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology13.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology13.minuteOfHour();
        org.joda.time.DurationField durationField19 = copticChronology13.millis();
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField21 = copticChronology20.seconds();
        org.joda.time.DurationField durationField22 = copticChronology20.years();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology24 = copticChronology20.withZone(dateTimeZone23);
        boolean boolean25 = dateTimeZone23.isFixed();
        java.lang.String str26 = dateTimeZone23.getID();
        org.joda.time.Chronology chronology27 = copticChronology13.withZone(dateTimeZone23);
        boolean boolean28 = dateTimeZone23.isFixed();
        org.joda.time.Chronology chronology29 = copticChronology7.withZone(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField30 = chronology29.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField19", (durationField12.compareTo(durationField19) == 0) == durationField12.equals(durationField19));
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0715");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology7.minuteOfDay();
        org.joda.time.DurationField durationField18 = copticChronology7.years();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology7.weekOfWeekyear();
        org.joda.time.DurationField durationField20 = copticChronology7.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField18", (durationField2.compareTo(durationField18) == 0) == durationField2.equals(durationField18));
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0716");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField1, and durationField2", !(durationField5.compareTo(durationField1) == 0) || (Math.signum(durationField5.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0717");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        long long12 = copticChronology7.add(35L, 0L, (int) (byte) 100);
        org.joda.time.DurationField durationField13 = copticChronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField1, and durationField2", !(durationField13.compareTo(durationField1) == 0) || (Math.signum(durationField13.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0718");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.era();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.monthOfYear();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology9.secondOfMinute();
        org.joda.time.DurationField durationField12 = copticChronology9.weeks();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology9.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology9.millisOfSecond();
        org.joda.time.DurationField durationField15 = copticChronology9.weeks();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology9.era();
        org.joda.time.DurationField durationField17 = copticChronology9.millis();
        org.joda.time.Chronology chronology18 = copticChronology9.withUTC();
        java.lang.String str19 = copticChronology9.toString();
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField21 = copticChronology20.seconds();
        org.joda.time.DurationField durationField22 = copticChronology20.years();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology24 = copticChronology20.withZone(dateTimeZone23);
        java.lang.String str26 = dateTimeZone23.getName((long) (byte) 1);
        java.lang.String str27 = dateTimeZone23.getID();
        java.lang.String str28 = dateTimeZone23.toString();
        org.joda.time.Chronology chronology29 = copticChronology9.withZone(dateTimeZone23);
        long long31 = dateTimeZone23.nextTransition((-35L));
        org.joda.time.Chronology chronology32 = copticChronology0.withZone(dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField22", (durationField7.compareTo(durationField22) == 0) == durationField7.equals(durationField22));
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0719");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = copticChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.era();
        org.joda.time.DurationField durationField10 = copticChronology0.centuries();
        org.joda.time.DurationField durationField11 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField13 = copticChronology0.years();
        org.joda.time.Chronology chronology14 = copticChronology0.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField13", (durationField6.compareTo(durationField13) == 0) == durationField6.equals(durationField13));
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0720");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField12 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField12", (durationField6.compareTo(durationField12) == 0) == durationField6.equals(durationField12));
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0721");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField9 = copticChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField9, and durationField3", !(durationField3.compareTo(durationField9) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField9.compareTo(durationField3))));
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0722");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(100);
        boolean boolean2 = dateTimeZone1.isFixed();
        int int4 = dateTimeZone1.getOffsetFromLocal((long) 0);
        java.lang.String str6 = dateTimeZone1.getShortName((long) 4);
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1, 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.hourOfHalfday();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = copticChronology11.seconds();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = copticChronology11.add(readablePeriod13, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField17 = copticChronology11.secondOfMinute();
        org.joda.time.DurationField durationField18 = copticChronology11.days();
        boolean boolean19 = copticChronology8.equals((java.lang.Object) copticChronology11);
        org.joda.time.DurationField durationField20 = copticChronology8.years();
        org.joda.time.Chronology chronology21 = copticChronology8.withUTC();
        org.joda.time.DurationField durationField22 = copticChronology8.seconds();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology8.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField22", (durationField12.compareTo(durationField22) == 0) == durationField12.equals(durationField22));
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0723");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField2", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0724");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField13 = copticChronology0.halfdays();
        java.lang.String str14 = copticChronology0.toString();
        org.joda.time.Chronology chronology15 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone17 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology18.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology18.secondOfMinute();
        org.joda.time.DurationField durationField21 = copticChronology18.halfdays();
        org.joda.time.DurationField durationField22 = copticChronology18.months();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology18.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology18.year();
        org.joda.time.DurationField durationField25 = copticChronology18.centuries();
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField27 = copticChronology26.seconds();
        org.joda.time.DurationField durationField28 = copticChronology26.years();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology30 = copticChronology26.withZone(dateTimeZone29);
        boolean boolean31 = dateTimeZone29.isFixed();
        java.lang.String str32 = dateTimeZone29.getID();
        org.joda.time.chrono.CopticChronology copticChronology34 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone29, 4);
        org.joda.time.DateTimeField dateTimeField35 = copticChronology34.millisOfDay();
        org.joda.time.DurationField durationField36 = copticChronology34.months();
        org.joda.time.DateTimeZone dateTimeZone37 = copticChronology34.getZone();
        long long39 = dateTimeZone37.previousTransition(210L);
        org.joda.time.Chronology chronology40 = copticChronology18.withZone(dateTimeZone37);
        int int42 = dateTimeZone37.getStandardOffset((long) 363120000);
        long long44 = dateTimeZone17.getMillisKeepLocal(dateTimeZone37, 0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField36", (durationField22.compareTo(durationField36) == 0) == durationField22.equals(durationField36));
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0725");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology7.minuteOfDay();
        org.joda.time.DurationField durationField18 = copticChronology7.years();
        java.lang.String str19 = copticChronology7.toString();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology7.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField18", (durationField2.compareTo(durationField18) == 0) == durationField2.equals(durationField18));
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0726");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.year();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = copticChronology10.seconds();
        org.joda.time.DurationField durationField12 = copticChronology10.years();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology14 = copticChronology10.withZone(dateTimeZone13);
        java.lang.String str16 = dateTimeZone13.getNameKey((long) 1);
        org.joda.time.Chronology chronology17 = copticChronology7.withZone(dateTimeZone13);
        long long20 = dateTimeZone13.convertLocalToUTC((long) 0, true);
        boolean boolean22 = dateTimeZone13.isStandardOffset((long) (short) 1);
        org.joda.time.Chronology chronology23 = copticChronology0.withZone(dateTimeZone13);
        org.joda.time.DurationField durationField24 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology0.year();
        org.joda.time.Chronology chronology28 = copticChronology0.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology29 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology29.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology29.secondOfMinute();
        org.joda.time.DurationField durationField32 = copticChronology29.halfdays();
        org.joda.time.DurationField durationField33 = copticChronology29.months();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology29.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology29.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology29.yearOfEra();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology29.era();
        org.joda.time.DateTimeZone dateTimeZone38 = copticChronology29.getZone();
        long long40 = dateTimeZone38.nextTransition((-53175657599990L));
        int int42 = dateTimeZone38.getStandardOffset((-809639981433L));
        org.joda.time.chrono.CopticChronology copticChronology43 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField44 = copticChronology43.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone45 = copticChronology43.getZone();
        org.joda.time.DateTimeField dateTimeField46 = copticChronology43.dayOfYear();
        org.joda.time.DateTimeField dateTimeField47 = copticChronology43.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField48 = copticChronology43.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField49 = copticChronology43.secondOfMinute();
        org.joda.time.DurationField durationField50 = copticChronology43.weekyears();
        org.joda.time.DateTimeField dateTimeField51 = copticChronology43.year();
        org.joda.time.DateTimeZone dateTimeZone52 = copticChronology43.getZone();
        int int54 = dateTimeZone52.getStandardOffset((-8092799890L));
        long long56 = dateTimeZone38.getMillisKeepLocal(dateTimeZone52, (-10661994335L));
        long long58 = dateTimeZone38.nextTransition((-3599990L));
        org.joda.time.Chronology chronology59 = copticChronology0.withZone(dateTimeZone38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField50", (durationField12.compareTo(durationField50) == 0) == durationField12.equals(durationField50));
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0727");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DurationField durationField5 = copticChronology0.minutes();
        org.joda.time.DurationField durationField6 = copticChronology0.seconds();
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField3, and durationField4", !(durationField9.compareTo(durationField3) == 0) || (Math.signum(durationField9.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0728");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekOfWeekyear();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = copticChronology8.seconds();
        org.joda.time.DurationField durationField10 = copticChronology8.years();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology12 = copticChronology8.withZone(dateTimeZone11);
        java.lang.String str14 = dateTimeZone11.getNameKey((long) 1);
        int int16 = dateTimeZone11.getStandardOffset((long) (short) 0);
        boolean boolean18 = dateTimeZone11.isStandardOffset((long) (byte) -1);
        java.lang.Object obj19 = null;
        boolean boolean20 = dateTimeZone11.equals(obj19);
        long long22 = dateTimeZone11.previousTransition(3600004L);
        long long24 = dateTimeZone11.previousTransition((-99L));
        org.joda.time.Chronology chronology25 = copticChronology0.withZone(dateTimeZone11);
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology26.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology26.secondOfMinute();
        org.joda.time.DurationField durationField29 = copticChronology26.halfdays();
        org.joda.time.DurationField durationField30 = copticChronology26.months();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology26.halfdayOfDay();
        org.joda.time.DurationField durationField32 = copticChronology26.weekyears();
        org.joda.time.DurationField durationField33 = copticChronology26.centuries();
        org.joda.time.DurationField durationField34 = copticChronology26.millis();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology26.dayOfYear();
        org.joda.time.DurationField durationField36 = copticChronology26.millis();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology26.monthOfYear();
        org.joda.time.DurationField durationField38 = copticChronology26.weekyears();
        org.joda.time.DurationField durationField39 = copticChronology26.months();
        boolean boolean40 = copticChronology0.equals((java.lang.Object) durationField39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField32", (durationField10.compareTo(durationField32) == 0) == durationField10.equals(durationField32));
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0729");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField3 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField10 = copticChronology9.seconds();
        org.joda.time.DurationField durationField11 = copticChronology9.years();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology13 = copticChronology9.withZone(dateTimeZone12);
        java.lang.String str15 = dateTimeZone12.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField17 = copticChronology16.millisOfSecond();
        org.joda.time.DurationField durationField18 = copticChronology16.centuries();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = copticChronology16.add(readablePeriod19, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField23 = copticChronology16.year();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology16.yearOfEra();
        org.joda.time.Chronology chronology25 = copticChronology16.withUTC();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology16.yearOfCentury();
        java.lang.String str27 = copticChronology16.toString();
        java.lang.String str28 = copticChronology16.toString();
        long long32 = copticChronology16.add(10L, (-82799999L), (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField33 = copticChronology16.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology16.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology16.weekyearOfCentury();
        boolean boolean36 = copticChronology0.equals((java.lang.Object) copticChronology16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField11", (durationField5.compareTo(durationField11) == 0) == durationField5.equals(durationField11));
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0730");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField10 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField11 = copticChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField10", (durationField2.compareTo(durationField10) == 0) == durationField2.equals(durationField10));
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0731");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField6 = copticChronology0.millis();
        org.joda.time.DurationField durationField7 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField6", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField6)) == Math.signum(durationField1.compareTo(durationField6))));
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0732");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = copticChronology3.seconds();
        org.joda.time.DurationField durationField5 = copticChronology3.years();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = copticChronology3.withZone(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone6.getName(0L, locale12);
        org.joda.time.Chronology chronology14 = copticChronology0.withZone(dateTimeZone6);
        java.lang.String str15 = copticChronology0.toString();
        org.joda.time.DateTimeZone dateTimeZone16 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology17.secondOfMinute();
        org.joda.time.DurationField durationField20 = copticChronology17.halfdays();
        org.joda.time.DurationField durationField21 = copticChronology17.months();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology17.halfdayOfDay();
        org.joda.time.DurationField durationField23 = copticChronology17.weekyears();
        java.lang.Object obj24 = null;
        boolean boolean25 = copticChronology17.equals(obj24);
        org.joda.time.DateTimeField dateTimeField26 = copticChronology17.era();
        org.joda.time.DurationField durationField27 = copticChronology17.centuries();
        org.joda.time.DurationField durationField28 = copticChronology17.millis();
        org.joda.time.DurationField durationField29 = copticChronology17.months();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology17.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology17.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology17.millisOfDay();
        boolean boolean33 = copticChronology0.equals((java.lang.Object) dateTimeField32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField23", (durationField5.compareTo(durationField23) == 0) == durationField5.equals(durationField23));
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0733");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone13 = copticChronology0.getZone();
        org.joda.time.DurationField durationField14 = copticChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField14, and durationField12", !(durationField12.compareTo(durationField14) == 0) || (Math.signum(durationField12.compareTo(durationField12)) == Math.signum(durationField14.compareTo(durationField12))));
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0734");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.era();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField10 = copticChronology9.seconds();
        org.joda.time.DurationField durationField11 = copticChronology9.years();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology13 = copticChronology9.withZone(dateTimeZone12);
        java.lang.String str15 = dateTimeZone12.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField17 = copticChronology16.millisOfSecond();
        org.joda.time.DurationField durationField18 = copticChronology16.centuries();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = copticChronology16.add(readablePeriod19, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField23 = copticChronology16.year();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology16.yearOfEra();
        org.joda.time.DurationField durationField25 = copticChronology16.seconds();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology16.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology16.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology28 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField29 = copticChronology28.seconds();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        long long33 = copticChronology28.add(readablePeriod30, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        long long37 = copticChronology28.add(readablePeriod34, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone38 = copticChronology28.getZone();
        long long41 = dateTimeZone38.adjustOffset(10L, true);
        int int43 = dateTimeZone38.getOffsetFromLocal((long) 'a');
        org.joda.time.Chronology chronology44 = copticChronology16.withZone(dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone45 = copticChronology16.getZone();
        org.joda.time.Chronology chronology46 = chronology8.withZone(dateTimeZone45);
        org.joda.time.DateTimeField dateTimeField47 = chronology8.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField25", (durationField1.compareTo(durationField25) == 0) == durationField1.equals(durationField25));
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0735");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.yearOfEra();
        org.joda.time.DurationField durationField16 = copticChronology7.seconds();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology7.secondOfMinute();
        org.joda.time.DurationField durationField18 = copticChronology7.months();
        java.lang.Class<?> wildcardClass19 = copticChronology7.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField16", (durationField1.compareTo(durationField16) == 0) == durationField1.equals(durationField16));
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0736");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = copticChronology0.minutes();
        org.joda.time.DurationField durationField7 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.minuteOfHour();
        long long12 = copticChronology0.add(0L, (-52L), 3600000);
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField6, and durationField7", !(durationField13.compareTo(durationField6) == 0) || (Math.signum(durationField13.compareTo(durationField7)) == Math.signum(durationField6.compareTo(durationField7))));
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0737");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyear();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField10 = copticChronology9.seconds();
        org.joda.time.DurationField durationField11 = copticChronology9.millis();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology9.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology9.year();
        org.joda.time.DateTimeZone dateTimeZone15 = copticChronology9.getZone();
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone15.getShortName(972987907769L, locale17);
        org.joda.time.Chronology chronology19 = copticChronology0.withZone(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField10", Math.signum(durationField3.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField3)));
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0738");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) 1, (int) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.year();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = copticChronology10.seconds();
        org.joda.time.DurationField durationField12 = copticChronology10.years();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology14 = copticChronology10.withZone(dateTimeZone13);
        java.lang.String str16 = dateTimeZone13.getNameKey((long) 1);
        org.joda.time.Chronology chronology17 = copticChronology7.withZone(dateTimeZone13);
        long long20 = dateTimeZone13.convertLocalToUTC((long) 0, true);
        long long22 = dateTimeZone13.convertUTCToLocal((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        long long26 = dateTimeZone13.getMillisKeepLocal(dateTimeZone24, (long) 100);
        org.joda.time.Chronology chronology27 = copticChronology0.withZone(dateTimeZone13);
        org.joda.time.DurationField durationField28 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology29 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology29.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology29.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.Chronology chronology33 = copticChronology29.withZone(dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField34 = copticChronology29.year();
        org.joda.time.DateTimeZone dateTimeZone35 = copticChronology29.getZone();
        long long39 = dateTimeZone35.convertLocalToUTC(100L, false, 1L);
        java.lang.String str40 = dateTimeZone35.getID();
        org.joda.time.ReadableInstant readableInstant41 = null;
        int int42 = dateTimeZone35.getOffset(readableInstant41);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone35);
        java.lang.String str45 = dateTimeZone35.getName(35L);
        org.joda.time.chrono.CopticChronology copticChronology46 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField47 = copticChronology46.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField48 = copticChronology46.secondOfMinute();
        org.joda.time.DurationField durationField49 = copticChronology46.halfdays();
        int int50 = copticChronology46.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField51 = copticChronology46.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone52 = copticChronology46.getZone();
        long long54 = dateTimeZone35.getMillisKeepLocal(dateTimeZone52, (long) 4);
        org.joda.time.LocalDateTime localDateTime55 = null;
        boolean boolean56 = dateTimeZone52.isLocalDateTimeGap(localDateTime55);
        org.joda.time.chrono.CopticChronology copticChronology57 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField58 = copticChronology57.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField59 = copticChronology57.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.Chronology chronology61 = copticChronology57.withZone(dateTimeZone60);
        org.joda.time.DateTimeField dateTimeField62 = copticChronology57.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField63 = copticChronology57.minuteOfDay();
        org.joda.time.DurationField durationField64 = copticChronology57.centuries();
        boolean boolean65 = dateTimeZone52.equals((java.lang.Object) copticChronology57);
        org.joda.time.Chronology chronology66 = copticChronology0.withZone(dateTimeZone52);
        org.joda.time.DurationField durationField67 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField67, durationField2, and durationField11", !(durationField67.compareTo(durationField2) == 0) || (Math.signum(durationField67.compareTo(durationField11)) == Math.signum(durationField2.compareTo(durationField11))));
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0739");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfEra();
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = copticChronology5.seconds();
        org.joda.time.DurationField durationField7 = copticChronology5.years();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology9 = copticChronology5.withZone(dateTimeZone8);
        java.lang.String str11 = dateTimeZone8.getNameKey((long) 1);
        int int13 = dateTimeZone8.getStandardOffset((long) (short) 0);
        org.joda.time.Chronology chronology14 = copticChronology0.withZone(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField19 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField20 = copticChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField19", (durationField7.compareTo(durationField19) == 0) == durationField7.equals(durationField19));
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0740");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.centuries();
        org.joda.time.DurationField durationField12 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.millisOfDay();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField15 = copticChronology14.seconds();
        org.joda.time.DurationField durationField16 = copticChronology14.years();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology18 = copticChronology14.withZone(dateTimeZone17);
        boolean boolean19 = dateTimeZone17.isFixed();
        java.lang.String str20 = dateTimeZone17.getID();
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone17, 4);
        org.joda.time.DateTimeField dateTimeField23 = copticChronology22.hourOfHalfday();
        long long27 = copticChronology22.add((long) ' ', 359999999L, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField28 = copticChronology22.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology22.yearOfEra();
        org.joda.time.chrono.CopticChronology copticChronology30 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField31 = copticChronology30.seconds();
        org.joda.time.DurationField durationField32 = copticChronology30.years();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology34 = copticChronology30.withZone(dateTimeZone33);
        boolean boolean35 = dateTimeZone33.isFixed();
        java.lang.String str36 = dateTimeZone33.getID();
        org.joda.time.Chronology chronology37 = copticChronology22.withZone(dateTimeZone33);
        org.joda.time.Chronology chronology38 = copticChronology0.withZone(dateTimeZone33);
        org.joda.time.DurationField durationField39 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField39, durationField1, and durationField11", !(durationField39.compareTo(durationField1) == 0) || (Math.signum(durationField39.compareTo(durationField11)) == Math.signum(durationField1.compareTo(durationField11))));
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0741");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.monthOfYear();
        org.joda.time.DurationField durationField10 = copticChronology7.centuries();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.dayOfMonth();
        org.joda.time.DurationField durationField12 = copticChronology7.millis();
        org.joda.time.DurationField durationField13 = copticChronology7.years();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.clockhourOfDay();
        org.joda.time.Chronology chronology15 = copticChronology7.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField13", (durationField2.compareTo(durationField13) == 0) == durationField2.equals(durationField13));
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0742");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.era();
        long long13 = copticChronology7.add(2605679999997L, 96L, 36000000);
        org.joda.time.DurationField durationField14 = copticChronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField1, and durationField2", !(durationField14.compareTo(durationField1) == 0) || (Math.signum(durationField14.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0743");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.monthOfYear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.minuteOfDay();
        org.joda.time.DurationField durationField11 = copticChronology7.centuries();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology7.dayOfYear();
        org.joda.time.DurationField durationField13 = copticChronology7.weekyears();
        org.joda.time.DurationField durationField14 = copticChronology7.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField13", (durationField2.compareTo(durationField13) == 0) == durationField2.equals(durationField13));
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0744");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.Chronology chronology4 = copticChronology0.withUTC();
        org.joda.time.DateTimeZone dateTimeZone5 = chronology4.getZone();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = copticChronology6.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology6.clockhourOfDay();
        org.joda.time.DurationField durationField9 = copticChronology6.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField3, and durationField7", !(durationField9.compareTo(durationField3) == 0) || (Math.signum(durationField9.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0745");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.yearOfEra();
        org.joda.time.DurationField durationField16 = copticChronology7.seconds();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology7.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology7.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField20 = copticChronology19.seconds();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = copticChronology19.add(readablePeriod21, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        long long28 = copticChronology19.add(readablePeriod25, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone29 = copticChronology19.getZone();
        long long32 = dateTimeZone29.adjustOffset(10L, true);
        int int34 = dateTimeZone29.getOffsetFromLocal((long) 'a');
        org.joda.time.Chronology chronology35 = copticChronology7.withZone(dateTimeZone29);
        org.joda.time.DurationField durationField36 = copticChronology7.millis();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology7.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField16", (durationField1.compareTo(durationField16) == 0) == durationField1.equals(durationField16));
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0746");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField5 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField9 = copticChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField8", (durationField2.compareTo(durationField8) == 0) == durationField2.equals(durationField8));
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0747");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField4", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0748");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfHalfday();
        long long14 = copticChronology0.getDateTimeMillis(5L, (int) (byte) 0, 4, 35, (int) (byte) 10);
        org.joda.time.DurationField durationField15 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField17 = copticChronology0.months();
        org.joda.time.DurationField durationField18 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField18", (durationField15.compareTo(durationField18) == 0) == durationField15.equals(durationField18));
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0749");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField10 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.secondOfDay();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField14 = copticChronology13.seconds();
        org.joda.time.DurationField durationField15 = copticChronology13.millis();
        org.joda.time.DurationField durationField16 = copticChronology13.hours();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology13.halfdayOfDay();
        boolean boolean18 = copticChronology0.equals((java.lang.Object) dateTimeField17);
        org.joda.time.DurationField durationField19 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField3, and durationField4", !(durationField19.compareTo(durationField3) == 0) || (Math.signum(durationField19.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0750");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.year();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology1.getZone();
        long long11 = dateTimeZone7.convertLocalToUTC(100L, false, 1L);
        java.lang.String str12 = dateTimeZone7.getID();
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone7.getOffset(readableInstant13);
        org.joda.time.Chronology chronology15 = copticChronology0.withZone(dateTimeZone7);
        java.lang.String str16 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.clockhourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology18.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology18.year();
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField22 = copticChronology21.seconds();
        org.joda.time.DurationField durationField23 = copticChronology21.years();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology25 = copticChronology21.withZone(dateTimeZone24);
        java.lang.String str27 = dateTimeZone24.getNameKey((long) 1);
        org.joda.time.Chronology chronology28 = copticChronology18.withZone(dateTimeZone24);
        long long31 = dateTimeZone24.convertLocalToUTC((long) 0, true);
        long long33 = dateTimeZone24.convertUTCToLocal((long) (short) -1);
        java.lang.String str34 = dateTimeZone24.getID();
        long long36 = dateTimeZone24.previousTransition((long) (short) -1);
        boolean boolean37 = dateTimeZone24.isFixed();
        int int39 = dateTimeZone24.getOffsetFromLocal((long) (byte) -1);
        java.lang.String str41 = dateTimeZone24.getNameKey((-100L));
        org.joda.time.Chronology chronology42 = copticChronology0.withZone(dateTimeZone24);
        int int44 = dateTimeZone24.getOffset((long) (byte) 1);
        long long46 = dateTimeZone24.nextTransition((-3599900L));
        org.joda.time.chrono.CopticChronology copticChronology47 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField48 = copticChronology47.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField49 = copticChronology47.secondOfMinute();
        org.joda.time.DurationField durationField50 = copticChronology47.halfdays();
        org.joda.time.DurationField durationField51 = copticChronology47.months();
        org.joda.time.DateTimeField dateTimeField52 = copticChronology47.halfdayOfDay();
        org.joda.time.DurationField durationField53 = copticChronology47.weekyears();
        org.joda.time.DurationField durationField54 = copticChronology47.centuries();
        org.joda.time.DurationField durationField55 = copticChronology47.millis();
        org.joda.time.DateTimeField dateTimeField56 = copticChronology47.dayOfYear();
        org.joda.time.DurationField durationField57 = copticChronology47.millis();
        org.joda.time.DateTimeField dateTimeField58 = copticChronology47.monthOfYear();
        org.joda.time.DurationField durationField59 = copticChronology47.weekyears();
        org.joda.time.DurationField durationField60 = copticChronology47.months();
        boolean boolean61 = dateTimeZone24.equals((java.lang.Object) durationField60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField53", (durationField23.compareTo(durationField53) == 0) == durationField23.equals(durationField53));
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0751");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField6 = copticChronology0.millis();
        java.lang.String str7 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.seconds();
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField1, and durationField6", !(durationField12.compareTo(durationField1) == 0) || (Math.signum(durationField12.compareTo(durationField6)) == Math.signum(durationField1.compareTo(durationField6))));
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0752");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.millisOfDay();
        org.joda.time.Chronology chronology10 = copticChronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology8.hourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology8.weekyear();
        org.joda.time.DurationField durationField15 = copticChronology8.weekyears();
        org.joda.time.DurationField durationField16 = copticChronology8.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField15", (durationField2.compareTo(durationField15) == 0) == durationField2.equals(durationField15));
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0753");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.Chronology chronology3 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, (int) ' ');
        long long10 = dateTimeZone8.nextTransition(0L);
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField5", Math.signum(durationField4.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField4)));
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0754");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.year();
        java.lang.String str7 = copticChronology0.toString();
        org.joda.time.DurationField durationField8 = copticChronology0.days();
        org.joda.time.DurationField durationField9 = copticChronology0.weeks();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        long long15 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, (-359999968L));
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone11);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField18 = copticChronology17.seconds();
        org.joda.time.DurationField durationField19 = copticChronology17.years();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology21 = copticChronology17.withZone(dateTimeZone20);
        boolean boolean22 = dateTimeZone20.isFixed();
        java.lang.String str23 = dateTimeZone20.getID();
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone20, 4);
        org.joda.time.DateTimeField dateTimeField26 = copticChronology25.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone27 = copticChronology25.getZone();
        org.joda.time.DurationField durationField28 = copticChronology25.months();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology25.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone30 = copticChronology25.getZone();
        long long32 = dateTimeZone30.previousTransition((-82800001L));
        long long34 = dateTimeZone11.getMillisKeepLocal(dateTimeZone30, 10L);
        org.joda.time.Chronology chronology35 = copticChronology0.withZone(dateTimeZone11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField28", (durationField4.compareTo(durationField28) == 0) == durationField4.equals(durationField28));
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0755");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = copticChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.era();
        org.joda.time.DurationField durationField10 = copticChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone11 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.yearOfEra();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.weekOfWeekyear();
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField16 = copticChronology15.seconds();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = copticChronology15.add(readablePeriod17, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = copticChronology15.add(readablePeriod21, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField25 = copticChronology15.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone26 = copticChronology15.getZone();
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology27.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology27.year();
        org.joda.time.chrono.CopticChronology copticChronology30 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField31 = copticChronology30.seconds();
        org.joda.time.DurationField durationField32 = copticChronology30.years();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology34 = copticChronology30.withZone(dateTimeZone33);
        java.lang.String str36 = dateTimeZone33.getNameKey((long) 1);
        org.joda.time.Chronology chronology37 = copticChronology27.withZone(dateTimeZone33);
        org.joda.time.chrono.CopticChronology copticChronology38 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField39 = copticChronology38.seconds();
        org.joda.time.DurationField durationField40 = copticChronology38.years();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology42 = copticChronology38.withZone(dateTimeZone41);
        java.lang.String str44 = dateTimeZone41.getNameKey((long) 1);
        int int46 = dateTimeZone41.getStandardOffset((long) (short) 0);
        long long48 = dateTimeZone33.getMillisKeepLocal(dateTimeZone41, (long) (short) 10);
        long long52 = dateTimeZone41.convertLocalToUTC(32L, true, (long) (-1));
        long long54 = dateTimeZone26.getMillisKeepLocal(dateTimeZone41, (long) (-1));
        java.lang.String str56 = dateTimeZone41.getName(35L);
        org.joda.time.Chronology chronology57 = copticChronology13.withZone(dateTimeZone41);
        long long59 = dateTimeZone41.nextTransition((-18720000052L));
        int int61 = dateTimeZone41.getOffsetFromLocal(14435001L);
        org.joda.time.Chronology chronology62 = copticChronology0.withZone(dateTimeZone41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField32", (durationField6.compareTo(durationField32) == 0) == durationField6.equals(durationField32));
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0756");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = copticChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.era();
        org.joda.time.DurationField durationField10 = copticChronology0.centuries();
        org.joda.time.DurationField durationField11 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField13 = copticChronology0.years();
        long long17 = copticChronology0.add(359999965L, (-3599990L), (int) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField13", (durationField6.compareTo(durationField13) == 0) == durationField6.equals(durationField13));
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0757");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField11 = copticChronology0.months();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology0.add(readablePeriod12, 90L, 100);
        org.joda.time.DurationField durationField16 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField18 = copticChronology0.months();
        org.joda.time.Chronology chronology19 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField20 = copticChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean22 = dateTimeZone21.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = dateTimeZone21.isLocalDateTimeGap(localDateTime24);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone21.getName((-360000002L), locale27);
        java.lang.String str30 = dateTimeZone21.getShortName((-4L));
        java.util.TimeZone timeZone31 = dateTimeZone21.toTimeZone();
        long long34 = dateTimeZone21.adjustOffset(189300000L, false);
        org.joda.time.Chronology chronology35 = copticChronology0.withZone(dateTimeZone21);
        org.joda.time.DurationField durationField36 = copticChronology0.years();
        org.joda.time.DurationField durationField37 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField37, durationField1, and durationField11", !(durationField37.compareTo(durationField1) == 0) || (Math.signum(durationField37.compareTo(durationField11)) == Math.signum(durationField1.compareTo(durationField11))));
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0758");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField7 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.joda.time.DurationField durationField11 = copticChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField10", Math.signum(durationField7.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField7)));
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0759");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.year();
        java.lang.String str7 = copticChronology0.toString();
        org.joda.time.DurationField durationField8 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.secondOfDay();
        int int12 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField13 = copticChronology0.weekyears();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = copticChronology0.add(readablePeriod14, (-2L), 36000000);
        org.joda.time.DurationField durationField18 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField3, and durationField4", !(durationField18.compareTo(durationField3) == 0) || (Math.signum(durationField18.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0760");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology12.getZone();
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) copticChronology12);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology12.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone18.getShortName((long) ' ', locale20);
        long long23 = dateTimeZone18.previousTransition((long) (byte) 100);
        long long27 = dateTimeZone18.convertLocalToUTC((long) (short) 100, false, (long) 360000000);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours(100);
        long long31 = dateTimeZone29.convertUTCToLocal((-1L));
        long long33 = dateTimeZone18.getMillisKeepLocal(dateTimeZone29, (long) ' ');
        boolean boolean35 = dateTimeZone18.isStandardOffset(359999999L);
        org.joda.time.LocalDateTime localDateTime36 = null;
        boolean boolean37 = dateTimeZone18.isLocalDateTimeGap(localDateTime36);
        org.joda.time.Chronology chronology38 = copticChronology12.withZone(dateTimeZone18);
        org.joda.time.DurationField durationField39 = copticChronology12.millis();
        org.joda.time.DurationField durationField40 = copticChronology12.minutes();
        java.lang.String str41 = copticChronology12.toString();
        org.joda.time.DurationField durationField42 = copticChronology12.millis();
        org.joda.time.DurationField durationField43 = copticChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField43, durationField1, and durationField2", !(durationField43.compareTo(durationField1) == 0) || (Math.signum(durationField43.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0761");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.Chronology chronology2 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfHalfday();
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = copticChronology5.seconds();
        org.joda.time.DurationField durationField7 = copticChronology5.years();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology9 = copticChronology5.withZone(dateTimeZone8);
        boolean boolean10 = dateTimeZone8.isFixed();
        long long12 = dateTimeZone8.convertUTCToLocal(10L);
        org.joda.time.Chronology chronology13 = copticChronology0.withZone(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField16 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField16", (durationField7.compareTo(durationField16) == 0) == durationField7.equals(durationField16));
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0762");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DurationField durationField9 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField4", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0763");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = copticChronology0.getZone();
        long long13 = dateTimeZone11.nextTransition(3600001L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone11.getName((-82799999L), locale15);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone11);
        org.joda.time.DurationField durationField18 = copticChronology17.days();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology17.weekyear();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology17.era();
        org.joda.time.DurationField durationField21 = copticChronology17.weekyears();
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology22.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology22.secondOfMinute();
        org.joda.time.DurationField durationField25 = copticChronology22.halfdays();
        org.joda.time.DurationField durationField26 = copticChronology22.months();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology22.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology22.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology22.era();
        org.joda.time.DurationField durationField30 = copticChronology22.years();
        org.joda.time.DateTimeZone dateTimeZone31 = copticChronology22.getZone();
        org.joda.time.Chronology chronology32 = copticChronology17.withZone(dateTimeZone31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField30", (durationField21.compareTo(durationField30) == 0) == durationField21.equals(durationField30));
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0764");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField4 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField7", (durationField4.compareTo(durationField7) == 0) == durationField4.equals(durationField7));
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0765");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.centuries();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = copticChronology0.add(readablePeriod4, (long) (short) 100, 100);
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.joda.time.DurationField durationField9 = copticChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField8", Math.signum(durationField3.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField3)));
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0766");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology8.getZone();
        org.joda.time.DurationField durationField11 = copticChronology8.months();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology8.add(readablePeriod12, (long) (short) -1, (int) '#');
        org.joda.time.DateTimeField dateTimeField16 = copticChronology8.yearOfCentury();
        org.joda.time.DurationField durationField17 = copticChronology8.days();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(100);
        boolean boolean20 = dateTimeZone19.isFixed();
        java.util.TimeZone timeZone21 = dateTimeZone19.toTimeZone();
        org.joda.time.Chronology chronology22 = copticChronology8.withZone(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField23 = copticChronology8.clockhourOfHalfday();
        org.joda.time.DurationField durationField24 = copticChronology8.seconds();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology8.weekOfWeekyear();
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology26.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology26.year();
        org.joda.time.chrono.CopticChronology copticChronology29 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField30 = copticChronology29.seconds();
        org.joda.time.DurationField durationField31 = copticChronology29.years();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology33 = copticChronology29.withZone(dateTimeZone32);
        java.lang.String str35 = dateTimeZone32.getNameKey((long) 1);
        org.joda.time.Chronology chronology36 = copticChronology26.withZone(dateTimeZone32);
        long long39 = dateTimeZone32.convertLocalToUTC((long) 0, true);
        org.joda.time.chrono.CopticChronology copticChronology40 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology40.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField42 = copticChronology40.secondOfMinute();
        org.joda.time.DurationField durationField43 = copticChronology40.halfdays();
        org.joda.time.DurationField durationField44 = copticChronology40.months();
        org.joda.time.DateTimeField dateTimeField45 = copticChronology40.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        long long49 = copticChronology40.add(readablePeriod46, (long) (-1), (int) '#');
        boolean boolean50 = dateTimeZone32.equals((java.lang.Object) readablePeriod46);
        java.lang.String str52 = dateTimeZone32.getNameKey(210L);
        org.joda.time.Chronology chronology53 = copticChronology8.withZone(dateTimeZone32);
        java.util.Locale locale55 = null;
        java.lang.String str56 = dateTimeZone32.getShortName((long) (short) 10, locale55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField24", (durationField1.compareTo(durationField24) == 0) == durationField1.equals(durationField24));
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0767");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = copticChronology3.seconds();
        org.joda.time.DurationField durationField5 = copticChronology3.years();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = copticChronology3.withZone(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getNameKey((long) 1);
        org.joda.time.Chronology chronology10 = copticChronology0.withZone(dateTimeZone6);
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = copticChronology11.seconds();
        org.joda.time.DurationField durationField13 = copticChronology11.years();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology15 = copticChronology11.withZone(dateTimeZone14);
        java.lang.String str17 = dateTimeZone14.getNameKey((long) 1);
        int int19 = dateTimeZone14.getStandardOffset((long) (short) 0);
        long long21 = dateTimeZone6.getMillisKeepLocal(dateTimeZone14, (long) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6, (int) (short) 1);
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology24.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology24.secondOfMinute();
        org.joda.time.DurationField durationField27 = copticChronology24.weeks();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology24.dayOfYear();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology24.hourOfDay();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology24.yearOfEra();
        org.joda.time.DurationField durationField31 = copticChronology24.weekyears();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology24.secondOfDay();
        org.joda.time.Chronology chronology33 = copticChronology24.withUTC();
        boolean boolean34 = dateTimeZone6.equals((java.lang.Object) chronology33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField31", (durationField5.compareTo(durationField31) == 0) == durationField5.equals(durationField31));
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0768");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.year();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone11.getShortName((long) ' ', locale13);
        org.joda.time.Chronology chronology15 = copticChronology8.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology8.hourOfHalfday();
        org.joda.time.DurationField durationField17 = copticChronology8.weekyears();
        org.joda.time.DurationField durationField18 = copticChronology8.hours();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology8.weekyear();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        long long25 = copticChronology8.add(readablePeriod22, (-46790000L), 360000000);
        boolean boolean26 = copticChronology0.equals((java.lang.Object) readablePeriod22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField17", (durationField2.compareTo(durationField17) == 0) == durationField2.equals(durationField17));
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0769");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.year();
        java.lang.String str7 = copticChronology0.toString();
        org.joda.time.DurationField durationField8 = copticChronology0.days();
        org.joda.time.DurationField durationField9 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField4", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0770");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField6 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField6", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField6)) == Math.signum(durationField1.compareTo(durationField6))));
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0771");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.centuries();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 0);
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        long long15 = copticChronology0.add((-8092799855L), 10030803175L, (int) (byte) 1);
        org.joda.time.DurationField durationField16 = copticChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.Chronology chronology18 = copticChronology0.withZone(dateTimeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField16", (durationField2.compareTo(durationField16) == 0) == durationField2.equals(durationField16));
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0772");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone4 = copticChronology0.getZone();
        org.joda.time.DurationField durationField5 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.hourOfHalfday();
        long long10 = copticChronology0.add((long) (byte) 100, (long) 52, 10);
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField1, and durationField2", !(durationField11.compareTo(durationField1) == 0) || (Math.signum(durationField11.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0773");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfHour();
        java.lang.String str7 = copticChronology0.toString();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField2", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0774");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField5 = copticChronology4.seconds();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology4.add(readablePeriod6, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology4.add(readablePeriod10, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = copticChronology4.getZone();
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone15.getShortName(3600000L, locale17);
        java.lang.String str20 = dateTimeZone15.getName(3600000L);
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField22 = copticChronology21.seconds();
        org.joda.time.DurationField durationField23 = copticChronology21.years();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology25 = copticChronology21.withZone(dateTimeZone24);
        int int27 = dateTimeZone24.getOffset((long) 0);
        int int29 = dateTimeZone24.getOffset((long) (byte) 1);
        boolean boolean30 = dateTimeZone15.equals((java.lang.Object) dateTimeZone24);
        org.joda.time.Chronology chronology31 = copticChronology0.withZone(dateTimeZone15);
        java.util.TimeZone timeZone32 = dateTimeZone15.toTimeZone();
        org.joda.time.chrono.CopticChronology copticChronology33 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField34 = copticChronology33.seconds();
        org.joda.time.DurationField durationField35 = copticChronology33.minutes();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology33.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology33.clockhourOfHalfday();
        org.joda.time.DurationField durationField38 = copticChronology33.weeks();
        org.joda.time.DurationField durationField39 = copticChronology33.halfdays();
        boolean boolean40 = dateTimeZone15.equals((java.lang.Object) copticChronology33);
        org.joda.time.DateTimeField dateTimeField41 = copticChronology33.hourOfDay();
        org.joda.time.DateTimeField dateTimeField42 = copticChronology33.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = copticChronology33.yearOfCentury();
        org.joda.time.DurationField durationField44 = copticChronology33.weekyears();
        org.joda.time.DurationField durationField45 = copticChronology33.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField44", (durationField23.compareTo(durationField44) == 0) == durationField23.equals(durationField44));
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0775");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField9 = copticChronology0.years();
        org.joda.time.DurationField durationField10 = copticChronology0.days();
        org.joda.time.Chronology chronology11 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField9, and durationField10", !(durationField12.compareTo(durationField9) == 0) || (Math.signum(durationField12.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0776");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField5, and durationField3", !(durationField3.compareTo(durationField5) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField5.compareTo(durationField3))));
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0777");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField6", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0778");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField1, and durationField2", !(durationField3.compareTo(durationField1) == 0) || (Math.signum(durationField3.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0779");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.minutes();
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField5 = copticChronology4.seconds();
        org.joda.time.DurationField durationField6 = copticChronology4.years();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology8 = copticChronology4.withZone(dateTimeZone7);
        java.lang.String str10 = dateTimeZone7.getNameKey((long) 1);
        int int12 = dateTimeZone7.getStandardOffset((long) (short) 0);
        org.joda.time.Chronology chronology13 = copticChronology0.withZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology0.getZone();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = copticChronology0.add(readablePeriod15, 28L, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone19 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.yearOfEra();
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField22 = copticChronology21.seconds();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = copticChronology21.add(readablePeriod23, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        long long30 = copticChronology21.add(readablePeriod27, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone31 = copticChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology21.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology21.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology21.era();
        org.joda.time.DurationField durationField35 = copticChronology21.weekyears();
        boolean boolean36 = copticChronology0.equals((java.lang.Object) copticChronology21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField35", (durationField6.compareTo(durationField35) == 0) == durationField6.equals(durationField35));
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0780");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.joda.time.DurationField durationField8 = copticChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField8, and durationField3", !(durationField3.compareTo(durationField8) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField8.compareTo(durationField3))));
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0781");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.minuteOfHour();
        org.joda.time.DurationField durationField9 = copticChronology7.weekyears();
        org.joda.time.DurationField durationField10 = copticChronology7.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField9", (durationField10.compareTo(durationField9) == 0) == durationField10.equals(durationField9));
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0782");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.minutes();
        org.joda.time.DurationField durationField4 = copticChronology0.centuries();
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DurationField durationField6 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField2", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0783");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        long long17 = copticChronology0.add(7238L, (long) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField13", Math.signum(durationField1.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField1)));
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0784");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField15 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.weekyear();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = copticChronology0.add(readablePeriod18, (long) (short) 0, 10);
        org.joda.time.DateTimeField dateTimeField22 = copticChronology0.yearOfCentury();
        org.joda.time.Chronology chronology23 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField24 = chronology23.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField1, and durationField15", !(durationField24.compareTo(durationField1) == 0) || (Math.signum(durationField24.compareTo(durationField15)) == Math.signum(durationField1.compareTo(durationField15))));
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0785");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField6 = copticChronology0.years();
        org.joda.time.DurationField durationField7 = copticChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField6", (durationField4.compareTo(durationField6) == 0) == durationField4.equals(durationField6));
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0786");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DurationField durationField7 = copticChronology0.years();
        org.joda.time.DurationField durationField8 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfDay();
        long long13 = copticChronology0.add((-14459996L), (-96L), 0);
        org.joda.time.DurationField durationField14 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField3, and durationField6", !(durationField14.compareTo(durationField3) == 0) || (Math.signum(durationField14.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0787");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology8.getZone();
        org.joda.time.DurationField durationField11 = copticChronology8.months();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology8.add(readablePeriod12, (long) (short) -1, (int) '#');
        org.joda.time.DateTimeField dateTimeField16 = copticChronology8.yearOfCentury();
        org.joda.time.DurationField durationField17 = copticChronology8.days();
        org.joda.time.DurationField durationField18 = copticChronology8.years();
        org.joda.time.DurationField durationField19 = copticChronology8.millis();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology8.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField18", (durationField2.compareTo(durationField18) == 0) == durationField2.equals(durationField18));
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0788");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone4 = copticChronology0.getZone();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField6", (durationField3.compareTo(durationField6) == 0) == durationField3.equals(durationField6));
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0789");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField8 = copticChronology0.seconds();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField9", Math.signum(durationField1.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField1)));
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0790");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology12.getZone();
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) copticChronology12);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology12.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology12.hourOfDay();
        org.joda.time.DurationField durationField21 = copticChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField1, and durationField2", !(durationField21.compareTo(durationField1) == 0) || (Math.signum(durationField21.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0791");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.centuryOfEra();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = copticChronology3.seconds();
        org.joda.time.DurationField durationField5 = copticChronology3.millis();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology3.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology3.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology3.getZone();
        org.joda.time.Chronology chronology10 = copticChronology0.withZone(dateTimeZone9);
        java.lang.String str11 = copticChronology0.toString();
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField4, and durationField5", !(durationField12.compareTo(durationField4) == 0) || (Math.signum(durationField12.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0792");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = copticChronology0.millis();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField8 = copticChronology7.seconds();
        org.joda.time.DurationField durationField9 = copticChronology7.years();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology11 = copticChronology7.withZone(dateTimeZone10);
        boolean boolean12 = dateTimeZone10.isFixed();
        java.lang.String str13 = dateTimeZone10.getID();
        org.joda.time.Chronology chronology14 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology15.secondOfMinute();
        org.joda.time.DurationField durationField18 = copticChronology15.halfdays();
        org.joda.time.DurationField durationField19 = copticChronology15.months();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology15.halfdayOfDay();
        org.joda.time.DurationField durationField21 = copticChronology15.weekyears();
        org.joda.time.DurationField durationField22 = copticChronology15.centuries();
        org.joda.time.DurationField durationField23 = copticChronology15.millis();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology15.dayOfYear();
        org.joda.time.DurationField durationField25 = copticChronology15.millis();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        long long29 = copticChronology15.add(readablePeriod26, (long) 100, 35);
        boolean boolean30 = copticChronology0.equals((java.lang.Object) copticChronology15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField21", (durationField9.compareTo(durationField21) == 0) == durationField9.equals(durationField21));
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0793");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.year();
        org.joda.time.DurationField durationField10 = copticChronology0.months();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField4", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0794");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField10 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField12 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = copticChronology0.getZone();
        java.lang.String str17 = dateTimeZone15.getName((-360000240L));
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology18.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology18.year();
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField22 = copticChronology21.seconds();
        org.joda.time.DurationField durationField23 = copticChronology21.years();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology25 = copticChronology21.withZone(dateTimeZone24);
        java.lang.String str27 = dateTimeZone24.getNameKey((long) 1);
        org.joda.time.Chronology chronology28 = copticChronology18.withZone(dateTimeZone24);
        org.joda.time.chrono.CopticChronology copticChronology29 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField30 = copticChronology29.seconds();
        org.joda.time.DurationField durationField31 = copticChronology29.years();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology33 = copticChronology29.withZone(dateTimeZone32);
        java.lang.String str35 = dateTimeZone32.getNameKey((long) 1);
        int int37 = dateTimeZone32.getStandardOffset((long) (short) 0);
        long long39 = dateTimeZone24.getMillisKeepLocal(dateTimeZone32, (long) (short) 10);
        java.lang.String str41 = dateTimeZone24.getName(359999999L);
        long long43 = dateTimeZone24.convertUTCToLocal((long) (byte) 0);
        long long46 = dateTimeZone24.convertLocalToUTC(99L, false);
        org.joda.time.LocalDateTime localDateTime47 = null;
        boolean boolean48 = dateTimeZone24.isLocalDateTimeGap(localDateTime47);
        long long50 = dateTimeZone15.getMillisKeepLocal(dateTimeZone24, (-53175297600025L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField23", (durationField6.compareTo(durationField23) == 0) == durationField6.equals(durationField23));
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0795");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology12.getZone();
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) copticChronology12);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology12.dayOfWeek();
        org.joda.time.DurationField durationField18 = copticChronology12.years();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology12.clockhourOfHalfday();
        org.joda.time.Chronology chronology20 = copticChronology12.withUTC();
        org.joda.time.DurationField durationField21 = copticChronology12.halfdays();
        org.joda.time.DurationField durationField22 = copticChronology12.centuries();
        org.joda.time.DurationField durationField23 = copticChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField1, and durationField2", !(durationField23.compareTo(durationField1) == 0) || (Math.signum(durationField23.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0796");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        long long14 = copticChronology0.add((long) (short) 100, (-53175297599990L), (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField16 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField3, and durationField4", !(durationField16.compareTo(durationField3) == 0) || (Math.signum(durationField16.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0797");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.DurationField durationField3 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.year();
        org.joda.time.DurationField durationField5 = copticChronology0.millis();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField7 = copticChronology6.seconds();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = copticChronology6.add(readablePeriod8, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology6.add(readablePeriod12, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology6.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = copticChronology6.getZone();
        long long19 = dateTimeZone17.nextTransition(3600001L);
        long long21 = dateTimeZone17.nextTransition((long) (short) 100);
        java.util.TimeZone timeZone22 = dateTimeZone17.toTimeZone();
        org.joda.time.Chronology chronology23 = copticChronology0.withZone(dateTimeZone17);
        org.joda.time.DurationField durationField24 = copticChronology0.weeks();
        org.joda.time.DurationField durationField25 = copticChronology0.seconds();
        org.joda.time.DurationField durationField26 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField3, and durationField5", !(durationField26.compareTo(durationField3) == 0) || (Math.signum(durationField26.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0798");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology8.minuteOfDay();
        org.joda.time.DurationField durationField12 = copticChronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField1, and durationField2", !(durationField12.compareTo(durationField1) == 0) || (Math.signum(durationField12.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0799");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = copticChronology0.add(readablePeriod8, 90L, (int) (short) -1);
        org.joda.time.Chronology chronology12 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField13 = copticChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField13, and durationField3", !(durationField3.compareTo(durationField13) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField13.compareTo(durationField3))));
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0800");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = copticChronology10.seconds();
        org.joda.time.DurationField durationField12 = copticChronology10.hours();
        org.joda.time.DurationField durationField13 = copticChronology10.minutes();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology10.getZone();
        java.lang.String str15 = copticChronology10.toString();
        java.lang.Object obj16 = null;
        boolean boolean17 = copticChronology10.equals(obj16);
        long long21 = copticChronology10.add((long) '4', 36601035L, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField22 = copticChronology10.era();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology10.monthOfYear();
        boolean boolean24 = dateTimeZone9.equals((java.lang.Object) copticChronology10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField11", Math.signum(durationField3.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField3)));
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0801");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.year();
        int int5 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField6 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.year();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField6", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField6)) == Math.signum(durationField1.compareTo(durationField6))));
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0802");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField6, and durationField8", !(durationField11.compareTo(durationField6) == 0) || (Math.signum(durationField11.compareTo(durationField8)) == Math.signum(durationField6.compareTo(durationField8))));
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0803");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.millisOfDay();
        org.joda.time.Chronology chronology10 = copticChronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology8.hourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology8.weekyear();
        org.joda.time.DurationField durationField15 = copticChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology8.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField15", (durationField2.compareTo(durationField15) == 0) == durationField2.equals(durationField15));
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0804");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        long long9 = copticChronology0.add((long) 100, (long) (-1), 10);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField11", Math.signum(durationField3.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField3)));
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0805");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.hourOfHalfday();
        long long14 = copticChronology8.add((-720000001L), (-3599968L), (int) '4');
        org.joda.time.DateTimeField dateTimeField15 = copticChronology8.year();
        org.joda.time.DurationField durationField16 = copticChronology8.seconds();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology8.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField16", (durationField1.compareTo(durationField16) == 0) == durationField1.equals(durationField16));
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0806");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone3.getShortName((long) ' ', locale5);
        org.joda.time.Chronology chronology7 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField9 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.hourOfHalfday();
        org.joda.time.Chronology chronology12 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField14 = copticChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone15 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology16.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology16.secondOfMinute();
        org.joda.time.DurationField durationField19 = copticChronology16.halfdays();
        int int20 = copticChronology16.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField21 = copticChronology16.months();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology16.millisOfDay();
        org.joda.time.DurationField durationField23 = copticChronology16.weeks();
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField25 = copticChronology24.seconds();
        org.joda.time.DurationField durationField26 = copticChronology24.years();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology28 = copticChronology24.withZone(dateTimeZone27);
        java.lang.String str30 = dateTimeZone27.getNameKey((long) 1);
        int int32 = dateTimeZone27.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        boolean boolean35 = dateTimeZone27.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology36 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology36.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone38 = copticChronology36.getZone();
        boolean boolean39 = dateTimeZone27.equals((java.lang.Object) copticChronology36);
        boolean boolean40 = dateTimeZone27.isFixed();
        org.joda.time.Chronology chronology41 = copticChronology16.withZone(dateTimeZone27);
        org.joda.time.DurationField durationField42 = copticChronology16.millis();
        org.joda.time.chrono.CopticChronology copticChronology43 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField44 = copticChronology43.seconds();
        org.joda.time.DurationField durationField45 = copticChronology43.years();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology47 = copticChronology43.withZone(dateTimeZone46);
        int int49 = dateTimeZone46.getOffset((long) 0);
        long long52 = dateTimeZone46.adjustOffset((-100L), false);
        boolean boolean53 = copticChronology16.equals((java.lang.Object) dateTimeZone46);
        org.joda.time.LocalDateTime localDateTime54 = null;
        boolean boolean55 = dateTimeZone46.isLocalDateTimeGap(localDateTime54);
        int int57 = dateTimeZone46.getStandardOffset(1474560387840032L);
        long long59 = dateTimeZone46.nextTransition(149L);
        org.joda.time.LocalDateTime localDateTime60 = null;
        boolean boolean61 = dateTimeZone46.isLocalDateTimeGap(localDateTime60);
        boolean boolean62 = dateTimeZone15.equals((java.lang.Object) dateTimeZone46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField26", (durationField9.compareTo(durationField26) == 0) == durationField9.equals(durationField26));
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0807");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        java.lang.String str5 = copticChronology0.toString();
        java.lang.String str6 = copticChronology0.toString();
        org.joda.time.DurationField durationField7 = copticChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField7, and durationField3", !(durationField3.compareTo(durationField7) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField7.compareTo(durationField3))));
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0808");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.DurationField durationField10 = copticChronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField10", (durationField2.compareTo(durationField10) == 0) == durationField2.equals(durationField10));
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0809");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.centuries();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = copticChronology0.add(readablePeriod4, (long) (short) 100, 100);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField11 = copticChronology0.seconds();
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField3, and durationField11", !(durationField12.compareTo(durationField3) == 0) || (Math.signum(durationField12.compareTo(durationField11)) == Math.signum(durationField3.compareTo(durationField11))));
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0810");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.yearOfEra();
        org.joda.time.DurationField durationField16 = copticChronology7.seconds();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology7.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology7.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField20 = copticChronology19.seconds();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = copticChronology19.add(readablePeriod21, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        long long28 = copticChronology19.add(readablePeriod25, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone29 = copticChronology19.getZone();
        long long32 = dateTimeZone29.adjustOffset(10L, true);
        int int34 = dateTimeZone29.getOffsetFromLocal((long) 'a');
        org.joda.time.Chronology chronology35 = copticChronology7.withZone(dateTimeZone29);
        org.joda.time.DurationField durationField36 = copticChronology7.millis();
        org.joda.time.DurationField durationField37 = copticChronology7.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField16", (durationField1.compareTo(durationField16) == 0) == durationField1.equals(durationField16));
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0811");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = copticChronology3.seconds();
        org.joda.time.DurationField durationField5 = copticChronology3.years();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = copticChronology3.withZone(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getNameKey((long) 1);
        org.joda.time.Chronology chronology10 = copticChronology0.withZone(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.year();
        org.joda.time.DurationField durationField14 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField14", (durationField5.compareTo(durationField14) == 0) == durationField5.equals(durationField14));
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0812");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = copticChronology0.millis();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = copticChronology11.seconds();
        org.joda.time.DurationField durationField13 = copticChronology11.years();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology11.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology11.era();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology11.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology11.year();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology11.minuteOfDay();
        org.joda.time.DurationField durationField19 = copticChronology11.weeks();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology11.weekyearOfCentury();
        boolean boolean21 = copticChronology0.equals((java.lang.Object) copticChronology11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField13", (durationField8.compareTo(durationField13) == 0) == durationField8.equals(durationField13));
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0813");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField11 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField1, and durationField11", !(durationField13.compareTo(durationField1) == 0) || (Math.signum(durationField13.compareTo(durationField11)) == Math.signum(durationField1.compareTo(durationField11))));
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0814");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.minutes();
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField5 = copticChronology4.seconds();
        org.joda.time.DurationField durationField6 = copticChronology4.years();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology8 = copticChronology4.withZone(dateTimeZone7);
        java.lang.String str10 = dateTimeZone7.getNameKey((long) 1);
        int int12 = dateTimeZone7.getStandardOffset((long) (short) 0);
        org.joda.time.Chronology chronology13 = copticChronology0.withZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField16 = copticChronology0.years();
        org.joda.time.DurationField durationField17 = copticChronology0.months();
        org.joda.time.DurationField durationField18 = copticChronology0.years();
        org.joda.time.DurationField durationField19 = copticChronology0.weekyears();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = copticChronology0.add(readablePeriod20, (-101L), (int) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField19", (durationField6.compareTo(durationField19) == 0) == durationField6.equals(durationField19));
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0815");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone4 = copticChronology0.getZone();
        org.joda.time.DurationField durationField5 = copticChronology0.centuries();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField1, and durationField2", !(durationField6.compareTo(durationField1) == 0) || (Math.signum(durationField6.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0816");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField8 = copticChronology0.years();
        org.joda.time.DurationField durationField9 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField9", (durationField8.compareTo(durationField9) == 0) == durationField8.equals(durationField9));
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0817");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        long long8 = copticChronology0.add((long) 4, (long) (short) -1, (int) (byte) -1);
        org.joda.time.DurationField durationField9 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField10 = copticChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField9", (durationField2.compareTo(durationField9) == 0) == durationField2.equals(durationField9));
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0818");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField5 = copticChronology0.minutes();
        org.joda.time.DurationField durationField6 = copticChronology0.minutes();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField7", (durationField2.compareTo(durationField7) == 0) == durationField2.equals(durationField7));
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0819");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.yearOfEra();
        org.joda.time.DurationField durationField16 = copticChronology7.seconds();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology7.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology7.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField20 = copticChronology19.seconds();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = copticChronology19.add(readablePeriod21, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        long long28 = copticChronology19.add(readablePeriod25, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone29 = copticChronology19.getZone();
        long long32 = dateTimeZone29.adjustOffset(10L, true);
        int int34 = dateTimeZone29.getOffsetFromLocal((long) 'a');
        org.joda.time.Chronology chronology35 = copticChronology7.withZone(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone36 = copticChronology7.getZone();
        long long38 = dateTimeZone36.convertUTCToLocal((-360000002L));
        org.joda.time.chrono.CopticChronology copticChronology39 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField40 = copticChronology39.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone41 = copticChronology39.getZone();
        org.joda.time.DurationField durationField42 = copticChronology39.days();
        org.joda.time.DateTimeField dateTimeField43 = copticChronology39.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField44 = copticChronology39.hourOfHalfday();
        org.joda.time.DurationField durationField45 = copticChronology39.centuries();
        org.joda.time.DateTimeField dateTimeField46 = copticChronology39.clockhourOfHalfday();
        org.joda.time.DurationField durationField47 = copticChronology39.centuries();
        org.joda.time.DateTimeField dateTimeField48 = copticChronology39.dayOfWeek();
        org.joda.time.DurationField durationField49 = copticChronology39.halfdays();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        org.joda.time.ReadableInstant readableInstant52 = null;
        int int53 = dateTimeZone51.getOffset(readableInstant52);
        java.lang.String str55 = dateTimeZone51.getShortName((long) (short) 100);
        boolean boolean56 = dateTimeZone51.isFixed();
        java.lang.String str58 = dateTimeZone51.getNameKey(322080001L);
        java.lang.String str59 = dateTimeZone51.getID();
        java.lang.String str61 = dateTimeZone51.getNameKey(309669975L);
        org.joda.time.Chronology chronology62 = copticChronology39.withZone(dateTimeZone51);
        long long64 = dateTimeZone36.getMillisKeepLocal(dateTimeZone51, 1885440001L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField16", (durationField1.compareTo(durationField16) == 0) == durationField1.equals(durationField16));
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0820");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.era();
        java.lang.String str4 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = copticChronology0.seconds();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.joda.time.DurationField durationField9 = copticChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField8", Math.signum(durationField1.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField1)));
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0821");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DurationField durationField3 = copticChronology0.days();
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField5 = copticChronology4.seconds();
        org.joda.time.DurationField durationField6 = copticChronology4.years();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology8 = copticChronology4.withZone(dateTimeZone7);
        java.lang.String str10 = dateTimeZone7.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7);
        org.joda.time.Chronology chronology12 = copticChronology0.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField13 = chronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField13", (durationField6.compareTo(durationField13) == 0) == durationField6.equals(durationField13));
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0822");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField10 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField12 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.dayOfMonth();
        int int17 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField18 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField3, and durationField4", !(durationField18.compareTo(durationField3) == 0) || (Math.signum(durationField18.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0823");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 5L, 4);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.years();
        int int12 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField13 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.dayOfWeek();
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology15.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.Chronology chronology19 = copticChronology15.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = copticChronology15.year();
        org.joda.time.DateTimeZone dateTimeZone21 = copticChronology15.getZone();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology15.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology15.halfdayOfDay();
        org.joda.time.DurationField durationField24 = copticChronology15.centuries();
        boolean boolean25 = copticChronology0.equals((java.lang.Object) copticChronology15);
        org.joda.time.DurationField durationField26 = copticChronology15.weekyears();
        org.joda.time.DurationField durationField27 = copticChronology15.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField26", (durationField11.compareTo(durationField26) == 0) == durationField11.equals(durationField26));
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0824");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DurationField durationField3 = copticChronology0.days();
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField5 = copticChronology4.seconds();
        org.joda.time.DurationField durationField6 = copticChronology4.years();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology8 = copticChronology4.withZone(dateTimeZone7);
        java.lang.String str10 = dateTimeZone7.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7);
        org.joda.time.Chronology chronology12 = copticChronology0.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField13 = chronology12.years();
        org.joda.time.DurationField durationField14 = chronology12.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField13", (durationField6.compareTo(durationField13) == 0) == durationField6.equals(durationField13));
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0825");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 5L, 4);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.years();
        int int12 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField13 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.dayOfWeek();
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology15.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.Chronology chronology19 = copticChronology15.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = copticChronology15.year();
        org.joda.time.DateTimeZone dateTimeZone21 = copticChronology15.getZone();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology15.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology15.halfdayOfDay();
        org.joda.time.DurationField durationField24 = copticChronology15.centuries();
        boolean boolean25 = copticChronology0.equals((java.lang.Object) copticChronology15);
        org.joda.time.DurationField durationField26 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology0.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField26", (durationField11.compareTo(durationField26) == 0) == durationField11.equals(durationField26));
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0826");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField4", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0827");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField9 = copticChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField9, and durationField6", !(durationField6.compareTo(durationField9) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField9.compareTo(durationField6))));
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0828");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = copticChronology0.add(readablePeriod9, 0L, (int) (short) -1);
        org.joda.time.DurationField durationField13 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField14 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField15 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.weekyear();
        org.joda.time.Chronology chronology17 = copticChronology0.withUTC();
        org.joda.time.DateTimeZone dateTimeZone18 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology19.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology19.year();
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField23 = copticChronology22.seconds();
        org.joda.time.DurationField durationField24 = copticChronology22.years();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology26 = copticChronology22.withZone(dateTimeZone25);
        java.lang.String str28 = dateTimeZone25.getNameKey((long) 1);
        org.joda.time.Chronology chronology29 = copticChronology19.withZone(dateTimeZone25);
        org.joda.time.chrono.CopticChronology copticChronology30 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField31 = copticChronology30.seconds();
        org.joda.time.DurationField durationField32 = copticChronology30.years();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology34 = copticChronology30.withZone(dateTimeZone33);
        java.lang.String str36 = dateTimeZone33.getNameKey((long) 1);
        int int38 = dateTimeZone33.getStandardOffset((long) (short) 0);
        long long40 = dateTimeZone25.getMillisKeepLocal(dateTimeZone33, (long) (short) 10);
        int int42 = dateTimeZone25.getStandardOffset((long) (byte) 100);
        long long45 = dateTimeZone25.convertLocalToUTC((long) (byte) 0, true);
        java.util.Locale locale47 = null;
        java.lang.String str48 = dateTimeZone25.getShortName(999L, locale47);
        long long52 = dateTimeZone25.convertLocalToUTC(0L, false, (long) (byte) 0);
        long long54 = dateTimeZone25.convertUTCToLocal((long) 10);
        long long58 = dateTimeZone25.convertLocalToUTC((-52870260899965L), true, (-135L));
        long long60 = dateTimeZone18.getMillisKeepLocal(dateTimeZone25, (-5L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField24", (durationField13.compareTo(durationField24) == 0) == durationField13.equals(durationField24));
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0829");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) 1, (int) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.year();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = copticChronology10.seconds();
        org.joda.time.DurationField durationField12 = copticChronology10.years();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology14 = copticChronology10.withZone(dateTimeZone13);
        java.lang.String str16 = dateTimeZone13.getNameKey((long) 1);
        org.joda.time.Chronology chronology17 = copticChronology7.withZone(dateTimeZone13);
        long long20 = dateTimeZone13.convertLocalToUTC((long) 0, true);
        long long22 = dateTimeZone13.convertUTCToLocal((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        long long26 = dateTimeZone13.getMillisKeepLocal(dateTimeZone24, (long) 100);
        org.joda.time.Chronology chronology27 = copticChronology0.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField28 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField29 = copticChronology0.seconds();
        org.joda.time.chrono.CopticChronology copticChronology30 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology30.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology30.year();
        org.joda.time.chrono.CopticChronology copticChronology33 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField34 = copticChronology33.seconds();
        org.joda.time.DurationField durationField35 = copticChronology33.years();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology37 = copticChronology33.withZone(dateTimeZone36);
        java.lang.String str39 = dateTimeZone36.getNameKey((long) 1);
        org.joda.time.Chronology chronology40 = copticChronology30.withZone(dateTimeZone36);
        long long43 = dateTimeZone36.convertLocalToUTC((long) 0, true);
        long long45 = dateTimeZone36.convertUTCToLocal((long) (short) -1);
        java.lang.String str46 = dateTimeZone36.getID();
        long long48 = dateTimeZone36.previousTransition((long) (short) -1);
        boolean boolean49 = dateTimeZone36.isFixed();
        int int51 = dateTimeZone36.getOffsetFromLocal((long) (byte) -1);
        java.lang.String str53 = dateTimeZone36.getNameKey((-100L));
        org.joda.time.Chronology chronology54 = copticChronology0.withZone(dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField55 = chronology54.hourOfDay();
        org.joda.time.DurationField durationField56 = chronology54.hours();
        org.joda.time.DateTimeField dateTimeField57 = chronology54.halfdayOfDay();
        org.joda.time.DurationField durationField58 = chronology54.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField58, durationField2, and durationField11", !(durationField58.compareTo(durationField2) == 0) || (Math.signum(durationField58.compareTo(durationField11)) == Math.signum(durationField2.compareTo(durationField11))));
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0830");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        long long9 = copticChronology0.add((long) 100, (long) (-1), 10);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DurationField durationField11 = copticChronology0.years();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology12.year();
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField16 = copticChronology15.seconds();
        org.joda.time.DurationField durationField17 = copticChronology15.years();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology19 = copticChronology15.withZone(dateTimeZone18);
        java.lang.String str21 = dateTimeZone18.getNameKey((long) 1);
        org.joda.time.Chronology chronology22 = copticChronology12.withZone(dateTimeZone18);
        long long25 = dateTimeZone18.convertLocalToUTC((long) 0, true);
        boolean boolean27 = dateTimeZone18.isStandardOffset((long) (short) 1);
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone18.getShortName(0L, locale29);
        java.lang.String str32 = dateTimeZone18.getNameKey((long) (short) -1);
        java.lang.String str34 = dateTimeZone18.getName(360000000L);
        org.joda.time.Chronology chronology35 = copticChronology0.withZone(dateTimeZone18);
        boolean boolean36 = dateTimeZone18.isFixed();
        org.joda.time.chrono.CopticChronology copticChronology37 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone18);
        org.joda.time.Chronology chronology38 = copticChronology37.withUTC();
        org.joda.time.DurationField durationField39 = copticChronology37.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField39, durationField3, and durationField11", !(durationField39.compareTo(durationField3) == 0) || (Math.signum(durationField39.compareTo(durationField11)) == Math.signum(durationField3.compareTo(durationField11))));
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0831");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.centuries();
        org.joda.time.DurationField durationField4 = copticChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField4", Math.signum(durationField3.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField3)));
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0832");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = copticChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.era();
        org.joda.time.Chronology chronology10 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField12 = copticChronology0.weekyears();
        org.joda.time.Chronology chronology13 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField15 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField3, and durationField4", !(durationField15.compareTo(durationField3) == 0) || (Math.signum(durationField15.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0833");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.year();
        org.joda.time.DurationField durationField11 = copticChronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField1, and durationField2", !(durationField11.compareTo(durationField1) == 0) || (Math.signum(durationField11.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0834");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = copticChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.era();
        org.joda.time.Chronology chronology10 = copticChronology0.withUTC();
        org.joda.time.DateTimeZone dateTimeZone11 = copticChronology0.getZone();
        org.joda.time.DurationField durationField12 = copticChronology0.years();
        org.joda.time.DurationField durationField13 = copticChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField12", (durationField6.compareTo(durationField12) == 0) == durationField6.equals(durationField12));
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0835");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.centuries();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField2", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0836");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField7", Math.signum(durationField1.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField1)));
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0837");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology0.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField8", Math.signum(durationField3.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField3)));
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0838");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.years();
        org.joda.time.DurationField durationField4 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.era();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField1, and durationField2", !(durationField6.compareTo(durationField1) == 0) || (Math.signum(durationField6.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0839");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField1, and durationField2", !(durationField5.compareTo(durationField1) == 0) || (Math.signum(durationField5.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0840");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.millisOfDay();
        org.joda.time.Chronology chronology13 = copticChronology0.withUTC();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology15.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone17 = copticChronology15.getZone();
        java.lang.String str19 = dateTimeZone17.getNameKey((long) ' ');
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone17.getShortName(3600035L, locale21);
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology23.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology23.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.Chronology chronology27 = copticChronology23.withZone(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = copticChronology23.year();
        org.joda.time.DurationField durationField29 = copticChronology23.months();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology23.weekyearOfCentury();
        org.joda.time.DurationField durationField31 = copticChronology23.minutes();
        org.joda.time.DateTimeZone dateTimeZone32 = copticChronology23.getZone();
        org.joda.time.DateTimeZone dateTimeZone33 = copticChronology23.getZone();
        boolean boolean34 = dateTimeZone17.equals((java.lang.Object) dateTimeZone33);
        long long37 = dateTimeZone17.convertLocalToUTC((-719999989L), true);
        org.joda.time.Chronology chronology38 = copticChronology0.withZone(dateTimeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField29", Math.signum(durationField9.compareTo(durationField29)) == -Math.signum(durationField29.compareTo(durationField9)));
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0841");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.yearOfEra();
        org.joda.time.DurationField durationField16 = copticChronology7.seconds();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology7.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology7.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField20 = copticChronology19.seconds();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = copticChronology19.add(readablePeriod21, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        long long28 = copticChronology19.add(readablePeriod25, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone29 = copticChronology19.getZone();
        long long32 = dateTimeZone29.adjustOffset(10L, true);
        int int34 = dateTimeZone29.getOffsetFromLocal((long) 'a');
        org.joda.time.Chronology chronology35 = copticChronology7.withZone(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone36 = copticChronology7.getZone();
        long long38 = dateTimeZone36.convertUTCToLocal((-360000002L));
        org.joda.time.ReadableInstant readableInstant39 = null;
        int int40 = dateTimeZone36.getOffset(readableInstant39);
        int int42 = dateTimeZone36.getOffset(74100052L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField16", (durationField1.compareTo(durationField16) == 0) == durationField1.equals(durationField16));
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0842");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DurationField durationField4 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.hours();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = copticChronology0.add(readablePeriod8, (long) 35, (int) (short) 10);
        java.lang.String str12 = copticChronology0.toString();
        org.joda.time.DurationField durationField13 = copticChronology0.centuries();
        org.joda.time.DurationField durationField14 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField1, and durationField2", !(durationField14.compareTo(durationField1) == 0) || (Math.signum(durationField14.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0843");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DurationField durationField4 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField10 = copticChronology0.millis();
        org.joda.time.DurationField durationField11 = copticChronology0.years();
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField1, and durationField2", !(durationField12.compareTo(durationField1) == 0) || (Math.signum(durationField12.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0844");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DurationField durationField4 = copticChronology0.minutes();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        org.joda.time.DurationField durationField6 = copticChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField5", Math.signum(durationField4.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField4)));
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0845");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField16 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.clockhourOfHalfday();
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField19 = copticChronology18.seconds();
        org.joda.time.DurationField durationField20 = copticChronology18.years();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology22 = copticChronology18.withZone(dateTimeZone21);
        java.lang.String str24 = dateTimeZone21.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField26 = copticChronology25.millisOfSecond();
        org.joda.time.DurationField durationField27 = copticChronology25.centuries();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology25.monthOfYear();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology25.centuryOfEra();
        org.joda.time.DurationField durationField30 = copticChronology25.weekyears();
        boolean boolean31 = copticChronology0.equals((java.lang.Object) copticChronology25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField27", (durationField11.compareTo(durationField27) == 0) == durationField11.equals(durationField27));
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0846");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = copticChronology0.add(readablePeriod7, (long) 0, (int) (short) -1);
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField11", Math.signum(durationField3.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField3)));
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0847");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.yearOfEra();
        org.joda.time.Chronology chronology16 = copticChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology7.yearOfCentury();
        java.lang.String str18 = copticChronology7.toString();
        java.lang.String str19 = copticChronology7.toString();
        long long23 = copticChronology7.add(10L, (-82799999L), (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField24 = copticChronology7.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology7.clockhourOfDay();
        org.joda.time.DurationField durationField26 = copticChronology7.months();
        org.joda.time.DurationField durationField27 = copticChronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology7.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField27", (durationField2.compareTo(durationField27) == 0) == durationField2.equals(durationField27));
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0848");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = copticChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField12 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.hourOfHalfday();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField17 = copticChronology16.seconds();
        org.joda.time.DurationField durationField18 = copticChronology16.years();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology20 = copticChronology16.withZone(dateTimeZone19);
        java.lang.String str22 = dateTimeZone19.getNameKey((long) 1);
        int int24 = dateTimeZone19.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone19);
        boolean boolean27 = dateTimeZone19.isStandardOffset((long) (short) 10);
        long long30 = dateTimeZone19.adjustOffset(0L, false);
        org.joda.time.ReadableInstant readableInstant31 = null;
        int int32 = dateTimeZone19.getOffset(readableInstant31);
        org.joda.time.chrono.CopticChronology copticChronology33 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField34 = copticChronology33.seconds();
        org.joda.time.DurationField durationField35 = copticChronology33.hours();
        org.joda.time.DurationField durationField36 = copticChronology33.seconds();
        org.joda.time.DurationField durationField37 = copticChronology33.halfdays();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology33.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField39 = copticChronology33.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone40 = copticChronology33.getZone();
        long long42 = dateTimeZone19.getMillisKeepLocal(dateTimeZone40, 122421755709300000L);
        org.joda.time.Chronology chronology43 = copticChronology0.withZone(dateTimeZone40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField18", (durationField6.compareTo(durationField18) == 0) == durationField6.equals(durationField18));
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0849");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = copticChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.secondOfMinute();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField13 = copticChronology12.seconds();
        org.joda.time.DurationField durationField14 = copticChronology12.years();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology16 = copticChronology12.withZone(dateTimeZone15);
        java.lang.String str18 = dateTimeZone15.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField20 = copticChronology19.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology19.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology19.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology19.millisOfDay();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology19.secondOfDay();
        boolean boolean25 = copticChronology0.equals((java.lang.Object) dateTimeField24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField14", (durationField6.compareTo(durationField14) == 0) == durationField6.equals(durationField14));
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0850");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        java.lang.String str14 = copticChronology7.toString();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.yearOfEra();
        org.joda.time.DurationField durationField16 = copticChronology7.weekyears();
        org.joda.time.DurationField durationField17 = copticChronology7.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField16", (durationField2.compareTo(durationField16) == 0) == durationField2.equals(durationField16));
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0851");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = copticChronology2.seconds();
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology4.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology4.year();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField8 = copticChronology7.seconds();
        org.joda.time.DurationField durationField9 = copticChronology7.years();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology11 = copticChronology7.withZone(dateTimeZone10);
        java.lang.String str13 = dateTimeZone10.getNameKey((long) 1);
        org.joda.time.Chronology chronology14 = copticChronology4.withZone(dateTimeZone10);
        long long17 = dateTimeZone10.convertLocalToUTC((long) 0, true);
        long long19 = dateTimeZone10.convertUTCToLocal((long) (byte) 100);
        long long21 = dateTimeZone10.convertUTCToLocal((long) ' ');
        long long23 = dateTimeZone10.nextTransition((-359999989L));
        java.lang.String str24 = dateTimeZone10.toString();
        boolean boolean25 = dateTimeZone10.isFixed();
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone10.getShortName(6669748628135999975L, locale27);
        org.joda.time.Chronology chronology29 = copticChronology2.withZone(dateTimeZone10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField8", (durationField3.compareTo(durationField8) == 0) == durationField3.equals(durationField8));
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0852");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.monthOfYear();
        java.lang.String str3 = copticChronology0.toString();
        org.joda.time.DurationField durationField4 = copticChronology0.eras();
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField4", Math.signum(durationField1.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField1)));
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0853");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField9 = copticChronology0.seconds();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField5, and durationField7", !(durationField10.compareTo(durationField5) == 0) || (Math.signum(durationField10.compareTo(durationField7)) == Math.signum(durationField5.compareTo(durationField7))));
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0854");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField10 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.monthOfYear();
        long long15 = copticChronology0.add((long) (byte) 10, (long) ' ', (int) (short) 100);
        org.joda.time.DurationField durationField16 = copticChronology0.years();
        org.joda.time.DurationField durationField17 = copticChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField16", (durationField6.compareTo(durationField16) == 0) == durationField6.equals(durationField16));
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0855");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField9 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField9", (durationField7.compareTo(durationField9) == 0) == durationField7.equals(durationField9));
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0856");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField10 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.weekyearOfCentury();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField14 = copticChronology13.seconds();
        org.joda.time.DurationField durationField15 = copticChronology13.hours();
        org.joda.time.DurationField durationField16 = copticChronology13.minutes();
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField18 = copticChronology17.seconds();
        org.joda.time.DurationField durationField19 = copticChronology17.years();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology21 = copticChronology17.withZone(dateTimeZone20);
        java.lang.String str23 = dateTimeZone20.getNameKey((long) 1);
        int int25 = dateTimeZone20.getStandardOffset((long) (short) 0);
        org.joda.time.Chronology chronology26 = copticChronology13.withZone(dateTimeZone20);
        java.lang.String str28 = dateTimeZone20.getNameKey(97L);
        long long30 = dateTimeZone20.convertUTCToLocal((-82799999L));
        java.lang.String str32 = dateTimeZone20.getName((long) (short) 100);
        org.joda.time.Chronology chronology33 = copticChronology0.withZone(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField19", (durationField6.compareTo(durationField19) == 0) == durationField6.equals(durationField19));
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0857");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField9 = copticChronology0.years();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField4", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0858");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 359999999L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = copticChronology11.eras();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology11.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField12", Math.signum(durationField1.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField1)));
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0859");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField5 = copticChronology0.weeks();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology6.secondOfMinute();
        org.joda.time.DurationField durationField9 = copticChronology6.halfdays();
        org.joda.time.DurationField durationField10 = copticChronology6.months();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology6.halfdayOfDay();
        org.joda.time.DurationField durationField12 = copticChronology6.weekyears();
        java.lang.Object obj13 = null;
        boolean boolean14 = copticChronology6.equals(obj13);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology6.era();
        org.joda.time.Chronology chronology16 = copticChronology6.withUTC();
        org.joda.time.DateTimeZone dateTimeZone17 = copticChronology6.getZone();
        org.joda.time.Chronology chronology18 = copticChronology0.withZone(dateTimeZone17);
        org.joda.time.DurationField durationField19 = chronology18.seconds();
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField21 = copticChronology20.seconds();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology20.weekyearOfCentury();
        org.joda.time.DurationField durationField23 = copticChronology20.days();
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology24.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone26 = copticChronology24.getZone();
        org.joda.time.DurationField durationField27 = copticChronology24.days();
        org.joda.time.chrono.CopticChronology copticChronology28 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField29 = copticChronology28.seconds();
        org.joda.time.DurationField durationField30 = copticChronology28.years();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology32 = copticChronology28.withZone(dateTimeZone31);
        java.lang.String str34 = dateTimeZone31.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology35 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone31);
        org.joda.time.Chronology chronology36 = copticChronology24.withZone(dateTimeZone31);
        org.joda.time.Chronology chronology37 = copticChronology20.withZone(dateTimeZone31);
        java.lang.String str39 = dateTimeZone31.getName((-82800000L));
        org.joda.time.Chronology chronology40 = chronology18.withZone(dateTimeZone31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField30", (durationField12.compareTo(durationField30) == 0) == durationField12.equals(durationField30));
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0860");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField2 = copticChronology0.eras();
        java.lang.String str3 = copticChronology0.toString();
        org.joda.time.DurationField durationField4 = copticChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField4, and durationField2", !(durationField2.compareTo(durationField4) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField4.compareTo(durationField2))));
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0861");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField6", Math.signum(durationField3.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField3)));
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0862");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.millisOfDay();
        org.joda.time.Chronology chronology10 = copticChronology8.withUTC();
        org.joda.time.DurationField durationField11 = copticChronology8.weeks();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology8.monthOfYear();
        org.joda.time.DurationField durationField13 = copticChronology8.weekyears();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology14.weekyear();
        org.joda.time.DurationField durationField17 = copticChronology14.hours();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology14.dayOfMonth();
        org.joda.time.DurationField durationField19 = copticChronology14.halfdays();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology14.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology14.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology14.yearOfEra();
        long long26 = copticChronology14.add(58L, 10L, 3600000);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean28 = dateTimeZone27.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        long long31 = dateTimeZone27.convertUTCToLocal((-100L));
        org.joda.time.chrono.CopticChronology copticChronology32 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone27);
        long long36 = dateTimeZone27.convertLocalToUTC((long) (short) 1, false, 36000035L);
        int int38 = dateTimeZone27.getStandardOffset((-8092799890L));
        long long40 = dateTimeZone27.nextTransition(322080001L);
        org.joda.time.chrono.CopticChronology copticChronology41 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField42 = copticChronology41.seconds();
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        long long46 = copticChronology41.add(readablePeriod43, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        long long50 = copticChronology41.add(readablePeriod47, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField51 = copticChronology41.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone52 = copticChronology41.getZone();
        long long54 = dateTimeZone52.nextTransition((long) (-1));
        java.util.TimeZone timeZone55 = dateTimeZone52.toTimeZone();
        boolean boolean56 = dateTimeZone27.equals((java.lang.Object) dateTimeZone52);
        org.joda.time.Chronology chronology57 = copticChronology14.withZone(dateTimeZone52);
        org.joda.time.DurationField durationField58 = copticChronology14.years();
        org.joda.time.DateTimeZone dateTimeZone59 = copticChronology14.getZone();
        org.joda.time.Chronology chronology60 = copticChronology8.withZone(dateTimeZone59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField13", (durationField2.compareTo(durationField13) == 0) == durationField2.equals(durationField13));
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0863");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = copticChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField15 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField3, and durationField4", !(durationField15.compareTo(durationField3) == 0) || (Math.signum(durationField15.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0864");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = copticChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.era();
        org.joda.time.DurationField durationField10 = copticChronology0.centuries();
        org.joda.time.DurationField durationField11 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField13 = copticChronology0.years();
        java.lang.String str14 = copticChronology0.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField13", (durationField6.compareTo(durationField13) == 0) == durationField6.equals(durationField13));
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0865");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.era();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField6, and durationField3", !(durationField3.compareTo(durationField6) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField6.compareTo(durationField3))));
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0866");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = copticChronology3.seconds();
        org.joda.time.DurationField durationField5 = copticChronology3.years();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = copticChronology3.withZone(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone6.getName(0L, locale12);
        org.joda.time.Chronology chronology14 = copticChronology0.withZone(dateTimeZone6);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = copticChronology0.add(readablePeriod15, 359999900L, (int) (byte) 1);
        int int19 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology20.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology20.secondOfMinute();
        org.joda.time.DurationField durationField23 = copticChronology20.halfdays();
        org.joda.time.DurationField durationField24 = copticChronology20.months();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology20.halfdayOfDay();
        org.joda.time.DurationField durationField26 = copticChronology20.weekyears();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology20.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology20.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology20.dayOfYear();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology20.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology20.year();
        org.joda.time.DateTimeZone dateTimeZone32 = copticChronology20.getZone();
        boolean boolean33 = copticChronology0.equals((java.lang.Object) copticChronology20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField26", (durationField5.compareTo(durationField26) == 0) == durationField5.equals(durationField26));
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0867");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField6, and durationField3", !(durationField3.compareTo(durationField6) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField6.compareTo(durationField3))));
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0868");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.Chronology chronology4 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField2", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0869");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology8.getZone();
        org.joda.time.DurationField durationField11 = copticChronology8.months();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology8.weekyear();
        org.joda.time.DurationField durationField13 = copticChronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField1, and durationField2", !(durationField13.compareTo(durationField1) == 0) || (Math.signum(durationField13.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0870");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = copticChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField12 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField14 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField3, and durationField4", !(durationField14.compareTo(durationField3) == 0) || (Math.signum(durationField14.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0871");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField10 = copticChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField10, and durationField3", !(durationField3.compareTo(durationField10) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField10.compareTo(durationField3))));
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0872");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology5.millisOfDay();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField8 = copticChronology7.seconds();
        org.joda.time.DurationField durationField9 = copticChronology7.years();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology11 = copticChronology7.withZone(dateTimeZone10);
        boolean boolean12 = dateTimeZone10.isFixed();
        java.lang.String str13 = dateTimeZone10.getID();
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone10, 4);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology15.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone17 = copticChronology15.getZone();
        java.lang.String str18 = copticChronology15.toString();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology15.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone20 = copticChronology15.getZone();
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone20);
        org.joda.time.DurationField durationField22 = copticChronology21.seconds();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology21.clockhourOfDay();
        boolean boolean24 = copticChronology5.equals((java.lang.Object) copticChronology21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField22", (durationField1.compareTo(durationField22) == 0) == durationField1.equals(durationField22));
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0873");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology12.getZone();
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) copticChronology12);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DurationField durationField19 = copticChronology18.seconds();
        org.joda.time.DateTimeZone dateTimeZone20 = copticChronology18.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField19", (durationField1.compareTo(durationField19) == 0) == durationField1.equals(durationField19));
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0874");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField16 = copticChronology7.years();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = copticChronology7.add(readablePeriod17, (long) '#', (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology7.yearOfEra();
        org.joda.time.DurationField durationField22 = copticChronology7.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField16", (durationField2.compareTo(durationField16) == 0) == durationField2.equals(durationField16));
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0875");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.millis();
        org.joda.time.DurationField durationField3 = copticChronology0.hours();
        org.joda.time.DurationField durationField4 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology6.getZone();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology6.dayOfYear();
        int int10 = copticChronology6.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology6.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology6.clockhourOfDay();
        org.joda.time.DurationField durationField13 = copticChronology6.minutes();
        boolean boolean14 = copticChronology0.equals((java.lang.Object) copticChronology6);
        org.joda.time.DurationField durationField15 = copticChronology0.seconds();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology16.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology16.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology16.weekyear();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology16.yearOfEra();
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField22 = copticChronology21.seconds();
        org.joda.time.DurationField durationField23 = copticChronology21.years();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology25 = copticChronology21.withZone(dateTimeZone24);
        java.lang.String str27 = dateTimeZone24.getNameKey((long) 1);
        int int29 = dateTimeZone24.getStandardOffset((long) (short) 0);
        org.joda.time.Chronology chronology30 = copticChronology16.withZone(dateTimeZone24);
        org.joda.time.chrono.CopticChronology copticChronology31 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology31.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology31.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.Chronology chronology35 = copticChronology31.withZone(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField36 = copticChronology31.year();
        org.joda.time.DurationField durationField37 = copticChronology31.months();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology31.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField39 = copticChronology31.yearOfEra();
        int int40 = copticChronology31.getMinimumDaysInFirstWeek();
        boolean boolean42 = copticChronology31.equals((java.lang.Object) 999L);
        org.joda.time.DurationField durationField43 = copticChronology31.weekyears();
        boolean boolean44 = dateTimeZone24.equals((java.lang.Object) durationField43);
        org.joda.time.Chronology chronology45 = copticChronology0.withZone(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField43", (durationField23.compareTo(durationField43) == 0) == durationField23.equals(durationField43));
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0876");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.monthOfYear();
        org.joda.time.DurationField durationField10 = copticChronology7.centuries();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.dayOfMonth();
        org.joda.time.DurationField durationField12 = copticChronology7.millis();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology13.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology13.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology13.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology13.minuteOfHour();
        org.joda.time.DurationField durationField19 = copticChronology13.millis();
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField21 = copticChronology20.seconds();
        org.joda.time.DurationField durationField22 = copticChronology20.years();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology24 = copticChronology20.withZone(dateTimeZone23);
        boolean boolean25 = dateTimeZone23.isFixed();
        java.lang.String str26 = dateTimeZone23.getID();
        org.joda.time.Chronology chronology27 = copticChronology13.withZone(dateTimeZone23);
        boolean boolean28 = dateTimeZone23.isFixed();
        org.joda.time.Chronology chronology29 = copticChronology7.withZone(dateTimeZone23);
        org.joda.time.DurationField durationField30 = copticChronology7.halfdays();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology7.weekyear();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology7.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField19", (durationField12.compareTo(durationField19) == 0) == durationField12.equals(durationField19));
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0877");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.year();
        java.lang.String str7 = copticChronology0.toString();
        org.joda.time.DurationField durationField8 = copticChronology0.days();
        org.joda.time.DurationField durationField9 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.weekyear();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField13 = copticChronology12.seconds();
        org.joda.time.DurationField durationField14 = copticChronology12.years();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology16 = copticChronology12.withZone(dateTimeZone15);
        java.lang.String str18 = dateTimeZone15.getNameKey((long) 1);
        int int20 = dateTimeZone15.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        boolean boolean23 = dateTimeZone15.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology24.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone26 = copticChronology24.getZone();
        boolean boolean27 = dateTimeZone15.equals((java.lang.Object) copticChronology24);
        org.joda.time.DateTimeField dateTimeField28 = copticChronology24.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology24.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone30.getShortName((long) ' ', locale32);
        long long35 = dateTimeZone30.previousTransition((long) (byte) 100);
        long long39 = dateTimeZone30.convertLocalToUTC((long) (short) 100, false, (long) 360000000);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours(100);
        long long43 = dateTimeZone41.convertUTCToLocal((-1L));
        long long45 = dateTimeZone30.getMillisKeepLocal(dateTimeZone41, (long) ' ');
        boolean boolean47 = dateTimeZone30.isStandardOffset(359999999L);
        org.joda.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = dateTimeZone30.isLocalDateTimeGap(localDateTime48);
        org.joda.time.Chronology chronology50 = copticChronology24.withZone(dateTimeZone30);
        org.joda.time.Chronology chronology51 = copticChronology0.withZone(dateTimeZone30);
        org.joda.time.DurationField durationField52 = copticChronology0.years();
        org.joda.time.DurationField durationField53 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField53, durationField3, and durationField4", !(durationField53.compareTo(durationField3) == 0) || (Math.signum(durationField53.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0878");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = copticChronology11.seconds();
        org.joda.time.DurationField durationField13 = copticChronology11.years();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology15 = copticChronology11.withZone(dateTimeZone14);
        java.lang.String str17 = dateTimeZone14.getNameKey((long) 1);
        java.lang.String str19 = dateTimeZone14.getName((-1L));
        org.joda.time.Chronology chronology20 = copticChronology0.withZone(dateTimeZone14);
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone14);
        org.joda.time.DurationField durationField22 = copticChronology21.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField1, and durationField2", !(durationField22.compareTo(durationField1) == 0) || (Math.signum(durationField22.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0879");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField9 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField10 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.yearOfEra();
        int int12 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone13 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField15 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField6, and durationField9", !(durationField15.compareTo(durationField6) == 0) || (Math.signum(durationField15.compareTo(durationField9)) == Math.signum(durationField6.compareTo(durationField9))));
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0880");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField3 = copticChronology0.hours();
        org.joda.time.DurationField durationField4 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField3, and durationField4", !(durationField8.compareTo(durationField3) == 0) || (Math.signum(durationField8.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0881");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField6 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.era();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.Chronology chronology9 = copticChronology0.withUTC();
        java.lang.String str10 = copticChronology0.toString();
        java.lang.String str11 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField8", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField8)) == Math.signum(durationField3.compareTo(durationField8))));
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0882");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = copticChronology0.getZone();
        java.lang.String str5 = copticChronology0.toString();
        java.lang.Object obj6 = null;
        boolean boolean7 = copticChronology0.equals(obj6);
        long long11 = copticChronology0.add((-82800000L), 52L, (int) '4');
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField1, and durationField2", !(durationField13.compareTo(durationField1) == 0) || (Math.signum(durationField13.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0883");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.era();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours(100);
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = copticChronology11.seconds();
        org.joda.time.DurationField durationField13 = copticChronology11.years();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology11.yearOfCentury();
        org.joda.time.DurationField durationField15 = copticChronology11.seconds();
        org.joda.time.DurationField durationField16 = copticChronology11.centuries();
        boolean boolean17 = dateTimeZone10.equals((java.lang.Object) copticChronology11);
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology18.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology18.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.Chronology chronology22 = copticChronology18.withZone(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = copticChronology18.year();
        org.joda.time.DateTimeZone dateTimeZone24 = copticChronology18.getZone();
        long long28 = dateTimeZone24.convertLocalToUTC(100L, false, 1L);
        java.lang.String str29 = dateTimeZone24.getID();
        org.joda.time.Chronology chronology30 = copticChronology11.withZone(dateTimeZone24);
        java.lang.String str32 = dateTimeZone24.getName((long) (byte) 0);
        org.joda.time.Chronology chronology33 = copticChronology0.withZone(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField34 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone35 = copticChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone36 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField38 = copticChronology0.years();
        org.joda.time.DurationField durationField39 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField40 = copticChronology0.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField39", (durationField13.compareTo(durationField39) == 0) == durationField13.equals(durationField39));
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0884");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DurationField durationField4 = copticChronology0.eras();
        org.joda.time.DurationField durationField5 = copticChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField4", Math.signum(durationField3.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField3)));
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0885");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology12.getZone();
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) copticChronology12);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        java.lang.String str18 = copticChronology17.toString();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology17.hourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology17.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = copticChronology17.seconds();
        org.joda.time.DurationField durationField22 = copticChronology17.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField22", (durationField1.compareTo(durationField22) == 0) == durationField1.equals(durationField22));
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0886");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.year();
        java.lang.String str7 = copticChronology0.toString();
        org.joda.time.DurationField durationField8 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.secondOfDay();
        int int12 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField13 = copticChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forID("UTC");
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology16.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology16.year();
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField20 = copticChronology19.seconds();
        org.joda.time.DurationField durationField21 = copticChronology19.years();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology23 = copticChronology19.withZone(dateTimeZone22);
        java.lang.String str25 = dateTimeZone22.getNameKey((long) 1);
        org.joda.time.Chronology chronology26 = copticChronology16.withZone(dateTimeZone22);
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField28 = copticChronology27.seconds();
        org.joda.time.DurationField durationField29 = copticChronology27.years();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology31 = copticChronology27.withZone(dateTimeZone30);
        java.lang.String str33 = dateTimeZone30.getNameKey((long) 1);
        int int35 = dateTimeZone30.getStandardOffset((long) (short) 0);
        long long37 = dateTimeZone22.getMillisKeepLocal(dateTimeZone30, (long) (short) 10);
        long long40 = dateTimeZone30.adjustOffset((-82799999L), true);
        org.joda.time.chrono.CopticChronology copticChronology41 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField42 = copticChronology41.seconds();
        org.joda.time.DurationField durationField43 = copticChronology41.years();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology45 = copticChronology41.withZone(dateTimeZone44);
        boolean boolean46 = dateTimeZone44.isFixed();
        java.lang.String str47 = dateTimeZone44.getID();
        org.joda.time.chrono.CopticChronology copticChronology49 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone44, 4);
        org.joda.time.DateTimeField dateTimeField50 = copticChronology49.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone51 = copticChronology49.getZone();
        long long53 = dateTimeZone30.getMillisKeepLocal(dateTimeZone51, 3600001L);
        boolean boolean54 = dateTimeZone15.equals((java.lang.Object) 3600001L);
        java.lang.String str55 = dateTimeZone15.toString();
        org.joda.time.Chronology chronology56 = copticChronology0.withZone(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField21", (durationField13.compareTo(durationField21) == 0) == durationField13.equals(durationField21));
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0887");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.DurationField durationField3 = copticChronology0.hours();
        java.lang.String str4 = copticChronology0.toString();
        org.joda.time.DurationField durationField5 = copticChronology0.minutes();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfMonth();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.Chronology chronology9 = copticChronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.clockhourOfHalfday();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = copticChronology11.seconds();
        org.joda.time.DurationField durationField13 = copticChronology11.years();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology15 = copticChronology11.withZone(dateTimeZone14);
        java.lang.String str17 = dateTimeZone14.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone14);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone14.getName(0L, locale20);
        org.joda.time.Chronology chronology22 = copticChronology8.withZone(dateTimeZone14);
        java.lang.String str23 = copticChronology8.toString();
        org.joda.time.DateTimeZone dateTimeZone24 = copticChronology8.getZone();
        org.joda.time.Chronology chronology25 = copticChronology0.withZone(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField13", (durationField6.compareTo(durationField13) == 0) == durationField6.equals(durationField13));
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0888");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = copticChronology0.hours();
        java.lang.String str6 = copticChronology0.toString();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField7", Math.signum(durationField5.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField5)));
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0889");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.minutes();
        org.joda.time.DurationField durationField4 = copticChronology0.centuries();
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.year();
        org.joda.time.DurationField durationField8 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField2", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0890");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField6 = copticChronology0.millis();
        org.joda.time.DurationField durationField7 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField10 = copticChronology0.millis();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField1, and durationField6", !(durationField11.compareTo(durationField1) == 0) || (Math.signum(durationField11.compareTo(durationField6)) == Math.signum(durationField1.compareTo(durationField6))));
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0891");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.hourOfHalfday();
        long long13 = copticChronology8.add((long) ' ', 359999999L, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology8.clockhourOfDay();
        org.joda.time.DurationField durationField15 = copticChronology8.months();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology8.minuteOfHour();
        org.joda.time.DurationField durationField18 = copticChronology8.seconds();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology8.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = copticChronology8.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField18", (durationField1.compareTo(durationField18) == 0) == durationField1.equals(durationField18));
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0892");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.year();
        org.joda.time.DurationField durationField15 = copticChronology0.eras();
        org.joda.time.DurationField durationField16 = copticChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField15", Math.signum(durationField11.compareTo(durationField15)) == -Math.signum(durationField15.compareTo(durationField11)));
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0893");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 359999999L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = copticChronology11.eras();
        org.joda.time.DurationField durationField13 = copticChronology11.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField12", Math.signum(durationField1.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField1)));
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0894");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        long long9 = copticChronology0.add((long) 100, (long) (-1), 10);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = copticChronology0.add(readablePeriod11, 90L, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = copticChronology0.add(readablePeriod15, 3210L, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField20 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField22 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField3, and durationField20", !(durationField22.compareTo(durationField3) == 0) || (Math.signum(durationField22.compareTo(durationField20)) == Math.signum(durationField3.compareTo(durationField20))));
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0895");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.era();
        java.lang.String str4 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.joda.time.DurationField durationField7 = copticChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField6", Math.signum(durationField1.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField1)));
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0896");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        long long11 = dateTimeZone3.adjustOffset((long) (short) 10, false);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((-11519999459996L), locale13);
        int int16 = dateTimeZone3.getOffset((long) (short) -1);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone3.isLocalDateTimeGap(localDateTime17);
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField20 = copticChronology19.seconds();
        org.joda.time.DurationField durationField21 = copticChronology19.years();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology23 = copticChronology19.withZone(dateTimeZone22);
        java.lang.String str25 = dateTimeZone22.getNameKey((long) 1);
        int int27 = dateTimeZone22.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone22);
        boolean boolean30 = dateTimeZone22.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology31 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology31.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone33 = copticChronology31.getZone();
        boolean boolean34 = dateTimeZone22.equals((java.lang.Object) copticChronology31);
        boolean boolean35 = dateTimeZone22.isFixed();
        org.joda.time.ReadableInstant readableInstant36 = null;
        int int37 = dateTimeZone22.getOffset(readableInstant36);
        long long39 = dateTimeZone22.nextTransition((long) 0);
        long long41 = dateTimeZone3.getMillisKeepLocal(dateTimeZone22, 33001035L);
        org.joda.time.chrono.CopticChronology copticChronology42 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField43 = copticChronology42.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField44 = copticChronology42.secondOfMinute();
        org.joda.time.DurationField durationField45 = copticChronology42.halfdays();
        org.joda.time.DurationField durationField46 = copticChronology42.months();
        org.joda.time.DateTimeField dateTimeField47 = copticChronology42.halfdayOfDay();
        org.joda.time.DurationField durationField48 = copticChronology42.weekyears();
        java.lang.Object obj49 = null;
        boolean boolean50 = copticChronology42.equals(obj49);
        org.joda.time.DateTimeField dateTimeField51 = copticChronology42.yearOfCentury();
        org.joda.time.DurationField durationField52 = copticChronology42.seconds();
        int int53 = copticChronology42.getMinimumDaysInFirstWeek();
        boolean boolean54 = dateTimeZone3.equals((java.lang.Object) int53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField48", (durationField2.compareTo(durationField48) == 0) == durationField2.equals(durationField48));
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0897");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.centuries();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 0);
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField12 = copticChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone13 = copticChronology0.getZone();
        boolean boolean14 = dateTimeZone13.isFixed();
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField16 = copticChronology15.seconds();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = copticChronology15.add(readablePeriod17, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = copticChronology15.add(readablePeriod21, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField25 = copticChronology15.minuteOfDay();
        org.joda.time.DurationField durationField26 = copticChronology15.centuries();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology15.minuteOfHour();
        org.joda.time.DurationField durationField28 = copticChronology15.halfdays();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology15.hourOfDay();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology15.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology15.era();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        boolean boolean35 = dateTimeZone33.isStandardOffset(189300000L);
        org.joda.time.Chronology chronology36 = copticChronology15.withZone(dateTimeZone33);
        boolean boolean37 = dateTimeZone33.isFixed();
        long long40 = dateTimeZone33.adjustOffset(98L, true);
        long long42 = dateTimeZone13.getMillisKeepLocal(dateTimeZone33, 189300052L);
        org.joda.time.chrono.CopticChronology copticChronology43 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField44 = copticChronology43.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField45 = copticChronology43.secondOfMinute();
        org.joda.time.DurationField durationField46 = copticChronology43.halfdays();
        org.joda.time.DurationField durationField47 = copticChronology43.months();
        org.joda.time.DateTimeField dateTimeField48 = copticChronology43.halfdayOfDay();
        org.joda.time.DurationField durationField49 = copticChronology43.weekyears();
        org.joda.time.DurationField durationField50 = copticChronology43.centuries();
        org.joda.time.DateTimeField dateTimeField51 = copticChronology43.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone52 = copticChronology43.getZone();
        long long56 = dateTimeZone52.convertLocalToUTC((-323999968L), true, (-115084794599L));
        boolean boolean57 = dateTimeZone33.equals((java.lang.Object) (-323999968L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField49", (durationField2.compareTo(durationField49) == 0) == durationField2.equals(durationField49));
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0898");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = copticChronology3.seconds();
        org.joda.time.DurationField durationField5 = copticChronology3.years();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = copticChronology3.withZone(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getNameKey((long) 1);
        org.joda.time.Chronology chronology10 = copticChronology0.withZone(dateTimeZone6);
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = copticChronology11.seconds();
        org.joda.time.DurationField durationField13 = copticChronology11.years();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology15 = copticChronology11.withZone(dateTimeZone14);
        java.lang.String str17 = dateTimeZone14.getNameKey((long) 1);
        int int19 = dateTimeZone14.getStandardOffset((long) (short) 0);
        long long21 = dateTimeZone6.getMillisKeepLocal(dateTimeZone14, (long) (short) 10);
        long long24 = dateTimeZone14.adjustOffset((-82799999L), true);
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField26 = copticChronology25.seconds();
        org.joda.time.DurationField durationField27 = copticChronology25.years();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology29 = copticChronology25.withZone(dateTimeZone28);
        boolean boolean30 = dateTimeZone28.isFixed();
        java.lang.String str31 = dateTimeZone28.getID();
        org.joda.time.chrono.CopticChronology copticChronology33 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone28, 4);
        org.joda.time.DateTimeField dateTimeField34 = copticChronology33.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone35 = copticChronology33.getZone();
        long long37 = dateTimeZone14.getMillisKeepLocal(dateTimeZone35, 3600001L);
        org.joda.time.chrono.CopticChronology copticChronology38 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone35);
        java.lang.String str40 = dateTimeZone35.getShortName((-3600000L));
        long long42 = dateTimeZone35.nextTransition((-125861988935L));
        org.joda.time.chrono.CopticChronology copticChronology43 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField44 = copticChronology43.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField45 = copticChronology43.secondOfMinute();
        org.joda.time.DurationField durationField46 = copticChronology43.halfdays();
        org.joda.time.DurationField durationField47 = copticChronology43.months();
        org.joda.time.DateTimeField dateTimeField48 = copticChronology43.halfdayOfDay();
        org.joda.time.DurationField durationField49 = copticChronology43.weekyears();
        org.joda.time.DurationField durationField50 = copticChronology43.centuries();
        org.joda.time.DurationField durationField51 = copticChronology43.millis();
        org.joda.time.DurationField durationField52 = copticChronology43.seconds();
        org.joda.time.DateTimeField dateTimeField53 = copticChronology43.yearOfCentury();
        boolean boolean54 = dateTimeZone35.equals((java.lang.Object) copticChronology43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField49", (durationField5.compareTo(durationField49) == 0) == durationField5.equals(durationField49));
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0899");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        long long9 = copticChronology0.add((long) 100, (long) (-1), 10);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        int int12 = copticChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField11", Math.signum(durationField3.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField3)));
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0900");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 35L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField1, and durationField2", !(durationField11.compareTo(durationField1) == 0) || (Math.signum(durationField11.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0901");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField2", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0902");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = copticChronology0.weeks();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = copticChronology10.seconds();
        org.joda.time.DurationField durationField12 = copticChronology10.years();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology10.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology10.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology10.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours(100);
        boolean boolean18 = dateTimeZone17.isFixed();
        int int20 = dateTimeZone17.getOffsetFromLocal((long) 0);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone17.getShortName((-359999989L), locale22);
        java.lang.String str24 = dateTimeZone17.toString();
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology25.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone27 = copticChronology25.getZone();
        boolean boolean28 = dateTimeZone27.isFixed();
        long long30 = dateTimeZone17.getMillisKeepLocal(dateTimeZone27, (long) (-1));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        java.util.TimeZone timeZone32 = dateTimeZone17.toTimeZone();
        org.joda.time.Chronology chronology33 = copticChronology10.withZone(dateTimeZone17);
        org.joda.time.Chronology chronology34 = copticChronology0.withZone(dateTimeZone17);
        org.joda.time.DurationField durationField35 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField35, durationField3, and durationField7", !(durationField35.compareTo(durationField3) == 0) || (Math.signum(durationField35.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0903");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology8.getZone();
        java.lang.String str11 = copticChronology8.toString();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology8.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone13 = copticChronology8.getZone();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology8.weekOfWeekyear();
        org.joda.time.DurationField durationField16 = copticChronology8.years();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology8.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField16", (durationField2.compareTo(durationField16) == 0) == durationField2.equals(durationField16));
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0904");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField9 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField10 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField6, and durationField9", !(durationField12.compareTo(durationField6) == 0) || (Math.signum(durationField12.compareTo(durationField9)) == Math.signum(durationField6.compareTo(durationField9))));
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0905");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField9 = copticChronology0.hours();
        org.joda.time.DurationField durationField10 = copticChronology0.years();
        org.joda.time.DurationField durationField11 = copticChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField10", (durationField8.compareTo(durationField10) == 0) == durationField8.equals(durationField10));
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0906");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfEra();
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = copticChronology5.seconds();
        org.joda.time.DurationField durationField7 = copticChronology5.years();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology9 = copticChronology5.withZone(dateTimeZone8);
        java.lang.String str11 = dateTimeZone8.getNameKey((long) 1);
        int int13 = dateTimeZone8.getStandardOffset((long) (short) 0);
        org.joda.time.Chronology chronology14 = copticChronology0.withZone(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField16 = copticChronology0.weeks();
        org.joda.time.DurationField durationField17 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField17", (durationField7.compareTo(durationField17) == 0) == durationField7.equals(durationField17));
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0907");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) 1, (int) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.year();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = copticChronology10.seconds();
        org.joda.time.DurationField durationField12 = copticChronology10.years();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology14 = copticChronology10.withZone(dateTimeZone13);
        java.lang.String str16 = dateTimeZone13.getNameKey((long) 1);
        org.joda.time.Chronology chronology17 = copticChronology7.withZone(dateTimeZone13);
        long long20 = dateTimeZone13.convertLocalToUTC((long) 0, true);
        long long22 = dateTimeZone13.convertUTCToLocal((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        long long26 = dateTimeZone13.getMillisKeepLocal(dateTimeZone24, (long) 100);
        org.joda.time.Chronology chronology27 = copticChronology0.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField28 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField29 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology0.millisOfDay();
        long long34 = copticChronology0.add(9843603175L, (long) '4', 3600000);
        org.joda.time.DateTimeField dateTimeField35 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField39 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField40 = copticChronology0.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField39", (durationField2.compareTo(durationField39) == 0) == durationField2.equals(durationField39));
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0908");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.era();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours(100);
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = copticChronology11.seconds();
        org.joda.time.DurationField durationField13 = copticChronology11.years();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology11.yearOfCentury();
        org.joda.time.DurationField durationField15 = copticChronology11.seconds();
        org.joda.time.DurationField durationField16 = copticChronology11.centuries();
        boolean boolean17 = dateTimeZone10.equals((java.lang.Object) copticChronology11);
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology18.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology18.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.Chronology chronology22 = copticChronology18.withZone(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = copticChronology18.year();
        org.joda.time.DateTimeZone dateTimeZone24 = copticChronology18.getZone();
        long long28 = dateTimeZone24.convertLocalToUTC(100L, false, 1L);
        java.lang.String str29 = dateTimeZone24.getID();
        org.joda.time.Chronology chronology30 = copticChronology11.withZone(dateTimeZone24);
        java.lang.String str32 = dateTimeZone24.getName((long) (byte) 0);
        org.joda.time.Chronology chronology33 = copticChronology0.withZone(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField34 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField36 = copticChronology0.months();
        org.joda.time.DurationField durationField37 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField37, durationField3, and durationField6", !(durationField37.compareTo(durationField3) == 0) || (Math.signum(durationField37.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0909");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DurationField durationField4 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField9 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.halfdayOfDay();
        java.lang.String str11 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField1, and durationField2", !(durationField13.compareTo(durationField1) == 0) || (Math.signum(durationField13.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0910");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField8 = copticChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField7", (durationField2.compareTo(durationField7) == 0) == durationField2.equals(durationField7));
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0911");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.Chronology chronology2 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.minutes();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField3, and durationField4", !(durationField5.compareTo(durationField3) == 0) || (Math.signum(durationField5.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0912");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField5 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField9 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField11", (durationField2.compareTo(durationField11) == 0) == durationField2.equals(durationField11));
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0913");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DurationField durationField5 = copticChronology0.minutes();
        org.joda.time.DurationField durationField6 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.year();
        org.joda.time.DurationField durationField10 = copticChronology0.minutes();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField4", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0914");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.year();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology1.getZone();
        long long11 = dateTimeZone7.convertLocalToUTC(100L, false, 1L);
        java.lang.String str12 = dateTimeZone7.getID();
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone7.getOffset(readableInstant13);
        org.joda.time.Chronology chronology15 = copticChronology0.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField16 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField20 = copticChronology0.millis();
        org.joda.time.DurationField durationField21 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField22 = copticChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField21", (durationField16.compareTo(durationField21) == 0) == durationField16.equals(durationField21));
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0915");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField17 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField17", Math.signum(durationField1.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField1)));
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0916");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField13 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.weekyearOfCentury();
        long long19 = copticChronology0.add(10L, 139L, (int) '4');
        org.joda.time.DurationField durationField20 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField1, and durationField11", !(durationField20.compareTo(durationField1) == 0) || (Math.signum(durationField20.compareTo(durationField11)) == Math.signum(durationField1.compareTo(durationField11))));
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0917");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DurationField durationField8 = copticChronology0.weeks();
        org.joda.time.DurationField durationField9 = copticChronology0.halfdays();
        long long13 = copticChronology0.add((-427799999L), 58L, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.yearOfEra();
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology15.secondOfMinute();
        org.joda.time.DurationField durationField18 = copticChronology15.halfdays();
        int int19 = copticChronology15.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology15.weekyear();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = copticChronology15.add(readablePeriod21, 5L, 4);
        org.joda.time.DateTimeField dateTimeField25 = copticChronology15.millisOfDay();
        org.joda.time.DurationField durationField26 = copticChronology15.years();
        int int27 = copticChronology15.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField28 = copticChronology15.millis();
        long long32 = copticChronology15.add((-82800000L), (-53175657599925L), (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField33 = copticChronology15.hourOfHalfday();
        boolean boolean34 = copticChronology0.equals((java.lang.Object) dateTimeField33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField26", (durationField6.compareTo(durationField26) == 0) == durationField6.equals(durationField26));
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0918");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) 1, (int) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.year();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = copticChronology10.seconds();
        org.joda.time.DurationField durationField12 = copticChronology10.years();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology14 = copticChronology10.withZone(dateTimeZone13);
        java.lang.String str16 = dateTimeZone13.getNameKey((long) 1);
        org.joda.time.Chronology chronology17 = copticChronology7.withZone(dateTimeZone13);
        long long20 = dateTimeZone13.convertLocalToUTC((long) 0, true);
        long long22 = dateTimeZone13.convertUTCToLocal((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        long long26 = dateTimeZone13.getMillisKeepLocal(dateTimeZone24, (long) 100);
        org.joda.time.Chronology chronology27 = copticChronology0.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField28 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField30 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField30, durationField2, and durationField11", !(durationField30.compareTo(durationField2) == 0) || (Math.signum(durationField30.compareTo(durationField11)) == Math.signum(durationField2.compareTo(durationField11))));
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0919");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone3.getShortName((long) ' ', locale5);
        org.joda.time.Chronology chronology7 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = copticChronology0.add(readablePeriod9, (-359999989L), 1);
        org.joda.time.DurationField durationField13 = copticChronology0.centuries();
        org.joda.time.DurationField durationField14 = copticChronology0.eras();
        org.joda.time.DurationField durationField15 = copticChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField14", Math.signum(durationField13.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField13)));
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0920");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(100);
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = copticChronology2.seconds();
        org.joda.time.DurationField durationField4 = copticChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.yearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology2.seconds();
        org.joda.time.DurationField durationField7 = copticChronology2.centuries();
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) copticChronology2);
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology9.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.Chronology chronology13 = copticChronology9.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology9.year();
        org.joda.time.DateTimeZone dateTimeZone15 = copticChronology9.getZone();
        long long19 = dateTimeZone15.convertLocalToUTC(100L, false, 1L);
        java.lang.String str20 = dateTimeZone15.getID();
        org.joda.time.Chronology chronology21 = copticChronology2.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField22 = copticChronology2.yearOfEra();
        org.joda.time.DurationField durationField23 = copticChronology2.years();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology2.minuteOfDay();
        org.joda.time.DurationField durationField25 = copticChronology2.weekyears();
        long long29 = copticChronology2.add((-114933594653L), 352803818L, (-5520000));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField25", (durationField4.compareTo(durationField25) == 0) == durationField4.equals(durationField25));
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0921");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField10 = copticChronology9.seconds();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = copticChronology9.add(readablePeriod11, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = copticChronology9.add(readablePeriod15, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone19 = copticChronology9.getZone();
        long long22 = dateTimeZone19.adjustOffset(10L, true);
        int int24 = dateTimeZone19.getOffsetFromLocal((long) 'a');
        org.joda.time.Chronology chronology25 = copticChronology0.withZone(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField26 = copticChronology0.secondOfMinute();
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField28 = copticChronology27.seconds();
        org.joda.time.DurationField durationField29 = copticChronology27.years();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology31 = copticChronology27.withZone(dateTimeZone30);
        boolean boolean32 = dateTimeZone30.isFixed();
        java.lang.String str33 = dateTimeZone30.getID();
        org.joda.time.chrono.CopticChronology copticChronology35 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone30, 4);
        long long39 = dateTimeZone30.convertLocalToUTC((long) (byte) 100, false, (long) ' ');
        org.joda.time.Chronology chronology40 = copticChronology0.withZone(dateTimeZone30);
        org.joda.time.DurationField durationField41 = copticChronology0.minutes();
        org.joda.time.DurationField durationField42 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField42, durationField6, and durationField8", !(durationField42.compareTo(durationField6) == 0) || (Math.signum(durationField42.compareTo(durationField8)) == Math.signum(durationField6.compareTo(durationField8))));
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0922");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField11 = copticChronology0.months();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology0.add(readablePeriod12, 90L, 100);
        org.joda.time.DurationField durationField16 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField18 = copticChronology0.months();
        org.joda.time.Chronology chronology19 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField20 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField21 = copticChronology0.halfdays();
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        java.util.TimeZone timeZone24 = dateTimeZone23.toTimeZone();
        java.lang.String str26 = dateTimeZone23.getName((long) (short) 0);
        java.lang.String str27 = dateTimeZone23.getID();
        long long29 = dateTimeZone23.nextTransition(1283039960400058L);
        org.joda.time.Chronology chronology30 = copticChronology0.withZone(dateTimeZone23);
        org.joda.time.chrono.CopticChronology copticChronology31 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology31.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology31.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.Chronology chronology35 = copticChronology31.withZone(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField36 = copticChronology31.year();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology31.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology31.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField39 = copticChronology31.monthOfYear();
        boolean boolean40 = dateTimeZone23.equals((java.lang.Object) copticChronology31);
        org.joda.time.chrono.CopticChronology copticChronology41 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField42 = copticChronology41.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone43 = copticChronology41.getZone();
        org.joda.time.DateTimeField dateTimeField44 = copticChronology41.dayOfYear();
        org.joda.time.DateTimeField dateTimeField45 = copticChronology41.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField46 = copticChronology41.weekyear();
        org.joda.time.DurationField durationField47 = copticChronology41.years();
        org.joda.time.Chronology chronology48 = copticChronology41.withUTC();
        org.joda.time.DateTimeField dateTimeField49 = copticChronology41.dayOfWeek();
        org.joda.time.DurationField durationField50 = copticChronology41.months();
        org.joda.time.Chronology chronology51 = copticChronology41.withUTC();
        boolean boolean52 = copticChronology31.equals((java.lang.Object) copticChronology41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField47", (durationField20.compareTo(durationField47) == 0) == durationField20.equals(durationField47));
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0923");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.clockhourOfDay();
        org.joda.time.DurationField durationField10 = copticChronology7.days();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology7.getZone();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology13.secondOfMinute();
        org.joda.time.DurationField durationField16 = copticChronology13.halfdays();
        org.joda.time.DurationField durationField17 = copticChronology13.months();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology13.year();
        java.lang.String str20 = copticChronology13.toString();
        org.joda.time.DurationField durationField21 = copticChronology13.days();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology13.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology13.monthOfYear();
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology25.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology25.secondOfMinute();
        org.joda.time.DurationField durationField28 = copticChronology25.halfdays();
        int int29 = copticChronology25.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField30 = copticChronology25.months();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology25.year();
        org.joda.time.DateTimeZone dateTimeZone32 = copticChronology25.getZone();
        java.lang.String str33 = dateTimeZone32.toString();
        org.joda.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = dateTimeZone32.isLocalDateTimeGap(localDateTime34);
        org.joda.time.Chronology chronology36 = copticChronology13.withZone(dateTimeZone32);
        org.joda.time.Chronology chronology37 = copticChronology7.withZone(dateTimeZone32);
        org.joda.time.DurationField durationField38 = copticChronology7.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField21", (durationField10.compareTo(durationField21) == 0) == durationField10.equals(durationField21));
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0924");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = copticChronology0.getZone();
        org.joda.time.DurationField durationField12 = copticChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField12, and durationField9", !(durationField9.compareTo(durationField12) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField12.compareTo(durationField9))));
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0925");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfMinute();
        long long12 = copticChronology0.add((-8092799815L), (-192899966L), (int) (short) 10);
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField4", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0926");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField16 = copticChronology0.hours();
        org.joda.time.DurationField durationField17 = copticChronology0.centuries();
        org.joda.time.Chronology chronology18 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.weekOfWeekyear();
        org.joda.time.DurationField durationField20 = chronology18.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField1, and durationField11", !(durationField20.compareTo(durationField1) == 0) || (Math.signum(durationField20.compareTo(durationField11)) == Math.signum(durationField1.compareTo(durationField11))));
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0927");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField12 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField13 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.weekOfWeekyear();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology16.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology16.secondOfMinute();
        org.joda.time.DurationField durationField19 = copticChronology16.halfdays();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology16.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology16.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology16.halfdayOfDay();
        org.joda.time.DurationField durationField23 = copticChronology16.years();
        org.joda.time.DurationField durationField24 = copticChronology16.days();
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology25.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology25.secondOfMinute();
        org.joda.time.DurationField durationField28 = copticChronology25.weeks();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology25.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology25.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone31 = copticChronology25.getZone();
        java.lang.String str32 = dateTimeZone31.toString();
        int int34 = dateTimeZone31.getStandardOffset((-241L));
        org.joda.time.Chronology chronology35 = copticChronology16.withZone(dateTimeZone31);
        long long38 = dateTimeZone31.convertLocalToUTC(35424398769240099L, false);
        org.joda.time.Chronology chronology39 = copticChronology0.withZone(dateTimeZone31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField23", (durationField13.compareTo(durationField23) == 0) == durationField13.equals(durationField23));
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0928");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.era();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField6, and durationField8", !(durationField10.compareTo(durationField6) == 0) || (Math.signum(durationField10.compareTo(durationField8)) == Math.signum(durationField6.compareTo(durationField8))));
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0929");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField5 = copticChronology0.minutes();
        org.joda.time.DurationField durationField6 = copticChronology0.years();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology0.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField7", (durationField2.compareTo(durationField7) == 0) == durationField2.equals(durationField7));
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0930");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.monthOfYear();
        org.joda.time.DurationField durationField10 = copticChronology7.centuries();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.dayOfMonth();
        org.joda.time.DurationField durationField12 = copticChronology7.millis();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology13.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology13.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology13.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology13.minuteOfHour();
        org.joda.time.DurationField durationField19 = copticChronology13.millis();
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField21 = copticChronology20.seconds();
        org.joda.time.DurationField durationField22 = copticChronology20.years();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology24 = copticChronology20.withZone(dateTimeZone23);
        boolean boolean25 = dateTimeZone23.isFixed();
        java.lang.String str26 = dateTimeZone23.getID();
        org.joda.time.Chronology chronology27 = copticChronology13.withZone(dateTimeZone23);
        boolean boolean28 = dateTimeZone23.isFixed();
        org.joda.time.Chronology chronology29 = copticChronology7.withZone(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField30 = chronology29.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField19", (durationField12.compareTo(durationField19) == 0) == durationField12.equals(durationField19));
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0931");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfDay();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField7 = copticChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField7, and durationField3", !(durationField3.compareTo(durationField7) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField7.compareTo(durationField3))));
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0932");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField6 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.era();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.Chronology chronology9 = copticChronology0.withUTC();
        java.lang.String str10 = copticChronology0.toString();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = copticChronology11.seconds();
        org.joda.time.DurationField durationField13 = copticChronology11.years();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology15 = copticChronology11.withZone(dateTimeZone14);
        java.lang.String str17 = dateTimeZone14.getName((long) (byte) 1);
        java.lang.String str18 = dateTimeZone14.getID();
        java.lang.String str19 = dateTimeZone14.toString();
        org.joda.time.Chronology chronology20 = copticChronology0.withZone(dateTimeZone14);
        org.joda.time.DurationField durationField21 = copticChronology0.hours();
        org.joda.time.DurationField durationField22 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField3, and durationField8", !(durationField22.compareTo(durationField3) == 0) || (Math.signum(durationField22.compareTo(durationField8)) == Math.signum(durationField3.compareTo(durationField8))));
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0933");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = copticChronology0.weeks();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = copticChronology0.add(readablePeriod9, 0L, 360000000);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField15 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.year();
        org.joda.time.DurationField durationField18 = copticChronology0.millis();
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology19.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology19.year();
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField23 = copticChronology22.seconds();
        org.joda.time.DurationField durationField24 = copticChronology22.years();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology26 = copticChronology22.withZone(dateTimeZone25);
        java.lang.String str28 = dateTimeZone25.getNameKey((long) 1);
        org.joda.time.Chronology chronology29 = copticChronology19.withZone(dateTimeZone25);
        long long32 = dateTimeZone25.convertLocalToUTC((long) 0, true);
        long long34 = dateTimeZone25.convertUTCToLocal((long) (byte) 100);
        long long36 = dateTimeZone25.convertUTCToLocal((long) ' ');
        long long38 = dateTimeZone25.nextTransition((-359999989L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        org.joda.time.Chronology chronology40 = copticChronology0.withZone(dateTimeZone25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField24", (durationField15.compareTo(durationField24) == 0) == durationField15.equals(durationField24));
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0934");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField11 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.weekyear();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = copticChronology13.getZone();
        org.joda.time.DurationField durationField16 = copticChronology13.halfdays();
        org.joda.time.Chronology chronology17 = copticChronology13.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField19 = copticChronology18.seconds();
        org.joda.time.DurationField durationField20 = copticChronology18.hours();
        org.joda.time.DurationField durationField21 = copticChronology18.seconds();
        org.joda.time.DurationField durationField22 = copticChronology18.weeks();
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = copticChronology23.seconds();
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField26 = copticChronology25.seconds();
        org.joda.time.DurationField durationField27 = copticChronology25.years();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology29 = copticChronology25.withZone(dateTimeZone28);
        java.lang.String str31 = dateTimeZone28.getNameKey((long) 1);
        boolean boolean33 = dateTimeZone28.equals((java.lang.Object) (-1.0f));
        int int35 = dateTimeZone28.getOffset((long) 100);
        org.joda.time.Chronology chronology36 = copticChronology23.withZone(dateTimeZone28);
        org.joda.time.Chronology chronology37 = copticChronology18.withZone(dateTimeZone28);
        org.joda.time.Chronology chronology38 = copticChronology13.withZone(dateTimeZone28);
        java.lang.String str39 = dateTimeZone28.toString();
        long long41 = dateTimeZone28.convertUTCToLocal(1L);
        org.joda.time.Chronology chronology42 = copticChronology0.withZone(dateTimeZone28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField27", (durationField7.compareTo(durationField27) == 0) == durationField7.equals(durationField27));
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0935");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField6 = copticChronology0.millis();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField7", Math.signum(durationField6.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField6)));
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0936");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology12.getZone();
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) copticChronology12);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.millisOfDay();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology17.minuteOfDay();
        java.lang.String str20 = copticChronology17.toString();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology17.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology17.era();
        org.joda.time.DurationField durationField23 = copticChronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField1, and durationField2", !(durationField23.compareTo(durationField1) == 0) || (Math.signum(durationField23.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0937");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = copticChronology7.add(readablePeriod16, (long) (short) 0, 10);
        org.joda.time.DurationField durationField20 = copticChronology7.weekyears();
        java.lang.Class<?> wildcardClass21 = copticChronology7.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField20", (durationField2.compareTo(durationField20) == 0) == durationField2.equals(durationField20));
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0938");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology8.getZone();
        org.joda.time.DurationField durationField11 = copticChronology8.months();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology8.add(readablePeriod12, (long) (short) -1, (int) '#');
        org.joda.time.DateTimeField dateTimeField16 = copticChronology8.yearOfCentury();
        org.joda.time.DurationField durationField17 = copticChronology8.days();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(100);
        boolean boolean20 = dateTimeZone19.isFixed();
        java.util.TimeZone timeZone21 = dateTimeZone19.toTimeZone();
        org.joda.time.Chronology chronology22 = copticChronology8.withZone(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField23 = copticChronology8.clockhourOfHalfday();
        org.joda.time.DurationField durationField24 = copticChronology8.seconds();
        org.joda.time.DurationField durationField25 = copticChronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField1, and durationField2", !(durationField25.compareTo(durationField1) == 0) || (Math.signum(durationField25.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0939");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology0.add(readablePeriod12, (long) ' ', (int) ' ');
        org.joda.time.DurationField durationField16 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField19 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField21 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology0.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField21", (durationField19.compareTo(durationField21) == 0) == durationField19.equals(durationField21));
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0940");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.years();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.millisOfSecond();
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField5 = copticChronology4.seconds();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology4.add(readablePeriod6, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.Chronology chronology10 = copticChronology4.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology4.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology4.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = copticChronology4.getZone();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology14.secondOfMinute();
        org.joda.time.DurationField durationField17 = copticChronology14.halfdays();
        int int18 = copticChronology14.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology14.weekyearOfCentury();
        org.joda.time.DurationField durationField20 = copticChronology14.months();
        org.joda.time.DurationField durationField21 = copticChronology14.years();
        org.joda.time.DurationField durationField22 = copticChronology14.weeks();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology14.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology14.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology14.secondOfMinute();
        org.joda.time.DurationField durationField26 = copticChronology14.millis();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology14.millisOfDay();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology14.clockhourOfHalfday();
        boolean boolean29 = dateTimeZone13.equals((java.lang.Object) copticChronology14);
        boolean boolean30 = copticChronology0.equals((java.lang.Object) copticChronology14);
        org.joda.time.DateTimeField dateTimeField31 = copticChronology14.secondOfDay();
        org.joda.time.Chronology chronology32 = copticChronology14.withUTC();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology14.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField21", (durationField1.compareTo(durationField21) == 0) == durationField1.equals(durationField21));
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0941");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.millisOfDay();
        org.joda.time.Chronology chronology10 = copticChronology8.withUTC();
        org.joda.time.DurationField durationField11 = copticChronology8.weeks();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology8.secondOfDay();
        org.joda.time.DurationField durationField13 = copticChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology8.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField13", (durationField2.compareTo(durationField13) == 0) == durationField2.equals(durationField13));
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0942");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        int int7 = dateTimeZone5.getOffsetFromLocal((long) (short) 0);
        long long11 = dateTimeZone5.convertLocalToUTC(5L, false, (-53175657599990L));
        long long13 = dateTimeZone5.convertUTCToLocal(3599969L);
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField16 = copticChronology15.seconds();
        org.joda.time.DurationField durationField17 = copticChronology15.hours();
        org.joda.time.DurationField durationField18 = copticChronology15.millis();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology15.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology15.hourOfHalfday();
        boolean boolean21 = copticChronology14.equals((java.lang.Object) copticChronology15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField16", Math.signum(durationField3.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField3)));
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0943");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology12.getZone();
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) copticChronology12);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        java.lang.String str18 = copticChronology17.toString();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology17.hourOfDay();
        org.joda.time.DurationField durationField20 = copticChronology17.years();
        java.lang.String str21 = copticChronology17.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField20", (durationField2.compareTo(durationField20) == 0) == durationField2.equals(durationField20));
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0944");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = copticChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField10 = copticChronology0.weeks();
        org.joda.time.DurationField durationField11 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField4", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0945");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, 1L, 3600000);
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.joda.time.DurationField durationField8 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField9", Math.signum(durationField8.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField8)));
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0946");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField5 = copticChronology4.seconds();
        org.joda.time.DurationField durationField6 = copticChronology4.years();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology8 = copticChronology4.withZone(dateTimeZone7);
        boolean boolean9 = dateTimeZone7.isFixed();
        java.lang.String str10 = dateTimeZone7.getID();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7, 4);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.hourOfHalfday();
        long long17 = copticChronology12.add((long) ' ', 359999999L, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology12.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology12.secondOfDay();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology12.hourOfHalfday();
        boolean boolean21 = dateTimeZone3.equals((java.lang.Object) dateTimeField20);
        java.util.TimeZone timeZone22 = dateTimeZone3.toTimeZone();
        int int24 = dateTimeZone3.getOffsetFromLocal((-11400598999L));
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology25.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology25.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.Chronology chronology29 = copticChronology25.withZone(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField30 = copticChronology25.year();
        org.joda.time.DurationField durationField31 = copticChronology25.months();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology25.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology25.yearOfEra();
        int int34 = copticChronology25.getMinimumDaysInFirstWeek();
        boolean boolean36 = copticChronology25.equals((java.lang.Object) 999L);
        org.joda.time.DurationField durationField37 = copticChronology25.weekyears();
        org.joda.time.DurationField durationField38 = copticChronology25.months();
        org.joda.time.Chronology chronology39 = copticChronology25.withUTC();
        boolean boolean40 = dateTimeZone3.equals((java.lang.Object) copticChronology25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField37", (durationField2.compareTo(durationField37) == 0) == durationField2.equals(durationField37));
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0947");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField9 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField10 = copticChronology0.months();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = copticChronology11.seconds();
        org.joda.time.DurationField durationField13 = copticChronology11.years();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology11.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone15 = copticChronology11.getZone();
        org.joda.time.Chronology chronology16 = copticChronology0.withZone(dateTimeZone15);
        org.joda.time.DurationField durationField17 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField18 = copticChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField17", (durationField13.compareTo(durationField17) == 0) == durationField13.equals(durationField17));
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0948");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = copticChronology0.millis();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7);
        org.joda.time.DurationField durationField9 = copticChronology8.eras();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField9", Math.signum(durationField6.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField6)));
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0949");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField14 = copticChronology0.seconds();
        org.joda.time.DurationField durationField15 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField15", Math.signum(durationField1.compareTo(durationField15)) == -Math.signum(durationField15.compareTo(durationField1)));
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0950");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField10 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField12 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField15 = copticChronology0.millis();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology16.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology16.year();
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField20 = copticChronology19.seconds();
        org.joda.time.DurationField durationField21 = copticChronology19.years();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology23 = copticChronology19.withZone(dateTimeZone22);
        java.lang.String str25 = dateTimeZone22.getNameKey((long) 1);
        org.joda.time.Chronology chronology26 = copticChronology16.withZone(dateTimeZone22);
        long long29 = dateTimeZone22.convertLocalToUTC((long) 0, true);
        org.joda.time.chrono.CopticChronology copticChronology30 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology30.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone32 = copticChronology30.getZone();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology30.dayOfYear();
        int int34 = copticChronology30.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology30.minuteOfHour();
        org.joda.time.DurationField durationField36 = copticChronology30.centuries();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology30.secondOfDay();
        org.joda.time.Chronology chronology38 = copticChronology30.withUTC();
        org.joda.time.DurationField durationField39 = chronology38.hours();
        org.joda.time.DurationField durationField40 = chronology38.months();
        boolean boolean41 = dateTimeZone22.equals((java.lang.Object) chronology38);
        org.joda.time.Chronology chronology42 = copticChronology0.withZone(dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField21", (durationField6.compareTo(durationField21) == 0) == durationField6.equals(durationField21));
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0951");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology7.yearOfEra();
        org.joda.time.DurationField durationField17 = copticChronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology7.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField17", (durationField2.compareTo(durationField17) == 0) == durationField2.equals(durationField17));
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0952");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = copticChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.era();
        org.joda.time.DurationField durationField10 = copticChronology0.centuries();
        org.joda.time.DurationField durationField11 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfWeek();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField14 = copticChronology13.seconds();
        org.joda.time.DurationField durationField15 = copticChronology13.years();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology13.weekOfWeekyear();
        org.joda.time.Chronology chronology17 = copticChronology13.withUTC();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology13.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) '4');
        boolean boolean22 = dateTimeZone21.isFixed();
        org.joda.time.Chronology chronology23 = copticChronology13.withZone(dateTimeZone21);
        org.joda.time.Chronology chronology24 = copticChronology0.withZone(dateTimeZone21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField15", (durationField6.compareTo(durationField15) == 0) == durationField6.equals(durationField15));
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0953");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField10 = copticChronology0.years();
        java.lang.String str11 = copticChronology0.toString();
        org.joda.time.Chronology chronology12 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField14 = copticChronology0.centuries();
        org.joda.time.DurationField durationField15 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField10, and durationField14", !(durationField15.compareTo(durationField10) == 0) || (Math.signum(durationField15.compareTo(durationField14)) == Math.signum(durationField10.compareTo(durationField14))));
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0954");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = copticChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.year();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology1.getZone();
        long long11 = dateTimeZone7.convertLocalToUTC(100L, false, 1L);
        java.lang.String str12 = dateTimeZone7.getID();
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone7.getOffset(readableInstant13);
        org.joda.time.Chronology chronology15 = copticChronology0.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField17 = copticChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone18 = copticChronology0.getZone();
        java.lang.String str19 = dateTimeZone18.getID();
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology20.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology20.year();
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = copticChronology23.seconds();
        org.joda.time.DurationField durationField25 = copticChronology23.years();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology27 = copticChronology23.withZone(dateTimeZone26);
        java.lang.String str29 = dateTimeZone26.getNameKey((long) 1);
        org.joda.time.Chronology chronology30 = copticChronology20.withZone(dateTimeZone26);
        org.joda.time.chrono.CopticChronology copticChronology31 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField32 = copticChronology31.seconds();
        org.joda.time.DurationField durationField33 = copticChronology31.years();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology35 = copticChronology31.withZone(dateTimeZone34);
        java.lang.String str37 = dateTimeZone34.getNameKey((long) 1);
        int int39 = dateTimeZone34.getStandardOffset((long) (short) 0);
        long long41 = dateTimeZone26.getMillisKeepLocal(dateTimeZone34, (long) (short) 10);
        long long45 = dateTimeZone34.convertLocalToUTC(32L, true, (long) (-1));
        long long48 = dateTimeZone34.convertLocalToUTC((long) (byte) 1, true);
        int int50 = dateTimeZone34.getOffsetFromLocal((long) (-1));
        java.util.TimeZone timeZone51 = dateTimeZone34.toTimeZone();
        org.joda.time.LocalDateTime localDateTime52 = null;
        boolean boolean53 = dateTimeZone34.isLocalDateTimeGap(localDateTime52);
        org.joda.time.chrono.CopticChronology copticChronology54 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField55 = copticChronology54.seconds();
        org.joda.time.DurationField durationField56 = copticChronology54.minutes();
        org.joda.time.DateTimeField dateTimeField57 = copticChronology54.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField58 = copticChronology54.weekOfWeekyear();
        org.joda.time.DurationField durationField59 = copticChronology54.weeks();
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        long long63 = copticChronology54.add(readablePeriod60, (long) (short) -1, 3600000);
        org.joda.time.DurationField durationField64 = copticChronology54.centuries();
        boolean boolean65 = dateTimeZone34.equals((java.lang.Object) durationField64);
        org.joda.time.LocalDateTime localDateTime66 = null;
        boolean boolean67 = dateTimeZone34.isLocalDateTimeGap(localDateTime66);
        org.joda.time.chrono.CopticChronology copticChronology68 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone34);
        boolean boolean69 = dateTimeZone18.equals((java.lang.Object) dateTimeZone34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField17 and durationField25", (durationField17.compareTo(durationField25) == 0) == durationField17.equals(durationField25));
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0955");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField12 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.yearOfCentury();
        int int14 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField16 = copticChronology0.days();
        org.joda.time.DurationField durationField17 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField1, and durationField12", !(durationField17.compareTo(durationField1) == 0) || (Math.signum(durationField17.compareTo(durationField12)) == Math.signum(durationField1.compareTo(durationField12))));
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0956");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField10 = copticChronology7.centuries();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology7.hourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology15.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology15.millisOfDay();
        boolean boolean18 = dateTimeZone14.equals((java.lang.Object) dateTimeField17);
        java.lang.String str19 = dateTimeZone14.getID();
        long long21 = dateTimeZone14.previousTransition((-86149990L));
        org.joda.time.Chronology chronology22 = copticChronology7.withZone(dateTimeZone14);
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = copticChronology23.seconds();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        long long28 = copticChronology23.add(readablePeriod25, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        long long32 = copticChronology23.add(readablePeriod29, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField33 = copticChronology23.minuteOfDay();
        org.joda.time.DurationField durationField34 = copticChronology23.centuries();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology23.minuteOfHour();
        org.joda.time.DurationField durationField36 = copticChronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology23.hourOfDay();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology23.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField39 = copticChronology23.weekyearOfCentury();
        org.joda.time.DurationField durationField40 = copticChronology23.millis();
        org.joda.time.DurationField durationField41 = copticChronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField42 = copticChronology23.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone43 = copticChronology23.getZone();
        org.joda.time.Chronology chronology44 = copticChronology7.withZone(dateTimeZone43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField34", (durationField10.compareTo(durationField34) == 0) == durationField10.equals(durationField34));
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0957");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField13", Math.signum(durationField1.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField1)));
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0958");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) 1, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.hours();
        org.joda.time.DurationField durationField9 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField10 = copticChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField9", (durationField2.compareTo(durationField9) == 0) == durationField2.equals(durationField9));
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0959");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone11 = copticChronology0.getZone();
        org.joda.time.DurationField durationField12 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField12", (durationField6.compareTo(durationField12) == 0) == durationField6.equals(durationField12));
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0960");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField8 = copticChronology0.years();
        long long12 = copticChronology0.add((-318479989L), 189300004L, 60000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField8", (durationField6.compareTo(durationField8) == 0) == durationField6.equals(durationField8));
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0961");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DurationField durationField4 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField10 = copticChronology0.millis();
        org.joda.time.DurationField durationField11 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField15 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField15", (durationField11.compareTo(durationField15) == 0) == durationField11.equals(durationField15));
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0962");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField9 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField9", (durationField7.compareTo(durationField9) == 0) == durationField7.equals(durationField9));
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0963");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField10 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField12 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField17 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField3, and durationField4", !(durationField17.compareTo(durationField3) == 0) || (Math.signum(durationField17.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0964");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = copticChronology0.hours();
        org.joda.time.DurationField durationField9 = copticChronology0.millis();
        org.joda.time.DurationField durationField10 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField11 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField12 = copticChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField11", (durationField2.compareTo(durationField11) == 0) == durationField2.equals(durationField11));
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0965");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology12.getZone();
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) copticChronology12);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.millisOfDay();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology17.minuteOfDay();
        java.lang.String str20 = copticChronology17.toString();
        org.joda.time.DateTimeZone dateTimeZone21 = copticChronology17.getZone();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology17.hourOfHalfday();
        org.joda.time.DurationField durationField23 = copticChronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField1, and durationField2", !(durationField23.compareTo(durationField1) == 0) || (Math.signum(durationField23.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0966");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = copticChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DurationField durationField11 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField13 = copticChronology0.months();
        org.joda.time.DurationField durationField14 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField3, and durationField4", !(durationField14.compareTo(durationField3) == 0) || (Math.signum(durationField14.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0967");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DurationField durationField4 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField2", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0968");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField6 = copticChronology0.seconds();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField2", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0969");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.yearOfEra();
        org.joda.time.DurationField durationField16 = copticChronology7.seconds();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology7.secondOfMinute();
        org.joda.time.DurationField durationField18 = copticChronology7.months();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology7.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField16", (durationField1.compareTo(durationField16) == 0) == durationField1.equals(durationField16));
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0970");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology12.getZone();
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) copticChronology12);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        java.lang.String str18 = copticChronology17.toString();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology17.hourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology17.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = copticChronology17.seconds();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology17.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField21", (durationField1.compareTo(durationField21) == 0) == durationField1.equals(durationField21));
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0971");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = copticChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology0.getZone();
        java.lang.String str9 = copticChronology0.toString();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField7", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField7)) == Math.signum(durationField1.compareTo(durationField7))));
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0972");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField9 = copticChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField9, and durationField3", !(durationField3.compareTo(durationField9) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField9.compareTo(durationField3))));
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0973");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.minutes();
        org.joda.time.DurationField durationField4 = copticChronology0.centuries();
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology6.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = copticChronology6.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology6.year();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology6.getZone();
        long long16 = dateTimeZone12.convertLocalToUTC(100L, false, 1L);
        java.lang.String str17 = dateTimeZone12.getID();
        long long21 = dateTimeZone12.convertLocalToUTC((long) (short) 0, false, 10L);
        org.joda.time.Chronology chronology22 = copticChronology0.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField23 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField25 = copticChronology0.years();
        org.joda.time.DurationField durationField26 = copticChronology0.seconds();
        org.joda.time.DurationField durationField27 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField1, and durationField2", !(durationField27.compareTo(durationField1) == 0) || (Math.signum(durationField27.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0974");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.Chronology chronology2 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfHalfday();
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = copticChronology5.seconds();
        org.joda.time.DurationField durationField7 = copticChronology5.years();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology9 = copticChronology5.withZone(dateTimeZone8);
        boolean boolean10 = dateTimeZone8.isFixed();
        long long12 = dateTimeZone8.convertUTCToLocal(10L);
        org.joda.time.Chronology chronology13 = copticChronology0.withZone(dateTimeZone8);
        long long17 = copticChronology0.add(115389294567L, (-50131349395965L), (int) (short) 100);
        org.joda.time.DurationField durationField18 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField3, and durationField6", !(durationField18.compareTo(durationField3) == 0) || (Math.signum(durationField18.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0975");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DurationField durationField5 = copticChronology0.minutes();
        org.joda.time.DurationField durationField6 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField9 = copticChronology0.years();
        org.joda.time.DurationField durationField10 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField10", (durationField9.compareTo(durationField10) == 0) == durationField9.equals(durationField10));
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0976");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField6 = copticChronology0.millis();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField7", Math.signum(durationField6.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField6)));
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0977");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = copticChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField10 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField14 = copticChronology0.minutes();
        org.joda.time.DurationField durationField15 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.year();
        org.joda.time.Chronology chronology17 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField18 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField18", (durationField6.compareTo(durationField18) == 0) == durationField6.equals(durationField18));
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0978");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology7.minuteOfDay();
        org.joda.time.DurationField durationField18 = copticChronology7.years();
        java.lang.String str19 = copticChronology7.toString();
        org.joda.time.DurationField durationField20 = copticChronology7.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField18", (durationField2.compareTo(durationField18) == 0) == durationField2.equals(durationField18));
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0979");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology12.getZone();
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) copticChronology12);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.millisOfDay();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology17.minuteOfDay();
        org.joda.time.Chronology chronology20 = copticChronology17.withUTC();
        org.joda.time.DurationField durationField21 = copticChronology17.years();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology17.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField21", (durationField2.compareTo(durationField21) == 0) == durationField2.equals(durationField21));
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0980");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = copticChronology3.seconds();
        org.joda.time.DurationField durationField5 = copticChronology3.years();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = copticChronology3.withZone(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getNameKey((long) 1);
        org.joda.time.Chronology chronology10 = copticChronology0.withZone(dateTimeZone6);
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = copticChronology11.seconds();
        org.joda.time.DurationField durationField13 = copticChronology11.years();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology15 = copticChronology11.withZone(dateTimeZone14);
        java.lang.String str17 = dateTimeZone14.getNameKey((long) 1);
        int int19 = dateTimeZone14.getStandardOffset((long) (short) 0);
        long long21 = dateTimeZone6.getMillisKeepLocal(dateTimeZone14, (long) (short) 10);
        long long24 = dateTimeZone14.adjustOffset((-82799999L), true);
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField26 = copticChronology25.seconds();
        org.joda.time.DurationField durationField27 = copticChronology25.years();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology29 = copticChronology25.withZone(dateTimeZone28);
        boolean boolean30 = dateTimeZone28.isFixed();
        java.lang.String str31 = dateTimeZone28.getID();
        org.joda.time.chrono.CopticChronology copticChronology33 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone28, 4);
        org.joda.time.DateTimeField dateTimeField34 = copticChronology33.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone35 = copticChronology33.getZone();
        long long37 = dateTimeZone14.getMillisKeepLocal(dateTimeZone35, 3600001L);
        org.joda.time.chrono.CopticChronology copticChronology38 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone35);
        org.joda.time.DurationField durationField39 = copticChronology38.days();
        org.joda.time.DurationField durationField40 = copticChronology38.seconds();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology38.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField40", (durationField4.compareTo(durationField40) == 0) == durationField4.equals(durationField40));
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0981");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone7.getShortName((long) ' ', locale9);
        long long12 = dateTimeZone7.previousTransition((long) (byte) 100);
        java.lang.String str14 = dateTimeZone7.getName(35999999899L);
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7);
        boolean boolean16 = copticChronology0.equals((java.lang.Object) copticChronology15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField6", Math.signum(durationField1.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField1)));
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0982");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.clockhourOfDay();
        org.joda.time.DurationField durationField10 = copticChronology7.days();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology7.getZone();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology13.secondOfMinute();
        org.joda.time.DurationField durationField16 = copticChronology13.halfdays();
        org.joda.time.DurationField durationField17 = copticChronology13.months();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology13.year();
        java.lang.String str20 = copticChronology13.toString();
        org.joda.time.DurationField durationField21 = copticChronology13.days();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology13.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology13.monthOfYear();
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology25.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology25.secondOfMinute();
        org.joda.time.DurationField durationField28 = copticChronology25.halfdays();
        int int29 = copticChronology25.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField30 = copticChronology25.months();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology25.year();
        org.joda.time.DateTimeZone dateTimeZone32 = copticChronology25.getZone();
        java.lang.String str33 = dateTimeZone32.toString();
        org.joda.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = dateTimeZone32.isLocalDateTimeGap(localDateTime34);
        org.joda.time.Chronology chronology36 = copticChronology13.withZone(dateTimeZone32);
        org.joda.time.Chronology chronology37 = copticChronology7.withZone(dateTimeZone32);
        java.lang.String str39 = dateTimeZone32.getShortName((-1L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone32);
        org.joda.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = dateTimeZone32.isLocalDateTimeGap(localDateTime41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField21", (durationField10.compareTo(durationField21) == 0) == durationField10.equals(durationField21));
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0983");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField9 = copticChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField9, and durationField3", !(durationField3.compareTo(durationField9) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField9.compareTo(durationField3))));
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0984");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = copticChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField10 = copticChronology0.weeks();
        org.joda.time.DurationField durationField11 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField13 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField15 = copticChronology0.hours();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField17 = copticChronology16.seconds();
        org.joda.time.DurationField durationField18 = copticChronology16.years();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology20 = copticChronology16.withZone(dateTimeZone19);
        java.lang.String str22 = dateTimeZone19.getNameKey((long) 1);
        int int24 = dateTimeZone19.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone19);
        boolean boolean27 = dateTimeZone19.isStandardOffset((long) (short) 10);
        boolean boolean29 = dateTimeZone19.isStandardOffset(58L);
        int int31 = dateTimeZone19.getOffsetFromLocal((long) 4);
        org.joda.time.Chronology chronology32 = copticChronology0.withZone(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField18", (durationField6.compareTo(durationField18) == 0) == durationField6.equals(durationField18));
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0985");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.yearOfEra();
        org.joda.time.Chronology chronology16 = copticChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology7.yearOfCentury();
        org.joda.time.DurationField durationField18 = copticChronology7.days();
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology19.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology19.secondOfMinute();
        org.joda.time.DurationField durationField22 = copticChronology19.weeks();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology19.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology19.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone25 = copticChronology19.getZone();
        org.joda.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = dateTimeZone25.isLocalDateTimeGap(localDateTime26);
        org.joda.time.Chronology chronology28 = copticChronology7.withZone(dateTimeZone25);
        org.joda.time.DurationField durationField29 = copticChronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology7.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField29", (durationField2.compareTo(durationField29) == 0) == durationField2.equals(durationField29));
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0986");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 52L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField11 = copticChronology0.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField11, and durationField3", !(durationField3.compareTo(durationField11) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField11.compareTo(durationField3))));
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0987");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField16 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.yearOfCentury();
        java.lang.String str18 = copticChronology0.toString();
        org.joda.time.DurationField durationField19 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField1, and durationField16", !(durationField19.compareTo(durationField1) == 0) || (Math.signum(durationField19.compareTo(durationField16)) == Math.signum(durationField1.compareTo(durationField16))));
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0988");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 3600035L, 0);
        org.joda.time.DurationField durationField10 = copticChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField10, and durationField3", !(durationField3.compareTo(durationField10) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField10.compareTo(durationField3))));
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0989");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField8 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = copticChronology0.add(readablePeriod11, (-359999967L), 360000000);
        org.joda.time.DurationField durationField15 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField1, and durationField8", !(durationField15.compareTo(durationField1) == 0) || (Math.signum(durationField15.compareTo(durationField8)) == Math.signum(durationField1.compareTo(durationField8))));
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0990");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = copticChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField16 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField3, and durationField4", !(durationField16.compareTo(durationField3) == 0) || (Math.signum(durationField16.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0991");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.DurationField durationField3 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        long long11 = copticChronology0.getDateTimeMillis(999L, 0, (int) (short) 0, 0, (int) (short) 10);
        org.joda.time.DurationField durationField12 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.millisOfDay();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField15 = copticChronology14.seconds();
        org.joda.time.DurationField durationField16 = copticChronology14.years();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology18 = copticChronology14.withZone(dateTimeZone17);
        boolean boolean19 = dateTimeZone17.isFixed();
        java.lang.String str20 = dateTimeZone17.getID();
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone17, 4);
        org.joda.time.DateTimeField dateTimeField23 = copticChronology22.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone24 = copticChronology22.getZone();
        long long26 = dateTimeZone24.previousTransition((long) '#');
        java.util.TimeZone timeZone27 = dateTimeZone24.toTimeZone();
        boolean boolean28 = dateTimeZone24.isFixed();
        org.joda.time.chrono.CopticChronology copticChronology29 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone24);
        org.joda.time.Chronology chronology30 = copticChronology0.withZone(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField16", (durationField12.compareTo(durationField16) == 0) == durationField12.equals(durationField16));
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0992");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekOfWeekyear();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField2", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0993");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone3.getShortName((long) ' ', locale5);
        org.joda.time.Chronology chronology7 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfHalfday();
        java.lang.String str9 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.joda.time.Chronology chronology12 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField15 = copticChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField15, and durationField11", !(durationField11.compareTo(durationField15) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField15.compareTo(durationField11))));
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0994");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.era();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField7", (durationField2.compareTo(durationField7) == 0) == durationField2.equals(durationField7));
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0995");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = copticChronology0.add(readablePeriod8, 90L, (int) (short) -1);
        org.joda.time.DurationField durationField12 = copticChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField12, and durationField3", !(durationField3.compareTo(durationField12) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField12.compareTo(durationField3))));
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0996");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = copticChronology0.days();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField2", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0997");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField15 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone18 = copticChronology0.getZone();
        org.joda.time.DurationField durationField19 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField21 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField1, and durationField15", !(durationField21.compareTo(durationField1) == 0) || (Math.signum(durationField21.compareTo(durationField15)) == Math.signum(durationField1.compareTo(durationField15))));
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0998");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = copticChronology3.seconds();
        org.joda.time.DurationField durationField5 = copticChronology3.years();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = copticChronology3.withZone(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getNameKey((long) 1);
        org.joda.time.Chronology chronology10 = copticChronology0.withZone(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.centuryOfEra();
        org.joda.time.Chronology chronology14 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField15 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField15", (durationField5.compareTo(durationField15) == 0) == durationField5.equals(durationField15));
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0999");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.yearOfEra();
        org.joda.time.Chronology chronology16 = copticChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology7.centuryOfEra();
        org.joda.time.Chronology chronology18 = copticChronology7.withUTC();
        org.joda.time.DateTimeZone dateTimeZone19 = copticChronology7.getZone();
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology20.monthOfYear();
        org.joda.time.DurationField durationField22 = copticChronology20.weekyears();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology20.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField22", (durationField2.compareTo(durationField22) == 0) == durationField2.equals(durationField22));
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test1000");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField14 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField17 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField17", Math.signum(durationField1.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField1)));
    }
}

