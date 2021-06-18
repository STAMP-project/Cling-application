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
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DurationField durationField3 = islamicChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField3, and durationField2", !(durationField2.compareTo(durationField3) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField3.compareTo(durationField2))));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField6", Math.signum(durationField3.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField3)));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField4 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfMinute();
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology6.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology6.dayOfWeek();
        boolean boolean9 = islamicChronology0.equals((java.lang.Object) islamicChronology6);
        org.joda.time.DurationField durationField10 = islamicChronology6.weeks();
        org.joda.time.DurationField durationField11 = islamicChronology6.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField10", (durationField4.compareTo(durationField10) == 0) == durationField4.equals(durationField10));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType5 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DurationField durationField6 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField3, and durationField6", !(durationField9.compareTo(durationField3) == 0) || (Math.signum(durationField9.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType5 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DurationField durationField6 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField3, and durationField6", !(durationField8.compareTo(durationField3) == 0) || (Math.signum(durationField8.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.eras();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField6", Math.signum(durationField3.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField3)));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.dayOfMonth();
        org.joda.time.DurationField durationField5 = islamicChronology1.eras();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology1.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField5", Math.signum(durationField3.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField3)));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.Chronology chronology3 = islamicChronology1.withUTC();
        org.joda.time.DurationField durationField4 = islamicChronology1.years();
        long long8 = islamicChronology1.add((long) 100, (long) (byte) 0, (int) (short) -1);
        org.joda.time.DurationField durationField9 = islamicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField11 = islamicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField4, and durationField9", !(durationField11.compareTo(durationField4) == 0) || (Math.signum(durationField11.compareTo(durationField9)) == Math.signum(durationField4.compareTo(durationField9))));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyear();
        org.joda.time.DurationField durationField5 = islamicChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField5, and durationField2", !(durationField2.compareTo(durationField5) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField5.compareTo(durationField2))));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.eras();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField6", Math.signum(durationField3.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField3)));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        long long9 = islamicChronology0.add((long) '#', (long) 10, (int) 'a');
        org.joda.time.DurationField durationField10 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField11 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField10", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField10)) == Math.signum(durationField3.compareTo(durationField10))));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology0.days();
        org.joda.time.DurationField durationField6 = islamicChronology0.millis();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType7 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.dayOfWeek();
        java.lang.String str9 = islamicChronology0.toString();
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField6", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType1 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0, leapYearPatternType1);
        org.joda.time.DurationField durationField3 = islamicChronology2.eras();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology2.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField5, and durationField3", !(durationField3.compareTo(durationField5) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField5.compareTo(durationField3))));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        boolean boolean3 = islamicChronology0.equals((java.lang.Object) (-1L));
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField7 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.joda.time.DurationField durationField9 = islamicChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField8", Math.signum(durationField9.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField9)));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField6", Math.signum(durationField3.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField3)));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField4 = islamicChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField4, and durationField2", !(durationField2.compareTo(durationField4) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField4.compareTo(durationField2))));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology0.days();
        org.joda.time.DurationField durationField6 = islamicChronology0.millis();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType7 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DurationField durationField8 = islamicChronology0.halfdays();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType9 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.minuteOfDay();
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology11.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = islamicChronology11.getZone();
        org.joda.time.DurationField durationField14 = islamicChronology11.months();
        org.joda.time.DurationField durationField15 = islamicChronology11.millis();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology11.dayOfYear();
        org.joda.time.Chronology chronology17 = islamicChronology11.withUTC();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology11.clockhourOfDay();
        boolean boolean19 = islamicChronology0.equals((java.lang.Object) dateTimeField18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField15", (durationField6.compareTo(durationField15) == 0) == durationField6.equals(durationField15));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology5.dayOfWeek();
        org.joda.time.DurationField durationField7 = islamicChronology5.halfdays();
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology8.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = islamicChronology8.getZone();
        org.joda.time.Chronology chronology11 = islamicChronology5.withZone(dateTimeZone10);
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType13 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10, leapYearPatternType13);
        org.joda.time.Chronology chronology15 = islamicChronology0.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField16 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField3, and durationField7", !(durationField16.compareTo(durationField3) == 0) || (Math.signum(durationField16.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology0.centuries();
        org.joda.time.Chronology chronology6 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField7 = islamicChronology0.months();
        org.joda.time.DurationField durationField8 = islamicChronology0.millis();
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField3, and durationField5", !(durationField9.compareTo(durationField3) == 0) || (Math.signum(durationField9.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField6 = islamicChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField6, and durationField2", !(durationField2.compareTo(durationField6) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField6.compareTo(durationField2))));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.hourOfHalfday();
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology6.clockhourOfDay();
        org.joda.time.DurationField durationField8 = islamicChronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology6.monthOfYear();
        boolean boolean11 = islamicChronology0.equals((java.lang.Object) dateTimeField10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField8", Math.signum(durationField3.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField3)));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        boolean boolean3 = islamicChronology0.equals((java.lang.Object) (-1L));
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.yearOfCentury();
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology9.clockhourOfDay();
        org.joda.time.DurationField durationField11 = islamicChronology9.eras();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology9.monthOfYear();
        boolean boolean14 = islamicChronology0.equals((java.lang.Object) dateTimeField13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField11", Math.signum(durationField6.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField6)));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField3 = islamicChronology0.months();
        org.joda.time.DurationField durationField4 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField6 = islamicChronology0.millis();
        org.joda.time.DurationField durationField7 = islamicChronology0.centuries();
        long long13 = islamicChronology0.getDateTimeMillis((long) (short) -1, (int) (short) 0, (int) (byte) 10, 10, 0);
        org.joda.time.DurationField durationField14 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField3, and durationField4", !(durationField14.compareTo(durationField3) == 0) || (Math.signum(durationField14.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField7 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.minuteOfHour();
        long long14 = islamicChronology0.add(1005L, 1L, 0);
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField17 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField3, and durationField5", !(durationField17.compareTo(durationField3) == 0) || (Math.signum(durationField17.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology1.years();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.dayOfWeek();
        long long8 = islamicChronology1.add((long) (byte) 100, (long) 'a', (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology1.millisOfDay();
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology11.minuteOfHour();
        org.joda.time.DurationField durationField13 = islamicChronology11.months();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = islamicChronology11.withZone(dateTimeZone14);
        boolean boolean16 = islamicChronology1.equals((java.lang.Object) dateTimeZone14);
        org.joda.time.DurationField durationField17 = islamicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology1.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField17", (durationField3.compareTo(durationField17) == 0) == durationField3.equals(durationField17));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology1.years();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology1.hourOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology1.weekyears();
        org.joda.time.DurationField durationField7 = islamicChronology1.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField6", (durationField3.compareTo(durationField6) == 0) == durationField3.equals(durationField6));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology1.years();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.dayOfWeek();
        long long8 = islamicChronology1.add((long) (byte) 100, (long) 'a', (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology1.millisOfDay();
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology11.minuteOfHour();
        org.joda.time.DurationField durationField13 = islamicChronology11.months();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = islamicChronology11.withZone(dateTimeZone14);
        boolean boolean16 = islamicChronology1.equals((java.lang.Object) dateTimeZone14);
        org.joda.time.DurationField durationField17 = islamicChronology1.weekyears();
        org.joda.time.DurationField durationField18 = islamicChronology1.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField17", (durationField18.compareTo(durationField17) == 0) == durationField18.equals(durationField17));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField3 = islamicChronology0.months();
        org.joda.time.DurationField durationField4 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField6 = islamicChronology0.millis();
        org.joda.time.DurationField durationField7 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField3, and durationField4", !(durationField8.compareTo(durationField3) == 0) || (Math.signum(durationField8.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.dayOfMonth();
        org.joda.time.DurationField durationField5 = islamicChronology1.eras();
        org.joda.time.DurationField durationField6 = islamicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField6", Math.signum(durationField3.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField3)));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.Chronology chronology3 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.eras();
        org.joda.time.DurationField durationField6 = islamicChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField6, and durationField5", !(durationField5.compareTo(durationField6) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField6.compareTo(durationField5))));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.dayOfMonth();
        org.joda.time.DurationField durationField5 = islamicChronology1.eras();
        java.lang.String str6 = islamicChronology1.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField5", Math.signum(durationField3.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField3)));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField4 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfMinute();
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology6.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology6.dayOfWeek();
        boolean boolean9 = islamicChronology0.equals((java.lang.Object) islamicChronology6);
        org.joda.time.DurationField durationField10 = islamicChronology6.weeks();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType11 = islamicChronology6.getLeapYearPatternType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField10", (durationField4.compareTo(durationField10) == 0) == durationField4.equals(durationField10));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfCentury();
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology6.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology6.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology6.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology6.secondOfMinute();
        org.joda.time.DurationField durationField11 = islamicChronology6.seconds();
        org.joda.time.DateTimeZone dateTimeZone12 = islamicChronology6.getZone();
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology14.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology14.secondOfMinute();
        org.joda.time.DurationField durationField17 = islamicChronology14.days();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology14.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology14.halfdayOfDay();
        org.joda.time.DurationField durationField20 = islamicChronology14.years();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology14.year();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType22 = islamicChronology14.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12, leapYearPatternType22);
        org.joda.time.Chronology chronology24 = islamicChronology0.withZone(dateTimeZone12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField11", Math.signum(durationField2.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField2)));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.dayOfMonth();
        org.joda.time.DurationField durationField5 = islamicChronology1.eras();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology1.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField5", Math.signum(durationField3.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField3)));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology1.years();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.dayOfWeek();
        long long8 = islamicChronology1.add((long) (byte) 100, (long) 'a', (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology1.millisOfDay();
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology11.minuteOfHour();
        org.joda.time.DurationField durationField13 = islamicChronology11.months();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = islamicChronology11.withZone(dateTimeZone14);
        boolean boolean16 = islamicChronology1.equals((java.lang.Object) dateTimeZone14);
        org.joda.time.DurationField durationField17 = islamicChronology1.weekyears();
        org.joda.time.DurationField durationField18 = islamicChronology1.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField17", (durationField3.compareTo(durationField17) == 0) == durationField3.equals(durationField17));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField4 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfMinute();
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology6.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology6.dayOfWeek();
        boolean boolean9 = islamicChronology0.equals((java.lang.Object) islamicChronology6);
        org.joda.time.DurationField durationField10 = islamicChronology6.weeks();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology6.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField10", (durationField4.compareTo(durationField10) == 0) == durationField4.equals(durationField10));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        int int5 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.yearOfCentury();
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology7.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology7.secondOfMinute();
        org.joda.time.DurationField durationField10 = islamicChronology7.days();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology7.centuryOfEra();
        org.joda.time.DurationField durationField12 = islamicChronology7.days();
        org.joda.time.DurationField durationField13 = islamicChronology7.millis();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType14 = islamicChronology7.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology7.era();
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology16.dayOfWeek();
        boolean boolean19 = islamicChronology16.equals((java.lang.Object) (-1L));
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology16.dayOfYear();
        org.joda.time.chrono.IslamicChronology islamicChronology21 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology21.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = islamicChronology21.getZone();
        org.joda.time.Chronology chronology24 = islamicChronology16.withZone(dateTimeZone23);
        org.joda.time.Chronology chronology25 = islamicChronology7.withZone(dateTimeZone23);
        org.joda.time.Chronology chronology26 = islamicChronology0.withZone(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField28 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField3, and durationField13", !(durationField28.compareTo(durationField3) == 0) || (Math.signum(durationField28.compareTo(durationField13)) == Math.signum(durationField3.compareTo(durationField13))));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField3 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology7.clockhourOfHalfday();
        boolean boolean9 = islamicChronology0.equals((java.lang.Object) islamicChronology7);
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology10.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology10.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology10.dayOfWeek();
        org.joda.time.DurationField durationField14 = islamicChronology10.centuries();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology10.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology10.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology10.monthOfYear();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology10.dayOfMonth();
        org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology19.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology19.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology19.millisOfSecond();
        org.joda.time.DurationField durationField23 = islamicChronology19.weeks();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology19.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology19.minuteOfHour();
        org.joda.time.DurationField durationField26 = islamicChronology19.hours();
        org.joda.time.DateTimeZone dateTimeZone27 = islamicChronology19.getZone();
        org.joda.time.Chronology chronology28 = islamicChronology10.withZone(dateTimeZone27);
        org.joda.time.Chronology chronology29 = islamicChronology7.withZone(dateTimeZone27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField23", (durationField3.compareTo(durationField23) == 0) == durationField3.equals(durationField23));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology1.dayOfYear();
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology6.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology6.getZone();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology6.centuryOfEra();
        boolean boolean10 = islamicChronology1.equals((java.lang.Object) dateTimeField9);
        org.joda.time.DurationField durationField11 = islamicChronology1.eras();
        org.joda.time.DurationField durationField12 = islamicChronology1.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField11", Math.signum(durationField3.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField3)));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField2 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.eras();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField5", Math.signum(durationField2.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField2)));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField3 = islamicChronology0.months();
        org.joda.time.DurationField durationField4 = islamicChronology0.millis();
        org.joda.time.DurationField durationField5 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = islamicChronology0.add(readablePeriod7, (long) ' ', 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField6", (durationField5.compareTo(durationField6) == 0) == durationField5.equals(durationField6));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.dayOfMonth();
        org.joda.time.DurationField durationField5 = islamicChronology1.eras();
        org.joda.time.DurationField durationField6 = islamicChronology1.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField5", Math.signum(durationField3.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField3)));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField6 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField3, and durationField5", !(durationField6.compareTo(durationField3) == 0) || (Math.signum(durationField6.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology0.eras();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField6, and durationField5", !(durationField5.compareTo(durationField6) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField6.compareTo(durationField5))));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology1.years();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.dayOfWeek();
        long long8 = islamicChronology1.add((long) (byte) 100, (long) 'a', (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology1.millisOfDay();
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology11.minuteOfHour();
        org.joda.time.DurationField durationField13 = islamicChronology11.months();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = islamicChronology11.withZone(dateTimeZone14);
        boolean boolean16 = islamicChronology1.equals((java.lang.Object) dateTimeZone14);
        org.joda.time.DurationField durationField17 = islamicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology1.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField17", (durationField3.compareTo(durationField17) == 0) == durationField3.equals(durationField17));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology1.years();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.dayOfWeek();
        long long8 = islamicChronology1.add((long) (byte) 100, (long) 'a', (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology1.millisOfDay();
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology11.minuteOfHour();
        org.joda.time.DurationField durationField13 = islamicChronology11.months();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = islamicChronology11.withZone(dateTimeZone14);
        boolean boolean16 = islamicChronology1.equals((java.lang.Object) dateTimeZone14);
        org.joda.time.DurationField durationField17 = islamicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology1.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField17", (durationField3.compareTo(durationField17) == 0) == durationField3.equals(durationField17));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField3, and durationField6", !(durationField8.compareTo(durationField3) == 0) || (Math.signum(durationField8.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology1.dayOfYear();
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology6.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology6.getZone();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology6.centuryOfEra();
        boolean boolean10 = islamicChronology1.equals((java.lang.Object) dateTimeField9);
        org.joda.time.DurationField durationField11 = islamicChronology1.eras();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology1.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField11", Math.signum(durationField3.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField3)));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField3 = islamicChronology0.months();
        org.joda.time.DurationField durationField4 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField6 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.weekyear();
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField3, and durationField4", !(durationField8.compareTo(durationField3) == 0) || (Math.signum(durationField8.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.secondOfMinute();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.dayOfMonth();
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology7.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology7.secondOfMinute();
        org.joda.time.DurationField durationField10 = islamicChronology7.days();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology7.minuteOfDay();
        int int12 = islamicChronology7.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology7.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = islamicChronology7.getZone();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType15 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14, leapYearPatternType15);
        org.joda.time.Chronology chronology17 = islamicChronology0.withZone(dateTimeZone14);
        org.joda.time.chrono.IslamicChronology islamicChronology18 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology18.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology18.secondOfMinute();
        org.joda.time.DurationField durationField21 = islamicChronology18.days();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology18.centuryOfEra();
        org.joda.time.DurationField durationField23 = islamicChronology18.days();
        org.joda.time.DurationField durationField24 = islamicChronology18.millis();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType25 = islamicChronology18.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology26 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14, leapYearPatternType25);
        org.joda.time.DurationField durationField27 = islamicChronology26.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField10, and durationField24", !(durationField27.compareTo(durationField10) == 0) || (Math.signum(durationField27.compareTo(durationField24)) == Math.signum(durationField10.compareTo(durationField24))));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField6", Math.signum(durationField3.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField3)));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField4 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfMinute();
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology6.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology6.getZone();
        boolean boolean9 = islamicChronology0.equals((java.lang.Object) dateTimeZone8);
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        int int11 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField10", Math.signum(durationField4.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField4)));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.monthOfYear();
        org.joda.time.DurationField durationField6 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField9", Math.signum(durationField6.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField6)));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.year();
        org.joda.time.DurationField durationField8 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.secondOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField10", (durationField6.compareTo(durationField10) == 0) == durationField6.equals(durationField10));
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        java.lang.String str1 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.secondOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField5", Math.signum(durationField3.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField3)));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.millisOfDay();
        long long8 = islamicChronology0.add((-1L), (long) 100, 0);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField11 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField13 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField11", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField11)) == Math.signum(durationField3.compareTo(durationField11))));
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology0.getZone();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.weekOfWeekyear();
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology8.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = islamicChronology8.getZone();
        org.joda.time.Chronology chronology11 = islamicChronology3.withZone(dateTimeZone10);
        org.joda.time.Chronology chronology12 = islamicChronology0.withZone(dateTimeZone10);
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField14 = islamicChronology13.eras();
        org.joda.time.DurationField durationField15 = islamicChronology13.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField15, and durationField14", !(durationField14.compareTo(durationField15) == 0) || (Math.signum(durationField14.compareTo(durationField14)) == Math.signum(durationField15.compareTo(durationField14))));
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology1.years();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology1.hourOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology1.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField6", (durationField3.compareTo(durationField6) == 0) == durationField3.equals(durationField6));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField3 = islamicChronology0.months();
        org.joda.time.DurationField durationField4 = islamicChronology0.millis();
        org.joda.time.DurationField durationField5 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = islamicChronology0.add(readablePeriod7, (long) 1, (int) 'a');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField6", (durationField5.compareTo(durationField6) == 0) == durationField5.equals(durationField6));
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        java.lang.String str1 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.secondOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology0.eras();
        org.joda.time.DurationField durationField6 = islamicChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField5", Math.signum(durationField3.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField3)));
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.Chronology chronology3 = islamicChronology1.withUTC();
        org.joda.time.DurationField durationField4 = islamicChronology1.years();
        long long8 = islamicChronology1.add((long) 100, (long) (byte) 0, (int) (short) -1);
        org.joda.time.DurationField durationField9 = islamicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology1.era();
        org.joda.time.DurationField durationField11 = islamicChronology1.millis();
        org.joda.time.DurationField durationField12 = islamicChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField4, and durationField9", !(durationField12.compareTo(durationField4) == 0) || (Math.signum(durationField12.compareTo(durationField9)) == Math.signum(durationField4.compareTo(durationField9))));
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField2 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.chrono.IslamicChronology islamicChronology4 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology4.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology4.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology4.millisOfSecond();
        org.joda.time.DurationField durationField8 = islamicChronology4.weeks();
        org.joda.time.DurationField durationField9 = islamicChronology4.centuries();
        org.joda.time.DateTimeZone dateTimeZone10 = islamicChronology4.getZone();
        org.joda.time.Chronology chronology11 = islamicChronology0.withZone(dateTimeZone10);
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology12.millisOfSecond();
        org.joda.time.DurationField durationField16 = islamicChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology12.secondOfMinute();
        org.joda.time.chrono.IslamicChronology islamicChronology18 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology18.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = islamicChronology18.getZone();
        boolean boolean21 = islamicChronology12.equals((java.lang.Object) dateTimeZone20);
        org.joda.time.Chronology chronology22 = islamicChronology0.withZone(dateTimeZone20);
        org.joda.time.DurationField durationField23 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology0.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField23", (durationField9.compareTo(durationField23) == 0) == durationField9.equals(durationField23));
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology6.millisOfDay();
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology8.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology8.millisOfSecond();
        org.joda.time.DurationField durationField12 = islamicChronology8.weeks();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology8.secondOfMinute();
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology14.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = islamicChronology14.getZone();
        boolean boolean17 = islamicChronology8.equals((java.lang.Object) dateTimeZone16);
        org.joda.time.Chronology chronology18 = islamicChronology6.withZone(dateTimeZone16);
        org.joda.time.Chronology chronology19 = islamicChronology0.withZone(dateTimeZone16);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType20 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_16_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology21 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16, leapYearPatternType20);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology21.year();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = islamicChronology21.add(readablePeriod23, (long) 10, (int) (byte) 10);
        org.joda.time.DurationField durationField27 = islamicChronology21.eras();
        org.joda.time.DateTimeZone dateTimeZone28 = islamicChronology21.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField12 and durationField27", Math.signum(durationField12.compareTo(durationField27)) == -Math.signum(durationField27.compareTo(durationField12)));
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology0.days();
        org.joda.time.DurationField durationField6 = islamicChronology0.millis();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType7 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.era();
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology9.dayOfWeek();
        boolean boolean12 = islamicChronology9.equals((java.lang.Object) (-1L));
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology9.dayOfYear();
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology14.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = islamicChronology14.getZone();
        org.joda.time.Chronology chronology17 = islamicChronology9.withZone(dateTimeZone16);
        org.joda.time.Chronology chronology18 = islamicChronology0.withZone(dateTimeZone16);
        org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology19.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology19.secondOfMinute();
        org.joda.time.DurationField durationField22 = islamicChronology19.days();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology19.minuteOfDay();
        int int24 = islamicChronology19.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology19.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone26 = islamicChronology19.getZone();
        org.joda.time.chrono.IslamicChronology islamicChronology27 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology27.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology27.clockhourOfHalfday();
        org.joda.time.DurationField durationField30 = islamicChronology27.minutes();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology27.year();
        org.joda.time.DurationField durationField32 = islamicChronology27.seconds();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType33 = islamicChronology27.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology34 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone26, leapYearPatternType33);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType35 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
        org.joda.time.chrono.IslamicChronology islamicChronology36 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone26, leapYearPatternType35);
        org.joda.time.chrono.IslamicChronology islamicChronology37 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16, leapYearPatternType35);
        org.joda.time.chrono.IslamicChronology islamicChronology38 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField39 = islamicChronology38.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology38.secondOfMinute();
        org.joda.time.DurationField durationField41 = islamicChronology38.days();
        org.joda.time.DateTimeField dateTimeField42 = islamicChronology38.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField43 = islamicChronology38.halfdayOfDay();
        org.joda.time.DurationField durationField44 = islamicChronology38.years();
        org.joda.time.DateTimeField dateTimeField45 = islamicChronology38.year();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType46 = islamicChronology38.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology47 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16, leapYearPatternType46);
        org.joda.time.DurationField durationField48 = islamicChronology47.weekyears();
        org.joda.time.DurationField durationField49 = islamicChronology47.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField44 and durationField48", (durationField44.compareTo(durationField48) == 0) == durationField44.equals(durationField48));
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.monthOfYear();
        org.joda.time.DurationField durationField6 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField9", Math.signum(durationField6.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField6)));
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.dayOfMonth();
        org.joda.time.DurationField durationField5 = islamicChronology1.eras();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology1.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField5", Math.signum(durationField3.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField3)));
    }
}

