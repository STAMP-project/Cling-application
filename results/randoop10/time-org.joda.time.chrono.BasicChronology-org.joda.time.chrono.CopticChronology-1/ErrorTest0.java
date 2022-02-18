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
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField6", Math.signum(durationField1.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField1)));
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0002");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField6", Math.signum(durationField1.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField1)));
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0003");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        org.joda.time.DurationField durationField6 = copticChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField6, and durationField5", !(durationField5.compareTo(durationField6) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField6.compareTo(durationField5))));
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0004");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField6, and durationField5", !(durationField5.compareTo(durationField6) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField6.compareTo(durationField5))));
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0005");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField6", Math.signum(durationField1.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField1)));
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0006");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.centuries();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField1, and durationField2", !(durationField6.compareTo(durationField1) == 0) || (Math.signum(durationField6.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0007");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField7", Math.signum(durationField6.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField6)));
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0008");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology0.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField7", Math.signum(durationField6.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField6)));
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0009");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField7", Math.signum(durationField6.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField6)));
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0010");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField1, and durationField2", !(durationField4.compareTo(durationField1) == 0) || (Math.signum(durationField4.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0011");
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
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology22.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology22.secondOfMinute();
        org.joda.time.DurationField durationField25 = copticChronology22.halfdays();
        org.joda.time.DurationField durationField26 = copticChronology22.months();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology22.halfdayOfDay();
        org.joda.time.DurationField durationField28 = copticChronology22.weekyears();
        java.lang.Object obj29 = null;
        boolean boolean30 = copticChronology22.equals(obj29);
        org.joda.time.DateTimeField dateTimeField31 = copticChronology22.era();
        org.joda.time.DurationField durationField32 = copticChronology22.centuries();
        boolean boolean33 = dateTimeZone6.equals((java.lang.Object) copticChronology22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField28", (durationField5.compareTo(durationField28) == 0) == durationField5.equals(durationField28));
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0012");
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
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = copticChronology10.seconds();
        org.joda.time.DurationField durationField12 = copticChronology10.years();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology14 = copticChronology10.withZone(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone13.isLocalDateTimeGap(localDateTime15);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone13.getName((long) (byte) -1, locale18);
        org.joda.time.Chronology chronology20 = copticChronology0.withZone(dateTimeZone13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField12", (durationField6.compareTo(durationField12) == 0) == durationField6.equals(durationField12));
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0013");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
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
        java.lang.String str23 = dateTimeZone13.getID();
        org.joda.time.Chronology chronology24 = copticChronology0.withZone(dateTimeZone13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField6", Math.signum(durationField1.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField1)));
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0014");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.joda.time.DurationField durationField7 = copticChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField6", Math.signum(durationField7.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField7)));
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0015");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField3 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        org.joda.time.DurationField durationField6 = copticChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField5", Math.signum(durationField3.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField3)));
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0016");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField3, and durationField4", !(durationField8.compareTo(durationField3) == 0) || (Math.signum(durationField8.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0017");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField3, and durationField4", !(durationField8.compareTo(durationField3) == 0) || (Math.signum(durationField8.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0018");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.millis();
        org.joda.time.DurationField durationField4 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField1, and durationField2", !(durationField4.compareTo(durationField1) == 0) || (Math.signum(durationField4.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0019");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField6, and durationField5", !(durationField5.compareTo(durationField6) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField6.compareTo(durationField5))));
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0020");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField11 = copticChronology0.months();
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField1, and durationField11", !(durationField12.compareTo(durationField1) == 0) || (Math.signum(durationField12.compareTo(durationField11)) == Math.signum(durationField1.compareTo(durationField11))));
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0021");
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
        org.joda.time.DurationField durationField14 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField1, and durationField2", !(durationField14.compareTo(durationField1) == 0) || (Math.signum(durationField14.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0022");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField6", Math.signum(durationField1.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField1)));
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0023");
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
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = copticChronology11.seconds();
        org.joda.time.DurationField durationField13 = copticChronology11.years();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology11.yearOfCentury();
        org.joda.time.Chronology chronology15 = copticChronology11.withUTC();
        boolean boolean16 = copticChronology0.equals((java.lang.Object) copticChronology11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField13", (durationField6.compareTo(durationField13) == 0) == durationField6.equals(durationField13));
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0024");
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
        org.joda.time.DurationField durationField11 = copticChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology0.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField11", (durationField5.compareTo(durationField11) == 0) == durationField5.equals(durationField11));
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0025");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField7", Math.signum(durationField6.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField6)));
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0026");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DurationField durationField4 = copticChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField4, and durationField3", !(durationField3.compareTo(durationField4) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField4.compareTo(durationField3))));
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0027");
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
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField10", (durationField2.compareTo(durationField10) == 0) == durationField2.equals(durationField10));
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0028");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        long long9 = copticChronology0.add((long) 100, (long) (-1), 10);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.joda.time.Chronology chronology12 = copticChronology0.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField11", Math.signum(durationField3.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField3)));
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0029");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField3 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField5", Math.signum(durationField3.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField3)));
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0030");
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
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.year();
        org.joda.time.DurationField durationField15 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField1, and durationField2", !(durationField15.compareTo(durationField1) == 0) || (Math.signum(durationField15.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0031");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField8 = copticChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField8, and durationField3", !(durationField3.compareTo(durationField8) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField8.compareTo(durationField3))));
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0032");
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
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField10", (durationField2.compareTo(durationField10) == 0) == durationField2.equals(durationField10));
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0033");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.joda.time.DurationField durationField9 = copticChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField8", Math.signum(durationField6.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField6)));
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0034");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField7", (durationField2.compareTo(durationField7) == 0) == durationField2.equals(durationField7));
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0035");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.Chronology chronology9 = copticChronology0.withZone(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField4", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0036");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField2", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0037");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        long long9 = copticChronology0.add((long) 100, (long) (-1), 10);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField11", Math.signum(durationField3.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField3)));
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0038");
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
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.dayOfYear();
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
        boolean boolean23 = dateTimeZone18.isFixed();
        org.joda.time.Chronology chronology24 = copticChronology0.withZone(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField17", (durationField6.compareTo(durationField17) == 0) == durationField6.equals(durationField17));
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0039");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField3 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField5", Math.signum(durationField3.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField3)));
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0040");
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
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField17 = copticChronology16.seconds();
        org.joda.time.DurationField durationField18 = copticChronology16.years();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology20 = copticChronology16.withZone(dateTimeZone19);
        java.lang.String str22 = dateTimeZone19.getNameKey((long) 1);
        boolean boolean24 = dateTimeZone19.equals((java.lang.Object) (-1.0f));
        int int26 = dateTimeZone19.getOffset((long) 100);
        long long28 = dateTimeZone9.getMillisKeepLocal(dateTimeZone19, (long) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField18", (durationField7.compareTo(durationField18) == 0) == durationField7.equals(durationField18));
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0041");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField7", Math.signum(durationField6.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField6)));
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0042");
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
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.halfdayOfDay();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology13.clockhourOfHalfday();
        org.joda.time.DurationField durationField16 = copticChronology13.eras();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology13.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone18 = copticChronology13.getZone();
        int int20 = dateTimeZone18.getOffset((long) '#');
        org.joda.time.Chronology chronology21 = copticChronology0.withZone(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField16", Math.signum(durationField4.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField4)));
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0043");
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
        org.joda.time.DateTimeField dateTimeField17 = copticChronology7.clockhourOfDay();
        org.joda.time.DurationField durationField18 = copticChronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField1, and durationField2", !(durationField18.compareTo(durationField1) == 0) || (Math.signum(durationField18.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0044");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology6.year();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField10 = copticChronology9.seconds();
        org.joda.time.DurationField durationField11 = copticChronology9.years();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology13 = copticChronology9.withZone(dateTimeZone12);
        java.lang.String str15 = dateTimeZone12.getNameKey((long) 1);
        org.joda.time.Chronology chronology16 = copticChronology6.withZone(dateTimeZone12);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField18 = copticChronology17.seconds();
        org.joda.time.DurationField durationField19 = copticChronology17.years();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology21 = copticChronology17.withZone(dateTimeZone20);
        java.lang.String str23 = dateTimeZone20.getNameKey((long) 1);
        int int25 = dateTimeZone20.getStandardOffset((long) (short) 0);
        long long27 = dateTimeZone12.getMillisKeepLocal(dateTimeZone20, (long) (short) 10);
        long long30 = dateTimeZone20.adjustOffset((-82799999L), true);
        org.joda.time.Chronology chronology31 = copticChronology0.withZone(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField10", Math.signum(durationField5.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField5)));
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0045");
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
        org.joda.time.DateTimeField dateTimeField28 = chronology27.secondOfMinute();
        org.joda.time.DurationField durationField29 = chronology27.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField29, durationField2, and durationField11", !(durationField29.compareTo(durationField2) == 0) || (Math.signum(durationField29.compareTo(durationField11)) == Math.signum(durationField2.compareTo(durationField11))));
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0046");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField8 = copticChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField8, and durationField3", !(durationField3.compareTo(durationField8) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField8.compareTo(durationField3))));
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0047");
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
        org.joda.time.DurationField durationField17 = copticChronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField1, and durationField2", !(durationField17.compareTo(durationField1) == 0) || (Math.signum(durationField17.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0048");
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
        org.joda.time.DurationField durationField13 = copticChronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField1, and durationField2", !(durationField13.compareTo(durationField1) == 0) || (Math.signum(durationField13.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0049");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DurationField durationField4 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField1, and durationField2", !(durationField4.compareTo(durationField1) == 0) || (Math.signum(durationField4.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0050");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField2", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0051");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField8", (durationField2.compareTo(durationField8) == 0) == durationField2.equals(durationField8));
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0052");
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
        org.joda.time.DurationField durationField11 = copticChronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField1, and durationField2", !(durationField11.compareTo(durationField1) == 0) || (Math.signum(durationField11.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0053");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        java.lang.String str6 = copticChronology0.toString();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField3, and durationField5", !(durationField7.compareTo(durationField3) == 0) || (Math.signum(durationField7.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0054");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DurationField durationField7 = copticChronology0.years();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField9 = copticChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField8", (durationField7.compareTo(durationField8) == 0) == durationField7.equals(durationField8));
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0055");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.millisOfSecond();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField1, and durationField2", !(durationField6.compareTo(durationField1) == 0) || (Math.signum(durationField6.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0056");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology4.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology4.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Chronology chronology8 = copticChronology4.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology4.year();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology4.getZone();
        long long14 = dateTimeZone10.convertLocalToUTC(100L, false, 1L);
        java.lang.String str15 = dateTimeZone10.getID();
        int int17 = dateTimeZone10.getOffsetFromLocal((long) (short) 10);
        boolean boolean18 = dateTimeZone10.isFixed();
        int int20 = dateTimeZone10.getOffset(1L);
        org.joda.time.Chronology chronology21 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField22 = chronology21.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField22, and durationField3", !(durationField3.compareTo(durationField22) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField22.compareTo(durationField3))));
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0057");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField1, and durationField2", !(durationField6.compareTo(durationField1) == 0) || (Math.signum(durationField6.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0058");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField6", (durationField2.compareTo(durationField6) == 0) == durationField2.equals(durationField6));
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0059");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField2", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0060");
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
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField21 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField22 = copticChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField21", (durationField16.compareTo(durationField21) == 0) == durationField16.equals(durationField21));
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0061");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DurationField durationField4 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField2", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0062");
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
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = copticChronology11.seconds();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = copticChronology11.add(readablePeriod13, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = copticChronology11.add(readablePeriod17, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology11.monthOfYear();
        org.joda.time.DurationField durationField22 = copticChronology11.months();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = copticChronology11.add(readablePeriod23, 90L, 100);
        org.joda.time.DurationField durationField27 = copticChronology11.seconds();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology11.halfdayOfDay();
        boolean boolean29 = copticChronology7.equals((java.lang.Object) dateTimeField28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField10", (durationField2.compareTo(durationField10) == 0) == durationField2.equals(durationField10));
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0063");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.era();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField1, and durationField2", !(durationField6.compareTo(durationField1) == 0) || (Math.signum(durationField6.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0064");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DurationField durationField4 = copticChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField3", Math.signum(durationField1.compareTo(durationField3)) == -Math.signum(durationField3.compareTo(durationField1)));
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0065");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField2", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0066");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.hourOfHalfday();
        org.joda.time.DurationField durationField10 = copticChronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField2", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0067");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField8", Math.signum(durationField6.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField6)));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0068");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField6 = copticChronology0.millis();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField6", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField6)) == Math.signum(durationField1.compareTo(durationField6))));
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0069");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.eras();
        org.joda.time.DurationField durationField5 = copticChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField4", Math.signum(durationField3.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField3)));
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0070");
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
        org.joda.time.DurationField durationField12 = copticChronology0.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField12, and durationField11", !(durationField11.compareTo(durationField12) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField12.compareTo(durationField11))));
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0071");
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
        org.joda.time.DurationField durationField13 = copticChronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField1, and durationField2", !(durationField13.compareTo(durationField1) == 0) || (Math.signum(durationField13.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0072");
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
        org.joda.time.DurationField durationField11 = copticChronology0.weekyears();
        long long15 = copticChronology0.add(36000035L, 0L, 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField11", (durationField5.compareTo(durationField11) == 0) == durationField5.equals(durationField11));
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0073");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField6", (durationField2.compareTo(durationField6) == 0) == durationField2.equals(durationField6));
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0074");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField2", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0075");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.Chronology chronology4 = copticChronology0.withUTC();
        org.joda.time.Chronology chronology5 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField6 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField1, and durationField2", !(durationField6.compareTo(durationField1) == 0) || (Math.signum(durationField6.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0076");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) 1, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.hours();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField2, and durationField8", !(durationField9.compareTo(durationField2) == 0) || (Math.signum(durationField9.compareTo(durationField8)) == Math.signum(durationField2.compareTo(durationField8))));
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0077");
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
        org.joda.time.DurationField durationField16 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField16", Math.signum(durationField1.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField1)));
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0078");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.Chronology chronology2 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField7", Math.signum(durationField3.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField3)));
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0079");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DurationField durationField6 = copticChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField6, and durationField3", !(durationField3.compareTo(durationField6) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField6.compareTo(durationField3))));
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0080");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField3, and durationField4", !(durationField9.compareTo(durationField3) == 0) || (Math.signum(durationField9.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0081");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.days();
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
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField19 = copticChronology18.seconds();
        org.joda.time.DurationField durationField20 = copticChronology18.years();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology22 = copticChronology18.withZone(dateTimeZone21);
        java.lang.String str24 = dateTimeZone21.getNameKey((long) 1);
        int int26 = dateTimeZone21.getStandardOffset((long) (short) 0);
        long long28 = dateTimeZone13.getMillisKeepLocal(dateTimeZone21, (long) (short) 10);
        int int30 = dateTimeZone13.getStandardOffset((long) (byte) 100);
        org.joda.time.Chronology chronology31 = copticChronology0.withZone(dateTimeZone13);
        org.joda.time.DurationField durationField32 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField32, durationField6, and durationField11", !(durationField32.compareTo(durationField6) == 0) || (Math.signum(durationField32.compareTo(durationField11)) == Math.signum(durationField6.compareTo(durationField11))));
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0082");
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
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.year();
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField6, and durationField9", !(durationField12.compareTo(durationField6) == 0) || (Math.signum(durationField12.compareTo(durationField9)) == Math.signum(durationField6.compareTo(durationField9))));
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0083");
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
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField4", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0084");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField6", Math.signum(durationField1.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField1)));
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0085");
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
        long long27 = dateTimeZone18.convertUTCToLocal((long) (short) -1);
        java.lang.String str28 = dateTimeZone18.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = dateTimeZone18.isLocalDateTimeGap(localDateTime30);
        org.joda.time.Chronology chronology32 = copticChronology0.withZone(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField17", (durationField9.compareTo(durationField17) == 0) == durationField9.equals(durationField17));
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0086");
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
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField16 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField16", Math.signum(durationField1.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField1)));
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0087");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField2", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0088");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.joda.time.DurationField durationField9 = copticChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField8", Math.signum(durationField9.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField9)));
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0089");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.year();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField10 = copticChronology9.days();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology9.minuteOfHour();
        org.joda.time.DurationField durationField13 = copticChronology9.seconds();
        boolean boolean14 = copticChronology0.equals((java.lang.Object) copticChronology9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField13", (durationField1.compareTo(durationField13) == 0) == durationField1.equals(durationField13));
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0090");
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
        org.joda.time.DurationField durationField14 = copticChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField13", (durationField6.compareTo(durationField13) == 0) == durationField6.equals(durationField13));
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0091");
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
        org.joda.time.DurationField durationField11 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField12 = copticChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField11", (durationField5.compareTo(durationField11) == 0) == durationField5.equals(durationField11));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0092");
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
        org.joda.time.DurationField durationField31 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField3, and durationField5", !(durationField31.compareTo(durationField3) == 0) || (Math.signum(durationField31.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0093");
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
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField2", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0094");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = copticChronology8.seconds();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology8.add(readablePeriod10, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology8.clockhourOfHalfday();
        org.joda.time.DurationField durationField15 = copticChronology8.minutes();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = copticChronology8.add(readablePeriod16, 5L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField20 = copticChronology8.minuteOfHour();
        boolean boolean21 = copticChronology0.equals((java.lang.Object) copticChronology8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField9", Math.signum(durationField3.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField3)));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0095");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField8", Math.signum(durationField6.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField6)));
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0096");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.years();
        org.joda.time.DurationField durationField4 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField1, and durationField2", !(durationField4.compareTo(durationField1) == 0) || (Math.signum(durationField4.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0097");
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
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.clockhourOfHalfday();
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
        java.lang.String str35 = dateTimeZone18.getNameKey((long) (-1));
        long long38 = dateTimeZone18.convertLocalToUTC(210L, true);
        org.joda.time.Chronology chronology39 = copticChronology0.withZone(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField17", (durationField6.compareTo(durationField17) == 0) == durationField6.equals(durationField17));
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0098");
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
        org.joda.time.DateTimeField dateTimeField14 = chronology12.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField13", (durationField6.compareTo(durationField13) == 0) == durationField6.equals(durationField13));
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0099");
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
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField21 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField22 = copticChronology0.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField21", (durationField22.compareTo(durationField21) == 0) == durationField22.equals(durationField21));
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0100");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DurationField durationField4 = copticChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField4, and durationField3", !(durationField3.compareTo(durationField4) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField4.compareTo(durationField3))));
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0101");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.centuries();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField8 = copticChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField7", (durationField2.compareTo(durationField7) == 0) == durationField2.equals(durationField7));
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0102");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField4", Math.signum(durationField3.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField3)));
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0103");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField6 = copticChronology0.millis();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.joda.time.DurationField durationField8 = copticChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField7", Math.signum(durationField6.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField6)));
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0104");
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
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField15", Math.signum(durationField1.compareTo(durationField15)) == -Math.signum(durationField15.compareTo(durationField1)));
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0105");
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
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField16 = copticChronology0.eras();
        org.joda.time.DurationField durationField17 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField17", Math.signum(durationField1.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField1)));
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0106");
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
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = copticChronology0.add(readablePeriod11, 52L, 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField10", (durationField7.compareTo(durationField10) == 0) == durationField7.equals(durationField10));
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0107");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField1, and durationField5", !(durationField6.compareTo(durationField1) == 0) || (Math.signum(durationField6.compareTo(durationField5)) == Math.signum(durationField1.compareTo(durationField5))));
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0108");
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
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField16 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField6, and durationField8", !(durationField16.compareTo(durationField6) == 0) || (Math.signum(durationField16.compareTo(durationField8)) == Math.signum(durationField6.compareTo(durationField8))));
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0109");
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
        org.joda.time.DurationField durationField16 = chronology15.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField1, and durationField7", !(durationField16.compareTo(durationField1) == 0) || (Math.signum(durationField16.compareTo(durationField7)) == Math.signum(durationField1.compareTo(durationField7))));
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0110");
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
        org.joda.time.DurationField durationField11 = copticChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField10", (durationField7.compareTo(durationField10) == 0) == durationField7.equals(durationField10));
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0111");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField3", Math.signum(durationField4.compareTo(durationField3)) == -Math.signum(durationField3.compareTo(durationField4)));
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0112");
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
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField19 = copticChronology0.eras();
        org.joda.time.DurationField durationField20 = copticChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField16 and durationField19", Math.signum(durationField16.compareTo(durationField19)) == -Math.signum(durationField19.compareTo(durationField16)));
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0113");
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
        org.joda.time.DurationField durationField30 = copticChronology0.hours();
        org.joda.time.DurationField durationField31 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField2, and durationField11", !(durationField31.compareTo(durationField2) == 0) || (Math.signum(durationField31.compareTo(durationField11)) == Math.signum(durationField2.compareTo(durationField11))));
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0114");
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
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField21 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology0.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField21", (durationField16.compareTo(durationField21) == 0) == durationField16.equals(durationField21));
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0115");
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
        org.joda.time.DurationField durationField11 = copticChronology0.years();
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField3, and durationField4", !(durationField12.compareTo(durationField3) == 0) || (Math.signum(durationField12.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0116");
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
        int int10 = copticChronology0.getMinimumDaysInFirstWeek();
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
        long long24 = dateTimeZone17.convertLocalToUTC((long) 0, true);
        long long26 = dateTimeZone17.convertUTCToLocal((long) (short) -1);
        int int28 = dateTimeZone17.getOffsetFromLocal((-1L));
        int int30 = dateTimeZone17.getOffsetFromLocal(3600001L);
        long long32 = dateTimeZone17.convertUTCToLocal((-189299900L));
        org.joda.time.Chronology chronology33 = copticChronology0.withZone(dateTimeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField16", (durationField6.compareTo(durationField16) == 0) == durationField6.equals(durationField16));
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0117");
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
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField1, and durationField9", !(durationField13.compareTo(durationField1) == 0) || (Math.signum(durationField13.compareTo(durationField9)) == Math.signum(durationField1.compareTo(durationField9))));
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0118");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.joda.time.DurationField durationField9 = copticChronology0.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField9, and durationField8", !(durationField8.compareTo(durationField9) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField9.compareTo(durationField8))));
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0119");
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
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = copticChronology10.seconds();
        org.joda.time.DurationField durationField12 = copticChronology10.years();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology14 = copticChronology10.withZone(dateTimeZone13);
        java.lang.String str16 = dateTimeZone13.getNameKey((long) 1);
        int int18 = dateTimeZone13.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        boolean boolean21 = dateTimeZone13.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology22.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone24 = copticChronology22.getZone();
        boolean boolean25 = dateTimeZone13.equals((java.lang.Object) copticChronology22);
        boolean boolean26 = copticChronology0.equals((java.lang.Object) boolean25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField12", (durationField6.compareTo(durationField12) == 0) == durationField6.equals(durationField12));
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0120");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField3 = copticChronology0.minutes();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField3, and durationField4", !(durationField5.compareTo(durationField3) == 0) || (Math.signum(durationField5.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0121");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField4 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        int int6 = copticChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField5", Math.signum(durationField4.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField4)));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0122");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DurationField durationField9 = copticChronology8.weekyears();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology8.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField9", (durationField2.compareTo(durationField9) == 0) == durationField2.equals(durationField9));
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0123");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField8 = copticChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField8, and durationField3", !(durationField3.compareTo(durationField8) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField8.compareTo(durationField3))));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0124");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        java.lang.String str4 = dateTimeZone2.getNameKey((long) ' ');
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = copticChronology5.seconds();
        org.joda.time.DurationField durationField7 = copticChronology5.years();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology9 = copticChronology5.withZone(dateTimeZone8);
        int int11 = dateTimeZone8.getOffset((long) 0);
        int int13 = dateTimeZone8.getOffset((long) (byte) 1);
        boolean boolean14 = dateTimeZone2.equals((java.lang.Object) dateTimeZone8);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone8.getOffset(readableInstant15);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone8.getShortName(1L, locale18);
        boolean boolean20 = dateTimeZone8.isFixed();
        long long23 = dateTimeZone8.convertLocalToUTC(1L, false);
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology24.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology24.secondOfMinute();
        org.joda.time.DurationField durationField27 = copticChronology24.halfdays();
        org.joda.time.DurationField durationField28 = copticChronology24.months();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology24.halfdayOfDay();
        org.joda.time.DurationField durationField30 = copticChronology24.weekyears();
        java.lang.Object obj31 = null;
        boolean boolean32 = copticChronology24.equals(obj31);
        org.joda.time.DateTimeField dateTimeField33 = copticChronology24.era();
        org.joda.time.Chronology chronology34 = copticChronology24.withUTC();
        org.joda.time.DateTimeZone dateTimeZone35 = copticChronology24.getZone();
        org.joda.time.chrono.CopticChronology copticChronology36 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField37 = copticChronology36.seconds();
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        long long41 = copticChronology36.add(readablePeriod38, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        long long45 = copticChronology36.add(readablePeriod42, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField46 = copticChronology36.monthOfYear();
        org.joda.time.DurationField durationField47 = copticChronology36.months();
        org.joda.time.DurationField durationField48 = copticChronology36.months();
        org.joda.time.DurationField durationField49 = copticChronology36.days();
        boolean boolean50 = dateTimeZone35.equals((java.lang.Object) durationField49);
        long long54 = dateTimeZone35.convertLocalToUTC(360000000L, false, 0L);
        long long56 = dateTimeZone8.getMillisKeepLocal(dateTimeZone35, (-8279999925L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField30", (durationField7.compareTo(durationField30) == 0) == durationField7.equals(durationField30));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0125");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.era();
        org.joda.time.DurationField durationField6 = copticChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField6, and durationField3", !(durationField3.compareTo(durationField6) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField6.compareTo(durationField3))));
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0126");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.String str7 = copticChronology0.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField6", (durationField2.compareTo(durationField6) == 0) == durationField2.equals(durationField6));
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0127");
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
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField19 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField16 and durationField19", Math.signum(durationField16.compareTo(durationField19)) == -Math.signum(durationField19.compareTo(durationField16)));
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0128");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.halfdayOfDay();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField14 = copticChronology13.seconds();
        org.joda.time.DurationField durationField15 = copticChronology13.millis();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology13.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology13.minuteOfDay();
        org.joda.time.DurationField durationField18 = copticChronology13.seconds();
        org.joda.time.DateTimeZone dateTimeZone19 = copticChronology13.getZone();
        org.joda.time.Chronology chronology20 = copticChronology0.withZone(dateTimeZone19);
        org.joda.time.DurationField durationField21 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField1, and durationField11", !(durationField21.compareTo(durationField1) == 0) || (Math.signum(durationField21.compareTo(durationField11)) == Math.signum(durationField1.compareTo(durationField11))));
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0129");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean10 = dateTimeZone9.isFixed();
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
        long long24 = dateTimeZone17.convertLocalToUTC((long) 0, true);
        boolean boolean26 = dateTimeZone17.isStandardOffset((long) (short) 1);
        long long28 = dateTimeZone9.getMillisKeepLocal(dateTimeZone17, 35L);
        org.joda.time.Chronology chronology29 = copticChronology0.withZone(dateTimeZone9);
        java.lang.String str31 = dateTimeZone9.getName(32L);
        boolean boolean33 = dateTimeZone9.isStandardOffset((long) '4');
        org.joda.time.chrono.CopticChronology copticChronology34 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField35 = copticChronology34.days();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology34.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology37 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField38 = copticChronology37.seconds();
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        long long42 = copticChronology37.add(readablePeriod39, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField43 = copticChronology37.secondOfDay();
        org.joda.time.DurationField durationField44 = copticChronology37.weekyears();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forID("+00:00");
        java.lang.String str47 = dateTimeZone46.getID();
        boolean boolean48 = dateTimeZone46.isFixed();
        java.util.Locale locale50 = null;
        java.lang.String str51 = dateTimeZone46.getShortName((long) (-1), locale50);
        org.joda.time.Chronology chronology52 = copticChronology37.withZone(dateTimeZone46);
        org.joda.time.DateTimeZone dateTimeZone53 = copticChronology37.getZone();
        org.joda.time.Chronology chronology54 = copticChronology34.withZone(dateTimeZone53);
        long long56 = dateTimeZone9.getMillisKeepLocal(dateTimeZone53, 7238L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField44", (durationField16.compareTo(durationField44) == 0) == durationField16.equals(durationField44));
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0130");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField8 = copticChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField7", (durationField2.compareTo(durationField7) == 0) == durationField2.equals(durationField7));
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0131");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField6", (durationField2.compareTo(durationField6) == 0) == durationField2.equals(durationField6));
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0132");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.eras();
        org.joda.time.DurationField durationField5 = copticChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField4", Math.signum(durationField3.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField3)));
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0133");
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
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField19 = copticChronology0.eras();
        long long24 = copticChronology0.getDateTimeMillis((int) (byte) 1, (int) (byte) 10, (int) (byte) 1, 3600000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField16 and durationField19", Math.signum(durationField16.compareTo(durationField19)) == -Math.signum(durationField19.compareTo(durationField16)));
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0134");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField8", Math.signum(durationField6.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField6)));
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0135");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField3 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField5 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.year();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField5", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0136");
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
        org.joda.time.Chronology chronology15 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField17 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField6, and durationField7", !(durationField17.compareTo(durationField6) == 0) || (Math.signum(durationField17.compareTo(durationField7)) == Math.signum(durationField6.compareTo(durationField7))));
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0137");
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
        int int21 = dateTimeZone19.getOffsetFromLocal((-52876886399965L));
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology22.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology22.secondOfMinute();
        org.joda.time.DurationField durationField25 = copticChronology22.halfdays();
        org.joda.time.DurationField durationField26 = copticChronology22.months();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology22.halfdayOfDay();
        org.joda.time.DurationField durationField28 = copticChronology22.weekyears();
        java.lang.Object obj29 = null;
        boolean boolean30 = copticChronology22.equals(obj29);
        org.joda.time.DateTimeField dateTimeField31 = copticChronology22.era();
        org.joda.time.DurationField durationField32 = copticChronology22.centuries();
        org.joda.time.DurationField durationField33 = copticChronology22.millis();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology22.minuteOfHour();
        boolean boolean35 = dateTimeZone19.equals((java.lang.Object) copticChronology22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField28", (durationField2.compareTo(durationField28) == 0) == durationField2.equals(durationField28));
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0138");
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
        org.joda.time.DurationField durationField42 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField42, durationField1, and durationField2", !(durationField42.compareTo(durationField1) == 0) || (Math.signum(durationField42.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0139");
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
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField16 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField18 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField1, and durationField16", !(durationField18.compareTo(durationField1) == 0) || (Math.signum(durationField18.compareTo(durationField16)) == Math.signum(durationField1.compareTo(durationField16))));
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0140");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField6 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField6", (durationField4.compareTo(durationField6) == 0) == durationField4.equals(durationField6));
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0141");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DurationField durationField4 = copticChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField4, and durationField3", !(durationField3.compareTo(durationField4) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField4.compareTo(durationField3))));
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0142");
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
        org.joda.time.DurationField durationField17 = copticChronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField1, and durationField2", !(durationField17.compareTo(durationField1) == 0) || (Math.signum(durationField17.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0143");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.millis();
        org.joda.time.DurationField durationField3 = copticChronology0.hours();
        org.joda.time.DurationField durationField4 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField1, and durationField2", !(durationField4.compareTo(durationField1) == 0) || (Math.signum(durationField4.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0144");
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
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField12 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField13 = copticChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField12", (durationField7.compareTo(durationField12) == 0) == durationField7.equals(durationField12));
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0145");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField5, and durationField3", !(durationField3.compareTo(durationField5) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField5.compareTo(durationField3))));
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0146");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField9 = copticChronology0.centuries();
        org.joda.time.DurationField durationField10 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField6, and durationField9", !(durationField11.compareTo(durationField6) == 0) || (Math.signum(durationField11.compareTo(durationField9)) == Math.signum(durationField6.compareTo(durationField9))));
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0147");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DurationField durationField9 = copticChronology8.weekyears();
        org.joda.time.DurationField durationField10 = copticChronology8.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField9", (durationField2.compareTo(durationField9) == 0) == durationField2.equals(durationField9));
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0148");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField8, and durationField3", !(durationField3.compareTo(durationField8) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField8.compareTo(durationField3))));
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0149");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.centuries();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField7", (durationField2.compareTo(durationField7) == 0) == durationField2.equals(durationField7));
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0150");
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
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology19.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology19.secondOfMinute();
        org.joda.time.DurationField durationField22 = copticChronology19.halfdays();
        int int23 = copticChronology19.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology19.weekyearOfCentury();
        org.joda.time.DurationField durationField25 = copticChronology19.months();
        org.joda.time.DurationField durationField26 = copticChronology19.years();
        org.joda.time.DurationField durationField27 = copticChronology19.weeks();
        org.joda.time.Chronology chronology28 = copticChronology19.withUTC();
        boolean boolean29 = copticChronology8.equals((java.lang.Object) copticChronology19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField25", (durationField11.compareTo(durationField25) == 0) == durationField11.equals(durationField25));
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0151");
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
        org.joda.time.DateTimeField dateTimeField17 = copticChronology8.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology8.dayOfWeek();
        org.joda.time.DurationField durationField20 = copticChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology8.weekyear();
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology22.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology22.secondOfMinute();
        org.joda.time.DurationField durationField25 = copticChronology22.weeks();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology22.millisOfSecond();
        org.joda.time.DurationField durationField27 = copticChronology22.months();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long32 = dateTimeZone29.convertLocalToUTC(0L, false);
        java.lang.String str34 = dateTimeZone29.getNameKey(99L);
        java.lang.String str36 = dateTimeZone29.getShortName(97L);
        org.joda.time.ReadableInstant readableInstant37 = null;
        int int38 = dateTimeZone29.getOffset(readableInstant37);
        java.lang.String str39 = dateTimeZone29.toString();
        org.joda.time.LocalDateTime localDateTime40 = null;
        boolean boolean41 = dateTimeZone29.isLocalDateTimeGap(localDateTime40);
        org.joda.time.Chronology chronology42 = copticChronology22.withZone(dateTimeZone29);
        org.joda.time.Chronology chronology43 = copticChronology8.withZone(dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField27", (durationField15.compareTo(durationField27) == 0) == durationField15.equals(durationField27));
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0152");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField4", Math.signum(durationField3.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField3)));
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0153");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone3.getShortName((long) ' ', locale5);
        org.joda.time.Chronology chronology7 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField9 = copticChronology0.months();
        org.joda.time.DurationField durationField10 = copticChronology0.millis();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField9, and durationField10", !(durationField11.compareTo(durationField9) == 0) || (Math.signum(durationField11.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0154");
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
        org.joda.time.DurationField durationField38 = chronology37.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField21", (durationField10.compareTo(durationField21) == 0) == durationField10.equals(durationField21));
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0155");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DurationField durationField3 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField3", (durationField2.compareTo(durationField3) == 0) == durationField2.equals(durationField3));
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0156");
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
        org.joda.time.DurationField durationField15 = copticChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField14", Math.signum(durationField13.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField13)));
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0157");
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
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField14 = copticChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField14, and durationField3", !(durationField3.compareTo(durationField14) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField14.compareTo(durationField3))));
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0158");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        long long9 = copticChronology0.add((long) 100, (long) (-1), 10);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.joda.time.DurationField durationField12 = copticChronology0.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField11", Math.signum(durationField3.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField3)));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0159");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DurationField durationField4 = copticChronology0.weeks();
        org.joda.time.DurationField durationField5 = copticChronology0.weeks();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField1, and durationField2", !(durationField6.compareTo(durationField1) == 0) || (Math.signum(durationField6.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0160");
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
        org.joda.time.DurationField durationField36 = chronology35.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField36, durationField3, and durationField11", !(durationField36.compareTo(durationField3) == 0) || (Math.signum(durationField36.compareTo(durationField11)) == Math.signum(durationField3.compareTo(durationField11))));
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0161");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.era();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField6", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0162");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology7.getZone();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField12 = copticChronology7.halfdays();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.dayOfMonth();
        boolean boolean15 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField6", (durationField2.compareTo(durationField6) == 0) == durationField2.equals(durationField6));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0163");
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
        org.joda.time.DurationField durationField13 = chronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField5", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0164");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField7, and durationField3", !(durationField3.compareTo(durationField7) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField7.compareTo(durationField3))));
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0165");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology0.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField7", Math.signum(durationField3.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField3)));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0166");
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
        org.joda.time.DurationField durationField14 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField3, and durationField4", !(durationField14.compareTo(durationField3) == 0) || (Math.signum(durationField14.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0167");
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
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField11 = copticChronology0.weeks();
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField3, and durationField8", !(durationField12.compareTo(durationField3) == 0) || (Math.signum(durationField12.compareTo(durationField8)) == Math.signum(durationField3.compareTo(durationField8))));
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0168");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField13 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField14 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField1, and durationField11", !(durationField14.compareTo(durationField1) == 0) || (Math.signum(durationField14.compareTo(durationField11)) == Math.signum(durationField1.compareTo(durationField11))));
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0169");
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
        org.joda.time.DurationField durationField17 = copticChronology7.days();
        org.joda.time.DurationField durationField18 = copticChronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField1, and durationField2", !(durationField18.compareTo(durationField1) == 0) || (Math.signum(durationField18.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0170");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = copticChronology0.minutes();
        org.joda.time.DurationField durationField7 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField6, and durationField7", !(durationField12.compareTo(durationField6) == 0) || (Math.signum(durationField12.compareTo(durationField7)) == Math.signum(durationField6.compareTo(durationField7))));
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0171");
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
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField10", (durationField2.compareTo(durationField10) == 0) == durationField2.equals(durationField10));
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0172");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.year();
        org.joda.time.DurationField durationField8 = copticChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField8, and durationField3", !(durationField3.compareTo(durationField8) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField8.compareTo(durationField3))));
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0173");
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
        org.joda.time.DurationField durationField11 = copticChronology7.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField10", (durationField2.compareTo(durationField10) == 0) == durationField2.equals(durationField10));
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0174");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DurationField durationField4 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.halfdays();
        long long12 = copticChronology0.add((long) 10, (long) '4', (-3600000));
        org.joda.time.Chronology chronology13 = copticChronology0.withUTC();
        org.joda.time.Chronology chronology14 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField15 = copticChronology0.weeks();
        org.joda.time.DurationField durationField16 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField18 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField1, and durationField2", !(durationField18.compareTo(durationField1) == 0) || (Math.signum(durationField18.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0175");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField8", Math.signum(durationField3.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField3)));
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0176");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField7", (durationField2.compareTo(durationField7) == 0) == durationField2.equals(durationField7));
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0177");
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
        int int23 = dateTimeZone6.getStandardOffset((long) (byte) 100);
        long long26 = dateTimeZone6.convertLocalToUTC((long) (byte) 0, true);
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone6.getShortName(999L, locale28);
        long long33 = dateTimeZone6.convertLocalToUTC(0L, false, (long) (byte) 0);
        long long35 = dateTimeZone6.convertUTCToLocal((long) 10);
        org.joda.time.chrono.CopticChronology copticChronology36 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology36.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology36.secondOfMinute();
        org.joda.time.DurationField durationField39 = copticChronology36.halfdays();
        org.joda.time.DurationField durationField40 = copticChronology36.months();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology36.halfdayOfDay();
        org.joda.time.DurationField durationField42 = copticChronology36.weekyears();
        java.lang.Object obj43 = null;
        boolean boolean44 = copticChronology36.equals(obj43);
        org.joda.time.DateTimeField dateTimeField45 = copticChronology36.era();
        org.joda.time.DurationField durationField46 = copticChronology36.centuries();
        org.joda.time.DurationField durationField47 = copticChronology36.millis();
        org.joda.time.Chronology chronology48 = copticChronology36.withUTC();
        boolean boolean49 = dateTimeZone6.equals((java.lang.Object) copticChronology36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField42", (durationField5.compareTo(durationField42) == 0) == durationField5.equals(durationField42));
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0178");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.DurationField durationField3 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.DurationField durationField5 = copticChronology0.millis();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField3, and durationField5", !(durationField6.compareTo(durationField3) == 0) || (Math.signum(durationField6.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0179");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField7 = copticChronology0.seconds();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField2", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0180");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.weekyearOfCentury();
        org.joda.time.DurationField durationField11 = copticChronology7.seconds();
        org.joda.time.DurationField durationField12 = copticChronology7.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField11", (durationField1.compareTo(durationField11) == 0) == durationField1.equals(durationField11));
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0181");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.era();
        java.lang.String str4 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.joda.time.DurationField durationField7 = copticChronology0.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField6", Math.signum(durationField1.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField1)));
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0182");
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
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField12 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField12", (durationField7.compareTo(durationField12) == 0) == durationField7.equals(durationField12));
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0183");
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
        org.joda.time.DurationField durationField27 = copticChronology22.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField4, and durationField5", !(durationField27.compareTo(durationField4) == 0) || (Math.signum(durationField27.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0184");
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
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField12 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField12", (durationField7.compareTo(durationField12) == 0) == durationField7.equals(durationField12));
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0185");
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
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField10", (durationField2.compareTo(durationField10) == 0) == durationField2.equals(durationField10));
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0186");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekyear();
        java.lang.String str3 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField7 = copticChronology6.seconds();
        org.joda.time.DurationField durationField8 = copticChronology6.years();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology6.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology6.millisOfDay();
        org.joda.time.DurationField durationField11 = copticChronology6.centuries();
        org.joda.time.DurationField durationField12 = copticChronology6.days();
        boolean boolean13 = copticChronology0.equals((java.lang.Object) durationField12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField8", (durationField5.compareTo(durationField8) == 0) == durationField5.equals(durationField8));
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0187");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.Chronology chronology5 = copticChronology4.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology4.yearOfEra();
        org.joda.time.DurationField durationField7 = copticChronology4.millis();
        boolean boolean8 = copticChronology0.equals((java.lang.Object) durationField7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField7, and durationField3", !(durationField3.compareTo(durationField7) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField7.compareTo(durationField3))));
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0188");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField3, and durationField4", !(durationField9.compareTo(durationField3) == 0) || (Math.signum(durationField9.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0189");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField5 = copticChronology0.minutes();
        org.joda.time.DurationField durationField6 = copticChronology0.years();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField7", (durationField2.compareTo(durationField7) == 0) == durationField2.equals(durationField7));
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0190");
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
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField13", (durationField6.compareTo(durationField13) == 0) == durationField6.equals(durationField13));
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0191");
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
        org.joda.time.DateTimeField dateTimeField19 = copticChronology18.millisOfSecond();
        org.joda.time.DurationField durationField20 = copticChronology18.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField1, and durationField2", !(durationField20.compareTo(durationField1) == 0) || (Math.signum(durationField20.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0192");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        long long8 = copticChronology0.add((long) 4, (long) (short) -1, (int) (byte) -1);
        org.joda.time.DurationField durationField9 = copticChronology0.weekyears();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology10.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology10.secondOfMinute();
        org.joda.time.DurationField durationField13 = copticChronology10.halfdays();
        org.joda.time.DurationField durationField14 = copticChronology10.months();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology10.halfdayOfDay();
        org.joda.time.DurationField durationField16 = copticChronology10.weekyears();
        org.joda.time.DurationField durationField17 = copticChronology10.centuries();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.Chronology chronology19 = copticChronology10.withZone(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = copticChronology10.getZone();
        org.joda.time.Chronology chronology21 = copticChronology0.withZone(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField9", (durationField2.compareTo(durationField9) == 0) == durationField2.equals(durationField9));
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0193");
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
        org.joda.time.DateTimeZone dateTimeZone19 = copticChronology8.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField18", (durationField2.compareTo(durationField18) == 0) == durationField2.equals(durationField18));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0194");
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
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField4", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0195");
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
        org.joda.time.DateTimeZone dateTimeZone19 = copticChronology7.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField18", (durationField2.compareTo(durationField18) == 0) == durationField2.equals(durationField18));
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0196");
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
        org.joda.time.DateTimeField dateTimeField15 = copticChronology8.secondOfDay();
        org.joda.time.DurationField durationField16 = copticChronology8.years();
        org.joda.time.DurationField durationField17 = copticChronology8.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField16", (durationField2.compareTo(durationField16) == 0) == durationField2.equals(durationField16));
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0197");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.centuries();
        org.joda.time.DurationField durationField4 = copticChronology0.eras();
        org.joda.time.DurationField durationField5 = copticChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField4", Math.signum(durationField5.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField5)));
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0198");
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
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField3, and durationField4", !(durationField12.compareTo(durationField3) == 0) || (Math.signum(durationField12.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0199");
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
        org.joda.time.DurationField durationField14 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField3, and durationField4", !(durationField14.compareTo(durationField3) == 0) || (Math.signum(durationField14.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0200");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 52L, (int) 'a');
        org.joda.time.DurationField durationField10 = copticChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField10, and durationField3", !(durationField3.compareTo(durationField10) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField10.compareTo(durationField3))));
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0201");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField5", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0202");
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
        org.joda.time.DurationField durationField37 = copticChronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField16", (durationField1.compareTo(durationField16) == 0) == durationField1.equals(durationField16));
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0203");
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
        org.joda.time.DateTimeField dateTimeField17 = copticChronology7.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField16", (durationField1.compareTo(durationField16) == 0) == durationField1.equals(durationField16));
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0204");
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
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField13 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField13", (durationField6.compareTo(durationField13) == 0) == durationField6.equals(durationField13));
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0205");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField2", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0206");
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
        org.joda.time.DateTimeField dateTimeField37 = copticChronology7.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField16", (durationField1.compareTo(durationField16) == 0) == durationField1.equals(durationField16));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0207");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField1, and durationField2", !(durationField6.compareTo(durationField1) == 0) || (Math.signum(durationField6.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0208");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology4.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology4.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Chronology chronology8 = copticChronology4.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology4.year();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology4.getZone();
        long long14 = dateTimeZone10.convertLocalToUTC(100L, false, 1L);
        java.lang.String str15 = dateTimeZone10.getID();
        int int17 = dateTimeZone10.getOffsetFromLocal((long) (short) 10);
        boolean boolean18 = dateTimeZone10.isFixed();
        int int20 = dateTimeZone10.getOffset(1L);
        org.joda.time.Chronology chronology21 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField22 = copticChronology0.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField22, and durationField3", !(durationField3.compareTo(durationField22) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField22.compareTo(durationField3))));
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0209");
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
        boolean boolean15 = dateTimeZone6.isStandardOffset((long) (short) 1);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone6.getOffset(readableInstant16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone6.getShortName(3600004L, locale19);
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6);
        org.joda.time.DurationField durationField22 = copticChronology21.weekyears();
        org.joda.time.DurationField durationField23 = copticChronology21.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField22", (durationField5.compareTo(durationField22) == 0) == durationField5.equals(durationField22));
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0210");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField15 = copticChronology14.seconds();
        org.joda.time.DurationField durationField16 = copticChronology14.years();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology18 = copticChronology14.withZone(dateTimeZone17);
        java.lang.String str20 = dateTimeZone17.getNameKey((long) 1);
        int int22 = dateTimeZone17.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        int int25 = dateTimeZone17.getOffset((long) (byte) 1);
        boolean boolean27 = dateTimeZone17.isStandardOffset(1L);
        long long31 = dateTimeZone17.convertLocalToUTC(1L, false, (long) (short) 1);
        boolean boolean33 = dateTimeZone17.isStandardOffset((-360000002L));
        org.joda.time.Chronology chronology34 = copticChronology0.withZone(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone35 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField37 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField39 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField39, durationField1, and durationField11", !(durationField39.compareTo(durationField1) == 0) || (Math.signum(durationField39.compareTo(durationField11)) == Math.signum(durationField1.compareTo(durationField11))));
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0211");
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
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology15.secondOfMinute();
        org.joda.time.DurationField durationField18 = copticChronology15.halfdays();
        org.joda.time.DurationField durationField19 = copticChronology15.months();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology15.halfdayOfDay();
        org.joda.time.DurationField durationField21 = copticChronology15.weekyears();
        org.joda.time.DurationField durationField22 = copticChronology15.centuries();
        org.joda.time.DurationField durationField23 = copticChronology15.millis();
        org.joda.time.DateTimeZone dateTimeZone24 = copticChronology15.getZone();
        long long26 = dateTimeZone14.getMillisKeepLocal(dateTimeZone24, 9843603210L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField21", (durationField6.compareTo(durationField21) == 0) == durationField6.equals(durationField21));
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0212");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField1, and durationField2", !(durationField6.compareTo(durationField1) == 0) || (Math.signum(durationField6.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0213");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.year();
        int int5 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField6 = copticChronology0.years();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField6", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField6)) == Math.signum(durationField1.compareTo(durationField6))));
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0214");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.centuries();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField8 = copticChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField7", (durationField2.compareTo(durationField7) == 0) == durationField2.equals(durationField7));
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0215");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology8.yearOfCentury();
        org.joda.time.DurationField durationField12 = copticChronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField1, and durationField2", !(durationField12.compareTo(durationField1) == 0) || (Math.signum(durationField12.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0216");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField8 = copticChronology0.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField8, and durationField3", !(durationField3.compareTo(durationField8) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField8.compareTo(durationField3))));
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0217");
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
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField12", Math.signum(durationField3.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField3)));
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0218");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField5 = copticChronology0.minutes();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField3, and durationField5", !(durationField6.compareTo(durationField3) == 0) || (Math.signum(durationField6.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0219");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DurationField durationField4 = copticChronology0.weeks();
        org.joda.time.DurationField durationField5 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        org.joda.time.DurationField durationField8 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField2", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0220");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfWeek();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology7.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology7.year();
        org.joda.time.DurationField durationField13 = copticChronology7.months();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.weekyearOfCentury();
        org.joda.time.DurationField durationField15 = copticChronology7.minutes();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField17 = copticChronology16.seconds();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = copticChronology16.add(readablePeriod18, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        long long25 = copticChronology16.add(readablePeriod22, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone26 = copticChronology16.getZone();
        long long29 = dateTimeZone26.adjustOffset(10L, true);
        int int31 = dateTimeZone26.getOffsetFromLocal((long) 'a');
        org.joda.time.Chronology chronology32 = copticChronology7.withZone(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField33 = copticChronology7.clockhourOfHalfday();
        boolean boolean34 = copticChronology0.equals((java.lang.Object) dateTimeField33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField13", Math.signum(durationField3.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField3)));
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0221");
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
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0222");
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
        org.joda.time.DurationField durationField12 = copticChronology8.weeks();
        org.joda.time.DurationField durationField13 = copticChronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField1, and durationField2", !(durationField13.compareTo(durationField1) == 0) || (Math.signum(durationField13.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0223");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField5, and durationField3", !(durationField3.compareTo(durationField5) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField5.compareTo(durationField3))));
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0224");
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
        org.joda.time.DurationField durationField10 = copticChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField10, and durationField3", !(durationField3.compareTo(durationField10) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField10.compareTo(durationField3))));
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0225");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField7 = copticChronology0.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField7, and durationField3", !(durationField3.compareTo(durationField7) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField7.compareTo(durationField3))));
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0226");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DurationField durationField4 = copticChronology0.minutes();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField5", Math.signum(durationField4.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField4)));
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0227");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DurationField durationField7 = copticChronology0.years();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.joda.time.Chronology chronology9 = copticChronology0.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField8", (durationField7.compareTo(durationField8) == 0) == durationField7.equals(durationField8));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0228");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = copticChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField7, and durationField3", !(durationField3.compareTo(durationField7) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField7.compareTo(durationField3))));
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0229");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DurationField durationField7 = copticChronology0.years();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology9.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology9.minuteOfDay();
        boolean boolean14 = copticChronology0.equals((java.lang.Object) copticChronology9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField8", (durationField7.compareTo(durationField8) == 0) == durationField7.equals(durationField8));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0230");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.era();
        org.joda.time.DurationField durationField6 = copticChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField6, and durationField3", !(durationField3.compareTo(durationField6) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField6.compareTo(durationField3))));
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0231");
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
        org.joda.time.DurationField durationField15 = copticChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField14", Math.signum(durationField13.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField13)));
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0232");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField7 = copticChronology0.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField7, and durationField3", !(durationField3.compareTo(durationField7) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField7.compareTo(durationField3))));
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0233");
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
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField16 = copticChronology0.eras();
        org.joda.time.DurationField durationField17 = copticChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField16", Math.signum(durationField1.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField1)));
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0234");
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
        org.joda.time.DurationField durationField11 = copticChronology7.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField10", (durationField2.compareTo(durationField10) == 0) == durationField2.equals(durationField10));
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0235");
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
        org.joda.time.DurationField durationField14 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField1, and durationField12", !(durationField14.compareTo(durationField1) == 0) || (Math.signum(durationField14.compareTo(durationField12)) == Math.signum(durationField1.compareTo(durationField12))));
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0236");
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
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField21 = copticChronology0.weekyears();
        org.joda.time.Chronology chronology22 = copticChronology0.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField21", (durationField16.compareTo(durationField21) == 0) == durationField16.equals(durationField21));
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0237");
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
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField21 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology0.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField21", (durationField16.compareTo(durationField21) == 0) == durationField16.equals(durationField21));
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0238");
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
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField12 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField14 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField14", (durationField7.compareTo(durationField14) == 0) == durationField7.equals(durationField14));
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0239");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField1, and durationField4", !(durationField5.compareTo(durationField1) == 0) || (Math.signum(durationField5.compareTo(durationField4)) == Math.signum(durationField1.compareTo(durationField4))));
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0240");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.centuries();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        java.lang.String str8 = copticChronology0.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField7", (durationField2.compareTo(durationField7) == 0) == durationField2.equals(durationField7));
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0241");
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
        org.joda.time.DurationField durationField13 = copticChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField13, and durationField12", !(durationField12.compareTo(durationField13) == 0) || (Math.signum(durationField12.compareTo(durationField12)) == Math.signum(durationField13.compareTo(durationField12))));
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0242");
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
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField20 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField1, and durationField16", !(durationField20.compareTo(durationField1) == 0) || (Math.signum(durationField20.compareTo(durationField16)) == Math.signum(durationField1.compareTo(durationField16))));
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0243");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField4 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology6.secondOfMinute();
        org.joda.time.DurationField durationField9 = copticChronology6.weeks();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology6.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology6.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology6.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = copticChronology6.add(readablePeriod13, (long) 0, (int) (short) -1);
        boolean boolean17 = copticChronology0.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField5", Math.signum(durationField4.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField4)));
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0244");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = copticChronology0.minutes();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = copticChronology0.add(readablePeriod8, 5L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = copticChronology0.add(readablePeriod14, (-241L), 35);
        org.joda.time.DurationField durationField18 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField1, and durationField7", !(durationField18.compareTo(durationField1) == 0) || (Math.signum(durationField18.compareTo(durationField7)) == Math.signum(durationField1.compareTo(durationField7))));
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0245");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology4.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology4.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Chronology chronology8 = copticChronology4.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology4.year();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology4.getZone();
        long long14 = dateTimeZone10.convertLocalToUTC(100L, false, 1L);
        java.lang.String str15 = dateTimeZone10.getID();
        int int17 = dateTimeZone10.getOffsetFromLocal((long) (short) 10);
        boolean boolean18 = dateTimeZone10.isFixed();
        int int20 = dateTimeZone10.getOffset(1L);
        org.joda.time.Chronology chronology21 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField22 = copticChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField22, and durationField3", !(durationField3.compareTo(durationField22) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField22.compareTo(durationField3))));
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0246");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.Chronology chronology9 = copticChronology0.withZone(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField11 = copticChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long15 = dateTimeZone13.nextTransition((long) 3600000);
        long long17 = dateTimeZone13.nextTransition((long) (byte) -1);
        org.joda.time.Chronology chronology18 = copticChronology0.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField20 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField3, and durationField4", !(durationField20.compareTo(durationField3) == 0) || (Math.signum(durationField20.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0247");
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
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField13 = copticChronology0.seconds();
        org.joda.time.Chronology chronology14 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField15 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone16 = copticChronology0.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField15", (durationField6.compareTo(durationField15) == 0) == durationField6.equals(durationField15));
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0248");
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
        org.joda.time.DateTimeField dateTimeField30 = copticChronology7.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField19", (durationField12.compareTo(durationField19) == 0) == durationField12.equals(durationField19));
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0249");
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
        java.lang.String str38 = dateTimeZone36.getNameKey((-360000024L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField16", (durationField1.compareTo(durationField16) == 0) == durationField1.equals(durationField16));
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0250");
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
        org.joda.time.DateTimeField dateTimeField19 = copticChronology7.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField16", (durationField1.compareTo(durationField16) == 0) == durationField1.equals(durationField16));
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0251");
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
        org.joda.time.DurationField durationField11 = copticChronology7.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField10", (durationField2.compareTo(durationField10) == 0) == durationField2.equals(durationField10));
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0252");
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
        org.joda.time.DateTimeField dateTimeField30 = copticChronology7.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField19", (durationField12.compareTo(durationField19) == 0) == durationField12.equals(durationField19));
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0253");
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
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField12 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField14 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField14", (durationField7.compareTo(durationField14) == 0) == durationField7.equals(durationField14));
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0254");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekOfWeekyear();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField1, and durationField2", !(durationField6.compareTo(durationField1) == 0) || (Math.signum(durationField6.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0255");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DurationField durationField9 = copticChronology8.weekyears();
        long long13 = copticChronology8.add(3600004L, 3600100L, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField9", (durationField2.compareTo(durationField9) == 0) == durationField2.equals(durationField9));
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0256");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.centuries();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField13 = copticChronology12.seconds();
        org.joda.time.DurationField durationField14 = copticChronology12.years();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology16 = copticChronology12.withZone(dateTimeZone15);
        boolean boolean17 = dateTimeZone15.isFixed();
        java.lang.String str18 = dateTimeZone15.getID();
        org.joda.time.Chronology chronology19 = copticChronology0.withZone(dateTimeZone15);
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology20.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology20.secondOfMinute();
        org.joda.time.DurationField durationField23 = copticChronology20.halfdays();
        org.joda.time.DurationField durationField24 = copticChronology20.months();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology20.halfdayOfDay();
        org.joda.time.DurationField durationField26 = copticChronology20.weekyears();
        java.lang.Object obj27 = null;
        boolean boolean28 = copticChronology20.equals(obj27);
        org.joda.time.DateTimeField dateTimeField29 = copticChronology20.yearOfCentury();
        org.joda.time.DurationField durationField30 = copticChronology20.weeks();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology20.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology20.dayOfMonth();
        org.joda.time.DurationField durationField33 = copticChronology20.seconds();
        org.joda.time.Chronology chronology34 = copticChronology20.withUTC();
        boolean boolean35 = dateTimeZone15.equals((java.lang.Object) chronology34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField26", (durationField14.compareTo(durationField26) == 0) == durationField14.equals(durationField26));
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0257");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField7 = copticChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField7, and durationField3", !(durationField3.compareTo(durationField7) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField7.compareTo(durationField3))));
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0258");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        long long8 = copticChronology0.add((long) 4, (long) (short) -1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField2", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0259");
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
        long long39 = dateTimeZone36.convertLocalToUTC(324000000L, true);
        java.lang.String str41 = dateTimeZone36.getShortName((-3599966L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField16", (durationField1.compareTo(durationField16) == 0) == durationField1.equals(durationField16));
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0260");
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
        long long36 = dateTimeZone25.convertLocalToUTC(32L, true, (long) (-1));
        long long39 = dateTimeZone25.convertLocalToUTC((long) (byte) 1, true);
        int int41 = dateTimeZone25.getOffsetFromLocal((long) (-1));
        java.util.TimeZone timeZone42 = dateTimeZone25.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        org.joda.time.Chronology chronology44 = copticChronology0.withZone(dateTimeZone43);
        org.joda.time.DurationField durationField45 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField45, durationField3, and durationField5", !(durationField45.compareTo(durationField3) == 0) || (Math.signum(durationField45.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0261");
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
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology0.add(readablePeriod10, (long) (byte) 0, (int) (short) -1);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.dayOfWeek();
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology15.year();
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField19 = copticChronology18.seconds();
        org.joda.time.DurationField durationField20 = copticChronology18.years();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology22 = copticChronology18.withZone(dateTimeZone21);
        java.lang.String str24 = dateTimeZone21.getNameKey((long) 1);
        org.joda.time.Chronology chronology25 = copticChronology15.withZone(dateTimeZone21);
        long long28 = dateTimeZone21.convertLocalToUTC((long) 0, true);
        long long30 = dateTimeZone21.convertUTCToLocal((long) (short) -1);
        int int32 = dateTimeZone21.getOffsetFromLocal((-1L));
        org.joda.time.Chronology chronology33 = copticChronology0.withZone(dateTimeZone21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField20", (durationField6.compareTo(durationField20) == 0) == durationField6.equals(durationField20));
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0262");
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
        org.joda.time.DurationField durationField22 = copticChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField22", (durationField19.compareTo(durationField22) == 0) == durationField19.equals(durationField22));
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0263");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = copticChronology0.minutes();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = copticChronology0.add(readablePeriod8, 5L, (int) (short) 1);
        int int12 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField14 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField1, and durationField7", !(durationField14.compareTo(durationField1) == 0) || (Math.signum(durationField14.compareTo(durationField7)) == Math.signum(durationField1.compareTo(durationField7))));
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0264");
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
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology22.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology22.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.Chronology chronology26 = copticChronology22.withZone(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField27 = copticChronology22.year();
        org.joda.time.DateTimeZone dateTimeZone28 = copticChronology22.getZone();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology22.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology22.weekyear();
        org.joda.time.DurationField durationField31 = copticChronology22.weekyears();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology22.year();
        boolean boolean33 = copticChronology7.equals((java.lang.Object) copticChronology22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField31", (durationField2.compareTo(durationField31) == 0) == durationField2.equals(durationField31));
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0265");
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
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.days();
        org.joda.time.DurationField durationField12 = copticChronology0.days();
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField5, and durationField7", !(durationField13.compareTo(durationField5) == 0) || (Math.signum(durationField13.compareTo(durationField7)) == Math.signum(durationField5.compareTo(durationField7))));
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0266");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology2.secondOfMinute();
        org.joda.time.DurationField durationField5 = copticChronology2.centuries();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology2.add(readablePeriod6, (long) (short) 100, 100);
        org.joda.time.DurationField durationField10 = copticChronology2.eras();
        boolean boolean11 = dateTimeZone1.equals((java.lang.Object) copticChronology2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField10", Math.signum(durationField5.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField5)));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0267");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField3, and durationField7", !(durationField9.compareTo(durationField3) == 0) || (Math.signum(durationField9.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0268");
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
        org.joda.time.Chronology chronology12 = copticChronology0.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology13.secondOfMinute();
        org.joda.time.DurationField durationField16 = copticChronology13.halfdays();
        int int17 = copticChronology13.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology13.weekyearOfCentury();
        org.joda.time.DurationField durationField19 = copticChronology13.seconds();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology13.weekyear();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology13.era();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours(100);
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField25 = copticChronology24.seconds();
        org.joda.time.DurationField durationField26 = copticChronology24.years();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology24.yearOfCentury();
        org.joda.time.DurationField durationField28 = copticChronology24.seconds();
        org.joda.time.DurationField durationField29 = copticChronology24.centuries();
        boolean boolean30 = dateTimeZone23.equals((java.lang.Object) copticChronology24);
        org.joda.time.chrono.CopticChronology copticChronology31 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology31.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology31.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.Chronology chronology35 = copticChronology31.withZone(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField36 = copticChronology31.year();
        org.joda.time.DateTimeZone dateTimeZone37 = copticChronology31.getZone();
        long long41 = dateTimeZone37.convertLocalToUTC(100L, false, 1L);
        java.lang.String str42 = dateTimeZone37.getID();
        org.joda.time.Chronology chronology43 = copticChronology24.withZone(dateTimeZone37);
        java.lang.String str45 = dateTimeZone37.getName((long) (byte) 0);
        org.joda.time.Chronology chronology46 = copticChronology13.withZone(dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField47 = copticChronology13.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField48 = copticChronology13.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        java.lang.String str52 = dateTimeZone50.getNameKey((long) 'a');
        boolean boolean53 = dateTimeZone50.isFixed();
        java.lang.String str55 = dateTimeZone50.getShortName((long) (byte) 0);
        org.joda.time.Chronology chronology56 = copticChronology13.withZone(dateTimeZone50);
        int int58 = dateTimeZone50.getOffset(135L);
        org.joda.time.Chronology chronology59 = copticChronology0.withZone(dateTimeZone50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField26", (durationField6.compareTo(durationField26) == 0) == durationField6.equals(durationField26));
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0269");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField6", Math.signum(durationField1.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField1)));
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0270");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.centuries();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField7", (durationField2.compareTo(durationField7) == 0) == durationField2.equals(durationField7));
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0271");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField7", (durationField2.compareTo(durationField7) == 0) == durationField2.equals(durationField7));
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0272");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.DurationField durationField3 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.Chronology chronology5 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField6", Math.signum(durationField3.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField3)));
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0273");
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
        java.lang.String str14 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField16 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField3, and durationField4", !(durationField16.compareTo(durationField3) == 0) || (Math.signum(durationField16.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0274");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField3", Math.signum(durationField1.compareTo(durationField3)) == -Math.signum(durationField3.compareTo(durationField1)));
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0275");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.Chronology chronology10 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField3, and durationField4", !(durationField12.compareTo(durationField3) == 0) || (Math.signum(durationField12.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0276");
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
        int int23 = dateTimeZone6.getStandardOffset((long) (byte) 100);
        long long26 = dateTimeZone6.convertLocalToUTC((long) (byte) 0, true);
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone6.getShortName(999L, locale28);
        long long33 = dateTimeZone6.convertLocalToUTC(0L, false, (long) (byte) 0);
        long long35 = dateTimeZone6.nextTransition(20L);
        long long38 = dateTimeZone6.convertLocalToUTC((-356399989L), true);
        org.joda.time.chrono.CopticChronology copticChronology39 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField40 = copticChronology39.years();
        org.joda.time.DurationField durationField41 = copticChronology39.days();
        boolean boolean42 = dateTimeZone6.equals((java.lang.Object) copticChronology39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField40", (durationField5.compareTo(durationField40) == 0) == durationField5.equals(durationField40));
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0277");
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
        long long22 = copticChronology7.add((-414712180800138L), (-3599810L), (int) ' ');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField16", (durationField1.compareTo(durationField16) == 0) == durationField1.equals(durationField16));
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0278");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.hours();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.dayOfYear();
        org.joda.time.DurationField durationField9 = chronology6.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField7", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField7)) == Math.signum(durationField1.compareTo(durationField7))));
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0279");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.era();
        java.lang.String str4 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField6", Math.signum(durationField1.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField1)));
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0280");
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
        org.joda.time.DurationField durationField17 = copticChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField16", (durationField7.compareTo(durationField16) == 0) == durationField7.equals(durationField16));
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0281");
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
        org.joda.time.DateTimeField dateTimeField17 = copticChronology7.clockhourOfDay();
        org.joda.time.Chronology chronology18 = copticChronology7.withUTC();
        org.joda.time.DurationField durationField19 = copticChronology7.seconds();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology7.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField19", (durationField1.compareTo(durationField19) == 0) == durationField1.equals(durationField19));
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0282");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField8 = copticChronology0.seconds();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.joda.time.DurationField durationField10 = copticChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField9", Math.signum(durationField1.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField1)));
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0283");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField3", Math.signum(durationField1.compareTo(durationField3)) == -Math.signum(durationField3.compareTo(durationField1)));
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0284");
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
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.millisOfDay();
        org.joda.time.DurationField durationField12 = copticChronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField1, and durationField2", !(durationField12.compareTo(durationField1) == 0) || (Math.signum(durationField12.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0285");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = copticChronology10.seconds();
        org.joda.time.DurationField durationField12 = copticChronology10.hours();
        org.joda.time.DurationField durationField13 = copticChronology10.minutes();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology10.getZone();
        java.lang.String str15 = copticChronology10.toString();
        java.lang.Object obj16 = null;
        boolean boolean17 = copticChronology10.equals(obj16);
        long long21 = copticChronology10.add((-82800000L), 52L, (int) '4');
        org.joda.time.DateTimeField dateTimeField22 = copticChronology10.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = copticChronology10.getZone();
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = dateTimeZone23.isLocalDateTimeGap(localDateTime24);
        org.joda.time.Chronology chronology26 = copticChronology0.withZone(dateTimeZone23);
        org.joda.time.DurationField durationField27 = chronology26.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField6, and durationField11", !(durationField27.compareTo(durationField6) == 0) || (Math.signum(durationField27.compareTo(durationField11)) == Math.signum(durationField6.compareTo(durationField11))));
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0286");
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
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.millisOfDay();
        java.lang.String str11 = copticChronology0.toString();
        org.joda.time.DurationField durationField12 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField14 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField3, and durationField4", !(durationField14.compareTo(durationField3) == 0) || (Math.signum(durationField14.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0287");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.minutes();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.clockhourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology11.clockhourOfHalfday();
        org.joda.time.DurationField durationField14 = copticChronology11.eras();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology11.era();
        org.joda.time.DateTimeZone dateTimeZone16 = copticChronology11.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        org.joda.time.Chronology chronology18 = copticChronology0.withZone(dateTimeZone16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField14", Math.signum(durationField5.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField5)));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0288");
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
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField18 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField16 and durationField18", Math.signum(durationField16.compareTo(durationField18)) == -Math.signum(durationField18.compareTo(durationField16)));
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0289");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        long long6 = copticChronology0.add(10L, 359999999L, (-1));
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DurationField durationField8 = copticChronology0.halfdays();
        long long12 = copticChronology0.add((long) '#', 3276601035L, (int) 'a');
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField7, and durationField8", !(durationField13.compareTo(durationField7) == 0) || (Math.signum(durationField13.compareTo(durationField8)) == Math.signum(durationField7.compareTo(durationField8))));
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0290");
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
        org.joda.time.DateTimeField dateTimeField22 = chronology21.millisOfDay();
        org.joda.time.DurationField durationField23 = chronology21.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField3, and durationField4", !(durationField23.compareTo(durationField3) == 0) || (Math.signum(durationField23.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0291");
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
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField4", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0292");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField6 = copticChronology0.years();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField3, and durationField6", !(durationField7.compareTo(durationField3) == 0) || (Math.signum(durationField7.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0293");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField8 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField11", Math.signum(durationField1.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField1)));
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0294");
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
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.clockhourOfHalfday();
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField18 = copticChronology17.seconds();
        org.joda.time.DurationField durationField19 = copticChronology17.years();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology21 = copticChronology17.withZone(dateTimeZone20);
        org.joda.time.DurationField durationField22 = chronology21.millis();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.monthOfYear();
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology24.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology24.year();
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField28 = copticChronology27.seconds();
        org.joda.time.DurationField durationField29 = copticChronology27.years();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology31 = copticChronology27.withZone(dateTimeZone30);
        java.lang.String str33 = dateTimeZone30.getNameKey((long) 1);
        org.joda.time.Chronology chronology34 = copticChronology24.withZone(dateTimeZone30);
        long long37 = dateTimeZone30.convertLocalToUTC((long) 0, true);
        long long39 = dateTimeZone30.convertUTCToLocal((long) (short) -1);
        java.lang.String str40 = dateTimeZone30.getID();
        boolean boolean42 = dateTimeZone30.isStandardOffset((long) (short) -1);
        org.joda.time.Chronology chronology43 = chronology21.withZone(dateTimeZone30);
        org.joda.time.Chronology chronology44 = copticChronology0.withZone(dateTimeZone30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField19", (durationField13.compareTo(durationField19) == 0) == durationField13.equals(durationField19));
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0295");
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
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField4", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0296");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField8 = copticChronology0.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField7", (durationField8.compareTo(durationField7) == 0) == durationField8.equals(durationField7));
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0297");
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
        org.joda.time.DateTimeField dateTimeField12 = copticChronology7.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField11", (durationField2.compareTo(durationField11) == 0) == durationField2.equals(durationField11));
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0298");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField2", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0299");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField8 = copticChronology0.seconds();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField9", Math.signum(durationField1.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField1)));
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0300");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField9 = copticChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField8", (durationField2.compareTo(durationField8) == 0) == durationField2.equals(durationField8));
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0301");
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
        org.joda.time.DateTimeField dateTimeField22 = copticChronology17.dayOfMonth();
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology23.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology23.clockhourOfHalfday();
        org.joda.time.DurationField durationField26 = copticChronology23.eras();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology23.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone28 = copticChronology23.getZone();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology23.era();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology23.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology23.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone32 = copticChronology23.getZone();
        boolean boolean33 = copticChronology17.equals((java.lang.Object) copticChronology23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField26", Math.signum(durationField1.compareTo(durationField26)) == -Math.signum(durationField26.compareTo(durationField1)));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0302");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.clockhourOfDay();
        org.joda.time.DurationField durationField10 = copticChronology7.minutes();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology13.year();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField17 = copticChronology16.seconds();
        org.joda.time.DurationField durationField18 = copticChronology16.years();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology20 = copticChronology16.withZone(dateTimeZone19);
        java.lang.String str22 = dateTimeZone19.getNameKey((long) 1);
        org.joda.time.Chronology chronology23 = copticChronology13.withZone(dateTimeZone19);
        long long26 = dateTimeZone19.convertLocalToUTC((long) 0, true);
        boolean boolean28 = dateTimeZone19.isStandardOffset((long) (short) 1);
        long long30 = dateTimeZone11.getMillisKeepLocal(dateTimeZone19, 35L);
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone11.getShortName((-427799999L), locale32);
        java.util.TimeZone timeZone34 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        org.joda.time.Chronology chronology36 = copticChronology7.withZone(dateTimeZone35);
        org.joda.time.DurationField durationField37 = chronology36.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField37, durationField1, and durationField2", !(durationField37.compareTo(durationField1) == 0) || (Math.signum(durationField37.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0303");
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
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField13 = copticChronology0.seconds();
        org.joda.time.Chronology chronology14 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField15 = copticChronology0.years();
        org.joda.time.DurationField durationField16 = copticChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField15", (durationField6.compareTo(durationField15) == 0) == durationField6.equals(durationField15));
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0304");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField6 = copticChronology0.millis();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField7", Math.signum(durationField6.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField6)));
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0305");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology5.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology5.secondOfMinute();
        org.joda.time.DurationField durationField8 = copticChronology5.weeks();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology5.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology5.yearOfEra();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology5.weekyear();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology5.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology5.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology5.getZone();
        boolean boolean15 = copticChronology0.equals((java.lang.Object) dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField8", Math.signum(durationField3.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField3)));
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0306");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField9 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology11.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Chronology chronology15 = copticChronology11.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology11.year();
        org.joda.time.DateTimeZone dateTimeZone17 = copticChronology11.getZone();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology11.hourOfHalfday();
        org.joda.time.DurationField durationField19 = copticChronology11.millis();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean21 = dateTimeZone20.isFixed();
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology22.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology22.year();
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField26 = copticChronology25.seconds();
        org.joda.time.DurationField durationField27 = copticChronology25.years();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology29 = copticChronology25.withZone(dateTimeZone28);
        java.lang.String str31 = dateTimeZone28.getNameKey((long) 1);
        org.joda.time.Chronology chronology32 = copticChronology22.withZone(dateTimeZone28);
        long long35 = dateTimeZone28.convertLocalToUTC((long) 0, true);
        boolean boolean37 = dateTimeZone28.isStandardOffset((long) (short) 1);
        long long39 = dateTimeZone20.getMillisKeepLocal(dateTimeZone28, 35L);
        org.joda.time.Chronology chronology40 = copticChronology11.withZone(dateTimeZone20);
        int int42 = dateTimeZone20.getOffset((long) 360000000);
        java.util.Locale locale44 = null;
        java.lang.String str45 = dateTimeZone20.getName(0L, locale44);
        org.joda.time.chrono.CopticChronology copticChronology46 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField47 = copticChronology46.seconds();
        org.joda.time.DurationField durationField48 = copticChronology46.years();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology50 = copticChronology46.withZone(dateTimeZone49);
        org.joda.time.DateTimeField dateTimeField51 = copticChronology46.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField52 = copticChronology46.halfdayOfDay();
        org.joda.time.DurationField durationField53 = copticChronology46.days();
        boolean boolean54 = dateTimeZone20.equals((java.lang.Object) durationField53);
        int int56 = dateTimeZone20.getOffsetFromLocal((-359519965L));
        org.joda.time.Chronology chronology57 = copticChronology0.withZone(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField27", (durationField9.compareTo(durationField27) == 0) == durationField9.equals(durationField27));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0307");
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
        java.lang.String str39 = dateTimeZone36.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField16", (durationField1.compareTo(durationField16) == 0) == durationField1.equals(durationField16));
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0308");
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
        org.joda.time.DurationField durationField11 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField11", (durationField5.compareTo(durationField11) == 0) == durationField5.equals(durationField11));
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0309");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.centuries();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField7", (durationField2.compareTo(durationField7) == 0) == durationField2.equals(durationField7));
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0310");
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
        org.joda.time.DurationField durationField13 = copticChronology0.days();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField15 = copticChronology14.seconds();
        org.joda.time.DurationField durationField16 = copticChronology14.years();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology18 = copticChronology14.withZone(dateTimeZone17);
        java.lang.String str20 = dateTimeZone17.getName((long) (byte) 1);
        int int22 = dateTimeZone17.getOffsetFromLocal((long) 0);
        boolean boolean24 = dateTimeZone17.isStandardOffset(0L);
        org.joda.time.Chronology chronology25 = copticChronology0.withZone(dateTimeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField16", (durationField9.compareTo(durationField16) == 0) == durationField9.equals(durationField16));
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0311");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.era();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField7", (durationField2.compareTo(durationField7) == 0) == durationField2.equals(durationField7));
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0312");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField4 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField1, and durationField2", !(durationField6.compareTo(durationField1) == 0) || (Math.signum(durationField6.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0313");
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
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField17", Math.signum(durationField1.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField1)));
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0314");
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
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField14", (durationField5.compareTo(durationField14) == 0) == durationField5.equals(durationField14));
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0315");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField3, and durationField4", !(durationField9.compareTo(durationField3) == 0) || (Math.signum(durationField9.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0316");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.years();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.DurationField durationField3 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField4 = copticChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField3", (durationField1.compareTo(durationField3) == 0) == durationField1.equals(durationField3));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0317");
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
        org.joda.time.DateTimeField dateTimeField17 = copticChronology12.year();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology12.yearOfCentury();
        org.joda.time.DurationField durationField19 = copticChronology12.centuries();
        org.joda.time.DurationField durationField20 = copticChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField1, and durationField2", !(durationField20.compareTo(durationField1) == 0) || (Math.signum(durationField20.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0318");
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
        org.joda.time.DateTimeZone dateTimeZone11 = copticChronology0.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField10", Math.signum(durationField7.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField7)));
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0319");
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
        org.joda.time.DurationField durationField11 = copticChronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField1, and durationField2", !(durationField11.compareTo(durationField1) == 0) || (Math.signum(durationField11.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0320");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField6", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0321");
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
        org.joda.time.DateTimeField dateTimeField14 = chronology12.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField13", (durationField6.compareTo(durationField13) == 0) == durationField6.equals(durationField13));
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0322");
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
        org.joda.time.DurationField durationField17 = copticChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField16", (durationField7.compareTo(durationField16) == 0) == durationField7.equals(durationField16));
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0323");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DurationField durationField9 = copticChronology8.weekyears();
        org.joda.time.DurationField durationField10 = copticChronology8.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField9", (durationField2.compareTo(durationField9) == 0) == durationField2.equals(durationField9));
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0324");
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
        org.joda.time.DateTimeField dateTimeField13 = copticChronology8.clockhourOfHalfday();
        java.lang.String str14 = copticChronology8.toString();
        org.joda.time.DurationField durationField15 = copticChronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField1, and durationField2", !(durationField15.compareTo(durationField1) == 0) || (Math.signum(durationField15.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0325");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField14 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField14", Math.signum(durationField1.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField1)));
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0326");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField8", Math.signum(durationField6.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField6)));
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0327");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        long long8 = copticChronology0.add((long) 4, (long) (short) -1, (int) (byte) -1);
        org.joda.time.DurationField durationField9 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField9", (durationField2.compareTo(durationField9) == 0) == durationField2.equals(durationField9));
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0328");
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
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.clockhourOfHalfday();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology13.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology13.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology13.yearOfEra();
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField19 = copticChronology18.seconds();
        org.joda.time.DurationField durationField20 = copticChronology18.years();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology22 = copticChronology18.withZone(dateTimeZone21);
        java.lang.String str24 = dateTimeZone21.getNameKey((long) 1);
        int int26 = dateTimeZone21.getStandardOffset((long) (short) 0);
        org.joda.time.Chronology chronology27 = copticChronology13.withZone(dateTimeZone21);
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone21.getName(3600004L, locale29);
        org.joda.time.Chronology chronology31 = copticChronology0.withZone(dateTimeZone21);
        org.joda.time.DurationField durationField32 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField32, durationField19, and durationField20", !(durationField32.compareTo(durationField19) == 0) || (Math.signum(durationField32.compareTo(durationField20)) == Math.signum(durationField19.compareTo(durationField20))));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0329");
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
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField17 = copticChronology0.days();
        org.joda.time.DurationField durationField18 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField1, and durationField15", !(durationField18.compareTo(durationField1) == 0) || (Math.signum(durationField18.compareTo(durationField15)) == Math.signum(durationField1.compareTo(durationField15))));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0330");
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
        org.joda.time.DateTimeField dateTimeField15 = copticChronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology8.dayOfWeek();
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology17.centuryOfEra();
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField21 = copticChronology20.seconds();
        org.joda.time.DurationField durationField22 = copticChronology20.millis();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology20.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology20.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology20.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone26 = copticChronology20.getZone();
        org.joda.time.Chronology chronology27 = copticChronology17.withZone(dateTimeZone26);
        org.joda.time.Chronology chronology28 = copticChronology8.withZone(dateTimeZone26);
        org.joda.time.DurationField durationField29 = chronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField29, durationField1, and durationField2", !(durationField29.compareTo(durationField1) == 0) || (Math.signum(durationField29.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0331");
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
        org.joda.time.DurationField durationField14 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField3, and durationField4", !(durationField14.compareTo(durationField3) == 0) || (Math.signum(durationField14.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0332");
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
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField20 = copticChronology19.seconds();
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField22 = copticChronology21.seconds();
        org.joda.time.DurationField durationField23 = copticChronology21.years();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology25 = copticChronology21.withZone(dateTimeZone24);
        java.lang.String str27 = dateTimeZone24.getNameKey((long) 1);
        boolean boolean29 = dateTimeZone24.equals((java.lang.Object) (-1.0f));
        int int31 = dateTimeZone24.getOffset((long) 100);
        org.joda.time.Chronology chronology32 = copticChronology19.withZone(dateTimeZone24);
        org.joda.time.chrono.CopticChronology copticChronology33 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField34 = copticChronology33.seconds();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        long long38 = copticChronology33.add(readablePeriod35, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField39 = copticChronology33.centuries();
        org.joda.time.Chronology chronology40 = copticChronology33.withUTC();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.Chronology chronology43 = chronology40.withZone(dateTimeZone42);
        boolean boolean44 = dateTimeZone24.equals((java.lang.Object) dateTimeZone42);
        org.joda.time.Chronology chronology45 = copticChronology0.withZone(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField23", (durationField6.compareTo(durationField23) == 0) == durationField6.equals(durationField23));
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0333");
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
        boolean boolean18 = dateTimeZone3.isFixed();
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone3.getName(100L, locale20);
        long long24 = dateTimeZone3.adjustOffset(86L, false);
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology25.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology25.secondOfMinute();
        org.joda.time.DurationField durationField28 = copticChronology25.halfdays();
        org.joda.time.DurationField durationField29 = copticChronology25.months();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology25.halfdayOfDay();
        org.joda.time.DurationField durationField31 = copticChronology25.weekyears();
        java.lang.Object obj32 = null;
        boolean boolean33 = copticChronology25.equals(obj32);
        org.joda.time.DateTimeField dateTimeField34 = copticChronology25.yearOfCentury();
        org.joda.time.DurationField durationField35 = copticChronology25.weeks();
        org.joda.time.DurationField durationField36 = copticChronology25.centuries();
        org.joda.time.DurationField durationField37 = copticChronology25.millis();
        boolean boolean38 = dateTimeZone3.equals((java.lang.Object) copticChronology25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField31", (durationField2.compareTo(durationField31) == 0) == durationField2.equals(durationField31));
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0334");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology1.add(readablePeriod3, 999L, 3600000);
        int int7 = copticChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField8 = copticChronology1.weekyears();
        org.joda.time.DurationField durationField9 = copticChronology1.eras();
        long long13 = copticChronology1.add((-5L), 972987907769L, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField9", Math.signum(durationField8.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField8)));
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0335");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.era();
        org.joda.time.DurationField durationField7 = copticChronology0.hours();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfCentury();
        long long13 = copticChronology0.add((long) (-3600000), 99L, (int) (short) 100);
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology14.secondOfMinute();
        org.joda.time.DurationField durationField17 = copticChronology14.halfdays();
        org.joda.time.DurationField durationField18 = copticChronology14.months();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology14.halfdayOfDay();
        org.joda.time.DurationField durationField20 = copticChronology14.weekyears();
        java.lang.Object obj21 = null;
        boolean boolean22 = copticChronology14.equals(obj21);
        org.joda.time.DateTimeField dateTimeField23 = copticChronology14.era();
        org.joda.time.DurationField durationField24 = copticChronology14.centuries();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology14.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology26.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology26.secondOfMinute();
        org.joda.time.DurationField durationField29 = copticChronology26.weeks();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology26.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology26.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone32 = copticChronology26.getZone();
        org.joda.time.LocalDateTime localDateTime33 = null;
        boolean boolean34 = dateTimeZone32.isLocalDateTimeGap(localDateTime33);
        org.joda.time.Chronology chronology35 = copticChronology14.withZone(dateTimeZone32);
        org.joda.time.Chronology chronology36 = copticChronology0.withZone(dateTimeZone32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField20", (durationField2.compareTo(durationField20) == 0) == durationField2.equals(durationField20));
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0336");
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
        org.joda.time.DateTimeField dateTimeField24 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField25 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField27 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField1, and durationField2", !(durationField27.compareTo(durationField1) == 0) || (Math.signum(durationField27.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0337");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.centuries();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField7", (durationField2.compareTo(durationField7) == 0) == durationField2.equals(durationField7));
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0338");
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
        long long33 = copticChronology7.add(0L, (-65L), 35);
        org.joda.time.DateTimeField dateTimeField34 = copticChronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField35 = copticChronology7.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField19", (durationField12.compareTo(durationField19) == 0) == durationField12.equals(durationField19));
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0339");
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
        org.joda.time.DurationField durationField30 = chronology29.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField19", (durationField12.compareTo(durationField19) == 0) == durationField12.equals(durationField19));
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0340");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekOfWeekyear();
        int int5 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField6 = copticChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField6, and durationField3", !(durationField3.compareTo(durationField6) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField6.compareTo(durationField3))));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0341");
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
        org.joda.time.DurationField durationField51 = copticChronology50.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField51, durationField1, and durationField2", !(durationField51.compareTo(durationField1) == 0) || (Math.signum(durationField51.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0342");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.centuries();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField13 = copticChronology12.seconds();
        org.joda.time.DurationField durationField14 = copticChronology12.years();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology16 = copticChronology12.withZone(dateTimeZone15);
        boolean boolean17 = dateTimeZone15.isFixed();
        java.lang.String str18 = dateTimeZone15.getID();
        org.joda.time.Chronology chronology19 = copticChronology0.withZone(dateTimeZone15);
        long long22 = dateTimeZone15.convertLocalToUTC((-359999989L), false);
        java.lang.String str24 = dateTimeZone15.getShortName((-8092799855L));
        java.util.TimeZone timeZone25 = dateTimeZone15.toTimeZone();
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology27.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology27.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.Chronology chronology31 = copticChronology27.withZone(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = copticChronology27.year();
        org.joda.time.DateTimeZone dateTimeZone33 = copticChronology27.getZone();
        long long37 = dateTimeZone33.convertLocalToUTC(100L, false, 1L);
        java.lang.String str38 = dateTimeZone33.getID();
        org.joda.time.ReadableInstant readableInstant39 = null;
        int int40 = dateTimeZone33.getOffset(readableInstant39);
        org.joda.time.Chronology chronology41 = copticChronology26.withZone(dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField42 = copticChronology26.secondOfDay();
        org.joda.time.DurationField durationField43 = copticChronology26.weekyears();
        org.joda.time.DateTimeZone dateTimeZone44 = copticChronology26.getZone();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 0);
        int int49 = dateTimeZone47.getOffset(90L);
        java.lang.String str50 = dateTimeZone47.toString();
        java.lang.String str51 = dateTimeZone47.toString();
        boolean boolean52 = copticChronology26.equals((java.lang.Object) dateTimeZone47);
        java.lang.String str53 = dateTimeZone47.getID();
        long long56 = dateTimeZone47.adjustOffset(28L, true);
        boolean boolean57 = dateTimeZone15.equals((java.lang.Object) dateTimeZone47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField43", (durationField14.compareTo(durationField43) == 0) == durationField14.equals(durationField43));
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0343");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField6, and durationField3", !(durationField3.compareTo(durationField6) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField6.compareTo(durationField3))));
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0344");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = copticChronology0.minutes();
        org.joda.time.DurationField durationField7 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField13 = copticChronology0.weekyears();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology14.year();
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField18 = copticChronology17.seconds();
        org.joda.time.DurationField durationField19 = copticChronology17.years();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology21 = copticChronology17.withZone(dateTimeZone20);
        java.lang.String str23 = dateTimeZone20.getNameKey((long) 1);
        org.joda.time.Chronology chronology24 = copticChronology14.withZone(dateTimeZone20);
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField26 = copticChronology25.seconds();
        org.joda.time.DurationField durationField27 = copticChronology25.years();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology29 = copticChronology25.withZone(dateTimeZone28);
        java.lang.String str31 = dateTimeZone28.getNameKey((long) 1);
        int int33 = dateTimeZone28.getStandardOffset((long) (short) 0);
        long long35 = dateTimeZone20.getMillisKeepLocal(dateTimeZone28, (long) (short) 10);
        int int37 = dateTimeZone20.getStandardOffset((long) (-1));
        java.util.TimeZone timeZone38 = dateTimeZone20.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        int int41 = dateTimeZone20.getOffset(0L);
        org.joda.time.Chronology chronology42 = copticChronology0.withZone(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField19", (durationField13.compareTo(durationField19) == 0) == durationField13.equals(durationField19));
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0345");
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
        org.joda.time.DurationField durationField13 = copticChronology11.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField12", Math.signum(durationField1.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField1)));
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0346");
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
        java.lang.String str30 = copticChronology7.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField29", (durationField2.compareTo(durationField29) == 0) == durationField2.equals(durationField29));
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0347");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone4 = copticChronology0.getZone();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DurationField durationField6 = copticChronology0.weeks();
        org.joda.time.DurationField durationField7 = copticChronology0.years();
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
        org.joda.time.DurationField durationField19 = copticChronology16.months();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = copticChronology16.add(readablePeriod20, (long) (short) -1, (int) '#');
        org.joda.time.DateTimeField dateTimeField24 = copticChronology16.yearOfCentury();
        org.joda.time.DurationField durationField25 = copticChronology16.days();
        org.joda.time.DurationField durationField26 = copticChronology16.years();
        boolean boolean27 = copticChronology0.equals((java.lang.Object) copticChronology16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField26", (durationField2.compareTo(durationField26) == 0) == durationField2.equals(durationField26));
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0348");
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
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.hourOfHalfday();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology13.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.Chronology chronology17 = copticChronology13.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology13.year();
        org.joda.time.DateTimeZone dateTimeZone19 = copticChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology13.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology13.dayOfMonth();
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = copticChronology23.seconds();
        org.joda.time.DurationField durationField25 = copticChronology23.years();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology27 = copticChronology23.withZone(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = dateTimeZone26.isLocalDateTimeGap(localDateTime28);
        int int31 = dateTimeZone26.getOffset((long) ' ');
        org.joda.time.Chronology chronology32 = copticChronology13.withZone(dateTimeZone26);
        org.joda.time.Chronology chronology33 = copticChronology0.withZone(dateTimeZone26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField24", Math.signum(durationField3.compareTo(durationField24)) == -Math.signum(durationField24.compareTo(durationField3)));
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0349");
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
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField9", (durationField7.compareTo(durationField9) == 0) == durationField7.equals(durationField9));
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0350");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfEra();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = copticChronology10.seconds();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology10.add(readablePeriod12, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology10.secondOfDay();
        org.joda.time.DurationField durationField17 = copticChronology10.weekyears();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forID("+00:00");
        java.lang.String str20 = dateTimeZone19.getID();
        boolean boolean21 = dateTimeZone19.isFixed();
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone19.getShortName((long) (-1), locale23);
        org.joda.time.Chronology chronology25 = copticChronology10.withZone(dateTimeZone19);
        org.joda.time.Chronology chronology26 = copticChronology0.withZone(dateTimeZone19);
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology27.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology27.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.Chronology chronology31 = copticChronology27.withZone(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField32 = copticChronology27.year();
        org.joda.time.DateTimeZone dateTimeZone33 = copticChronology27.getZone();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology27.hourOfHalfday();
        org.joda.time.DurationField durationField35 = copticChronology27.millis();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean37 = dateTimeZone36.isFixed();
        org.joda.time.chrono.CopticChronology copticChronology38 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField39 = copticChronology38.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField40 = copticChronology38.year();
        org.joda.time.chrono.CopticChronology copticChronology41 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField42 = copticChronology41.seconds();
        org.joda.time.DurationField durationField43 = copticChronology41.years();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology45 = copticChronology41.withZone(dateTimeZone44);
        java.lang.String str47 = dateTimeZone44.getNameKey((long) 1);
        org.joda.time.Chronology chronology48 = copticChronology38.withZone(dateTimeZone44);
        long long51 = dateTimeZone44.convertLocalToUTC((long) 0, true);
        boolean boolean53 = dateTimeZone44.isStandardOffset((long) (short) 1);
        long long55 = dateTimeZone36.getMillisKeepLocal(dateTimeZone44, 35L);
        org.joda.time.Chronology chronology56 = copticChronology27.withZone(dateTimeZone36);
        int int58 = dateTimeZone36.getOffset((long) 360000000);
        java.util.Locale locale60 = null;
        java.lang.String str61 = dateTimeZone36.getName(0L, locale60);
        org.joda.time.chrono.CopticChronology copticChronology62 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField63 = copticChronology62.seconds();
        org.joda.time.DurationField durationField64 = copticChronology62.years();
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology66 = copticChronology62.withZone(dateTimeZone65);
        org.joda.time.DateTimeField dateTimeField67 = copticChronology62.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField68 = copticChronology62.halfdayOfDay();
        org.joda.time.DurationField durationField69 = copticChronology62.days();
        boolean boolean70 = dateTimeZone36.equals((java.lang.Object) durationField69);
        int int72 = dateTimeZone36.getOffsetFromLocal((-359519965L));
        boolean boolean73 = copticChronology0.equals((java.lang.Object) int72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField17 and durationField43", (durationField17.compareTo(durationField43) == 0) == durationField17.equals(durationField43));
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0351");
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
        org.joda.time.DateTimeField dateTimeField24 = copticChronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology2.centuryOfEra();
        org.joda.time.DurationField durationField26 = copticChronology2.halfdays();
        org.joda.time.DurationField durationField27 = copticChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField3, and durationField4", !(durationField27.compareTo(durationField3) == 0) || (Math.signum(durationField27.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0352");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField8 = copticChronology0.centuries();
        org.joda.time.DurationField durationField9 = copticChronology0.hours();
        org.joda.time.DurationField durationField10 = copticChronology0.seconds();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField1, and durationField8", !(durationField11.compareTo(durationField1) == 0) || (Math.signum(durationField11.compareTo(durationField8)) == Math.signum(durationField1.compareTo(durationField8))));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0353");
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
        org.joda.time.DurationField durationField13 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField15 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField3, and durationField5", !(durationField15.compareTo(durationField3) == 0) || (Math.signum(durationField15.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0354");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField6", (durationField2.compareTo(durationField6) == 0) == durationField2.equals(durationField6));
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0355");
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
        org.joda.time.DateTimeField dateTimeField15 = copticChronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology8.dayOfWeek();
        org.joda.time.DurationField durationField17 = copticChronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField1, and durationField2", !(durationField17.compareTo(durationField1) == 0) || (Math.signum(durationField17.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0356");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.millis();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DurationField durationField4 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField1, and durationField2", !(durationField4.compareTo(durationField1) == 0) || (Math.signum(durationField4.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0357");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.Chronology chronology11 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField12 = copticChronology0.hours();
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField7", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0358");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = copticChronology0.add(readablePeriod11, (long) (short) 10, 4);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField17 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField17", Math.signum(durationField6.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField6)));
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0359");
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
        org.joda.time.DurationField durationField19 = copticChronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField1, and durationField2", !(durationField19.compareTo(durationField1) == 0) || (Math.signum(durationField19.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0360");
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
        org.joda.time.DurationField durationField12 = copticChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField11", Math.signum(durationField3.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField3)));
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0361");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.era();
        org.joda.time.DurationField durationField8 = copticChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField8, and durationField3", !(durationField3.compareTo(durationField8) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField8.compareTo(durationField3))));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0362");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology0.getZone();
        org.joda.time.DurationField durationField9 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField2", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0363");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfMinute();
        java.lang.String str9 = copticChronology0.toString();
        org.joda.time.DurationField durationField10 = copticChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField10, and durationField3", !(durationField3.compareTo(durationField10) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField10.compareTo(durationField3))));
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0364");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = copticChronology0.minutes();
        org.joda.time.DurationField durationField7 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField6, and durationField7", !(durationField9.compareTo(durationField6) == 0) || (Math.signum(durationField9.compareTo(durationField7)) == Math.signum(durationField6.compareTo(durationField7))));
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0365");
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
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0366");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField8 = copticChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField7", (durationField2.compareTo(durationField7) == 0) == durationField2.equals(durationField7));
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0367");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.era();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField7, and durationField3", !(durationField3.compareTo(durationField7) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField7.compareTo(durationField3))));
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0368");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField5 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField9 = copticChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField8", (durationField2.compareTo(durationField8) == 0) == durationField2.equals(durationField8));
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0369");
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
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField16", (durationField7.compareTo(durationField16) == 0) == durationField7.equals(durationField16));
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0370");
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
        org.joda.time.DateTimeField dateTimeField17 = copticChronology7.clockhourOfDay();
        org.joda.time.Chronology chronology18 = copticChronology7.withUTC();
        org.joda.time.DurationField durationField19 = copticChronology7.seconds();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology7.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField19", (durationField1.compareTo(durationField19) == 0) == durationField1.equals(durationField19));
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0371");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.era();
        org.joda.time.DurationField durationField8 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology10.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology10.secondOfMinute();
        org.joda.time.DurationField durationField13 = copticChronology10.halfdays();
        org.joda.time.DurationField durationField14 = copticChronology10.months();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology10.halfdayOfDay();
        org.joda.time.DurationField durationField16 = copticChronology10.weekyears();
        org.joda.time.DurationField durationField17 = copticChronology10.centuries();
        org.joda.time.DurationField durationField18 = copticChronology10.millis();
        org.joda.time.DateTimeZone dateTimeZone19 = copticChronology10.getZone();
        long long21 = dateTimeZone9.getMillisKeepLocal(dateTimeZone19, 360003560L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField16", (durationField8.compareTo(durationField16) == 0) == durationField8.equals(durationField16));
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0372");
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
        org.joda.time.DateTimeZone dateTimeZone17 = copticChronology0.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField16", (durationField7.compareTo(durationField16) == 0) == durationField7.equals(durationField16));
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0373");
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
        org.joda.time.DurationField durationField12 = copticChronology7.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField11", (durationField2.compareTo(durationField11) == 0) == durationField2.equals(durationField11));
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0374");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone3.getShortName((long) ' ', locale5);
        org.joda.time.Chronology chronology7 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField9 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField10 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.weekyear();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = copticChronology0.add(readablePeriod14, (-46790000L), 360000000);
        org.joda.time.DurationField durationField18 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField18", (durationField9.compareTo(durationField18) == 0) == durationField9.equals(durationField18));
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0375");
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
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology7.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField11", (durationField2.compareTo(durationField11) == 0) == durationField2.equals(durationField11));
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0376");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.year();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        org.joda.time.DurationField durationField6 = copticChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField6, and durationField5", !(durationField5.compareTo(durationField6) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField6.compareTo(durationField5))));
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0377");
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
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField17", Math.signum(durationField1.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField1)));
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0378");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField14 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField14", Math.signum(durationField1.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField1)));
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0379");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField7, and durationField3", !(durationField3.compareTo(durationField7) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField7.compareTo(durationField3))));
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0380");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfMonth();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology9.year();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField13 = copticChronology12.seconds();
        org.joda.time.DurationField durationField14 = copticChronology12.years();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology16 = copticChronology12.withZone(dateTimeZone15);
        java.lang.String str18 = dateTimeZone15.getNameKey((long) 1);
        org.joda.time.Chronology chronology19 = copticChronology9.withZone(dateTimeZone15);
        long long22 = dateTimeZone15.convertLocalToUTC((long) 0, true);
        long long24 = dateTimeZone15.convertUTCToLocal((long) (short) -1);
        java.lang.String str25 = dateTimeZone15.getID();
        org.joda.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = dateTimeZone15.isLocalDateTimeGap(localDateTime26);
        long long29 = dateTimeZone15.previousTransition(64001L);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone15.getShortName(5L, locale31);
        org.joda.time.Chronology chronology33 = copticChronology0.withZone(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField14", (durationField6.compareTo(durationField14) == 0) == durationField6.equals(durationField14));
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0381");
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
        org.joda.time.DurationField durationField17 = copticChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField16", (durationField7.compareTo(durationField16) == 0) == durationField7.equals(durationField16));
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0382");
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
        org.joda.time.DurationField durationField17 = copticChronology0.centuries();
        org.joda.time.DurationField durationField18 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField3, and durationField4", !(durationField18.compareTo(durationField3) == 0) || (Math.signum(durationField18.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0383");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField6", Math.signum(durationField1.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField1)));
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0384");
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
        int int11 = copticChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField10", (durationField7.compareTo(durationField10) == 0) == durationField7.equals(durationField10));
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0385");
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
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField14 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean17 = dateTimeZone16.isFixed();
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
        boolean boolean33 = dateTimeZone24.isStandardOffset((long) (short) 1);
        long long35 = dateTimeZone16.getMillisKeepLocal(dateTimeZone24, 35L);
        int int37 = dateTimeZone24.getOffsetFromLocal(99L);
        long long39 = dateTimeZone24.nextTransition((long) 0);
        org.joda.time.Chronology chronology40 = copticChronology0.withZone(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField23", (durationField6.compareTo(durationField23) == 0) == durationField6.equals(durationField23));
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0386");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField2 = copticChronology0.eras();
        java.lang.String str3 = copticChronology0.toString();
        org.joda.time.DurationField durationField4 = copticChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField4, and durationField2", !(durationField2.compareTo(durationField4) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField4.compareTo(durationField2))));
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0387");
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
        org.joda.time.DateTimeField dateTimeField62 = chronology60.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField61", (durationField5.compareTo(durationField61) == 0) == durationField5.equals(durationField61));
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0388");
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
        org.joda.time.DurationField durationField10 = copticChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField9", (durationField7.compareTo(durationField9) == 0) == durationField7.equals(durationField9));
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0389");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DurationField durationField3 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField3", (durationField2.compareTo(durationField3) == 0) == durationField2.equals(durationField3));
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0390");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.hours();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField2", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0391");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField8, and durationField3", !(durationField3.compareTo(durationField8) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField8.compareTo(durationField3))));
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0392");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField10 = copticChronology0.centuries();
        org.joda.time.DurationField durationField11 = copticChronology0.weekyears();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField13 = copticChronology12.seconds();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = copticChronology12.add(readablePeriod14, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = copticChronology12.add(readablePeriod18, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone22 = copticChronology12.getZone();
        long long25 = dateTimeZone22.adjustOffset(10L, true);
        int int27 = dateTimeZone22.getOffsetFromLocal((long) 'a');
        long long29 = dateTimeZone22.previousTransition(5L);
        long long32 = dateTimeZone22.adjustOffset(58L, true);
        java.util.TimeZone timeZone33 = dateTimeZone22.toTimeZone();
        org.joda.time.Chronology chronology34 = copticChronology0.withZone(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.era();
        org.joda.time.chrono.CopticChronology copticChronology36 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField37 = copticChronology36.seconds();
        org.joda.time.DurationField durationField38 = copticChronology36.years();
        org.joda.time.DateTimeField dateTimeField39 = copticChronology36.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField40 = copticChronology36.era();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology36.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField42 = copticChronology36.year();
        org.joda.time.DateTimeField dateTimeField43 = copticChronology36.yearOfCentury();
        org.joda.time.chrono.CopticChronology copticChronology44 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField45 = copticChronology44.seconds();
        org.joda.time.DurationField durationField46 = copticChronology44.millis();
        org.joda.time.DateTimeField dateTimeField47 = copticChronology44.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField48 = copticChronology44.minuteOfDay();
        org.joda.time.DurationField durationField49 = copticChronology44.seconds();
        org.joda.time.DateTimeZone dateTimeZone50 = copticChronology44.getZone();
        boolean boolean52 = dateTimeZone50.isStandardOffset((-359999989L));
        org.joda.time.ReadableInstant readableInstant53 = null;
        int int54 = dateTimeZone50.getOffset(readableInstant53);
        org.joda.time.Chronology chronology55 = copticChronology36.withZone(dateTimeZone50);
        org.joda.time.Chronology chronology56 = chronology34.withZone(dateTimeZone50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField38", (durationField11.compareTo(durationField38) == 0) == durationField11.equals(durationField38));
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0393");
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
        java.lang.String str16 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.clockhourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField19 = copticChronology18.seconds();
        org.joda.time.DurationField durationField20 = copticChronology18.years();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology22 = copticChronology18.withZone(dateTimeZone21);
        java.lang.String str24 = dateTimeZone21.getNameKey((long) 1);
        int int26 = dateTimeZone21.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        int int29 = dateTimeZone21.getOffset((long) (byte) 1);
        int int31 = dateTimeZone21.getStandardOffset(0L);
        boolean boolean32 = dateTimeZone21.isFixed();
        org.joda.time.Chronology chronology33 = copticChronology0.withZone(dateTimeZone21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField20", (durationField6.compareTo(durationField20) == 0) == durationField6.equals(durationField20));
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0394");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.centuries();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField2", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0395");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField8 = copticChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField7", (durationField2.compareTo(durationField7) == 0) == durationField2.equals(durationField7));
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0396");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology9.secondOfMinute();
        org.joda.time.DurationField durationField12 = copticChronology9.halfdays();
        org.joda.time.DurationField durationField13 = copticChronology9.months();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology9.halfdayOfDay();
        org.joda.time.DurationField durationField15 = copticChronology9.weekyears();
        org.joda.time.DurationField durationField16 = copticChronology9.centuries();
        org.joda.time.DurationField durationField17 = copticChronology9.millis();
        org.joda.time.DateTimeZone dateTimeZone18 = copticChronology9.getZone();
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone18.getOffset(readableInstant19);
        org.joda.time.Chronology chronology21 = copticChronology0.withZone(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField8", Math.signum(durationField3.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField3)));
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0397");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.joda.time.DurationField durationField7 = copticChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField6", Math.signum(durationField1.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField1)));
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0398");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DurationField durationField7 = copticChronology0.years();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField8", (durationField7.compareTo(durationField8) == 0) == durationField7.equals(durationField8));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0399");
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
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField12", (durationField2.compareTo(durationField12) == 0) == durationField2.equals(durationField12));
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0400");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.secondOfDay();
        java.lang.String str11 = copticChronology0.toString();
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField3, and durationField4", !(durationField12.compareTo(durationField3) == 0) || (Math.signum(durationField12.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0401");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.DurationField durationField3 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.Chronology chronology5 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField6", Math.signum(durationField3.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField3)));
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0402");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField2", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0403");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.Chronology chronology4 = copticChronology0.withUTC();
        org.joda.time.Chronology chronology5 = chronology4.withUTC();
        org.joda.time.DurationField durationField6 = chronology4.months();
        org.joda.time.DurationField durationField7 = chronology4.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField2", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0404");
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
        org.joda.time.DateTimeField dateTimeField19 = copticChronology7.hourOfDay();
        org.joda.time.DurationField durationField20 = copticChronology7.seconds();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology7.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField20", (durationField1.compareTo(durationField20) == 0) == durationField1.equals(durationField20));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0405");
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
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField17 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField1, and durationField11", !(durationField17.compareTo(durationField1) == 0) || (Math.signum(durationField17.compareTo(durationField11)) == Math.signum(durationField1.compareTo(durationField11))));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0406");
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
        org.joda.time.DurationField durationField17 = copticChronology7.seconds();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology7.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField17", (durationField1.compareTo(durationField17) == 0) == durationField1.equals(durationField17));
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0407");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.millis();
        org.joda.time.DurationField durationField4 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField1, and durationField2", !(durationField5.compareTo(durationField1) == 0) || (Math.signum(durationField5.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0408");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DurationField durationField7 = copticChronology0.years();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField8", (durationField7.compareTo(durationField8) == 0) == durationField7.equals(durationField8));
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0409");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.secondOfDay();
        java.lang.String str11 = copticChronology0.toString();
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField3, and durationField4", !(durationField12.compareTo(durationField3) == 0) || (Math.signum(durationField12.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0410");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology4.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology4.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Chronology chronology8 = copticChronology4.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology4.year();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology4.getZone();
        long long14 = dateTimeZone10.convertLocalToUTC(100L, false, 1L);
        java.lang.String str15 = dateTimeZone10.getID();
        int int17 = dateTimeZone10.getOffsetFromLocal((long) (short) 10);
        boolean boolean18 = dateTimeZone10.isFixed();
        int int20 = dateTimeZone10.getOffset(1L);
        org.joda.time.Chronology chronology21 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField22 = chronology21.dayOfMonth();
        org.joda.time.DurationField durationField23 = chronology21.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField23, and durationField3", !(durationField3.compareTo(durationField23) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField23.compareTo(durationField3))));
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0411");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfDay();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = copticChronology6.eras();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology6.era();
        org.joda.time.DateTimeZone dateTimeZone11 = copticChronology6.getZone();
        org.joda.time.Chronology chronology12 = copticChronology0.withZone(dateTimeZone11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField9", Math.signum(durationField1.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField1)));
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0412");
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
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField17", Math.signum(durationField1.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField1)));
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0413");
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
        org.joda.time.DurationField durationField18 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField17 and durationField18", (durationField17.compareTo(durationField18) == 0) == durationField17.equals(durationField18));
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0414");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.era();
        long long13 = copticChronology7.add((long) 4, 36000035L, (int) '#');
        org.joda.time.Chronology chronology14 = copticChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.hourOfHalfday();
        org.joda.time.DurationField durationField16 = copticChronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField1, and durationField2", !(durationField16.compareTo(durationField1) == 0) || (Math.signum(durationField16.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0415");
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
        long long12 = dateTimeZone10.previousTransition((long) '#');
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField14 = copticChronology13.seconds();
        org.joda.time.DurationField durationField15 = copticChronology13.years();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology17 = copticChronology13.withZone(dateTimeZone16);
        java.lang.String str19 = dateTimeZone16.getNameKey((long) 1);
        boolean boolean20 = dateTimeZone10.equals((java.lang.Object) str19);
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField22 = copticChronology21.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField1, and durationField2", !(durationField22.compareTo(durationField1) == 0) || (Math.signum(durationField22.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0416");
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
        int int14 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField15 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField16 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField1, and durationField13", !(durationField16.compareTo(durationField1) == 0) || (Math.signum(durationField16.compareTo(durationField13)) == Math.signum(durationField1.compareTo(durationField13))));
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0417");
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
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField17 = copticChronology0.days();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forID("UTC");
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
        long long44 = dateTimeZone34.adjustOffset((-82799999L), true);
        org.joda.time.chrono.CopticChronology copticChronology45 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField46 = copticChronology45.seconds();
        org.joda.time.DurationField durationField47 = copticChronology45.years();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology49 = copticChronology45.withZone(dateTimeZone48);
        boolean boolean50 = dateTimeZone48.isFixed();
        java.lang.String str51 = dateTimeZone48.getID();
        org.joda.time.chrono.CopticChronology copticChronology53 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone48, 4);
        org.joda.time.DateTimeField dateTimeField54 = copticChronology53.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone55 = copticChronology53.getZone();
        long long57 = dateTimeZone34.getMillisKeepLocal(dateTimeZone55, 3600001L);
        boolean boolean58 = dateTimeZone19.equals((java.lang.Object) 3600001L);
        java.lang.String str59 = dateTimeZone19.toString();
        long long61 = dateTimeZone19.previousTransition(35265679578L);
        org.joda.time.Chronology chronology62 = copticChronology0.withZone(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField25", (durationField6.compareTo(durationField25) == 0) == durationField6.equals(durationField25));
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0418");
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
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField13 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField13", (durationField6.compareTo(durationField13) == 0) == durationField6.equals(durationField13));
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0419");
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
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField15", (durationField5.compareTo(durationField15) == 0) == durationField5.equals(durationField15));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0420");
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
        org.joda.time.DateTimeField dateTimeField17 = copticChronology7.clockhourOfDay();
        org.joda.time.DurationField durationField18 = copticChronology7.days();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology7.dayOfWeek();
        org.joda.time.DurationField durationField20 = copticChronology7.seconds();
        org.joda.time.DurationField durationField21 = copticChronology7.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField20", (durationField1.compareTo(durationField20) == 0) == durationField1.equals(durationField20));
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0421");
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
        org.joda.time.Chronology chronology11 = copticChronology8.withUTC();
        org.joda.time.DurationField durationField12 = copticChronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField1, and durationField2", !(durationField12.compareTo(durationField1) == 0) || (Math.signum(durationField12.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0422");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.minuteOfDay();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology9.clockhourOfHalfday();
        org.joda.time.DurationField durationField12 = copticChronology9.eras();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology9.era();
        java.lang.String str14 = copticChronology9.toString();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology9.era();
        boolean boolean16 = copticChronology0.equals((java.lang.Object) dateTimeField15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField12", Math.signum(durationField1.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField1)));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0423");
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
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField14", (durationField5.compareTo(durationField14) == 0) == durationField5.equals(durationField14));
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0424");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField6 = copticChronology0.millis();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField6", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField6)) == Math.signum(durationField1.compareTo(durationField6))));
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0425");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField2", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0426");
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
        org.joda.time.DateTimeField dateTimeField36 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField37 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField37, durationField3, and durationField11", !(durationField37.compareTo(durationField3) == 0) || (Math.signum(durationField37.compareTo(durationField11)) == Math.signum(durationField3.compareTo(durationField11))));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0427");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField9 = copticChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField8", (durationField2.compareTo(durationField8) == 0) == durationField2.equals(durationField8));
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0428");
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
        org.joda.time.DurationField durationField12 = copticChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField12, and durationField9", !(durationField9.compareTo(durationField12) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField12.compareTo(durationField9))));
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0429");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.years();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.Chronology chronology3 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField4 = copticChronology0.hours();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField1, and durationField4", !(durationField5.compareTo(durationField1) == 0) || (Math.signum(durationField5.compareTo(durationField4)) == Math.signum(durationField1.compareTo(durationField4))));
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0430");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Chronology chronology6 = copticChronology0.withZone(dateTimeZone5);
        int int7 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField3, and durationField4", !(durationField8.compareTo(durationField3) == 0) || (Math.signum(durationField8.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0431");
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
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone6.getName((long) (short) -1, locale12);
        long long15 = dateTimeZone6.convertUTCToLocal((long) 3600000);
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField17 = copticChronology16.seconds();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = copticChronology16.add(readablePeriod18, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField22 = copticChronology16.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology16.dayOfYear();
        org.joda.time.Chronology chronology24 = copticChronology16.withUTC();
        org.joda.time.DurationField durationField25 = copticChronology16.weekyears();
        org.joda.time.DurationField durationField26 = copticChronology16.weekyears();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology16.centuryOfEra();
        org.joda.time.DurationField durationField29 = copticChronology16.centuries();
        boolean boolean30 = dateTimeZone6.equals((java.lang.Object) durationField29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField25", (durationField5.compareTo(durationField25) == 0) == durationField5.equals(durationField25));
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0432");
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
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField10", (durationField2.compareTo(durationField10) == 0) == durationField2.equals(durationField10));
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0433");
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
        boolean boolean15 = dateTimeZone6.isStandardOffset((long) (short) 1);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone6.getOffset(readableInstant16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone6.getShortName(3600004L, locale19);
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6);
        org.joda.time.DurationField durationField22 = copticChronology21.weekyears();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology21.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField22", (durationField5.compareTo(durationField22) == 0) == durationField5.equals(durationField22));
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0434");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField5, and durationField7", !(durationField10.compareTo(durationField5) == 0) || (Math.signum(durationField10.compareTo(durationField7)) == Math.signum(durationField5.compareTo(durationField7))));
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0435");
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
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField17", (durationField7.compareTo(durationField17) == 0) == durationField7.equals(durationField17));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0436");
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
        org.joda.time.DurationField durationField14 = copticChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField13", (durationField6.compareTo(durationField13) == 0) == durationField6.equals(durationField13));
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0437");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField7", Math.signum(durationField3.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField3)));
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0438");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField1, and durationField2", !(durationField6.compareTo(durationField1) == 0) || (Math.signum(durationField6.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0439");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField13", Math.signum(durationField1.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField1)));
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0440");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfHalfday();
        long long8 = copticChronology0.add((long) (byte) -1, (long) 100, 10);
        org.joda.time.DurationField durationField9 = copticChronology0.days();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        java.lang.String str11 = copticChronology0.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField10", Math.signum(durationField9.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField9)));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0441");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyear();
        int int8 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = copticChronology0.add(readablePeriod9, (-52087190399000L), (int) (short) 10);
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField1, and durationField2", !(durationField13.compareTo(durationField1) == 0) || (Math.signum(durationField13.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0442");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.year();
        java.lang.String str7 = copticChronology0.toString();
        org.joda.time.DurationField durationField8 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.monthOfYear();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology12.secondOfMinute();
        org.joda.time.DurationField durationField15 = copticChronology12.halfdays();
        int int16 = copticChronology12.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField17 = copticChronology12.months();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology12.year();
        org.joda.time.DateTimeZone dateTimeZone19 = copticChronology12.getZone();
        java.lang.String str20 = dateTimeZone19.toString();
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone19.isLocalDateTimeGap(localDateTime21);
        org.joda.time.Chronology chronology23 = copticChronology0.withZone(dateTimeZone19);
        org.joda.time.DurationField durationField24 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField3, and durationField4", !(durationField24.compareTo(durationField3) == 0) || (Math.signum(durationField24.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0443");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField2", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0444");
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
        org.joda.time.DateTimeField dateTimeField30 = chronology29.millisOfDay();
        org.joda.time.DurationField durationField31 = chronology29.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField19", (durationField12.compareTo(durationField19) == 0) == durationField12.equals(durationField19));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0445");
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
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = copticChronology7.add(readablePeriod21, 32L, 363120000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField20", (durationField2.compareTo(durationField20) == 0) == durationField2.equals(durationField20));
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0446");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField8 = copticChronology0.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField7", (durationField8.compareTo(durationField7) == 0) == durationField8.equals(durationField7));
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0447");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DurationField durationField4 = copticChronology0.weeks();
        org.joda.time.DurationField durationField5 = copticChronology0.weeks();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DurationField durationField7 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField1, and durationField2", !(durationField11.compareTo(durationField1) == 0) || (Math.signum(durationField11.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0448");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.Chronology chronology7 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField6", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField6)) == Math.signum(durationField1.compareTo(durationField6))));
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0449");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.era();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField2", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0450");
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
        org.joda.time.DateTimeField dateTimeField18 = copticChronology12.year();
        org.joda.time.DateTimeZone dateTimeZone19 = copticChronology12.getZone();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology12.weekyear();
        org.joda.time.DurationField durationField21 = copticChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField1, and durationField2", !(durationField21.compareTo(durationField1) == 0) || (Math.signum(durationField21.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0451");
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
        org.joda.time.DateTimeField dateTimeField15 = copticChronology8.secondOfDay();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology16.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology16.secondOfMinute();
        org.joda.time.DurationField durationField19 = copticChronology16.halfdays();
        org.joda.time.DurationField durationField20 = copticChronology16.months();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology16.halfdayOfDay();
        org.joda.time.DurationField durationField22 = copticChronology16.weekyears();
        java.lang.Object obj23 = null;
        boolean boolean24 = copticChronology16.equals(obj23);
        org.joda.time.DateTimeField dateTimeField25 = copticChronology16.era();
        org.joda.time.DurationField durationField26 = copticChronology16.seconds();
        org.joda.time.DateTimeZone dateTimeZone27 = copticChronology16.getZone();
        org.joda.time.Chronology chronology28 = copticChronology8.withZone(dateTimeZone27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField22", (durationField2.compareTo(durationField22) == 0) == durationField2.equals(durationField22));
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0452");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = copticChronology0.add(readablePeriod8, 100L, (int) (short) 1);
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField3, and durationField4", !(durationField12.compareTo(durationField3) == 0) || (Math.signum(durationField12.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0453");
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
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = copticChronology11.getZone();
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone13.getShortName(10L, locale15);
        java.lang.String str18 = dateTimeZone13.getName((long) (-3600000));
        long long22 = dateTimeZone13.convertLocalToUTC(210L, true, 971L);
        boolean boolean23 = copticChronology8.equals((java.lang.Object) long22);
        org.joda.time.DurationField durationField24 = copticChronology8.years();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology8.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField24", (durationField2.compareTo(durationField24) == 0) == durationField2.equals(durationField24));
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0454");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone4 = copticChronology0.getZone();
        org.joda.time.DurationField durationField5 = copticChronology0.weeks();
        org.joda.time.DurationField durationField6 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfMinute();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = copticChronology8.seconds();
        org.joda.time.DurationField durationField10 = copticChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology8.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology8.weekOfWeekyear();
        org.joda.time.DurationField durationField13 = copticChronology8.weeks();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology14.secondOfMinute();
        org.joda.time.DurationField durationField17 = copticChronology14.halfdays();
        org.joda.time.DurationField durationField18 = copticChronology14.months();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology14.halfdayOfDay();
        org.joda.time.DurationField durationField20 = copticChronology14.weekyears();
        java.lang.Object obj21 = null;
        boolean boolean22 = copticChronology14.equals(obj21);
        org.joda.time.DateTimeField dateTimeField23 = copticChronology14.era();
        org.joda.time.Chronology chronology24 = copticChronology14.withUTC();
        org.joda.time.DateTimeZone dateTimeZone25 = copticChronology14.getZone();
        org.joda.time.Chronology chronology26 = copticChronology8.withZone(dateTimeZone25);
        org.joda.time.chrono.CopticChronology copticChronology28 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone25, (int) (byte) 1);
        org.joda.time.Chronology chronology29 = copticChronology0.withZone(dateTimeZone25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField20", (durationField2.compareTo(durationField20) == 0) == durationField2.equals(durationField20));
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0455");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField7 = copticChronology0.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField7, and durationField3", !(durationField3.compareTo(durationField7) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField7.compareTo(durationField3))));
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0456");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.clockhourOfDay();
        org.joda.time.DurationField durationField10 = copticChronology7.weekyears();
        org.joda.time.DurationField durationField11 = copticChronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField10", (durationField2.compareTo(durationField10) == 0) == durationField2.equals(durationField10));
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0457");
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
        org.joda.time.DateTimeField dateTimeField20 = copticChronology7.yearOfEra();
        org.joda.time.DurationField durationField21 = copticChronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField1, and durationField2", !(durationField21.compareTo(durationField1) == 0) || (Math.signum(durationField21.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0458");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, (-1260001126L), 0);
        org.joda.time.DurationField durationField10 = copticChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField10, and durationField3", !(durationField3.compareTo(durationField10) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField10.compareTo(durationField3))));
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0459");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField5 = copticChronology0.minutes();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField1, and durationField2", !(durationField6.compareTo(durationField1) == 0) || (Math.signum(durationField6.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0460");
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
        org.joda.time.DurationField durationField20 = copticChronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField1, and durationField2", !(durationField20.compareTo(durationField1) == 0) || (Math.signum(durationField20.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0461");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = chronology4.millis();
        org.joda.time.DurationField durationField6 = chronology4.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField1, and durationField2", !(durationField6.compareTo(durationField1) == 0) || (Math.signum(durationField6.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0462");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField6, and durationField8", !(durationField9.compareTo(durationField6) == 0) || (Math.signum(durationField9.compareTo(durationField8)) == Math.signum(durationField6.compareTo(durationField8))));
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0463");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Chronology chronology12 = copticChronology8.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology8.year();
        org.joda.time.DurationField durationField14 = copticChronology8.months();
        org.joda.time.DurationField durationField15 = copticChronology8.months();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology8.yearOfEra();
        org.joda.time.DurationField durationField17 = copticChronology8.halfdays();
        org.joda.time.DurationField durationField18 = copticChronology8.months();
        org.joda.time.DurationField durationField19 = copticChronology8.seconds();
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology20.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology20.secondOfMinute();
        org.joda.time.DurationField durationField23 = copticChronology20.halfdays();
        int int24 = copticChronology20.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology20.weekyearOfCentury();
        org.joda.time.DurationField durationField26 = copticChronology20.halfdays();
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
        int int50 = dateTimeZone33.getStandardOffset((long) (byte) 100);
        long long53 = dateTimeZone33.convertLocalToUTC((long) (byte) 0, true);
        java.util.Locale locale55 = null;
        java.lang.String str56 = dateTimeZone33.getShortName(999L, locale55);
        long long60 = dateTimeZone33.convertLocalToUTC(0L, false, (long) (byte) 0);
        org.joda.time.Chronology chronology61 = copticChronology20.withZone(dateTimeZone33);
        int int63 = dateTimeZone33.getOffsetFromLocal((-53175657599990L));
        org.joda.time.Chronology chronology64 = copticChronology8.withZone(dateTimeZone33);
        long long66 = dateTimeZone33.nextTransition((long) (short) 100);
        org.joda.time.Chronology chronology67 = copticChronology0.withZone(dateTimeZone33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField7", Math.signum(durationField6.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField6)));
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0464");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        long long9 = copticChronology0.add((long) 100, (long) (-1), 10);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField11", Math.signum(durationField3.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField3)));
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0465");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField3 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField5 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField5", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0466");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField8, and durationField6", !(durationField6.compareTo(durationField8) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField8.compareTo(durationField6))));
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0467");
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
        org.joda.time.DurationField durationField32 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField32, durationField1, and durationField2", !(durationField32.compareTo(durationField1) == 0) || (Math.signum(durationField32.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0468");
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
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField14 = copticChronology13.seconds();
        org.joda.time.DurationField durationField15 = copticChronology13.years();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology17 = copticChronology13.withZone(dateTimeZone16);
        java.lang.String str19 = dateTimeZone16.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology20.millisOfSecond();
        org.joda.time.DurationField durationField22 = copticChronology20.centuries();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = copticChronology20.add(readablePeriod23, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField27 = copticChronology20.year();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology20.yearOfEra();
        org.joda.time.Chronology chronology29 = copticChronology20.withUTC();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology20.centuryOfEra();
        org.joda.time.Chronology chronology31 = copticChronology20.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology32 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.Chronology chronology33 = copticChronology32.withUTC();
        org.joda.time.DurationField durationField34 = copticChronology32.years();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        long long38 = copticChronology32.add(readablePeriod35, (long) 1, (int) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology39 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField40 = copticChronology39.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology39.year();
        org.joda.time.chrono.CopticChronology copticChronology42 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField43 = copticChronology42.seconds();
        org.joda.time.DurationField durationField44 = copticChronology42.years();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology46 = copticChronology42.withZone(dateTimeZone45);
        java.lang.String str48 = dateTimeZone45.getNameKey((long) 1);
        org.joda.time.Chronology chronology49 = copticChronology39.withZone(dateTimeZone45);
        long long52 = dateTimeZone45.convertLocalToUTC((long) 0, true);
        long long54 = dateTimeZone45.convertUTCToLocal((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        long long58 = dateTimeZone45.getMillisKeepLocal(dateTimeZone56, (long) 100);
        org.joda.time.Chronology chronology59 = copticChronology32.withZone(dateTimeZone45);
        java.lang.String str61 = dateTimeZone45.getName(3600001L);
        org.joda.time.Chronology chronology62 = chronology31.withZone(dateTimeZone45);
        org.joda.time.DurationField durationField63 = chronology31.weeks();
        org.joda.time.DateTimeField dateTimeField64 = chronology31.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        boolean boolean68 = dateTimeZone66.isStandardOffset((-1L));
        org.joda.time.Chronology chronology69 = chronology31.withZone(dateTimeZone66);
        java.util.Locale locale71 = null;
        java.lang.String str72 = dateTimeZone66.getName(5L, locale71);
        org.joda.time.Chronology chronology73 = copticChronology0.withZone(dateTimeZone66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField15", (durationField6.compareTo(durationField15) == 0) == durationField6.equals(durationField15));
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0469");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.yearOfEra();
        long long6 = copticChronology0.add(210L, 3600035L, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.joda.time.DurationField durationField9 = copticChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField9, and durationField8", !(durationField8.compareTo(durationField9) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField9.compareTo(durationField8))));
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0470");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField11 = copticChronology0.minutes();
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField6, and durationField8", !(durationField12.compareTo(durationField6) == 0) || (Math.signum(durationField12.compareTo(durationField8)) == Math.signum(durationField6.compareTo(durationField8))));
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0471");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField6", (durationField2.compareTo(durationField6) == 0) == durationField2.equals(durationField6));
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0472");
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
        org.joda.time.DurationField durationField21 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField1, and durationField16", !(durationField21.compareTo(durationField1) == 0) || (Math.signum(durationField21.compareTo(durationField16)) == Math.signum(durationField1.compareTo(durationField16))));
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0473");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField12 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.minuteOfDay();
        java.lang.String str16 = copticChronology0.toString();
        org.joda.time.DurationField durationField17 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField1, and durationField12", !(durationField17.compareTo(durationField1) == 0) || (Math.signum(durationField17.compareTo(durationField12)) == Math.signum(durationField1.compareTo(durationField12))));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0474");
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
        boolean boolean11 = dateTimeZone6.isFixed();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology13.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.Chronology chronology17 = copticChronology13.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology13.year();
        org.joda.time.DateTimeZone dateTimeZone19 = copticChronology13.getZone();
        long long23 = dateTimeZone19.convertLocalToUTC(100L, false, 1L);
        java.lang.String str24 = dateTimeZone19.getID();
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone19.getOffset(readableInstant25);
        org.joda.time.Chronology chronology27 = copticChronology12.withZone(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField28 = copticChronology12.secondOfDay();
        org.joda.time.DurationField durationField29 = copticChronology12.weekyears();
        org.joda.time.DateTimeZone dateTimeZone30 = copticChronology12.getZone();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 0);
        int int35 = dateTimeZone33.getOffset(90L);
        java.lang.String str36 = dateTimeZone33.toString();
        java.lang.String str37 = dateTimeZone33.toString();
        boolean boolean38 = copticChronology12.equals((java.lang.Object) dateTimeZone33);
        java.lang.String str39 = dateTimeZone33.getID();
        long long42 = dateTimeZone33.adjustOffset(28L, true);
        long long44 = dateTimeZone6.getMillisKeepLocal(dateTimeZone33, (-35999896L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField29", (durationField5.compareTo(durationField29) == 0) == durationField5.equals(durationField29));
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0475");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField1, and durationField2", !(durationField6.compareTo(durationField1) == 0) || (Math.signum(durationField6.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0476");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.year();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField6, and durationField5", !(durationField5.compareTo(durationField6) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField6.compareTo(durationField5))));
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0477");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField3, and durationField4", !(durationField12.compareTo(durationField3) == 0) || (Math.signum(durationField12.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0478");
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
        org.joda.time.DurationField durationField19 = copticChronology18.halfdays();
        org.joda.time.Chronology chronology20 = copticChronology18.withUTC();
        org.joda.time.DurationField durationField21 = chronology20.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField1, and durationField2", !(durationField21.compareTo(durationField1) == 0) || (Math.signum(durationField21.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0479");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.Chronology chronology9 = copticChronology0.withZone(dateTimeZone8);
        org.joda.time.DurationField durationField10 = chronology9.years();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField10", (durationField6.compareTo(durationField10) == 0) == durationField6.equals(durationField10));
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0480");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.Chronology chronology4 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField1, and durationField2", !(durationField5.compareTo(durationField1) == 0) || (Math.signum(durationField5.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0481");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        int int8 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField9 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfHour();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology11.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology11.weekyear();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology11.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology11.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology11.weekyear();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology11.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology11.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology11.millisOfSecond();
        org.joda.time.DurationField durationField21 = copticChronology11.centuries();
        org.joda.time.DurationField durationField22 = copticChronology11.weekyears();
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = copticChronology23.seconds();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        long long28 = copticChronology23.add(readablePeriod25, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        long long32 = copticChronology23.add(readablePeriod29, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone33 = copticChronology23.getZone();
        long long36 = dateTimeZone33.adjustOffset(10L, true);
        int int38 = dateTimeZone33.getOffsetFromLocal((long) 'a');
        long long40 = dateTimeZone33.previousTransition(5L);
        long long43 = dateTimeZone33.adjustOffset(58L, true);
        java.util.TimeZone timeZone44 = dateTimeZone33.toTimeZone();
        org.joda.time.Chronology chronology45 = copticChronology11.withZone(dateTimeZone33);
        org.joda.time.Chronology chronology46 = copticChronology0.withZone(dateTimeZone33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField22", (durationField2.compareTo(durationField22) == 0) == durationField2.equals(durationField22));
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0482");
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
        org.joda.time.DurationField durationField34 = chronology33.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField34, durationField1, and durationField2", !(durationField34.compareTo(durationField1) == 0) || (Math.signum(durationField34.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0483");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField2", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0484");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DurationField durationField4 = copticChronology0.weeks();
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = copticChronology5.seconds();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField8 = copticChronology7.seconds();
        org.joda.time.DurationField durationField9 = copticChronology7.years();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology11 = copticChronology7.withZone(dateTimeZone10);
        java.lang.String str13 = dateTimeZone10.getNameKey((long) 1);
        boolean boolean15 = dateTimeZone10.equals((java.lang.Object) (-1.0f));
        int int17 = dateTimeZone10.getOffset((long) 100);
        org.joda.time.Chronology chronology18 = copticChronology5.withZone(dateTimeZone10);
        org.joda.time.Chronology chronology19 = copticChronology0.withZone(dateTimeZone10);
        long long23 = dateTimeZone10.convertLocalToUTC(36000010403L, false, (-50036659200000L));
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField25 = copticChronology24.seconds();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        long long29 = copticChronology24.add(readablePeriod26, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        long long33 = copticChronology24.add(readablePeriod30, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField34 = copticChronology24.minuteOfDay();
        org.joda.time.DurationField durationField35 = copticChronology24.centuries();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology24.minuteOfHour();
        org.joda.time.DurationField durationField37 = copticChronology24.halfdays();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology24.hourOfDay();
        org.joda.time.DateTimeField dateTimeField39 = copticChronology24.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField40 = copticChronology24.weekyearOfCentury();
        org.joda.time.DurationField durationField41 = copticChronology24.weekyears();
        org.joda.time.DateTimeField dateTimeField42 = copticChronology24.millisOfDay();
        boolean boolean43 = dateTimeZone10.equals((java.lang.Object) dateTimeField42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField41", (durationField9.compareTo(durationField41) == 0) == durationField9.equals(durationField41));
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0485");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.era();
        java.lang.String str4 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.joda.time.DurationField durationField7 = copticChronology0.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField6", Math.signum(durationField1.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField1)));
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0486");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        boolean boolean8 = dateTimeZone3.equals((java.lang.Object) (-1.0f));
        int int10 = dateTimeZone3.getOffset((long) 100);
        boolean boolean11 = dateTimeZone3.isFixed();
        java.lang.String str13 = dateTimeZone3.getName((-359999968L));
        long long15 = dateTimeZone3.convertUTCToLocal((-359999910L));
        int int17 = dateTimeZone3.getOffsetFromLocal(97L);
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology18.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology18.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = copticChronology18.eras();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology18.dayOfMonth();
        java.lang.String str23 = copticChronology18.toString();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology18.hourOfHalfday();
        org.joda.time.DurationField durationField25 = copticChronology18.eras();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology18.weekyear();
        boolean boolean27 = dateTimeZone3.equals((java.lang.Object) dateTimeField26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField21", Math.signum(durationField1.compareTo(durationField21)) == -Math.signum(durationField21.compareTo(durationField1)));
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0487");
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
        org.joda.time.DateTimeField dateTimeField28 = copticChronology7.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField27", (durationField2.compareTo(durationField27) == 0) == durationField2.equals(durationField27));
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0488");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.era();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField10 = copticChronology0.hours();
        org.joda.time.DurationField durationField11 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField1, and durationField2", !(durationField13.compareTo(durationField1) == 0) || (Math.signum(durationField13.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0489");
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
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        long long20 = dateTimeZone18.nextTransition(999L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        org.joda.time.Chronology chronology22 = copticChronology0.withZone(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField14", Math.signum(durationField13.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField13)));
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0490");
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
        org.joda.time.DurationField durationField14 = copticChronology7.seconds();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField14", (durationField1.compareTo(durationField14) == 0) == durationField1.equals(durationField14));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0491");
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
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField8", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField8)) == Math.signum(durationField3.compareTo(durationField8))));
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0492");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        long long10 = copticChronology0.add((-10661994336L), 3600000000L, (int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField6", Math.signum(durationField1.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField1)));
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0493");
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
        long long15 = dateTimeZone6.convertUTCToLocal((long) (short) -1);
        java.lang.String str16 = dateTimeZone6.getID();
        long long18 = dateTimeZone6.previousTransition((long) (short) -1);
        boolean boolean19 = dateTimeZone6.isFixed();
        int int21 = dateTimeZone6.getOffsetFromLocal((long) (byte) -1);
        java.lang.String str23 = dateTimeZone6.getNameKey((-100L));
        int int25 = dateTimeZone6.getStandardOffset(8280000022L);
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField27 = copticChronology26.days();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology26.monthOfYear();
        org.joda.time.DurationField durationField29 = copticChronology26.years();
        org.joda.time.DurationField durationField30 = copticChronology26.days();
        boolean boolean31 = dateTimeZone6.equals((java.lang.Object) copticChronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField29", (durationField5.compareTo(durationField29) == 0) == durationField5.equals(durationField29));
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0494");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField9 = copticChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField8", (durationField2.compareTo(durationField8) == 0) == durationField2.equals(durationField8));
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0495");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.joda.time.DurationField durationField8 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField11 = copticChronology0.months();
        org.joda.time.DurationField durationField12 = copticChronology0.minutes();
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField5", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0496");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        int int8 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField9 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField9", (durationField2.compareTo(durationField9) == 0) == durationField2.equals(durationField9));
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0497");
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
        int int23 = dateTimeZone6.getStandardOffset((long) (byte) 100);
        long long26 = dateTimeZone6.convertLocalToUTC((long) (byte) 0, true);
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6);
        org.joda.time.DurationField durationField28 = copticChronology27.seconds();
        int int29 = copticChronology27.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField28", (durationField4.compareTo(durationField28) == 0) == durationField4.equals(durationField28));
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0498");
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
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField20 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField1, and durationField2", !(durationField20.compareTo(durationField1) == 0) || (Math.signum(durationField20.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0499");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        long long8 = dateTimeZone5.adjustOffset((long) '#', false);
        int int10 = dateTimeZone5.getStandardOffset((-494399989L));
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology11.clockhourOfHalfday();
        org.joda.time.DurationField durationField14 = copticChronology11.eras();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology11.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone16 = copticChronology11.getZone();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology11.era();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology11.secondOfMinute();
        boolean boolean19 = dateTimeZone5.equals((java.lang.Object) copticChronology11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField14", Math.signum(durationField3.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField3)));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0500");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.Chronology chronology4 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) '4');
        boolean boolean9 = dateTimeZone8.isFixed();
        org.joda.time.Chronology chronology10 = copticChronology0.withZone(dateTimeZone8);
        org.joda.time.DurationField durationField11 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField1, and durationField2", !(durationField11.compareTo(durationField1) == 0) || (Math.signum(durationField11.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }
}

