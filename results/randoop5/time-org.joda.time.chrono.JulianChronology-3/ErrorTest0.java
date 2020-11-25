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
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology3.dayOfYear();
        boolean boolean5 = julianChronology0.equals((java.lang.Object) dateTimeField4);
        org.joda.time.DurationField durationField6 = julianChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField6", Math.signum(durationField2.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField2)));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = julianChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField2, and durationField6", !(durationField8.compareTo(durationField2) == 0) || (Math.signum(durationField8.compareTo(durationField6)) == Math.signum(durationField2.compareTo(durationField6))));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.DurationField durationField3 = julianChronology0.centuries();
        org.joda.time.chrono.JulianChronology julianChronology4 = org.joda.time.chrono.JulianChronology.getInstance();
        long long8 = julianChronology4.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField9 = julianChronology4.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology4.weekOfWeekyear();
        org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance();
        long long15 = julianChronology11.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str16 = julianChronology11.toString();
        org.joda.time.chrono.JulianChronology julianChronology17 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField18 = julianChronology17.millisOfDay();
        org.joda.time.DateTimeField dateTimeField19 = julianChronology17.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = julianChronology17.getZone();
        org.joda.time.Chronology chronology21 = julianChronology11.withZone(dateTimeZone20);
        org.joda.time.Chronology chronology22 = julianChronology4.withZone(dateTimeZone20);
        org.joda.time.Chronology chronology23 = julianChronology0.withZone(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField9", (durationField2.compareTo(durationField9) == 0) == durationField2.equals(durationField9));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = julianChronology0.months();
        org.joda.time.DurationField durationField4 = julianChronology0.eras();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField4", Math.signum(durationField3.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField3)));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.DurationField durationField6 = julianChronology0.months();
        org.joda.time.DurationField durationField7 = julianChronology0.hours();
        org.joda.time.chrono.JulianChronology julianChronology8 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology8.millisOfDay();
        org.joda.time.DurationField durationField10 = julianChronology8.seconds();
        org.joda.time.DurationField durationField11 = julianChronology8.eras();
        boolean boolean12 = julianChronology0.equals((java.lang.Object) durationField11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField5, and durationField7", !(durationField11.compareTo(durationField5) == 0) || (Math.signum(durationField11.compareTo(durationField7)) == Math.signum(durationField5.compareTo(durationField7))));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.eras();
        org.joda.time.DurationField durationField5 = julianChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField5, and durationField4", !(durationField4.compareTo(durationField5) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField5.compareTo(durationField4))));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = julianChronology0.months();
        org.joda.time.DurationField durationField4 = julianChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone5 = julianChronology0.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField4", Math.signum(durationField3.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField3)));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = julianChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField13 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology0.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField13", (durationField5.compareTo(durationField13) == 0) == durationField5.equals(durationField13));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology3.dayOfYear();
        boolean boolean5 = julianChronology0.equals((java.lang.Object) dateTimeField4);
        org.joda.time.DurationField durationField6 = julianChronology0.eras();
        org.joda.time.DurationField durationField7 = julianChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField6", Math.signum(durationField7.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField7)));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = julianChronology0.weekyears();
        long long14 = julianChronology0.getDateTimeMillis(52L, 0, 4, (int) (short) 10, (int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = julianChronology0.add(readablePeriod15, (long) 10, 10);
        org.joda.time.chrono.JulianChronology julianChronology19 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean21 = julianChronology19.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField22 = julianChronology19.halfdayOfDay();
        org.joda.time.DurationField durationField23 = julianChronology19.millis();
        org.joda.time.DateTimeField dateTimeField24 = julianChronology19.minuteOfHour();
        org.joda.time.DurationField durationField25 = julianChronology19.years();
        org.joda.time.DateTimeZone dateTimeZone26 = julianChronology19.getZone();
        org.joda.time.Chronology chronology27 = julianChronology0.withZone(dateTimeZone26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField25", (durationField8.compareTo(durationField25) == 0) == durationField8.equals(durationField25));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology3.dayOfYear();
        boolean boolean5 = julianChronology0.equals((java.lang.Object) dateTimeField4);
        org.joda.time.DurationField durationField6 = julianChronology0.eras();
        org.joda.time.Chronology chronology7 = julianChronology0.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField6", Math.signum(durationField2.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField2)));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = julianChronology0.months();
        org.joda.time.DurationField durationField4 = julianChronology0.eras();
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance();
        long long9 = julianChronology5.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField10 = julianChronology5.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology5.weekOfWeekyear();
        java.lang.String str12 = julianChronology5.toString();
        java.lang.String str13 = julianChronology5.toString();
        org.joda.time.DurationField durationField14 = julianChronology5.minutes();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology5.year();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology5.centuryOfEra();
        boolean boolean17 = julianChronology0.equals((java.lang.Object) dateTimeField16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField4", Math.signum(durationField3.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField3)));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = julianChronology0.hours();
        org.joda.time.DurationField durationField5 = julianChronology0.eras();
        org.joda.time.DurationField durationField6 = julianChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField5", Math.signum(durationField4.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField4)));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.eras();
        org.joda.time.DurationField durationField3 = julianChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField3, and durationField2", !(durationField2.compareTo(durationField3) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField3.compareTo(durationField2))));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology3.dayOfYear();
        boolean boolean5 = julianChronology0.equals((java.lang.Object) dateTimeField4);
        org.joda.time.DurationField durationField6 = julianChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField6", Math.signum(durationField2.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField2)));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = julianChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField13 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology0.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField13", (durationField5.compareTo(durationField13) == 0) == durationField5.equals(durationField13));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.hourOfDay();
        org.joda.time.DurationField durationField6 = julianChronology0.eras();
        org.joda.time.DurationField durationField7 = julianChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField6", Math.signum(durationField4.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField4)));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DurationField durationField3 = julianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField5 = julianChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField5", Math.signum(durationField3.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField3)));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.DurationField durationField9 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.millisOfSecond();
        org.joda.time.DurationField durationField11 = julianChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField5, and durationField9", !(durationField11.compareTo(durationField5) == 0) || (Math.signum(durationField11.compareTo(durationField9)) == Math.signum(durationField5.compareTo(durationField9))));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology3.dayOfYear();
        boolean boolean5 = julianChronology0.equals((java.lang.Object) dateTimeField4);
        org.joda.time.DurationField durationField6 = julianChronology0.eras();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = julianChronology0.add(readablePeriod7, 35L, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField6", Math.signum(durationField2.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField2)));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.eras();
        org.joda.time.DurationField durationField3 = julianChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField3, and durationField2", !(durationField2.compareTo(durationField3) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField3.compareTo(durationField2))));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DurationField durationField3 = julianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField5 = julianChronology0.eras();
        org.joda.time.DurationField durationField6 = julianChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField5", Math.signum(durationField3.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField3)));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = julianChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.centuryOfEra();
        org.joda.time.chrono.JulianChronology julianChronology14 = org.joda.time.chrono.JulianChronology.getInstance();
        long long18 = julianChronology14.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField19 = julianChronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = julianChronology14.weekOfWeekyear();
        org.joda.time.DurationField durationField21 = julianChronology14.days();
        org.joda.time.DateTimeField dateTimeField22 = julianChronology14.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone23 = julianChronology14.getZone();
        boolean boolean24 = julianChronology0.equals((java.lang.Object) julianChronology14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField19", (durationField5.compareTo(durationField19) == 0) == durationField5.equals(durationField19));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.Chronology chronology3 = julianChronology0.withUTC();
        int int4 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = julianChronology0.add(readablePeriod7, (long) 'a', 0);
        org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance();
        long long15 = julianChronology11.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField16 = julianChronology11.weekyears();
        org.joda.time.DateTimeZone dateTimeZone17 = julianChronology11.getZone();
        org.joda.time.Chronology chronology18 = julianChronology0.withZone(dateTimeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField16", (durationField2.compareTo(durationField16) == 0) == durationField2.equals(durationField16));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = julianChronology0.hours();
        org.joda.time.DurationField durationField5 = julianChronology0.eras();
        org.joda.time.DurationField durationField6 = julianChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField6", Math.signum(durationField4.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField4)));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = julianChronology0.eras();
        org.joda.time.DurationField durationField10 = julianChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField9", Math.signum(durationField7.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField7)));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.DurationField durationField9 = julianChronology0.minutes();
        org.joda.time.DurationField durationField10 = julianChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField5, and durationField9", !(durationField10.compareTo(durationField5) == 0) || (Math.signum(durationField10.compareTo(durationField9)) == Math.signum(durationField5.compareTo(durationField9))));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = julianChronology0.months();
        org.joda.time.DurationField durationField4 = julianChronology0.eras();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField4", Math.signum(durationField3.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField3)));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = julianChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField8", (durationField5.compareTo(durationField8) == 0) == durationField5.equals(durationField8));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = julianChronology0.months();
        org.joda.time.DurationField durationField4 = julianChronology0.eras();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField4", Math.signum(durationField3.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField3)));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = julianChronology0.halfdays();
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean9 = julianChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = julianChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology7.monthOfYear();
        boolean boolean12 = julianChronology0.equals((java.lang.Object) julianChronology7);
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField14 = julianChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology0.hourOfDay();
        org.joda.time.DurationField durationField17 = julianChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField6, and durationField14", !(durationField17.compareTo(durationField6) == 0) || (Math.signum(durationField17.compareTo(durationField14)) == Math.signum(durationField6.compareTo(durationField14))));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.clockhourOfDay();
        java.lang.String str9 = julianChronology0.toString();
        org.joda.time.DurationField durationField10 = julianChronology0.eras();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField10", Math.signum(durationField5.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField5)));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = julianChronology0.hours();
        org.joda.time.DurationField durationField5 = julianChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField5", Math.signum(durationField4.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField4)));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology9.weekyear();
        org.joda.time.DurationField durationField11 = julianChronology9.years();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = julianChronology9.add(readablePeriod12, (long) (-1), (int) (byte) 100);
        org.joda.time.chrono.JulianChronology julianChronology16 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean18 = julianChronology16.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField19 = julianChronology16.halfdayOfDay();
        org.joda.time.DurationField durationField20 = julianChronology16.millis();
        org.joda.time.DurationField durationField21 = julianChronology16.days();
        org.joda.time.DateTimeField dateTimeField22 = julianChronology16.yearOfCentury();
        boolean boolean23 = julianChronology9.equals((java.lang.Object) julianChronology16);
        org.joda.time.DateTimeField dateTimeField24 = julianChronology9.yearOfCentury();
        boolean boolean25 = julianChronology0.equals((java.lang.Object) julianChronology9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField11", (durationField5.compareTo(durationField11) == 0) == durationField5.equals(durationField11));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = julianChronology0.eras();
        org.joda.time.DurationField durationField10 = julianChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField9", Math.signum(durationField7.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField7)));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.DurationField durationField6 = julianChronology0.months();
        org.joda.time.DurationField durationField7 = julianChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone8 = julianChronology0.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField7", Math.signum(durationField5.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField5)));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.DurationField durationField9 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.yearOfCentury();
        org.joda.time.DurationField durationField13 = julianChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField5, and durationField9", !(durationField13.compareTo(durationField5) == 0) || (Math.signum(durationField13.compareTo(durationField9)) == Math.signum(durationField5.compareTo(durationField9))));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField6 = julianChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField6", Math.signum(durationField4.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField4)));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = julianChronology0.hours();
        org.joda.time.DurationField durationField5 = julianChronology0.eras();
        org.joda.time.DurationField durationField6 = julianChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField5", Math.signum(durationField4.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField4)));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        long long9 = julianChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DateTimeZone dateTimeZone10 = julianChronology0.getZone();
        long long14 = julianChronology0.add((long) (byte) 1, (long) (-1), (int) (byte) 100);
        org.joda.time.DurationField durationField15 = julianChronology0.eras();
        org.joda.time.DurationField durationField16 = julianChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField15", Math.signum(durationField4.compareTo(durationField15)) == -Math.signum(durationField15.compareTo(durationField4)));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = julianChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField8", (durationField5.compareTo(durationField8) == 0) == durationField5.equals(durationField8));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        java.lang.String str6 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.minuteOfDay();
        org.joda.time.DurationField durationField8 = julianChronology0.eras();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField8", Math.signum(durationField5.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField5)));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = julianChronology0.months();
        org.joda.time.DurationField durationField4 = julianChronology0.eras();
        java.lang.String str5 = julianChronology0.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField4", Math.signum(durationField3.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField3)));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.DurationField durationField3 = julianChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField3", Math.signum(durationField2.compareTo(durationField3)) == -Math.signum(durationField3.compareTo(durationField2)));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.yearOfCentury();
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.dayOfYear();
        org.joda.time.DurationField durationField7 = julianChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField7", Math.signum(durationField5.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField5)));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.DurationField durationField9 = julianChronology0.minutes();
        org.joda.time.DurationField durationField10 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField12 = julianChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField5, and durationField9", !(durationField12.compareTo(durationField5) == 0) || (Math.signum(durationField12.compareTo(durationField9)) == Math.signum(durationField5.compareTo(durationField9))));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = julianChronology0.weeks();
        org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology9.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Chronology chronology12 = julianChronology9.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = julianChronology9.dayOfWeek();
        java.lang.String str14 = julianChronology9.toString();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology9.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology9.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology9.weekyearOfCentury();
        org.joda.time.DurationField durationField18 = julianChronology9.centuries();
        org.joda.time.DateTimeField dateTimeField19 = julianChronology9.weekyear();
        org.joda.time.DurationField durationField20 = julianChronology9.eras();
        boolean boolean21 = julianChronology0.equals((java.lang.Object) julianChronology9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField20", Math.signum(durationField2.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField2)));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.hourOfDay();
        org.joda.time.DurationField durationField6 = julianChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField6", Math.signum(durationField4.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField4)));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = julianChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean7 = julianChronology5.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField8 = julianChronology5.halfdayOfDay();
        org.joda.time.DurationField durationField9 = julianChronology5.millis();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology5.minuteOfHour();
        org.joda.time.DurationField durationField11 = julianChronology5.years();
        org.joda.time.DateTimeZone dateTimeZone12 = julianChronology5.getZone();
        org.joda.time.Chronology chronology13 = julianChronology0.withZone(dateTimeZone12);
        org.joda.time.chrono.JulianChronology julianChronology14 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField15 = julianChronology14.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField9, and durationField11", !(durationField15.compareTo(durationField9) == 0) || (Math.signum(durationField15.compareTo(durationField11)) == Math.signum(durationField9.compareTo(durationField11))));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = julianChronology0.eras();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField9", Math.signum(durationField7.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField7)));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = julianChronology0.centuries();
        org.joda.time.DurationField durationField8 = julianChronology0.eras();
        org.joda.time.DurationField durationField9 = julianChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField8", Math.signum(durationField7.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField7)));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.millisOfSecond();
        org.joda.time.DurationField durationField10 = julianChronology0.months();
        org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance();
        long long15 = julianChronology11.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField16 = julianChronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology11.weekOfWeekyear();
        org.joda.time.DurationField durationField18 = julianChronology11.days();
        org.joda.time.DateTimeField dateTimeField19 = julianChronology11.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone20 = julianChronology11.getZone();
        org.joda.time.Chronology chronology21 = julianChronology0.withZone(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField16", (durationField2.compareTo(durationField16) == 0) == durationField2.equals(durationField16));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = julianChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField13 = julianChronology0.weekyears();
        org.joda.time.DurationField durationField14 = julianChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField13", (durationField5.compareTo(durationField13) == 0) == durationField5.equals(durationField13));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = julianChronology0.halfdays();
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean9 = julianChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = julianChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology7.monthOfYear();
        boolean boolean12 = julianChronology0.equals((java.lang.Object) julianChronology7);
        org.joda.time.DurationField durationField13 = julianChronology7.centuries();
        org.joda.time.DurationField durationField14 = julianChronology7.centuries();
        org.joda.time.DurationField durationField15 = julianChronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField6, and durationField13", !(durationField15.compareTo(durationField6) == 0) || (Math.signum(durationField15.compareTo(durationField13)) == Math.signum(durationField6.compareTo(durationField13))));
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = julianChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField2, and durationField4", !(durationField6.compareTo(durationField2) == 0) || (Math.signum(durationField6.compareTo(durationField4)) == Math.signum(durationField2.compareTo(durationField4))));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (-1), (int) (byte) 100);
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean9 = julianChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = julianChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField11 = julianChronology7.millis();
        org.joda.time.DurationField durationField12 = julianChronology7.days();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology7.yearOfCentury();
        boolean boolean14 = julianChronology0.equals((java.lang.Object) julianChronology7);
        long long18 = julianChronology7.add((long) (short) -1, 9L, (int) (short) 100);
        org.joda.time.DurationField durationField19 = julianChronology7.weekyears();
        org.joda.time.DurationField durationField20 = julianChronology7.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField19", (durationField2.compareTo(durationField19) == 0) == durationField2.equals(durationField19));
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        java.lang.String str5 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField9 = julianChronology0.centuries();
        java.lang.String str10 = julianChronology0.toString();
        org.joda.time.DurationField durationField11 = julianChronology0.eras();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField11", Math.signum(durationField9.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField9)));
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = julianChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField13 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology0.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField13", (durationField5.compareTo(durationField13) == 0) == durationField5.equals(durationField13));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        java.lang.String str5 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField9 = julianChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField11 = julianChronology0.eras();
        org.joda.time.DurationField durationField12 = julianChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField11", Math.signum(durationField9.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField9)));
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = julianChronology0.halfdays();
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean9 = julianChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = julianChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology7.monthOfYear();
        boolean boolean12 = julianChronology0.equals((java.lang.Object) julianChronology7);
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField15 = julianChronology0.eras();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology0.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField15", Math.signum(durationField6.compareTo(durationField15)) == -Math.signum(durationField15.compareTo(durationField6)));
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField6 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.dayOfYear();
        org.joda.time.DurationField durationField8 = julianChronology0.days();
        org.joda.time.DurationField durationField9 = julianChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.yearOfCentury();
        org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance();
        long long15 = julianChronology11.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField16 = julianChronology11.years();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology11.era();
        org.joda.time.DurationField durationField18 = julianChronology11.years();
        org.joda.time.DateTimeField dateTimeField19 = julianChronology11.secondOfMinute();
        boolean boolean20 = julianChronology0.equals((java.lang.Object) julianChronology11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField16", (durationField6.compareTo(durationField16) == 0) == durationField6.equals(durationField16));
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology6.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology6.hourOfDay();
        org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance();
        long long13 = julianChronology9.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField14 = julianChronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology9.weekOfWeekyear();
        org.joda.time.DurationField durationField16 = julianChronology9.days();
        boolean boolean17 = julianChronology6.equals((java.lang.Object) julianChronology9);
        org.joda.time.DateTimeZone dateTimeZone18 = julianChronology9.getZone();
        org.joda.time.Chronology chronology19 = julianChronology0.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = julianChronology0.dayOfYear();
        org.joda.time.DurationField durationField21 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField22 = julianChronology0.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField21", (durationField14.compareTo(durationField21) == 0) == durationField14.equals(durationField21));
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.hourOfDay();
        org.joda.time.DurationField durationField6 = julianChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField6", Math.signum(durationField4.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField4)));
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = julianChronology6.halfdays();
        org.joda.time.DurationField durationField8 = julianChronology6.seconds();
        org.joda.time.DurationField durationField9 = julianChronology6.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField7, and durationField8", !(durationField9.compareTo(durationField7) == 0) || (Math.signum(durationField9.compareTo(durationField8)) == Math.signum(durationField7.compareTo(durationField8))));
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance();
        long long7 = julianChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = julianChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = julianChronology3.days();
        boolean boolean11 = julianChronology0.equals((java.lang.Object) julianChronology3);
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField14 = julianChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField8, and durationField10", !(durationField14.compareTo(durationField8) == 0) || (Math.signum(durationField14.compareTo(durationField10)) == Math.signum(durationField8.compareTo(durationField10))));
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = julianChronology0.getZone();
        org.joda.time.DurationField durationField11 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField11", (durationField2.compareTo(durationField11) == 0) == durationField2.equals(durationField11));
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.yearOfCentury();
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.dayOfYear();
        org.joda.time.DurationField durationField7 = julianChronology0.eras();
        org.joda.time.DurationField durationField8 = julianChronology0.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField7", Math.signum(durationField8.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField8)));
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = julianChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean7 = julianChronology5.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField8 = julianChronology5.halfdayOfDay();
        org.joda.time.DurationField durationField9 = julianChronology5.millis();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology5.minuteOfHour();
        org.joda.time.DurationField durationField11 = julianChronology5.years();
        org.joda.time.DateTimeZone dateTimeZone12 = julianChronology5.getZone();
        org.joda.time.Chronology chronology13 = julianChronology0.withZone(dateTimeZone12);
        org.joda.time.chrono.JulianChronology julianChronology14 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone12);
        org.joda.time.Chronology chronology15 = julianChronology14.withUTC();
        org.joda.time.DurationField durationField16 = julianChronology14.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField9, and durationField11", !(durationField16.compareTo(durationField9) == 0) || (Math.signum(durationField16.compareTo(durationField11)) == Math.signum(durationField9.compareTo(durationField11))));
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        java.lang.String str5 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField9 = julianChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField11 = julianChronology0.eras();
        java.lang.String str12 = julianChronology0.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField11", Math.signum(durationField9.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField9)));
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = julianChronology0.months();
        org.joda.time.DurationField durationField4 = julianChronology0.eras();
        org.joda.time.DurationField durationField5 = julianChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField4", Math.signum(durationField3.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField3)));
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = julianChronology0.weekyears();
        org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology9.weekyear();
        org.joda.time.DurationField durationField11 = julianChronology9.years();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology9.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology9.hourOfHalfday();
        org.joda.time.DurationField durationField15 = julianChronology9.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology9.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = julianChronology9.weekyear();
        org.joda.time.DateTimeZone dateTimeZone19 = julianChronology9.getZone();
        org.joda.time.Chronology chronology20 = julianChronology0.withZone(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField11", (durationField8.compareTo(durationField11) == 0) == durationField8.equals(durationField11));
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.DurationField durationField9 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.centuryOfEra();
        org.joda.time.chrono.JulianChronology julianChronology12 = org.joda.time.chrono.JulianChronology.getInstance();
        long long16 = julianChronology12.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField17 = julianChronology12.years();
        org.joda.time.chrono.JulianChronology julianChronology18 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean20 = julianChronology18.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField21 = julianChronology18.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = julianChronology18.getZone();
        org.joda.time.DateTimeZone dateTimeZone23 = julianChronology18.getZone();
        org.joda.time.Chronology chronology24 = julianChronology12.withZone(dateTimeZone23);
        org.joda.time.Chronology chronology25 = julianChronology0.withZone(dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField17", (durationField5.compareTo(durationField17) == 0) == durationField5.equals(durationField17));
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = julianChronology0.centuries();
        org.joda.time.DurationField durationField8 = julianChronology0.eras();
        int int9 = julianChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField8", Math.signum(durationField7.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField7)));
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology3.dayOfYear();
        boolean boolean5 = julianChronology0.equals((java.lang.Object) dateTimeField4);
        org.joda.time.DurationField durationField6 = julianChronology0.eras();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = julianChronology0.add(readablePeriod7, (long) (short) 10, 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField6", Math.signum(durationField2.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField2)));
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField6 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.dayOfYear();
        org.joda.time.DurationField durationField8 = julianChronology0.days();
        org.joda.time.DurationField durationField9 = julianChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.dayOfYear();
        org.joda.time.DurationField durationField11 = julianChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField4, and durationField6", !(durationField11.compareTo(durationField4) == 0) || (Math.signum(durationField11.compareTo(durationField6)) == Math.signum(durationField4.compareTo(durationField6))));
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = julianChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField8", (durationField5.compareTo(durationField8) == 0) == durationField5.equals(durationField8));
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        org.joda.time.DurationField durationField8 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.clockhourOfHalfday();
        org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean13 = julianChronology11.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField14 = julianChronology11.halfdayOfDay();
        org.joda.time.DurationField durationField15 = julianChronology11.millis();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology11.minuteOfHour();
        org.joda.time.DurationField durationField17 = julianChronology11.years();
        org.joda.time.DateTimeZone dateTimeZone18 = julianChronology11.getZone();
        org.joda.time.Chronology chronology19 = julianChronology0.withZone(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField17", (durationField5.compareTo(durationField17) == 0) == durationField5.equals(durationField17));
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = julianChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = julianChronology0.seconds();
        org.joda.time.DurationField durationField7 = julianChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField7", Math.signum(durationField6.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField6)));
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = julianChronology0.hours();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.minuteOfDay();
        org.joda.time.DurationField durationField7 = julianChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField4, and durationField5", !(durationField7.compareTo(durationField4) == 0) || (Math.signum(durationField7.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test80");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = julianChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField8", (durationField5.compareTo(durationField8) == 0) == durationField5.equals(durationField8));
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test81");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField4 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField4", (durationField2.compareTo(durationField4) == 0) == durationField2.equals(durationField4));
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test82");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = julianChronology0.weeks();
        org.joda.time.DurationField durationField8 = julianChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField5, and durationField7", !(durationField8.compareTo(durationField5) == 0) || (Math.signum(durationField8.compareTo(durationField7)) == Math.signum(durationField5.compareTo(durationField7))));
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test83");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = julianChronology0.hours();
        org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology9.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology9.halfdayOfDay();
        java.lang.String str13 = julianChronology9.toString();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology9.dayOfWeek();
        org.joda.time.DurationField durationField15 = julianChronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology9.secondOfDay();
        boolean boolean17 = julianChronology0.equals((java.lang.Object) dateTimeField16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField15", (durationField2.compareTo(durationField15) == 0) == durationField2.equals(durationField15));
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test84");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = julianChronology0.getZone();
        org.joda.time.DurationField durationField11 = julianChronology0.weekyears();
        org.joda.time.chrono.JulianChronology julianChronology12 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology12.era();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology12.hourOfDay();
        boolean boolean16 = julianChronology0.equals((java.lang.Object) julianChronology12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField11", (durationField2.compareTo(durationField11) == 0) == durationField2.equals(durationField11));
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test85");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = julianChronology0.hours();
        org.joda.time.DurationField durationField5 = julianChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField5", Math.signum(durationField4.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField4)));
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test86");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance();
        long long7 = julianChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = julianChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = julianChronology3.days();
        boolean boolean11 = julianChronology0.equals((java.lang.Object) julianChronology3);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = julianChronology0.add(readablePeriod12, 1663L, (int) (short) -1);
        org.joda.time.DurationField durationField16 = julianChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField8, and durationField10", !(durationField16.compareTo(durationField8) == 0) || (Math.signum(durationField16.compareTo(durationField10)) == Math.signum(durationField8.compareTo(durationField10))));
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test87");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.year();
        org.joda.time.DurationField durationField7 = julianChronology0.months();
        org.joda.time.DurationField durationField8 = julianChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField5, and durationField7", !(durationField8.compareTo(durationField5) == 0) || (Math.signum(durationField8.compareTo(durationField7)) == Math.signum(durationField5.compareTo(durationField7))));
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test88");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology6.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology6.hourOfDay();
        org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance();
        long long13 = julianChronology9.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField14 = julianChronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology9.weekOfWeekyear();
        org.joda.time.DurationField durationField16 = julianChronology9.days();
        boolean boolean17 = julianChronology6.equals((java.lang.Object) julianChronology9);
        org.joda.time.DateTimeZone dateTimeZone18 = julianChronology9.getZone();
        org.joda.time.Chronology chronology19 = julianChronology0.withZone(dateTimeZone18);
        org.joda.time.DurationField durationField20 = julianChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = julianChronology0.add(readablePeriod21, 0L, 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField20", (durationField14.compareTo(durationField20) == 0) == durationField14.equals(durationField20));
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test89");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = julianChronology0.halfdays();
        org.joda.time.chrono.JulianChronology julianChronology8 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology8.hourOfDay();
        org.joda.time.DurationField durationField11 = julianChronology8.weeks();
        boolean boolean12 = julianChronology0.equals((java.lang.Object) julianChronology8);
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField14 = julianChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField5, and durationField7", !(durationField14.compareTo(durationField5) == 0) || (Math.signum(durationField14.compareTo(durationField7)) == Math.signum(durationField5.compareTo(durationField7))));
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test90");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.DurationField durationField9 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.weekOfWeekyear();
        org.joda.time.Chronology chronology11 = julianChronology0.withUTC();
        org.joda.time.DurationField durationField12 = julianChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField5, and durationField9", !(durationField12.compareTo(durationField5) == 0) || (Math.signum(durationField12.compareTo(durationField9)) == Math.signum(durationField5.compareTo(durationField9))));
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test91");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = julianChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.centuryOfEra();
        org.joda.time.DurationField durationField14 = julianChronology0.eras();
        org.joda.time.DurationField durationField15 = julianChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField14", Math.signum(durationField5.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField5)));
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test92");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DurationField durationField1 = julianChronology0.halfdays();
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology2.weekyearOfCentury();
        boolean boolean6 = julianChronology0.equals((java.lang.Object) julianChronology2);
        org.joda.time.DurationField durationField7 = julianChronology2.weekyears();
        org.joda.time.chrono.JulianChronology julianChronology8 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology8.weekyear();
        org.joda.time.DurationField durationField10 = julianChronology8.years();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology8.secondOfMinute();
        org.joda.time.chrono.JulianChronology julianChronology13 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology13.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.Chronology chronology16 = julianChronology13.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = julianChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField18 = julianChronology13.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField19 = julianChronology13.weekyear();
        int int20 = julianChronology13.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField21 = julianChronology13.monthOfYear();
        org.joda.time.DateTimeField dateTimeField22 = julianChronology13.yearOfEra();
        org.joda.time.DurationField durationField23 = julianChronology13.seconds();
        org.joda.time.DateTimeField dateTimeField24 = julianChronology13.weekOfWeekyear();
        org.joda.time.DurationField durationField25 = julianChronology13.hours();
        org.joda.time.DateTimeField dateTimeField26 = julianChronology13.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone27 = julianChronology13.getZone();
        org.joda.time.Chronology chronology28 = julianChronology8.withZone(dateTimeZone27);
        org.joda.time.Chronology chronology29 = julianChronology2.withZone(dateTimeZone27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField10", (durationField7.compareTo(durationField10) == 0) == durationField7.equals(durationField10));
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test93");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = julianChronology0.getZone();
        org.joda.time.DurationField durationField11 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField11", (durationField2.compareTo(durationField11) == 0) == durationField2.equals(durationField11));
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test94");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = julianChronology0.add(readablePeriod2, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = julianChronology0.eras();
        org.joda.time.DurationField durationField9 = julianChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField9, and durationField8", !(durationField8.compareTo(durationField9) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField9.compareTo(durationField8))));
    }

    @Test
    public void test95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test95");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.Chronology chronology3 = julianChronology0.withUTC();
        int int4 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = julianChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField5", Math.signum(durationField2.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField2)));
    }

    @Test
    public void test96() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test96");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.minuteOfHour();
        org.joda.time.DurationField durationField3 = julianChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfMinute();
        org.joda.time.DurationField durationField5 = julianChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField5", Math.signum(durationField3.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField3)));
    }

    @Test
    public void test97() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test97");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.Chronology chronology3 = julianChronology0.withUTC();
        int int4 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = julianChronology0.eras();
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology6.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology6.hourOfDay();
        org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance();
        long long13 = julianChronology9.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField14 = julianChronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology9.weekOfWeekyear();
        org.joda.time.DurationField durationField16 = julianChronology9.days();
        boolean boolean17 = julianChronology6.equals((java.lang.Object) julianChronology9);
        org.joda.time.DateTimeZone dateTimeZone18 = julianChronology9.getZone();
        org.joda.time.chrono.JulianChronology julianChronology20 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone18, (int) (byte) 1);
        org.joda.time.Chronology chronology21 = julianChronology0.withZone(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField5", Math.signum(durationField2.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField2)));
    }

    @Test
    public void test98() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test98");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.minuteOfHour();
        org.joda.time.DurationField durationField3 = julianChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfMinute();
        org.joda.time.DurationField durationField5 = julianChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField5", Math.signum(durationField3.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField3)));
    }

    @Test
    public void test99() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test99");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        org.joda.time.DurationField durationField8 = julianChronology0.hours();
        org.joda.time.DurationField durationField9 = julianChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField5, and durationField8", !(durationField9.compareTo(durationField5) == 0) || (Math.signum(durationField9.compareTo(durationField8)) == Math.signum(durationField5.compareTo(durationField8))));
    }
}

