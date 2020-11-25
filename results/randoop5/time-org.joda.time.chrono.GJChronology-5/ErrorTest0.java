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
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.weeks();
        org.joda.time.DurationField durationField15 = gJChronology3.years();
        org.joda.time.DurationField durationField16 = gJChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology3.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField16", (durationField15.compareTo(durationField16) == 0) == durationField15.equals(durationField16));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.weeks();
        org.joda.time.DurationField durationField15 = gJChronology3.years();
        org.joda.time.DurationField durationField16 = gJChronology3.weekyears();
        java.lang.String str17 = gJChronology3.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField16", (durationField15.compareTo(durationField16) == 0) == durationField15.equals(durationField16));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DurationField durationField7 = gJChronology3.days();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.centuryOfEra();
        org.joda.time.DurationField durationField9 = gJChronology3.years();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.millisOfDay();
        org.joda.time.DurationField durationField11 = gJChronology3.hours();
        org.joda.time.DurationField durationField12 = gJChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology3.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField12", (durationField9.compareTo(durationField12) == 0) == durationField9.equals(durationField12));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.weeks();
        org.joda.time.DurationField durationField15 = gJChronology3.years();
        org.joda.time.DurationField durationField16 = gJChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology3.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField16", (durationField15.compareTo(durationField16) == 0) == durationField15.equals(durationField16));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.weeks();
        org.joda.time.DurationField durationField15 = gJChronology3.years();
        org.joda.time.DurationField durationField16 = gJChronology3.weekyears();
        org.joda.time.Chronology chronology17 = gJChronology3.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField16", (durationField15.compareTo(durationField16) == 0) == durationField15.equals(durationField16));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.weeks();
        org.joda.time.DurationField durationField15 = gJChronology3.years();
        org.joda.time.DurationField durationField16 = gJChronology3.weekyears();
        org.joda.time.DurationField durationField17 = gJChronology3.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField16", (durationField15.compareTo(durationField16) == 0) == durationField15.equals(durationField16));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.Instant instant7 = gJChronology3.getGregorianCutover();
        org.joda.time.DurationField durationField8 = gJChronology3.millis();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.year();
        org.joda.time.DurationField durationField10 = gJChronology3.minutes();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = gJChronology3.add(readablePeriod11, 2185L, (int) (byte) 0);
        org.joda.time.DurationField durationField15 = gJChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField8, and durationField10", !(durationField15.compareTo(durationField8) == 0) || (Math.signum(durationField15.compareTo(durationField10)) == Math.signum(durationField8.compareTo(durationField10))));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DurationField durationField7 = gJChronology3.days();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.centuryOfEra();
        org.joda.time.DurationField durationField9 = gJChronology3.years();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.millisOfDay();
        org.joda.time.DurationField durationField11 = gJChronology3.hours();
        org.joda.time.DurationField durationField12 = gJChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology3.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField12", (durationField9.compareTo(durationField12) == 0) == durationField9.equals(durationField12));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.year();
        org.joda.time.DurationField durationField6 = gJChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.hourOfDay();
        org.joda.time.DurationField durationField8 = gJChronology3.days();
        org.joda.time.DurationField durationField9 = gJChronology3.weekyears();
        org.joda.time.DurationField durationField10 = gJChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField6, and durationField8", !(durationField10.compareTo(durationField6) == 0) || (Math.signum(durationField10.compareTo(durationField8)) == Math.signum(durationField6.compareTo(durationField8))));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DurationField durationField7 = gJChronology3.days();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.centuryOfEra();
        org.joda.time.DurationField durationField9 = gJChronology3.years();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.millisOfDay();
        org.joda.time.DurationField durationField11 = gJChronology3.hours();
        org.joda.time.DurationField durationField12 = gJChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology3.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField12", (durationField9.compareTo(durationField12) == 0) == durationField9.equals(durationField12));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.weeks();
        org.joda.time.DurationField durationField15 = gJChronology3.years();
        org.joda.time.DurationField durationField16 = gJChronology3.weekyears();
        org.joda.time.DurationField durationField17 = gJChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField16", (durationField15.compareTo(durationField16) == 0) == durationField15.equals(durationField16));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DurationField durationField7 = gJChronology3.days();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.centuryOfEra();
        org.joda.time.DurationField durationField9 = gJChronology3.years();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.millisOfDay();
        org.joda.time.DurationField durationField11 = gJChronology3.hours();
        org.joda.time.DurationField durationField12 = gJChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology3.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField12", (durationField9.compareTo(durationField12) == 0) == durationField9.equals(durationField12));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.millis();
        org.joda.time.DurationField durationField15 = gJChronology3.centuries();
        org.joda.time.DurationField durationField16 = gJChronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology3.minuteOfDay();
        org.joda.time.DurationField durationField18 = gJChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField14, and durationField15", !(durationField18.compareTo(durationField14) == 0) || (Math.signum(durationField18.compareTo(durationField15)) == Math.signum(durationField14.compareTo(durationField15))));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        org.joda.time.Instant instant9 = gJChronology3.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.clockhourOfHalfday();
        org.joda.time.DurationField durationField11 = gJChronology3.eras();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology3.minuteOfDay();
        org.joda.time.DurationField durationField13 = gJChronology3.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField13, and durationField11", !(durationField11.compareTo(durationField13) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField13.compareTo(durationField11))));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology11.year();
        org.joda.time.DurationField durationField14 = gJChronology11.centuries();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology11.dayOfMonth();
        boolean boolean16 = gJChronology3.equals((java.lang.Object) dateTimeField15);
        boolean boolean18 = gJChronology3.equals((java.lang.Object) 10);
        org.joda.time.DateTimeField dateTimeField19 = gJChronology3.minuteOfHour();
        org.joda.time.DurationField durationField20 = gJChronology3.eras();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology3.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField20", Math.signum(durationField14.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField14)));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.weeks();
        org.joda.time.DurationField durationField15 = gJChronology3.years();
        org.joda.time.DurationField durationField16 = gJChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology3.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField16", (durationField15.compareTo(durationField16) == 0) == durationField15.equals(durationField16));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.millis();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology3.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = gJChronology3.add(readablePeriod19, 1665L, (-1));
        org.joda.time.DurationField durationField23 = gJChronology3.eras();
        org.joda.time.DurationField durationField24 = gJChronology3.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField23", Math.signum(durationField14.compareTo(durationField23)) == -Math.signum(durationField23.compareTo(durationField14)));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology11.year();
        org.joda.time.DurationField durationField14 = gJChronology11.centuries();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology11.dayOfMonth();
        boolean boolean16 = gJChronology3.equals((java.lang.Object) dateTimeField15);
        boolean boolean18 = gJChronology3.equals((java.lang.Object) 10);
        org.joda.time.DateTimeField dateTimeField19 = gJChronology3.minuteOfHour();
        org.joda.time.DurationField durationField20 = gJChronology3.eras();
        org.joda.time.DurationField durationField21 = gJChronology3.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField21 and durationField20", Math.signum(durationField21.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField21)));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.dayOfYear();
        org.joda.time.DurationField durationField5 = gJChronology3.weeks();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.minuteOfHour();
        org.joda.time.Instant instant8 = gJChronology3.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField10 = gJChronology9.weeks();
        java.lang.String str11 = gJChronology9.toString();
        org.joda.time.DurationField durationField12 = gJChronology9.halfdays();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology9.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology9.millisOfSecond();
        boolean boolean15 = gJChronology3.equals((java.lang.Object) dateTimeField14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField10", (durationField5.compareTo(durationField10) == 0) == durationField5.equals(durationField10));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.weeks();
        org.joda.time.DurationField durationField15 = gJChronology3.years();
        org.joda.time.DurationField durationField16 = gJChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology3.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField16", (durationField15.compareTo(durationField16) == 0) == durationField15.equals(durationField16));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.millis();
        org.joda.time.DurationField durationField15 = gJChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology3.yearOfCentury();
        org.joda.time.DurationField durationField18 = gJChronology3.days();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology3.hourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology3.hourOfHalfday();
        org.joda.time.DurationField durationField21 = gJChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField14, and durationField15", !(durationField21.compareTo(durationField14) == 0) || (Math.signum(durationField21.compareTo(durationField15)) == Math.signum(durationField14.compareTo(durationField15))));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.weeks();
        org.joda.time.DurationField durationField15 = gJChronology3.years();
        org.joda.time.DurationField durationField16 = gJChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology3.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField16", (durationField15.compareTo(durationField16) == 0) == durationField15.equals(durationField16));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.year();
        org.joda.time.DurationField durationField6 = gJChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.hourOfDay();
        org.joda.time.DurationField durationField8 = gJChronology3.days();
        org.joda.time.DurationField durationField9 = gJChronology3.millis();
        org.joda.time.DurationField durationField10 = gJChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField6, and durationField8", !(durationField10.compareTo(durationField6) == 0) || (Math.signum(durationField10.compareTo(durationField8)) == Math.signum(durationField6.compareTo(durationField8))));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.centuryOfEra();
        org.joda.time.DurationField durationField7 = gJChronology3.centuries();
        org.joda.time.DurationField durationField8 = gJChronology3.days();
        org.joda.time.DateTimeZone dateTimeZone9 = gJChronology3.getZone();
        org.joda.time.DurationField durationField10 = gJChronology3.minutes();
        org.joda.time.DurationField durationField11 = gJChronology3.days();
        org.joda.time.DurationField durationField12 = gJChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField7, and durationField8", !(durationField12.compareTo(durationField7) == 0) || (Math.signum(durationField12.compareTo(durationField8)) == Math.signum(durationField7.compareTo(durationField8))));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = gJChronology11.add(readablePeriod13, (long) (short) 1, (int) (byte) -1);
        long long21 = gJChronology11.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField22 = gJChronology11.millis();
        boolean boolean23 = gJChronology3.equals((java.lang.Object) gJChronology11);
        org.joda.time.DurationField durationField24 = gJChronology11.seconds();
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField26 = gJChronology25.weeks();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology25.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology25.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = gJChronology25.getZone();
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone29);
        org.joda.time.chrono.GJChronology gJChronology31 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone29);
        org.joda.time.Chronology chronology32 = gJChronology11.withZone(dateTimeZone29);
        org.joda.time.DurationField durationField33 = gJChronology11.weeks();
        org.joda.time.DurationField durationField34 = gJChronology11.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField26 and durationField33", (durationField26.compareTo(durationField33) == 0) == durationField26.equals(durationField33));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField1 = gJChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.hourOfDay();
        org.joda.time.DurationField durationField4 = gJChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.monthOfYear();
        org.joda.time.DurationField durationField6 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField1, and durationField4", !(durationField6.compareTo(durationField1) == 0) || (Math.signum(durationField6.compareTo(durationField4)) == Math.signum(durationField1.compareTo(durationField4))));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        java.lang.String str6 = gJChronology3.toString();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, readableInstant8, (int) (short) 1);
        boolean boolean12 = gJChronology10.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology10.year();
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology10.getZone();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15, readableInstant16, (int) (short) 1);
        boolean boolean20 = gJChronology18.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology18.year();
        org.joda.time.Instant instant22 = gJChronology18.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, (org.joda.time.ReadableInstant) instant22, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25, readableInstant26, (int) (short) 1);
        boolean boolean30 = gJChronology28.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField31 = gJChronology28.year();
        org.joda.time.DateTimeZone dateTimeZone32 = gJChronology28.getZone();
        org.joda.time.Chronology chronology33 = gJChronology24.withZone(dateTimeZone32);
        org.joda.time.Chronology chronology34 = gJChronology3.withZone(dateTimeZone32);
        org.joda.time.DurationField durationField35 = gJChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology3.weekyear();
        org.joda.time.DurationField durationField37 = gJChronology3.years();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology3.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField35 and durationField37", (durationField35.compareTo(durationField37) == 0) == durationField35.equals(durationField37));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField1 = gJChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.halfdayOfDay();
        org.joda.time.Chronology chronology5 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField7 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField7", Math.signum(durationField1.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField1)));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField1 = gJChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.halfdayOfDay();
        org.joda.time.Chronology chronology5 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField7 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology0.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField7", Math.signum(durationField1.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField1)));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = gJChronology3.weeks();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology3.weekyear();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology3.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology3.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology3.secondOfMinute();
        org.joda.time.DurationField durationField16 = gJChronology3.days();
        org.joda.time.DurationField durationField17 = gJChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField10, and durationField16", !(durationField17.compareTo(durationField10) == 0) || (Math.signum(durationField17.compareTo(durationField16)) == Math.signum(durationField10.compareTo(durationField16))));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        org.joda.time.Instant instant9 = gJChronology3.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.clockhourOfHalfday();
        org.joda.time.DurationField durationField11 = gJChronology3.eras();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology3.minuteOfDay();
        org.joda.time.DurationField durationField13 = gJChronology3.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField13, and durationField11", !(durationField11.compareTo(durationField13) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField13.compareTo(durationField11))));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.weeks();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology3.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19, readableInstant20, (int) (short) 1);
        boolean boolean24 = gJChronology22.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField25 = gJChronology22.centuryOfEra();
        org.joda.time.DurationField durationField26 = gJChronology22.centuries();
        org.joda.time.DateTimeZone dateTimeZone27 = gJChronology22.getZone();
        org.joda.time.Chronology chronology28 = gJChronology3.withZone(dateTimeZone27);
        org.joda.time.DurationField durationField29 = gJChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField29, durationField14, and durationField26", !(durationField29.compareTo(durationField14) == 0) || (Math.signum(durationField29.compareTo(durationField26)) == Math.signum(durationField14.compareTo(durationField26))));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = gJChronology11.add(readablePeriod13, (long) (short) 1, (int) (byte) -1);
        long long21 = gJChronology11.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField22 = gJChronology11.millis();
        boolean boolean23 = gJChronology3.equals((java.lang.Object) gJChronology11);
        org.joda.time.DurationField durationField24 = gJChronology11.seconds();
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField26 = gJChronology25.weeks();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology25.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology25.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = gJChronology25.getZone();
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone29);
        org.joda.time.chrono.GJChronology gJChronology31 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone29);
        org.joda.time.Chronology chronology32 = gJChronology11.withZone(dateTimeZone29);
        org.joda.time.DurationField durationField33 = gJChronology11.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField33, durationField22, and durationField24", !(durationField33.compareTo(durationField22) == 0) || (Math.signum(durationField33.compareTo(durationField24)) == Math.signum(durationField22.compareTo(durationField24))));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.Instant instant7 = gJChronology3.getGregorianCutover();
        org.joda.time.DurationField durationField8 = gJChronology3.millis();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.minuteOfHour();
        org.joda.time.DurationField durationField10 = gJChronology3.eras();
        org.joda.time.DurationField durationField11 = gJChronology3.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField10", Math.signum(durationField8.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField8)));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.millis();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.hourOfHalfday();
        org.joda.time.DurationField durationField17 = gJChronology3.weeks();
        org.joda.time.DurationField durationField18 = gJChronology3.weeks();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology3.minuteOfDay();
        org.joda.time.DurationField durationField20 = gJChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField14, and durationField17", !(durationField20.compareTo(durationField14) == 0) || (Math.signum(durationField20.compareTo(durationField17)) == Math.signum(durationField14.compareTo(durationField17))));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, 1665L, (int) (short) 1);
        org.joda.time.DurationField durationField11 = gJChronology10.months();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology10.yearOfEra();
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology13.minuteOfHour();
        org.joda.time.DurationField durationField15 = gJChronology13.months();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone16, readableInstant17, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField20 = gJChronology19.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = gJChronology19.add(readablePeriod21, (long) (short) 1, (int) (byte) -1);
        long long29 = gJChronology19.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField30 = gJChronology19.seconds();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.chrono.GJChronology gJChronology34 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31, readableInstant32, (int) (short) 1);
        boolean boolean36 = gJChronology34.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField37 = gJChronology34.year();
        org.joda.time.DateTimeZone dateTimeZone38 = gJChronology34.getZone();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology34.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone40 = gJChronology34.getZone();
        org.joda.time.Chronology chronology41 = gJChronology19.withZone(dateTimeZone40);
        org.joda.time.Chronology chronology42 = gJChronology13.withZone(dateTimeZone40);
        org.joda.time.Chronology chronology43 = gJChronology10.withZone(dateTimeZone40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField15", (durationField11.compareTo(durationField15) == 0) == durationField11.equals(durationField15));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.millis();
        org.joda.time.DurationField durationField15 = gJChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology3.yearOfEra();
        org.joda.time.DurationField durationField18 = gJChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField14, and durationField15", !(durationField18.compareTo(durationField14) == 0) || (Math.signum(durationField18.compareTo(durationField15)) == Math.signum(durationField14.compareTo(durationField15))));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.millis();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology3.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = gJChronology3.add(readablePeriod19, 1665L, (-1));
        org.joda.time.DurationField durationField23 = gJChronology3.eras();
        org.joda.time.DurationField durationField24 = gJChronology3.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField23", Math.signum(durationField14.compareTo(durationField23)) == -Math.signum(durationField23.compareTo(durationField14)));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DurationField durationField7 = gJChronology3.days();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.dayOfWeek();
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology10.minuteOfHour();
        org.joda.time.DurationField durationField12 = gJChronology10.months();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13, readableInstant14, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField17 = gJChronology16.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = gJChronology16.add(readablePeriod18, (long) (short) 1, (int) (byte) -1);
        long long26 = gJChronology16.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField27 = gJChronology16.seconds();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.chrono.GJChronology gJChronology31 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28, readableInstant29, (int) (short) 1);
        boolean boolean33 = gJChronology31.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField34 = gJChronology31.year();
        org.joda.time.DateTimeZone dateTimeZone35 = gJChronology31.getZone();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology31.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone37 = gJChronology31.getZone();
        org.joda.time.Chronology chronology38 = gJChronology16.withZone(dateTimeZone37);
        org.joda.time.Chronology chronology39 = gJChronology10.withZone(dateTimeZone37);
        org.joda.time.chrono.GJChronology gJChronology40 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField41 = gJChronology40.weeks();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology40.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology40.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone44 = gJChronology40.getZone();
        org.joda.time.chrono.GJChronology gJChronology45 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.chrono.GJChronology gJChronology49 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone46, readableInstant47, (int) (short) 1);
        boolean boolean51 = gJChronology49.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField52 = gJChronology49.year();
        org.joda.time.Instant instant53 = gJChronology49.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology54 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone44, (org.joda.time.ReadableInstant) instant53);
        org.joda.time.chrono.GJChronology gJChronology55 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37, (org.joda.time.ReadableInstant) instant53);
        org.joda.time.Chronology chronology56 = gJChronology3.withZone(dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.chrono.GJChronology gJChronology60 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone57, readableInstant58, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField61 = gJChronology60.dayOfYear();
        org.joda.time.DurationField durationField62 = gJChronology60.weeks();
        org.joda.time.DateTimeField dateTimeField63 = gJChronology60.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField64 = gJChronology60.minuteOfHour();
        org.joda.time.Instant instant65 = gJChronology60.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology66 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37, (org.joda.time.ReadableInstant) instant65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField41 and durationField62", (durationField41.compareTo(durationField62) == 0) == durationField41.equals(durationField62));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.weeks();
        org.joda.time.DurationField durationField15 = gJChronology3.years();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.era();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = gJChronology3.add(readablePeriod17, (long) (short) -1, (int) (byte) 0);
        int int21 = gJChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology3.dayOfWeek();
        org.joda.time.DurationField durationField23 = gJChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField14, and durationField15", !(durationField23.compareTo(durationField14) == 0) || (Math.signum(durationField23.compareTo(durationField15)) == Math.signum(durationField14.compareTo(durationField15))));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        org.joda.time.Instant instant9 = gJChronology3.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.clockhourOfHalfday();
        org.joda.time.DurationField durationField11 = gJChronology3.eras();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology3.minuteOfHour();
        org.joda.time.DurationField durationField13 = gJChronology3.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField13, and durationField11", !(durationField11.compareTo(durationField13) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField13.compareTo(durationField11))));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DurationField durationField7 = gJChronology3.days();
        org.joda.time.DurationField durationField8 = gJChronology3.seconds();
        org.joda.time.DurationField durationField9 = gJChronology3.hours();
        org.joda.time.DurationField durationField10 = gJChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField7, and durationField8", !(durationField10.compareTo(durationField7) == 0) || (Math.signum(durationField10.compareTo(durationField8)) == Math.signum(durationField7.compareTo(durationField8))));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.monthOfYear();
        org.joda.time.DurationField durationField7 = gJChronology3.years();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.millisOfSecond();
        org.joda.time.DurationField durationField9 = gJChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField9", (durationField7.compareTo(durationField9) == 0) == durationField7.equals(durationField9));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DurationField durationField7 = gJChronology3.days();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.dayOfMonth();
        org.joda.time.DurationField durationField11 = gJChronology3.eras();
        org.joda.time.DurationField durationField12 = gJChronology3.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField11", Math.signum(durationField7.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField7)));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DurationField durationField7 = gJChronology3.days();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.dayOfWeek();
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology10.minuteOfHour();
        org.joda.time.DurationField durationField12 = gJChronology10.months();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13, readableInstant14, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField17 = gJChronology16.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = gJChronology16.add(readablePeriod18, (long) (short) 1, (int) (byte) -1);
        long long26 = gJChronology16.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField27 = gJChronology16.seconds();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.chrono.GJChronology gJChronology31 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28, readableInstant29, (int) (short) 1);
        boolean boolean33 = gJChronology31.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField34 = gJChronology31.year();
        org.joda.time.DateTimeZone dateTimeZone35 = gJChronology31.getZone();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology31.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone37 = gJChronology31.getZone();
        org.joda.time.Chronology chronology38 = gJChronology16.withZone(dateTimeZone37);
        org.joda.time.Chronology chronology39 = gJChronology10.withZone(dateTimeZone37);
        org.joda.time.chrono.GJChronology gJChronology40 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField41 = gJChronology40.weeks();
        org.joda.time.DateTimeField dateTimeField42 = gJChronology40.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology40.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone44 = gJChronology40.getZone();
        org.joda.time.chrono.GJChronology gJChronology45 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.chrono.GJChronology gJChronology49 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone46, readableInstant47, (int) (short) 1);
        boolean boolean51 = gJChronology49.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField52 = gJChronology49.year();
        org.joda.time.Instant instant53 = gJChronology49.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology54 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone44, (org.joda.time.ReadableInstant) instant53);
        org.joda.time.chrono.GJChronology gJChronology55 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37, (org.joda.time.ReadableInstant) instant53);
        org.joda.time.Chronology chronology56 = gJChronology3.withZone(dateTimeZone37);
        org.joda.time.chrono.GJChronology gJChronology59 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37, (long) ' ', 4);
        org.joda.time.DurationField durationField60 = gJChronology59.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField60, durationField7, and durationField12", !(durationField60.compareTo(durationField7) == 0) || (Math.signum(durationField60.compareTo(durationField12)) == Math.signum(durationField7.compareTo(durationField12))));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.year();
        org.joda.time.DurationField durationField6 = gJChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.dayOfMonth();
        org.joda.time.DurationField durationField8 = gJChronology3.weeks();
        org.joda.time.DurationField durationField9 = gJChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField6, and durationField8", !(durationField9.compareTo(durationField6) == 0) || (Math.signum(durationField9.compareTo(durationField8)) == Math.signum(durationField6.compareTo(durationField8))));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.era();
        org.joda.time.DurationField durationField6 = gJChronology3.days();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology3.minuteOfHour();
        org.joda.time.DurationField durationField8 = gJChronology3.eras();
        org.joda.time.Instant instant9 = gJChronology3.getGregorianCutover();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField8", Math.signum(durationField6.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField6)));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology11.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = gJChronology11.add(readablePeriod13, (long) (short) 1, (int) (byte) -1);
        long long21 = gJChronology11.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField22 = gJChronology11.millis();
        boolean boolean23 = gJChronology3.equals((java.lang.Object) gJChronology11);
        org.joda.time.DateTimeField dateTimeField24 = gJChronology3.halfdayOfDay();
        org.joda.time.DurationField durationField25 = gJChronology3.hours();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology3.centuryOfEra();
        org.joda.time.DurationField durationField27 = gJChronology3.halfdays();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        long long31 = gJChronology3.add(readablePeriod28, (-42L), (-1));
        org.joda.time.DateTimeField dateTimeField32 = gJChronology3.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.chrono.GJChronology gJChronology36 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone33, readableInstant34, (int) (short) 1);
        boolean boolean38 = gJChronology36.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField39 = gJChronology36.year();
        org.joda.time.DateTimeZone dateTimeZone40 = gJChronology36.getZone();
        org.joda.time.chrono.GJChronology gJChronology43 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone40, 1665L, (int) (short) 1);
        org.joda.time.DurationField durationField44 = gJChronology43.months();
        org.joda.time.DateTimeField dateTimeField45 = gJChronology43.yearOfEra();
        org.joda.time.DateTimeField dateTimeField46 = gJChronology43.millisOfSecond();
        boolean boolean47 = gJChronology3.equals((java.lang.Object) gJChronology43);
        org.joda.time.DurationField durationField48 = gJChronology43.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField48, durationField22, and durationField25", !(durationField48.compareTo(durationField22) == 0) || (Math.signum(durationField48.compareTo(durationField25)) == Math.signum(durationField22.compareTo(durationField25))));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.Instant instant7 = gJChronology3.getGregorianCutover();
        org.joda.time.DurationField durationField8 = gJChronology3.millis();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.year();
        org.joda.time.DurationField durationField10 = gJChronology3.minutes();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.yearOfEra();
        org.joda.time.DurationField durationField12 = gJChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField8, and durationField10", !(durationField12.compareTo(durationField8) == 0) || (Math.signum(durationField12.compareTo(durationField10)) == Math.signum(durationField8.compareTo(durationField10))));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.monthOfYear();
        org.joda.time.DurationField durationField7 = gJChronology3.years();
        org.joda.time.DurationField durationField8 = gJChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField8", (durationField7.compareTo(durationField8) == 0) == durationField7.equals(durationField8));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9, (int) (short) 1);
        boolean boolean13 = gJChronology11.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField14 = gJChronology11.year();
        org.joda.time.Instant instant15 = gJChronology11.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant15);
        org.joda.time.DurationField durationField17 = gJChronology16.seconds();
        org.joda.time.Instant instant18 = gJChronology16.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology16.hourOfDay();
        org.joda.time.DurationField durationField20 = gJChronology16.eras();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology16.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField20", Math.signum(durationField17.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField17)));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField1 = gJChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.centuryOfEra();
        org.joda.time.DurationField durationField5 = gJChronology0.eras();
        int int6 = gJChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField5", Math.signum(durationField1.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField1)));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.millisOfSecond();
        org.joda.time.DurationField durationField9 = gJChronology3.seconds();
        org.joda.time.Instant instant10 = gJChronology3.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.weekyear();
        org.joda.time.DurationField durationField12 = gJChronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology3.weekyear();
        org.joda.time.DurationField durationField14 = gJChronology3.weeks();
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology15.minuteOfHour();
        org.joda.time.DurationField durationField17 = gJChronology15.months();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, readableInstant19, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField22 = gJChronology21.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = gJChronology21.add(readablePeriod23, (long) (short) 1, (int) (byte) -1);
        long long31 = gJChronology21.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField32 = gJChronology21.seconds();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.chrono.GJChronology gJChronology36 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone33, readableInstant34, (int) (short) 1);
        boolean boolean38 = gJChronology36.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField39 = gJChronology36.year();
        org.joda.time.DateTimeZone dateTimeZone40 = gJChronology36.getZone();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology36.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone42 = gJChronology36.getZone();
        org.joda.time.Chronology chronology43 = gJChronology21.withZone(dateTimeZone42);
        org.joda.time.Chronology chronology44 = gJChronology15.withZone(dateTimeZone42);
        org.joda.time.chrono.GJChronology gJChronology45 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField46 = gJChronology45.weeks();
        org.joda.time.DateTimeField dateTimeField47 = gJChronology45.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField48 = gJChronology45.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone49 = gJChronology45.getZone();
        org.joda.time.chrono.GJChronology gJChronology50 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone49);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.chrono.GJChronology gJChronology54 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone51, readableInstant52, (int) (short) 1);
        boolean boolean56 = gJChronology54.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField57 = gJChronology54.year();
        org.joda.time.Instant instant58 = gJChronology54.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology59 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone49, (org.joda.time.ReadableInstant) instant58);
        org.joda.time.chrono.GJChronology gJChronology60 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone42, (org.joda.time.ReadableInstant) instant58);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.chrono.GJChronology gJChronology65 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone62, readableInstant63, (int) (short) 1);
        boolean boolean67 = gJChronology65.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField68 = gJChronology65.year();
        org.joda.time.DateTimeZone dateTimeZone69 = gJChronology65.getZone();
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.chrono.GJChronology gJChronology73 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone70, readableInstant71, (int) (short) 1);
        boolean boolean75 = gJChronology73.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField76 = gJChronology73.year();
        org.joda.time.Instant instant77 = gJChronology73.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology79 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone69, (org.joda.time.ReadableInstant) instant77, (int) (byte) 1);
        org.joda.time.chrono.GJChronology gJChronology80 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone61, (org.joda.time.ReadableInstant) instant77);
        org.joda.time.chrono.GJChronology gJChronology81 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone42, (org.joda.time.ReadableInstant) instant77);
        org.joda.time.Chronology chronology82 = gJChronology3.withZone(dateTimeZone42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField46", (durationField14.compareTo(durationField46) == 0) == durationField14.equals(durationField46));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DurationField durationField7 = gJChronology3.days();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.centuryOfEra();
        org.joda.time.DurationField durationField9 = gJChronology3.weekyears();
        org.joda.time.DurationField durationField10 = gJChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField7, and durationField9", !(durationField10.compareTo(durationField7) == 0) || (Math.signum(durationField10.compareTo(durationField9)) == Math.signum(durationField7.compareTo(durationField9))));
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DurationField durationField7 = gJChronology3.days();
        org.joda.time.DurationField durationField8 = gJChronology3.seconds();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology3.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology3.monthOfYear();
        org.joda.time.DurationField durationField14 = gJChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField7, and durationField8", !(durationField14.compareTo(durationField7) == 0) || (Math.signum(durationField14.compareTo(durationField8)) == Math.signum(durationField7.compareTo(durationField8))));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.weeks();
        org.joda.time.DurationField durationField15 = gJChronology3.years();
        org.joda.time.DurationField durationField16 = gJChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology3.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField16", (durationField15.compareTo(durationField16) == 0) == durationField15.equals(durationField16));
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField1 = gJChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.halfdayOfDay();
        org.joda.time.Chronology chronology5 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, readableInstant8, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology10.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = gJChronology10.add(readablePeriod12, (long) (short) 1, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone16 = gJChronology10.getZone();
        org.joda.time.Chronology chronology17 = gJChronology0.withZone(dateTimeZone16);
        org.joda.time.DurationField durationField18 = gJChronology0.centuries();
        org.joda.time.DurationField durationField19 = gJChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone20, readableInstant21, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField24 = gJChronology23.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        long long28 = gJChronology23.add(readablePeriod25, (long) (short) 1, (int) (byte) -1);
        long long33 = gJChronology23.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField34 = gJChronology23.weeks();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology23.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology23.millisOfDay();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology23.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology23.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.chrono.GJChronology gJChronology42 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone39, readableInstant40, (int) (short) 1);
        boolean boolean44 = gJChronology42.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField45 = gJChronology42.centuryOfEra();
        org.joda.time.DurationField durationField46 = gJChronology42.centuries();
        org.joda.time.DateTimeZone dateTimeZone47 = gJChronology42.getZone();
        org.joda.time.Chronology chronology48 = gJChronology23.withZone(dateTimeZone47);
        org.joda.time.Chronology chronology49 = gJChronology0.withZone(dateTimeZone47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField34", (durationField1.compareTo(durationField34) == 0) == durationField1.equals(durationField34));
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DurationField durationField7 = gJChronology3.days();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.centuryOfEra();
        org.joda.time.DurationField durationField9 = gJChronology3.years();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.millisOfDay();
        org.joda.time.DurationField durationField11 = gJChronology3.hours();
        org.joda.time.DurationField durationField12 = gJChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField7, and durationField9", !(durationField12.compareTo(durationField7) == 0) || (Math.signum(durationField12.compareTo(durationField9)) == Math.signum(durationField7.compareTo(durationField9))));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.millisOfSecond();
        org.joda.time.DurationField durationField9 = gJChronology3.seconds();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.millisOfSecond();
        java.lang.String str11 = gJChronology3.toString();
        org.joda.time.DurationField durationField12 = gJChronology3.halfdays();
        org.joda.time.DurationField durationField13 = gJChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField9, and durationField12", !(durationField13.compareTo(durationField9) == 0) || (Math.signum(durationField13.compareTo(durationField12)) == Math.signum(durationField9.compareTo(durationField12))));
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField1 = gJChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology0.halfdayOfDay();
        org.joda.time.Chronology chronology5 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, readableInstant8, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology10.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = gJChronology10.add(readablePeriod12, (long) (short) 1, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone16 = gJChronology10.getZone();
        org.joda.time.Chronology chronology17 = gJChronology0.withZone(dateTimeZone16);
        org.joda.time.DurationField durationField18 = gJChronology0.centuries();
        org.joda.time.DurationField durationField19 = gJChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology0.year();
        org.joda.time.DurationField durationField21 = gJChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField1, and durationField18", !(durationField21.compareTo(durationField1) == 0) || (Math.signum(durationField21.compareTo(durationField18)) == Math.signum(durationField1.compareTo(durationField18))));
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        java.lang.String str5 = gJChronology3.toString();
        org.joda.time.DurationField durationField6 = gJChronology3.eras();
        org.joda.time.DurationField durationField7 = gJChronology3.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField7, and durationField6", !(durationField6.compareTo(durationField7) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField7.compareTo(durationField6))));
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DurationField durationField7 = gJChronology3.weekyears();
        org.joda.time.DurationField durationField8 = gJChronology3.years();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField8", (durationField7.compareTo(durationField8) == 0) == durationField7.equals(durationField8));
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9, (int) (short) 1);
        boolean boolean13 = gJChronology11.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField14 = gJChronology11.year();
        org.joda.time.Instant instant15 = gJChronology11.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant15);
        org.joda.time.DurationField durationField17 = gJChronology16.seconds();
        org.joda.time.Instant instant18 = gJChronology16.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology16.clockhourOfDay();
        org.joda.time.DurationField durationField20 = gJChronology16.eras();
        org.joda.time.Instant instant21 = gJChronology16.getGregorianCutover();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField20", Math.signum(durationField17.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField17)));
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.Instant instant7 = gJChronology3.getGregorianCutover();
        org.joda.time.DurationField durationField8 = gJChronology3.millis();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField12 = gJChronology3.eras();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology3.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField12", Math.signum(durationField8.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField8)));
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField1 = gJChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology0.getZone();
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, readableInstant7, (int) (short) 1);
        boolean boolean11 = gJChronology9.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField12 = gJChronology9.year();
        org.joda.time.Instant instant13 = gJChronology9.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, (org.joda.time.ReadableInstant) instant13);
        org.joda.time.DateTimeField dateTimeField15 = gJChronology14.dayOfMonth();
        org.joda.time.DurationField durationField16 = gJChronology14.seconds();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology14.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology14.year();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19, readableInstant20, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField23 = gJChronology22.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = gJChronology22.add(readablePeriod24, (long) (short) 1, (int) (byte) -1);
        long long32 = gJChronology22.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField33 = gJChronology22.weeks();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology22.yearOfCentury();
        org.joda.time.Chronology chronology35 = gJChronology22.withUTC();
        org.joda.time.DurationField durationField36 = gJChronology22.days();
        boolean boolean37 = gJChronology14.equals((java.lang.Object) gJChronology22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField33", (durationField1.compareTo(durationField33) == 0) == durationField1.equals(durationField33));
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.millis();
        org.joda.time.DurationField durationField15 = gJChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.minuteOfDay();
        org.joda.time.DurationField durationField17 = gJChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, readableInstant19, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField22 = gJChronology21.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = gJChronology21.add(readablePeriod23, (long) (short) 1, (int) (byte) -1);
        org.joda.time.Instant instant27 = gJChronology21.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology21.clockhourOfHalfday();
        org.joda.time.DurationField durationField29 = gJChronology21.eras();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology21.minuteOfHour();
        org.joda.time.Chronology chronology31 = gJChronology21.withUTC();
        boolean boolean32 = gJChronology3.equals((java.lang.Object) gJChronology21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField29", Math.signum(durationField14.compareTo(durationField29)) == -Math.signum(durationField29.compareTo(durationField14)));
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.year();
        org.joda.time.Instant instant7 = gJChronology3.getGregorianCutover();
        org.joda.time.DurationField durationField8 = gJChronology3.millis();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology3.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField12 = gJChronology3.eras();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology3.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField12", Math.signum(durationField8.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField8)));
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.year();
        org.joda.time.DurationField durationField6 = gJChronology3.centuries();
        org.joda.time.DurationField durationField7 = gJChronology3.weekyears();
        long long13 = gJChronology3.getDateTimeMillis((-1L), (int) (short) 10, (int) (short) 10, (int) (byte) 1, (int) '4');
        org.joda.time.DateTimeField dateTimeField14 = gJChronology3.dayOfWeek();
        org.joda.time.DurationField durationField15 = gJChronology3.centuries();
        org.joda.time.DurationField durationField16 = gJChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField6, and durationField7", !(durationField16.compareTo(durationField6) == 0) || (Math.signum(durationField16.compareTo(durationField7)) == Math.signum(durationField6.compareTo(durationField7))));
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DurationField durationField7 = gJChronology3.days();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology3.centuryOfEra();
        org.joda.time.DurationField durationField9 = gJChronology3.years();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology3.millisOfDay();
        int int11 = gJChronology3.getMinimumDaysInFirstWeek();
        boolean boolean13 = gJChronology3.equals((java.lang.Object) (-49798948L));
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = gJChronology3.add(readablePeriod14, (long) (byte) 0, (int) '#');
        org.joda.time.DurationField durationField18 = gJChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology3.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField18", (durationField9.compareTo(durationField18) == 0) == durationField9.equals(durationField18));
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        boolean boolean5 = gJChronology3.equals((java.lang.Object) (byte) 0);
        java.lang.String str6 = gJChronology3.toString();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, readableInstant8, (int) (short) 1);
        boolean boolean12 = gJChronology10.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField13 = gJChronology10.year();
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology10.getZone();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15, readableInstant16, (int) (short) 1);
        boolean boolean20 = gJChronology18.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField21 = gJChronology18.year();
        org.joda.time.Instant instant22 = gJChronology18.getGregorianCutover();
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, (org.joda.time.ReadableInstant) instant22, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25, readableInstant26, (int) (short) 1);
        boolean boolean30 = gJChronology28.equals((java.lang.Object) (byte) 0);
        org.joda.time.DateTimeField dateTimeField31 = gJChronology28.year();
        org.joda.time.DateTimeZone dateTimeZone32 = gJChronology28.getZone();
        org.joda.time.Chronology chronology33 = gJChronology24.withZone(dateTimeZone32);
        org.joda.time.Chronology chronology34 = gJChronology3.withZone(dateTimeZone32);
        org.joda.time.DurationField durationField35 = gJChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology3.weekyear();
        org.joda.time.DurationField durationField37 = gJChronology3.years();
        org.joda.time.DurationField durationField38 = gJChronology3.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField35 and durationField37", (durationField35.compareTo(durationField37) == 0) == durationField35.equals(durationField37));
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone2, readableInstant3, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology5.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = gJChronology5.add(readablePeriod7, (long) (short) 1, (int) (byte) -1);
        long long15 = gJChronology5.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField16 = gJChronology5.seconds();
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology5.getZone();
        org.joda.time.Chronology chronology18 = gJChronology0.withZone(dateTimeZone17);
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField20 = gJChronology19.clockhourOfDay();
        org.joda.time.DurationField durationField21 = gJChronology19.centuries();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology19.minuteOfDay();
        org.joda.time.DurationField durationField23 = gJChronology19.seconds();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology19.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField23", (durationField16.compareTo(durationField23) == 0) == durationField16.equals(durationField23));
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField4 = gJChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology3.add(readablePeriod5, (long) (short) 1, (int) (byte) -1);
        long long13 = gJChronology3.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 10, 10);
        org.joda.time.DurationField durationField14 = gJChronology3.weekyears();
        java.lang.String str15 = gJChronology3.toString();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology3.minuteOfHour();
        org.joda.time.DurationField durationField17 = gJChronology3.weekyears();
        org.joda.time.DurationField durationField18 = gJChronology3.eras();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology3.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField18", Math.signum(durationField14.compareTo(durationField18)) == -Math.signum(durationField18.compareTo(durationField14)));
    }
}

