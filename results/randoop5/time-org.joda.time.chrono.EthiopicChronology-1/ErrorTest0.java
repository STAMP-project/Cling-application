import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology3.dayOfYear();
        boolean boolean5 = ethiopicChronology0.equals((java.lang.Object) dateTimeField4);
        org.joda.time.DurationField durationField6 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField6", Math.signum(durationField2.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField2)));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField2, and durationField6", !(durationField8.compareTo(durationField2) == 0) || (Math.signum(durationField8.compareTo(durationField6)) == Math.signum(durationField2.compareTo(durationField6))));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.centuries();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology4 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long8 = ethiopicChronology4.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField9 = ethiopicChronology4.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology4.weekOfWeekyear();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long15 = ethiopicChronology11.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str16 = ethiopicChronology11.toString();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology17 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology17.millisOfDay();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology17.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = ethiopicChronology17.getZone();
        org.joda.time.Chronology chronology21 = ethiopicChronology11.withZone(dateTimeZone20);
        org.joda.time.Chronology chronology22 = ethiopicChronology4.withZone(dateTimeZone20);
        org.joda.time.Chronology chronology23 = ethiopicChronology0.withZone(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField9", (durationField2.compareTo(durationField9) == 0) == durationField2.equals(durationField9));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = ethiopicChronology0.months();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField4", Math.signum(durationField3.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField3)));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.months();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.hours();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.millisOfDay();
        org.joda.time.DurationField durationField10 = ethiopicChronology8.seconds();
        org.joda.time.DurationField durationField11 = ethiopicChronology8.eras();
        boolean boolean12 = ethiopicChronology0.equals((java.lang.Object) durationField11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField5, and durationField7", !(durationField11.compareTo(durationField5) == 0) || (Math.signum(durationField11.compareTo(durationField7)) == Math.signum(durationField5.compareTo(durationField7))));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.eras();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField5, and durationField4", !(durationField4.compareTo(durationField5) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField5.compareTo(durationField4))));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = ethiopicChronology0.months();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology0.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField4", Math.signum(durationField3.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField3)));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField13", (durationField5.compareTo(durationField13) == 0) == durationField5.equals(durationField13));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology3.dayOfYear();
        boolean boolean5 = ethiopicChronology0.equals((java.lang.Object) dateTimeField4);
        org.joda.time.DurationField durationField6 = ethiopicChronology0.eras();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField6", Math.signum(durationField7.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField7)));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.weekyears();
        long long14 = ethiopicChronology0.getDateTimeMillis(52L, 0, 4, (int) (short) 10, (int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = ethiopicChronology0.add(readablePeriod15, (long) 10, 10);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology19 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean21 = ethiopicChronology19.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology19.halfdayOfDay();
        org.joda.time.DurationField durationField23 = ethiopicChronology19.millis();
        org.joda.time.DateTimeField dateTimeField24 = ethiopicChronology19.minuteOfHour();
        org.joda.time.DurationField durationField25 = ethiopicChronology19.years();
        org.joda.time.DateTimeZone dateTimeZone26 = ethiopicChronology19.getZone();
        org.joda.time.Chronology chronology27 = ethiopicChronology0.withZone(dateTimeZone26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField25", (durationField8.compareTo(durationField25) == 0) == durationField8.equals(durationField25));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology3.dayOfYear();
        boolean boolean5 = ethiopicChronology0.equals((java.lang.Object) dateTimeField4);
        org.joda.time.DurationField durationField6 = ethiopicChronology0.eras();
        org.joda.time.Chronology chronology7 = ethiopicChronology0.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField6", Math.signum(durationField2.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField2)));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = ethiopicChronology0.months();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.eras();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology5 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long9 = ethiopicChronology5.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField10 = ethiopicChronology5.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology5.weekOfWeekyear();
        java.lang.String str12 = ethiopicChronology5.toString();
        java.lang.String str13 = ethiopicChronology5.toString();
        org.joda.time.DurationField durationField14 = ethiopicChronology5.minutes();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology5.year();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology5.centuryOfEra();
        boolean boolean17 = ethiopicChronology0.equals((java.lang.Object) dateTimeField16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField4", Math.signum(durationField3.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField3)));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.eras();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField5", Math.signum(durationField4.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField4)));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.eras();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField3, and durationField2", !(durationField2.compareTo(durationField3) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField3.compareTo(durationField2))));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology3.dayOfYear();
        boolean boolean5 = ethiopicChronology0.equals((java.lang.Object) dateTimeField4);
        org.joda.time.DurationField durationField6 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField6", Math.signum(durationField2.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField2)));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField13", (durationField5.compareTo(durationField13) == 0) == durationField5.equals(durationField13));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.hourOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.eras();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField6", Math.signum(durationField4.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField4)));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField5", Math.signum(durationField3.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField3)));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        java.lang.String str8 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField5, and durationField9", !(durationField11.compareTo(durationField5) == 0) || (Math.signum(durationField11.compareTo(durationField9)) == Math.signum(durationField5.compareTo(durationField9))));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology3.dayOfYear();
        boolean boolean5 = ethiopicChronology0.equals((java.lang.Object) dateTimeField4);
        org.joda.time.DurationField durationField6 = ethiopicChronology0.eras();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology0.add(readablePeriod7, 35L, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField6", Math.signum(durationField2.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField2)));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.eras();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField3, and durationField2", !(durationField2.compareTo(durationField3) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField3.compareTo(durationField2))));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.eras();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField5", Math.signum(durationField3.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField3)));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.centuryOfEra();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long18 = ethiopicChronology14.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField19 = ethiopicChronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology14.weekOfWeekyear();
        org.joda.time.DurationField durationField21 = ethiopicChronology14.days();
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology14.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone23 = ethiopicChronology14.getZone();
        boolean boolean24 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField19", (durationField5.compareTo(durationField19) == 0) == durationField5.equals(durationField19));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withUTC();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology0.add(readablePeriod7, (long) 'a', 0);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long15 = ethiopicChronology11.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField16 = ethiopicChronology11.weekyears();
        org.joda.time.DateTimeZone dateTimeZone17 = ethiopicChronology11.getZone();
        org.joda.time.Chronology chronology18 = ethiopicChronology0.withZone(dateTimeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField16", (durationField2.compareTo(durationField16) == 0) == durationField2.equals(durationField16));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.eras();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField6", Math.signum(durationField4.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField4)));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.eras();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField9", Math.signum(durationField7.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField7)));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        java.lang.String str8 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.minutes();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField5, and durationField9", !(durationField10.compareTo(durationField5) == 0) || (Math.signum(durationField10.compareTo(durationField9)) == Math.signum(durationField5.compareTo(durationField9))));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = ethiopicChronology0.months();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField4", Math.signum(durationField3.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField3)));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField8", (durationField5.compareTo(durationField8) == 0) == durationField5.equals(durationField8));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = ethiopicChronology0.months();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField4", Math.signum(durationField3.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField3)));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology7.monthOfYear();
        boolean boolean12 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField14 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.hourOfDay();
        org.joda.time.DurationField durationField17 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField6, and durationField14", !(durationField17.compareTo(durationField6) == 0) || (Math.signum(durationField17.compareTo(durationField14)) == Math.signum(durationField6.compareTo(durationField14))));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.clockhourOfDay();
        java.lang.String str9 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField10", Math.signum(durationField5.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField5)));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField5", Math.signum(durationField4.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField4)));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        java.lang.String str8 = ethiopicChronology0.toString();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology9.weekyear();
        org.joda.time.DurationField durationField11 = ethiopicChronology9.years();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = ethiopicChronology9.add(readablePeriod12, (long) (-1), (int) (byte) 100);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology16 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean18 = ethiopicChronology16.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology16.halfdayOfDay();
        org.joda.time.DurationField durationField20 = ethiopicChronology16.millis();
        org.joda.time.DurationField durationField21 = ethiopicChronology16.days();
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology16.yearOfCentury();
        boolean boolean23 = ethiopicChronology9.equals((java.lang.Object) ethiopicChronology16);
        org.joda.time.DateTimeField dateTimeField24 = ethiopicChronology9.yearOfCentury();
        boolean boolean25 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField11", (durationField5.compareTo(durationField11) == 0) == durationField5.equals(durationField11));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.eras();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField9", Math.signum(durationField7.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField7)));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.months();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone8 = ethiopicChronology0.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField7", Math.signum(durationField5.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField5)));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        java.lang.String str8 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField5, and durationField9", !(durationField13.compareTo(durationField5) == 0) || (Math.signum(durationField13.compareTo(durationField9)) == Math.signum(durationField5.compareTo(durationField9))));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField6", Math.signum(durationField4.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField4)));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.eras();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField5", Math.signum(durationField4.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField4)));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        long long9 = ethiopicChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DateTimeZone dateTimeZone10 = ethiopicChronology0.getZone();
        long long14 = ethiopicChronology0.add((long) (byte) 1, (long) (-1), (int) (byte) 100);
        org.joda.time.DurationField durationField15 = ethiopicChronology0.eras();
        org.joda.time.DurationField durationField16 = ethiopicChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField15", Math.signum(durationField4.compareTo(durationField15)) == -Math.signum(durationField15.compareTo(durationField4)));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField8", (durationField5.compareTo(durationField8) == 0) == durationField5.equals(durationField8));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        java.lang.String str6 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField8", Math.signum(durationField5.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField5)));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = ethiopicChronology0.months();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.eras();
        java.lang.String str5 = ethiopicChronology0.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField4", Math.signum(durationField3.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField3)));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField3", Math.signum(durationField2.compareTo(durationField3)) == -Math.signum(durationField3.compareTo(durationField2)));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField7", Math.signum(durationField5.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField5)));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        java.lang.String str8 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.minutes();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField5, and durationField9", !(durationField12.compareTo(durationField5) == 0) || (Math.signum(durationField12.compareTo(durationField9)) == Math.signum(durationField5.compareTo(durationField9))));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.weeks();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology9.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Chronology chronology12 = ethiopicChronology9.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology9.dayOfWeek();
        java.lang.String str14 = ethiopicChronology9.toString();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology9.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology9.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology9.weekyearOfCentury();
        org.joda.time.DurationField durationField18 = ethiopicChronology9.centuries();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology9.weekyear();
        org.joda.time.DurationField durationField20 = ethiopicChronology9.eras();
        boolean boolean21 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField20", Math.signum(durationField2.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField2)));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.hourOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField6", Math.signum(durationField4.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField4)));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = ethiopicChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.chrono.EthiopicChronology ethiopicChronology5 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean7 = ethiopicChronology5.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology5.halfdayOfDay();
        org.joda.time.DurationField durationField9 = ethiopicChronology5.millis();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology5.minuteOfHour();
        org.joda.time.DurationField durationField11 = ethiopicChronology5.years();
        org.joda.time.DateTimeZone dateTimeZone12 = ethiopicChronology5.getZone();
        org.joda.time.Chronology chronology13 = ethiopicChronology0.withZone(dateTimeZone12);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField15 = ethiopicChronology14.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField9, and durationField11", !(durationField15.compareTo(durationField9) == 0) || (Math.signum(durationField15.compareTo(durationField11)) == Math.signum(durationField9.compareTo(durationField11))));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField9", Math.signum(durationField7.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField7)));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.centuries();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.eras();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField8", Math.signum(durationField7.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField7)));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.months();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long15 = ethiopicChronology11.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField16 = ethiopicChronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology11.weekOfWeekyear();
        org.joda.time.DurationField durationField18 = ethiopicChronology11.days();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology11.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone20 = ethiopicChronology11.getZone();
        org.joda.time.Chronology chronology21 = ethiopicChronology0.withZone(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField16", (durationField2.compareTo(durationField16) == 0) == durationField2.equals(durationField16));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.weekyears();
        org.joda.time.DurationField durationField14 = ethiopicChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField13", (durationField5.compareTo(durationField13) == 0) == durationField5.equals(durationField13));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology7.monthOfYear();
        boolean boolean12 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.DurationField durationField13 = ethiopicChronology7.centuries();
        org.joda.time.DurationField durationField14 = ethiopicChronology7.centuries();
        org.joda.time.DurationField durationField15 = ethiopicChronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField6, and durationField13", !(durationField15.compareTo(durationField6) == 0) || (Math.signum(durationField15.compareTo(durationField13)) == Math.signum(durationField6.compareTo(durationField13))));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField2, and durationField4", !(durationField6.compareTo(durationField2) == 0) || (Math.signum(durationField6.compareTo(durationField4)) == Math.signum(durationField2.compareTo(durationField4))));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (-1), (int) (byte) 100);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology7.millis();
        org.joda.time.DurationField durationField12 = ethiopicChronology7.days();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology7.yearOfCentury();
        boolean boolean14 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        long long18 = ethiopicChronology7.add((long) (short) -1, 9L, (int) (short) 100);
        org.joda.time.DurationField durationField19 = ethiopicChronology7.weekyears();
        org.joda.time.DurationField durationField20 = ethiopicChronology7.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField19", (durationField2.compareTo(durationField19) == 0) == durationField2.equals(durationField19));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        java.lang.String str5 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.centuries();
        java.lang.String str10 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField11", Math.signum(durationField9.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField9)));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField13", (durationField5.compareTo(durationField13) == 0) == durationField5.equals(durationField13));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        java.lang.String str5 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.eras();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField11", Math.signum(durationField9.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField9)));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology7.monthOfYear();
        boolean boolean12 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField15 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField15", Math.signum(durationField6.compareTo(durationField15)) == -Math.signum(durationField15.compareTo(durationField6)));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.days();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.yearOfCentury();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long15 = ethiopicChronology11.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField16 = ethiopicChronology11.years();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology11.era();
        org.joda.time.DurationField durationField18 = ethiopicChronology11.years();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology11.secondOfMinute();
        boolean boolean20 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField16", (durationField6.compareTo(durationField16) == 0) == durationField6.equals(durationField16));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology6 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology6.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology6.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long13 = ethiopicChronology9.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField14 = ethiopicChronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology9.weekOfWeekyear();
        org.joda.time.DurationField durationField16 = ethiopicChronology9.days();
        boolean boolean17 = ethiopicChronology6.equals((java.lang.Object) ethiopicChronology9);
        org.joda.time.DateTimeZone dateTimeZone18 = ethiopicChronology9.getZone();
        org.joda.time.Chronology chronology19 = ethiopicChronology0.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField21 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology0.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField21", (durationField14.compareTo(durationField21) == 0) == durationField14.equals(durationField21));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.hourOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField6", Math.signum(durationField4.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField4)));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology6 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = ethiopicChronology6.halfdays();
        org.joda.time.DurationField durationField8 = ethiopicChronology6.seconds();
        org.joda.time.DurationField durationField9 = ethiopicChronology6.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField7, and durationField8", !(durationField9.compareTo(durationField7) == 0) || (Math.signum(durationField9.compareTo(durationField8)) == Math.signum(durationField7.compareTo(durationField8))));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long7 = ethiopicChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = ethiopicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = ethiopicChronology3.days();
        boolean boolean11 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology3);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField14 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField8, and durationField10", !(durationField14.compareTo(durationField8) == 0) || (Math.signum(durationField14.compareTo(durationField10)) == Math.signum(durationField8.compareTo(durationField10))));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = ethiopicChronology0.getZone();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField11", (durationField2.compareTo(durationField11) == 0) == durationField2.equals(durationField11));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.eras();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField7", Math.signum(durationField8.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField8)));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = ethiopicChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.chrono.EthiopicChronology ethiopicChronology5 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean7 = ethiopicChronology5.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology5.halfdayOfDay();
        org.joda.time.DurationField durationField9 = ethiopicChronology5.millis();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology5.minuteOfHour();
        org.joda.time.DurationField durationField11 = ethiopicChronology5.years();
        org.joda.time.DateTimeZone dateTimeZone12 = ethiopicChronology5.getZone();
        org.joda.time.Chronology chronology13 = ethiopicChronology0.withZone(dateTimeZone12);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone12);
        org.joda.time.Chronology chronology15 = ethiopicChronology14.withUTC();
        org.joda.time.DurationField durationField16 = ethiopicChronology14.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField9, and durationField11", !(durationField16.compareTo(durationField9) == 0) || (Math.signum(durationField16.compareTo(durationField11)) == Math.signum(durationField9.compareTo(durationField11))));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        java.lang.String str5 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.eras();
        java.lang.String str12 = ethiopicChronology0.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField11", Math.signum(durationField9.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField9)));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = ethiopicChronology0.months();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.eras();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField4", Math.signum(durationField3.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField3)));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.weekyears();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology9.weekyear();
        org.joda.time.DurationField durationField11 = ethiopicChronology9.years();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology9.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology9.hourOfHalfday();
        org.joda.time.DurationField durationField15 = ethiopicChronology9.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology9.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology9.weekyear();
        org.joda.time.DateTimeZone dateTimeZone19 = ethiopicChronology9.getZone();
        org.joda.time.Chronology chronology20 = ethiopicChronology0.withZone(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField11", (durationField8.compareTo(durationField11) == 0) == durationField8.equals(durationField11));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        java.lang.String str8 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.centuryOfEra();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long16 = ethiopicChronology12.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField17 = ethiopicChronology12.years();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology18 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean20 = ethiopicChronology18.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology18.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = ethiopicChronology18.getZone();
        org.joda.time.DateTimeZone dateTimeZone23 = ethiopicChronology18.getZone();
        org.joda.time.Chronology chronology24 = ethiopicChronology12.withZone(dateTimeZone23);
        org.joda.time.Chronology chronology25 = ethiopicChronology0.withZone(dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField17", (durationField5.compareTo(durationField17) == 0) == durationField5.equals(durationField17));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.centuries();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.eras();
        int int9 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField8", Math.signum(durationField7.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField7)));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology3.dayOfYear();
        boolean boolean5 = ethiopicChronology0.equals((java.lang.Object) dateTimeField4);
        org.joda.time.DurationField durationField6 = ethiopicChronology0.eras();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology0.add(readablePeriod7, (long) (short) 10, 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField6", Math.signum(durationField2.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField2)));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.days();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField4, and durationField6", !(durationField11.compareTo(durationField4) == 0) || (Math.signum(durationField11.compareTo(durationField6)) == Math.signum(durationField4.compareTo(durationField6))));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField8", (durationField5.compareTo(durationField8) == 0) == durationField5.equals(durationField8));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean13 = ethiopicChronology11.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology11.halfdayOfDay();
        org.joda.time.DurationField durationField15 = ethiopicChronology11.millis();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology11.minuteOfHour();
        org.joda.time.DurationField durationField17 = ethiopicChronology11.years();
        org.joda.time.DateTimeZone dateTimeZone18 = ethiopicChronology11.getZone();
        org.joda.time.Chronology chronology19 = ethiopicChronology0.withZone(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField17", (durationField5.compareTo(durationField17) == 0) == durationField5.equals(durationField17));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = ethiopicChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField7", Math.signum(durationField6.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField6)));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField4, and durationField5", !(durationField7.compareTo(durationField4) == 0) || (Math.signum(durationField7.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField8", (durationField5.compareTo(durationField8) == 0) == durationField5.equals(durationField8));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField4", (durationField2.compareTo(durationField4) == 0) == durationField2.equals(durationField4));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.weeks();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField5, and durationField7", !(durationField8.compareTo(durationField5) == 0) || (Math.signum(durationField8.compareTo(durationField7)) == Math.signum(durationField5.compareTo(durationField7))));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.hours();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology9.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology9.halfdayOfDay();
        java.lang.String str13 = ethiopicChronology9.toString();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology9.dayOfWeek();
        org.joda.time.DurationField durationField15 = ethiopicChronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology9.secondOfDay();
        boolean boolean17 = ethiopicChronology0.equals((java.lang.Object) dateTimeField16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField15", (durationField2.compareTo(durationField15) == 0) == durationField2.equals(durationField15));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = ethiopicChronology0.getZone();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.weekyears();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology12.era();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology12.hourOfDay();
        boolean boolean16 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField11", (durationField2.compareTo(durationField11) == 0) == durationField2.equals(durationField11));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField5", Math.signum(durationField4.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField4)));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long7 = ethiopicChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = ethiopicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = ethiopicChronology3.days();
        boolean boolean11 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology3);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = ethiopicChronology0.add(readablePeriod12, 1663L, (int) (short) -1);
        org.joda.time.DurationField durationField16 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField8, and durationField10", !(durationField16.compareTo(durationField8) == 0) || (Math.signum(durationField16.compareTo(durationField10)) == Math.signum(durationField8.compareTo(durationField10))));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.year();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.months();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField5, and durationField7", !(durationField8.compareTo(durationField5) == 0) || (Math.signum(durationField8.compareTo(durationField7)) == Math.signum(durationField5.compareTo(durationField7))));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology6 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology6.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology6.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long13 = ethiopicChronology9.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField14 = ethiopicChronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology9.weekOfWeekyear();
        org.joda.time.DurationField durationField16 = ethiopicChronology9.days();
        boolean boolean17 = ethiopicChronology6.equals((java.lang.Object) ethiopicChronology9);
        org.joda.time.DateTimeZone dateTimeZone18 = ethiopicChronology9.getZone();
        org.joda.time.Chronology chronology19 = ethiopicChronology0.withZone(dateTimeZone18);
        org.joda.time.DurationField durationField20 = ethiopicChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = ethiopicChronology0.add(readablePeriod21, 0L, 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField20", (durationField14.compareTo(durationField20) == 0) == durationField14.equals(durationField20));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology8.hourOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology8.weeks();
        boolean boolean12 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology8);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField14 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField5, and durationField7", !(durationField14.compareTo(durationField5) == 0) || (Math.signum(durationField14.compareTo(durationField7)) == Math.signum(durationField5.compareTo(durationField7))));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        java.lang.String str8 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.Chronology chronology11 = ethiopicChronology0.withUTC();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField5, and durationField9", !(durationField12.compareTo(durationField5) == 0) || (Math.signum(durationField12.compareTo(durationField9)) == Math.signum(durationField5.compareTo(durationField9))));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField14 = ethiopicChronology0.eras();
        org.joda.time.DurationField durationField15 = ethiopicChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField14", Math.signum(durationField5.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField5)));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.weekyearOfCentury();
        boolean boolean6 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology2);
        org.joda.time.DurationField durationField7 = ethiopicChronology2.weekyears();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.weekyear();
        org.joda.time.DurationField durationField10 = ethiopicChronology8.years();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology8.secondOfMinute();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology13 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology13.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.Chronology chronology16 = ethiopicChronology13.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology13.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology13.weekyear();
        int int20 = ethiopicChronology13.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology13.monthOfYear();
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology13.yearOfEra();
        org.joda.time.DurationField durationField23 = ethiopicChronology13.seconds();
        org.joda.time.DateTimeField dateTimeField24 = ethiopicChronology13.weekOfWeekyear();
        org.joda.time.DurationField durationField25 = ethiopicChronology13.hours();
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology13.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone27 = ethiopicChronology13.getZone();
        org.joda.time.Chronology chronology28 = ethiopicChronology8.withZone(dateTimeZone27);
        org.joda.time.Chronology chronology29 = ethiopicChronology2.withZone(dateTimeZone27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField10", (durationField7.compareTo(durationField10) == 0) == durationField7.equals(durationField10));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = ethiopicChronology0.getZone();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField11", (durationField2.compareTo(durationField11) == 0) == durationField2.equals(durationField11));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.eras();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField9, and durationField8", !(durationField8.compareTo(durationField9) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField9.compareTo(durationField8))));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withUTC();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField5", Math.signum(durationField2.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField2)));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField5", Math.signum(durationField3.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField3)));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withUTC();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.eras();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology6 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology6.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology6.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long13 = ethiopicChronology9.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField14 = ethiopicChronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology9.weekOfWeekyear();
        org.joda.time.DurationField durationField16 = ethiopicChronology9.days();
        boolean boolean17 = ethiopicChronology6.equals((java.lang.Object) ethiopicChronology9);
        org.joda.time.DateTimeZone dateTimeZone18 = ethiopicChronology9.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology20 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone18, (int) (byte) 1);
        org.joda.time.Chronology chronology21 = ethiopicChronology0.withZone(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField5", Math.signum(durationField2.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField2)));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField5", Math.signum(durationField3.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField3)));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField5, and durationField8", !(durationField9.compareTo(durationField5) == 0) || (Math.signum(durationField9.compareTo(durationField8)) == Math.signum(durationField5.compareTo(durationField8))));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology7.monthOfYear();
        boolean boolean12 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField14 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.minuteOfDay();
        int int16 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField18 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField6, and durationField14", !(durationField18.compareTo(durationField6) == 0) || (Math.signum(durationField18.compareTo(durationField14)) == Math.signum(durationField6.compareTo(durationField14))));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.days();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField3, and durationField5", !(durationField6.compareTo(durationField3) == 0) || (Math.signum(durationField6.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }
}

