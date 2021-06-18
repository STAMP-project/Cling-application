import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0Minimized {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField4", Math.signum(durationField3.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField3)));
    }

    @Test
    public void test02() throws Throwable {
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.millis();
        org.joda.time.DurationField durationField3 = iSOChronology1.hours();
        org.joda.time.DurationField durationField6 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField2, and durationField3", !(durationField6.compareTo(durationField2) == 0) || (Math.signum(durationField6.compareTo(durationField3)) == Math.signum(durationField2.compareTo(durationField3))));
    }

    @Test
    public void test03() throws Throwable {
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField4 = iSOChronology1.eras();
        org.joda.time.DurationField durationField5 = iSOChronology1.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField4", Math.signum(durationField5.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField5)));
    }

    @Test
    public void test04() throws Throwable {
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField4", Math.signum(durationField3.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField3)));
    }

    @Test
    public void test05() throws Throwable {
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField7 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField8 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField8", Math.signum(durationField7.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField7)));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField7 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField8 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField10 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField7, and durationField8", !(durationField10.compareTo(durationField7) == 0) || (Math.signum(durationField10.compareTo(durationField8)) == Math.signum(durationField7.compareTo(durationField8))));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DurationField durationField7 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField8 = iSOChronology1.eras();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField8", Math.signum(durationField7.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField7)));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.eras();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField4", Math.signum(durationField3.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField3)));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        java.lang.String str6 = iSOChronology1.toString();
        org.joda.time.DurationField durationField7 = iSOChronology1.millis();
        org.joda.time.DurationField durationField8 = iSOChronology1.eras();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField8", Math.signum(durationField7.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField7)));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.yearOfEra();
        org.joda.time.DurationField durationField7 = iSOChronology1.minutes();
        org.joda.time.DurationField durationField8 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField9 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField3, and durationField4", !(durationField9.compareTo(durationField3) == 0) || (Math.signum(durationField9.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField5 = iSOChronology1.years();
        org.joda.time.DurationField durationField6 = iSOChronology1.weekyears();
        long long10 = iSOChronology1.add(53L, (long) 0, (int) '#');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField6", (durationField5.compareTo(durationField6) == 0) == durationField5.equals(durationField6));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField5 = iSOChronology1.years();
        org.joda.time.DurationField durationField6 = iSOChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField6", (durationField5.compareTo(durationField6) == 0) == durationField5.equals(durationField6));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DurationField durationField5 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField8 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField2, and durationField5", !(durationField8.compareTo(durationField2) == 0) || (Math.signum(durationField8.compareTo(durationField5)) == Math.signum(durationField2.compareTo(durationField5))));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DurationField durationField7 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField8 = iSOChronology1.eras();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField8", Math.signum(durationField7.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField7)));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.dayOfMonth();
        org.joda.time.DurationField durationField5 = iSOChronology1.eras();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField5", Math.signum(durationField3.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField3)));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology6.clockhourOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology6.months();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology6.millisOfDay();
        boolean boolean10 = iSOChronology1.equals((java.lang.Object) dateTimeField9);
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField12 = iSOChronology1.eras();
        org.joda.time.DurationField durationField13 = iSOChronology1.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField12", Math.signum(durationField3.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField3)));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.millis();
        org.joda.time.DurationField durationField3 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.year();
        org.joda.time.DurationField durationField5 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField2, and durationField3", !(durationField5.compareTo(durationField2) == 0) || (Math.signum(durationField5.compareTo(durationField3)) == Math.signum(durationField2.compareTo(durationField3))));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField5 = iSOChronology1.years();
        org.joda.time.DurationField durationField6 = iSOChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField6", (durationField5.compareTo(durationField6) == 0) == durationField5.equals(durationField6));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField2 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField3 = iSOChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfMonth();
        org.joda.time.DurationField durationField5 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField2, and durationField3", !(durationField5.compareTo(durationField2) == 0) || (Math.signum(durationField5.compareTo(durationField3)) == Math.signum(durationField2.compareTo(durationField3))));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekyearOfCentury();
        org.joda.time.Chronology chronology8 = iSOChronology1.withUTC();
        org.joda.time.DurationField durationField9 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField3, and durationField4", !(durationField9.compareTo(durationField3) == 0) || (Math.signum(durationField9.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DurationField durationField7 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField8 = iSOChronology1.eras();
        java.lang.String str9 = iSOChronology1.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField8", Math.signum(durationField7.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField7)));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = iSOChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.chrono.ISOChronology iSOChronology4 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology4.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology4.era();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology4.era();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology4.millisOfDay();
        org.joda.time.DurationField durationField11 = iSOChronology4.halfdays();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology4.getZone();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology4.minuteOfHour();
        boolean boolean14 = iSOChronology0.equals((java.lang.Object) dateTimeField13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField11", Math.signum(durationField2.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField2)));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology6.clockhourOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology6.months();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology6.millisOfDay();
        boolean boolean10 = iSOChronology1.equals((java.lang.Object) dateTimeField9);
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField12 = iSOChronology1.eras();
        org.joda.time.Chronology chronology13 = iSOChronology1.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField12", Math.signum(durationField3.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField3)));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfSecond();
        org.joda.time.DurationField durationField6 = iSOChronology1.eras();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology8.dayOfYear();
        org.joda.time.DurationField durationField10 = iSOChronology8.seconds();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology8.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology8.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology16.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = iSOChronology16.getZone();
        org.joda.time.Chronology chronology20 = iSOChronology8.withZone(dateTimeZone19);
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.chrono.ISOChronology iSOChronology22 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology22.dayOfWeek();
        org.joda.time.DurationField durationField24 = iSOChronology22.days();
        boolean boolean25 = iSOChronology1.equals((java.lang.Object) iSOChronology22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField10", Math.signum(durationField6.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField6)));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        java.lang.String str15 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.chrono.ISOChronology iSOChronology19 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology19.dayOfYear();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology19.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = iSOChronology19.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone22);
        long long27 = iSOChronology23.add((long) (short) 100, (long) (byte) 0, (-1));
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.chrono.ISOChronology iSOChronology29 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology29.dayOfYear();
        org.joda.time.DurationField durationField31 = iSOChronology29.seconds();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology29.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology29.dayOfYear();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology29.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology29.hourOfDay();
        org.joda.time.DateTimeField dateTimeField36 = iSOChronology29.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        long long40 = iSOChronology29.add(readablePeriod37, (long) 'a', 0);
        org.joda.time.DateTimeField dateTimeField41 = iSOChronology29.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField42 = iSOChronology29.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.chrono.ISOChronology iSOChronology44 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone43);
        org.joda.time.DateTimeField dateTimeField45 = iSOChronology44.dayOfYear();
        org.joda.time.DateTimeField dateTimeField46 = iSOChronology44.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone47 = iSOChronology44.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology48 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone47);
        org.joda.time.chrono.ISOChronology iSOChronology49 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone47);
        org.joda.time.Chronology chronology50 = iSOChronology29.withZone(dateTimeZone47);
        org.joda.time.Chronology chronology51 = iSOChronology23.withZone(dateTimeZone47);
        org.joda.time.Chronology chronology52 = iSOChronology1.withZone(dateTimeZone47);
        org.joda.time.DurationField durationField53 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField54 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField54, durationField3, and durationField53", !(durationField54.compareTo(durationField3) == 0) || (Math.signum(durationField54.compareTo(durationField53)) == Math.signum(durationField3.compareTo(durationField53))));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField5 = iSOChronology1.years();
        org.joda.time.DurationField durationField6 = iSOChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField6", (durationField5.compareTo(durationField6) == 0) == durationField5.equals(durationField6));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DurationField durationField5 = iSOChronology1.weekyears();
        org.joda.time.DurationField durationField6 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.minuteOfDay();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField9 = iSOChronology8.millis();
        org.joda.time.DurationField durationField10 = iSOChronology8.years();
        java.lang.String str11 = iSOChronology8.toString();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.year();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology14.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology14.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology14.yearOfEra();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology14.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology14.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology21.dayOfYear();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology21.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = iSOChronology21.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology25 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone24);
        long long29 = iSOChronology25.add((long) (short) 100, (long) (byte) 0, (-1));
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology25.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.chrono.ISOChronology iSOChronology32 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone31);
        org.joda.time.DurationField durationField33 = iSOChronology32.halfdays();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology32.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology32.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone36 = iSOChronology32.getZone();
        org.joda.time.Chronology chronology37 = iSOChronology25.withZone(dateTimeZone36);
        org.joda.time.Chronology chronology38 = iSOChronology14.withZone(dateTimeZone36);
        boolean boolean39 = iSOChronology8.equals((java.lang.Object) dateTimeZone36);
        org.joda.time.Chronology chronology40 = iSOChronology1.withZone(dateTimeZone36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField10", (durationField5.compareTo(durationField10) == 0) == durationField5.equals(durationField10));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        java.lang.String str15 = iSOChronology1.toString();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone16);
        org.joda.time.DurationField durationField18 = iSOChronology17.halfdays();
        boolean boolean19 = iSOChronology1.equals((java.lang.Object) durationField18);
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField21 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology1.year();
        org.joda.time.DurationField durationField23 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField3, and durationField18", !(durationField23.compareTo(durationField3) == 0) || (Math.signum(durationField23.compareTo(durationField18)) == Math.signum(durationField3.compareTo(durationField18))));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.years();
        org.joda.time.DurationField durationField3 = iSOChronology1.eras();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField3", Math.signum(durationField2.compareTo(durationField3)) == -Math.signum(durationField3.compareTo(durationField2)));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DurationField durationField12 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.millisOfSecond();
        org.joda.time.DurationField durationField14 = iSOChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.dayOfYear();
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField17 = iSOChronology16.millis();
        org.joda.time.DurationField durationField18 = iSOChronology16.years();
        org.joda.time.DateTimeZone dateTimeZone19 = iSOChronology16.getZone();
        org.joda.time.Chronology chronology20 = iSOChronology1.withZone(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField18", (durationField14.compareTo(durationField18) == 0) == durationField14.equals(durationField18));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.years();
        org.joda.time.DurationField durationField3 = iSOChronology1.eras();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField3", Math.signum(durationField2.compareTo(durationField3)) == -Math.signum(durationField3.compareTo(durationField2)));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField7 = iSOChronology1.hours();
        org.joda.time.DurationField durationField8 = iSOChronology1.days();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.dayOfMonth();
        org.joda.time.DurationField durationField11 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField4", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone5 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField8 = iSOChronology1.eras();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField8", Math.signum(durationField2.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField2)));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        java.lang.String str6 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField9 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField10 = iSOChronology1.eras();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField10", Math.signum(durationField9.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField9)));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        java.lang.String str15 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.chrono.ISOChronology iSOChronology18 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone17);
        org.joda.time.DurationField durationField19 = iSOChronology18.halfdays();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology18.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology18.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone22);
        java.lang.String str24 = iSOChronology23.toString();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        long long28 = iSOChronology23.add(readablePeriod25, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone29 = iSOChronology23.getZone();
        org.joda.time.Chronology chronology30 = iSOChronology18.withZone(dateTimeZone29);
        org.joda.time.Chronology chronology31 = iSOChronology1.withZone(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField33 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField33, durationField3, and durationField19", !(durationField33.compareTo(durationField3) == 0) || (Math.signum(durationField33.compareTo(durationField19)) == Math.signum(durationField3.compareTo(durationField19))));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField2 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField3 = iSOChronology0.seconds();
        org.joda.time.chrono.ISOChronology iSOChronology4 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField5 = iSOChronology4.weeks();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology7.dayOfYear();
        org.joda.time.DurationField durationField9 = iSOChronology7.seconds();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology7.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology7.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.ISOChronology iSOChronology15 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology15.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology15.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = iSOChronology15.getZone();
        org.joda.time.Chronology chronology19 = iSOChronology7.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology7.weekOfWeekyear();
        java.lang.String str21 = iSOChronology7.toString();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology7.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.chrono.ISOChronology iSOChronology24 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone23);
        org.joda.time.DurationField durationField25 = iSOChronology24.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology24.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology24.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.chrono.ISOChronology iSOChronology29 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone28);
        java.lang.String str30 = iSOChronology29.toString();
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        long long34 = iSOChronology29.add(readablePeriod31, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone35 = iSOChronology29.getZone();
        org.joda.time.Chronology chronology36 = iSOChronology24.withZone(dateTimeZone35);
        org.joda.time.Chronology chronology37 = iSOChronology7.withZone(dateTimeZone35);
        org.joda.time.Chronology chronology38 = iSOChronology4.withZone(dateTimeZone35);
        boolean boolean39 = iSOChronology0.equals((java.lang.Object) chronology38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        java.lang.String str6 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField9 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField10 = iSOChronology1.eras();
        org.joda.time.DurationField durationField11 = iSOChronology1.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField10", Math.signum(durationField9.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField9)));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DurationField durationField12 = iSOChronology1.hours();
        org.joda.time.DurationField durationField13 = iSOChronology1.eras();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField12 and durationField13", Math.signum(durationField12.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField12)));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField2 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology13.yearOfEra();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.hourOfHalfday();
        org.joda.time.DurationField durationField17 = iSOChronology13.years();
        org.joda.time.DurationField durationField18 = iSOChronology13.weeks();
        org.joda.time.DateTimeZone dateTimeZone19 = iSOChronology13.getZone();
        org.joda.time.Chronology chronology20 = iSOChronology0.withZone(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField17", (durationField2.compareTo(durationField17) == 0) == durationField2.equals(durationField17));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        java.lang.String str6 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField9 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField10 = iSOChronology1.eras();
        org.joda.time.DurationField durationField11 = iSOChronology1.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField10", Math.signum(durationField9.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField9)));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DurationField durationField12 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.year();
        org.joda.time.Chronology chronology15 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.minuteOfDay();
        org.joda.time.DurationField durationField17 = iSOChronology1.eras();
        org.joda.time.DurationField durationField18 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField12 and durationField18", Math.signum(durationField12.compareTo(durationField18)) == -Math.signum(durationField18.compareTo(durationField12)));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.millisOfSecond();
        org.joda.time.DurationField durationField18 = iSOChronology1.hours();
        org.joda.time.DurationField durationField19 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField3, and durationField14", !(durationField19.compareTo(durationField3) == 0) || (Math.signum(durationField19.compareTo(durationField14)) == Math.signum(durationField3.compareTo(durationField14))));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.weekyear();
        org.joda.time.DurationField durationField7 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField9 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField3, and durationField4", !(durationField9.compareTo(durationField3) == 0) || (Math.signum(durationField9.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = iSOChronology1.weekyears();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField5 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField3, and durationField4", !(durationField5.compareTo(durationField3) == 0) || (Math.signum(durationField5.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.dayOfMonth();
        org.joda.time.DurationField durationField5 = iSOChronology1.eras();
        org.joda.time.DurationField durationField6 = iSOChronology1.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField5", Math.signum(durationField3.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField3)));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        java.lang.String str3 = iSOChronology0.toString();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology6.dayOfYear();
        org.joda.time.DurationField durationField8 = iSOChronology6.seconds();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology6.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology6.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology6.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology14.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology14.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = iSOChronology14.getZone();
        org.joda.time.Chronology chronology18 = iSOChronology6.withZone(dateTimeZone17);
        org.joda.time.DurationField durationField19 = iSOChronology6.hours();
        org.joda.time.DurationField durationField20 = iSOChronology6.months();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology6.secondOfDay();
        boolean boolean22 = iSOChronology0.equals((java.lang.Object) iSOChronology6);
        org.joda.time.DurationField durationField23 = iSOChronology0.centuries();
        org.joda.time.DurationField durationField24 = iSOChronology0.months();
        org.joda.time.DurationField durationField25 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField1, and durationField2", !(durationField25.compareTo(durationField1) == 0) || (Math.signum(durationField25.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        java.lang.String str6 = iSOChronology1.toString();
        org.joda.time.DurationField durationField7 = iSOChronology1.millis();
        org.joda.time.DurationField durationField8 = iSOChronology1.eras();
        java.lang.String str9 = iSOChronology1.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField8", Math.signum(durationField7.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField7)));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DurationField durationField12 = iSOChronology1.hours();
        org.joda.time.DurationField durationField13 = iSOChronology1.eras();
        java.lang.String str14 = iSOChronology1.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField12 and durationField13", Math.signum(durationField12.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField12)));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = iSOChronology1.add(readablePeriod7, (long) (byte) -1, 100);
        org.joda.time.DurationField durationField11 = iSOChronology1.years();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField13 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField4", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.dayOfMonth();
        org.joda.time.DurationField durationField5 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField3, and durationField5", !(durationField7.compareTo(durationField3) == 0) || (Math.signum(durationField7.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        java.lang.String str6 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField9 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField10 = iSOChronology1.eras();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField10", Math.signum(durationField9.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField9)));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.era();
        org.joda.time.DurationField durationField8 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.dayOfMonth();
        org.joda.time.DurationField durationField11 = iSOChronology1.eras();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField11", Math.signum(durationField8.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField8)));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology5.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology5.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology5.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology5.weekyear();
        org.joda.time.DurationField durationField10 = iSOChronology5.years();
        org.joda.time.DurationField durationField11 = iSOChronology5.eras();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology5.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField11", Math.signum(durationField10.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField10)));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DurationField durationField7 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField3, and durationField4", !(durationField7.compareTo(durationField3) == 0) || (Math.signum(durationField7.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone16);
        java.lang.String str18 = iSOChronology17.toString();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = iSOChronology17.add(readablePeriod19, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = iSOChronology17.getZone();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = iSOChronology17.add(readablePeriod24, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DurationField durationField28 = iSOChronology17.hours();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology17.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology17.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology17.year();
        boolean boolean32 = iSOChronology1.equals((java.lang.Object) iSOChronology17);
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField34 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField34, durationField3, and durationField28", !(durationField34.compareTo(durationField3) == 0) || (Math.signum(durationField34.compareTo(durationField28)) == Math.signum(durationField3.compareTo(durationField28))));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.millis();
        org.joda.time.DurationField durationField15 = iSOChronology1.years();
        org.joda.time.DurationField durationField16 = iSOChronology1.years();
        org.joda.time.DurationField durationField17 = iSOChronology1.millis();
        org.joda.time.DurationField durationField18 = iSOChronology1.millis();
        long long23 = iSOChronology1.getDateTimeMillis((int) (short) 0, (int) (byte) 1, 10, 0);
        org.joda.time.DurationField durationField24 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField25 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField3, and durationField14", !(durationField25.compareTo(durationField3) == 0) || (Math.signum(durationField25.compareTo(durationField14)) == Math.signum(durationField3.compareTo(durationField14))));
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DurationField durationField12 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.millisOfSecond();
        org.joda.time.DurationField durationField15 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.weekyear();
        org.joda.time.DurationField durationField17 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField12, and durationField15", !(durationField17.compareTo(durationField12) == 0) || (Math.signum(durationField17.compareTo(durationField15)) == Math.signum(durationField12.compareTo(durationField15))));
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField9 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField10 = iSOChronology1.years();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField13 = iSOChronology1.weekyears();
        long long17 = iSOChronology1.add((-82189990L), 10L, (int) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField13", (durationField10.compareTo(durationField13) == 0) == durationField10.equals(durationField13));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology7.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology7.era();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology7.era();
        java.lang.String str12 = iSOChronology7.toString();
        org.joda.time.DurationField durationField13 = iSOChronology7.millis();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology7.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology16.dayOfYear();
        org.joda.time.DurationField durationField18 = iSOChronology16.seconds();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology16.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology16.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology16.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.chrono.ISOChronology iSOChronology24 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology24.dayOfYear();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology24.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone27 = iSOChronology24.getZone();
        org.joda.time.Chronology chronology28 = iSOChronology16.withZone(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology16.weekOfWeekyear();
        java.lang.String str30 = iSOChronology16.toString();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology16.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.chrono.ISOChronology iSOChronology33 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone32);
        org.joda.time.DurationField durationField34 = iSOChronology33.halfdays();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology33.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField36 = iSOChronology33.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.chrono.ISOChronology iSOChronology38 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone37);
        java.lang.String str39 = iSOChronology38.toString();
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        long long43 = iSOChronology38.add(readablePeriod40, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone44 = iSOChronology38.getZone();
        org.joda.time.Chronology chronology45 = iSOChronology33.withZone(dateTimeZone44);
        org.joda.time.Chronology chronology46 = iSOChronology16.withZone(dateTimeZone44);
        org.joda.time.Chronology chronology47 = iSOChronology7.withZone(dateTimeZone44);
        org.joda.time.Chronology chronology48 = iSOChronology1.withZone(dateTimeZone44);
        org.joda.time.DurationField durationField49 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField49, durationField3, and durationField4", !(durationField49.compareTo(durationField3) == 0) || (Math.signum(durationField49.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.yearOfCentury();
        org.joda.time.DurationField durationField6 = iSOChronology1.weekyears();
        org.joda.time.DurationField durationField7 = iSOChronology1.years();
        org.joda.time.Chronology chronology8 = iSOChronology1.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField7", (durationField6.compareTo(durationField7) == 0) == durationField6.equals(durationField7));
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfMonth();
        org.joda.time.DurationField durationField6 = iSOChronology1.eras();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology1.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField8, and durationField6", !(durationField6.compareTo(durationField8) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField8.compareTo(durationField6))));
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField2 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.monthOfYear();
        org.joda.time.DurationField durationField5 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField5", (durationField2.compareTo(durationField5) == 0) == durationField2.equals(durationField5));
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.yearOfCentury();
        org.joda.time.DurationField durationField6 = iSOChronology1.weekyears();
        org.joda.time.DurationField durationField7 = iSOChronology1.years();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField7", (durationField6.compareTo(durationField7) == 0) == durationField6.equals(durationField7));
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.millisOfSecond();
        org.joda.time.DurationField durationField5 = iSOChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = iSOChronology1.eras();
        org.joda.time.DurationField durationField8 = iSOChronology1.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField7", Math.signum(durationField5.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField5)));
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.year();
        java.lang.String str8 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField10 = iSOChronology1.weeks();
        java.lang.String str11 = iSOChronology1.toString();
        org.joda.time.DurationField durationField12 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField3, and durationField4", !(durationField12.compareTo(durationField3) == 0) || (Math.signum(durationField12.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone5 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField8 = iSOChronology1.eras();
        org.joda.time.DurationField durationField9 = iSOChronology1.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField8", Math.signum(durationField2.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField2)));
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.millis();
        org.joda.time.DurationField durationField15 = iSOChronology1.years();
        org.joda.time.DurationField durationField16 = iSOChronology1.years();
        org.joda.time.DurationField durationField17 = iSOChronology1.weekyears();
        org.joda.time.DurationField durationField18 = iSOChronology1.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField18", (durationField15.compareTo(durationField18) == 0) == durationField15.equals(durationField18));
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.centuryOfEra();
        org.joda.time.DurationField durationField9 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField11 = iSOChronology1.weekyears();
        org.joda.time.DurationField durationField12 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField9, and durationField11", !(durationField12.compareTo(durationField9) == 0) || (Math.signum(durationField12.compareTo(durationField11)) == Math.signum(durationField9.compareTo(durationField11))));
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField2 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.monthOfYear();
        org.joda.time.DurationField durationField5 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField5", (durationField2.compareTo(durationField5) == 0) == durationField2.equals(durationField5));
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField5 = iSOChronology1.years();
        org.joda.time.DurationField durationField6 = iSOChronology1.years();
        org.joda.time.DurationField durationField7 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField3, and durationField5", !(durationField7.compareTo(durationField3) == 0) || (Math.signum(durationField7.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.yearOfCentury();
        org.joda.time.DurationField durationField6 = iSOChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField9 = iSOChronology1.eras();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField9", Math.signum(durationField6.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField6)));
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.secondOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField5 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField6 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField1, and durationField2", !(durationField6.compareTo(durationField1) == 0) || (Math.signum(durationField6.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology5.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology5.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology5.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology5.weekyear();
        org.joda.time.DurationField durationField10 = iSOChronology5.years();
        org.joda.time.DurationField durationField11 = iSOChronology5.eras();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology5.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField11", Math.signum(durationField10.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField10)));
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        long long7 = iSOChronology1.add(100L, (-1L), 0);
        org.joda.time.DurationField durationField8 = iSOChronology1.eras();
        org.joda.time.DurationField durationField9 = iSOChronology1.eras();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField11 = iSOChronology1.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField11, and durationField8", !(durationField8.compareTo(durationField11) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField11.compareTo(durationField8))));
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DurationField durationField5 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField6 = iSOChronology1.minutes();
        org.joda.time.DurationField durationField7 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField10 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField5, and durationField6", !(durationField10.compareTo(durationField5) == 0) || (Math.signum(durationField10.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField5 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.yearOfEra();
        org.joda.time.DurationField durationField9 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField2", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField9 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField10 = iSOChronology1.years();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField13 = iSOChronology1.weekyears();
        org.joda.time.DurationField durationField14 = iSOChronology1.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField13", (durationField10.compareTo(durationField13) == 0) == durationField10.equals(durationField13));
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.eras();
        org.joda.time.DurationField durationField5 = iSOChronology1.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField4", Math.signum(durationField3.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField3)));
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DurationField durationField7 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField8 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.year();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField11 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField7, and durationField8", !(durationField11.compareTo(durationField7) == 0) || (Math.signum(durationField11.compareTo(durationField8)) == Math.signum(durationField7.compareTo(durationField8))));
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test80");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone5 = iSOChronology1.getZone();
        org.joda.time.Chronology chronology6 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone12);
        org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone12);
        org.joda.time.chrono.ISOChronology iSOChronology15 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone12);
        org.joda.time.Chronology chronology16 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField17 = iSOChronology1.hours();
        org.joda.time.DurationField durationField18 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField2, and durationField17", !(durationField18.compareTo(durationField2) == 0) || (Math.signum(durationField18.compareTo(durationField17)) == Math.signum(durationField2.compareTo(durationField17))));
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test81");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField3 = iSOChronology1.hours();
        long long7 = iSOChronology1.add((long) '4', (-1L), (-1));
        org.joda.time.DurationField durationField8 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField10 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField11 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField2, and durationField3", !(durationField11.compareTo(durationField2) == 0) || (Math.signum(durationField11.compareTo(durationField3)) == Math.signum(durationField2.compareTo(durationField3))));
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test82");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.Chronology chronology6 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField13 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField4", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test83");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.millis();
        org.joda.time.DurationField durationField3 = iSOChronology1.hours();
        org.joda.time.DurationField durationField4 = iSOChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = iSOChronology1.years();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField9 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField2, and durationField3", !(durationField9.compareTo(durationField2) == 0) || (Math.signum(durationField9.compareTo(durationField3)) == Math.signum(durationField2.compareTo(durationField3))));
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test84");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField4 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField7 = iSOChronology1.eras();
        org.joda.time.DurationField durationField8 = iSOChronology1.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField7", Math.signum(durationField4.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField4)));
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test85");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology6.clockhourOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology6.months();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology6.millisOfDay();
        boolean boolean10 = iSOChronology1.equals((java.lang.Object) dateTimeField9);
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField12 = iSOChronology1.eras();
        org.joda.time.DurationField durationField13 = iSOChronology1.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField12", Math.signum(durationField3.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField3)));
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test86");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.millis();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        java.lang.String str4 = iSOChronology1.toString();
        org.joda.time.DurationField durationField5 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.DurationField durationField8 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField2, and durationField3", !(durationField8.compareTo(durationField2) == 0) || (Math.signum(durationField8.compareTo(durationField3)) == Math.signum(durationField2.compareTo(durationField3))));
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test87");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfHalfday();
        java.lang.String str8 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.dayOfMonth();
        org.joda.time.DurationField durationField10 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField11 = iSOChronology1.eras();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField11", Math.signum(durationField10.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField10)));
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test88");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.yearOfCentury();
        org.joda.time.DurationField durationField6 = iSOChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.year();
        long long11 = iSOChronology1.add((-62174390399903L), (-62174390399903L), 0);
        org.joda.time.DurationField durationField12 = iSOChronology1.eras();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField12", Math.signum(durationField6.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField6)));
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test89");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField15 = iSOChronology1.years();
        org.joda.time.DurationField durationField16 = iSOChronology1.eras();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField15 and durationField16", Math.signum(durationField15.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField15)));
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test90");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.year();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.DurationField durationField6 = iSOChronology5.years();
        org.joda.time.DurationField durationField7 = iSOChronology5.eras();
        boolean boolean8 = iSOChronology1.equals((java.lang.Object) durationField7);
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField7", Math.signum(durationField6.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField6)));
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test91");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField13 = iSOChronology1.eras();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.dayOfMonth();
        org.joda.time.DurationField durationField15 = iSOChronology1.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField15, and durationField13", !(durationField13.compareTo(durationField15) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField15.compareTo(durationField13))));
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test92");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField3 = iSOChronology1.weekyears();
        long long7 = iSOChronology1.add(2102035L, (-1L), (int) (byte) 100);
        org.joda.time.DurationField durationField8 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField9 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField2, and durationField3", !(durationField9.compareTo(durationField2) == 0) || (Math.signum(durationField9.compareTo(durationField3)) == Math.signum(durationField2.compareTo(durationField3))));
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test93");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField5 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology0.centuries();
        org.joda.time.DurationField durationField9 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField9", (durationField2.compareTo(durationField9) == 0) == durationField2.equals(durationField9));
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test94");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology6.clockhourOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology6.months();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology6.millisOfDay();
        boolean boolean10 = iSOChronology1.equals((java.lang.Object) dateTimeField9);
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField12 = iSOChronology1.eras();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField12", Math.signum(durationField3.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField3)));
    }
}
