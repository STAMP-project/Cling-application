import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0001");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        java.lang.String str3 = islamicChronology0.toString();
        org.joda.time.DurationField durationField4 = islamicChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField4, and durationField2", !(durationField2.compareTo(durationField4) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField4.compareTo(durationField2))));
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0002");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DurationField durationField3 = islamicChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField3, and durationField2", !(durationField2.compareTo(durationField3) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField3.compareTo(durationField2))));
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0003");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str6 = dateTimeZone5.toString();
        org.joda.time.Chronology chronology7 = islamicChronology0.withZone(dateTimeZone5);
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField3", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0004");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField3", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0005");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyearOfCentury();
        int int4 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = islamicChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField5, and durationField2", !(durationField2.compareTo(durationField5) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField5.compareTo(durationField2))));
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0006");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str5 = dateTimeZone4.toString();
        boolean boolean6 = dateTimeZone4.isFixed();
        java.lang.String str7 = dateTimeZone4.getID();
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone4);
        org.joda.time.DurationField durationField9 = islamicChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField9, and durationField2", !(durationField2.compareTo(durationField9) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField9.compareTo(durationField2))));
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0007");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str5 = dateTimeZone4.toString();
        boolean boolean6 = dateTimeZone4.isFixed();
        java.lang.String str7 = dateTimeZone4.getID();
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone4);
        org.joda.time.DurationField durationField9 = islamicChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField9, and durationField2", !(durationField2.compareTo(durationField9) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField9.compareTo(durationField2))));
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0008");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        long long5 = islamicChronology0.add((long) (short) -1, (long) '4', (int) '#');
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology7.weekyearOfCentury();
        org.joda.time.DurationField durationField9 = islamicChronology7.eras();
        org.joda.time.DateTimeZone dateTimeZone10 = islamicChronology7.getZone();
        org.joda.time.Chronology chronology11 = islamicChronology0.withZone(dateTimeZone10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField9", Math.signum(durationField6.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField6)));
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0009");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DurationField durationField5 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField5", Math.signum(durationField1.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField1)));
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0010");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str5 = dateTimeZone4.toString();
        boolean boolean6 = dateTimeZone4.isFixed();
        java.lang.String str7 = dateTimeZone4.getID();
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone4);
        org.joda.time.DurationField durationField9 = islamicChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField9, and durationField2", !(durationField2.compareTo(durationField9) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField9.compareTo(durationField2))));
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0011");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField10 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField10", (durationField8.compareTo(durationField10) == 0) == durationField8.equals(durationField10));
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0012");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, (long) 10, (int) (short) 100);
        org.joda.time.DurationField durationField9 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0013");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        long long11 = islamicChronology3.add((long) (byte) 10, (long) (short) 10, (int) (byte) 100);
        org.joda.time.DurationField durationField12 = islamicChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField5, and durationField6", !(durationField12.compareTo(durationField5) == 0) || (Math.signum(durationField12.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0014");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField10 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField12 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField1, and durationField3", !(durationField12.compareTo(durationField1) == 0) || (Math.signum(durationField12.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0015");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.year();
        org.joda.time.DurationField durationField4 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField4", Math.signum(durationField1.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField1)));
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0016");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField9 = islamicChronology0.halfdays();
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField4", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0017");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField6 = islamicChronology5.weeks();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology5.weekyears();
        org.joda.time.Chronology chronology9 = islamicChronology5.withUTC();
        org.joda.time.DurationField durationField10 = chronology9.weeks();
        boolean boolean11 = islamicChronology0.equals((java.lang.Object) durationField10);
        org.joda.time.Chronology chronology12 = islamicChronology0.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField10", (durationField1.compareTo(durationField10) == 0) == durationField1.equals(durationField10));
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0018");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.eras();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField7, and durationField6", !(durationField6.compareTo(durationField7) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField7.compareTo(durationField6))));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0019");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology0.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = islamicChronology0.add(readablePeriod8, (long) 36000000, (int) (short) 1);
        org.joda.time.DurationField durationField12 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField1, and durationField3", !(durationField12.compareTo(durationField1) == 0) || (Math.signum(durationField12.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0020");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        java.lang.String str7 = islamicChronology0.toString();
        java.lang.String str8 = islamicChronology0.toString();
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField3", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0021");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        long long6 = islamicChronology0.add((long) 10, (long) 100, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField9, and durationField2", !(durationField2.compareTo(durationField9) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField9.compareTo(durationField2))));
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0022");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField8 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField10 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField14 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField1, and durationField3", !(durationField14.compareTo(durationField1) == 0) || (Math.signum(durationField14.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0023");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DurationField durationField5 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField5", Math.signum(durationField1.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField1)));
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0024");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.Chronology chronology5 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField6", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField6)) == Math.signum(durationField1.compareTo(durationField6))));
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0025");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        long long7 = islamicChronology0.add(10L, 0L, (int) (byte) -1);
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField3", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0026");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.year();
        org.joda.time.DurationField durationField11 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField1, and durationField3", !(durationField11.compareTo(durationField1) == 0) || (Math.signum(durationField11.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0027");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.year();
        long long11 = islamicChronology0.getDateTimeMillis((long) (short) 0, 4, (int) (byte) 1, 0, 100);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.era();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType13 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField15 = islamicChronology14.weeks();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology14.yearOfEra();
        org.joda.time.DurationField durationField17 = islamicChronology14.millis();
        boolean boolean19 = islamicChronology14.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology14.hourOfDay();
        org.joda.time.DurationField durationField21 = islamicChronology14.halfdays();
        long long25 = islamicChronology14.add(0L, 1010L, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str28 = dateTimeZone27.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology29 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology29.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology29.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        long long35 = dateTimeZone32.getMillisKeepLocal(dateTimeZone33, (long) (byte) -1);
        org.joda.time.Chronology chronology36 = islamicChronology29.withZone(dateTimeZone33);
        org.joda.time.DurationField durationField37 = islamicChronology29.minutes();
        long long41 = islamicChronology29.add((-35999965L), 1010L, 36000000);
        org.joda.time.DurationField durationField42 = islamicChronology29.millis();
        org.joda.time.DateTimeZone dateTimeZone43 = islamicChronology29.getZone();
        org.joda.time.Chronology chronology44 = islamicChronology14.withZone(dateTimeZone43);
        org.joda.time.Chronology chronology45 = islamicChronology0.withZone(dateTimeZone43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField17 and durationField42", (durationField17.compareTo(durationField42) == 0) == durationField17.equals(durationField42));
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0028");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.year();
        org.joda.time.DurationField durationField4 = islamicChronology0.eras();
        java.lang.String str5 = islamicChronology0.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField4", Math.signum(durationField1.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField1)));
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0029");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.weekyear();
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField3", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0030");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField4 = islamicChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField4, and durationField2", !(durationField2.compareTo(durationField4) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField4.compareTo(durationField2))));
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0031");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyearOfCentury();
        int int4 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField5, and durationField2", !(durationField2.compareTo(durationField5) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField5.compareTo(durationField2))));
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0032");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, (long) 10, (int) (short) 100);
        org.joda.time.DurationField durationField9 = islamicChronology0.years();
        org.joda.time.DurationField durationField10 = islamicChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0033");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField3", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0034");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType7 = islamicChronology0.getLeapYearPatternType();
        java.lang.String str8 = islamicChronology0.toString();
        org.joda.time.DurationField durationField9 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField3", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0035");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology0.weeks();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, 3L, (int) (byte) 100);
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField3", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0036");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField9 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField3", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0037");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField7 = islamicChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField7, and durationField2", !(durationField2.compareTo(durationField7) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField7.compareTo(durationField2))));
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0038");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.months();
        org.joda.time.DurationField durationField8 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.year();
        org.joda.time.Chronology chronology10 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField11 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField7, and durationField8", !(durationField11.compareTo(durationField7) == 0) || (Math.signum(durationField11.compareTo(durationField8)) == Math.signum(durationField7.compareTo(durationField8))));
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0039");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField6 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField1, and durationField3", !(durationField6.compareTo(durationField1) == 0) || (Math.signum(durationField6.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0040");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField7 = islamicChronology0.days();
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology8.weekyearOfCentury();
        org.joda.time.DurationField durationField10 = islamicChronology8.eras();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str13 = dateTimeZone12.toString();
        boolean boolean14 = dateTimeZone12.isFixed();
        java.lang.String str15 = dateTimeZone12.getID();
        org.joda.time.Chronology chronology16 = islamicChronology8.withZone(dateTimeZone12);
        long long18 = dateTimeZone12.nextTransition(14460100L);
        org.joda.time.Chronology chronology19 = islamicChronology0.withZone(dateTimeZone12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField10", Math.signum(durationField1.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField1)));
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0041");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        java.lang.String str6 = islamicChronology3.toString();
        org.joda.time.DurationField durationField7 = islamicChronology3.years();
        org.joda.time.DurationField durationField8 = islamicChronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.halfdayOfDay();
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField11 = islamicChronology10.weeks();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology10.yearOfEra();
        org.joda.time.DurationField durationField13 = islamicChronology10.weekyears();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str16 = dateTimeZone15.toString();
        org.joda.time.Chronology chronology17 = islamicChronology10.withZone(dateTimeZone15);
        int int19 = dateTimeZone15.getOffset(1L);
        long long22 = dateTimeZone15.adjustOffset((long) (short) 1, false);
        int int24 = dateTimeZone15.getStandardOffset(32L);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone15.getName((long) (short) 1, locale26);
        org.joda.time.Chronology chronology28 = islamicChronology3.withZone(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField13", (durationField7.compareTo(durationField13) == 0) == durationField7.equals(durationField13));
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0042");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = islamicChronology0.add(readablePeriod6, 1010L, (int) (short) -1);
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField3", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0043");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField10 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0044");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField3 = islamicChronology0.eras();
        org.joda.time.DurationField durationField4 = islamicChronology0.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField4, and durationField3", !(durationField3.compareTo(durationField4) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField4.compareTo(durationField3))));
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0045");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str6 = dateTimeZone5.toString();
        org.joda.time.Chronology chronology7 = islamicChronology0.withZone(dateTimeZone5);
        int int9 = dateTimeZone5.getOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str12 = dateTimeZone11.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology13.clockhourOfDay();
        org.joda.time.DurationField durationField15 = islamicChronology13.hours();
        org.joda.time.DurationField durationField16 = islamicChronology13.weekyears();
        org.joda.time.DurationField durationField17 = islamicChronology13.months();
        long long21 = islamicChronology13.add((long) (byte) 10, (long) (short) 10, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        org.joda.time.Chronology chronology24 = islamicChronology13.withZone(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str27 = dateTimeZone26.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology28 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology28.clockhourOfDay();
        org.joda.time.DurationField durationField30 = islamicChronology28.hours();
        org.joda.time.DurationField durationField31 = islamicChronology28.weekyears();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology28.dayOfYear();
        org.joda.time.DurationField durationField33 = islamicChronology28.minutes();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology28.millisOfSecond();
        org.joda.time.DurationField durationField35 = islamicChronology28.halfdays();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType36 = islamicChronology28.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology37 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone23, leapYearPatternType36);
        org.joda.time.chrono.IslamicChronology islamicChronology38 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5, leapYearPatternType36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField16", (durationField3.compareTo(durationField16) == 0) == durationField3.equals(durationField16));
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0046");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.months();
        org.joda.time.DurationField durationField8 = islamicChronology0.halfdays();
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField7, and durationField8", !(durationField9.compareTo(durationField7) == 0) || (Math.signum(durationField9.compareTo(durationField8)) == Math.signum(durationField7.compareTo(durationField8))));
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0047");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekOfWeekyear();
        long long7 = islamicChronology0.add((-518398999L), (long) 100, 100);
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology8.weekyearOfCentury();
        org.joda.time.DurationField durationField10 = islamicChronology8.eras();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str13 = dateTimeZone12.toString();
        boolean boolean14 = dateTimeZone12.isFixed();
        java.lang.String str15 = dateTimeZone12.getID();
        org.joda.time.Chronology chronology16 = islamicChronology8.withZone(dateTimeZone12);
        java.lang.String str17 = dateTimeZone12.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology18 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12);
        org.joda.time.Chronology chronology19 = islamicChronology0.withZone(dateTimeZone12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField10", Math.signum(durationField2.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField2)));
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0048");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField10 = islamicChronology0.years();
        java.lang.Class<?> wildcardClass11 = islamicChronology0.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField10", (durationField8.compareTo(durationField10) == 0) == durationField8.equals(durationField10));
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0049");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField3", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0050");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField3 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.secondOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField1, and durationField3", !(durationField5.compareTo(durationField1) == 0) || (Math.signum(durationField5.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0051");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.year();
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField3", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0052");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        long long9 = dateTimeZone6.getMillisKeepLocal(dateTimeZone7, (long) (byte) -1);
        org.joda.time.Chronology chronology10 = islamicChronology3.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField11 = islamicChronology3.minutes();
        long long15 = islamicChronology3.add((-35999965L), 1010L, 36000000);
        org.joda.time.DurationField durationField16 = islamicChronology3.millis();
        org.joda.time.DurationField durationField17 = islamicChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField11, and durationField16", !(durationField17.compareTo(durationField11) == 0) || (Math.signum(durationField17.compareTo(durationField16)) == Math.signum(durationField11.compareTo(durationField16))));
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0053");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, (long) 10, (int) (short) 100);
        org.joda.time.DurationField durationField9 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0054");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField3 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField5 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField1, and durationField3", !(durationField5.compareTo(durationField1) == 0) || (Math.signum(durationField5.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0055");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        long long7 = islamicChronology0.add((long) (short) 1, 0L, 4);
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = islamicChronology0.add(readablePeriod9, 1L, 1);
        org.joda.time.DurationField durationField13 = islamicChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField13, and durationField8", !(durationField8.compareTo(durationField13) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField13.compareTo(durationField8))));
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0056");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology0.eras();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField5", Math.signum(durationField1.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField1)));
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0057");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.minuteOfDay();
        org.joda.time.Chronology chronology8 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField9 = islamicChronology0.weeks();
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology10.weekyearOfCentury();
        org.joda.time.DurationField durationField12 = islamicChronology10.eras();
        org.joda.time.DateTimeZone dateTimeZone13 = islamicChronology10.getZone();
        org.joda.time.Chronology chronology14 = islamicChronology0.withZone(dateTimeZone13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField12", Math.signum(durationField1.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField1)));
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0058");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str5 = dateTimeZone4.toString();
        boolean boolean6 = dateTimeZone4.isFixed();
        java.lang.String str7 = dateTimeZone4.getID();
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone4);
        java.lang.String str9 = dateTimeZone4.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.lang.String str14 = dateTimeZone12.getName((long) (byte) -1);
        java.lang.String str15 = dateTimeZone12.toString();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str18 = dateTimeZone17.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology19.secondOfMinute();
        org.joda.time.DurationField durationField21 = islamicChronology19.halfdays();
        org.joda.time.Chronology chronology22 = islamicChronology19.withUTC();
        boolean boolean23 = dateTimeZone12.equals((java.lang.Object) islamicChronology19);
        long long25 = dateTimeZone4.getMillisKeepLocal(dateTimeZone12, 10100L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField21", Math.signum(durationField2.compareTo(durationField21)) == -Math.signum(durationField21.compareTo(durationField2)));
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0059");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        java.lang.String str6 = islamicChronology3.toString();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        int int8 = islamicChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = islamicChronology3.add(readablePeriod9, (long) 0, (int) '4');
        org.joda.time.DurationField durationField13 = islamicChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField5, and durationField7", !(durationField13.compareTo(durationField5) == 0) || (Math.signum(durationField13.compareTo(durationField7)) == Math.signum(durationField5.compareTo(durationField7))));
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0060");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str5 = dateTimeZone4.toString();
        boolean boolean6 = dateTimeZone4.isFixed();
        java.lang.String str7 = dateTimeZone4.getID();
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.era();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str12 = dateTimeZone11.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology13.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology13.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        long long19 = dateTimeZone16.getMillisKeepLocal(dateTimeZone17, (long) (byte) -1);
        org.joda.time.Chronology chronology20 = islamicChronology13.withZone(dateTimeZone17);
        org.joda.time.DurationField durationField21 = islamicChronology13.minutes();
        long long25 = islamicChronology13.add((-35999965L), 1010L, 36000000);
        org.joda.time.DurationField durationField26 = islamicChronology13.millis();
        org.joda.time.DateTimeZone dateTimeZone27 = islamicChronology13.getZone();
        org.joda.time.Chronology chronology28 = islamicChronology0.withZone(dateTimeZone27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField21", Math.signum(durationField2.compareTo(durationField21)) == -Math.signum(durationField21.compareTo(durationField2)));
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0061");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType5 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.joda.time.DurationField durationField10 = islamicChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField10, and durationField9", !(durationField9.compareTo(durationField10) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField10.compareTo(durationField9))));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0062");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfDay();
        long long9 = islamicChronology0.add((-80689900L), (-35999900L), (int) (byte) 10);
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology10.weekyearOfCentury();
        org.joda.time.DurationField durationField12 = islamicChronology10.eras();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology10.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology10.year();
        boolean boolean15 = islamicChronology0.equals((java.lang.Object) islamicChronology10);
        org.joda.time.DurationField durationField16 = islamicChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField16, and durationField12", !(durationField12.compareTo(durationField16) == 0) || (Math.signum(durationField12.compareTo(durationField12)) == Math.signum(durationField16.compareTo(durationField12))));
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0063");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology9 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField10 = chronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField3", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0064");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.hourOfHalfday();
        org.joda.time.DurationField durationField10 = islamicChronology3.years();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology3.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField10", (durationField6.compareTo(durationField10) == 0) == durationField6.equals(durationField10));
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0065");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        org.joda.time.DurationField durationField8 = islamicChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField5, and durationField6", !(durationField8.compareTo(durationField5) == 0) || (Math.signum(durationField8.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0066");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        long long9 = islamicChronology0.add(187200035L, (long) ' ', (int) 'a');
        org.joda.time.DurationField durationField10 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField12 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField3, and durationField4", !(durationField12.compareTo(durationField3) == 0) || (Math.signum(durationField12.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0067");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.secondOfMinute();
        org.joda.time.DurationField durationField5 = islamicChronology3.halfdays();
        org.joda.time.Chronology chronology6 = islamicChronology3.withUTC();
        org.joda.time.DurationField durationField7 = islamicChronology3.days();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology3.dayOfWeek();
        org.joda.time.DurationField durationField9 = islamicChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField5, and durationField7", !(durationField9.compareTo(durationField5) == 0) || (Math.signum(durationField9.compareTo(durationField7)) == Math.signum(durationField5.compareTo(durationField7))));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0068");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField9 = islamicChronology0.years();
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0069");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str5 = dateTimeZone4.toString();
        boolean boolean6 = dateTimeZone4.isFixed();
        java.lang.String str7 = dateTimeZone4.getID();
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone4);
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.joda.time.DurationField durationField10 = islamicChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField10, and durationField2", !(durationField2.compareTo(durationField10) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField10.compareTo(durationField2))));
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0070");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        long long7 = islamicChronology0.add((long) (short) 1, 0L, 4);
        org.joda.time.DurationField durationField8 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField11 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField12 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField8, and durationField11", !(durationField12.compareTo(durationField8) == 0) || (Math.signum(durationField12.compareTo(durationField11)) == Math.signum(durationField8.compareTo(durationField11))));
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0071");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField8 = islamicChronology0.years();
        org.joda.time.Chronology chronology9 = islamicChronology0.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField8", (durationField3.compareTo(durationField8) == 0) == durationField3.equals(durationField8));
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0072");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyear();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField3, and durationField4", !(durationField7.compareTo(durationField3) == 0) || (Math.signum(durationField7.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0073");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        long long9 = dateTimeZone6.getMillisKeepLocal(dateTimeZone7, (long) (byte) -1);
        org.joda.time.Chronology chronology10 = islamicChronology3.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField11 = islamicChronology3.minutes();
        long long15 = islamicChronology3.add((-35999965L), 1010L, 36000000);
        org.joda.time.DurationField durationField16 = islamicChronology3.millis();
        int int17 = islamicChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField18 = islamicChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField11, and durationField16", !(durationField18.compareTo(durationField11) == 0) || (Math.signum(durationField18.compareTo(durationField16)) == Math.signum(durationField11.compareTo(durationField16))));
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0074");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.dayOfYear();
        org.joda.time.DurationField durationField8 = islamicChronology3.minutes();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.millisOfSecond();
        org.joda.time.DurationField durationField10 = islamicChronology3.halfdays();
        org.joda.time.DurationField durationField11 = islamicChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField5, and durationField6", !(durationField11.compareTo(durationField5) == 0) || (Math.signum(durationField11.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0075");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField10 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0076");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField2", Math.signum(durationField1.compareTo(durationField2)) == -Math.signum(durationField2.compareTo(durationField1)));
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0077");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = islamicChronology0.months();
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField3", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0078");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, (long) 10, (int) (short) 100);
        org.joda.time.DurationField durationField9 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology10 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.centuryOfEra();
        org.joda.time.Chronology chronology12 = islamicChronology0.withUTC();
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology14.weekyearOfCentury();
        org.joda.time.DurationField durationField16 = islamicChronology14.eras();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str19 = dateTimeZone18.toString();
        boolean boolean20 = dateTimeZone18.isFixed();
        java.lang.String str21 = dateTimeZone18.getID();
        org.joda.time.Chronology chronology22 = islamicChronology14.withZone(dateTimeZone18);
        org.joda.time.Chronology chronology23 = islamicChronology13.withZone(dateTimeZone18);
        org.joda.time.Chronology chronology24 = islamicChronology0.withZone(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField16", Math.signum(durationField1.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField1)));
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0079");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField3", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0080");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = islamicChronology0.add(readablePeriod6, 1L, 4);
        org.joda.time.DurationField durationField10 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField11 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField10", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField10)) == Math.signum(durationField3.compareTo(durationField10))));
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0081");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField3", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0082");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField3", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0083");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.minuteOfDay();
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField7 = islamicChronology6.weeks();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology6.yearOfEra();
        org.joda.time.DurationField durationField9 = islamicChronology6.weekyears();
        org.joda.time.DurationField durationField10 = islamicChronology6.weeks();
        org.joda.time.DurationField durationField11 = islamicChronology6.halfdays();
        boolean boolean12 = islamicChronology3.equals((java.lang.Object) islamicChronology6);
        org.joda.time.DurationField durationField13 = islamicChronology6.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField7, and durationField9", !(durationField13.compareTo(durationField7) == 0) || (Math.signum(durationField13.compareTo(durationField9)) == Math.signum(durationField7.compareTo(durationField9))));
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0084");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField7 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField7", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField7)) == Math.signum(durationField1.compareTo(durationField7))));
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0085");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField6, and durationField2", !(durationField2.compareTo(durationField6) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField6.compareTo(durationField2))));
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0086");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField5 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField3, and durationField4", !(durationField5.compareTo(durationField3) == 0) || (Math.signum(durationField5.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0087");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str8 = dateTimeZone7.toString();
        boolean boolean10 = dateTimeZone7.isStandardOffset((long) (byte) 10);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        long long14 = dateTimeZone12.nextTransition((long) 36000000);
        java.lang.Object obj15 = null;
        boolean boolean16 = dateTimeZone12.equals(obj15);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        long long20 = dateTimeZone12.adjustOffset((long) (byte) 100, true);
        org.joda.time.Chronology chronology21 = islamicChronology3.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField22 = islamicChronology3.years();
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField24 = islamicChronology23.weeks();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology23.yearOfEra();
        org.joda.time.DurationField durationField26 = islamicChronology23.weekyears();
        org.joda.time.Chronology chronology27 = islamicChronology23.withUTC();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology23.secondOfMinute();
        org.joda.time.DurationField durationField29 = islamicChronology23.seconds();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology23.yearOfEra();
        boolean boolean31 = islamicChronology3.equals((java.lang.Object) dateTimeField30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField26", (durationField22.compareTo(durationField26) == 0) == durationField22.equals(durationField26));
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0088");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = islamicChronology0.getZone();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType5 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
        org.joda.time.DurationField durationField8 = islamicChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField7", Math.signum(durationField3.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField3)));
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0089");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DurationField durationField5 = islamicChronology0.eras();
        org.joda.time.DurationField durationField6 = islamicChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField5", Math.signum(durationField1.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField1)));
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0090");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField10 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField10", (durationField8.compareTo(durationField10) == 0) == durationField8.equals(durationField10));
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0091");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = islamicChronology0.add(readablePeriod3, (long) (byte) 100, (int) '#');
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.era();
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField9", Math.signum(durationField1.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField1)));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0092");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        java.lang.String str9 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField11 = islamicChronology0.halfdays();
        org.joda.time.DurationField durationField12 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField12", (durationField8.compareTo(durationField12) == 0) == durationField8.equals(durationField12));
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0093");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.millisOfSecond();
        org.joda.time.DurationField durationField7 = islamicChronology3.days();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology3.eras();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = islamicChronology3.add(readablePeriod11, (-476688868L), 115200000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField10", Math.signum(durationField7.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField7)));
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0094");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.halfdays();
        long long11 = islamicChronology0.add(0L, 1010L, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str14 = dateTimeZone13.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology15.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology15.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        long long21 = dateTimeZone18.getMillisKeepLocal(dateTimeZone19, (long) (byte) -1);
        org.joda.time.Chronology chronology22 = islamicChronology15.withZone(dateTimeZone19);
        org.joda.time.DurationField durationField23 = islamicChronology15.minutes();
        long long27 = islamicChronology15.add((-35999965L), 1010L, 36000000);
        org.joda.time.DurationField durationField28 = islamicChronology15.millis();
        org.joda.time.DateTimeZone dateTimeZone29 = islamicChronology15.getZone();
        org.joda.time.Chronology chronology30 = islamicChronology0.withZone(dateTimeZone29);
        boolean boolean31 = dateTimeZone29.isFixed();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField28", (durationField3.compareTo(durationField28) == 0) == durationField3.equals(durationField28));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0095");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField7 = islamicChronology0.days();
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField7", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField7)) == Math.signum(durationField1.compareTo(durationField7))));
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0096");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        long long11 = islamicChronology0.getDateTimeMillis((-440688900L), 0, (int) (byte) 0, (int) (short) 1, 1);
        org.joda.time.DurationField durationField12 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField12", (durationField3.compareTo(durationField12) == 0) == durationField3.equals(durationField12));
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0097");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField8 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField8", (durationField3.compareTo(durationField8) == 0) == durationField3.equals(durationField8));
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0098");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        long long5 = islamicChronology0.add((long) (short) -1, (long) '4', (int) '#');
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = islamicChronology0.add(readablePeriod7, (long) 10, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Chronology chronology12 = islamicChronology0.withZone(dateTimeZone11);
        org.joda.time.DurationField durationField13 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField16 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField6, and durationField13", !(durationField16.compareTo(durationField6) == 0) || (Math.signum(durationField16.compareTo(durationField13)) == Math.signum(durationField6.compareTo(durationField13))));
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0099");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology6.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = islamicChronology6.eras();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str11 = dateTimeZone10.toString();
        boolean boolean12 = dateTimeZone10.isFixed();
        java.lang.String str13 = dateTimeZone10.getID();
        org.joda.time.Chronology chronology14 = islamicChronology6.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology6.era();
        boolean boolean16 = islamicChronology0.equals((java.lang.Object) dateTimeField15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField8", Math.signum(durationField1.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField1)));
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0100");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField3", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0101");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField7", Math.signum(durationField1.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField1)));
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0102");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.era();
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology8.weekyearOfCentury();
        org.joda.time.DurationField durationField10 = islamicChronology8.eras();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str13 = dateTimeZone12.toString();
        boolean boolean14 = dateTimeZone12.isFixed();
        java.lang.String str15 = dateTimeZone12.getID();
        org.joda.time.Chronology chronology16 = islamicChronology8.withZone(dateTimeZone12);
        org.joda.time.Chronology chronology17 = islamicChronology7.withZone(dateTimeZone12);
        boolean boolean18 = dateTimeZone12.isFixed();
        long long20 = dateTimeZone12.convertUTCToLocal((long) (-1));
        org.joda.time.Chronology chronology21 = islamicChronology0.withZone(dateTimeZone12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField10", Math.signum(durationField1.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField1)));
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0103");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.year();
        org.joda.time.DurationField durationField4 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology0.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField4", Math.signum(durationField1.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField1)));
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0104");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = islamicChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField6, and durationField2", !(durationField2.compareTo(durationField6) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField6.compareTo(durationField2))));
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0105");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.year();
        org.joda.time.DurationField durationField11 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField11", (durationField8.compareTo(durationField11) == 0) == durationField8.equals(durationField11));
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0106");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField1, and durationField3", !(durationField6.compareTo(durationField1) == 0) || (Math.signum(durationField6.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0107");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        java.lang.String str3 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfYear();
        java.lang.String str5 = islamicChronology0.toString();
        org.joda.time.DurationField durationField6 = islamicChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField6, and durationField2", !(durationField2.compareTo(durationField6) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField6.compareTo(durationField2))));
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0108");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        java.lang.String str3 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField5 = islamicChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField5, and durationField2", !(durationField2.compareTo(durationField5) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField5.compareTo(durationField2))));
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0109");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField10 = islamicChronology0.years();
        org.joda.time.DurationField durationField11 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField10", (durationField8.compareTo(durationField10) == 0) == durationField8.equals(durationField10));
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0110");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.monthOfYear();
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField3", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0111");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.eras();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField6", Math.signum(durationField2.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField2)));
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0112");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField7 = islamicChronology0.minutes();
        java.lang.String str8 = islamicChronology0.toString();
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField3", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0113");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField3", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0114");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        long long6 = islamicChronology0.add((long) 10, (long) 100, (int) (short) 0);
        org.joda.time.DurationField durationField7 = islamicChronology0.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField7, and durationField2", !(durationField2.compareTo(durationField7) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField7.compareTo(durationField2))));
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0115");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DurationField durationField5 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField5", Math.signum(durationField1.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField1)));
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0116");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.era();
        org.joda.time.DurationField durationField4 = islamicChronology0.eras();
        org.joda.time.DurationField durationField5 = islamicChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField5, and durationField4", !(durationField4.compareTo(durationField5) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField5.compareTo(durationField4))));
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0117");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = islamicChronology1.eras();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str6 = dateTimeZone5.toString();
        boolean boolean7 = dateTimeZone5.isFixed();
        java.lang.String str8 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology9 = islamicChronology1.withZone(dateTimeZone5);
        org.joda.time.Chronology chronology10 = islamicChronology0.withZone(dateTimeZone5);
        boolean boolean11 = dateTimeZone5.isFixed();
        long long13 = dateTimeZone5.convertUTCToLocal((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str16 = dateTimeZone15.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15);
        int int19 = dateTimeZone15.getStandardOffset(10L);
        int int21 = dateTimeZone15.getOffset((-35999900L));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType22 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15, leapYearPatternType22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone15.getOffset(readableInstant24);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str28 = dateTimeZone27.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology29 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology29.clockhourOfDay();
        org.joda.time.DurationField durationField31 = islamicChronology29.hours();
        org.joda.time.DurationField durationField32 = islamicChronology29.weekyears();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology29.dayOfYear();
        org.joda.time.DurationField durationField34 = islamicChronology29.minutes();
        org.joda.time.DateTimeField dateTimeField35 = islamicChronology29.millisOfSecond();
        org.joda.time.DurationField durationField36 = islamicChronology29.halfdays();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType37 = islamicChronology29.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology38 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15, leapYearPatternType37);
        org.joda.time.chrono.IslamicChronology islamicChronology39 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5, leapYearPatternType37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField31", Math.signum(durationField3.compareTo(durationField31)) == -Math.signum(durationField31.compareTo(durationField3)));
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0118");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField11 = islamicChronology0.months();
        org.joda.time.DurationField durationField12 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField3, and durationField4", !(durationField12.compareTo(durationField3) == 0) || (Math.signum(durationField12.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0119");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = islamicChronology0.getZone();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType5 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField7", Math.signum(durationField3.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField3)));
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0120");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.monthOfYear();
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField3, and durationField4", !(durationField8.compareTo(durationField3) == 0) || (Math.signum(durationField8.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0121");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.monthOfYear();
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField3, and durationField4", !(durationField9.compareTo(durationField3) == 0) || (Math.signum(durationField9.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0122");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, (long) 10, (int) (short) 100);
        org.joda.time.DurationField durationField9 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0123");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, (long) 10, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField10 = islamicChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = islamicChronology0.add(readablePeriod11, 3601004L, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0124");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        long long5 = islamicChronology0.add((long) (short) -1, (long) '4', (int) '#');
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = islamicChronology0.add(readablePeriod7, (long) 10, (int) (short) -1);
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField12 = islamicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str15 = dateTimeZone14.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology16.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology16.dayOfWeek();
        org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField20 = islamicChronology19.weeks();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology19.yearOfEra();
        org.joda.time.DurationField durationField22 = islamicChronology19.weekyears();
        org.joda.time.Chronology chronology23 = islamicChronology19.withUTC();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology19.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology19.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone26 = islamicChronology19.getZone();
        int int28 = dateTimeZone26.getStandardOffset(10L);
        org.joda.time.Chronology chronology29 = islamicChronology16.withZone(dateTimeZone26);
        org.joda.time.chrono.IslamicChronology islamicChronology30 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology30.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology30.dayOfYear();
        org.joda.time.DurationField durationField33 = islamicChronology30.minutes();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology30.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean38 = dateTimeZone36.equals((java.lang.Object) (-1.0d));
        int int40 = dateTimeZone36.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = dateTimeZone36.isLocalDateTimeGap(localDateTime41);
        int int44 = dateTimeZone36.getStandardOffset((long) 100);
        org.joda.time.Chronology chronology45 = islamicChronology30.withZone(dateTimeZone36);
        int int47 = dateTimeZone36.getOffsetFromLocal(11L);
        long long49 = dateTimeZone26.getMillisKeepLocal(dateTimeZone36, 1000L);
        org.joda.time.Chronology chronology50 = islamicChronology0.withZone(dateTimeZone36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField22", (durationField12.compareTo(durationField22) == 0) == durationField12.equals(durationField22));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0125");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.secondOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField3", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0126");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.hourOfHalfday();
        org.joda.time.DurationField durationField10 = islamicChronology3.years();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology3.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField10", (durationField6.compareTo(durationField10) == 0) == durationField6.equals(durationField10));
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0127");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType5 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        org.joda.time.DurationField durationField11 = islamicChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField11, and durationField9", !(durationField9.compareTo(durationField11) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField11.compareTo(durationField9))));
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0128");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str5 = dateTimeZone4.toString();
        boolean boolean6 = dateTimeZone4.isFixed();
        java.lang.String str7 = dateTimeZone4.getID();
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField10, and durationField2", !(durationField2.compareTo(durationField10) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField10.compareTo(durationField2))));
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0129");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField3", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0130");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        long long11 = islamicChronology0.getDateTimeMillis((-440688900L), 0, (int) (byte) 0, (int) (short) 1, 1);
        org.joda.time.DurationField durationField12 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField12", (durationField3.compareTo(durationField12) == 0) == durationField3.equals(durationField12));
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0131");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        long long9 = islamicChronology0.add(187200035L, (long) ' ', (int) 'a');
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology12.dayOfYear();
        org.joda.time.DurationField durationField15 = islamicChronology12.minutes();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology12.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean20 = dateTimeZone18.equals((java.lang.Object) (-1.0d));
        int int22 = dateTimeZone18.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone18.isLocalDateTimeGap(localDateTime23);
        int int26 = dateTimeZone18.getStandardOffset((long) 100);
        org.joda.time.Chronology chronology27 = islamicChronology12.withZone(dateTimeZone18);
        int int29 = dateTimeZone18.getOffsetFromLocal(11L);
        org.joda.time.Chronology chronology30 = islamicChronology0.withZone(dateTimeZone18);
        java.lang.String str31 = chronology30.toString();
        org.joda.time.DurationField durationField32 = chronology30.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField32, durationField3, and durationField4", !(durationField32.compareTo(durationField3) == 0) || (Math.signum(durationField32.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0132");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.days();
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField3", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0133");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyearOfCentury();
        int int4 = islamicChronology0.getMinimumDaysInFirstWeek();
        long long10 = islamicChronology0.getDateTimeMillis(0L, (int) (byte) 10, (int) '#', (int) (byte) 0, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.era();
        org.joda.time.DurationField durationField13 = islamicChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField13, and durationField2", !(durationField2.compareTo(durationField13) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField13.compareTo(durationField2))));
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0134");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField10 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField10", (durationField8.compareTo(durationField10) == 0) == durationField8.equals(durationField10));
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0135");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField10 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField11 = islamicChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = islamicChronology0.add(readablePeriod12, 0L, (int) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField11", (durationField8.compareTo(durationField11) == 0) == durationField8.equals(durationField11));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0136");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str4 = dateTimeZone3.toString();
        boolean boolean5 = dateTimeZone3.isFixed();
        org.joda.time.Chronology chronology6 = islamicChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField7 = islamicChronology0.days();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology0.getZone();
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField10 = islamicChronology9.weeks();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology9.yearOfEra();
        org.joda.time.DurationField durationField12 = islamicChronology9.millis();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology9.halfdayOfDay();
        org.joda.time.DurationField durationField15 = islamicChronology9.years();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology9.era();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 4);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone20.getShortName((-35999900L), locale22);
        org.joda.time.Chronology chronology24 = islamicChronology9.withZone(dateTimeZone20);
        long long26 = dateTimeZone8.getMillisKeepLocal(dateTimeZone20, (-42406761599990L));
        org.joda.time.chrono.IslamicChronology islamicChronology27 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.chrono.IslamicChronology islamicChronology28 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology28.weekyearOfCentury();
        org.joda.time.DurationField durationField30 = islamicChronology28.eras();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str33 = dateTimeZone32.toString();
        boolean boolean34 = dateTimeZone32.isFixed();
        java.lang.String str35 = dateTimeZone32.getID();
        org.joda.time.Chronology chronology36 = islamicChronology28.withZone(dateTimeZone32);
        org.joda.time.Chronology chronology37 = islamicChronology27.withZone(dateTimeZone32);
        long long39 = dateTimeZone32.previousTransition(35L);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str42 = dateTimeZone41.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology43 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField44 = islamicChronology43.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField45 = islamicChronology43.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField46 = islamicChronology43.dayOfYear();
        org.joda.time.DateTimeField dateTimeField47 = islamicChronology43.yearOfEra();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType48 = islamicChronology43.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology49 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone32, leapYearPatternType48);
        org.joda.time.chrono.IslamicChronology islamicChronology50 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone8, leapYearPatternType48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField30", Math.signum(durationField7.compareTo(durationField30)) == -Math.signum(durationField30.compareTo(durationField7)));
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0137");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField10 = islamicChronology0.years();
        org.joda.time.DurationField durationField11 = islamicChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0138");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int7 = dateTimeZone5.getStandardOffset((long) (short) 100);
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone5);
        org.joda.time.DurationField durationField9 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField10", Math.signum(durationField9.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField9)));
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0139");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.monthOfYear();
        org.joda.time.DurationField durationField10 = islamicChronology0.hours();
        org.joda.time.DurationField durationField11 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField11", (durationField3.compareTo(durationField11) == 0) == durationField3.equals(durationField11));
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0140");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str6 = dateTimeZone5.toString();
        org.joda.time.Chronology chronology7 = islamicChronology0.withZone(dateTimeZone5);
        int int9 = dateTimeZone5.getOffset(1L);
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology10.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology10.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology10.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology10.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType15 = islamicChronology10.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5, leapYearPatternType15);
        org.joda.time.Chronology chronology17 = islamicChronology16.withUTC();
        org.joda.time.DurationField durationField18 = islamicChronology16.seconds();
        org.joda.time.DurationField durationField19 = islamicChronology16.weeks();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology16.dayOfWeek();
        org.joda.time.DurationField durationField21 = islamicChronology16.days();
        org.joda.time.DurationField durationField22 = islamicChronology16.centuries();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology16.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField19", (durationField1.compareTo(durationField19) == 0) == durationField1.equals(durationField19));
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0141");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfDay();
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology5.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = islamicChronology5.eras();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str10 = dateTimeZone9.toString();
        boolean boolean11 = dateTimeZone9.isFixed();
        java.lang.String str12 = dateTimeZone9.getID();
        org.joda.time.Chronology chronology13 = islamicChronology5.withZone(dateTimeZone9);
        java.lang.String str14 = dateTimeZone9.toString();
        long long16 = dateTimeZone9.previousTransition(11L);
        org.joda.time.Chronology chronology17 = islamicChronology0.withZone(dateTimeZone9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField7", Math.signum(durationField1.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField1)));
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0142");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.dayOfYear();
        org.joda.time.DurationField durationField8 = islamicChronology3.minutes();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.millisOfSecond();
        org.joda.time.DurationField durationField10 = islamicChronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology3.yearOfEra();
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology12.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str16 = dateTimeZone15.toString();
        boolean boolean17 = dateTimeZone15.isFixed();
        org.joda.time.Chronology chronology18 = islamicChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology12.secondOfDay();
        boolean boolean21 = islamicChronology3.equals((java.lang.Object) islamicChronology12);
        org.joda.time.DurationField durationField22 = islamicChronology3.years();
        org.joda.time.DurationField durationField23 = islamicChronology3.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField23", (durationField6.compareTo(durationField23) == 0) == durationField6.equals(durationField23));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0143");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DurationField durationField6 = islamicChronology0.months();
        java.lang.String str7 = islamicChronology0.toString();
        org.joda.time.DurationField durationField8 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField3", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0144");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField4 = islamicChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField4, and durationField2", !(durationField2.compareTo(durationField4) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField4.compareTo(durationField2))));
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0145");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.secondOfMinute();
        org.joda.time.DurationField durationField5 = islamicChronology3.halfdays();
        org.joda.time.Chronology chronology6 = islamicChronology3.withUTC();
        org.joda.time.DurationField durationField7 = islamicChronology3.days();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology3.dayOfWeek();
        org.joda.time.DurationField durationField9 = islamicChronology3.halfdays();
        org.joda.time.DurationField durationField10 = islamicChronology3.centuries();
        org.joda.time.DurationField durationField11 = islamicChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField5, and durationField7", !(durationField11.compareTo(durationField5) == 0) || (Math.signum(durationField11.compareTo(durationField7)) == Math.signum(durationField5.compareTo(durationField7))));
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0146");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField8", (durationField3.compareTo(durationField8) == 0) == durationField3.equals(durationField8));
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0147");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str5 = dateTimeZone4.toString();
        boolean boolean6 = dateTimeZone4.isFixed();
        java.lang.String str7 = dateTimeZone4.getID();
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone4);
        org.joda.time.DurationField durationField9 = chronology8.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField9, and durationField2", !(durationField2.compareTo(durationField9) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField9.compareTo(durationField2))));
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0148");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField7 = islamicChronology0.millis();
        org.joda.time.DurationField durationField8 = islamicChronology0.years();
        org.joda.time.DurationField durationField9 = islamicChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField8", (durationField9.compareTo(durationField8) == 0) == durationField9.equals(durationField8));
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0149");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyear();
        org.joda.time.DurationField durationField4 = islamicChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField4, and durationField2", !(durationField2.compareTo(durationField4) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField4.compareTo(durationField2))));
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0150");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField5 = islamicChronology0.eras();
        org.joda.time.DurationField durationField6 = islamicChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField6, and durationField5", !(durationField5.compareTo(durationField6) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField6.compareTo(durationField5))));
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0151");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        long long8 = dateTimeZone5.getMillisKeepLocal(dateTimeZone6, (long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone6.getOffset(readableInstant9);
        long long12 = dateTimeZone6.convertUTCToLocal(14460100L);
        org.joda.time.Chronology chronology13 = islamicChronology0.withZone(dateTimeZone6);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology14.halfdayOfDay();
        org.joda.time.DurationField durationField16 = islamicChronology14.days();
        org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology17.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology17.dayOfYear();
        org.joda.time.DurationField durationField20 = islamicChronology17.minutes();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology17.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean25 = dateTimeZone23.equals((java.lang.Object) (-1.0d));
        int int27 = dateTimeZone23.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = dateTimeZone23.isLocalDateTimeGap(localDateTime28);
        int int31 = dateTimeZone23.getStandardOffset((long) 100);
        org.joda.time.Chronology chronology32 = islamicChronology17.withZone(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology17.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology17.era();
        boolean boolean35 = islamicChronology14.equals((java.lang.Object) islamicChronology17);
        org.joda.time.DurationField durationField36 = islamicChronology14.centuries();
        org.joda.time.DurationField durationField37 = islamicChronology14.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField37, durationField16, and durationField20", !(durationField37.compareTo(durationField16) == 0) || (Math.signum(durationField37.compareTo(durationField20)) == Math.signum(durationField16.compareTo(durationField20))));
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0152");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        long long7 = islamicChronology0.add((long) (short) 1, 0L, 4);
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.joda.time.DurationField durationField9 = islamicChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField9, and durationField8", !(durationField8.compareTo(durationField9) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField9.compareTo(durationField8))));
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0153");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str5 = dateTimeZone4.toString();
        boolean boolean6 = dateTimeZone4.isFixed();
        java.lang.String str7 = dateTimeZone4.getID();
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.clockhourOfDay();
        long long13 = islamicChronology0.add(1664L, (-3599990001L), (int) '#');
        org.joda.time.DurationField durationField14 = islamicChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField14, and durationField2", !(durationField2.compareTo(durationField14) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField14.compareTo(durationField2))));
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0154");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        long long9 = islamicChronology0.add(187200035L, (long) ' ', (int) 'a');
        org.joda.time.DurationField durationField10 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.weekyear();
        org.joda.time.DurationField durationField12 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField3, and durationField4", !(durationField12.compareTo(durationField3) == 0) || (Math.signum(durationField12.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0155");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField8 = islamicChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField8, and durationField6", !(durationField6.compareTo(durationField8) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField8.compareTo(durationField6))));
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0156");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfCentury();
        org.joda.time.Chronology chronology8 = islamicChronology0.withUTC();
        org.joda.time.Chronology chronology9 = islamicChronology0.withUTC();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = islamicChronology0.add(readablePeriod10, (-3491990200L), (int) (byte) 10);
        org.joda.time.DurationField durationField14 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField3, and durationField4", !(durationField14.compareTo(durationField3) == 0) || (Math.signum(durationField14.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0157");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.DurationField durationField7 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField7", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField7)) == Math.signum(durationField1.compareTo(durationField7))));
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0158");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology0.weeks();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, 3L, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField12 = islamicChronology0.months();
        org.joda.time.DurationField durationField13 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField1, and durationField3", !(durationField13.compareTo(durationField1) == 0) || (Math.signum(durationField13.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0159");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField7", Math.signum(durationField1.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField1)));
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0160");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = islamicChronology0.getZone();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType5 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField7", Math.signum(durationField3.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField3)));
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0161");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = islamicChronology0.add(readablePeriod6, (-42406761599990L), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.dayOfMonth();
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField13 = islamicChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology12.yearOfEra();
        org.joda.time.DurationField durationField15 = islamicChronology12.weekyears();
        org.joda.time.Chronology chronology16 = islamicChronology12.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology12.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology12.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = islamicChronology12.getZone();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean27 = dateTimeZone25.equals((java.lang.Object) (-1.0d));
        java.lang.String str29 = dateTimeZone25.getName((long) 100);
        int int31 = dateTimeZone25.getStandardOffset((long) (-1));
        long long33 = dateTimeZone23.getMillisKeepLocal(dateTimeZone25, (-4888702990L));
        org.joda.time.Chronology chronology34 = islamicChronology0.withZone(dateTimeZone25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField15", (durationField4.compareTo(durationField15) == 0) == durationField4.equals(durationField15));
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0162");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        long long10 = islamicChronology3.add((long) 1, (long) (byte) 100, 36000000);
        org.joda.time.Chronology chronology11 = islamicChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone14 = chronology11.getZone();
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField16 = islamicChronology15.weeks();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology15.yearOfEra();
        org.joda.time.DurationField durationField18 = islamicChronology15.millis();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology15.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology15.halfdayOfDay();
        org.joda.time.DurationField durationField21 = islamicChronology15.years();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology15.era();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology15.millisOfDay();
        org.joda.time.DurationField durationField24 = islamicChronology15.days();
        org.joda.time.DurationField durationField25 = islamicChronology15.centuries();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology15.monthOfYear();
        boolean boolean27 = dateTimeZone14.equals((java.lang.Object) dateTimeField26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField21", (durationField6.compareTo(durationField21) == 0) == durationField6.equals(durationField21));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0163");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.days();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology0.getZone();
        java.lang.String str7 = dateTimeZone6.getID();
        long long9 = dateTimeZone6.convertUTCToLocal(187238489L);
        long long12 = dateTimeZone6.convertLocalToUTC((long) 3840000, true);
        long long15 = dateTimeZone6.convertLocalToUTC((-41571691200000L), true);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str17 = islamicChronology16.toString();
        long long21 = islamicChronology16.add((long) (short) -1, (long) '4', (int) '#');
        org.joda.time.DurationField durationField22 = islamicChronology16.days();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = islamicChronology16.add(readablePeriod23, (long) 10, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.Chronology chronology28 = islamicChronology16.withZone(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology16.monthOfYear();
        org.joda.time.DurationField durationField30 = islamicChronology16.eras();
        boolean boolean31 = dateTimeZone6.equals((java.lang.Object) islamicChronology16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField30", Math.signum(durationField5.compareTo(durationField30)) == -Math.signum(durationField30.compareTo(durationField5)));
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0164");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str6 = dateTimeZone5.toString();
        org.joda.time.Chronology chronology7 = islamicChronology0.withZone(dateTimeZone5);
        int int9 = dateTimeZone5.getOffset(1L);
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology10.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology10.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology10.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology10.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType15 = islamicChronology10.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5, leapYearPatternType15);
        org.joda.time.Chronology chronology17 = islamicChronology16.withUTC();
        org.joda.time.DurationField durationField18 = islamicChronology16.seconds();
        org.joda.time.DurationField durationField19 = islamicChronology16.weeks();
        org.joda.time.DurationField durationField20 = islamicChronology16.months();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology16.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField19", (durationField1.compareTo(durationField19) == 0) == durationField1.equals(durationField19));
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0165");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        long long9 = dateTimeZone6.getMillisKeepLocal(dateTimeZone7, (long) (byte) -1);
        org.joda.time.Chronology chronology10 = islamicChronology3.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField11 = islamicChronology3.minutes();
        long long15 = islamicChronology3.add((-35999965L), 1010L, 36000000);
        org.joda.time.DurationField durationField16 = islamicChronology3.millis();
        org.joda.time.DateTimeZone dateTimeZone17 = islamicChronology3.getZone();
        org.joda.time.DurationField durationField18 = islamicChronology3.minutes();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology3.yearOfEra();
        org.joda.time.chrono.IslamicChronology islamicChronology20 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField21 = islamicChronology20.weeks();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology20.yearOfEra();
        org.joda.time.DurationField durationField23 = islamicChronology20.millis();
        boolean boolean25 = islamicChronology20.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology20.hourOfDay();
        java.lang.String str27 = islamicChronology20.toString();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology20.dayOfMonth();
        boolean boolean29 = islamicChronology3.equals((java.lang.Object) dateTimeField28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField23", (durationField16.compareTo(durationField23) == 0) == durationField16.equals(durationField23));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0166");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField8 = islamicChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField8, and durationField6", !(durationField6.compareTo(durationField8) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField8.compareTo(durationField6))));
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0167");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField3", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0168");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField7 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str11 = dateTimeZone10.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10);
        int int14 = dateTimeZone10.getStandardOffset(10L);
        int int16 = dateTimeZone10.getOffset((-35999900L));
        java.lang.String str18 = dateTimeZone10.getName((long) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str21 = dateTimeZone20.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology22 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology22.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology22.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        long long28 = dateTimeZone25.getMillisKeepLocal(dateTimeZone26, (long) (byte) -1);
        org.joda.time.Chronology chronology29 = islamicChronology22.withZone(dateTimeZone26);
        long long31 = dateTimeZone10.getMillisKeepLocal(dateTimeZone26, (-80689900L));
        org.joda.time.ReadableInstant readableInstant32 = null;
        int int33 = dateTimeZone26.getOffset(readableInstant32);
        org.joda.time.chrono.IslamicChronology islamicChronology34 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone26);
        org.joda.time.chrono.IslamicChronology islamicChronology35 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField36 = islamicChronology35.weekyearOfCentury();
        org.joda.time.DurationField durationField37 = islamicChronology35.eras();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str40 = dateTimeZone39.toString();
        boolean boolean41 = dateTimeZone39.isFixed();
        java.lang.String str42 = dateTimeZone39.getID();
        org.joda.time.Chronology chronology43 = islamicChronology35.withZone(dateTimeZone39);
        java.lang.String str44 = dateTimeZone39.toString();
        long long46 = dateTimeZone26.getMillisKeepLocal(dateTimeZone39, (long) ' ');
        org.joda.time.Chronology chronology47 = islamicChronology0.withZone(dateTimeZone39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField37", Math.signum(durationField1.compareTo(durationField37)) == -Math.signum(durationField37.compareTo(durationField1)));
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0169");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfEra();
        java.lang.String str6 = islamicChronology0.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField8 = islamicChronology7.hours();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology7.millis();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology7.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str14 = dateTimeZone13.toString();
        long long16 = dateTimeZone13.nextTransition(3L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone13.getShortName((-84478968L), locale18);
        java.lang.String str21 = dateTimeZone13.getNameKey(475260000L);
        org.joda.time.Chronology chronology22 = islamicChronology7.withZone(dateTimeZone13);
        java.lang.String str24 = dateTimeZone13.getNameKey(5731512287551200000L);
        org.joda.time.Chronology chronology25 = islamicChronology0.withZone(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str28 = dateTimeZone27.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology29 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology29.clockhourOfDay();
        org.joda.time.DurationField durationField31 = islamicChronology29.hours();
        java.lang.String str32 = islamicChronology29.toString();
        org.joda.time.DurationField durationField33 = islamicChronology29.months();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology29.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField35 = islamicChronology29.centuryOfEra();
        org.joda.time.DurationField durationField36 = islamicChronology29.minutes();
        org.joda.time.DateTimeField dateTimeField37 = islamicChronology29.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone38 = islamicChronology29.getZone();
        org.joda.time.Chronology chronology39 = islamicChronology0.withZone(dateTimeZone38);
        long long41 = dateTimeZone38.nextTransition(180601022L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField31", (durationField8.compareTo(durationField31) == 0) == durationField8.equals(durationField31));
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0170");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DurationField durationField5 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField5", Math.signum(durationField3.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField3)));
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0171");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField3 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField6 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField1, and durationField3", !(durationField6.compareTo(durationField1) == 0) || (Math.signum(durationField6.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0172");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.eras();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = islamicChronology0.add(readablePeriod4, 5731512287947199990L, 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField3", Math.signum(durationField1.compareTo(durationField3)) == -Math.signum(durationField3.compareTo(durationField1)));
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0173");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.dayOfYear();
        org.joda.time.DurationField durationField8 = islamicChronology3.minutes();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.millisOfSecond();
        org.joda.time.DurationField durationField10 = islamicChronology3.halfdays();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType11 = islamicChronology3.getLeapYearPatternType();
        org.joda.time.DurationField durationField12 = islamicChronology3.years();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology3.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField12", (durationField6.compareTo(durationField12) == 0) == durationField6.equals(durationField12));
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0174");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.yearOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField6 = islamicChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.monthOfYear();
        long long11 = islamicChronology3.add(52L, 10100L, 3840000);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str14 = dateTimeZone13.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology15.clockhourOfDay();
        org.joda.time.DurationField durationField17 = islamicChronology15.hours();
        java.lang.String str18 = islamicChronology15.toString();
        org.joda.time.DurationField durationField19 = islamicChronology15.months();
        int int20 = islamicChronology15.getMinimumDaysInFirstWeek();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = islamicChronology15.add(readablePeriod21, (long) 0, (int) '4');
        org.joda.time.Chronology chronology25 = islamicChronology15.withUTC();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology15.hourOfHalfday();
        org.joda.time.DurationField durationField27 = islamicChronology15.years();
        boolean boolean28 = islamicChronology3.equals((java.lang.Object) islamicChronology15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField27", (durationField5.compareTo(durationField27) == 0) == durationField5.equals(durationField27));
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0175");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField3", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0176");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone3 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField4 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField6 = islamicChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField6, and durationField2", !(durationField2.compareTo(durationField6) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField6.compareTo(durationField2))));
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0177");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.dayOfYear();
        org.joda.time.DurationField durationField8 = islamicChronology3.centuries();
        org.joda.time.DurationField durationField9 = islamicChronology3.years();
        org.joda.time.DurationField durationField10 = islamicChronology3.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField9", (durationField10.compareTo(durationField9) == 0) == durationField10.equals(durationField9));
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0178");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DurationField durationField5 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField5", Math.signum(durationField3.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField3)));
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0179");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyearOfCentury();
        int int4 = islamicChronology0.getMinimumDaysInFirstWeek();
        long long10 = islamicChronology0.getDateTimeMillis(0L, (int) (byte) 10, (int) '#', (int) (byte) 0, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField12 = islamicChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField12, and durationField2", !(durationField2.compareTo(durationField12) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField12.compareTo(durationField2))));
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0180");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        long long5 = islamicChronology0.add((long) (short) -1, (long) '4', (int) '#');
        long long11 = islamicChronology0.getDateTimeMillis((-35999900L), 1, (int) '#', 10, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField13 = islamicChronology0.eras();
        org.joda.time.DurationField durationField14 = islamicChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField14, and durationField13", !(durationField13.compareTo(durationField14) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField14.compareTo(durationField13))));
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0181");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField10 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0182");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, (long) 10, (int) (short) 100);
        org.joda.time.DurationField durationField9 = islamicChronology0.years();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType10 = islamicChronology0.getLeapYearPatternType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0183");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forID("+00:00");
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone7.getName((-80689900L), locale9);
        long long12 = dateTimeZone7.previousTransition((long) 36000000);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str15 = dateTimeZone14.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology16.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone18 = islamicChronology16.getZone();
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone18.getName(0L, locale20);
        long long23 = dateTimeZone7.getMillisKeepLocal(dateTimeZone18, 36000000L);
        org.joda.time.Chronology chronology24 = islamicChronology0.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField25 = chronology24.dayOfWeek();
        org.joda.time.DurationField durationField26 = chronology24.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField1, and durationField3", !(durationField26.compareTo(durationField1) == 0) || (Math.signum(durationField26.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0184");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean11 = dateTimeZone9.equals((java.lang.Object) (-1.0d));
        int int13 = dateTimeZone9.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone9.isLocalDateTimeGap(localDateTime14);
        org.joda.time.Chronology chronology16 = islamicChronology0.withZone(dateTimeZone9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        org.joda.time.chrono.IslamicChronology islamicChronology18 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField19 = islamicChronology18.weeks();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology18.yearOfEra();
        org.joda.time.DurationField durationField21 = islamicChronology18.millis();
        boolean boolean23 = islamicChronology18.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology18.hourOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType25 = islamicChronology18.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology26 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone9, leapYearPatternType25);
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology26.dayOfYear();
        org.joda.time.DurationField durationField28 = islamicChronology26.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField3, and durationField4", !(durationField28.compareTo(durationField3) == 0) || (Math.signum(durationField28.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0185");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str8 = dateTimeZone7.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology9.dayOfWeek();
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField13 = islamicChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology12.yearOfEra();
        org.joda.time.DurationField durationField15 = islamicChronology12.weekyears();
        org.joda.time.Chronology chronology16 = islamicChronology12.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology12.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone19 = islamicChronology12.getZone();
        int int21 = dateTimeZone19.getStandardOffset(10L);
        org.joda.time.Chronology chronology22 = islamicChronology9.withZone(dateTimeZone19);
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology23.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology23.dayOfYear();
        org.joda.time.DurationField durationField26 = islamicChronology23.minutes();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology23.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean31 = dateTimeZone29.equals((java.lang.Object) (-1.0d));
        int int33 = dateTimeZone29.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = dateTimeZone29.isLocalDateTimeGap(localDateTime34);
        int int37 = dateTimeZone29.getStandardOffset((long) 100);
        org.joda.time.Chronology chronology38 = islamicChronology23.withZone(dateTimeZone29);
        int int40 = dateTimeZone29.getOffsetFromLocal(11L);
        long long42 = dateTimeZone19.getMillisKeepLocal(dateTimeZone29, 1000L);
        org.joda.time.Chronology chronology43 = islamicChronology0.withZone(dateTimeZone19);
        org.joda.time.DurationField durationField44 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField44, durationField2, and durationField13", !(durationField44.compareTo(durationField2) == 0) || (Math.signum(durationField44.compareTo(durationField13)) == Math.signum(durationField2.compareTo(durationField13))));
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0186");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField8 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField10 = islamicChronology0.months();
        org.joda.time.DurationField durationField11 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField12 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField1, and durationField3", !(durationField12.compareTo(durationField1) == 0) || (Math.signum(durationField12.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0187");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = islamicChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str8 = dateTimeZone7.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7);
        int int11 = dateTimeZone7.getStandardOffset(10L);
        int int13 = dateTimeZone7.getOffset((-35999900L));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType14 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7, leapYearPatternType14);
        java.lang.String str17 = dateTimeZone7.getNameKey(32L);
        org.joda.time.Chronology chronology18 = islamicChronology0.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField20 = islamicChronology0.eras();
        org.joda.time.DurationField durationField21 = islamicChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField20", Math.signum(durationField3.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField3)));
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0188");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.days();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField7", Math.signum(durationField5.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField5)));
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0189");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfDay();
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField7 = islamicChronology6.weeks();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology6.yearOfEra();
        org.joda.time.DurationField durationField9 = islamicChronology6.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology6.era();
        org.joda.time.DurationField durationField11 = islamicChronology6.seconds();
        org.joda.time.DateTimeZone dateTimeZone12 = islamicChronology6.getZone();
        org.joda.time.DurationField durationField13 = islamicChronology6.minutes();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int18 = dateTimeZone16.getStandardOffset((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone16.getOffset(readableInstant19);
        long long22 = dateTimeZone16.previousTransition((long) (-1));
        long long24 = dateTimeZone16.nextTransition(36000000L);
        org.joda.time.Chronology chronology25 = islamicChronology6.withZone(dateTimeZone16);
        java.lang.String str27 = dateTimeZone16.getName(0L);
        org.joda.time.Chronology chronology28 = islamicChronology0.withZone(dateTimeZone16);
        org.joda.time.DurationField durationField29 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField29, durationField7, and durationField9", !(durationField29.compareTo(durationField7) == 0) || (Math.signum(durationField29.compareTo(durationField9)) == Math.signum(durationField7.compareTo(durationField9))));
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0190");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType5 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField11 = islamicChronology10.weeks();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology10.yearOfEra();
        org.joda.time.DurationField durationField13 = islamicChronology10.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology10.year();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology10.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology10.millisOfSecond();
        long long20 = islamicChronology10.add(1664L, (-880789680L), (int) (short) 0);
        boolean boolean21 = islamicChronology0.equals((java.lang.Object) long20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField11", Math.signum(durationField9.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField9)));
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0191");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = islamicChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str8 = dateTimeZone7.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7);
        int int11 = dateTimeZone7.getStandardOffset(10L);
        int int13 = dateTimeZone7.getOffset((-35999900L));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType14 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7, leapYearPatternType14);
        java.lang.String str17 = dateTimeZone7.getNameKey(32L);
        org.joda.time.Chronology chronology18 = islamicChronology0.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField20 = islamicChronology0.eras();
        org.joda.time.DurationField durationField21 = islamicChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField20", Math.signum(durationField3.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField3)));
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0192");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = islamicChronology0.add(readablePeriod8, (long) 4, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.monthOfYear();
        org.joda.time.DurationField durationField14 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField1, and durationField3", !(durationField14.compareTo(durationField1) == 0) || (Math.signum(durationField14.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0193");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.millisOfSecond();
        org.joda.time.DurationField durationField7 = islamicChronology3.days();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology3.eras();
        long long13 = islamicChronology3.add((-42406761599991L), (-80700000L), (int) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField9", Math.signum(durationField7.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField7)));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0194");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        long long6 = islamicChronology0.add((long) 10, (long) 100, (int) (short) 0);
        org.joda.time.DurationField durationField7 = islamicChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField7, and durationField2", !(durationField2.compareTo(durationField7) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField7.compareTo(durationField2))));
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0195");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField8 = islamicChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField8, and durationField2", !(durationField2.compareTo(durationField8) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField8.compareTo(durationField2))));
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0196");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        long long11 = islamicChronology3.add((long) (byte) 10, (long) (short) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology3.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology3.year();
        long long17 = islamicChronology3.add(32L, 14460099L, 10);
        org.joda.time.DurationField durationField18 = islamicChronology3.seconds();
        org.joda.time.DurationField durationField19 = islamicChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField5, and durationField6", !(durationField19.compareTo(durationField5) == 0) || (Math.signum(durationField19.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0197");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.years();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField6", (durationField2.compareTo(durationField6) == 0) == durationField2.equals(durationField6));
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0198");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str4 = dateTimeZone3.toString();
        boolean boolean5 = dateTimeZone3.isFixed();
        org.joda.time.Chronology chronology6 = islamicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.clockhourOfHalfday();
        long long12 = islamicChronology0.add(1819L, (long) (byte) 1, 0);
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField14 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField15 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology0.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField15", Math.signum(durationField14.compareTo(durationField15)) == -Math.signum(durationField15.compareTo(durationField14)));
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0199");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        java.lang.String str3 = islamicChronology0.toString();
        int int4 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField6 = islamicChronology5.weeks();
        org.joda.time.Chronology chronology7 = islamicChronology5.withUTC();
        org.joda.time.DurationField durationField8 = islamicChronology5.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology5.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str12 = dateTimeZone11.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone11);
        int int15 = dateTimeZone11.getStandardOffset(10L);
        int int17 = dateTimeZone11.getOffset((-35999900L));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType18 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone11, leapYearPatternType18);
        org.joda.time.Chronology chronology20 = islamicChronology5.withZone(dateTimeZone11);
        org.joda.time.Chronology chronology21 = islamicChronology0.withZone(dateTimeZone11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField6", Math.signum(durationField2.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField2)));
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0200");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        int int5 = dateTimeZone1.getStandardOffset(10L);
        int int7 = dateTimeZone1.getOffset((-35999900L));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType8 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1, leapYearPatternType8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone1.getOffset(readableInstant10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str14 = dateTimeZone13.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology15.clockhourOfDay();
        org.joda.time.DurationField durationField17 = islamicChronology15.hours();
        org.joda.time.DurationField durationField18 = islamicChronology15.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology15.dayOfYear();
        org.joda.time.DurationField durationField20 = islamicChronology15.minutes();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology15.millisOfSecond();
        org.joda.time.DurationField durationField22 = islamicChronology15.halfdays();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType23 = islamicChronology15.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology24 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1, leapYearPatternType23);
        org.joda.time.DurationField durationField25 = islamicChronology24.years();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology24.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField25", (durationField18.compareTo(durationField25) == 0) == durationField18.equals(durationField25));
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0201");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField11 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField1, and durationField3", !(durationField11.compareTo(durationField1) == 0) || (Math.signum(durationField11.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0202");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField7 = islamicChronology0.years();
        org.joda.time.DurationField durationField8 = islamicChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField7", (durationField3.compareTo(durationField7) == 0) == durationField3.equals(durationField7));
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0203");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField8", (durationField3.compareTo(durationField8) == 0) == durationField3.equals(durationField8));
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0204");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = islamicChronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology3.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType12 = islamicChronology3.getLeapYearPatternType();
        java.lang.String str13 = islamicChronology3.toString();
        org.joda.time.DurationField durationField14 = islamicChronology3.years();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology3.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField14", (durationField6.compareTo(durationField14) == 0) == durationField6.equals(durationField14));
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0205");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.eras();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField6", Math.signum(durationField2.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField2)));
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0206");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        long long10 = islamicChronology0.getDateTimeMillis((int) ' ', 1, (int) (byte) 10, 4, (int) (short) 0, (int) (short) 0, 1);
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField12 = islamicChronology0.eras();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = islamicChronology0.add(readablePeriod13, 0L, 0);
        org.joda.time.DateTimeZone dateTimeZone17 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField18 = islamicChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField18, and durationField12", !(durationField12.compareTo(durationField18) == 0) || (Math.signum(durationField12.compareTo(durationField12)) == Math.signum(durationField18.compareTo(durationField12))));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0207");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DurationField durationField4 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField1, and durationField3", !(durationField4.compareTo(durationField1) == 0) || (Math.signum(durationField4.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0208");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfCentury();
        org.joda.time.Chronology chronology8 = islamicChronology0.withUTC();
        org.joda.time.Chronology chronology9 = islamicChronology0.withUTC();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = islamicChronology0.add(readablePeriod10, (-3491990200L), (int) (byte) 10);
        org.joda.time.DurationField durationField14 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField15 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField3, and durationField4", !(durationField15.compareTo(durationField3) == 0) || (Math.signum(durationField15.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0209");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        long long5 = islamicChronology0.add((long) (short) -1, (long) '4', (int) '#');
        long long11 = islamicChronology0.getDateTimeMillis((-35999900L), 1, (int) '#', 10, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField13 = islamicChronology0.eras();
        org.joda.time.DurationField durationField14 = islamicChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField14, and durationField13", !(durationField13.compareTo(durationField14) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField14.compareTo(durationField13))));
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0210");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.eras();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField3", Math.signum(durationField1.compareTo(durationField3)) == -Math.signum(durationField3.compareTo(durationField1)));
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0211");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField3", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0212");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField7", Math.signum(durationField1.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField1)));
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0213");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.joda.time.DurationField durationField7 = islamicChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField6", (durationField7.compareTo(durationField6) == 0) == durationField7.equals(durationField6));
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0214");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField9 = islamicChronology0.years();
        org.joda.time.Chronology chronology10 = islamicChronology0.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0215");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField3", Math.signum(durationField1.compareTo(durationField3)) == -Math.signum(durationField3.compareTo(durationField1)));
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0216");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyearOfCentury();
        int int4 = islamicChronology0.getMinimumDaysInFirstWeek();
        long long10 = islamicChronology0.getDateTimeMillis(0L, (int) (byte) 10, (int) '#', (int) (byte) 0, (int) (byte) 0);
        org.joda.time.DurationField durationField11 = islamicChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField11, and durationField2", !(durationField2.compareTo(durationField11) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField11.compareTo(durationField2))));
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0217");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField8 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField8", (durationField3.compareTo(durationField8) == 0) == durationField3.equals(durationField8));
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0218");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str9 = dateTimeZone8.toString();
        boolean boolean11 = dateTimeZone8.isStandardOffset((long) (byte) 10);
        java.util.TimeZone timeZone12 = dateTimeZone8.toTimeZone();
        long long14 = dateTimeZone8.convertUTCToLocal(1010L);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone8.getShortName(3600000001L, locale16);
        org.joda.time.Chronology chronology18 = islamicChronology0.withZone(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField20 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField21 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField1, and durationField3", !(durationField21.compareTo(durationField1) == 0) || (Math.signum(durationField21.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0219");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField5 = islamicChronology0.eras();
        org.joda.time.DurationField durationField6 = islamicChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField6, and durationField5", !(durationField5.compareTo(durationField6) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField6.compareTo(durationField5))));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0220");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology3.monthOfYear();
        org.joda.time.DurationField durationField11 = islamicChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField5, and durationField6", !(durationField11.compareTo(durationField5) == 0) || (Math.signum(durationField11.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0221");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.months();
        org.joda.time.DurationField durationField8 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.year();
        org.joda.time.Chronology chronology10 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField12 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField13 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField7, and durationField8", !(durationField13.compareTo(durationField7) == 0) || (Math.signum(durationField13.compareTo(durationField8)) == Math.signum(durationField7.compareTo(durationField8))));
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0222");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology0.years();
        org.joda.time.DurationField durationField9 = islamicChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField8", (durationField3.compareTo(durationField8) == 0) == durationField3.equals(durationField8));
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0223");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str11 = dateTimeZone10.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology12.clockhourOfDay();
        org.joda.time.DurationField durationField14 = islamicChronology12.hours();
        org.joda.time.DurationField durationField15 = islamicChronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology12.dayOfYear();
        org.joda.time.DurationField durationField17 = islamicChronology12.minutes();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology12.millisOfSecond();
        org.joda.time.DurationField durationField19 = islamicChronology12.halfdays();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology12.yearOfEra();
        org.joda.time.chrono.IslamicChronology islamicChronology21 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology21.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str25 = dateTimeZone24.toString();
        boolean boolean26 = dateTimeZone24.isFixed();
        org.joda.time.Chronology chronology27 = islamicChronology21.withZone(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology21.hourOfDay();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology21.secondOfDay();
        boolean boolean30 = islamicChronology12.equals((java.lang.Object) islamicChronology21);
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology21.millisOfDay();
        boolean boolean32 = islamicChronology0.equals((java.lang.Object) dateTimeField31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField17", (durationField3.compareTo(durationField17) == 0) == durationField3.equals(durationField17));
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0224");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
        long long11 = islamicChronology0.add((-35999965L), (-41576119749407L), (int) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField7", Math.signum(durationField1.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField1)));
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0225");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology0.eras();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField5", Math.signum(durationField1.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField1)));
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0226");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str5 = dateTimeZone4.toString();
        boolean boolean6 = dateTimeZone4.isFixed();
        java.lang.String str7 = dateTimeZone4.getID();
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField11 = islamicChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField11, and durationField2", !(durationField2.compareTo(durationField11) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField11.compareTo(durationField2))));
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0227");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DurationField durationField5 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField3, and durationField4", !(durationField5.compareTo(durationField3) == 0) || (Math.signum(durationField5.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0228");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField8 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField8", (durationField3.compareTo(durationField8) == 0) == durationField3.equals(durationField8));
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0229");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField1, and durationField8", !(durationField11.compareTo(durationField1) == 0) || (Math.signum(durationField11.compareTo(durationField8)) == Math.signum(durationField1.compareTo(durationField8))));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0230");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        java.lang.String str9 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField11 = islamicChronology0.halfdays();
        org.joda.time.DurationField durationField12 = islamicChronology0.years();
        org.joda.time.DurationField durationField13 = islamicChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField12", (durationField8.compareTo(durationField12) == 0) == durationField8.equals(durationField12));
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0231");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField12 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField1, and durationField3", !(durationField12.compareTo(durationField1) == 0) || (Math.signum(durationField12.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0232");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str5 = dateTimeZone4.toString();
        boolean boolean6 = dateTimeZone4.isFixed();
        java.lang.String str7 = dateTimeZone4.getID();
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField12 = islamicChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField12, and durationField2", !(durationField2.compareTo(durationField12) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField12.compareTo(durationField2))));
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0233");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = islamicChronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology3.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType12 = islamicChronology3.getLeapYearPatternType();
        java.lang.String str13 = islamicChronology3.toString();
        org.joda.time.DurationField durationField14 = islamicChronology3.years();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology3.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField14", (durationField6.compareTo(durationField14) == 0) == durationField6.equals(durationField14));
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0234");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.halfdayOfDay();
        org.joda.time.Chronology chronology10 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField12 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField13 = islamicChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField13", (durationField6.compareTo(durationField13) == 0) == durationField6.equals(durationField13));
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0235");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.era();
        org.joda.time.DurationField durationField4 = islamicChronology0.eras();
        org.joda.time.Chronology chronology5 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField6 = chronology5.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField6, and durationField4", !(durationField4.compareTo(durationField6) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField6.compareTo(durationField4))));
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0236");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField6 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField3", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0237");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology0.getZone();
        org.joda.time.Chronology chronology8 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField3", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0238");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.dayOfWeek();
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField7 = islamicChronology6.weeks();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology6.yearOfEra();
        org.joda.time.DurationField durationField9 = islamicChronology6.weekyears();
        org.joda.time.Chronology chronology10 = islamicChronology6.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology6.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology6.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone13 = islamicChronology6.getZone();
        int int15 = dateTimeZone13.getStandardOffset(10L);
        org.joda.time.Chronology chronology16 = islamicChronology3.withZone(dateTimeZone13);
        org.joda.time.DurationField durationField17 = chronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField7, and durationField9", !(durationField17.compareTo(durationField7) == 0) || (Math.signum(durationField17.compareTo(durationField9)) == Math.signum(durationField7.compareTo(durationField9))));
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0239");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.dayOfYear();
        org.joda.time.DurationField durationField8 = islamicChronology3.centuries();
        org.joda.time.DurationField durationField9 = islamicChronology3.years();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology3.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField9", (durationField6.compareTo(durationField9) == 0) == durationField6.equals(durationField9));
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0240");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField11 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField4", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0241");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.year();
        org.joda.time.DurationField durationField11 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField11", (durationField8.compareTo(durationField11) == 0) == durationField8.equals(durationField11));
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0242");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField11 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField4", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0243");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.minutes();
        long long12 = islamicChronology0.getDateTimeMillis((-35999999L), (int) (short) 0, (int) ' ', (int) (short) 1, (int) ' ');
        java.lang.String str13 = islamicChronology0.toString();
        org.joda.time.DurationField durationField14 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology0.yearOfEra();
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField17 = islamicChronology16.weeks();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology16.yearOfEra();
        org.joda.time.DurationField durationField19 = islamicChronology16.weekyears();
        org.joda.time.Chronology chronology20 = islamicChronology16.withUTC();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology16.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology16.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone23 = islamicChronology16.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        long long28 = dateTimeZone25.getMillisKeepLocal(dateTimeZone26, (long) (byte) -1);
        long long30 = dateTimeZone23.getMillisKeepLocal(dateTimeZone25, 3601004L);
        org.joda.time.Chronology chronology31 = islamicChronology0.withZone(dateTimeZone25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField19", (durationField14.compareTo(durationField19) == 0) == durationField14.equals(durationField19));
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0244");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.millisOfSecond();
        org.joda.time.DurationField durationField7 = islamicChronology3.days();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology3.eras();
        org.joda.time.DateTimeZone dateTimeZone11 = islamicChronology3.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField10", Math.signum(durationField7.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField7)));
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0245");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField5 = islamicChronology0.millis();
        java.lang.String str6 = islamicChronology0.toString();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField5", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField5)) == Math.signum(durationField1.compareTo(durationField5))));
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0246");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.minuteOfDay();
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField7 = islamicChronology6.weeks();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology6.yearOfEra();
        org.joda.time.DurationField durationField9 = islamicChronology6.weekyears();
        org.joda.time.DurationField durationField10 = islamicChronology6.weeks();
        org.joda.time.DurationField durationField11 = islamicChronology6.halfdays();
        boolean boolean12 = islamicChronology3.equals((java.lang.Object) islamicChronology6);
        org.joda.time.DurationField durationField13 = islamicChronology6.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField7, and durationField9", !(durationField13.compareTo(durationField7) == 0) || (Math.signum(durationField13.compareTo(durationField9)) == Math.signum(durationField7.compareTo(durationField9))));
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0247");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField3", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0248");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField8 = islamicChronology7.weeks();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology7.yearOfEra();
        org.joda.time.DurationField durationField10 = islamicChronology7.weekyears();
        org.joda.time.Chronology chronology11 = islamicChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology7.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology7.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone14 = islamicChronology7.getZone();
        int int16 = dateTimeZone14.getStandardOffset(10L);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone14.isLocalDateTimeGap(localDateTime17);
        java.lang.String str19 = dateTimeZone14.toString();
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone14.isLocalDateTimeGap(localDateTime20);
        long long23 = dateTimeZone14.previousTransition((-41572483199965L));
        org.joda.time.Chronology chronology24 = islamicChronology0.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField26 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField3, and durationField4", !(durationField26.compareTo(durationField3) == 0) || (Math.signum(durationField26.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0249");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfEra();
        java.lang.String str6 = islamicChronology0.toString();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        java.lang.String str8 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.era();
        org.joda.time.Chronology chronology10 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField11 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField11", Math.signum(durationField7.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField7)));
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0250");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.millis();
        org.joda.time.DurationField durationField7 = islamicChronology0.halfdays();
        int int8 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField3", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0251");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.monthOfYear();
        java.lang.String str9 = islamicChronology0.toString();
        org.joda.time.DurationField durationField10 = islamicChronology0.years();
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField12 = islamicChronology11.weeks();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology11.yearOfEra();
        org.joda.time.DurationField durationField14 = islamicChronology11.weekyears();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str17 = dateTimeZone16.toString();
        org.joda.time.Chronology chronology18 = islamicChronology11.withZone(dateTimeZone16);
        int int20 = dateTimeZone16.getOffset(1L);
        long long23 = dateTimeZone16.adjustOffset((long) (short) 1, false);
        int int25 = dateTimeZone16.getStandardOffset(32L);
        org.joda.time.chrono.IslamicChronology islamicChronology26 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField27 = islamicChronology26.weeks();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology26.yearOfEra();
        org.joda.time.DurationField durationField29 = islamicChronology26.millis();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology26.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology26.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology26.weekyear();
        org.joda.time.DateTimeZone dateTimeZone33 = islamicChronology26.getZone();
        long long35 = dateTimeZone16.getMillisKeepLocal(dateTimeZone33, (long) 4);
        int int37 = dateTimeZone33.getOffset(359999989L);
        java.lang.String str39 = dateTimeZone33.getName((-59719564684799965L));
        org.joda.time.Chronology chronology40 = islamicChronology0.withZone(dateTimeZone33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0252");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField3", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0253");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        java.lang.String str6 = islamicChronology3.toString();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        int int8 = islamicChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = islamicChronology3.add(readablePeriod9, (long) 0, (int) '4');
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology3.yearOfEra();
        org.joda.time.DurationField durationField14 = islamicChronology3.minutes();
        org.joda.time.DurationField durationField15 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology3.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology3.millisOfDay();
        org.joda.time.DurationField durationField18 = islamicChronology3.years();
        org.joda.time.DurationField durationField19 = islamicChronology3.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField18", (durationField15.compareTo(durationField18) == 0) == durationField15.equals(durationField18));
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0254");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        long long6 = islamicChronology0.add((long) 10, (long) 100, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.millisOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType9 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.era();
        long long14 = islamicChronology0.add((-118747900L), (-35999900L), (int) (byte) 0);
        org.joda.time.DurationField durationField15 = islamicChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField15, and durationField2", !(durationField2.compareTo(durationField15) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField15.compareTo(durationField2))));
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0255");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        java.lang.String str6 = islamicChronology3.toString();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        int int8 = islamicChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = islamicChronology3.add(readablePeriod9, (long) 0, (int) '4');
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology3.yearOfEra();
        org.joda.time.DurationField durationField14 = islamicChronology3.minutes();
        org.joda.time.DurationField durationField15 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology3.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology3.millisOfDay();
        org.joda.time.DurationField durationField18 = islamicChronology3.years();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology3.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField18", (durationField15.compareTo(durationField18) == 0) == durationField15.equals(durationField18));
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0256");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.year();
        org.joda.time.DurationField durationField11 = islamicChronology0.years();
        long long15 = islamicChronology0.add((-2044528502394613L), (-4888702989L), 360240000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField11", (durationField8.compareTo(durationField11) == 0) == durationField8.equals(durationField11));
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0257");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology0.weeks();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, 3L, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.centuryOfEra();
        org.joda.time.Chronology chronology12 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField13 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField1, and durationField3", !(durationField13.compareTo(durationField1) == 0) || (Math.signum(durationField13.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0258");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        long long11 = islamicChronology3.add((long) (byte) 10, (long) (short) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology3.era();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology3.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str17 = dateTimeZone16.toString();
        boolean boolean19 = dateTimeZone16.isStandardOffset((long) (byte) 10);
        java.util.TimeZone timeZone20 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.chrono.IslamicChronology islamicChronology24 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology24.weekyearOfCentury();
        org.joda.time.DurationField durationField26 = islamicChronology24.eras();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str29 = dateTimeZone28.toString();
        boolean boolean30 = dateTimeZone28.isFixed();
        java.lang.String str31 = dateTimeZone28.getID();
        org.joda.time.Chronology chronology32 = islamicChronology24.withZone(dateTimeZone28);
        java.lang.String str33 = dateTimeZone28.toString();
        int int35 = dateTimeZone28.getStandardOffset(14459968L);
        org.joda.time.ReadableInstant readableInstant36 = null;
        int int37 = dateTimeZone28.getOffset(readableInstant36);
        boolean boolean38 = dateTimeZone23.equals((java.lang.Object) int37);
        org.joda.time.Chronology chronology39 = islamicChronology3.withZone(dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField26", Math.signum(durationField5.compareTo(durationField26)) == -Math.signum(durationField26.compareTo(durationField5)));
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0259");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology3.millisOfSecond();
        org.joda.time.Chronology chronology12 = islamicChronology3.withUTC();
        org.joda.time.DurationField durationField13 = islamicChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField5, and durationField6", !(durationField13.compareTo(durationField5) == 0) || (Math.signum(durationField13.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0260");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str5 = dateTimeZone4.toString();
        boolean boolean6 = dateTimeZone4.isFixed();
        java.lang.String str7 = dateTimeZone4.getID();
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.era();
        org.joda.time.DurationField durationField10 = islamicChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField10, and durationField2", !(durationField2.compareTo(durationField10) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField10.compareTo(durationField2))));
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0261");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) (-1.0d));
        int int5 = dateTimeZone1.getOffset((long) '4');
        java.lang.String str7 = dateTimeZone1.getName(14460100L);
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology8.hourOfHalfday();
        org.joda.time.DurationField durationField10 = islamicChronology8.eras();
        org.joda.time.DurationField durationField11 = islamicChronology8.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField11, and durationField10", !(durationField10.compareTo(durationField11) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField11.compareTo(durationField10))));
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0262");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = islamicChronology0.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        long long7 = dateTimeZone4.previousTransition(14460100L);
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField9 = islamicChronology8.weeks();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology8.yearOfEra();
        org.joda.time.DurationField durationField11 = islamicChronology8.millis();
        boolean boolean13 = islamicChronology8.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology8.hourOfDay();
        org.joda.time.DurationField durationField15 = islamicChronology8.halfdays();
        long long19 = islamicChronology8.add(0L, 1010L, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str22 = dateTimeZone21.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology23.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology23.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        long long29 = dateTimeZone26.getMillisKeepLocal(dateTimeZone27, (long) (byte) -1);
        org.joda.time.Chronology chronology30 = islamicChronology23.withZone(dateTimeZone27);
        org.joda.time.DurationField durationField31 = islamicChronology23.minutes();
        long long35 = islamicChronology23.add((-35999965L), 1010L, 36000000);
        org.joda.time.DurationField durationField36 = islamicChronology23.millis();
        org.joda.time.DateTimeZone dateTimeZone37 = islamicChronology23.getZone();
        org.joda.time.Chronology chronology38 = islamicChronology8.withZone(dateTimeZone37);
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone37.getName(1010L, locale40);
        long long43 = dateTimeZone4.getMillisKeepLocal(dateTimeZone37, 160019155210320L);
        long long46 = dateTimeZone37.convertLocalToUTC((-82789990L), true);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField31", (durationField3.compareTo(durationField31) == 0) == durationField3.equals(durationField31));
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0263");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        long long7 = islamicChronology0.add((long) (short) 1, 0L, 4);
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.joda.time.DurationField durationField9 = islamicChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField9, and durationField8", !(durationField8.compareTo(durationField9) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField9.compareTo(durationField8))));
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0264");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.era();
        org.joda.time.DurationField durationField7 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField7", (durationField3.compareTo(durationField7) == 0) == durationField3.equals(durationField7));
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0265");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField3 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField6 = islamicChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField6, and durationField3", !(durationField3.compareTo(durationField6) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField6.compareTo(durationField3))));
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0266");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        java.lang.String str9 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField11 = islamicChronology0.halfdays();
        org.joda.time.DurationField durationField12 = islamicChronology0.years();
        java.lang.String str13 = islamicChronology0.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField12", (durationField8.compareTo(durationField12) == 0) == durationField8.equals(durationField12));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0267");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField10 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField10", (durationField8.compareTo(durationField10) == 0) == durationField8.equals(durationField10));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0268");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        long long5 = islamicChronology0.add((long) (short) -1, (long) '4', (int) '#');
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = islamicChronology0.add(readablePeriod7, (long) 10, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Chronology chronology12 = islamicChronology0.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.monthOfYear();
        org.joda.time.DurationField durationField14 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str17 = dateTimeZone16.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology18 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology18.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology18.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        long long24 = dateTimeZone21.getMillisKeepLocal(dateTimeZone22, (long) (byte) -1);
        org.joda.time.Chronology chronology25 = islamicChronology18.withZone(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        org.joda.time.Chronology chronology28 = islamicChronology18.withZone(dateTimeZone27);
        int int30 = dateTimeZone27.getStandardOffset((-80689910L));
        long long33 = dateTimeZone27.adjustOffset(129599648472L, true);
        org.joda.time.Chronology chronology34 = islamicChronology0.withZone(dateTimeZone27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField14", Math.signum(durationField6.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField6)));
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0269");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, (long) 10, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField10 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0270");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField3", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0271");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        java.lang.String str6 = islamicChronology3.toString();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        int int8 = islamicChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = islamicChronology3.add(readablePeriod9, (long) 0, (int) '4');
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology3.yearOfEra();
        org.joda.time.DurationField durationField14 = islamicChronology3.minutes();
        org.joda.time.DurationField durationField15 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology3.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology3.millisOfDay();
        org.joda.time.DurationField durationField18 = islamicChronology3.years();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology3.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField18", (durationField15.compareTo(durationField18) == 0) == durationField15.equals(durationField18));
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0272");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.halfdayOfDay();
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology11.weekyear();
        org.joda.time.DateTimeZone dateTimeZone13 = islamicChronology11.getZone();
        int int14 = islamicChronology11.getMinimumDaysInFirstWeek();
        long long19 = islamicChronology11.getDateTimeMillis((int) ' ', 1, (int) (byte) 1, (int) '#');
        org.joda.time.chrono.IslamicChronology islamicChronology20 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField21 = islamicChronology20.weeks();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology20.yearOfEra();
        org.joda.time.DurationField durationField23 = islamicChronology20.weekyears();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str26 = dateTimeZone25.toString();
        org.joda.time.Chronology chronology27 = islamicChronology20.withZone(dateTimeZone25);
        int int29 = dateTimeZone25.getOffset(1L);
        long long32 = dateTimeZone25.adjustOffset((long) (short) 1, false);
        int int34 = dateTimeZone25.getStandardOffset(32L);
        org.joda.time.Chronology chronology35 = islamicChronology11.withZone(dateTimeZone25);
        org.joda.time.Chronology chronology36 = islamicChronology0.withZone(dateTimeZone25);
        org.joda.time.DurationField durationField37 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField37, durationField1, and durationField3", !(durationField37.compareTo(durationField1) == 0) || (Math.signum(durationField37.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0273");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        java.lang.String str3 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField6 = islamicChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField6, and durationField2", !(durationField2.compareTo(durationField6) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField6.compareTo(durationField2))));
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0274");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        long long7 = islamicChronology0.add(10L, 0L, (int) (byte) -1);
        org.joda.time.DurationField durationField8 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField3", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0275");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        long long7 = islamicChronology0.add((long) (short) 1, 0L, 4);
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.joda.time.DurationField durationField9 = islamicChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField9, and durationField8", !(durationField8.compareTo(durationField9) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField9.compareTo(durationField8))));
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0276");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = islamicChronology0.add(readablePeriod6, 1L, 4);
        org.joda.time.Chronology chronology10 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.dayOfMonth();
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str15 = islamicChronology14.toString();
        long long19 = islamicChronology14.add((long) (short) -1, (long) '4', (int) '#');
        long long25 = islamicChronology14.getDateTimeMillis((-35999900L), 1, (int) '#', 10, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology14.yearOfCentury();
        org.joda.time.DurationField durationField27 = islamicChronology14.minutes();
        boolean boolean28 = islamicChronology0.equals((java.lang.Object) durationField27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        long long32 = islamicChronology0.add(readablePeriod29, (long) 'a', 4);
        org.joda.time.DurationField durationField33 = islamicChronology0.days();
        org.joda.time.DurationField durationField34 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField34, durationField3, and durationField33", !(durationField34.compareTo(durationField3) == 0) || (Math.signum(durationField34.compareTo(durationField33)) == Math.signum(durationField3.compareTo(durationField33))));
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0277");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekOfWeekyear();
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology6.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology6.dayOfYear();
        org.joda.time.DurationField durationField9 = islamicChronology6.minutes();
        org.joda.time.DurationField durationField10 = islamicChronology6.halfdays();
        org.joda.time.DurationField durationField11 = islamicChronology6.minutes();
        boolean boolean12 = islamicChronology0.equals((java.lang.Object) durationField11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField11", Math.signum(durationField2.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField2)));
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0278");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfEra();
        java.lang.String str6 = islamicChronology0.toString();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.joda.time.DurationField durationField8 = islamicChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField11 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField7, and durationField8", !(durationField11.compareTo(durationField7) == 0) || (Math.signum(durationField11.compareTo(durationField8)) == Math.signum(durationField7.compareTo(durationField8))));
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0279");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        java.lang.String str11 = dateTimeZone9.getName(1010L);
        boolean boolean13 = dateTimeZone9.isStandardOffset((-41571691200000L));
        int int15 = dateTimeZone9.getOffsetFromLocal((-4884862990L));
        java.lang.String str17 = dateTimeZone9.getNameKey((-50399000L));
        org.joda.time.Chronology chronology18 = islamicChronology0.withZone(dateTimeZone9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField6", Math.signum(durationField2.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField2)));
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0280");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str5 = dateTimeZone4.toString();
        boolean boolean6 = dateTimeZone4.isFixed();
        java.lang.String str7 = dateTimeZone4.getID();
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField9 = chronology8.era();
        org.joda.time.DurationField durationField10 = chronology8.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField10, and durationField2", !(durationField2.compareTo(durationField10) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField10.compareTo(durationField2))));
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0281");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.yearOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField6 = islamicChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.hourOfHalfday();
        org.joda.time.DurationField durationField8 = islamicChronology3.years();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField8", (durationField5.compareTo(durationField8) == 0) == durationField5.equals(durationField8));
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0282");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField7 = islamicChronology0.millis();
        org.joda.time.DurationField durationField8 = islamicChronology0.years();
        org.joda.time.DurationField durationField9 = islamicChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField8", (durationField3.compareTo(durationField8) == 0) == durationField3.equals(durationField8));
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0283");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.era();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField3", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0284");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.months();
        org.joda.time.DurationField durationField8 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = islamicChronology0.add(readablePeriod10, (-35999999L), (int) (short) 0);
        org.joda.time.DurationField durationField14 = islamicChronology0.millis();
        org.joda.time.DurationField durationField15 = islamicChronology0.halfdays();
        org.joda.time.DurationField durationField16 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField7, and durationField8", !(durationField16.compareTo(durationField7) == 0) || (Math.signum(durationField16.compareTo(durationField8)) == Math.signum(durationField7.compareTo(durationField8))));
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0285");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.yearOfEra();
        java.lang.String str8 = islamicChronology3.toString();
        org.joda.time.DurationField durationField9 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField10 = islamicChronology3.halfdays();
        org.joda.time.DurationField durationField11 = islamicChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField9, and durationField10", !(durationField11.compareTo(durationField9) == 0) || (Math.signum(durationField11.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0286");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        long long10 = islamicChronology0.getDateTimeMillis((int) ' ', 1, (int) (byte) 10, 4, (int) (short) 0, (int) (short) 0, 1);
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.weekyear();
        org.joda.time.DurationField durationField13 = islamicChronology0.hours();
        org.joda.time.DurationField durationField14 = islamicChronology0.millis();
        org.joda.time.DurationField durationField15 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField13, and durationField14", !(durationField15.compareTo(durationField13) == 0) || (Math.signum(durationField15.compareTo(durationField14)) == Math.signum(durationField13.compareTo(durationField14))));
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0287");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField3 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField5 = islamicChronology0.years();
        org.joda.time.DurationField durationField6 = islamicChronology0.millis();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField3", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0288");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology0.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology9.weekyearOfCentury();
        org.joda.time.DurationField durationField11 = islamicChronology9.eras();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology9.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone13 = islamicChronology9.getZone();
        long long15 = dateTimeZone7.getMillisKeepLocal(dateTimeZone13, 3564000001L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField11", Math.signum(durationField1.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField1)));
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0289");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField4 = islamicChronology0.days();
        org.joda.time.DurationField durationField5 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.year();
        java.lang.String str7 = islamicChronology0.toString();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField4", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField4)) == Math.signum(durationField1.compareTo(durationField4))));
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0290");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        long long9 = islamicChronology0.add(187200035L, (long) ' ', (int) 'a');
        org.joda.time.DurationField durationField10 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField13 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField4", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0291");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        java.lang.String str3 = islamicChronology0.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField2", Math.signum(durationField1.compareTo(durationField2)) == -Math.signum(durationField2.compareTo(durationField1)));
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0292");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
        org.joda.time.DurationField durationField8 = islamicChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField7", Math.signum(durationField3.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField3)));
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0293");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        long long11 = islamicChronology3.add((long) (byte) 10, (long) (short) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology3.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology3.year();
        long long17 = islamicChronology3.add(32L, 14460099L, 10);
        org.joda.time.DurationField durationField18 = islamicChronology3.years();
        org.joda.time.DateTimeZone dateTimeZone19 = islamicChronology3.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField18", (durationField6.compareTo(durationField18) == 0) == durationField6.equals(durationField18));
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0294");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean8 = dateTimeZone6.equals((java.lang.Object) (-1.0d));
        int int10 = dateTimeZone6.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone6.isLocalDateTimeGap(localDateTime11);
        int int14 = dateTimeZone6.getStandardOffset((long) 100);
        org.joda.time.Chronology chronology15 = islamicChronology0.withZone(dateTimeZone6);
        int int17 = dateTimeZone6.getOffsetFromLocal(11L);
        java.lang.String str19 = dateTimeZone6.getNameKey((-42497827199900L));
        org.joda.time.chrono.IslamicChronology islamicChronology20 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField21 = islamicChronology20.hours();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology20.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology20.year();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology20.centuryOfEra();
        org.joda.time.DurationField durationField25 = islamicChronology20.eras();
        boolean boolean26 = dateTimeZone6.equals((java.lang.Object) durationField25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField3, and durationField21", !(durationField25.compareTo(durationField3) == 0) || (Math.signum(durationField25.compareTo(durationField21)) == Math.signum(durationField3.compareTo(durationField21))));
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0295");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField7 = islamicChronology0.weekyears();
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField9 = islamicChronology8.weeks();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology8.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology8.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone15 = islamicChronology8.getZone();
        org.joda.time.Chronology chronology16 = islamicChronology0.withZone(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField7", (durationField3.compareTo(durationField7) == 0) == durationField3.equals(durationField7));
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0296");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
        org.joda.time.DurationField durationField8 = islamicChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField7", Math.signum(durationField3.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField3)));
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0297");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyearOfCentury();
        long long7 = islamicChronology0.add((long) (short) 1, (-82559998L), (int) ' ');
        org.joda.time.DurationField durationField8 = islamicChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField8, and durationField2", !(durationField2.compareTo(durationField8) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField8.compareTo(durationField2))));
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0298");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = islamicChronology0.add(readablePeriod3, (long) (byte) 100, (int) '#');
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.era();
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField8", Math.signum(durationField1.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField1)));
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0299");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType5 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.joda.time.DurationField durationField10 = islamicChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField10, and durationField9", !(durationField9.compareTo(durationField10) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField10.compareTo(durationField9))));
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0300");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean11 = dateTimeZone9.equals((java.lang.Object) (-1.0d));
        int int13 = dateTimeZone9.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone9.isLocalDateTimeGap(localDateTime14);
        org.joda.time.Chronology chronology16 = islamicChronology0.withZone(dateTimeZone9);
        long long18 = dateTimeZone9.convertUTCToLocal((long) (short) -1);
        java.util.TimeZone timeZone19 = dateTimeZone9.toTimeZone();
        org.joda.time.chrono.IslamicChronology islamicChronology20 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField21 = islamicChronology20.weeks();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology20.yearOfEra();
        org.joda.time.DurationField durationField23 = islamicChronology20.weekyears();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str26 = dateTimeZone25.toString();
        org.joda.time.Chronology chronology27 = islamicChronology20.withZone(dateTimeZone25);
        int int29 = dateTimeZone25.getOffset(1L);
        org.joda.time.chrono.IslamicChronology islamicChronology30 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology30.dayOfYear();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology30.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology30.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology30.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType35 = islamicChronology30.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology36 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone25, leapYearPatternType35);
        org.joda.time.Chronology chronology37 = islamicChronology36.withUTC();
        org.joda.time.DurationField durationField38 = islamicChronology36.seconds();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType39 = islamicChronology36.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology40 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone9, leapYearPatternType39);
        org.joda.time.DurationField durationField41 = islamicChronology40.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField41, durationField3, and durationField4", !(durationField41.compareTo(durationField3) == 0) || (Math.signum(durationField41.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0301");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfEra();
        java.lang.String str6 = islamicChronology0.toString();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        java.lang.String str8 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.era();
        org.joda.time.Chronology chronology10 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField11 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField11", Math.signum(durationField7.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField7)));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0302");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.millis();
        org.joda.time.DurationField durationField6 = islamicChronology3.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField5, and durationField6", !(durationField7.compareTo(durationField5) == 0) || (Math.signum(durationField7.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0303");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.monthOfYear();
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField3", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0304");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        long long11 = islamicChronology3.add((long) (byte) 10, (long) (short) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField13 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology3.yearOfEra();
        org.joda.time.DurationField durationField15 = islamicChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField5, and durationField6", !(durationField15.compareTo(durationField5) == 0) || (Math.signum(durationField15.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0305");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        java.lang.String str6 = islamicChronology3.toString();
        org.joda.time.DurationField durationField7 = islamicChronology3.years();
        org.joda.time.DurationField durationField8 = islamicChronology3.halfdays();
        org.joda.time.DurationField durationField9 = islamicChronology3.millis();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology3.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = islamicChronology3.getZone();
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology12.dayOfYear();
        org.joda.time.DurationField durationField15 = islamicChronology12.minutes();
        org.joda.time.DurationField durationField16 = islamicChronology12.halfdays();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology12.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology12.yearOfEra();
        org.joda.time.DurationField durationField20 = islamicChronology12.seconds();
        org.joda.time.DurationField durationField21 = islamicChronology12.halfdays();
        org.joda.time.chrono.IslamicChronology islamicChronology22 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField23 = islamicChronology22.weeks();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology22.yearOfEra();
        org.joda.time.DurationField durationField25 = islamicChronology22.weekyears();
        org.joda.time.Chronology chronology26 = islamicChronology22.withUTC();
        org.joda.time.DateTimeZone dateTimeZone27 = islamicChronology22.getZone();
        org.joda.time.Chronology chronology28 = islamicChronology12.withZone(dateTimeZone27);
        java.lang.String str29 = dateTimeZone27.getID();
        long long31 = dateTimeZone27.nextTransition((-80689900L));
        boolean boolean32 = islamicChronology3.equals((java.lang.Object) long31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField25", (durationField7.compareTo(durationField25) == 0) == durationField7.equals(durationField25));
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0306");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        long long9 = dateTimeZone6.getMillisKeepLocal(dateTimeZone7, (long) (byte) -1);
        org.joda.time.Chronology chronology10 = islamicChronology3.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology3.yearOfCentury();
        org.joda.time.DurationField durationField12 = islamicChronology3.years();
        long long16 = islamicChronology3.add((-11L), 14460100L, 4);
        org.joda.time.DurationField durationField17 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField18 = islamicChronology3.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField18", (durationField12.compareTo(durationField18) == 0) == durationField12.equals(durationField18));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0307");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField9 = islamicChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField8", (durationField5.compareTo(durationField8) == 0) == durationField5.equals(durationField8));
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0308");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        long long6 = islamicChronology0.add((long) 10, (long) 100, (int) (short) 0);
        org.joda.time.DurationField durationField7 = islamicChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField7, and durationField2", !(durationField2.compareTo(durationField7) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField7.compareTo(durationField2))));
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0309");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField10 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField11 = islamicChronology0.hours();
        long long15 = islamicChronology0.add(14460100L, 132L, (-1));
        long long19 = islamicChronology0.add(187200000L, 1664L, (int) (byte) -1);
        org.joda.time.DurationField durationField20 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField21 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology0.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField21", (durationField8.compareTo(durationField21) == 0) == durationField8.equals(durationField21));
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0310");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        long long6 = dateTimeZone1.convertLocalToUTC(1819L, true);
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField8 = islamicChronology7.hours();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology7.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology7.dayOfMonth();
        boolean boolean11 = dateTimeZone1.equals((java.lang.Object) islamicChronology7);
        java.lang.String str12 = islamicChronology7.toString();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology7.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology7.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology7.yearOfCentury();
        org.joda.time.DurationField durationField16 = islamicChronology7.weeks();
        org.joda.time.DurationField durationField17 = islamicChronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField8, and durationField16", !(durationField17.compareTo(durationField8) == 0) || (Math.signum(durationField17.compareTo(durationField16)) == Math.signum(durationField8.compareTo(durationField16))));
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0311");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField8 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField8", (durationField5.compareTo(durationField8) == 0) == durationField5.equals(durationField8));
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0312");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        long long11 = islamicChronology0.getDateTimeMillis((-440688900L), 0, (int) (byte) 0, (int) (short) 1, 1);
        org.joda.time.DurationField durationField12 = islamicChronology0.years();
        org.joda.time.DurationField durationField13 = islamicChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField12", (durationField3.compareTo(durationField12) == 0) == durationField3.equals(durationField12));
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0313");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = islamicChronology0.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        long long7 = dateTimeZone4.previousTransition(14460100L);
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField9 = islamicChronology8.weeks();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology8.yearOfEra();
        org.joda.time.DurationField durationField11 = islamicChronology8.millis();
        boolean boolean13 = islamicChronology8.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology8.hourOfDay();
        org.joda.time.DurationField durationField15 = islamicChronology8.halfdays();
        long long19 = islamicChronology8.add(0L, 1010L, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str22 = dateTimeZone21.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology23.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology23.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        long long29 = dateTimeZone26.getMillisKeepLocal(dateTimeZone27, (long) (byte) -1);
        org.joda.time.Chronology chronology30 = islamicChronology23.withZone(dateTimeZone27);
        org.joda.time.DurationField durationField31 = islamicChronology23.minutes();
        long long35 = islamicChronology23.add((-35999965L), 1010L, 36000000);
        org.joda.time.DurationField durationField36 = islamicChronology23.millis();
        org.joda.time.DateTimeZone dateTimeZone37 = islamicChronology23.getZone();
        org.joda.time.Chronology chronology38 = islamicChronology8.withZone(dateTimeZone37);
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone37.getName(1010L, locale40);
        long long43 = dateTimeZone4.getMillisKeepLocal(dateTimeZone37, 160019155210320L);
        org.joda.time.ReadableInstant readableInstant44 = null;
        int int45 = dateTimeZone37.getOffset(readableInstant44);
        boolean boolean47 = dateTimeZone37.isStandardOffset((-175993307777039965L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField31", (durationField3.compareTo(durationField31) == 0) == durationField3.equals(durationField31));
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0314");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int7 = dateTimeZone5.getStandardOffset((long) (short) 100);
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField12 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField15 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField10, and durationField12", !(durationField15.compareTo(durationField10) == 0) || (Math.signum(durationField15.compareTo(durationField12)) == Math.signum(durationField10.compareTo(durationField12))));
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0315");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.millisOfSecond();
        org.joda.time.DurationField durationField7 = islamicChronology3.years();
        org.joda.time.DurationField durationField8 = islamicChronology3.years();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.dayOfWeek();
        org.joda.time.DurationField durationField10 = islamicChronology3.days();
        org.joda.time.DurationField durationField11 = islamicChronology3.minutes();
        org.joda.time.DurationField durationField12 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField13 = islamicChronology3.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField12", (durationField7.compareTo(durationField12) == 0) == durationField7.equals(durationField12));
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0316");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str6 = dateTimeZone5.toString();
        org.joda.time.Chronology chronology7 = islamicChronology0.withZone(dateTimeZone5);
        int int9 = dateTimeZone5.getOffset(1L);
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology10.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology10.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology10.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology10.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType15 = islamicChronology10.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5, leapYearPatternType15);
        org.joda.time.Chronology chronology17 = islamicChronology16.withUTC();
        org.joda.time.DurationField durationField18 = islamicChronology16.seconds();
        org.joda.time.DurationField durationField19 = islamicChronology16.weeks();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology16.dayOfWeek();
        org.joda.time.DurationField durationField21 = islamicChronology16.days();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology16.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField19", (durationField1.compareTo(durationField19) == 0) == durationField1.equals(durationField19));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0317");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology0.weeks();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, 3L, (int) (byte) 100);
        org.joda.time.DurationField durationField9 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = islamicChronology0.getZone();
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone12.getName((-41571691200001L), locale14);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField17 = islamicChronology16.weeks();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology16.hourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology16.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology16.minuteOfDay();
        org.joda.time.DurationField durationField22 = islamicChronology16.minutes();
        long long28 = islamicChronology16.getDateTimeMillis((-35999999L), (int) (short) 0, (int) ' ', (int) (short) 1, (int) ' ');
        java.lang.String str29 = islamicChronology16.toString();
        org.joda.time.DurationField durationField30 = islamicChronology16.years();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology16.year();
        boolean boolean32 = dateTimeZone12.equals((java.lang.Object) dateTimeField31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField30", (durationField3.compareTo(durationField30) == 0) == durationField3.equals(durationField30));
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0318");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.months();
        org.joda.time.DurationField durationField5 = islamicChronology0.years();
        java.lang.String str6 = islamicChronology0.toString();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField3", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0319");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        int int5 = dateTimeZone1.getStandardOffset(10L);
        int int7 = dateTimeZone1.getOffset((-35999900L));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType8 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1, leapYearPatternType8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone1.getOffset(readableInstant10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str14 = dateTimeZone13.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology15.clockhourOfDay();
        org.joda.time.DurationField durationField17 = islamicChronology15.hours();
        org.joda.time.DurationField durationField18 = islamicChronology15.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology15.dayOfYear();
        org.joda.time.DurationField durationField20 = islamicChronology15.minutes();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology15.millisOfSecond();
        org.joda.time.DurationField durationField22 = islamicChronology15.halfdays();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType23 = islamicChronology15.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology24 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1, leapYearPatternType23);
        org.joda.time.DurationField durationField25 = islamicChronology24.years();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology24.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField25", (durationField18.compareTo(durationField25) == 0) == durationField18.equals(durationField25));
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0320");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField8 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField10 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField13 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField1, and durationField3", !(durationField13.compareTo(durationField1) == 0) || (Math.signum(durationField13.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0321");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField8 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField8", (durationField3.compareTo(durationField8) == 0) == durationField3.equals(durationField8));
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0322");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        java.lang.String str9 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField11 = islamicChronology0.halfdays();
        org.joda.time.DurationField durationField12 = islamicChronology0.years();
        org.joda.time.Chronology chronology13 = islamicChronology0.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField12", (durationField8.compareTo(durationField12) == 0) == durationField8.equals(durationField12));
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0323");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField10 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField11 = islamicChronology0.years();
        org.joda.time.DurationField durationField12 = islamicChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField11", (durationField8.compareTo(durationField11) == 0) == durationField8.equals(durationField11));
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0324");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = islamicChronology1.eras();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str6 = dateTimeZone5.toString();
        boolean boolean7 = dateTimeZone5.isFixed();
        java.lang.String str8 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology9 = islamicChronology1.withZone(dateTimeZone5);
        org.joda.time.Chronology chronology10 = islamicChronology0.withZone(dateTimeZone5);
        long long12 = dateTimeZone5.previousTransition(35L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str15 = dateTimeZone14.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology16.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology16.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology16.yearOfEra();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType21 = islamicChronology16.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology22 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5, leapYearPatternType21);
        org.joda.time.DurationField durationField23 = islamicChronology22.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField23, and durationField3", !(durationField3.compareTo(durationField23) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField23.compareTo(durationField3))));
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0325");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        long long10 = islamicChronology0.getDateTimeMillis((int) ' ', 1, (int) (byte) 10, 4, (int) (short) 0, (int) (short) 0, 1);
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField12 = islamicChronology0.eras();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = islamicChronology0.add(readablePeriod13, 0L, 0);
        org.joda.time.DateTimeZone dateTimeZone17 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology0.year();
        org.joda.time.DurationField durationField19 = islamicChronology0.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField19, and durationField12", !(durationField12.compareTo(durationField19) == 0) || (Math.signum(durationField12.compareTo(durationField12)) == Math.signum(durationField19.compareTo(durationField12))));
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0326");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology8.year();
        long long19 = islamicChronology8.getDateTimeMillis((long) (short) 0, 4, (int) (byte) 1, 0, 100);
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology8.era();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType21 = islamicChronology8.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology22 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7, leapYearPatternType21);
        long long26 = dateTimeZone7.convertLocalToUTC((long) (byte) 100, false, (-41571691200000L));
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str29 = dateTimeZone28.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology30 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone28);
        long long33 = dateTimeZone28.convertLocalToUTC(1819L, true);
        org.joda.time.chrono.IslamicChronology islamicChronology34 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField35 = islamicChronology34.hours();
        org.joda.time.DateTimeField dateTimeField36 = islamicChronology34.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField37 = islamicChronology34.dayOfMonth();
        boolean boolean38 = dateTimeZone28.equals((java.lang.Object) islamicChronology34);
        int int40 = dateTimeZone28.getOffsetFromLocal((-40936320000000L));
        long long42 = dateTimeZone28.convertUTCToLocal(100L);
        long long44 = dateTimeZone7.getMillisKeepLocal(dateTimeZone28, 11L);
        org.joda.time.Chronology chronology45 = islamicChronology0.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField46 = islamicChronology0.minutes();
        org.joda.time.chrono.IslamicChronology islamicChronology47 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField48 = islamicChronology47.weeks();
        org.joda.time.DateTimeField dateTimeField49 = islamicChronology47.yearOfEra();
        org.joda.time.DurationField durationField50 = islamicChronology47.weekyears();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str53 = dateTimeZone52.toString();
        org.joda.time.Chronology chronology54 = islamicChronology47.withZone(dateTimeZone52);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean58 = dateTimeZone56.equals((java.lang.Object) (-1.0d));
        java.lang.String str59 = dateTimeZone56.getID();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str62 = dateTimeZone61.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology63 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone61);
        int int65 = dateTimeZone61.getStandardOffset(10L);
        int int67 = dateTimeZone61.getOffset((-35999900L));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType68 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology69 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone61, leapYearPatternType68);
        org.joda.time.chrono.IslamicChronology islamicChronology70 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone56, leapYearPatternType68);
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        long long76 = dateTimeZone73.convertLocalToUTC((long) (short) 100, true);
        java.util.Locale locale78 = null;
        java.lang.String str79 = dateTimeZone73.getName(14460100L, locale78);
        org.joda.time.Chronology chronology80 = islamicChronology70.withZone(dateTimeZone73);
        long long82 = dateTimeZone52.getMillisKeepLocal(dateTimeZone73, 35L);
        org.joda.time.chrono.IslamicChronology islamicChronology83 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone73);
        org.joda.time.DurationField durationField84 = islamicChronology83.halfdays();
        boolean boolean85 = islamicChronology0.equals((java.lang.Object) durationField84);
        org.joda.time.DurationField durationField86 = islamicChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField84", (durationField4.compareTo(durationField84) == 0) == durationField4.equals(durationField84));
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0327");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType5 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.year();
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.joda.time.DurationField durationField9 = islamicChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField9, and durationField8", !(durationField8.compareTo(durationField9) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField9.compareTo(durationField8))));
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0328");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.hourOfDay();
        org.joda.time.DurationField durationField8 = islamicChronology3.months();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = islamicChronology3.eras();
        org.joda.time.DurationField durationField11 = islamicChronology3.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField10", Math.signum(durationField11.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField11)));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0329");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfEra();
        java.lang.String str6 = islamicChronology0.toString();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        java.lang.String str8 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.era();
        org.joda.time.Chronology chronology10 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField11 = islamicChronology0.eras();
        org.joda.time.DurationField durationField12 = islamicChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField11", Math.signum(durationField7.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField7)));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0330");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.year();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
        org.joda.time.DurationField durationField8 = islamicChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField8, and durationField7", !(durationField7.compareTo(durationField8) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField8.compareTo(durationField7))));
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0331");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField6 = islamicChronology5.weeks();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology5.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology5.year();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = islamicChronology5.add(readablePeriod10, (long) 10, (int) (short) 100);
        org.joda.time.DurationField durationField14 = islamicChronology5.weeks();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology5.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone18.isLocalDateTimeGap(localDateTime19);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        long long24 = dateTimeZone18.getMillisKeepLocal(dateTimeZone22, (long) 0);
        org.joda.time.Chronology chronology25 = islamicChronology5.withZone(dateTimeZone22);
        java.lang.String str26 = dateTimeZone22.toString();
        org.joda.time.Chronology chronology27 = islamicChronology0.withZone(dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField6", Math.signum(durationField2.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField2)));
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0332");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weeks();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology3.centuryOfEra();
        org.joda.time.DurationField durationField9 = islamicChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField5, and durationField6", !(durationField9.compareTo(durationField5) == 0) || (Math.signum(durationField9.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0333");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DurationField durationField5 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField5", Math.signum(durationField1.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField1)));
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0334");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.joda.time.Chronology chronology7 = islamicChronology0.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField6", (durationField3.compareTo(durationField6) == 0) == durationField3.equals(durationField6));
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0335");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.dayOfYear();
        org.joda.time.DurationField durationField8 = islamicChronology3.minutes();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.millisOfSecond();
        org.joda.time.DurationField durationField10 = islamicChronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology3.yearOfEra();
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology12.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str16 = dateTimeZone15.toString();
        boolean boolean17 = dateTimeZone15.isFixed();
        org.joda.time.Chronology chronology18 = islamicChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology12.secondOfDay();
        boolean boolean21 = islamicChronology3.equals((java.lang.Object) islamicChronology12);
        org.joda.time.DurationField durationField22 = islamicChronology3.years();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology3.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField22", (durationField6.compareTo(durationField22) == 0) == durationField6.equals(durationField22));
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0336");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.Chronology chronology5 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.joda.time.DurationField durationField7 = islamicChronology0.years();
        org.joda.time.DurationField durationField8 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.monthOfYear();
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField6", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField6)) == Math.signum(durationField1.compareTo(durationField6))));
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0337");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.dayOfYear();
        org.joda.time.DurationField durationField8 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField9 = islamicChronology3.years();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology3.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField9", (durationField6.compareTo(durationField9) == 0) == durationField6.equals(durationField9));
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0338");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField6", (durationField3.compareTo(durationField6) == 0) == durationField3.equals(durationField6));
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0339");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.monthOfYear();
        java.lang.String str13 = islamicChronology0.toString();
        org.joda.time.DurationField durationField14 = islamicChronology0.years();
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField16 = islamicChronology15.weeks();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology15.yearOfEra();
        org.joda.time.DurationField durationField18 = islamicChronology15.millis();
        boolean boolean20 = islamicChronology15.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology15.weekyear();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology15.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        java.util.TimeZone timeZone25 = dateTimeZone24.toTimeZone();
        org.joda.time.Chronology chronology26 = islamicChronology15.withZone(dateTimeZone24);
        long long29 = dateTimeZone24.adjustOffset((long) 0, true);
        boolean boolean30 = dateTimeZone24.isFixed();
        int int32 = dateTimeZone24.getStandardOffset(57840292L);
        org.joda.time.Chronology chronology33 = islamicChronology0.withZone(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField14", (durationField3.compareTo(durationField14) == 0) == durationField3.equals(durationField14));
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0340");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str6 = dateTimeZone5.toString();
        org.joda.time.Chronology chronology7 = islamicChronology0.withZone(dateTimeZone5);
        int int9 = dateTimeZone5.getOffset(1L);
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology10.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology10.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology10.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology10.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType15 = islamicChronology10.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5, leapYearPatternType15);
        org.joda.time.Chronology chronology17 = islamicChronology16.withUTC();
        org.joda.time.DurationField durationField18 = islamicChronology16.seconds();
        org.joda.time.DurationField durationField19 = islamicChronology16.weeks();
        org.joda.time.DurationField durationField20 = islamicChronology16.millis();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology16.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField19", (durationField1.compareTo(durationField19) == 0) == durationField1.equals(durationField19));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0341");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.millisOfSecond();
        org.joda.time.DurationField durationField7 = islamicChronology3.days();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology3.eras();
        org.joda.time.DurationField durationField11 = islamicChronology3.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField10", Math.signum(durationField11.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField11)));
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0342");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField6 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField1, and durationField3", !(durationField6.compareTo(durationField1) == 0) || (Math.signum(durationField6.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0343");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.dayOfYear();
        org.joda.time.DurationField durationField8 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField9 = islamicChronology3.years();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology3.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField9", (durationField6.compareTo(durationField9) == 0) == durationField6.equals(durationField9));
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0344");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType5 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology0.months();
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str13 = dateTimeZone12.toString();
        boolean boolean15 = dateTimeZone12.isStandardOffset((long) (byte) 10);
        java.util.TimeZone timeZone16 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        long long20 = dateTimeZone17.getMillisKeepLocal(dateTimeZone18, (long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone18.isLocalDateTimeGap(localDateTime21);
        boolean boolean23 = dateTimeZone12.equals((java.lang.Object) dateTimeZone18);
        long long25 = dateTimeZone18.nextTransition((-42406761599990L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        org.joda.time.Chronology chronology27 = islamicChronology0.withZone(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField10", Math.signum(durationField9.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField9)));
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0345");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField3", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0346");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        java.lang.String str6 = islamicChronology3.toString();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        int int8 = islamicChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = islamicChronology3.add(readablePeriod9, (long) 0, (int) '4');
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology3.yearOfEra();
        org.joda.time.DurationField durationField14 = islamicChronology3.minutes();
        org.joda.time.DurationField durationField15 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology3.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology3.millisOfDay();
        org.joda.time.DurationField durationField18 = islamicChronology3.years();
        org.joda.time.DateTimeZone dateTimeZone19 = islamicChronology3.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField18", (durationField15.compareTo(durationField18) == 0) == durationField15.equals(durationField18));
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0347");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField7 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.weekyear();
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField3", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0348");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField5 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField1, and durationField3", !(durationField5.compareTo(durationField1) == 0) || (Math.signum(durationField5.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0349");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField8 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField8", (durationField5.compareTo(durationField8) == 0) == durationField5.equals(durationField8));
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0350");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.months();
        org.joda.time.DurationField durationField8 = islamicChronology0.halfdays();
        org.joda.time.DurationField durationField9 = islamicChronology0.days();
        org.joda.time.DurationField durationField10 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField11 = islamicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone12 = islamicChronology0.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField11", (durationField10.compareTo(durationField11) == 0) == durationField10.equals(durationField11));
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0351");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = islamicChronology0.eras();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField6", Math.signum(durationField2.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField2)));
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0352");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        java.lang.String str3 = islamicChronology0.toString();
        int int4 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        java.lang.String str6 = islamicChronology0.toString();
        int int7 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField8, and durationField2", !(durationField2.compareTo(durationField8) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField8.compareTo(durationField2))));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0353");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField9 = islamicChronology0.years();
        org.joda.time.DurationField durationField10 = islamicChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0354");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        java.lang.String str9 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField11 = islamicChronology0.halfdays();
        org.joda.time.DurationField durationField12 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField12", (durationField8.compareTo(durationField12) == 0) == durationField8.equals(durationField12));
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0355");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        long long11 = islamicChronology3.add((long) (byte) 10, (long) (short) 10, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        org.joda.time.Chronology chronology14 = islamicChronology3.withZone(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str17 = dateTimeZone16.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology18 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology18.clockhourOfDay();
        org.joda.time.DurationField durationField20 = islamicChronology18.hours();
        org.joda.time.DurationField durationField21 = islamicChronology18.weekyears();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology18.dayOfYear();
        org.joda.time.DurationField durationField23 = islamicChronology18.minutes();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology18.millisOfSecond();
        org.joda.time.DurationField durationField25 = islamicChronology18.halfdays();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType26 = islamicChronology18.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology27 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13, leapYearPatternType26);
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology27.centuryOfEra();
        org.joda.time.DurationField durationField29 = islamicChronology27.centuries();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology27.yearOfCentury();
        org.joda.time.DurationField durationField31 = islamicChronology27.years();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology27.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField31", (durationField6.compareTo(durationField31) == 0) == durationField6.equals(durationField31));
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0356");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str5 = dateTimeZone4.toString();
        boolean boolean6 = dateTimeZone4.isFixed();
        java.lang.String str7 = dateTimeZone4.getID();
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology0.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField10, and durationField2", !(durationField2.compareTo(durationField10) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField10.compareTo(durationField2))));
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0357");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField3 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str7 = dateTimeZone6.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        int int10 = dateTimeZone6.getStandardOffset(10L);
        int int12 = dateTimeZone6.getOffset((-35999900L));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType13 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6, leapYearPatternType13);
        org.joda.time.Chronology chronology15 = islamicChronology0.withZone(dateTimeZone6);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = islamicChronology0.add(readablePeriod16, (-440688868L), (int) (short) 10);
        org.joda.time.DurationField durationField20 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str24 = dateTimeZone23.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology25 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology25.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology25.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        long long31 = dateTimeZone28.getMillisKeepLocal(dateTimeZone29, (long) (byte) -1);
        org.joda.time.Chronology chronology32 = islamicChronology25.withZone(dateTimeZone29);
        long long34 = dateTimeZone29.nextTransition(3840000L);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        long long38 = dateTimeZone35.getMillisKeepLocal(dateTimeZone36, (long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant39 = null;
        int int40 = dateTimeZone36.getOffset(readableInstant39);
        long long42 = dateTimeZone36.convertUTCToLocal(14460100L);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str45 = dateTimeZone44.toString();
        boolean boolean47 = dateTimeZone44.isStandardOffset((long) (byte) 10);
        java.util.TimeZone timeZone48 = dateTimeZone44.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        long long53 = dateTimeZone50.adjustOffset((long) '4', true);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        long long59 = dateTimeZone56.convertLocalToUTC((long) (byte) 1, true);
        java.lang.String str60 = dateTimeZone56.getID();
        boolean boolean62 = dateTimeZone56.isStandardOffset(187200035L);
        int int64 = dateTimeZone56.getOffset((long) (short) 1);
        boolean boolean65 = dateTimeZone50.equals((java.lang.Object) (short) 1);
        long long67 = dateTimeZone36.getMillisKeepLocal(dateTimeZone50, 1664L);
        int int69 = dateTimeZone50.getOffsetFromLocal(1664L);
        long long71 = dateTimeZone29.getMillisKeepLocal(dateTimeZone50, (-41572447199965L));
        org.joda.time.Chronology chronology72 = islamicChronology0.withZone(dateTimeZone50);
        org.joda.time.DurationField durationField73 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField73, durationField1, and durationField3", !(durationField73.compareTo(durationField1) == 0) || (Math.signum(durationField73.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0358");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.years();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology9 = islamicChronology0.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField8", (durationField7.compareTo(durationField8) == 0) == durationField7.equals(durationField8));
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0359");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone10.isLocalDateTimeGap(localDateTime11);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean16 = dateTimeZone14.equals((java.lang.Object) (-1.0d));
        int int18 = dateTimeZone14.getOffset((long) '4');
        java.lang.String str20 = dateTimeZone14.getName(14460100L);
        long long23 = dateTimeZone14.adjustOffset(132L, true);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 4);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType27 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology28 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone26, leapYearPatternType27);
        org.joda.time.chrono.IslamicChronology islamicChronology29 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14, leapYearPatternType27);
        long long31 = dateTimeZone10.getMillisKeepLocal(dateTimeZone14, 1664L);
        org.joda.time.chrono.IslamicChronology islamicChronology32 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.chrono.IslamicChronology islamicChronology33 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology33.weekyearOfCentury();
        org.joda.time.DurationField durationField35 = islamicChronology33.eras();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str38 = dateTimeZone37.toString();
        boolean boolean39 = dateTimeZone37.isFixed();
        java.lang.String str40 = dateTimeZone37.getID();
        org.joda.time.Chronology chronology41 = islamicChronology33.withZone(dateTimeZone37);
        org.joda.time.Chronology chronology42 = islamicChronology32.withZone(dateTimeZone37);
        long long44 = dateTimeZone37.previousTransition(35L);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str47 = dateTimeZone46.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology48 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone46);
        org.joda.time.DateTimeField dateTimeField49 = islamicChronology48.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField50 = islamicChronology48.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField51 = islamicChronology48.dayOfYear();
        org.joda.time.DateTimeField dateTimeField52 = islamicChronology48.yearOfEra();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType53 = islamicChronology48.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology54 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone37, leapYearPatternType53);
        org.joda.time.chrono.IslamicChronology islamicChronology55 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10, leapYearPatternType53);
        org.joda.time.chrono.IslamicChronology islamicChronology56 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone8, leapYearPatternType53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField35", Math.signum(durationField1.compareTo(durationField35)) == -Math.signum(durationField35.compareTo(durationField1)));
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0360");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, (long) 10, (int) (short) 100);
        org.joda.time.DurationField durationField9 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0361");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.dayOfYear();
        org.joda.time.DurationField durationField8 = islamicChronology3.centuries();
        org.joda.time.DurationField durationField9 = islamicChronology3.years();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology3.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField9", (durationField6.compareTo(durationField9) == 0) == durationField6.equals(durationField9));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0362");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.era();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = islamicChronology0.add(readablePeriod8, (-415761183033969L), 36000000);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.weekyear();
        org.joda.time.DurationField durationField13 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField1, and durationField3", !(durationField13.compareTo(durationField1) == 0) || (Math.signum(durationField13.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0363");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField3 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.hourOfDay();
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField7 = islamicChronology6.weeks();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology6.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology6.hourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology6.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology6.millisOfDay();
        org.joda.time.DurationField durationField12 = islamicChronology6.seconds();
        org.joda.time.DurationField durationField13 = islamicChronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology6.weekyearOfCentury();
        org.joda.time.DurationField durationField15 = islamicChronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology6.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = islamicChronology6.getZone();
        org.joda.time.Chronology chronology18 = islamicChronology0.withZone(dateTimeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField7", Math.signum(durationField3.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField3)));
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0364");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.dayOfYear();
        org.joda.time.DurationField durationField8 = islamicChronology3.centuries();
        org.joda.time.DurationField durationField9 = islamicChronology3.years();
        org.joda.time.DurationField durationField10 = islamicChronology3.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField9", (durationField10.compareTo(durationField9) == 0) == durationField10.equals(durationField9));
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0365");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField8, and durationField2", !(durationField2.compareTo(durationField8) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField8.compareTo(durationField2))));
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0366");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.dayOfYear();
        org.joda.time.DurationField durationField8 = islamicChronology3.minutes();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.millisOfSecond();
        org.joda.time.DurationField durationField10 = islamicChronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology3.yearOfEra();
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology12.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str16 = dateTimeZone15.toString();
        boolean boolean17 = dateTimeZone15.isFixed();
        org.joda.time.Chronology chronology18 = islamicChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology12.secondOfDay();
        boolean boolean21 = islamicChronology3.equals((java.lang.Object) islamicChronology12);
        org.joda.time.DurationField durationField22 = islamicChronology3.years();
        java.lang.String str23 = islamicChronology3.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField22", (durationField6.compareTo(durationField22) == 0) == durationField6.equals(durationField22));
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0367");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.monthOfYear();
        org.joda.time.DurationField durationField7 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField8 = islamicChronology0.halfdays();
        org.joda.time.DurationField durationField9 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.dayOfYear();
        int int11 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField12 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField1, and durationField7", !(durationField12.compareTo(durationField1) == 0) || (Math.signum(durationField12.compareTo(durationField7)) == Math.signum(durationField1.compareTo(durationField7))));
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0368");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField3 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str7 = dateTimeZone6.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        int int10 = dateTimeZone6.getStandardOffset(10L);
        int int12 = dateTimeZone6.getOffset((-35999900L));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType13 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6, leapYearPatternType13);
        org.joda.time.Chronology chronology15 = islamicChronology0.withZone(dateTimeZone6);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = islamicChronology0.add(readablePeriod16, (-440688868L), (int) (short) 10);
        org.joda.time.DurationField durationField20 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField22 = islamicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone23 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.lang.String str28 = dateTimeZone26.getName((long) (byte) -1);
        java.lang.String str29 = dateTimeZone26.toString();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str32 = dateTimeZone31.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology33 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology33.secondOfMinute();
        org.joda.time.DurationField durationField35 = islamicChronology33.halfdays();
        org.joda.time.Chronology chronology36 = islamicChronology33.withUTC();
        boolean boolean37 = dateTimeZone26.equals((java.lang.Object) islamicChronology33);
        int int38 = islamicChronology33.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone39 = islamicChronology33.getZone();
        long long43 = dateTimeZone39.convertLocalToUTC((long) '4', false, (-90L));
        java.lang.String str44 = dateTimeZone39.toString();
        java.lang.String str46 = dateTimeZone39.getName((-518388999L));
        org.joda.time.Chronology chronology47 = islamicChronology0.withZone(dateTimeZone39);
        org.joda.time.DateTimeField dateTimeField48 = islamicChronology0.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField35", (durationField3.compareTo(durationField35) == 0) == durationField3.equals(durationField35));
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0369");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int7 = dateTimeZone5.getStandardOffset((long) (short) 100);
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField12 = islamicChronology0.years();
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology13.weekyear();
        org.joda.time.DateTimeZone dateTimeZone15 = islamicChronology13.getZone();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int20 = dateTimeZone18.getStandardOffset((long) (short) 100);
        org.joda.time.Chronology chronology21 = islamicChronology13.withZone(dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone18.isLocalDateTimeGap(localDateTime22);
        org.joda.time.Chronology chronology24 = islamicChronology0.withZone(dateTimeZone18);
        org.joda.time.DurationField durationField25 = chronology24.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField10, and durationField12", !(durationField25.compareTo(durationField10) == 0) || (Math.signum(durationField25.compareTo(durationField12)) == Math.signum(durationField10.compareTo(durationField12))));
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0370");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology3.weekyearOfCentury();
        org.joda.time.DurationField durationField12 = islamicChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField5, and durationField6", !(durationField12.compareTo(durationField5) == 0) || (Math.signum(durationField12.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0371");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField3 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str7 = dateTimeZone6.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        int int10 = dateTimeZone6.getStandardOffset(10L);
        int int12 = dateTimeZone6.getOffset((-35999900L));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType13 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6, leapYearPatternType13);
        org.joda.time.Chronology chronology15 = islamicChronology0.withZone(dateTimeZone6);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = islamicChronology0.add(readablePeriod16, (-440688868L), (int) (short) 10);
        org.joda.time.DurationField durationField20 = islamicChronology0.millis();
        org.joda.time.DurationField durationField21 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.chrono.IslamicChronology islamicChronology24 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.chrono.IslamicChronology islamicChronology25 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology25.weekyearOfCentury();
        org.joda.time.DurationField durationField27 = islamicChronology25.eras();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str30 = dateTimeZone29.toString();
        boolean boolean31 = dateTimeZone29.isFixed();
        java.lang.String str32 = dateTimeZone29.getID();
        org.joda.time.Chronology chronology33 = islamicChronology25.withZone(dateTimeZone29);
        org.joda.time.Chronology chronology34 = islamicChronology24.withZone(dateTimeZone29);
        long long36 = dateTimeZone29.previousTransition(35L);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str39 = dateTimeZone38.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology40 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField41 = islamicChronology40.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField42 = islamicChronology40.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField43 = islamicChronology40.dayOfYear();
        org.joda.time.DateTimeField dateTimeField44 = islamicChronology40.yearOfEra();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType45 = islamicChronology40.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology46 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone29, leapYearPatternType45);
        org.joda.time.Chronology chronology47 = islamicChronology0.withZone(dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField27", Math.signum(durationField1.compareTo(durationField27)) == -Math.signum(durationField27.compareTo(durationField1)));
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0372");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfEra();
        java.lang.String str6 = islamicChronology0.toString();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        java.lang.String str8 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.era();
        org.joda.time.Chronology chronology10 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField11 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField11", Math.signum(durationField7.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField7)));
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0373");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField7 = islamicChronology0.seconds();
        java.lang.String str8 = islamicChronology0.toString();
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField7", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField7)) == Math.signum(durationField1.compareTo(durationField7))));
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0374");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField10 = islamicChronology0.years();
        org.joda.time.DurationField durationField11 = islamicChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField10", (durationField11.compareTo(durationField10) == 0) == durationField11.equals(durationField10));
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0375");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.months();
        org.joda.time.DurationField durationField8 = islamicChronology0.halfdays();
        org.joda.time.DurationField durationField9 = islamicChronology0.days();
        org.joda.time.DurationField durationField10 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField11 = islamicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) (short) 10);
        org.joda.time.Chronology chronology17 = islamicChronology0.withZone(dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField11", (durationField10.compareTo(durationField11) == 0) == durationField10.equals(durationField11));
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0376");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone4 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField5 = islamicChronology0.eras();
        org.joda.time.DurationField durationField6 = islamicChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField5", Math.signum(durationField1.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField1)));
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0377");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField3", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0378");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField6", (durationField3.compareTo(durationField6) == 0) == durationField3.equals(durationField6));
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0379");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType5 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.hourOfDay();
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField14 = islamicChronology13.weeks();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology13.yearOfEra();
        org.joda.time.DurationField durationField16 = islamicChronology13.millis();
        boolean boolean18 = islamicChronology13.equals((java.lang.Object) 0.0f);
        org.joda.time.DurationField durationField19 = islamicChronology13.months();
        java.lang.String str20 = islamicChronology13.toString();
        org.joda.time.DurationField durationField21 = islamicChronology13.minutes();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology13.yearOfCentury();
        org.joda.time.DurationField durationField23 = islamicChronology13.seconds();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology13.weekyear();
        boolean boolean25 = islamicChronology0.equals((java.lang.Object) dateTimeField24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField14", Math.signum(durationField9.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField9)));
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0380");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.years();
        java.lang.Class<?> wildcardClass6 = islamicChronology0.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField5", (durationField2.compareTo(durationField5) == 0) == durationField2.equals(durationField5));
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0381");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.dayOfYear();
        org.joda.time.DurationField durationField8 = islamicChronology3.minutes();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.millisOfSecond();
        org.joda.time.DurationField durationField10 = islamicChronology3.halfdays();
        org.joda.time.DurationField durationField11 = islamicChronology3.centuries();
        int int12 = islamicChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField13 = islamicChronology3.seconds();
        int int14 = islamicChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField15 = islamicChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField5, and durationField6", !(durationField15.compareTo(durationField5) == 0) || (Math.signum(durationField15.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0382");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        long long10 = islamicChronology0.getDateTimeMillis((int) ' ', 1, (int) (byte) 10, 4, (int) (short) 0, (int) (short) 0, 1);
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField13 = islamicChronology0.millis();
        org.joda.time.DurationField durationField14 = islamicChronology0.eras();
        org.joda.time.DurationField durationField15 = islamicChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField14", Math.signum(durationField13.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField13)));
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0383");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField9 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField10 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField11 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField1, and durationField3", !(durationField11.compareTo(durationField1) == 0) || (Math.signum(durationField11.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0384");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField8 = islamicChronology0.days();
        org.joda.time.DurationField durationField9 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField10 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0385");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.yearOfCentury();
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField6 = islamicChronology5.weeks();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology5.weekyears();
        org.joda.time.Chronology chronology9 = islamicChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology5.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology5.hourOfDay();
        org.joda.time.DurationField durationField12 = islamicChronology5.hours();
        boolean boolean13 = islamicChronology0.equals((java.lang.Object) durationField12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField8", (durationField3.compareTo(durationField8) == 0) == durationField3.equals(durationField8));
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0386");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str11 = dateTimeZone10.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10);
        int int14 = dateTimeZone10.getStandardOffset(10L);
        int int16 = dateTimeZone10.getOffset((-35999900L));
        long long19 = dateTimeZone10.adjustOffset((-41572483199965L), false);
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone10.isLocalDateTimeGap(localDateTime20);
        org.joda.time.Chronology chronology22 = islamicChronology0.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField23 = chronology22.years();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField23", (durationField3.compareTo(durationField23) == 0) == durationField3.equals(durationField23));
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0387");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField1, and durationField3", !(durationField6.compareTo(durationField1) == 0) || (Math.signum(durationField6.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0388");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        java.lang.String str3 = islamicChronology0.toString();
        org.joda.time.DurationField durationField4 = islamicChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField4, and durationField2", !(durationField2.compareTo(durationField4) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField4.compareTo(durationField2))));
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0389");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        long long9 = islamicChronology0.add(187200035L, (long) ' ', (int) 'a');
        org.joda.time.DurationField durationField10 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str15 = dateTimeZone14.toString();
        boolean boolean17 = dateTimeZone14.isStandardOffset((long) (byte) 10);
        java.util.TimeZone timeZone18 = dateTimeZone14.toTimeZone();
        long long20 = dateTimeZone14.convertUTCToLocal(1010L);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone14.getShortName(3600000001L, locale22);
        java.lang.String str24 = dateTimeZone14.toString();
        long long26 = dateTimeZone14.nextTransition((long) 36000000);
        org.joda.time.Chronology chronology27 = islamicChronology0.withZone(dateTimeZone14);
        org.joda.time.chrono.IslamicChronology islamicChronology28 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14);
        org.joda.time.DurationField durationField29 = islamicChronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField29, durationField3, and durationField4", !(durationField29.compareTo(durationField3) == 0) || (Math.signum(durationField29.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0390");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 4);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType3 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology4 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2, leapYearPatternType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology4.add(readablePeriod5, 1000L, (int) (byte) 0);
        org.joda.time.DurationField durationField9 = islamicChronology4.months();
        org.joda.time.DurationField durationField10 = islamicChronology4.eras();
        org.joda.time.DurationField durationField11 = islamicChronology4.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField10", Math.signum(durationField9.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField9)));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0391");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField5", (durationField3.compareTo(durationField5) == 0) == durationField3.equals(durationField5));
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0392");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean11 = dateTimeZone9.equals((java.lang.Object) (-1.0d));
        int int13 = dateTimeZone9.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone9.isLocalDateTimeGap(localDateTime14);
        org.joda.time.Chronology chronology16 = islamicChronology0.withZone(dateTimeZone9);
        long long18 = dateTimeZone9.convertUTCToLocal((long) (short) -1);
        java.util.TimeZone timeZone19 = dateTimeZone9.toTimeZone();
        org.joda.time.chrono.IslamicChronology islamicChronology20 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField21 = islamicChronology20.weeks();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology20.yearOfEra();
        org.joda.time.DurationField durationField23 = islamicChronology20.weekyears();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str26 = dateTimeZone25.toString();
        org.joda.time.Chronology chronology27 = islamicChronology20.withZone(dateTimeZone25);
        int int29 = dateTimeZone25.getOffset(1L);
        org.joda.time.chrono.IslamicChronology islamicChronology30 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology30.dayOfYear();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology30.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology30.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology30.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType35 = islamicChronology30.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology36 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone25, leapYearPatternType35);
        org.joda.time.Chronology chronology37 = islamicChronology36.withUTC();
        org.joda.time.DurationField durationField38 = islamicChronology36.seconds();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType39 = islamicChronology36.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology40 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone9, leapYearPatternType39);
        org.joda.time.DurationField durationField41 = islamicChronology40.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField41, durationField3, and durationField4", !(durationField41.compareTo(durationField3) == 0) || (Math.signum(durationField41.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0393");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.centuryOfEra();
        org.joda.time.Chronology chronology8 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = chronology8.add(readablePeriod10, 35999999L, (int) (short) 100);
        org.joda.time.DurationField durationField14 = chronology8.weekyears();
        org.joda.time.DurationField durationField15 = chronology8.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField14", (durationField3.compareTo(durationField14) == 0) == durationField3.equals(durationField14));
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0394");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str5 = dateTimeZone4.toString();
        boolean boolean6 = dateTimeZone4.isFixed();
        java.lang.String str7 = dateTimeZone4.getID();
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone4);
        java.lang.String str9 = dateTimeZone4.toString();
        int int11 = dateTimeZone4.getStandardOffset(14459968L);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone4.getOffset(readableInstant12);
        int int15 = dateTimeZone4.getOffsetFromLocal(0L);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField17 = islamicChronology16.weeks();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology16.hourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology16.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology16.minuteOfDay();
        org.joda.time.DurationField durationField22 = islamicChronology16.minutes();
        long long28 = islamicChronology16.getDateTimeMillis((-35999999L), (int) (short) 0, (int) ' ', (int) (short) 1, (int) ' ');
        java.lang.String str29 = islamicChronology16.toString();
        org.joda.time.DurationField durationField30 = islamicChronology16.years();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str33 = dateTimeZone32.toString();
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone32.getShortName((long) 10, locale35);
        int int38 = dateTimeZone32.getOffsetFromLocal((long) 0);
        java.lang.String str40 = dateTimeZone32.getName((long) (-1));
        java.util.TimeZone timeZone41 = dateTimeZone32.toTimeZone();
        org.joda.time.Chronology chronology42 = islamicChronology16.withZone(dateTimeZone32);
        org.joda.time.ReadableInstant readableInstant43 = null;
        int int44 = dateTimeZone32.getOffset(readableInstant43);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        long long48 = dateTimeZone32.getMillisKeepLocal(dateTimeZone46, (long) 'a');
        long long50 = dateTimeZone4.getMillisKeepLocal(dateTimeZone46, (-173039965L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField17", Math.signum(durationField2.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField2)));
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0395");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField10 = islamicChronology0.millis();
        org.joda.time.DurationField durationField11 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField12 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField1, and durationField3", !(durationField12.compareTo(durationField1) == 0) || (Math.signum(durationField12.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0396");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.Chronology chronology5 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.joda.time.DurationField durationField7 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.monthOfYear();
        org.joda.time.DurationField durationField9 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField9", (durationField6.compareTo(durationField9) == 0) == durationField6.equals(durationField9));
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0397");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType2 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField6 = islamicChronology0.eras();
        org.joda.time.DurationField durationField7 = islamicChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField7, and durationField6", !(durationField6.compareTo(durationField7) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField7.compareTo(durationField6))));
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0398");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.millisOfSecond();
        org.joda.time.DurationField durationField7 = islamicChronology3.days();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology3.hours();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology3.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = islamicChronology3.getZone();
        org.joda.time.Chronology chronology12 = islamicChronology3.withUTC();
        org.joda.time.DurationField durationField13 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField7, and durationField9", !(durationField13.compareTo(durationField7) == 0) || (Math.signum(durationField13.compareTo(durationField9)) == Math.signum(durationField7.compareTo(durationField9))));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0399");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField6", Math.signum(durationField2.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField2)));
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0400");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType5 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.joda.time.DurationField durationField10 = islamicChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField10, and durationField9", !(durationField9.compareTo(durationField10) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField10.compareTo(durationField9))));
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0401");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField8 = islamicChronology0.halfdays();
        org.joda.time.Chronology chronology9 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField10 = chronology9.minutes();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField10", (durationField6.compareTo(durationField10) == 0) == durationField6.equals(durationField10));
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0402");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.year();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.months();
        org.joda.time.Chronology chronology9 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.era();
        org.joda.time.DurationField durationField11 = islamicChronology0.months();
        org.joda.time.DurationField durationField12 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField7, and durationField8", !(durationField12.compareTo(durationField7) == 0) || (Math.signum(durationField12.compareTo(durationField8)) == Math.signum(durationField7.compareTo(durationField8))));
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0403");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        long long6 = islamicChronology0.add((long) 10, (long) 100, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = islamicChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField8, and durationField2", !(durationField2.compareTo(durationField8) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField8.compareTo(durationField2))));
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0404");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology3.getZone();
        org.joda.time.DurationField durationField6 = islamicChronology3.years();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.millisOfSecond();
        org.joda.time.DurationField durationField8 = islamicChronology3.eras();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField8", Math.signum(durationField6.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField6)));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0405");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology0.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField4, and durationField2", !(durationField2.compareTo(durationField4) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField4.compareTo(durationField2))));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0406");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str5 = dateTimeZone4.toString();
        boolean boolean6 = dateTimeZone4.isFixed();
        java.lang.String str7 = dateTimeZone4.getID();
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone4);
        org.joda.time.DurationField durationField9 = islamicChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField9, and durationField2", !(durationField2.compareTo(durationField9) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField9.compareTo(durationField2))));
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0407");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        long long7 = islamicChronology0.add((long) (short) 1, 0L, 4);
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = islamicChronology0.add(readablePeriod9, 1L, 1);
        org.joda.time.DurationField durationField13 = islamicChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField13, and durationField8", !(durationField8.compareTo(durationField13) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField13.compareTo(durationField8))));
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0408");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        long long10 = dateTimeZone7.convertLocalToUTC((long) (byte) 1, true);
        java.lang.String str11 = dateTimeZone7.getID();
        long long13 = dateTimeZone7.nextTransition((long) 36000000);
        org.joda.time.Chronology chronology14 = islamicChronology0.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField15 = chronology14.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.era();
        org.joda.time.DurationField durationField17 = chronology14.weeks();
        org.joda.time.DurationField durationField18 = chronology14.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField17", (durationField1.compareTo(durationField17) == 0) == durationField1.equals(durationField17));
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0409");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.millisOfSecond();
        long long10 = islamicChronology0.add((long) (byte) 100, (-35999900L), (int) 'a');
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField12 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField12", Math.signum(durationField1.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField1)));
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0410");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField3", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0411");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology3.getZone();
        org.joda.time.DurationField durationField9 = islamicChronology3.hours();
        org.joda.time.DurationField durationField10 = islamicChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField5, and durationField6", !(durationField10.compareTo(durationField5) == 0) || (Math.signum(durationField10.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0412");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        java.lang.String str3 = islamicChronology0.toString();
        int int4 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        java.lang.String str6 = islamicChronology0.toString();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField7, and durationField2", !(durationField2.compareTo(durationField7) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField7.compareTo(durationField2))));
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0413");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField7 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField3", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0414");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str5 = dateTimeZone4.toString();
        boolean boolean6 = dateTimeZone4.isFixed();
        java.lang.String str7 = dateTimeZone4.getID();
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone4);
        java.lang.String str9 = dateTimeZone4.toString();
        int int11 = dateTimeZone4.getStandardOffset(14459968L);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone4.getOffset(readableInstant12);
        int int15 = dateTimeZone4.getOffsetFromLocal(0L);
        java.lang.String str16 = dateTimeZone4.toString();
        long long18 = dateTimeZone4.nextTransition((-935967990L));
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology20 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField21 = islamicChronology20.hours();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology20.halfdayOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType23 = islamicChronology20.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology24 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone19, leapYearPatternType23);
        org.joda.time.chrono.IslamicChronology islamicChronology25 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone4, leapYearPatternType23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField21", Math.signum(durationField2.compareTo(durationField21)) == -Math.signum(durationField21.compareTo(durationField2)));
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0415");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField8 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField8", (durationField3.compareTo(durationField8) == 0) == durationField3.equals(durationField8));
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0416");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField3", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0417");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        java.lang.String str7 = islamicChronology0.toString();
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField3", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0418");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        long long5 = islamicChronology0.add((long) (short) -1, (long) '4', (int) '#');
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = islamicChronology0.add(readablePeriod7, (long) 10, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Chronology chronology12 = islamicChronology0.withZone(dateTimeZone11);
        org.joda.time.DurationField durationField13 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField14 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField15 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField6, and durationField13", !(durationField15.compareTo(durationField6) == 0) || (Math.signum(durationField15.compareTo(durationField13)) == Math.signum(durationField6.compareTo(durationField13))));
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0419");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.minutes();
        long long12 = islamicChronology0.getDateTimeMillis((-35999999L), (int) (short) 0, (int) ' ', (int) (short) 1, (int) ' ');
        java.lang.String str13 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField15 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField1, and durationField6", !(durationField15.compareTo(durationField1) == 0) || (Math.signum(durationField15.compareTo(durationField6)) == Math.signum(durationField1.compareTo(durationField6))));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0420");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
        org.joda.time.DurationField durationField8 = islamicChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField7", Math.signum(durationField4.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField4)));
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0421");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        org.joda.time.Chronology chronology11 = islamicChronology0.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone13 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField14 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField1, and durationField3", !(durationField14.compareTo(durationField1) == 0) || (Math.signum(durationField14.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0422");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean7 = dateTimeZone5.equals((java.lang.Object) (-1.0d));
        int int9 = dateTimeZone5.getOffset((long) '4');
        java.lang.String str11 = dateTimeZone5.getName(14460100L);
        long long14 = dateTimeZone5.adjustOffset(132L, true);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 4);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType18 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone17, leapYearPatternType18);
        org.joda.time.chrono.IslamicChronology islamicChronology20 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5, leapYearPatternType18);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, 1664L);
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.chrono.IslamicChronology islamicChronology24 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology24.weekyearOfCentury();
        org.joda.time.DurationField durationField26 = islamicChronology24.eras();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str29 = dateTimeZone28.toString();
        boolean boolean30 = dateTimeZone28.isFixed();
        java.lang.String str31 = dateTimeZone28.getID();
        org.joda.time.Chronology chronology32 = islamicChronology24.withZone(dateTimeZone28);
        org.joda.time.Chronology chronology33 = islamicChronology23.withZone(dateTimeZone28);
        long long35 = dateTimeZone28.previousTransition(35L);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str38 = dateTimeZone37.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology39 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology39.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField41 = islamicChronology39.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField42 = islamicChronology39.dayOfYear();
        org.joda.time.DateTimeField dateTimeField43 = islamicChronology39.yearOfEra();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType44 = islamicChronology39.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology45 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone28, leapYearPatternType44);
        org.joda.time.chrono.IslamicChronology islamicChronology46 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1, leapYearPatternType44);
        org.joda.time.DateTimeField dateTimeField47 = islamicChronology46.monthOfYear();
        org.joda.time.DateTimeField dateTimeField48 = islamicChronology46.era();
        org.joda.time.DateTimeField dateTimeField49 = islamicChronology46.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField50 = islamicChronology46.dayOfMonth();
        org.joda.time.DurationField durationField51 = islamicChronology46.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField51, and durationField26", !(durationField26.compareTo(durationField51) == 0) || (Math.signum(durationField26.compareTo(durationField26)) == Math.signum(durationField51.compareTo(durationField26))));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0423");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.year();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField5 = islamicChronology0.eras();
        long long9 = islamicChronology0.add(38102816L, (-446638999L), 36000000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField5", Math.signum(durationField1.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField1)));
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0424");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = islamicChronology0.millis();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = islamicChronology0.add(readablePeriod8, (long) 115200000, (int) (short) 0);
        org.joda.time.DurationField durationField12 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField14 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField1, and durationField7", !(durationField14.compareTo(durationField1) == 0) || (Math.signum(durationField14.compareTo(durationField7)) == Math.signum(durationField1.compareTo(durationField7))));
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0425");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.year();
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology6.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean11 = islamicChronology6.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology6.secondOfDay();
        org.joda.time.DurationField durationField13 = islamicChronology6.eras();
        org.joda.time.DateTimeZone dateTimeZone14 = islamicChronology6.getZone();
        boolean boolean15 = islamicChronology0.equals((java.lang.Object) dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField13", Math.signum(durationField1.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField1)));
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0426");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.months();
        org.joda.time.DurationField durationField8 = islamicChronology0.halfdays();
        org.joda.time.DurationField durationField9 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.era();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = islamicChronology0.add(readablePeriod11, (-175993307604000036L), 0);
        org.joda.time.DurationField durationField15 = islamicChronology0.weekyears();
        java.lang.String str16 = islamicChronology0.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField15", (durationField9.compareTo(durationField15) == 0) == durationField9.equals(durationField15));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0427");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology0.weeks();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, 3L, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.centuryOfEra();
        org.joda.time.Chronology chronology12 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField13 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology0.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField13", (durationField3.compareTo(durationField13) == 0) == durationField3.equals(durationField13));
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0428");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        java.lang.String str3 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfYear();
        java.lang.String str5 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField7, and durationField2", !(durationField2.compareTo(durationField7) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField7.compareTo(durationField2))));
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0429");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField7 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean12 = dateTimeZone10.equals((java.lang.Object) (-1.0d));
        java.lang.String str14 = dateTimeZone10.getName((long) 100);
        int int16 = dateTimeZone10.getStandardOffset((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str19 = dateTimeZone18.toString();
        boolean boolean20 = dateTimeZone18.isFixed();
        java.lang.String str21 = dateTimeZone18.getID();
        long long23 = dateTimeZone10.getMillisKeepLocal(dateTimeZone18, 3L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        long long26 = dateTimeZone10.previousTransition((long) '#');
        org.joda.time.ReadableInstant readableInstant27 = null;
        int int28 = dateTimeZone10.getOffset(readableInstant27);
        org.joda.time.chrono.IslamicChronology islamicChronology29 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology29.dayOfYear();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology29.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone32 = islamicChronology29.getZone();
        org.joda.time.chrono.IslamicChronology islamicChronology33 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology33.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str37 = dateTimeZone36.toString();
        boolean boolean38 = dateTimeZone36.isFixed();
        org.joda.time.Chronology chronology39 = islamicChronology33.withZone(dateTimeZone36);
        org.joda.time.DurationField durationField40 = islamicChronology33.days();
        org.joda.time.DateTimeZone dateTimeZone41 = islamicChronology33.getZone();
        long long43 = dateTimeZone32.getMillisKeepLocal(dateTimeZone41, 3L);
        long long45 = dateTimeZone10.getMillisKeepLocal(dateTimeZone32, 115200000L);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str48 = dateTimeZone47.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology49 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone47);
        org.joda.time.DateTimeField dateTimeField50 = islamicChronology49.clockhourOfDay();
        org.joda.time.DurationField durationField51 = islamicChronology49.hours();
        org.joda.time.DurationField durationField52 = islamicChronology49.weekyears();
        org.joda.time.DurationField durationField53 = islamicChronology49.months();
        long long57 = islamicChronology49.add((long) (byte) 10, (long) (short) 10, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        org.joda.time.Chronology chronology60 = islamicChronology49.withZone(dateTimeZone59);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str63 = dateTimeZone62.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology64 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone62);
        org.joda.time.DateTimeField dateTimeField65 = islamicChronology64.clockhourOfDay();
        org.joda.time.DurationField durationField66 = islamicChronology64.hours();
        org.joda.time.DurationField durationField67 = islamicChronology64.weekyears();
        org.joda.time.DateTimeField dateTimeField68 = islamicChronology64.dayOfYear();
        org.joda.time.DurationField durationField69 = islamicChronology64.minutes();
        org.joda.time.DateTimeField dateTimeField70 = islamicChronology64.millisOfSecond();
        org.joda.time.DurationField durationField71 = islamicChronology64.halfdays();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType72 = islamicChronology64.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology73 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone59, leapYearPatternType72);
        int int75 = dateTimeZone59.getStandardOffset((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime76 = null;
        boolean boolean77 = dateTimeZone59.isLocalDateTimeGap(localDateTime76);
        long long79 = dateTimeZone10.getMillisKeepLocal(dateTimeZone59, (long) (byte) -1);
        int int81 = dateTimeZone10.getOffsetFromLocal((-1L));
        org.joda.time.Chronology chronology82 = islamicChronology0.withZone(dateTimeZone10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField69", (durationField5.compareTo(durationField69) == 0) == durationField5.equals(durationField69));
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0430");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.year();
        org.joda.time.DurationField durationField7 = islamicChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField7, and durationField2", !(durationField2.compareTo(durationField7) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField7.compareTo(durationField2))));
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0431");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType5 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology0.months();
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField10", Math.signum(durationField9.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField9)));
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0432");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType2 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField6 = islamicChronology0.eras();
        org.joda.time.DurationField durationField7 = islamicChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField7, and durationField6", !(durationField6.compareTo(durationField7) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField7.compareTo(durationField6))));
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0433");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField5 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField1, and durationField3", !(durationField5.compareTo(durationField1) == 0) || (Math.signum(durationField5.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0434");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        java.lang.String str3 = islamicChronology0.toString();
        int int4 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        java.lang.String str6 = islamicChronology0.toString();
        int int7 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField9 = islamicChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField9, and durationField2", !(durationField2.compareTo(durationField9) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField9.compareTo(durationField2))));
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0435");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str5 = dateTimeZone4.toString();
        boolean boolean6 = dateTimeZone4.isFixed();
        java.lang.String str7 = dateTimeZone4.getID();
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.clockhourOfDay();
        long long13 = islamicChronology0.add(1664L, (-3599990001L), (int) '#');
        org.joda.time.DurationField durationField14 = islamicChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField14, and durationField2", !(durationField2.compareTo(durationField14) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField14.compareTo(durationField2))));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0436");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.Chronology chronology5 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField6 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField11 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField6, and durationField8", !(durationField11.compareTo(durationField6) == 0) || (Math.signum(durationField11.compareTo(durationField8)) == Math.signum(durationField6.compareTo(durationField8))));
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0437");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int4 = dateTimeZone2.getStandardOffset((long) (short) 100);
        int int6 = dateTimeZone2.getStandardOffset((long) (byte) 1);
        boolean boolean8 = dateTimeZone2.isStandardOffset((-50399000L));
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField10 = islamicChronology9.hours();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology9.dayOfYear();
        org.joda.time.DurationField durationField12 = islamicChronology9.years();
        boolean boolean13 = dateTimeZone2.equals((java.lang.Object) islamicChronology9);
        org.joda.time.DurationField durationField14 = islamicChronology9.seconds();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = islamicChronology9.add(readablePeriod15, 42406677121022L, 100);
        org.joda.time.DurationField durationField19 = islamicChronology9.days();
        org.joda.time.chrono.IslamicChronology islamicChronology20 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField21 = islamicChronology20.weeks();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology20.yearOfEra();
        org.joda.time.DurationField durationField23 = islamicChronology20.millis();
        boolean boolean25 = islamicChronology20.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology20.hourOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType27 = islamicChronology20.getLeapYearPatternType();
        java.lang.String str28 = islamicChronology20.toString();
        org.joda.time.DateTimeZone dateTimeZone29 = islamicChronology20.getZone();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology20.dayOfYear();
        org.joda.time.DurationField durationField31 = islamicChronology20.millis();
        org.joda.time.DurationField durationField32 = islamicChronology20.minutes();
        org.joda.time.DateTimeZone dateTimeZone33 = islamicChronology20.getZone();
        long long36 = dateTimeZone33.adjustOffset((-4888702990L), false);
        long long38 = dateTimeZone33.nextTransition((-41572483199966L));
        org.joda.time.chrono.IslamicChronology islamicChronology39 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField40 = islamicChronology39.weeks();
        org.joda.time.DateTimeField dateTimeField41 = islamicChronology39.yearOfEra();
        org.joda.time.DurationField durationField42 = islamicChronology39.weekyears();
        org.joda.time.Chronology chronology43 = islamicChronology39.withUTC();
        org.joda.time.DateTimeField dateTimeField44 = islamicChronology39.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField45 = islamicChronology39.hourOfDay();
        org.joda.time.DateTimeField dateTimeField46 = islamicChronology39.secondOfMinute();
        org.joda.time.DurationField durationField47 = islamicChronology39.days();
        org.joda.time.DurationField durationField48 = islamicChronology39.minutes();
        org.joda.time.DateTimeZone dateTimeZone49 = islamicChronology39.getZone();
        boolean boolean50 = dateTimeZone33.equals((java.lang.Object) dateTimeZone49);
        int int52 = dateTimeZone33.getStandardOffset(170803086747599999L);
        org.joda.time.Chronology chronology53 = islamicChronology9.withZone(dateTimeZone33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField42", (durationField12.compareTo(durationField42) == 0) == durationField12.equals(durationField42));
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0438");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField3 = islamicChronology0.eras();
        org.joda.time.DurationField durationField4 = islamicChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField4, and durationField3", !(durationField3.compareTo(durationField4) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField4.compareTo(durationField3))));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0439");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField9 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField9", (durationField3.compareTo(durationField9) == 0) == durationField3.equals(durationField9));
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0440");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfDay();
        long long9 = islamicChronology0.add((-80689900L), (-35999900L), (int) (byte) 10);
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology10.weekyearOfCentury();
        org.joda.time.DurationField durationField12 = islamicChronology10.eras();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology10.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology10.year();
        boolean boolean15 = islamicChronology0.equals((java.lang.Object) islamicChronology10);
        org.joda.time.DurationField durationField16 = islamicChronology10.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField16, and durationField12", !(durationField12.compareTo(durationField16) == 0) || (Math.signum(durationField12.compareTo(durationField12)) == Math.signum(durationField16.compareTo(durationField12))));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0441");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int13 = dateTimeZone11.getStandardOffset((long) (short) 100);
        int int15 = dateTimeZone11.getStandardOffset((long) (byte) 1);
        boolean boolean17 = dateTimeZone11.isStandardOffset((-50399000L));
        org.joda.time.chrono.IslamicChronology islamicChronology18 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField19 = islamicChronology18.hours();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology18.dayOfYear();
        org.joda.time.DurationField durationField21 = islamicChronology18.years();
        boolean boolean22 = dateTimeZone11.equals((java.lang.Object) islamicChronology18);
        org.joda.time.Chronology chronology23 = islamicChronology0.withZone(dateTimeZone11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField8", (durationField3.compareTo(durationField8) == 0) == durationField3.equals(durationField8));
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0442");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        java.lang.String str3 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfMinute();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType6 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.era();
        org.joda.time.Chronology chronology8 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField10 = islamicChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField10, and durationField2", !(durationField2.compareTo(durationField10) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField10.compareTo(durationField2))));
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0443");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField4 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField6, and durationField4", !(durationField4.compareTo(durationField6) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField6.compareTo(durationField4))));
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0444");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.monthOfYear();
        org.joda.time.DurationField durationField4 = islamicChronology0.millis();
        org.joda.time.DurationField durationField5 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField1, and durationField4", !(durationField5.compareTo(durationField1) == 0) || (Math.signum(durationField5.compareTo(durationField4)) == Math.signum(durationField1.compareTo(durationField4))));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0445");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        long long10 = dateTimeZone7.convertLocalToUTC((long) (byte) 1, true);
        java.lang.String str11 = dateTimeZone7.getID();
        long long13 = dateTimeZone7.nextTransition((long) 36000000);
        org.joda.time.Chronology chronology14 = islamicChronology0.withZone(dateTimeZone7);
        java.lang.String str15 = dateTimeZone7.getID();
        java.lang.String str17 = dateTimeZone7.getNameKey((-35999999L));
        java.lang.String str19 = dateTimeZone7.getNameKey(187203139L);
        org.joda.time.chrono.IslamicChronology islamicChronology20 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField21 = islamicChronology20.weeks();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology20.yearOfEra();
        org.joda.time.DurationField durationField23 = islamicChronology20.weekyears();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str26 = dateTimeZone25.toString();
        org.joda.time.Chronology chronology27 = islamicChronology20.withZone(dateTimeZone25);
        int int29 = dateTimeZone25.getOffset(1L);
        org.joda.time.chrono.IslamicChronology islamicChronology30 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology30.dayOfYear();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology30.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology30.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology30.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType35 = islamicChronology30.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology36 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone25, leapYearPatternType35);
        org.joda.time.chrono.IslamicChronology islamicChronology37 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7, leapYearPatternType35);
        org.joda.time.DurationField durationField38 = islamicChronology37.weekyears();
        org.joda.time.DateTimeField dateTimeField39 = islamicChronology37.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField38", (durationField23.compareTo(durationField38) == 0) == durationField23.equals(durationField38));
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0446");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        boolean boolean4 = dateTimeZone1.isStandardOffset((long) (byte) 10);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology9.weekyearOfCentury();
        org.joda.time.DurationField durationField11 = islamicChronology9.eras();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str14 = dateTimeZone13.toString();
        boolean boolean15 = dateTimeZone13.isFixed();
        java.lang.String str16 = dateTimeZone13.getID();
        org.joda.time.Chronology chronology17 = islamicChronology9.withZone(dateTimeZone13);
        java.lang.String str18 = dateTimeZone13.toString();
        int int20 = dateTimeZone13.getStandardOffset(14459968L);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone13.getOffset(readableInstant21);
        boolean boolean23 = dateTimeZone8.equals((java.lang.Object) int22);
        org.joda.time.chrono.IslamicChronology islamicChronology24 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField25 = islamicChronology24.weeks();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology24.yearOfEra();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology24.hourOfDay();
        java.lang.String str28 = islamicChronology24.toString();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology24.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forID("+00:00");
        org.joda.time.Chronology chronology32 = islamicChronology24.withZone(dateTimeZone31);
        org.joda.time.DurationField durationField33 = islamicChronology24.seconds();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forID("+01:04");
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone35.getShortName(0L, locale37);
        java.lang.String str39 = dateTimeZone35.toString();
        org.joda.time.ReadableInstant readableInstant40 = null;
        int int41 = dateTimeZone35.getOffset(readableInstant40);
        org.joda.time.Chronology chronology42 = islamicChronology24.withZone(dateTimeZone35);
        long long44 = dateTimeZone8.getMillisKeepLocal(dateTimeZone35, (-187199999L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField25", Math.signum(durationField11.compareTo(durationField25)) == -Math.signum(durationField25.compareTo(durationField11)));
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0447");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.clockhourOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType10 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = islamicChronology0.add(readablePeriod11, (-42227872L), (int) (byte) 0);
        org.joda.time.DurationField durationField15 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField3, and durationField4", !(durationField15.compareTo(durationField3) == 0) || (Math.signum(durationField15.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0448");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.millisOfSecond();
        org.joda.time.DurationField durationField7 = islamicChronology3.days();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology3.hours();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology3.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = islamicChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology3.weekyearOfCentury();
        org.joda.time.DurationField durationField14 = islamicChronology3.years();
        org.joda.time.DurationField durationField15 = islamicChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField7, and durationField9", !(durationField15.compareTo(durationField7) == 0) || (Math.signum(durationField15.compareTo(durationField9)) == Math.signum(durationField7.compareTo(durationField9))));
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0449");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = islamicChronology0.add(readablePeriod3, (long) (byte) 100, (int) '#');
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField10", Math.signum(durationField1.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField1)));
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0450");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField6 = islamicChronology3.eras();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField6", Math.signum(durationField5.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField5)));
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0451");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField8 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField10 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField13 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField15 = islamicChronology0.years();
        org.joda.time.DurationField durationField16 = islamicChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField15", (durationField3.compareTo(durationField15) == 0) == durationField3.equals(durationField15));
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0452");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.millisOfSecond();
        org.joda.time.DurationField durationField7 = islamicChronology3.days();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology3.eras();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology3.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField9", Math.signum(durationField7.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField7)));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0453");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField6 = islamicChronology0.months();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField6", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField6)) == Math.signum(durationField1.compareTo(durationField6))));
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0454");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyearOfCentury();
        int int4 = islamicChronology0.getMinimumDaysInFirstWeek();
        long long10 = islamicChronology0.getDateTimeMillis(0L, (int) (byte) 10, (int) '#', (int) (byte) 0, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone12 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField13 = islamicChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField13, and durationField2", !(durationField2.compareTo(durationField13) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField13.compareTo(durationField2))));
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0455");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField7 = islamicChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int12 = dateTimeZone10.getStandardOffset((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone10.getOffset(readableInstant13);
        long long16 = dateTimeZone10.previousTransition((long) (-1));
        long long18 = dateTimeZone10.nextTransition(36000000L);
        org.joda.time.Chronology chronology19 = islamicChronology0.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField20 = islamicChronology0.years();
        org.joda.time.DurationField durationField21 = islamicChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField20", (durationField3.compareTo(durationField20) == 0) == durationField3.equals(durationField20));
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0456");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.dayOfYear();
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField9 = islamicChronology8.weeks();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology8.yearOfEra();
        org.joda.time.DurationField durationField11 = islamicChronology8.millis();
        long long15 = islamicChronology8.add(100L, (-1L), (int) 'a');
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology8.weekOfWeekyear();
        boolean boolean18 = islamicChronology0.equals((java.lang.Object) islamicChronology8);
        org.joda.time.DurationField durationField19 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField20 = islamicChronology0.millis();
        org.joda.time.DurationField durationField21 = islamicChronology0.centuries();
        org.joda.time.chrono.IslamicChronology islamicChronology22 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology22.weekyearOfCentury();
        org.joda.time.DurationField durationField24 = islamicChronology22.eras();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology22.weekyearOfCentury();
        int int26 = islamicChronology22.getMinimumDaysInFirstWeek();
        long long32 = islamicChronology22.getDateTimeMillis(0L, (int) (byte) 10, (int) '#', (int) (byte) 0, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology22.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology22.era();
        boolean boolean35 = islamicChronology0.equals((java.lang.Object) dateTimeField34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField24", Math.signum(durationField1.compareTo(durationField24)) == -Math.signum(durationField24.compareTo(durationField1)));
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0457");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        long long10 = dateTimeZone7.convertLocalToUTC((long) (byte) 1, true);
        java.lang.String str11 = dateTimeZone7.getID();
        long long13 = dateTimeZone7.nextTransition((long) 36000000);
        org.joda.time.Chronology chronology14 = islamicChronology0.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField16 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology0.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField16", Math.signum(durationField1.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField1)));
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0458");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DurationField durationField7 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField10 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField10", (durationField3.compareTo(durationField10) == 0) == durationField3.equals(durationField10));
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0459");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.hourOfDay();
        org.joda.time.DurationField durationField8 = islamicChronology3.months();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = islamicChronology3.eras();
        org.joda.time.Chronology chronology11 = islamicChronology3.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField10", Math.signum(durationField8.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField8)));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0460");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, (long) 10, (int) (short) 100);
        org.joda.time.DurationField durationField9 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone13.isLocalDateTimeGap(localDateTime14);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        long long19 = dateTimeZone13.getMillisKeepLocal(dateTimeZone17, (long) 0);
        org.joda.time.Chronology chronology20 = islamicChronology0.withZone(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField23 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField1, and durationField3", !(durationField23.compareTo(durationField1) == 0) || (Math.signum(durationField23.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0461");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField9 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField3", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0462");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyear();
        long long8 = islamicChronology0.add((-80689900L), (-101L), (int) (short) 100);
        org.joda.time.Chronology chronology9 = islamicChronology0.withUTC();
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology11.weekyearOfCentury();
        org.joda.time.DurationField durationField13 = islamicChronology11.eras();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str16 = dateTimeZone15.toString();
        boolean boolean17 = dateTimeZone15.isFixed();
        java.lang.String str18 = dateTimeZone15.getID();
        org.joda.time.Chronology chronology19 = islamicChronology11.withZone(dateTimeZone15);
        org.joda.time.Chronology chronology20 = islamicChronology10.withZone(dateTimeZone15);
        long long22 = dateTimeZone15.previousTransition(35L);
        boolean boolean24 = dateTimeZone15.isStandardOffset((-844789680L));
        org.joda.time.Chronology chronology25 = islamicChronology0.withZone(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField13", Math.signum(durationField1.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField1)));
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0463");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.years();
        long long8 = islamicChronology0.getDateTimeMillis(10, (int) (short) 1, (int) (byte) 10, (int) ' ');
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = islamicChronology0.getZone();
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone10.getOffset(readableInstant11);
        boolean boolean13 = dateTimeZone10.isFixed();
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField15 = islamicChronology14.weeks();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology14.yearOfEra();
        org.joda.time.DurationField durationField17 = islamicChronology14.weekyears();
        org.joda.time.Chronology chronology18 = islamicChronology14.withUTC();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology14.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology14.hourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology14.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone22 = islamicChronology14.getZone();
        long long24 = dateTimeZone22.convertUTCToLocal(3600000001L);
        org.joda.time.chrono.IslamicChronology islamicChronology25 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology25.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology25.dayOfYear();
        org.joda.time.DurationField durationField28 = islamicChronology25.minutes();
        org.joda.time.DurationField durationField29 = islamicChronology25.halfdays();
        org.joda.time.chrono.IslamicChronology islamicChronology30 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology30.weekyear();
        org.joda.time.DateTimeZone dateTimeZone32 = islamicChronology30.getZone();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int37 = dateTimeZone35.getStandardOffset((long) (short) 100);
        org.joda.time.Chronology chronology38 = islamicChronology30.withZone(dateTimeZone35);
        org.joda.time.Chronology chronology39 = islamicChronology25.withZone(dateTimeZone35);
        long long41 = dateTimeZone22.getMillisKeepLocal(dateTimeZone35, (-844789680L));
        java.util.Locale locale43 = null;
        java.lang.String str44 = dateTimeZone22.getShortName((-440688900L), locale43);
        long long46 = dateTimeZone10.getMillisKeepLocal(dateTimeZone22, 360241664L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField17", (durationField3.compareTo(durationField17) == 0) == durationField3.equals(durationField17));
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0464");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField3 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str9 = dateTimeZone8.toString();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone8.getShortName((long) 10, locale11);
        int int14 = dateTimeZone8.getOffsetFromLocal((long) 0);
        java.lang.String str16 = dateTimeZone8.getName((long) (-1));
        java.util.TimeZone timeZone17 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.Chronology chronology19 = islamicChronology0.withZone(dateTimeZone18);
        org.joda.time.DurationField durationField20 = chronology19.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField1, and durationField3", !(durationField20.compareTo(durationField1) == 0) || (Math.signum(durationField20.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0465");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.year();
        org.joda.time.DurationField durationField11 = islamicChronology0.years();
        org.joda.time.DurationField durationField12 = islamicChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField11", (durationField8.compareTo(durationField11) == 0) == durationField8.equals(durationField11));
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0466");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = islamicChronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology3.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType12 = islamicChronology3.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str17 = dateTimeZone16.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology18 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology18.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone20 = islamicChronology18.getZone();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology18.millisOfSecond();
        org.joda.time.DurationField durationField22 = islamicChronology18.days();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology18.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology18.clockhourOfDay();
        org.joda.time.DurationField durationField25 = islamicChronology18.years();
        org.joda.time.DurationField durationField26 = islamicChronology18.centuries();
        boolean boolean27 = islamicChronology3.equals((java.lang.Object) islamicChronology18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField25", (durationField6.compareTo(durationField25) == 0) == durationField6.equals(durationField25));
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0467");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.era();
        org.joda.time.DurationField durationField8 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField10 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField11 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField11", (durationField6.compareTo(durationField11) == 0) == durationField6.equals(durationField11));
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0468");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField5 = islamicChronology0.months();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = islamicChronology0.add(readablePeriod6, 1010L, (int) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.secondOfDay();
        org.joda.time.DurationField durationField11 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField13 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField14 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField1, and durationField5", !(durationField14.compareTo(durationField1) == 0) || (Math.signum(durationField14.compareTo(durationField5)) == Math.signum(durationField1.compareTo(durationField5))));
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0469");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DurationField durationField5 = islamicChronology0.hours();
        java.lang.String str6 = islamicChronology0.toString();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField3, and durationField5", !(durationField7.compareTo(durationField3) == 0) || (Math.signum(durationField7.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0470");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 4);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType3 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology4 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2, leapYearPatternType3);
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology4.minuteOfHour();
        org.joda.time.DurationField durationField6 = islamicChronology4.eras();
        org.joda.time.DurationField durationField7 = islamicChronology4.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField7, and durationField6", !(durationField6.compareTo(durationField7) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField7.compareTo(durationField6))));
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0471");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.year();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField5 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField5", Math.signum(durationField1.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField1)));
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0472");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        long long7 = islamicChronology0.add((long) (short) 1, 0L, 4);
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str11 = dateTimeZone10.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology12.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology12.weekyear();
        org.joda.time.DurationField durationField15 = islamicChronology12.days();
        org.joda.time.DurationField durationField16 = islamicChronology12.halfdays();
        org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField18 = islamicChronology17.weeks();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology17.hourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology17.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        long long27 = dateTimeZone24.convertLocalToUTC((long) (byte) 1, true);
        java.lang.String str28 = dateTimeZone24.getID();
        long long30 = dateTimeZone24.nextTransition((long) 36000000);
        org.joda.time.Chronology chronology31 = islamicChronology17.withZone(dateTimeZone24);
        java.lang.String str32 = dateTimeZone24.getID();
        long long36 = dateTimeZone24.convertLocalToUTC((-440688868L), false, (-41571691199999L));
        java.util.Locale locale38 = null;
        java.lang.String str39 = dateTimeZone24.getName((long) 36000000, locale38);
        org.joda.time.Chronology chronology40 = islamicChronology12.withZone(dateTimeZone24);
        org.joda.time.chrono.IslamicChronology islamicChronology41 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField42 = islamicChronology41.weeks();
        org.joda.time.DateTimeField dateTimeField43 = islamicChronology41.yearOfEra();
        org.joda.time.DurationField durationField44 = islamicChronology41.weekyears();
        org.joda.time.Chronology chronology45 = islamicChronology41.withUTC();
        org.joda.time.DateTimeField dateTimeField46 = islamicChronology41.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField47 = islamicChronology41.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone48 = islamicChronology41.getZone();
        int int50 = dateTimeZone48.getStandardOffset(10L);
        long long53 = dateTimeZone48.adjustOffset(10100L, false);
        long long55 = dateTimeZone24.getMillisKeepLocal(dateTimeZone48, (-36000000L));
        org.joda.time.Chronology chronology56 = islamicChronology0.withZone(dateTimeZone48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField15", Math.signum(durationField8.compareTo(durationField15)) == -Math.signum(durationField15.compareTo(durationField8)));
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0473");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField8 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField10 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField12 = islamicChronology0.weekyears();
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField14 = islamicChronology13.weeks();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology13.yearOfEra();
        org.joda.time.DurationField durationField16 = islamicChronology13.weekyears();
        org.joda.time.Chronology chronology17 = islamicChronology13.withUTC();
        org.joda.time.DateTimeZone dateTimeZone18 = islamicChronology13.getZone();
        org.joda.time.Chronology chronology19 = islamicChronology0.withZone(dateTimeZone18);
        org.joda.time.chrono.IslamicChronology islamicChronology20 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology20.dayOfYear();
        org.joda.time.DurationField durationField22 = islamicChronology20.weekyears();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology20.era();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology20.secondOfMinute();
        org.joda.time.Chronology chronology25 = islamicChronology20.withUTC();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.dayOfYear();
        org.joda.time.DurationField durationField27 = chronology25.eras();
        boolean boolean28 = islamicChronology0.equals((java.lang.Object) chronology25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField27", Math.signum(durationField1.compareTo(durationField27)) == -Math.signum(durationField27.compareTo(durationField1)));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0474");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField11 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField1, and durationField3", !(durationField11.compareTo(durationField1) == 0) || (Math.signum(durationField11.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0475");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField7", Math.signum(durationField2.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField2)));
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0476");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekOfWeekyear();
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology6.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = islamicChronology6.eras();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology6.weekyearOfCentury();
        int int10 = islamicChronology6.getMinimumDaysInFirstWeek();
        long long16 = islamicChronology6.getDateTimeMillis(0L, (int) (byte) 10, (int) '#', (int) (byte) 0, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology6.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone18 = islamicChronology6.getZone();
        org.joda.time.Chronology chronology19 = islamicChronology0.withZone(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField8", Math.signum(durationField4.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField4)));
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0477");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfCentury();
        org.joda.time.Chronology chronology8 = islamicChronology0.withUTC();
        java.lang.String str9 = islamicChronology0.toString();
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField4", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0478");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField10 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField11 = islamicChronology0.hours();
        long long15 = islamicChronology0.add(14460100L, 132L, (-1));
        long long19 = islamicChronology0.add(187200000L, 1664L, (int) (byte) -1);
        org.joda.time.DurationField durationField20 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology0.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField20", (durationField8.compareTo(durationField20) == 0) == durationField8.equals(durationField20));
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0479");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyearOfCentury();
        int int4 = islamicChronology0.getMinimumDaysInFirstWeek();
        long long10 = islamicChronology0.getDateTimeMillis(0L, (int) (byte) 10, (int) '#', (int) (byte) 0, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField13 = islamicChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField13, and durationField2", !(durationField2.compareTo(durationField13) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField13.compareTo(durationField2))));
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0480");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.years();
        long long8 = islamicChronology0.getDateTimeMillis(10, (int) (short) 1, (int) (byte) 10, (int) ' ');
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField14 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField1, and durationField3", !(durationField14.compareTo(durationField1) == 0) || (Math.signum(durationField14.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0481");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.yearOfEra();
        java.lang.String str8 = islamicChronology3.toString();
        org.joda.time.DurationField durationField9 = islamicChronology3.weekyears();
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField11 = islamicChronology10.weeks();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology10.yearOfEra();
        org.joda.time.DurationField durationField13 = islamicChronology10.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology10.year();
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField16 = islamicChronology15.weeks();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology15.yearOfEra();
        org.joda.time.DurationField durationField18 = islamicChronology15.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology15.year();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = islamicChronology15.add(readablePeriod20, (long) 10, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone24 = islamicChronology15.getZone();
        java.lang.String str25 = dateTimeZone24.getID();
        org.joda.time.Chronology chronology26 = islamicChronology10.withZone(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology10.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology10.weekOfWeekyear();
        org.joda.time.DurationField durationField29 = islamicChronology10.weeks();
        org.joda.time.DateTimeZone dateTimeZone30 = islamicChronology10.getZone();
        int int32 = dateTimeZone30.getOffsetFromLocal(115200031L);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        long long36 = dateTimeZone34.previousTransition(10L);
        long long38 = dateTimeZone30.getMillisKeepLocal(dateTimeZone34, 0L);
        org.joda.time.Chronology chronology39 = islamicChronology3.withZone(dateTimeZone34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField13", (durationField9.compareTo(durationField13) == 0) == durationField9.equals(durationField13));
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0482");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology0.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = islamicChronology0.add(readablePeriod8, (-518398999L), 3840000);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone14.isLocalDateTimeGap(localDateTime17);
        org.joda.time.Chronology chronology19 = islamicChronology0.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField20 = chronology19.secondOfDay();
        org.joda.time.DurationField durationField21 = chronology19.centuries();
        org.joda.time.DateTimeField dateTimeField22 = chronology19.weekyearOfCentury();
        org.joda.time.DurationField durationField23 = chronology19.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField1, and durationField3", !(durationField23.compareTo(durationField1) == 0) || (Math.signum(durationField23.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0483");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, (long) 10, (int) (short) 100);
        org.joda.time.DurationField durationField9 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone13.isLocalDateTimeGap(localDateTime14);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        long long19 = dateTimeZone13.getMillisKeepLocal(dateTimeZone17, (long) 0);
        org.joda.time.Chronology chronology20 = islamicChronology0.withZone(dateTimeZone17);
        org.joda.time.DurationField durationField21 = islamicChronology0.halfdays();
        org.joda.time.DurationField durationField22 = islamicChronology0.halfdays();
        org.joda.time.DurationField durationField23 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField1, and durationField3", !(durationField23.compareTo(durationField1) == 0) || (Math.signum(durationField23.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0484");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = islamicChronology1.eras();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str6 = dateTimeZone5.toString();
        boolean boolean7 = dateTimeZone5.isFixed();
        java.lang.String str8 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology9 = islamicChronology1.withZone(dateTimeZone5);
        org.joda.time.Chronology chronology10 = islamicChronology0.withZone(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField13 = islamicChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField13, and durationField3", !(durationField3.compareTo(durationField13) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField13.compareTo(durationField3))));
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0485");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = islamicChronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology3.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType12 = islamicChronology3.getLeapYearPatternType();
        java.lang.String str13 = islamicChronology3.toString();
        org.joda.time.DurationField durationField14 = islamicChronology3.years();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology3.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField14", (durationField6.compareTo(durationField14) == 0) == durationField6.equals(durationField14));
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0486");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = islamicChronology0.add(readablePeriod3, (long) (byte) 100, (int) '#');
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.era();
        long long11 = islamicChronology0.add(10L, (-50399000L), (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone12 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField13 = islamicChronology0.halfdays();
        java.lang.String str14 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology0.clockhourOfHalfday();
        long long19 = islamicChronology0.add((-2044528502394613L), 36324000035L, 187200000);
        org.joda.time.Chronology chronology20 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField21 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField1, and durationField13", !(durationField21.compareTo(durationField1) == 0) || (Math.signum(durationField21.compareTo(durationField13)) == Math.signum(durationField1.compareTo(durationField13))));
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0487");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.secondOfDay();
        org.joda.time.DurationField durationField8 = islamicChronology3.eras();
        org.joda.time.DurationField durationField9 = islamicChronology3.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField9, and durationField8", !(durationField8.compareTo(durationField9) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField9.compareTo(durationField8))));
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0488");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField4 = islamicChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField4, and durationField2", !(durationField2.compareTo(durationField4) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField4.compareTo(durationField2))));
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0489");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        long long9 = islamicChronology0.add(187200035L, (long) ' ', (int) 'a');
        org.joda.time.DurationField durationField10 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField14 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField3, and durationField4", !(durationField14.compareTo(durationField3) == 0) || (Math.signum(durationField14.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0490");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.minuteOfDay();
        long long6 = islamicChronology0.add(32L, (-440688900L), 1);
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField9 = islamicChronology8.weeks();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology8.yearOfEra();
        org.joda.time.DurationField durationField11 = islamicChronology8.weekyears();
        org.joda.time.Chronology chronology12 = islamicChronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology8.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology8.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone15 = islamicChronology8.getZone();
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone15.getShortName(38100000L, locale17);
        long long20 = dateTimeZone15.previousTransition((long) ' ');
        java.lang.String str21 = dateTimeZone15.toString();
        long long24 = dateTimeZone15.adjustOffset(122432003L, false);
        org.joda.time.Chronology chronology25 = islamicChronology0.withZone(dateTimeZone15);
        org.joda.time.DurationField durationField26 = chronology25.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField1, and durationField9", !(durationField26.compareTo(durationField1) == 0) || (Math.signum(durationField26.compareTo(durationField9)) == Math.signum(durationField1.compareTo(durationField9))));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0491");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.dayOfWeek();
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField8 = islamicChronology7.weeks();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology7.yearOfEra();
        org.joda.time.DurationField durationField10 = islamicChronology7.millis();
        long long14 = islamicChronology7.add(100L, (-1L), (int) 'a');
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology7.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology7.hourOfDay();
        boolean boolean18 = islamicChronology0.equals((java.lang.Object) dateTimeField17);
        org.joda.time.DurationField durationField19 = islamicChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str22 = dateTimeZone21.toString();
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone21.isLocalDateTimeGap(localDateTime23);
        java.lang.String str26 = dateTimeZone21.getName(36000001L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        org.joda.time.Chronology chronology28 = islamicChronology0.withZone(dateTimeZone21);
        org.joda.time.DurationField durationField29 = islamicChronology0.days();
        org.joda.time.DurationField durationField30 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField30, durationField8, and durationField10", !(durationField30.compareTo(durationField8) == 0) || (Math.signum(durationField30.compareTo(durationField10)) == Math.signum(durationField8.compareTo(durationField10))));
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0492");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.halfdayOfDay();
        org.joda.time.Chronology chronology10 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField12 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField13 = islamicChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField13", (durationField6.compareTo(durationField13) == 0) == durationField6.equals(durationField13));
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0493");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = islamicChronology1.eras();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str6 = dateTimeZone5.toString();
        boolean boolean7 = dateTimeZone5.isFixed();
        java.lang.String str8 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology9 = islamicChronology1.withZone(dateTimeZone5);
        org.joda.time.Chronology chronology10 = islamicChronology0.withZone(dateTimeZone5);
        long long12 = dateTimeZone5.previousTransition(35L);
        boolean boolean14 = dateTimeZone5.isStandardOffset((-844789680L));
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology15.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str19 = dateTimeZone18.toString();
        boolean boolean20 = dateTimeZone18.isFixed();
        org.joda.time.Chronology chronology21 = islamicChronology15.withZone(dateTimeZone18);
        org.joda.time.chrono.IslamicChronology islamicChronology22 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField23 = islamicChronology22.weeks();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology22.yearOfEra();
        org.joda.time.DurationField durationField25 = islamicChronology22.weekyears();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology22.year();
        org.joda.time.DurationField durationField27 = islamicChronology22.seconds();
        boolean boolean28 = dateTimeZone18.equals((java.lang.Object) islamicChronology22);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone18.getShortName((-518398999L), locale30);
        boolean boolean32 = dateTimeZone5.equals((java.lang.Object) (-518398999L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField23", Math.signum(durationField3.compareTo(durationField23)) == -Math.signum(durationField23.compareTo(durationField3)));
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0494");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = islamicChronology0.getZone();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType5 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField7", Math.signum(durationField3.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField3)));
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0495");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        long long9 = dateTimeZone6.getMillisKeepLocal(dateTimeZone7, (long) (byte) -1);
        org.joda.time.Chronology chronology10 = islamicChronology3.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField11 = islamicChronology3.minutes();
        long long15 = islamicChronology3.add((-35999965L), 1010L, 36000000);
        org.joda.time.DurationField durationField16 = islamicChronology3.weekyears();
        java.lang.String str17 = islamicChronology3.toString();
        org.joda.time.DurationField durationField18 = islamicChronology3.days();
        org.joda.time.DurationField durationField19 = islamicChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField11, and durationField16", !(durationField19.compareTo(durationField11) == 0) || (Math.signum(durationField19.compareTo(durationField16)) == Math.signum(durationField11.compareTo(durationField16))));
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0496");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        long long9 = islamicChronology0.add(187200035L, (long) ' ', (int) 'a');
        org.joda.time.DurationField durationField10 = islamicChronology0.months();
        org.joda.time.DurationField durationField11 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone13 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField17 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField18 = islamicChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField17", (durationField11.compareTo(durationField17) == 0) == durationField11.equals(durationField17));
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0497");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DurationField durationField4 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField4", Math.signum(durationField3.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField3)));
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0498");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField5 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField6 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField4, and durationField5", !(durationField6.compareTo(durationField4) == 0) || (Math.signum(durationField6.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0499");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.year();
        long long11 = islamicChronology0.getDateTimeMillis((long) (short) 0, 4, (int) (byte) 1, 0, 100);
        org.joda.time.DurationField durationField12 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.hourOfHalfday();
        java.lang.String str14 = islamicChronology0.toString();
        org.joda.time.DurationField durationField15 = islamicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str18 = dateTimeZone17.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone17);
        int int21 = dateTimeZone17.getStandardOffset(10L);
        int int23 = dateTimeZone17.getOffset((-35999900L));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType24 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology25 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone17, leapYearPatternType24);
        java.lang.String str27 = dateTimeZone17.getNameKey(32L);
        boolean boolean28 = dateTimeZone17.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        long long31 = dateTimeZone17.previousTransition((-84478968L));
        long long33 = dateTimeZone17.nextTransition(119040031L);
        org.joda.time.Chronology chronology34 = islamicChronology0.withZone(dateTimeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField15", (durationField12.compareTo(durationField15) == 0) == durationField12.equals(durationField15));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0500");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType5 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.hourOfDay();
        org.joda.time.Chronology chronology13 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField14 = chronology13.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField14, and durationField9", !(durationField9.compareTo(durationField14) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField14.compareTo(durationField9))));
    }
}

