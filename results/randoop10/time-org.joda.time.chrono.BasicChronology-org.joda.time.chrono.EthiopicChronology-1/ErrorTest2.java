import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1001");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = ethiopicChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = ethiopicChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology7.yearOfEra();
        org.joda.time.Chronology chronology16 = ethiopicChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology7.yearOfCentury();
        java.lang.String str18 = ethiopicChronology7.toString();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology7.year();
        org.joda.time.DurationField durationField20 = ethiopicChronology7.years();
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology7.hourOfHalfday();
        org.joda.time.DurationField durationField22 = ethiopicChronology7.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField20", (durationField2.compareTo(durationField20) == 0) == durationField2.equals(durationField20));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.minuteOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology5 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology5.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone7 = ethiopicChronology5.getZone();
        java.lang.String str9 = dateTimeZone7.getNameKey((long) ' ');
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = ethiopicChronology10.seconds();
        org.joda.time.DurationField durationField12 = ethiopicChronology10.years();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology14 = ethiopicChronology10.withZone(dateTimeZone13);
        int int16 = dateTimeZone13.getOffset((long) 0);
        int int18 = dateTimeZone13.getOffset((long) (byte) 1);
        boolean boolean19 = dateTimeZone7.equals((java.lang.Object) dateTimeZone13);
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = dateTimeZone13.getOffset(readableInstant20);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone13.getShortName(1L, locale23);
        org.joda.time.Chronology chronology25 = ethiopicChronology0.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology0.year();
        org.joda.time.DurationField durationField28 = ethiopicChronology0.weekyears();
        org.joda.time.DurationField durationField29 = ethiopicChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField28", (durationField12.compareTo(durationField28) == 0) == durationField12.equals(durationField28));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.weekyear();
        java.lang.String str15 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField16 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology0.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField16", Math.signum(durationField1.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField1)));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.weekyears();
        java.lang.String str8 = ethiopicChronology0.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField7", (durationField2.compareTo(durationField7) == 0) == durationField2.equals(durationField7));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.eras();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField12, and durationField11", !(durationField11.compareTo(durationField12) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField12.compareTo(durationField11))));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(100);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = ethiopicChronology2.seconds();
        org.joda.time.DurationField durationField4 = ethiopicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField6 = ethiopicChronology2.seconds();
        org.joda.time.DurationField durationField7 = ethiopicChronology2.centuries();
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) ethiopicChronology2);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology9.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.Chronology chronology13 = ethiopicChronology9.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology9.year();
        org.joda.time.DateTimeZone dateTimeZone15 = ethiopicChronology9.getZone();
        long long19 = dateTimeZone15.convertLocalToUTC(100L, false, 1L);
        java.lang.String str20 = dateTimeZone15.getID();
        org.joda.time.Chronology chronology21 = ethiopicChronology2.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology2.yearOfEra();
        org.joda.time.DurationField durationField23 = ethiopicChronology2.years();
        org.joda.time.DateTimeField dateTimeField24 = ethiopicChronology2.minuteOfDay();
        org.joda.time.DurationField durationField25 = ethiopicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology2.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField25", (durationField4.compareTo(durationField25) == 0) == durationField4.equals(durationField25));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = ethiopicChronology0.add(readablePeriod12, (long) ' ', (int) ' ');
        org.joda.time.DurationField durationField16 = ethiopicChronology0.weekyears();
        org.joda.time.DurationField durationField17 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField18 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField20 = ethiopicChronology0.minutes();
        java.lang.String str21 = ethiopicChronology0.toString();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology22 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology22.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone24 = ethiopicChronology22.getZone();
        java.lang.String str26 = dateTimeZone24.getNameKey((long) ' ');
        org.joda.time.chrono.EthiopicChronology ethiopicChronology27 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField28 = ethiopicChronology27.seconds();
        org.joda.time.DurationField durationField29 = ethiopicChronology27.years();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology31 = ethiopicChronology27.withZone(dateTimeZone30);
        int int33 = dateTimeZone30.getOffset((long) 0);
        int int35 = dateTimeZone30.getOffset((long) (byte) 1);
        boolean boolean36 = dateTimeZone24.equals((java.lang.Object) dateTimeZone30);
        long long38 = dateTimeZone30.convertUTCToLocal((long) (short) -1);
        org.joda.time.LocalDateTime localDateTime39 = null;
        boolean boolean40 = dateTimeZone30.isLocalDateTimeGap(localDateTime39);
        org.joda.time.Chronology chronology41 = ethiopicChronology0.withZone(dateTimeZone30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField29", (durationField16.compareTo(durationField29) == 0) == durationField16.equals(durationField29));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.millis();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField10 = ethiopicChronology9.seconds();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = ethiopicChronology9.add(readablePeriod11, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology9.secondOfDay();
        org.joda.time.DurationField durationField16 = ethiopicChronology9.weekyears();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forID("+00:00");
        java.lang.String str19 = dateTimeZone18.getID();
        boolean boolean20 = dateTimeZone18.isFixed();
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone18.getShortName((long) (-1), locale22);
        org.joda.time.Chronology chronology24 = ethiopicChronology9.withZone(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone25 = ethiopicChronology9.getZone();
        java.lang.String str26 = dateTimeZone25.getID();
        org.joda.time.Chronology chronology27 = ethiopicChronology0.withZone(dateTimeZone25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField16", (durationField2.compareTo(durationField16) == 0) == durationField2.equals(durationField16));
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology7.clockhourOfDay();
        org.joda.time.DurationField durationField10 = ethiopicChronology7.days();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology7.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone12 = ethiopicChronology7.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology13 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology13.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology13.secondOfMinute();
        org.joda.time.DurationField durationField16 = ethiopicChronology13.halfdays();
        org.joda.time.DurationField durationField17 = ethiopicChronology13.months();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology13.year();
        java.lang.String str20 = ethiopicChronology13.toString();
        org.joda.time.DurationField durationField21 = ethiopicChronology13.days();
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology13.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField24 = ethiopicChronology13.monthOfYear();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology25 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology25.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology25.secondOfMinute();
        org.joda.time.DurationField durationField28 = ethiopicChronology25.halfdays();
        int int29 = ethiopicChronology25.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField30 = ethiopicChronology25.months();
        org.joda.time.DateTimeField dateTimeField31 = ethiopicChronology25.year();
        org.joda.time.DateTimeZone dateTimeZone32 = ethiopicChronology25.getZone();
        java.lang.String str33 = dateTimeZone32.toString();
        org.joda.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = dateTimeZone32.isLocalDateTimeGap(localDateTime34);
        org.joda.time.Chronology chronology36 = ethiopicChronology13.withZone(dateTimeZone32);
        org.joda.time.Chronology chronology37 = ethiopicChronology7.withZone(dateTimeZone32);
        java.lang.String str39 = dateTimeZone32.getShortName((-1L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone32);
        int int42 = dateTimeZone32.getOffsetFromLocal((-4L));
        long long44 = dateTimeZone32.convertUTCToLocal((-13098240037919899L));
        org.joda.time.chrono.EthiopicChronology ethiopicChronology45 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField46 = ethiopicChronology45.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField47 = ethiopicChronology45.secondOfMinute();
        org.joda.time.DurationField durationField48 = ethiopicChronology45.halfdays();
        org.joda.time.DurationField durationField49 = ethiopicChronology45.months();
        org.joda.time.DateTimeField dateTimeField50 = ethiopicChronology45.halfdayOfDay();
        org.joda.time.DurationField durationField51 = ethiopicChronology45.weekyears();
        java.lang.Object obj52 = null;
        boolean boolean53 = ethiopicChronology45.equals(obj52);
        org.joda.time.DateTimeField dateTimeField54 = ethiopicChronology45.yearOfCentury();
        org.joda.time.DurationField durationField55 = ethiopicChronology45.weeks();
        org.joda.time.DurationField durationField56 = ethiopicChronology45.centuries();
        org.joda.time.DurationField durationField57 = ethiopicChronology45.millis();
        org.joda.time.DateTimeField dateTimeField58 = ethiopicChronology45.weekyear();
        boolean boolean59 = dateTimeZone32.equals((java.lang.Object) ethiopicChronology45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField51", (durationField2.compareTo(durationField51) == 0) == durationField2.equals(durationField51));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.year();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.weekyears();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.minutes();
        org.joda.time.DurationField durationField14 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField1, and durationField12", !(durationField14.compareTo(durationField1) == 0) || (Math.signum(durationField14.compareTo(durationField12)) == Math.signum(durationField1.compareTo(durationField12))));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.weekyears();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology8.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Chronology chronology12 = ethiopicChronology8.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology8.year();
        org.joda.time.DateTimeZone dateTimeZone14 = ethiopicChronology8.getZone();
        long long18 = dateTimeZone14.convertLocalToUTC(100L, false, 1L);
        int int20 = dateTimeZone14.getOffsetFromLocal((long) 10);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone14.getOffset(readableInstant21);
        org.joda.time.Chronology chronology23 = ethiopicChronology0.withZone(dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField7", (durationField2.compareTo(durationField7) == 0) == durationField2.equals(durationField7));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology0.add(readablePeriod7, 32L, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.weekyear();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology12.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology12.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology15 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField16 = ethiopicChronology15.seconds();
        org.joda.time.DurationField durationField17 = ethiopicChronology15.years();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology19 = ethiopicChronology15.withZone(dateTimeZone18);
        java.lang.String str21 = dateTimeZone18.getNameKey((long) 1);
        org.joda.time.Chronology chronology22 = ethiopicChronology12.withZone(dateTimeZone18);
        long long25 = dateTimeZone18.convertLocalToUTC((long) 0, true);
        long long27 = dateTimeZone18.convertUTCToLocal((long) (short) -1);
        java.lang.String str28 = dateTimeZone18.getID();
        long long30 = dateTimeZone18.previousTransition((long) (short) -1);
        boolean boolean31 = dateTimeZone18.isFixed();
        int int33 = dateTimeZone18.getOffsetFromLocal((long) (byte) -1);
        java.lang.String str35 = dateTimeZone18.getNameKey((-100L));
        int int37 = dateTimeZone18.getStandardOffset(8280000022L);
        long long39 = dateTimeZone18.previousTransition(86L);
        int int41 = dateTimeZone18.getStandardOffset((-65L));
        java.lang.String str43 = dateTimeZone18.getNameKey((-48647990967L));
        org.joda.time.Chronology chronology44 = ethiopicChronology0.withZone(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField17", (durationField6.compareTo(durationField17) == 0) == durationField6.equals(durationField17));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = ethiopicChronology12.getZone();
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) ethiopicChronology12);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology17 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology18 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology18.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology18.millisOfSecond();
        org.joda.time.DurationField durationField21 = ethiopicChronology18.millis();
        org.joda.time.DurationField durationField22 = ethiopicChronology18.weekyears();
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology18.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField22", (durationField2.compareTo(durationField22) == 0) == durationField2.equals(durationField22));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.hourOfHalfday();
        org.joda.time.DurationField durationField10 = ethiopicChronology8.centuries();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology8.clockhourOfHalfday();
        org.joda.time.DurationField durationField12 = ethiopicChronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField1, and durationField2", !(durationField12.compareTo(durationField1) == 0) || (Math.signum(durationField12.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = ethiopicChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = ethiopicChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology7.yearOfEra();
        org.joda.time.Chronology chronology16 = ethiopicChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology7.centuryOfEra();
        org.joda.time.DurationField durationField18 = ethiopicChronology7.weeks();
        org.joda.time.DurationField durationField19 = ethiopicChronology7.minutes();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology7.clockhourOfHalfday();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology21 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology21.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology21.secondOfMinute();
        org.joda.time.DurationField durationField24 = ethiopicChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology21.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology21.weekyear();
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology21.millisOfSecond();
        int int28 = ethiopicChronology21.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField29 = ethiopicChronology21.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField30 = ethiopicChronology21.weekyear();
        org.joda.time.DateTimeZone dateTimeZone31 = ethiopicChronology21.getZone();
        boolean boolean32 = ethiopicChronology7.equals((java.lang.Object) dateTimeZone31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField24", (durationField18.compareTo(durationField24) == 0) == durationField18.equals(durationField24));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.year();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.era();
        org.joda.time.Chronology chronology5 = ethiopicChronology0.withUTC();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.eras();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField6", Math.signum(durationField3.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField3)));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone14 = ethiopicChronology0.getZone();
        int int16 = dateTimeZone14.getStandardOffset((-360000002L));
        org.joda.time.chrono.EthiopicChronology ethiopicChronology17 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField18 = ethiopicChronology17.seconds();
        org.joda.time.DurationField durationField19 = ethiopicChronology17.years();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology21 = ethiopicChronology17.withZone(dateTimeZone20);
        java.lang.String str23 = dateTimeZone20.getNameKey((long) 1);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology24 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology24.millisOfSecond();
        org.joda.time.DurationField durationField26 = ethiopicChronology24.centuries();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        long long30 = ethiopicChronology24.add(readablePeriod27, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField31 = ethiopicChronology24.year();
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology24.yearOfEra();
        org.joda.time.Chronology chronology33 = ethiopicChronology24.withUTC();
        org.joda.time.DateTimeField dateTimeField34 = ethiopicChronology24.centuryOfEra();
        org.joda.time.Chronology chronology35 = ethiopicChronology24.withUTC();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology36 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.Chronology chronology37 = ethiopicChronology36.withUTC();
        org.joda.time.DurationField durationField38 = ethiopicChronology36.years();
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        long long42 = ethiopicChronology36.add(readablePeriod39, (long) 1, (int) (short) 10);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology43 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField44 = ethiopicChronology43.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField45 = ethiopicChronology43.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology46 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField47 = ethiopicChronology46.seconds();
        org.joda.time.DurationField durationField48 = ethiopicChronology46.years();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology50 = ethiopicChronology46.withZone(dateTimeZone49);
        java.lang.String str52 = dateTimeZone49.getNameKey((long) 1);
        org.joda.time.Chronology chronology53 = ethiopicChronology43.withZone(dateTimeZone49);
        long long56 = dateTimeZone49.convertLocalToUTC((long) 0, true);
        long long58 = dateTimeZone49.convertUTCToLocal((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        long long62 = dateTimeZone49.getMillisKeepLocal(dateTimeZone60, (long) 100);
        org.joda.time.Chronology chronology63 = ethiopicChronology36.withZone(dateTimeZone49);
        java.lang.String str65 = dateTimeZone49.getName(3600001L);
        org.joda.time.Chronology chronology66 = chronology35.withZone(dateTimeZone49);
        long long69 = dateTimeZone49.convertLocalToUTC((-8092799890L), true);
        int int71 = dateTimeZone49.getOffset(96L);
        int int73 = dateTimeZone49.getOffsetFromLocal(359999999L);
        long long75 = dateTimeZone14.getMillisKeepLocal(dateTimeZone49, (-3524795557560000003L));
        long long77 = dateTimeZone14.convertUTCToLocal((-61885195200025L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField26", (durationField11.compareTo(durationField26) == 0) == durationField11.equals(durationField26));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = ethiopicChronology0.getZone();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.minutes();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.eras();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField5", Math.signum(durationField4.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField4)));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField19 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField21 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField1, and durationField11", !(durationField21.compareTo(durationField1) == 0) || (Math.signum(durationField21.compareTo(durationField11)) == Math.signum(durationField1.compareTo(durationField11))));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.monthOfYear();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.years();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField8", (durationField6.compareTo(durationField8) == 0) == durationField6.equals(durationField8));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone10 = ethiopicChronology0.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField9", Math.signum(durationField1.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField1)));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.Chronology chronology6 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.year();
        java.lang.Object obj9 = null;
        boolean boolean10 = ethiopicChronology0.equals(obj9);
        org.joda.time.DurationField durationField11 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeZone dateTimeZone12 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.era();
        org.joda.time.DurationField durationField17 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField1, and durationField11", !(durationField17.compareTo(durationField1) == 0) || (Math.signum(durationField17.compareTo(durationField11)) == Math.signum(durationField1.compareTo(durationField11))));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.yearOfEra();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology5 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = ethiopicChronology5.seconds();
        org.joda.time.DurationField durationField7 = ethiopicChronology5.years();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology9 = ethiopicChronology5.withZone(dateTimeZone8);
        java.lang.String str11 = dateTimeZone8.getNameKey((long) 1);
        int int13 = dateTimeZone8.getStandardOffset((long) (short) 0);
        org.joda.time.Chronology chronology14 = ethiopicChronology0.withZone(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField19 = ethiopicChronology0.weekyears();
        long long23 = ethiopicChronology0.add(359999965L, (-363599968L), (int) 'a');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField19", (durationField7.compareTo(durationField19) == 0) == durationField7.equals(durationField19));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.minutes();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology11.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology11.secondOfMinute();
        org.joda.time.DurationField durationField14 = ethiopicChronology11.halfdays();
        org.joda.time.DurationField durationField15 = ethiopicChronology11.months();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology11.halfdayOfDay();
        org.joda.time.DurationField durationField17 = ethiopicChronology11.weekyears();
        org.joda.time.DurationField durationField18 = ethiopicChronology11.centuries();
        org.joda.time.DurationField durationField19 = ethiopicChronology11.millis();
        org.joda.time.DurationField durationField20 = ethiopicChronology11.seconds();
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology11.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology11.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology11.hourOfDay();
        boolean boolean24 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField17", (durationField2.compareTo(durationField17) == 0) == durationField2.equals(durationField17));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = ethiopicChronology12.getZone();
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) ethiopicChronology12);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology17 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3, 4);
        long long19 = dateTimeZone3.convertUTCToLocal((-61885555199990L));
        long long21 = dateTimeZone3.nextTransition(0L);
        int int23 = dateTimeZone3.getStandardOffset(149700000L);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone3.getOffset(readableInstant24);
        boolean boolean26 = dateTimeZone3.isFixed();
        long long29 = dateTimeZone3.convertLocalToUTC((-82797296L), false);
        long long31 = dateTimeZone3.nextTransition(189300000L);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology32 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField33 = ethiopicChronology32.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField34 = ethiopicChronology32.secondOfMinute();
        org.joda.time.DurationField durationField35 = ethiopicChronology32.halfdays();
        org.joda.time.DurationField durationField36 = ethiopicChronology32.months();
        org.joda.time.DateTimeField dateTimeField37 = ethiopicChronology32.halfdayOfDay();
        org.joda.time.DurationField durationField38 = ethiopicChronology32.weekyears();
        java.lang.Object obj39 = null;
        boolean boolean40 = ethiopicChronology32.equals(obj39);
        org.joda.time.DateTimeField dateTimeField41 = ethiopicChronology32.era();
        org.joda.time.DurationField durationField42 = ethiopicChronology32.centuries();
        org.joda.time.DateTimeField dateTimeField43 = ethiopicChronology32.dayOfYear();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology44 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField45 = ethiopicChronology44.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField46 = ethiopicChronology44.secondOfMinute();
        org.joda.time.DurationField durationField47 = ethiopicChronology44.weeks();
        org.joda.time.DateTimeField dateTimeField48 = ethiopicChronology44.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField49 = ethiopicChronology44.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone50 = ethiopicChronology44.getZone();
        org.joda.time.LocalDateTime localDateTime51 = null;
        boolean boolean52 = dateTimeZone50.isLocalDateTimeGap(localDateTime51);
        org.joda.time.Chronology chronology53 = ethiopicChronology32.withZone(dateTimeZone50);
        long long55 = dateTimeZone3.getMillisKeepLocal(dateTimeZone50, (-151199890L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField38", (durationField2.compareTo(durationField38) == 0) == durationField2.equals(durationField38));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.centuries();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = ethiopicChronology0.add(readablePeriod12, 0L, 0);
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone17 = ethiopicChronology0.getZone();
        org.joda.time.DurationField durationField18 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField1, and durationField11", !(durationField18.compareTo(durationField1) == 0) || (Math.signum(durationField18.compareTo(durationField11)) == Math.signum(durationField1.compareTo(durationField11))));
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.year();
        org.joda.time.DateTimeZone dateTimeZone7 = ethiopicChronology1.getZone();
        long long11 = dateTimeZone7.convertLocalToUTC(100L, false, 1L);
        java.lang.String str12 = dateTimeZone7.getID();
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone7.getOffset(readableInstant13);
        org.joda.time.Chronology chronology15 = ethiopicChronology0.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField16 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField19 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology0.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField16 and durationField19", Math.signum(durationField16.compareTo(durationField19)) == -Math.signum(durationField19.compareTo(durationField16)));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.weeks();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField11", Math.signum(durationField3.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField3)));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.secondOfDay();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField14 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.hourOfDay();
        org.joda.time.DurationField durationField16 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField9, and durationField14", !(durationField16.compareTo(durationField9) == 0) || (Math.signum(durationField16.compareTo(durationField14)) == Math.signum(durationField9.compareTo(durationField14))));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField4", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.days();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology0.add(readablePeriod7, 36610000L, (int) (short) -1);
        org.joda.time.DurationField durationField11 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = ethiopicChronology0.add(readablePeriod12, 39L, 115200000);
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.hourOfDay();
        org.joda.time.DurationField durationField17 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField4, and durationField5", !(durationField17.compareTo(durationField4) == 0) || (Math.signum(durationField17.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(100);
        boolean boolean2 = dateTimeZone1.isFixed();
        int int4 = dateTimeZone1.getOffsetFromLocal((long) 0);
        java.lang.String str6 = dateTimeZone1.getShortName((long) 4);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1, 4);
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology8.hourOfHalfday();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = ethiopicChronology11.seconds();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = ethiopicChronology11.add(readablePeriod13, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology11.secondOfMinute();
        org.joda.time.DurationField durationField18 = ethiopicChronology11.days();
        boolean boolean19 = ethiopicChronology8.equals((java.lang.Object) ethiopicChronology11);
        org.joda.time.DurationField durationField20 = ethiopicChronology8.seconds();
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology8.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField20", (durationField12.compareTo(durationField20) == 0) == durationField12.equals(durationField20));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(100);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = ethiopicChronology2.seconds();
        org.joda.time.DurationField durationField4 = ethiopicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField6 = ethiopicChronology2.seconds();
        org.joda.time.DurationField durationField7 = ethiopicChronology2.centuries();
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) ethiopicChronology2);
        long long12 = ethiopicChronology2.add(90L, 32L, (-1));
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology2.era();
        org.joda.time.DurationField durationField14 = ethiopicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField3, and durationField4", !(durationField14.compareTo(durationField3) == 0) || (Math.signum(durationField14.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology4 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField5 = ethiopicChronology4.seconds();
        org.joda.time.DurationField durationField6 = ethiopicChronology4.years();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology8 = ethiopicChronology4.withZone(dateTimeZone7);
        boolean boolean9 = dateTimeZone7.isFixed();
        java.lang.String str10 = dateTimeZone7.getID();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone7, 4);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology12.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone14 = ethiopicChronology12.getZone();
        org.joda.time.Chronology chronology15 = ethiopicChronology0.withZone(dateTimeZone14);
        org.joda.time.DurationField durationField16 = chronology15.years();
        org.joda.time.DurationField durationField17 = chronology15.weekyears();
        org.joda.time.Chronology chronology18 = chronology15.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField17", (durationField6.compareTo(durationField17) == 0) == durationField6.equals(durationField17));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfMonth();
        java.lang.String str5 = ethiopicChronology0.toString();
        org.joda.time.Chronology chronology6 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField9, and durationField3", !(durationField3.compareTo(durationField9) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField9.compareTo(durationField3))));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.year();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.eras();
        org.joda.time.Chronology chronology6 = ethiopicChronology0.withUTC();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField8 = ethiopicChronology7.seconds();
        org.joda.time.DurationField durationField9 = ethiopicChronology7.years();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology11 = ethiopicChronology7.withZone(dateTimeZone10);
        java.lang.String str13 = dateTimeZone10.getNameKey((long) 1);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology14.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology14.clockhourOfDay();
        org.joda.time.DurationField durationField17 = ethiopicChronology14.days();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology14.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone19 = ethiopicChronology14.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology20 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology20.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology20.secondOfMinute();
        org.joda.time.DurationField durationField23 = ethiopicChronology20.halfdays();
        org.joda.time.DurationField durationField24 = ethiopicChronology20.months();
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology20.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology20.year();
        java.lang.String str27 = ethiopicChronology20.toString();
        org.joda.time.DurationField durationField28 = ethiopicChronology20.days();
        org.joda.time.DateTimeField dateTimeField29 = ethiopicChronology20.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField30 = ethiopicChronology20.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField31 = ethiopicChronology20.monthOfYear();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology32 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField33 = ethiopicChronology32.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField34 = ethiopicChronology32.secondOfMinute();
        org.joda.time.DurationField durationField35 = ethiopicChronology32.halfdays();
        int int36 = ethiopicChronology32.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField37 = ethiopicChronology32.months();
        org.joda.time.DateTimeField dateTimeField38 = ethiopicChronology32.year();
        org.joda.time.DateTimeZone dateTimeZone39 = ethiopicChronology32.getZone();
        java.lang.String str40 = dateTimeZone39.toString();
        org.joda.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = dateTimeZone39.isLocalDateTimeGap(localDateTime41);
        org.joda.time.Chronology chronology43 = ethiopicChronology20.withZone(dateTimeZone39);
        org.joda.time.Chronology chronology44 = ethiopicChronology14.withZone(dateTimeZone39);
        java.lang.String str46 = dateTimeZone39.getShortName((-1L));
        org.joda.time.chrono.EthiopicChronology ethiopicChronology48 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone39, 4);
        org.joda.time.Chronology chronology49 = ethiopicChronology0.withZone(dateTimeZone39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField8", Math.signum(durationField5.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField5)));
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.eras();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = ethiopicChronology0.add(readablePeriod10, (-115084794600L), (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField15 = ethiopicChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField15, and durationField9", !(durationField9.compareTo(durationField15) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField15.compareTo(durationField9))));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.weekyears();
        java.lang.String str11 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField6, and durationField10", !(durationField12.compareTo(durationField6) == 0) || (Math.signum(durationField12.compareTo(durationField10)) == Math.signum(durationField6.compareTo(durationField10))));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = ethiopicChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.weeks();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.yearOfEra();
        org.joda.time.DurationField durationField15 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField18 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField3, and durationField4", !(durationField18.compareTo(durationField3) == 0) || (Math.signum(durationField18.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.Chronology chronology12 = ethiopicChronology0.withUTC();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.millis();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField15 = ethiopicChronology14.seconds();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = ethiopicChronology14.add(readablePeriod16, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = ethiopicChronology14.add(readablePeriod20, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.Chronology chronology25 = ethiopicChronology14.withZone(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology14.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology14.dayOfYear();
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology14.centuryOfEra();
        org.joda.time.DurationField durationField29 = ethiopicChronology14.months();
        org.joda.time.DateTimeField dateTimeField30 = ethiopicChronology14.centuryOfEra();
        int int31 = ethiopicChronology14.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology14.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology33 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField34 = ethiopicChronology33.seconds();
        org.joda.time.DurationField durationField35 = ethiopicChronology33.years();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology37 = ethiopicChronology33.withZone(dateTimeZone36);
        boolean boolean38 = dateTimeZone36.isFixed();
        java.lang.String str39 = dateTimeZone36.getID();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology41 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone36, 4);
        org.joda.time.DateTimeField dateTimeField42 = ethiopicChronology41.hourOfHalfday();
        long long46 = ethiopicChronology41.add((long) ' ', 359999999L, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField47 = ethiopicChronology41.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField48 = ethiopicChronology41.monthOfYear();
        org.joda.time.DateTimeField dateTimeField49 = ethiopicChronology41.secondOfDay();
        org.joda.time.DateTimeField dateTimeField50 = ethiopicChronology41.weekyearOfCentury();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology51 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField52 = ethiopicChronology51.seconds();
        org.joda.time.DurationField durationField53 = ethiopicChronology51.years();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology55 = ethiopicChronology51.withZone(dateTimeZone54);
        boolean boolean56 = dateTimeZone54.isFixed();
        java.lang.String str57 = dateTimeZone54.getID();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology59 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone54, 4);
        org.joda.time.DateTimeField dateTimeField60 = ethiopicChronology59.hourOfHalfday();
        long long64 = ethiopicChronology59.add((long) ' ', 359999999L, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField65 = ethiopicChronology59.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone66 = ethiopicChronology59.getZone();
        org.joda.time.Chronology chronology67 = ethiopicChronology41.withZone(dateTimeZone66);
        org.joda.time.Chronology chronology68 = ethiopicChronology14.withZone(dateTimeZone66);
        boolean boolean69 = ethiopicChronology0.equals((java.lang.Object) chronology68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField35", (durationField6.compareTo(durationField35) == 0) == durationField6.equals(durationField35));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology7.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.secondOfDay();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology7.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology7.weekyearOfCentury();
        org.joda.time.DurationField durationField13 = ethiopicChronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology7.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField13", (durationField2.compareTo(durationField13) == 0) == durationField2.equals(durationField13));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(100);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = ethiopicChronology2.seconds();
        org.joda.time.DurationField durationField4 = ethiopicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField6 = ethiopicChronology2.seconds();
        org.joda.time.DurationField durationField7 = ethiopicChronology2.centuries();
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) ethiopicChronology2);
        long long12 = ethiopicChronology2.add(90L, 32L, (-1));
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology2.year();
        org.joda.time.DurationField durationField15 = ethiopicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField3, and durationField4", !(durationField15.compareTo(durationField3) == 0) || (Math.signum(durationField15.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField2", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = ethiopicChronology0.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField12 = ethiopicChronology0.minutes();
        int int13 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField15 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField17 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField1, and durationField12", !(durationField17.compareTo(durationField1) == 0) || (Math.signum(durationField17.compareTo(durationField12)) == Math.signum(durationField1.compareTo(durationField12))));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = ethiopicChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.era();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField3, and durationField4", !(durationField12.compareTo(durationField3) == 0) || (Math.signum(durationField12.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.Chronology chronology6 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField11", Math.signum(durationField1.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField1)));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = ethiopicChronology0.withUTC();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = ethiopicChronology0.add(readablePeriod5, 35639999896L, 187200000);
        org.joda.time.Chronology chronology9 = ethiopicChronology0.withUTC();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = ethiopicChronology10.seconds();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = ethiopicChronology10.add(readablePeriod12, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField16 = ethiopicChronology10.millis();
        org.joda.time.DurationField durationField17 = ethiopicChronology10.hours();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology10.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology10.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology10.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology10.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone22 = ethiopicChronology10.getZone();
        org.joda.time.Chronology chronology23 = chronology9.withZone(dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField11", Math.signum(durationField2.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField2)));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(100);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = ethiopicChronology2.seconds();
        org.joda.time.DurationField durationField4 = ethiopicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField6 = ethiopicChronology2.seconds();
        org.joda.time.DurationField durationField7 = ethiopicChronology2.centuries();
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) ethiopicChronology2);
        long long12 = ethiopicChronology2.add(90L, 32L, (-1));
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology2.clockhourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology16 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField17 = ethiopicChronology16.seconds();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = ethiopicChronology16.add(readablePeriod18, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField22 = ethiopicChronology16.centuries();
        java.lang.String str23 = ethiopicChronology16.toString();
        org.joda.time.DurationField durationField24 = ethiopicChronology16.seconds();
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology16.centuryOfEra();
        boolean boolean27 = ethiopicChronology2.equals((java.lang.Object) ethiopicChronology16);
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField29 = ethiopicChronology2.secondOfMinute();
        org.joda.time.DurationField durationField30 = ethiopicChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField30, durationField3, and durationField4", !(durationField30.compareTo(durationField3) == 0) || (Math.signum(durationField30.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = ethiopicChronology0.getZone();
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone2.getName(0L, locale5);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone2);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = ethiopicChronology7.add(readablePeriod8, (-414712180800138L), (int) '4');
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology7.centuryOfEra();
        java.lang.String str13 = ethiopicChronology7.toString();
        org.joda.time.DurationField durationField14 = ethiopicChronology7.eras();
        org.joda.time.DurationField durationField15 = ethiopicChronology7.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField15, and durationField14", !(durationField14.compareTo(durationField15) == 0) || (Math.signum(durationField14.compareTo(durationField14)) == Math.signum(durationField15.compareTo(durationField14))));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.era();
        long long8 = ethiopicChronology0.add((long) 4, (long) (short) -1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.yearOfEra();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.centuries();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.yearOfEra();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField1, and durationField2", !(durationField13.compareTo(durationField1) == 0) || (Math.signum(durationField13.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.era();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours(100);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = ethiopicChronology11.seconds();
        org.joda.time.DurationField durationField13 = ethiopicChronology11.years();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology11.yearOfCentury();
        org.joda.time.DurationField durationField15 = ethiopicChronology11.seconds();
        org.joda.time.DurationField durationField16 = ethiopicChronology11.centuries();
        boolean boolean17 = dateTimeZone10.equals((java.lang.Object) ethiopicChronology11);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology18 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology18.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology18.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.Chronology chronology22 = ethiopicChronology18.withZone(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology18.year();
        org.joda.time.DateTimeZone dateTimeZone24 = ethiopicChronology18.getZone();
        long long28 = dateTimeZone24.convertLocalToUTC(100L, false, 1L);
        java.lang.String str29 = dateTimeZone24.getID();
        org.joda.time.Chronology chronology30 = ethiopicChronology11.withZone(dateTimeZone24);
        java.lang.String str32 = dateTimeZone24.getName((long) (byte) 0);
        org.joda.time.Chronology chronology33 = ethiopicChronology0.withZone(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField34 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField35 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        java.lang.String str39 = dateTimeZone37.getNameKey((long) 'a');
        boolean boolean40 = dateTimeZone37.isFixed();
        java.lang.String str42 = dateTimeZone37.getShortName((long) (byte) 0);
        org.joda.time.Chronology chronology43 = ethiopicChronology0.withZone(dateTimeZone37);
        org.joda.time.DurationField durationField44 = chronology43.years();
        org.joda.time.DateTimeField dateTimeField45 = chronology43.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField44", (durationField13.compareTo(durationField44) == 0) == durationField13.equals(durationField44));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str5 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = ethiopicChronology0.add(readablePeriod10, (-3600101L), 126000000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField9", (durationField6.compareTo(durationField9) == 0) == durationField6.equals(durationField9));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.year();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField3, and durationField7", !(durationField9.compareTo(durationField3) == 0) || (Math.signum(durationField9.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology7.era();
        long long13 = ethiopicChronology7.add(2605679999997L, 96L, 36000000);
        org.joda.time.DurationField durationField14 = ethiopicChronology7.seconds();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology7.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField14", (durationField1.compareTo(durationField14) == 0) == durationField1.equals(durationField14));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = ethiopicChronology0.add(readablePeriod9, 0L, (int) (short) -1);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField14 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.secondOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology16 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField17 = ethiopicChronology16.seconds();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology18 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField19 = ethiopicChronology18.seconds();
        org.joda.time.DurationField durationField20 = ethiopicChronology18.years();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology22 = ethiopicChronology18.withZone(dateTimeZone21);
        java.lang.String str24 = dateTimeZone21.getNameKey((long) 1);
        boolean boolean26 = dateTimeZone21.equals((java.lang.Object) (-1.0f));
        int int28 = dateTimeZone21.getOffset((long) 100);
        org.joda.time.Chronology chronology29 = ethiopicChronology16.withZone(dateTimeZone21);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology30 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField31 = ethiopicChronology30.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology30.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology33 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField34 = ethiopicChronology33.seconds();
        org.joda.time.DurationField durationField35 = ethiopicChronology33.years();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology37 = ethiopicChronology33.withZone(dateTimeZone36);
        java.lang.String str39 = dateTimeZone36.getNameKey((long) 1);
        org.joda.time.Chronology chronology40 = ethiopicChronology30.withZone(dateTimeZone36);
        long long43 = dateTimeZone36.convertLocalToUTC((long) 0, true);
        long long45 = dateTimeZone36.convertUTCToLocal((long) (byte) 100);
        org.joda.time.Chronology chronology46 = ethiopicChronology16.withZone(dateTimeZone36);
        org.joda.time.Chronology chronology47 = ethiopicChronology0.withZone(dateTimeZone36);
        java.lang.String str48 = dateTimeZone36.getID();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology49 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField50 = ethiopicChronology49.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone51 = ethiopicChronology49.getZone();
        org.joda.time.DateTimeField dateTimeField52 = ethiopicChronology49.dayOfYear();
        org.joda.time.DateTimeField dateTimeField53 = ethiopicChronology49.secondOfDay();
        org.joda.time.DateTimeField dateTimeField54 = ethiopicChronology49.clockhourOfDay();
        org.joda.time.DurationField durationField55 = ethiopicChronology49.weekyears();
        org.joda.time.DateTimeZone dateTimeZone56 = ethiopicChronology49.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology57 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField58 = ethiopicChronology57.seconds();
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        long long62 = ethiopicChronology57.add(readablePeriod59, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField63 = ethiopicChronology57.secondOfDay();
        org.joda.time.DurationField durationField64 = ethiopicChronology57.weekyears();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forID("+00:00");
        java.lang.String str67 = dateTimeZone66.getID();
        boolean boolean68 = dateTimeZone66.isFixed();
        java.util.Locale locale70 = null;
        java.lang.String str71 = dateTimeZone66.getShortName((long) (-1), locale70);
        org.joda.time.Chronology chronology72 = ethiopicChronology57.withZone(dateTimeZone66);
        org.joda.time.DateTimeField dateTimeField73 = ethiopicChronology57.weekyearOfCentury();
        boolean boolean74 = ethiopicChronology49.equals((java.lang.Object) ethiopicChronology57);
        org.joda.time.DurationField durationField75 = ethiopicChronology57.halfdays();
        org.joda.time.DurationField durationField76 = ethiopicChronology57.minutes();
        org.joda.time.DateTimeField dateTimeField77 = ethiopicChronology57.yearOfEra();
        org.joda.time.DateTimeField dateTimeField78 = ethiopicChronology57.millisOfDay();
        org.joda.time.DurationField durationField79 = ethiopicChronology57.weeks();
        org.joda.time.DateTimeField dateTimeField80 = ethiopicChronology57.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField81 = ethiopicChronology57.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField82 = ethiopicChronology57.monthOfYear();
        boolean boolean83 = dateTimeZone36.equals((java.lang.Object) dateTimeField82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField55", (durationField20.compareTo(durationField55) == 0) == durationField20.equals(durationField55));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology7.millisOfSecond();
        long long12 = ethiopicChronology7.add(35L, 0L, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = ethiopicChronology7.add(readablePeriod13, (long) (short) 0, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone17 = ethiopicChronology7.getZone();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology7.millisOfDay();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology7.year();
        org.joda.time.DurationField durationField20 = ethiopicChronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField1, and durationField2", !(durationField20.compareTo(durationField1) == 0) || (Math.signum(durationField20.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = ethiopicChronology0.getZone();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.eras();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField7", Math.signum(durationField8.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField8)));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.monthOfYear();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.Chronology chronology9 = ethiopicChronology0.withUTC();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.eras();
        org.joda.time.Chronology chronology11 = ethiopicChronology0.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField10", Math.signum(durationField7.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField7)));
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = ethiopicChronology12.getZone();
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) ethiopicChronology12);
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology12.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology12.clockhourOfHalfday();
        org.joda.time.DurationField durationField20 = ethiopicChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField1, and durationField2", !(durationField20.compareTo(durationField1) == 0) || (Math.signum(durationField20.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }
}

