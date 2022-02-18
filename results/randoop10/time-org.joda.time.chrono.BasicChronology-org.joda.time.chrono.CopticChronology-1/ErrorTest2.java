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
        org.joda.time.DateTimeField dateTimeField21 = copticChronology7.hourOfHalfday();
        org.joda.time.DurationField durationField22 = copticChronology7.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField20", (durationField2.compareTo(durationField20) == 0) == durationField2.equals(durationField20));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology5.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology5.getZone();
        java.lang.String str9 = dateTimeZone7.getNameKey((long) ' ');
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = copticChronology10.seconds();
        org.joda.time.DurationField durationField12 = copticChronology10.years();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology14 = copticChronology10.withZone(dateTimeZone13);
        int int16 = dateTimeZone13.getOffset((long) 0);
        int int18 = dateTimeZone13.getOffset((long) (byte) 1);
        boolean boolean19 = dateTimeZone7.equals((java.lang.Object) dateTimeZone13);
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = dateTimeZone13.getOffset(readableInstant20);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone13.getShortName(1L, locale23);
        org.joda.time.Chronology chronology25 = copticChronology0.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField26 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology0.year();
        org.joda.time.DurationField durationField28 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField29 = copticChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField28", (durationField12.compareTo(durationField28) == 0) == durationField12.equals(durationField28));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
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
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.weekyear();
        java.lang.String str15 = copticChronology0.toString();
        org.joda.time.DurationField durationField16 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField16", Math.signum(durationField1.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField1)));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        java.lang.String str8 = copticChronology0.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField7", (durationField2.compareTo(durationField7) == 0) == durationField2.equals(durationField7));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.joda.time.DurationField durationField12 = copticChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField12, and durationField11", !(durationField11.compareTo(durationField12) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField12.compareTo(durationField11))));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
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
        org.joda.time.DateTimeField dateTimeField26 = copticChronology2.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField25", (durationField4.compareTo(durationField25) == 0) == durationField4.equals(durationField25));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
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
        org.joda.time.DurationField durationField18 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField20 = copticChronology0.minutes();
        java.lang.String str21 = copticChronology0.toString();
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology22.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone24 = copticChronology22.getZone();
        java.lang.String str26 = dateTimeZone24.getNameKey((long) ' ');
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField28 = copticChronology27.seconds();
        org.joda.time.DurationField durationField29 = copticChronology27.years();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology31 = copticChronology27.withZone(dateTimeZone30);
        int int33 = dateTimeZone30.getOffset((long) 0);
        int int35 = dateTimeZone30.getOffset((long) (byte) 1);
        boolean boolean36 = dateTimeZone24.equals((java.lang.Object) dateTimeZone30);
        long long38 = dateTimeZone30.convertUTCToLocal((long) (short) -1);
        org.joda.time.LocalDateTime localDateTime39 = null;
        boolean boolean40 = dateTimeZone30.isLocalDateTimeGap(localDateTime39);
        org.joda.time.Chronology chronology41 = copticChronology0.withZone(dateTimeZone30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField29", (durationField16.compareTo(durationField29) == 0) == durationField16.equals(durationField29));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField10 = copticChronology9.seconds();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = copticChronology9.add(readablePeriod11, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology9.secondOfDay();
        org.joda.time.DurationField durationField16 = copticChronology9.weekyears();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forID("+00:00");
        java.lang.String str19 = dateTimeZone18.getID();
        boolean boolean20 = dateTimeZone18.isFixed();
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone18.getShortName((long) (-1), locale22);
        org.joda.time.Chronology chronology24 = copticChronology9.withZone(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone25 = copticChronology9.getZone();
        java.lang.String str26 = dateTimeZone25.getID();
        org.joda.time.Chronology chronology27 = copticChronology0.withZone(dateTimeZone25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField16", (durationField2.compareTo(durationField16) == 0) == durationField2.equals(durationField16));
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
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
        int int42 = dateTimeZone32.getOffsetFromLocal((-4L));
        long long44 = dateTimeZone32.convertUTCToLocal((-13098240037919899L));
        org.joda.time.chrono.CopticChronology copticChronology45 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField46 = copticChronology45.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField47 = copticChronology45.secondOfMinute();
        org.joda.time.DurationField durationField48 = copticChronology45.halfdays();
        org.joda.time.DurationField durationField49 = copticChronology45.months();
        org.joda.time.DateTimeField dateTimeField50 = copticChronology45.halfdayOfDay();
        org.joda.time.DurationField durationField51 = copticChronology45.weekyears();
        java.lang.Object obj52 = null;
        boolean boolean53 = copticChronology45.equals(obj52);
        org.joda.time.DateTimeField dateTimeField54 = copticChronology45.yearOfCentury();
        org.joda.time.DurationField durationField55 = copticChronology45.weeks();
        org.joda.time.DurationField durationField56 = copticChronology45.centuries();
        org.joda.time.DurationField durationField57 = copticChronology45.millis();
        org.joda.time.DateTimeField dateTimeField58 = copticChronology45.weekyear();
        boolean boolean59 = dateTimeZone32.equals((java.lang.Object) copticChronology45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField51", (durationField2.compareTo(durationField51) == 0) == durationField2.equals(durationField51));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.year();
        org.joda.time.DurationField durationField12 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField13 = copticChronology0.minutes();
        org.joda.time.DurationField durationField14 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField1, and durationField12", !(durationField14.compareTo(durationField1) == 0) || (Math.signum(durationField14.compareTo(durationField12)) == Math.signum(durationField1.compareTo(durationField12))));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Chronology chronology12 = copticChronology8.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology8.year();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology8.getZone();
        long long18 = dateTimeZone14.convertLocalToUTC(100L, false, 1L);
        int int20 = dateTimeZone14.getOffsetFromLocal((long) 10);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone14.getOffset(readableInstant21);
        org.joda.time.Chronology chronology23 = copticChronology0.withZone(dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField7", (durationField2.compareTo(durationField7) == 0) == durationField2.equals(durationField7));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = copticChronology0.add(readablePeriod7, 32L, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.weekyear();
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
        long long30 = dateTimeZone18.previousTransition((long) (short) -1);
        boolean boolean31 = dateTimeZone18.isFixed();
        int int33 = dateTimeZone18.getOffsetFromLocal((long) (byte) -1);
        java.lang.String str35 = dateTimeZone18.getNameKey((-100L));
        int int37 = dateTimeZone18.getStandardOffset(8280000022L);
        long long39 = dateTimeZone18.previousTransition(86L);
        int int41 = dateTimeZone18.getStandardOffset((-65L));
        java.lang.String str43 = dateTimeZone18.getNameKey((-48647990967L));
        org.joda.time.Chronology chronology44 = copticChronology0.withZone(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField17", (durationField6.compareTo(durationField17) == 0) == durationField6.equals(durationField17));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
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
        org.joda.time.DateTimeField dateTimeField19 = copticChronology18.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology18.millisOfSecond();
        org.joda.time.DurationField durationField21 = copticChronology18.millis();
        org.joda.time.DurationField durationField22 = copticChronology18.weekyears();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology18.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField22", (durationField2.compareTo(durationField22) == 0) == durationField2.equals(durationField22));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.hourOfHalfday();
        org.joda.time.DurationField durationField10 = copticChronology8.centuries();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology8.clockhourOfHalfday();
        org.joda.time.DurationField durationField12 = copticChronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField1, and durationField2", !(durationField12.compareTo(durationField1) == 0) || (Math.signum(durationField12.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
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
        org.joda.time.DurationField durationField18 = copticChronology7.weeks();
        org.joda.time.DurationField durationField19 = copticChronology7.minutes();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology7.clockhourOfHalfday();
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology21.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology21.secondOfMinute();
        org.joda.time.DurationField durationField24 = copticChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology21.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology21.weekyear();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology21.millisOfSecond();
        int int28 = copticChronology21.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology21.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology21.weekyear();
        org.joda.time.DateTimeZone dateTimeZone31 = copticChronology21.getZone();
        boolean boolean32 = copticChronology7.equals((java.lang.Object) dateTimeZone31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField24", (durationField18.compareTo(durationField24) == 0) == durationField18.equals(durationField24));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.DurationField durationField3 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.Chronology chronology5 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.joda.time.DurationField durationField7 = copticChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField6", Math.signum(durationField3.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField3)));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology0.getZone();
        int int16 = dateTimeZone14.getStandardOffset((-360000002L));
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField18 = copticChronology17.seconds();
        org.joda.time.DurationField durationField19 = copticChronology17.years();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology21 = copticChronology17.withZone(dateTimeZone20);
        java.lang.String str23 = dateTimeZone20.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField25 = copticChronology24.millisOfSecond();
        org.joda.time.DurationField durationField26 = copticChronology24.centuries();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        long long30 = copticChronology24.add(readablePeriod27, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField31 = copticChronology24.year();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology24.yearOfEra();
        org.joda.time.Chronology chronology33 = copticChronology24.withUTC();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology24.centuryOfEra();
        org.joda.time.Chronology chronology35 = copticChronology24.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology36 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.Chronology chronology37 = copticChronology36.withUTC();
        org.joda.time.DurationField durationField38 = copticChronology36.years();
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        long long42 = copticChronology36.add(readablePeriod39, (long) 1, (int) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology43 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField44 = copticChronology43.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField45 = copticChronology43.year();
        org.joda.time.chrono.CopticChronology copticChronology46 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField47 = copticChronology46.seconds();
        org.joda.time.DurationField durationField48 = copticChronology46.years();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology50 = copticChronology46.withZone(dateTimeZone49);
        java.lang.String str52 = dateTimeZone49.getNameKey((long) 1);
        org.joda.time.Chronology chronology53 = copticChronology43.withZone(dateTimeZone49);
        long long56 = dateTimeZone49.convertLocalToUTC((long) 0, true);
        long long58 = dateTimeZone49.convertUTCToLocal((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        long long62 = dateTimeZone49.getMillisKeepLocal(dateTimeZone60, (long) 100);
        org.joda.time.Chronology chronology63 = copticChronology36.withZone(dateTimeZone49);
        java.lang.String str65 = dateTimeZone49.getName(3600001L);
        org.joda.time.Chronology chronology66 = chronology35.withZone(dateTimeZone49);
        long long69 = dateTimeZone49.convertLocalToUTC((-8092799890L), true);
        int int71 = dateTimeZone49.getOffset(96L);
        int int73 = dateTimeZone49.getOffsetFromLocal(359999999L);
        long long75 = dateTimeZone14.getMillisKeepLocal(dateTimeZone49, (-3002201701560000003L));
        long long77 = dateTimeZone14.convertUTCToLocal((-53175297600025L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField26", (durationField11.compareTo(durationField26) == 0) == durationField11.equals(durationField26));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DurationField durationField4 = copticChronology0.minutes();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField5", Math.signum(durationField4.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField4)));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
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
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField19 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField21 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField1, and durationField11", !(durationField21.compareTo(durationField1) == 0) || (Math.signum(durationField21.compareTo(durationField11)) == Math.signum(durationField1.compareTo(durationField11))));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField8 = copticChronology0.years();
        org.joda.time.DurationField durationField9 = copticChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField8", (durationField6.compareTo(durationField8) == 0) == durationField6.equals(durationField8));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField8 = copticChronology0.seconds();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField9", Math.signum(durationField1.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField1)));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.year();
        java.lang.Object obj9 = null;
        boolean boolean10 = copticChronology0.equals(obj9);
        org.joda.time.DurationField durationField11 = copticChronology0.weeks();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.era();
        org.joda.time.DurationField durationField17 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField1, and durationField11", !(durationField17.compareTo(durationField1) == 0) || (Math.signum(durationField17.compareTo(durationField11)) == Math.signum(durationField1.compareTo(durationField11))));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
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
        long long23 = copticChronology0.add(359999965L, (-363599968L), (int) 'a');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField19", (durationField7.compareTo(durationField19) == 0) == durationField7.equals(durationField19));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField10 = copticChronology0.minutes();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology11.secondOfMinute();
        org.joda.time.DurationField durationField14 = copticChronology11.halfdays();
        org.joda.time.DurationField durationField15 = copticChronology11.months();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology11.halfdayOfDay();
        org.joda.time.DurationField durationField17 = copticChronology11.weekyears();
        org.joda.time.DurationField durationField18 = copticChronology11.centuries();
        org.joda.time.DurationField durationField19 = copticChronology11.millis();
        org.joda.time.DurationField durationField20 = copticChronology11.seconds();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology11.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology11.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology11.hourOfDay();
        boolean boolean24 = copticChronology0.equals((java.lang.Object) copticChronology11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField17", (durationField2.compareTo(durationField17) == 0) == durationField2.equals(durationField17));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
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
        long long19 = dateTimeZone3.convertUTCToLocal((-53175657599990L));
        long long21 = dateTimeZone3.nextTransition(0L);
        int int23 = dateTimeZone3.getStandardOffset(149700000L);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone3.getOffset(readableInstant24);
        boolean boolean26 = dateTimeZone3.isFixed();
        long long29 = dateTimeZone3.convertLocalToUTC((-82797296L), false);
        long long31 = dateTimeZone3.nextTransition(189300000L);
        org.joda.time.chrono.CopticChronology copticChronology32 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology32.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology32.secondOfMinute();
        org.joda.time.DurationField durationField35 = copticChronology32.halfdays();
        org.joda.time.DurationField durationField36 = copticChronology32.months();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology32.halfdayOfDay();
        org.joda.time.DurationField durationField38 = copticChronology32.weekyears();
        java.lang.Object obj39 = null;
        boolean boolean40 = copticChronology32.equals(obj39);
        org.joda.time.DateTimeField dateTimeField41 = copticChronology32.era();
        org.joda.time.DurationField durationField42 = copticChronology32.centuries();
        org.joda.time.DateTimeField dateTimeField43 = copticChronology32.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology44 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField45 = copticChronology44.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField46 = copticChronology44.secondOfMinute();
        org.joda.time.DurationField durationField47 = copticChronology44.weeks();
        org.joda.time.DateTimeField dateTimeField48 = copticChronology44.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField49 = copticChronology44.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone50 = copticChronology44.getZone();
        org.joda.time.LocalDateTime localDateTime51 = null;
        boolean boolean52 = dateTimeZone50.isLocalDateTimeGap(localDateTime51);
        org.joda.time.Chronology chronology53 = copticChronology32.withZone(dateTimeZone50);
        long long55 = dateTimeZone3.getMillisKeepLocal(dateTimeZone50, (-151199890L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField38", (durationField2.compareTo(durationField38) == 0) == durationField2.equals(durationField38));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.centuries();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology0.add(readablePeriod12, 0L, 0);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone17 = copticChronology0.getZone();
        org.joda.time.DurationField durationField18 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField1, and durationField11", !(durationField18.compareTo(durationField1) == 0) || (Math.signum(durationField18.compareTo(durationField11)) == Math.signum(durationField1.compareTo(durationField11))));
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
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
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField16 and durationField19", Math.signum(durationField16.compareTo(durationField19)) == -Math.signum(durationField19.compareTo(durationField16)));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField6 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField10 = copticChronology0.weeks();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField11", Math.signum(durationField3.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField3)));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField14 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField16 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField9, and durationField14", !(durationField16.compareTo(durationField9) == 0) || (Math.signum(durationField16.compareTo(durationField14)) == Math.signum(durationField9.compareTo(durationField14))));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField4", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = copticChronology0.add(readablePeriod7, 36610000L, (int) (short) -1);
        org.joda.time.DurationField durationField11 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology0.add(readablePeriod12, 39L, 115200000);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField17 = copticChronology0.eras();
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
        org.joda.time.DateTimeField dateTimeField21 = copticChronology8.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField20", (durationField12.compareTo(durationField20) == 0) == durationField12.equals(durationField20));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(100);
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = copticChronology2.seconds();
        org.joda.time.DurationField durationField4 = copticChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.yearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology2.seconds();
        org.joda.time.DurationField durationField7 = copticChronology2.centuries();
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) copticChronology2);
        long long12 = copticChronology2.add(90L, 32L, (-1));
        org.joda.time.DateTimeField dateTimeField13 = copticChronology2.era();
        org.joda.time.DurationField durationField14 = copticChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField3, and durationField4", !(durationField14.compareTo(durationField3) == 0) || (Math.signum(durationField14.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField5 = copticChronology4.seconds();
        org.joda.time.DurationField durationField6 = copticChronology4.years();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology8 = copticChronology4.withZone(dateTimeZone7);
        boolean boolean9 = dateTimeZone7.isFixed();
        java.lang.String str10 = dateTimeZone7.getID();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7, 4);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology12.getZone();
        org.joda.time.Chronology chronology15 = copticChronology0.withZone(dateTimeZone14);
        org.joda.time.DurationField durationField16 = chronology15.years();
        org.joda.time.DurationField durationField17 = chronology15.weekyears();
        org.joda.time.Chronology chronology18 = chronology15.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField17", (durationField6.compareTo(durationField17) == 0) == durationField6.equals(durationField17));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField9, and durationField3", !(durationField3.compareTo(durationField9) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField9.compareTo(durationField3))));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.year();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField8 = copticChronology7.seconds();
        org.joda.time.DurationField durationField9 = copticChronology7.years();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology11 = copticChronology7.withZone(dateTimeZone10);
        java.lang.String str13 = dateTimeZone10.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology14.clockhourOfDay();
        org.joda.time.DurationField durationField17 = copticChronology14.days();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology14.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone19 = copticChronology14.getZone();
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology20.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology20.secondOfMinute();
        org.joda.time.DurationField durationField23 = copticChronology20.halfdays();
        org.joda.time.DurationField durationField24 = copticChronology20.months();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology20.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology20.year();
        java.lang.String str27 = copticChronology20.toString();
        org.joda.time.DurationField durationField28 = copticChronology20.days();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology20.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology20.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology20.monthOfYear();
        org.joda.time.chrono.CopticChronology copticChronology32 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology32.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology32.secondOfMinute();
        org.joda.time.DurationField durationField35 = copticChronology32.halfdays();
        int int36 = copticChronology32.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField37 = copticChronology32.months();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology32.year();
        org.joda.time.DateTimeZone dateTimeZone39 = copticChronology32.getZone();
        java.lang.String str40 = dateTimeZone39.toString();
        org.joda.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = dateTimeZone39.isLocalDateTimeGap(localDateTime41);
        org.joda.time.Chronology chronology43 = copticChronology20.withZone(dateTimeZone39);
        org.joda.time.Chronology chronology44 = copticChronology14.withZone(dateTimeZone39);
        java.lang.String str46 = dateTimeZone39.getShortName((-1L));
        org.joda.time.chrono.CopticChronology copticChronology48 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone39, 4);
        org.joda.time.Chronology chronology49 = copticChronology0.withZone(dateTimeZone39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField8", Math.signum(durationField5.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField5)));
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
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
        org.joda.time.DurationField durationField15 = copticChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField15, and durationField9", !(durationField9.compareTo(durationField15) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField15.compareTo(durationField9))));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField10 = copticChronology0.weekyears();
        java.lang.String str11 = copticChronology0.toString();
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField6, and durationField10", !(durationField12.compareTo(durationField6) == 0) || (Math.signum(durationField12.compareTo(durationField10)) == Math.signum(durationField6.compareTo(durationField10))));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
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
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField15 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField18 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField3, and durationField4", !(durationField18.compareTo(durationField3) == 0) || (Math.signum(durationField18.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
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
        org.joda.time.DurationField durationField13 = copticChronology0.millis();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField15 = copticChronology14.seconds();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = copticChronology14.add(readablePeriod16, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = copticChronology14.add(readablePeriod20, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.Chronology chronology25 = copticChronology14.withZone(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField26 = copticChronology14.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology14.dayOfYear();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology14.centuryOfEra();
        org.joda.time.DurationField durationField29 = copticChronology14.months();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology14.centuryOfEra();
        int int31 = copticChronology14.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology14.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology33 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField34 = copticChronology33.seconds();
        org.joda.time.DurationField durationField35 = copticChronology33.years();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology37 = copticChronology33.withZone(dateTimeZone36);
        boolean boolean38 = dateTimeZone36.isFixed();
        java.lang.String str39 = dateTimeZone36.getID();
        org.joda.time.chrono.CopticChronology copticChronology41 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone36, 4);
        org.joda.time.DateTimeField dateTimeField42 = copticChronology41.hourOfHalfday();
        long long46 = copticChronology41.add((long) ' ', 359999999L, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField47 = copticChronology41.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField48 = copticChronology41.monthOfYear();
        org.joda.time.DateTimeField dateTimeField49 = copticChronology41.secondOfDay();
        org.joda.time.DateTimeField dateTimeField50 = copticChronology41.weekyearOfCentury();
        org.joda.time.chrono.CopticChronology copticChronology51 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField52 = copticChronology51.seconds();
        org.joda.time.DurationField durationField53 = copticChronology51.years();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology55 = copticChronology51.withZone(dateTimeZone54);
        boolean boolean56 = dateTimeZone54.isFixed();
        java.lang.String str57 = dateTimeZone54.getID();
        org.joda.time.chrono.CopticChronology copticChronology59 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone54, 4);
        org.joda.time.DateTimeField dateTimeField60 = copticChronology59.hourOfHalfday();
        long long64 = copticChronology59.add((long) ' ', 359999999L, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField65 = copticChronology59.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone66 = copticChronology59.getZone();
        org.joda.time.Chronology chronology67 = copticChronology41.withZone(dateTimeZone66);
        org.joda.time.Chronology chronology68 = copticChronology14.withZone(dateTimeZone66);
        boolean boolean69 = copticChronology0.equals((java.lang.Object) chronology68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField35", (durationField6.compareTo(durationField35) == 0) == durationField6.equals(durationField35));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.secondOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology7.weekyearOfCentury();
        org.joda.time.DurationField durationField13 = copticChronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField13", (durationField2.compareTo(durationField13) == 0) == durationField2.equals(durationField13));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
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
        org.joda.time.DateTimeField dateTimeField14 = copticChronology2.year();
        org.joda.time.DurationField durationField15 = copticChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField3, and durationField4", !(durationField15.compareTo(durationField3) == 0) || (Math.signum(durationField15.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField2", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
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
        org.joda.time.DurationField durationField15 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField17 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField1, and durationField12", !(durationField17.compareTo(durationField1) == 0) || (Math.signum(durationField17.compareTo(durationField12)) == Math.signum(durationField1.compareTo(durationField12))));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
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
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField3, and durationField4", !(durationField12.compareTo(durationField3) == 0) || (Math.signum(durationField12.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField11", Math.signum(durationField1.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField1)));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField2 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = copticChronology0.add(readablePeriod5, 35639999896L, 187200000);
        org.joda.time.Chronology chronology9 = copticChronology0.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = copticChronology10.seconds();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology10.add(readablePeriod12, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField16 = copticChronology10.millis();
        org.joda.time.DurationField durationField17 = copticChronology10.hours();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology10.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology10.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology10.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology10.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone22 = copticChronology10.getZone();
        org.joda.time.Chronology chronology23 = chronology9.withZone(dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField11", Math.signum(durationField2.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField2)));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
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
        org.joda.time.DateTimeField dateTimeField15 = copticChronology2.clockhourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField17 = copticChronology16.seconds();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = copticChronology16.add(readablePeriod18, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField22 = copticChronology16.centuries();
        java.lang.String str23 = copticChronology16.toString();
        org.joda.time.DurationField durationField24 = copticChronology16.seconds();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology16.centuryOfEra();
        boolean boolean27 = copticChronology2.equals((java.lang.Object) copticChronology16);
        org.joda.time.DateTimeField dateTimeField28 = copticChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology2.secondOfMinute();
        org.joda.time.DurationField durationField30 = copticChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField30, durationField3, and durationField4", !(durationField30.compareTo(durationField3) == 0) || (Math.signum(durationField30.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone2.getName(0L, locale5);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone2);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = copticChronology7.add(readablePeriod8, (-414712180800138L), (int) '4');
        org.joda.time.DateTimeField dateTimeField12 = copticChronology7.centuryOfEra();
        java.lang.String str13 = copticChronology7.toString();
        org.joda.time.DurationField durationField14 = copticChronology7.eras();
        org.joda.time.DurationField durationField15 = copticChronology7.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField15, and durationField14", !(durationField14.compareTo(durationField15) == 0) || (Math.signum(durationField14.compareTo(durationField14)) == Math.signum(durationField15.compareTo(durationField14))));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        long long8 = copticChronology0.add((long) 4, (long) (short) -1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField10 = copticChronology0.centuries();
        org.joda.time.DurationField durationField11 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField1, and durationField2", !(durationField13.compareTo(durationField1) == 0) || (Math.signum(durationField13.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
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
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        java.lang.String str39 = dateTimeZone37.getNameKey((long) 'a');
        boolean boolean40 = dateTimeZone37.isFixed();
        java.lang.String str42 = dateTimeZone37.getShortName((long) (byte) 0);
        org.joda.time.Chronology chronology43 = copticChronology0.withZone(dateTimeZone37);
        org.joda.time.DurationField durationField44 = chronology43.years();
        org.joda.time.DateTimeField dateTimeField45 = chronology43.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField44", (durationField13.compareTo(durationField44) == 0) == durationField13.equals(durationField44));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekOfWeekyear();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField7 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField9 = copticChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology0.add(readablePeriod10, (-3600101L), 126000000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField9", (durationField6.compareTo(durationField9) == 0) == durationField6.equals(durationField9));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.DurationField durationField3 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField3, and durationField7", !(durationField9.compareTo(durationField3) == 0) || (Math.signum(durationField9.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
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
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField14", (durationField1.compareTo(durationField14) == 0) == durationField1.equals(durationField14));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
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
        org.joda.time.DurationField durationField14 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.secondOfDay();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField17 = copticChronology16.seconds();
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField19 = copticChronology18.seconds();
        org.joda.time.DurationField durationField20 = copticChronology18.years();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology22 = copticChronology18.withZone(dateTimeZone21);
        java.lang.String str24 = dateTimeZone21.getNameKey((long) 1);
        boolean boolean26 = dateTimeZone21.equals((java.lang.Object) (-1.0f));
        int int28 = dateTimeZone21.getOffset((long) 100);
        org.joda.time.Chronology chronology29 = copticChronology16.withZone(dateTimeZone21);
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
        long long45 = dateTimeZone36.convertUTCToLocal((long) (byte) 100);
        org.joda.time.Chronology chronology46 = copticChronology16.withZone(dateTimeZone36);
        org.joda.time.Chronology chronology47 = copticChronology0.withZone(dateTimeZone36);
        java.lang.String str48 = dateTimeZone36.getID();
        org.joda.time.chrono.CopticChronology copticChronology49 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField50 = copticChronology49.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone51 = copticChronology49.getZone();
        org.joda.time.DateTimeField dateTimeField52 = copticChronology49.dayOfYear();
        org.joda.time.DateTimeField dateTimeField53 = copticChronology49.secondOfDay();
        org.joda.time.DateTimeField dateTimeField54 = copticChronology49.clockhourOfDay();
        org.joda.time.DurationField durationField55 = copticChronology49.weekyears();
        org.joda.time.DateTimeZone dateTimeZone56 = copticChronology49.getZone();
        org.joda.time.chrono.CopticChronology copticChronology57 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField58 = copticChronology57.seconds();
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        long long62 = copticChronology57.add(readablePeriod59, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField63 = copticChronology57.secondOfDay();
        org.joda.time.DurationField durationField64 = copticChronology57.weekyears();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forID("+00:00");
        java.lang.String str67 = dateTimeZone66.getID();
        boolean boolean68 = dateTimeZone66.isFixed();
        java.util.Locale locale70 = null;
        java.lang.String str71 = dateTimeZone66.getShortName((long) (-1), locale70);
        org.joda.time.Chronology chronology72 = copticChronology57.withZone(dateTimeZone66);
        org.joda.time.DateTimeField dateTimeField73 = copticChronology57.weekyearOfCentury();
        boolean boolean74 = copticChronology49.equals((java.lang.Object) copticChronology57);
        org.joda.time.DurationField durationField75 = copticChronology57.halfdays();
        org.joda.time.DurationField durationField76 = copticChronology57.minutes();
        org.joda.time.DateTimeField dateTimeField77 = copticChronology57.yearOfEra();
        org.joda.time.DateTimeField dateTimeField78 = copticChronology57.millisOfDay();
        org.joda.time.DurationField durationField79 = copticChronology57.weeks();
        org.joda.time.DateTimeField dateTimeField80 = copticChronology57.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField81 = copticChronology57.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField82 = copticChronology57.monthOfYear();
        boolean boolean83 = dateTimeZone36.equals((java.lang.Object) dateTimeField82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField55", (durationField20.compareTo(durationField55) == 0) == durationField20.equals(durationField55));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
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
        org.joda.time.DateTimeField dateTimeField18 = copticChronology7.millisOfDay();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology7.year();
        org.joda.time.DurationField durationField20 = copticChronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField1, and durationField2", !(durationField20.compareTo(durationField1) == 0) || (Math.signum(durationField20.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.Chronology chronology4 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.joda.time.DurationField durationField8 = copticChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField7", Math.signum(durationField8.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField8)));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField7 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.halfdayOfDay();
        org.joda.time.Chronology chronology9 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.joda.time.Chronology chronology11 = copticChronology0.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField10", Math.signum(durationField7.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField7)));
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
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
        org.joda.time.DurationField durationField20 = copticChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField1, and durationField2", !(durationField20.compareTo(durationField1) == 0) || (Math.signum(durationField20.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
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
        int int10 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = copticChronology0.add(readablePeriod11, 2921667083984880000L, 10);
        org.joda.time.DurationField durationField15 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField1, and durationField2", !(durationField15.compareTo(durationField1) == 0) || (Math.signum(durationField15.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
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
        org.joda.time.DateTimeField dateTimeField23 = copticChronology8.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField22", (durationField12.compareTo(durationField22) == 0) == durationField12.equals(durationField22));
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
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
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField10", Math.signum(durationField7.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField7)));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField8, and durationField3", !(durationField3.compareTo(durationField8) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField8.compareTo(durationField3))));
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
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
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.yearOfEra();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology12.getZone();
        java.lang.String str16 = dateTimeZone14.getNameKey((long) ' ');
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField18 = copticChronology17.seconds();
        org.joda.time.DurationField durationField19 = copticChronology17.years();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology21 = copticChronology17.withZone(dateTimeZone20);
        int int23 = dateTimeZone20.getOffset((long) 0);
        int int25 = dateTimeZone20.getOffset((long) (byte) 1);
        boolean boolean26 = dateTimeZone14.equals((java.lang.Object) dateTimeZone20);
        boolean boolean27 = dateTimeZone14.isFixed();
        org.joda.time.Chronology chronology28 = copticChronology0.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField29 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField30 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField30, durationField18, and durationField19", !(durationField30.compareTo(durationField18) == 0) || (Math.signum(durationField30.compareTo(durationField19)) == Math.signum(durationField18.compareTo(durationField19))));
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
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
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.era();
        org.joda.time.DurationField durationField15 = copticChronology0.months();
        org.joda.time.DurationField durationField16 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField19 = copticChronology0.hours();
        org.joda.time.DurationField durationField20 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField1, and durationField15", !(durationField20.compareTo(durationField1) == 0) || (Math.signum(durationField20.compareTo(durationField15)) == Math.signum(durationField1.compareTo(durationField15))));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField3", Math.signum(durationField2.compareTo(durationField3)) == -Math.signum(durationField3.compareTo(durationField2)));
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfEra();
        int int9 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.weekOfWeekyear();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology12.yearOfCentury();
        org.joda.time.DurationField durationField16 = copticChronology12.seconds();
        boolean boolean17 = copticChronology0.equals((java.lang.Object) durationField16);
        long long21 = copticChronology0.add(35999999864L, (-3600004L), (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.Chronology chronology23 = copticChronology0.withZone(dateTimeZone22);
        java.lang.String str24 = copticChronology0.toString();
        org.joda.time.DurationField durationField25 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField6, and durationField16", !(durationField25.compareTo(durationField6) == 0) || (Math.signum(durationField25.compareTo(durationField16)) == Math.signum(durationField6.compareTo(durationField16))));
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.Chronology chronology4 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField5 = copticChronology0.years();
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
        long long19 = dateTimeZone12.convertLocalToUTC((long) 0, true);
        long long21 = dateTimeZone12.convertUTCToLocal((long) (short) -1);
        java.lang.String str22 = dateTimeZone12.getID();
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone12.isLocalDateTimeGap(localDateTime23);
        long long26 = dateTimeZone12.previousTransition(64001L);
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone12.getShortName(5L, locale28);
        long long31 = dateTimeZone12.nextTransition(32766010355L);
        org.joda.time.Chronology chronology32 = copticChronology0.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField33 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField33, durationField1, and durationField2", !(durationField33.compareTo(durationField1) == 0) || (Math.signum(durationField33.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
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
        org.joda.time.DateTimeField dateTimeField18 = copticChronology7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology7.era();
        org.joda.time.DurationField durationField20 = copticChronology7.centuries();
        org.joda.time.DurationField durationField21 = copticChronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField1, and durationField2", !(durationField21.compareTo(durationField1) == 0) || (Math.signum(durationField21.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
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
        org.joda.time.DurationField durationField17 = copticChronology7.weekyears();
        org.joda.time.DurationField durationField18 = copticChronology7.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField17", (durationField2.compareTo(durationField17) == 0) == durationField2.equals(durationField17));
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DurationField durationField3 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = copticChronology0.seconds();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField6", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField8 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField10", Math.signum(durationField1.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField1)));
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone2.getName(0L, locale5);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone2);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = copticChronology7.add(readablePeriod8, (-414712180800138L), (int) '4');
        org.joda.time.DateTimeField dateTimeField12 = copticChronology7.centuryOfEra();
        java.lang.String str13 = copticChronology7.toString();
        org.joda.time.DurationField durationField14 = copticChronology7.eras();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.weekyear();
        java.lang.String str16 = copticChronology7.toString();
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology17.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology17.weekyear();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology17.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology17.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology17.clockhourOfHalfday();
        org.joda.time.DurationField durationField24 = copticChronology17.days();
        org.joda.time.DurationField durationField25 = copticChronology17.centuries();
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField27 = copticChronology26.seconds();
        org.joda.time.DurationField durationField28 = copticChronology26.years();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology30 = copticChronology26.withZone(dateTimeZone29);
        boolean boolean31 = dateTimeZone29.isFixed();
        java.lang.String str32 = dateTimeZone29.getID();
        org.joda.time.chrono.CopticChronology copticChronology34 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone29, 4);
        org.joda.time.DateTimeField dateTimeField35 = copticChronology34.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone36 = copticChronology34.getZone();
        org.joda.time.Chronology chronology37 = copticChronology17.withZone(dateTimeZone36);
        long long40 = dateTimeZone36.convertLocalToUTC(0L, true);
        org.joda.time.Chronology chronology41 = copticChronology7.withZone(dateTimeZone36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField24", Math.signum(durationField14.compareTo(durationField24)) == -Math.signum(durationField24.compareTo(durationField14)));
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
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
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField13", Math.signum(durationField1.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField1)));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField4 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField7", (durationField4.compareTo(durationField7) == 0) == durationField4.equals(durationField7));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField3 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField5 = copticChronology0.halfdays();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours(100);
        boolean boolean8 = dateTimeZone7.isFixed();
        int int10 = dateTimeZone7.getOffsetFromLocal((long) 0);
        java.lang.String str12 = dateTimeZone7.getShortName((long) 4);
        int int14 = dateTimeZone7.getOffsetFromLocal(64001L);
        org.joda.time.Chronology chronology15 = copticChronology0.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField18 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField3, and durationField5", !(durationField18.compareTo(durationField3) == 0) || (Math.signum(durationField18.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
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
        org.joda.time.DurationField durationField17 = copticChronology12.hours();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology12.yearOfEra();
        org.joda.time.DurationField durationField21 = copticChronology12.seconds();
        org.joda.time.DurationField durationField22 = copticChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField1, and durationField2", !(durationField22.compareTo(durationField1) == 0) || (Math.signum(durationField22.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
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
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.year();
        org.joda.time.DurationField durationField13 = copticChronology0.days();
        org.joda.time.DurationField durationField14 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField3, and durationField4", !(durationField14.compareTo(durationField3) == 0) || (Math.signum(durationField14.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.secondOfDay();
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology4.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology4.secondOfMinute();
        org.joda.time.DurationField durationField7 = copticChronology4.halfdays();
        org.joda.time.DurationField durationField8 = copticChronology4.months();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology4.halfdayOfDay();
        org.joda.time.DurationField durationField10 = copticChronology4.weekyears();
        java.lang.Object obj11 = null;
        boolean boolean12 = copticChronology4.equals(obj11);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology4.era();
        org.joda.time.DurationField durationField14 = copticChronology4.centuries();
        org.joda.time.DurationField durationField15 = copticChronology4.millis();
        org.joda.time.DurationField durationField16 = copticChronology4.months();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology4.weekOfWeekyear();
        java.lang.String str18 = copticChronology4.toString();
        boolean boolean19 = copticChronology0.equals((java.lang.Object) copticChronology4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField10", (durationField2.compareTo(durationField10) == 0) == durationField2.equals(durationField10));
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
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
        org.joda.time.DurationField durationField19 = copticChronology7.years();
        org.joda.time.DurationField durationField20 = copticChronology7.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField20", (durationField2.compareTo(durationField20) == 0) == durationField2.equals(durationField20));
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
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
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.millisOfSecond();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField17 = copticChronology16.seconds();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = copticChronology16.add(readablePeriod18, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField22 = copticChronology16.millis();
        org.joda.time.DateTimeZone dateTimeZone23 = copticChronology16.getZone();
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone23);
        org.joda.time.Chronology chronology25 = copticChronology7.withZone(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField26 = copticChronology7.dayOfYear();
        org.joda.time.DurationField durationField27 = copticChronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField1, and durationField2", !(durationField27.compareTo(durationField1) == 0) || (Math.signum(durationField27.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
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
        org.joda.time.DurationField durationField13 = copticChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField13, and durationField12", !(durationField12.compareTo(durationField13) == 0) || (Math.signum(durationField12.compareTo(durationField12)) == Math.signum(durationField13.compareTo(durationField12))));
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfWeek();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = copticChronology7.eras();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology7.era();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.millisOfSecond();
        boolean boolean14 = copticChronology0.equals((java.lang.Object) dateTimeField13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField10", Math.signum(durationField3.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField3)));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.seconds();
        org.joda.time.DurationField durationField9 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField10 = copticChronology0.seconds();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology12.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.Chronology chronology16 = copticChronology12.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = copticChronology12.year();
        org.joda.time.DateTimeZone dateTimeZone18 = copticChronology12.getZone();
        long long22 = dateTimeZone18.convertLocalToUTC(100L, false, 1L);
        java.lang.String str23 = dateTimeZone18.getID();
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone18.getOffset(readableInstant24);
        org.joda.time.Chronology chronology26 = copticChronology11.withZone(dateTimeZone18);
        org.joda.time.DurationField durationField27 = copticChronology11.years();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology11.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology11.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology11.weekyear();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology11.minuteOfHour();
        org.joda.time.chrono.CopticChronology copticChronology32 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField33 = copticChronology32.seconds();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        long long37 = copticChronology32.add(readablePeriod34, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        long long41 = copticChronology32.add(readablePeriod38, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.Chronology chronology43 = copticChronology32.withZone(dateTimeZone42);
        org.joda.time.DurationField durationField44 = copticChronology32.minutes();
        org.joda.time.DateTimeField dateTimeField45 = copticChronology32.dayOfYear();
        org.joda.time.DateTimeField dateTimeField46 = copticChronology32.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField47 = copticChronology32.year();
        boolean boolean48 = copticChronology11.equals((java.lang.Object) copticChronology32);
        org.joda.time.DateTimeField dateTimeField49 = copticChronology32.millisOfDay();
        boolean boolean50 = copticChronology0.equals((java.lang.Object) copticChronology32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField27", (durationField9.compareTo(durationField27) == 0) == durationField9.equals(durationField27));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.DurationField durationField3 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.Chronology chronology5 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField6", Math.signum(durationField3.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField3)));
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        long long12 = copticChronology7.add(35L, 0L, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.dayOfYear();
        org.joda.time.DurationField durationField14 = copticChronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField14", (durationField2.compareTo(durationField14) == 0) == durationField2.equals(durationField14));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
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
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField15 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField1, and durationField12", !(durationField15.compareTo(durationField1) == 0) || (Math.signum(durationField15.compareTo(durationField12)) == Math.signum(durationField1.compareTo(durationField12))));
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
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
        org.joda.time.DurationField durationField20 = copticChronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology7.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField20", (durationField2.compareTo(durationField20) == 0) == durationField2.equals(durationField20));
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField12 = copticChronology0.minutes();
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
        org.joda.time.Chronology chronology37 = copticChronology0.withZone(dateTimeZone32);
        java.lang.String str38 = copticChronology0.toString();
        org.joda.time.DurationField durationField39 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField39, durationField1, and durationField12", !(durationField39.compareTo(durationField1) == 0) || (Math.signum(durationField39.compareTo(durationField12)) == Math.signum(durationField1.compareTo(durationField12))));
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
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
        org.joda.time.DurationField durationField16 = copticChronology15.seconds();
        org.joda.time.DurationField durationField17 = copticChronology15.years();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology19 = copticChronology15.withZone(dateTimeZone18);
        java.lang.String str21 = dateTimeZone18.getNameKey((long) 1);
        int int23 = dateTimeZone18.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        int int26 = dateTimeZone18.getOffset((long) (byte) 1);
        boolean boolean28 = dateTimeZone18.isStandardOffset(1L);
        long long32 = dateTimeZone18.convertLocalToUTC(1L, false, (long) (short) 1);
        long long34 = dateTimeZone18.convertUTCToLocal((long) 4);
        org.joda.time.Chronology chronology35 = copticChronology0.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField36 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField37 = copticChronology0.millis();
        org.joda.time.Chronology chronology38 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField39 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField39, durationField6, and durationField8", !(durationField39.compareTo(durationField6) == 0) || (Math.signum(durationField39.compareTo(durationField8)) == Math.signum(durationField6.compareTo(durationField8))));
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
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
        org.joda.time.DurationField durationField14 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField6, and durationField8", !(durationField14.compareTo(durationField6) == 0) || (Math.signum(durationField14.compareTo(durationField8)) == Math.signum(durationField6.compareTo(durationField8))));
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
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
        org.joda.time.DurationField durationField15 = copticChronology0.days();
        org.joda.time.DurationField durationField16 = copticChronology0.years();
        org.joda.time.DurationField durationField17 = copticChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField16", (durationField6.compareTo(durationField16) == 0) == durationField6.equals(durationField16));
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.era();
        org.joda.time.DurationField durationField7 = copticChronology0.hours();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField1, and durationField2", !(durationField13.compareTo(durationField1) == 0) || (Math.signum(durationField13.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
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
        long long21 = copticChronology0.add((long) 189300000, 360000000L, (int) '4');
        long long25 = copticChronology0.add((-101L), 360000010L, (int) (byte) -1);
        org.joda.time.DurationField durationField26 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology0.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField17 and durationField26", (durationField17.compareTo(durationField26) == 0) == durationField17.equals(durationField26));
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = copticChronology0.minutes();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = copticChronology0.add(readablePeriod8, 5L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.year();
        org.joda.time.DurationField durationField15 = copticChronology0.years();
        org.joda.time.DurationField durationField16 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField1, and durationField7", !(durationField16.compareTo(durationField1) == 0) || (Math.signum(durationField16.compareTo(durationField7)) == Math.signum(durationField1.compareTo(durationField7))));
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
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
        org.joda.time.DurationField durationField13 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField14 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField17 = copticChronology0.weeks();
        org.joda.time.DurationField durationField18 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField3, and durationField4", !(durationField18.compareTo(durationField3) == 0) || (Math.signum(durationField18.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
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
        org.joda.time.DurationField durationField22 = copticChronology0.years();
        org.joda.time.DurationField durationField23 = copticChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField20 and durationField22", (durationField20.compareTo(durationField22) == 0) == durationField20.equals(durationField22));
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
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
        org.joda.time.DateTimeZone dateTimeZone16 = copticChronology0.getZone();
        java.lang.String str18 = dateTimeZone16.getShortName((-3599901L));
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone16.getShortName((-482879910L), locale20);
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField23 = copticChronology22.seconds();
        org.joda.time.DurationField durationField24 = copticChronology22.years();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology22.yearOfCentury();
        org.joda.time.DurationField durationField26 = copticChronology22.seconds();
        org.joda.time.DurationField durationField27 = copticChronology22.hours();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology22.halfdayOfDay();
        long long32 = copticChronology22.add((-187199990L), (long) (short) 0, 189300000);
        java.lang.String str33 = copticChronology22.toString();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology22.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology22.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology22.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology22.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology22.centuryOfEra();
        boolean boolean39 = dateTimeZone16.equals((java.lang.Object) dateTimeField38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField24", (durationField7.compareTo(durationField24) == 0) == durationField7.equals(durationField24));
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.joda.time.DurationField durationField8 = copticChronology0.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField7", Math.signum(durationField6.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField6)));
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField5 = copticChronology0.weeks();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField1, and durationField2", !(durationField6.compareTo(durationField1) == 0) || (Math.signum(durationField6.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
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
        org.joda.time.DurationField durationField20 = copticChronology0.years();
        org.joda.time.DurationField durationField21 = copticChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField20", (durationField6.compareTo(durationField20) == 0) == durationField6.equals(durationField20));
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
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
        org.joda.time.DateTimeField dateTimeField15 = copticChronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology8.weekyearOfCentury();
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField19 = copticChronology18.seconds();
        org.joda.time.DurationField durationField20 = copticChronology18.years();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology22 = copticChronology18.withZone(dateTimeZone21);
        boolean boolean23 = dateTimeZone21.isFixed();
        java.lang.String str24 = dateTimeZone21.getID();
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone21, 4);
        org.joda.time.DateTimeField dateTimeField27 = copticChronology26.hourOfHalfday();
        long long31 = copticChronology26.add((long) ' ', 359999999L, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField32 = copticChronology26.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone33 = copticChronology26.getZone();
        org.joda.time.Chronology chronology34 = copticChronology8.withZone(dateTimeZone33);
        org.joda.time.chrono.CopticChronology copticChronology35 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology35.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology35.secondOfMinute();
        org.joda.time.DurationField durationField38 = copticChronology35.halfdays();
        org.joda.time.DurationField durationField39 = copticChronology35.months();
        org.joda.time.DateTimeField dateTimeField40 = copticChronology35.halfdayOfDay();
        org.joda.time.DurationField durationField41 = copticChronology35.weekyears();
        org.joda.time.DurationField durationField42 = copticChronology35.centuries();
        org.joda.time.DurationField durationField43 = copticChronology35.millis();
        org.joda.time.DateTimeField dateTimeField44 = copticChronology35.dayOfYear();
        org.joda.time.DurationField durationField45 = copticChronology35.millis();
        org.joda.time.DateTimeField dateTimeField46 = copticChronology35.monthOfYear();
        org.joda.time.DurationField durationField47 = copticChronology35.weekyears();
        org.joda.time.DurationField durationField48 = copticChronology35.months();
        org.joda.time.DateTimeField dateTimeField49 = copticChronology35.dayOfWeek();
        boolean boolean50 = dateTimeZone33.equals((java.lang.Object) dateTimeField49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField41", (durationField2.compareTo(durationField41) == 0) == durationField2.equals(durationField41));
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField2", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
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
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField17 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField1, and durationField7", !(durationField17.compareTo(durationField1) == 0) || (Math.signum(durationField17.compareTo(durationField7)) == Math.signum(durationField1.compareTo(durationField7))));
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
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
        org.joda.time.DurationField durationField12 = copticChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField12, and durationField9", !(durationField9.compareTo(durationField12) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField12.compareTo(durationField9))));
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = copticChronology0.getZone();
        long long13 = dateTimeZone11.nextTransition(3600001L);
        java.lang.String str15 = dateTimeZone11.getShortName(971L);
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone11);
        java.util.TimeZone timeZone17 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField20 = copticChronology19.seconds();
        org.joda.time.DurationField durationField21 = copticChronology19.years();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology23 = copticChronology19.withZone(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = dateTimeZone22.isLocalDateTimeGap(localDateTime24);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone22.getName((long) (byte) -1, locale27);
        org.joda.time.chrono.CopticChronology copticChronology29 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology29.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone31 = copticChronology29.getZone();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology29.dayOfYear();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology29.secondOfDay();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology29.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology29.secondOfDay();
        org.joda.time.DurationField durationField36 = copticChronology29.weekyears();
        boolean boolean37 = dateTimeZone22.equals((java.lang.Object) durationField36);
        long long39 = dateTimeZone18.getMillisKeepLocal(dateTimeZone22, 600948000000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField36", (durationField21.compareTo(durationField36) == 0) == durationField21.equals(durationField36));
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
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
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField17 and durationField18", (durationField17.compareTo(durationField18) == 0) == durationField17.equals(durationField18));
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField13 = copticChronology0.weekyears();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology14.secondOfMinute();
        org.joda.time.DurationField durationField17 = copticChronology14.weeks();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology14.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone19 = copticChronology14.getZone();
        org.joda.time.Chronology chronology20 = copticChronology14.withUTC();
        org.joda.time.Chronology chronology21 = copticChronology14.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology23.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology23.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.Chronology chronology27 = copticChronology23.withZone(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = copticChronology23.year();
        org.joda.time.DateTimeZone dateTimeZone29 = copticChronology23.getZone();
        long long33 = dateTimeZone29.convertLocalToUTC(100L, false, 1L);
        java.lang.String str34 = dateTimeZone29.getID();
        org.joda.time.ReadableInstant readableInstant35 = null;
        int int36 = dateTimeZone29.getOffset(readableInstant35);
        org.joda.time.Chronology chronology37 = copticChronology22.withZone(dateTimeZone29);
        org.joda.time.Chronology chronology38 = copticChronology14.withZone(dateTimeZone29);
        java.lang.String str39 = chronology38.toString();
        org.joda.time.chrono.CopticChronology copticChronology40 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology40.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone42 = copticChronology40.getZone();
        java.lang.String str44 = dateTimeZone42.getNameKey((long) ' ');
        org.joda.time.chrono.CopticChronology copticChronology45 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField46 = copticChronology45.seconds();
        org.joda.time.DurationField durationField47 = copticChronology45.years();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology49 = copticChronology45.withZone(dateTimeZone48);
        int int51 = dateTimeZone48.getOffset((long) 0);
        int int53 = dateTimeZone48.getOffset((long) (byte) 1);
        boolean boolean54 = dateTimeZone42.equals((java.lang.Object) dateTimeZone48);
        boolean boolean55 = dateTimeZone42.isFixed();
        java.lang.String str57 = dateTimeZone42.getNameKey((long) (byte) -1);
        org.joda.time.Chronology chronology58 = chronology38.withZone(dateTimeZone42);
        int int60 = dateTimeZone42.getOffset((-359999900L));
        org.joda.time.ReadableInstant readableInstant61 = null;
        int int62 = dateTimeZone42.getOffset(readableInstant61);
        org.joda.time.Chronology chronology63 = copticChronology0.withZone(dateTimeZone42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField47", (durationField13.compareTo(durationField47) == 0) == durationField13.equals(durationField47));
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.monthOfYear();
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
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField21 = copticChronology20.seconds();
        org.joda.time.DurationField durationField22 = copticChronology20.years();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology24 = copticChronology20.withZone(dateTimeZone23);
        java.lang.String str26 = dateTimeZone23.getNameKey((long) 1);
        int int28 = dateTimeZone23.getStandardOffset((long) (short) 0);
        long long30 = dateTimeZone15.getMillisKeepLocal(dateTimeZone23, (long) (short) 10);
        java.lang.String str32 = dateTimeZone15.getName(359999999L);
        long long34 = dateTimeZone15.convertUTCToLocal((long) (byte) 0);
        java.util.Locale locale36 = null;
        java.lang.String str37 = dateTimeZone15.getName(5L, locale36);
        java.util.TimeZone timeZone38 = dateTimeZone15.toTimeZone();
        boolean boolean39 = copticChronology0.equals((java.lang.Object) dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField40 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        long long47 = dateTimeZone43.getMillisKeepLocal(dateTimeZone45, (-359999968L));
        org.joda.time.chrono.CopticChronology copticChronology48 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone43);
        int int50 = dateTimeZone43.getStandardOffset((long) 4);
        org.joda.time.Chronology chronology51 = copticChronology0.withZone(dateTimeZone43);
        org.joda.time.DurationField durationField52 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField52, durationField3, and durationField6", !(durationField52.compareTo(durationField3) == 0) || (Math.signum(durationField52.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
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
        org.joda.time.DateTimeZone dateTimeZone18 = copticChronology12.getZone();
        org.joda.time.DurationField durationField19 = copticChronology12.centuries();
        org.joda.time.DurationField durationField20 = copticChronology12.weekyears();
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        java.lang.String str23 = dateTimeZone22.toString();
        long long25 = dateTimeZone22.convertUTCToLocal(0L);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, (int) ' ');
        long long30 = dateTimeZone22.getMillisKeepLocal(dateTimeZone28, (long) (short) 1);
        int int32 = dateTimeZone28.getOffset((-35L));
        org.joda.time.Chronology chronology33 = copticChronology12.withZone(dateTimeZone28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField20", (durationField2.compareTo(durationField20) == 0) == durationField2.equals(durationField20));
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField5, and durationField3", !(durationField3.compareTo(durationField5) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField5.compareTo(durationField3))));
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField9 = copticChronology0.hours();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField7", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
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
        org.joda.time.DateTimeField dateTimeField15 = copticChronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology8.hourOfHalfday();
        org.joda.time.DurationField durationField18 = copticChronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField1, and durationField2", !(durationField18.compareTo(durationField1) == 0) || (Math.signum(durationField18.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
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
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = copticChronology0.add(readablePeriod11, (-8128799889L), 126060000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField10", Math.signum(durationField7.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField7)));
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfEra();
        int int9 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.years();
        java.lang.String str12 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField15 = copticChronology0.weekyears();
        int int16 = copticChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField15", (durationField11.compareTo(durationField15) == 0) == durationField11.equals(durationField15));
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = copticChronology0.getZone();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone11.getShortName(3600000L, locale13);
        java.lang.String str16 = dateTimeZone11.getName(3600000L);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField18 = copticChronology17.seconds();
        org.joda.time.DurationField durationField19 = copticChronology17.years();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology21 = copticChronology17.withZone(dateTimeZone20);
        int int23 = dateTimeZone20.getOffset((long) 0);
        int int25 = dateTimeZone20.getOffset((long) (byte) 1);
        boolean boolean26 = dateTimeZone11.equals((java.lang.Object) dateTimeZone20);
        boolean boolean27 = dateTimeZone11.isFixed();
        long long29 = dateTimeZone11.convertUTCToLocal((long) 'a');
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone11.getName(135L, locale31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        int int34 = dateTimeZone11.getOffset(readableInstant33);
        org.joda.time.chrono.CopticChronology copticChronology35 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField36 = copticChronology35.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology37 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField38 = copticChronology37.seconds();
        org.joda.time.DurationField durationField39 = copticChronology37.millis();
        org.joda.time.DateTimeField dateTimeField40 = copticChronology37.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology37.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField42 = copticChronology37.dayOfYear();
        org.joda.time.DateTimeField dateTimeField43 = copticChronology37.clockhourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology44 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField45 = copticChronology44.seconds();
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        long long49 = copticChronology44.add(readablePeriod46, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        long long53 = copticChronology44.add(readablePeriod50, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField54 = copticChronology44.monthOfYear();
        org.joda.time.DurationField durationField55 = copticChronology44.months();
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        long long59 = copticChronology44.add(readablePeriod56, 90L, 100);
        org.joda.time.DurationField durationField60 = copticChronology44.seconds();
        org.joda.time.DateTimeField dateTimeField61 = copticChronology44.halfdayOfDay();
        org.joda.time.DurationField durationField62 = copticChronology44.months();
        org.joda.time.Chronology chronology63 = copticChronology44.withUTC();
        org.joda.time.DurationField durationField64 = copticChronology44.weekyears();
        org.joda.time.DurationField durationField65 = copticChronology44.days();
        org.joda.time.DateTimeZone dateTimeZone66 = copticChronology44.getZone();
        org.joda.time.Chronology chronology67 = copticChronology37.withZone(dateTimeZone66);
        boolean boolean68 = copticChronology35.equals((java.lang.Object) copticChronology37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField64", (durationField19.compareTo(durationField64) == 0) == durationField19.equals(durationField64));
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
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
        org.joda.time.DurationField durationField32 = copticChronology7.seconds();
        org.joda.time.DurationField durationField33 = copticChronology7.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField32", (durationField1.compareTo(durationField32) == 0) == durationField1.equals(durationField32));
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfHalfday();
        org.joda.time.Chronology chronology7 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField10 = copticChronology9.seconds();
        org.joda.time.DurationField durationField11 = copticChronology9.years();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology13 = copticChronology9.withZone(dateTimeZone12);
        java.lang.String str15 = dateTimeZone12.getNameKey((long) 1);
        int int17 = dateTimeZone12.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        boolean boolean20 = dateTimeZone12.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology21.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone23 = copticChronology21.getZone();
        boolean boolean24 = dateTimeZone12.equals((java.lang.Object) copticChronology21);
        org.joda.time.DateTimeField dateTimeField25 = copticChronology21.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology21.dayOfWeek();
        org.joda.time.DurationField durationField27 = copticChronology21.years();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology21.clockhourOfHalfday();
        org.joda.time.Chronology chronology29 = copticChronology21.withUTC();
        org.joda.time.DurationField durationField30 = copticChronology21.halfdays();
        org.joda.time.Chronology chronology31 = copticChronology21.withUTC();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology21.centuryOfEra();
        boolean boolean33 = copticChronology0.equals((java.lang.Object) dateTimeField32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField11", (durationField8.compareTo(durationField11) == 0) == durationField8.equals(durationField11));
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
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
        java.lang.String str15 = copticChronology0.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField14", Math.signum(durationField1.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField1)));
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
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
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField21 = copticChronology20.seconds();
        org.joda.time.DurationField durationField22 = copticChronology20.years();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology24 = copticChronology20.withZone(dateTimeZone23);
        java.lang.String str26 = dateTimeZone23.getNameKey((long) 1);
        int int28 = dateTimeZone23.getStandardOffset((long) (short) 0);
        long long30 = dateTimeZone15.getMillisKeepLocal(dateTimeZone23, (long) (short) 10);
        java.lang.String str32 = dateTimeZone15.getName(359999999L);
        long long34 = dateTimeZone15.convertUTCToLocal((long) (byte) 0);
        java.util.Locale locale36 = null;
        java.lang.String str37 = dateTimeZone15.getName(5L, locale36);
        java.util.TimeZone timeZone38 = dateTimeZone15.toTimeZone();
        org.joda.time.Chronology chronology39 = copticChronology8.withZone(dateTimeZone15);
        org.joda.time.DurationField durationField40 = chronology39.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField40, durationField1, and durationField2", !(durationField40.compareTo(durationField1) == 0) || (Math.signum(durationField40.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
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
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField4", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField11 = copticChronology0.minutes();
        org.joda.time.DurationField durationField12 = copticChronology0.months();
        java.lang.String str13 = copticChronology0.toString();
        org.joda.time.Chronology chronology14 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField15 = chronology14.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField11, and durationField12", !(durationField15.compareTo(durationField11) == 0) || (Math.signum(durationField15.compareTo(durationField12)) == Math.signum(durationField11.compareTo(durationField12))));
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
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
        org.joda.time.DurationField durationField10 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField1, and durationField2", !(durationField12.compareTo(durationField1) == 0) || (Math.signum(durationField12.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1124");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField14 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField16 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField1, and durationField11", !(durationField16.compareTo(durationField1) == 0) || (Math.signum(durationField16.compareTo(durationField11)) == Math.signum(durationField1.compareTo(durationField11))));
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1125");
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
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField14 = copticChronology0.years();
        org.joda.time.Chronology chronology15 = copticChronology0.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField14", (durationField6.compareTo(durationField14) == 0) == durationField6.equals(durationField14));
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1126");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfHalfday();
        java.lang.String str9 = copticChronology0.toString();
        org.joda.time.DurationField durationField10 = copticChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField10, and durationField3", !(durationField3.compareTo(durationField10) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField10.compareTo(durationField3))));
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1127");
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
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField19", (durationField6.compareTo(durationField19) == 0) == durationField6.equals(durationField19));
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1128");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfEra();
        org.joda.time.Chronology chronology9 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField10 = copticChronology0.millis();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField3, and durationField10", !(durationField11.compareTo(durationField3) == 0) || (Math.signum(durationField11.compareTo(durationField10)) == Math.signum(durationField3.compareTo(durationField10))));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1129");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.Chronology chronology7 = copticChronology0.withUTC();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = copticChronology0.add(readablePeriod8, 189300000L, 3600000);
        org.joda.time.Chronology chronology12 = copticChronology0.withUTC();
        int int13 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField14 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField3, and durationField6", !(durationField14.compareTo(durationField3) == 0) || (Math.signum(durationField14.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1130");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = copticChronology0.getZone();
        long long13 = dateTimeZone11.nextTransition(3600001L);
        java.lang.String str15 = dateTimeZone11.getShortName(971L);
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone11);
        org.joda.time.DurationField durationField17 = copticChronology16.years();
        org.joda.time.DurationField durationField18 = copticChronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField1, and durationField17", !(durationField18.compareTo(durationField1) == 0) || (Math.signum(durationField18.compareTo(durationField17)) == Math.signum(durationField1.compareTo(durationField17))));
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1131");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.centuries();
        org.joda.time.DurationField durationField12 = copticChronology0.years();
        org.joda.time.DurationField durationField13 = copticChronology0.weekyears();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = copticChronology0.add(readablePeriod14, (-363119800L), (int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField13", (durationField12.compareTo(durationField13) == 0) == durationField12.equals(durationField13));
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1132");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, (-34L), (int) (short) 10);
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField10", Math.signum(durationField1.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField1)));
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1133");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.centuries();
        org.joda.time.DurationField durationField4 = copticChronology0.eras();
        org.joda.time.DurationField durationField5 = copticChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField4", Math.signum(durationField3.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField3)));
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1134");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DurationField durationField4 = copticChronology0.weeks();
        org.joda.time.DurationField durationField5 = copticChronology0.weeks();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
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
        long long32 = dateTimeZone21.convertLocalToUTC(32L, true, (long) (-1));
        long long35 = dateTimeZone21.convertLocalToUTC((long) (byte) 1, true);
        int int37 = dateTimeZone21.getOffsetFromLocal((long) (-1));
        java.lang.String str38 = dateTimeZone21.toString();
        org.joda.time.Chronology chronology39 = copticChronology0.withZone(dateTimeZone21);
        long long43 = copticChronology0.add(13826996608435L, (long) (-1), 3600000);
        org.joda.time.DurationField durationField44 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField44, durationField1, and durationField2", !(durationField44.compareTo(durationField1) == 0) || (Math.signum(durationField44.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1135");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField17 = copticChronology0.eras();
        org.joda.time.DurationField durationField18 = copticChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField17", Math.signum(durationField1.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField1)));
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1136");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = copticChronology0.getZone();
        org.joda.time.DurationField durationField3 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField9", Math.signum(durationField3.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField3)));
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1137");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DurationField durationField7 = copticChronology0.years();
        org.joda.time.DurationField durationField8 = copticChronology0.weeks();
        org.joda.time.DurationField durationField9 = copticChronology0.halfdays();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField3, and durationField6", !(durationField12.compareTo(durationField3) == 0) || (Math.signum(durationField12.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1138");
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
        org.joda.time.Chronology chronology11 = copticChronology0.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField10", (durationField7.compareTo(durationField10) == 0) == durationField7.equals(durationField10));
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1139");
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
        org.joda.time.DurationField durationField10 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField11 = copticChronology0.days();
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField3, and durationField4", !(durationField12.compareTo(durationField3) == 0) || (Math.signum(durationField12.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1140");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.joda.time.Chronology chronology9 = copticChronology0.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField8", (durationField2.compareTo(durationField8) == 0) == durationField2.equals(durationField8));
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1141");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.halfdayOfDay();
        java.lang.String str11 = copticChronology8.toString();
        org.joda.time.DurationField durationField12 = copticChronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField1, and durationField2", !(durationField12.compareTo(durationField1) == 0) || (Math.signum(durationField12.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1142");
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
        org.joda.time.DateTimeField dateTimeField38 = copticChronology7.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField16", (durationField1.compareTo(durationField16) == 0) == durationField1.equals(durationField16));
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1143");
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
        org.joda.time.DurationField durationField12 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.era();
        org.joda.time.DurationField durationField14 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField3, and durationField4", !(durationField14.compareTo(durationField3) == 0) || (Math.signum(durationField14.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1144");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField12 = copticChronology0.minutes();
        org.joda.time.DurationField durationField13 = copticChronology0.weeks();
        org.joda.time.DurationField durationField14 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.year();
        org.joda.time.DurationField durationField17 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField1, and durationField12", !(durationField17.compareTo(durationField1) == 0) || (Math.signum(durationField17.compareTo(durationField12)) == Math.signum(durationField1.compareTo(durationField12))));
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1145");
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
        long long20 = copticChronology0.add(3L, 236L, 0);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField24 = copticChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone25 = copticChronology0.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField24", (durationField7.compareTo(durationField24) == 0) == durationField7.equals(durationField24));
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1146");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.joda.time.DurationField durationField10 = copticChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField9", Math.signum(durationField1.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField1)));
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1147");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.era();
        java.lang.String str4 = copticChronology0.toString();
        org.joda.time.DurationField durationField5 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfDay();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField8 = copticChronology7.seconds();
        org.joda.time.DurationField durationField9 = copticChronology7.years();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology11 = copticChronology7.withZone(dateTimeZone10);
        java.lang.String str13 = dateTimeZone10.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.millisOfSecond();
        org.joda.time.DurationField durationField16 = copticChronology14.centuries();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = copticChronology14.add(readablePeriod17, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField21 = copticChronology14.year();
        org.joda.time.DateTimeZone dateTimeZone22 = copticChronology14.getZone();
        long long24 = dateTimeZone22.previousTransition((-427794199L));
        long long28 = dateTimeZone22.convertLocalToUTC((-363119800L), false, 136511517120090L);
        boolean boolean30 = dateTimeZone22.isStandardOffset(1295999995814700132L);
        boolean boolean31 = copticChronology0.equals((java.lang.Object) dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField32 = copticChronology0.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField16", (durationField5.compareTo(durationField16) == 0) == durationField5.equals(durationField16));
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1148");
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
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField4, and durationField5", !(durationField13.compareTo(durationField4) == 0) || (Math.signum(durationField13.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1149");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.joda.time.Chronology chronology7 = copticChronology0.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField6", Math.signum(durationField3.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField3)));
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1150");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology7.add(readablePeriod10, 0L, (int) '4');
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.monthOfYear();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.year();
        org.joda.time.DurationField durationField16 = copticChronology7.weeks();
        org.joda.time.DurationField durationField17 = copticChronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField1, and durationField2", !(durationField17.compareTo(durationField1) == 0) || (Math.signum(durationField17.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1151");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField5 = copticChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.Chronology chronology7 = copticChronology0.withZone(dateTimeZone6);
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField8", (durationField2.compareTo(durationField8) == 0) == durationField2.equals(durationField8));
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1152");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = copticChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField7, and durationField3", !(durationField3.compareTo(durationField7) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField7.compareTo(durationField3))));
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1153");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DurationField durationField4 = copticChronology0.weeks();
        org.joda.time.DurationField durationField5 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        org.joda.time.DurationField durationField8 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField11 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField1, and durationField2", !(durationField11.compareTo(durationField1) == 0) || (Math.signum(durationField11.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1154");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        int int8 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = copticChronology0.add(readablePeriod9, 115200097L, 36000000);
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone15 = copticChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology13.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology13.clockhourOfDay();
        org.joda.time.DurationField durationField19 = copticChronology13.weekyears();
        org.joda.time.DateTimeZone dateTimeZone20 = copticChronology13.getZone();
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField22 = copticChronology21.seconds();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = copticChronology21.add(readablePeriod23, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField27 = copticChronology21.secondOfDay();
        org.joda.time.DurationField durationField28 = copticChronology21.weekyears();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forID("+00:00");
        java.lang.String str31 = dateTimeZone30.getID();
        boolean boolean32 = dateTimeZone30.isFixed();
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone30.getShortName((long) (-1), locale34);
        org.joda.time.Chronology chronology36 = copticChronology21.withZone(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField37 = copticChronology21.weekyearOfCentury();
        boolean boolean38 = copticChronology13.equals((java.lang.Object) copticChronology21);
        org.joda.time.DurationField durationField39 = copticChronology21.halfdays();
        org.joda.time.DurationField durationField40 = copticChronology21.minutes();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology21.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone42 = copticChronology21.getZone();
        org.joda.time.Chronology chronology43 = copticChronology0.withZone(dateTimeZone42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField19", (durationField2.compareTo(durationField19) == 0) == durationField2.equals(durationField19));
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1155");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekyear();
        java.lang.String str3 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfWeek();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField8 = copticChronology7.seconds();
        org.joda.time.DurationField durationField9 = copticChronology7.years();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.yearOfCentury();
        org.joda.time.DurationField durationField11 = copticChronology7.seconds();
        org.joda.time.DurationField durationField12 = copticChronology7.hours();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = copticChronology7.getZone();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology16.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone18 = copticChronology16.getZone();
        org.joda.time.DateTimeZone dateTimeZone19 = copticChronology16.getZone();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology16.millisOfDay();
        java.lang.String str21 = copticChronology16.toString();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology16.secondOfDay();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology16.dayOfYear();
        int int24 = copticChronology16.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone25 = copticChronology16.getZone();
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField27 = copticChronology26.seconds();
        org.joda.time.DurationField durationField28 = copticChronology26.years();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology30 = copticChronology26.withZone(dateTimeZone29);
        java.lang.String str32 = dateTimeZone29.getNameKey((long) 1);
        int int34 = dateTimeZone29.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone29);
        boolean boolean37 = dateTimeZone29.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.CopticChronology copticChronology38 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField39 = copticChronology38.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone40 = copticChronology38.getZone();
        boolean boolean41 = dateTimeZone29.equals((java.lang.Object) copticChronology38);
        org.joda.time.DateTimeField dateTimeField42 = copticChronology38.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField43 = copticChronology38.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField44 = copticChronology38.hourOfHalfday();
        boolean boolean45 = dateTimeZone25.equals((java.lang.Object) dateTimeField44);
        java.lang.String str46 = dateTimeZone25.toString();
        long long48 = dateTimeZone15.getMillisKeepLocal(dateTimeZone25, 99L);
        java.util.TimeZone timeZone49 = dateTimeZone25.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forTimeZone(timeZone49);
        long long53 = dateTimeZone50.convertLocalToUTC((-427794199L), false);
        java.lang.String str55 = dateTimeZone50.getNameKey(0L);
        org.joda.time.Chronology chronology56 = copticChronology0.withZone(dateTimeZone50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField9", (durationField5.compareTo(durationField9) == 0) == durationField5.equals(durationField9));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1156");
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
        org.joda.time.DurationField durationField15 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.centuryOfEra();
        int int17 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField20 = copticChronology19.seconds();
        org.joda.time.DurationField durationField21 = copticChronology19.years();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology23 = copticChronology19.withZone(dateTimeZone22);
        boolean boolean24 = dateTimeZone22.isFixed();
        java.lang.String str25 = dateTimeZone22.getID();
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone22, 4);
        org.joda.time.DateTimeField dateTimeField28 = copticChronology27.hourOfHalfday();
        long long32 = copticChronology27.add((long) ' ', 359999999L, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField33 = copticChronology27.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology27.monthOfYear();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology27.secondOfDay();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology27.weekyearOfCentury();
        org.joda.time.chrono.CopticChronology copticChronology37 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField38 = copticChronology37.seconds();
        org.joda.time.DurationField durationField39 = copticChronology37.years();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology41 = copticChronology37.withZone(dateTimeZone40);
        boolean boolean42 = dateTimeZone40.isFixed();
        java.lang.String str43 = dateTimeZone40.getID();
        org.joda.time.chrono.CopticChronology copticChronology45 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone40, 4);
        org.joda.time.DateTimeField dateTimeField46 = copticChronology45.hourOfHalfday();
        long long50 = copticChronology45.add((long) ' ', 359999999L, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField51 = copticChronology45.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone52 = copticChronology45.getZone();
        org.joda.time.Chronology chronology53 = copticChronology27.withZone(dateTimeZone52);
        org.joda.time.Chronology chronology54 = copticChronology0.withZone(dateTimeZone52);
        org.joda.time.DurationField durationField55 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField56 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField55", (durationField21.compareTo(durationField55) == 0) == durationField21.equals(durationField55));
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1157");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.year();
        org.joda.time.DurationField durationField3 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.Chronology chronology5 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField6", Math.signum(durationField3.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField3)));
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1158");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField6, and durationField3", !(durationField3.compareTo(durationField6) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField6.compareTo(durationField3))));
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1159");
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
        org.joda.time.DurationField durationField11 = copticChronology7.weekyears();
        org.joda.time.DurationField durationField12 = copticChronology7.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField11", (durationField2.compareTo(durationField11) == 0) == durationField2.equals(durationField11));
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1160");
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
        int int14 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField15 = copticChronology0.hours();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField17 = copticChronology16.seconds();
        org.joda.time.DurationField durationField18 = copticChronology16.years();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology20 = copticChronology16.withZone(dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone19.isLocalDateTimeGap(localDateTime21);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone19.getName((long) (byte) -1, locale24);
        int int27 = dateTimeZone19.getOffset((-82799999L));
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone19.getShortName((long) (byte) -1, locale29);
        long long33 = dateTimeZone19.adjustOffset(0L, false);
        int int35 = dateTimeZone19.getOffset(153300000L);
        org.joda.time.chrono.CopticChronology copticChronology36 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology36.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone38 = copticChronology36.getZone();
        org.joda.time.DateTimeZone dateTimeZone39 = copticChronology36.getZone();
        long long41 = dateTimeZone19.getMillisKeepLocal(dateTimeZone39, (-53176017599858L));
        org.joda.time.Chronology chronology42 = copticChronology0.withZone(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField18", (durationField6.compareTo(durationField18) == 0) == durationField6.equals(durationField18));
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1161");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField2", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1162");
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
        org.joda.time.DurationField durationField18 = copticChronology8.seconds();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology8.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField18", (durationField1.compareTo(durationField18) == 0) == durationField1.equals(durationField18));
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1163");
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
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField15 = copticChronology0.days();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology16.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology16.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology16.weekyear();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology16.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology16.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology16.monthOfYear();
        org.joda.time.DurationField durationField23 = copticChronology16.years();
        org.joda.time.DurationField durationField24 = copticChronology16.minutes();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        long long28 = copticChronology16.add(readablePeriod25, 8280000022L, (int) (byte) 0);
        org.joda.time.DurationField durationField29 = copticChronology16.hours();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology16.centuryOfEra();
        org.joda.time.DurationField durationField31 = copticChronology16.halfdays();
        boolean boolean32 = copticChronology0.equals((java.lang.Object) copticChronology16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField23", (durationField6.compareTo(durationField23) == 0) == durationField6.equals(durationField23));
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1164");
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
        org.joda.time.DateTimeField dateTimeField35 = copticChronology0.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField34", (durationField13.compareTo(durationField34) == 0) == durationField13.equals(durationField34));
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1165");
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
        long long38 = dateTimeZone35.convertLocalToUTC((long) (byte) 10, true);
        long long41 = dateTimeZone35.adjustOffset(0L, false);
        org.joda.time.chrono.CopticChronology copticChronology42 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField43 = copticChronology42.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField44 = copticChronology42.secondOfMinute();
        org.joda.time.DurationField durationField45 = copticChronology42.halfdays();
        org.joda.time.DurationField durationField46 = copticChronology42.months();
        org.joda.time.DateTimeField dateTimeField47 = copticChronology42.halfdayOfDay();
        org.joda.time.DurationField durationField48 = copticChronology42.weekyears();
        java.lang.Object obj49 = null;
        boolean boolean50 = copticChronology42.equals(obj49);
        org.joda.time.DateTimeField dateTimeField51 = copticChronology42.era();
        org.joda.time.Chronology chronology52 = copticChronology42.withUTC();
        org.joda.time.DateTimeZone dateTimeZone53 = copticChronology42.getZone();
        long long55 = dateTimeZone35.getMillisKeepLocal(dateTimeZone53, (-187199990L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField48", (durationField16.compareTo(durationField48) == 0) == durationField16.equals(durationField48));
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1166");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.halfdayOfDay();
        java.lang.String str9 = copticChronology0.toString();
        org.joda.time.DurationField durationField10 = copticChronology0.millis();
        org.joda.time.DurationField durationField11 = copticChronology0.seconds();
        org.joda.time.DurationField durationField12 = copticChronology0.months();
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField10, and durationField11", !(durationField13.compareTo(durationField10) == 0) || (Math.signum(durationField13.compareTo(durationField11)) == Math.signum(durationField10.compareTo(durationField11))));
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1167");
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
        boolean boolean16 = dateTimeZone3.isFixed();
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone3.getOffset(readableInstant17);
        long long20 = dateTimeZone3.nextTransition((long) 0);
        java.lang.String str21 = dateTimeZone3.toString();
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology22.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone24 = copticChronology22.getZone();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology22.dayOfYear();
        int int26 = copticChronology22.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology22.minuteOfHour();
        org.joda.time.DurationField durationField28 = copticChronology22.minutes();
        org.joda.time.DurationField durationField29 = copticChronology22.weeks();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology22.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
        org.joda.time.Chronology chronology33 = copticChronology22.withZone(dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField34 = copticChronology22.halfdayOfDay();
        org.joda.time.DurationField durationField35 = copticChronology22.weekyears();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology22.millisOfSecond();
        boolean boolean37 = dateTimeZone3.equals((java.lang.Object) copticChronology22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField35", (durationField2.compareTo(durationField35) == 0) == durationField2.equals(durationField35));
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1168");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.era();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField10", Math.signum(durationField7.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField7)));
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1169");
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
        org.joda.time.DateTimeField dateTimeField22 = copticChronology17.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology17.millisOfDay();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology17.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField21", (durationField2.compareTo(durationField21) == 0) == durationField2.equals(durationField21));
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1170");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField6 = copticChronology0.millis();
        org.joda.time.DurationField durationField7 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField11 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField12 = copticChronology0.years();
        java.lang.String str13 = copticChronology0.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField12", (durationField11.compareTo(durationField12) == 0) == durationField11.equals(durationField12));
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1171");
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
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.era();
        org.joda.time.DurationField durationField13 = copticChronology0.centuries();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField15 = copticChronology14.seconds();
        org.joda.time.DurationField durationField16 = copticChronology14.hours();
        org.joda.time.DurationField durationField17 = copticChronology14.seconds();
        org.joda.time.DurationField durationField18 = copticChronology14.halfdays();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology14.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology14.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology14.clockhourOfDay();
        org.joda.time.DurationField durationField22 = copticChronology14.halfdays();
        org.joda.time.DurationField durationField23 = copticChronology14.seconds();
        boolean boolean24 = copticChronology0.equals((java.lang.Object) copticChronology14);
        org.joda.time.DurationField durationField25 = copticChronology14.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField3, and durationField4", !(durationField25.compareTo(durationField3) == 0) || (Math.signum(durationField25.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1172");
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
        org.joda.time.DateTimeField dateTimeField24 = copticChronology2.dayOfMonth();
        org.joda.time.DurationField durationField25 = copticChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField3, and durationField4", !(durationField25.compareTo(durationField3) == 0) || (Math.signum(durationField25.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1173");
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
        long long26 = dateTimeZone13.convertLocalToUTC((long) (short) 1, true);
        long long28 = dateTimeZone13.nextTransition((-363599968L));
        org.joda.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = dateTimeZone13.isLocalDateTimeGap(localDateTime29);
        java.util.TimeZone timeZone31 = dateTimeZone13.toTimeZone();
        org.joda.time.chrono.CopticChronology copticChronology32 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField33 = copticChronology32.seconds();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        long long37 = copticChronology32.add(readablePeriod34, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        long long41 = copticChronology32.add(readablePeriod38, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.Chronology chronology43 = copticChronology32.withZone(dateTimeZone42);
        org.joda.time.DurationField durationField44 = copticChronology32.minutes();
        org.joda.time.chrono.CopticChronology copticChronology45 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField46 = copticChronology45.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField47 = copticChronology45.secondOfMinute();
        org.joda.time.DurationField durationField48 = copticChronology45.halfdays();
        org.joda.time.DurationField durationField49 = copticChronology45.months();
        org.joda.time.DateTimeField dateTimeField50 = copticChronology45.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField51 = copticChronology45.year();
        java.lang.String str52 = copticChronology45.toString();
        org.joda.time.DurationField durationField53 = copticChronology45.days();
        org.joda.time.DateTimeField dateTimeField54 = copticChronology45.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField55 = copticChronology45.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField56 = copticChronology45.monthOfYear();
        org.joda.time.chrono.CopticChronology copticChronology57 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField58 = copticChronology57.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField59 = copticChronology57.secondOfMinute();
        org.joda.time.DurationField durationField60 = copticChronology57.halfdays();
        int int61 = copticChronology57.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField62 = copticChronology57.months();
        org.joda.time.DateTimeField dateTimeField63 = copticChronology57.year();
        org.joda.time.DateTimeZone dateTimeZone64 = copticChronology57.getZone();
        java.lang.String str65 = dateTimeZone64.toString();
        org.joda.time.LocalDateTime localDateTime66 = null;
        boolean boolean67 = dateTimeZone64.isLocalDateTimeGap(localDateTime66);
        org.joda.time.Chronology chronology68 = copticChronology45.withZone(dateTimeZone64);
        org.joda.time.Chronology chronology69 = copticChronology32.withZone(dateTimeZone64);
        org.joda.time.DurationField durationField70 = copticChronology32.weekyears();
        org.joda.time.chrono.CopticChronology copticChronology71 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField72 = copticChronology71.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField73 = copticChronology71.secondOfMinute();
        org.joda.time.DurationField durationField74 = copticChronology71.halfdays();
        org.joda.time.DurationField durationField75 = copticChronology71.months();
        org.joda.time.DateTimeField dateTimeField76 = copticChronology71.halfdayOfDay();
        org.joda.time.DurationField durationField77 = copticChronology71.weekyears();
        org.joda.time.DurationField durationField78 = copticChronology71.centuries();
        org.joda.time.DurationField durationField79 = copticChronology71.millis();
        org.joda.time.DateTimeZone dateTimeZone80 = copticChronology71.getZone();
        org.joda.time.ReadableInstant readableInstant81 = null;
        int int82 = dateTimeZone80.getOffset(readableInstant81);
        org.joda.time.Chronology chronology83 = copticChronology32.withZone(dateTimeZone80);
        boolean boolean84 = dateTimeZone13.equals((java.lang.Object) dateTimeZone80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField70", (durationField12.compareTo(durationField70) == 0) == durationField12.equals(durationField70));
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1174");
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
        org.joda.time.DurationField durationField13 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField13", (durationField6.compareTo(durationField13) == 0) == durationField6.equals(durationField13));
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1175");
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
        java.lang.String str11 = copticChronology0.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField10", (durationField9.compareTo(durationField10) == 0) == durationField9.equals(durationField10));
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1176");
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
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField16 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField3, and durationField6", !(durationField16.compareTo(durationField3) == 0) || (Math.signum(durationField16.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1177");
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
        java.lang.String str10 = copticChronology0.toString();
        org.joda.time.DurationField durationField11 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField4", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1178");
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
        org.joda.time.DurationField durationField14 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone16 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.year();
        org.joda.time.DurationField durationField20 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField1, and durationField11", !(durationField20.compareTo(durationField1) == 0) || (Math.signum(durationField20.compareTo(durationField11)) == Math.signum(durationField1.compareTo(durationField11))));
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1179");
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
        org.joda.time.DurationField durationField13 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = copticChronology0.add(readablePeriod15, 209469948L, (int) (byte) 0);
        long long23 = copticChronology0.getDateTimeMillis(100, (int) (short) 1, 4, 0);
        org.joda.time.DurationField durationField24 = copticChronology0.months();
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField26 = copticChronology25.seconds();
        org.joda.time.DurationField durationField27 = copticChronology25.years();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology29 = copticChronology25.withZone(dateTimeZone28);
        boolean boolean30 = dateTimeZone28.isFixed();
        java.lang.String str31 = dateTimeZone28.getID();
        org.joda.time.chrono.CopticChronology copticChronology33 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone28, 4);
        java.lang.String str35 = dateTimeZone28.getNameKey(90L);
        long long37 = dateTimeZone28.convertUTCToLocal((-170L));
        org.joda.time.Chronology chronology38 = copticChronology0.withZone(dateTimeZone28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField27", (durationField6.compareTo(durationField27) == 0) == durationField6.equals(durationField27));
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1180");
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
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = copticChronology0.add(readablePeriod15, (-25L), (int) (byte) 0);
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
        long long34 = dateTimeZone25.convertUTCToLocal((long) (short) -1);
        java.lang.String str35 = dateTimeZone25.getID();
        org.joda.time.LocalDateTime localDateTime36 = null;
        boolean boolean37 = dateTimeZone25.isLocalDateTimeGap(localDateTime36);
        long long39 = dateTimeZone25.previousTransition(64001L);
        org.joda.time.chrono.CopticChronology copticChronology40 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone25);
        java.util.TimeZone timeZone41 = dateTimeZone25.toTimeZone();
        org.joda.time.Chronology chronology42 = copticChronology0.withZone(dateTimeZone25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField24", (durationField6.compareTo(durationField24) == 0) == durationField6.equals(durationField24));
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1181");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField5, and durationField3", !(durationField3.compareTo(durationField5) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField5.compareTo(durationField3))));
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1182");
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
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = copticChronology11.seconds();
        org.joda.time.DurationField durationField13 = copticChronology11.years();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology15 = copticChronology11.withZone(dateTimeZone14);
        boolean boolean16 = dateTimeZone14.isFixed();
        java.lang.String str17 = dateTimeZone14.getID();
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone14, 4);
        org.joda.time.DateTimeField dateTimeField20 = copticChronology19.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone21 = copticChronology19.getZone();
        org.joda.time.DurationField durationField22 = copticChronology19.months();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = copticChronology19.add(readablePeriod23, (long) (short) -1, (int) '#');
        org.joda.time.DateTimeField dateTimeField27 = copticChronology19.yearOfCentury();
        org.joda.time.DurationField durationField28 = copticChronology19.days();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours(100);
        boolean boolean31 = dateTimeZone30.isFixed();
        java.util.TimeZone timeZone32 = dateTimeZone30.toTimeZone();
        org.joda.time.Chronology chronology33 = copticChronology19.withZone(dateTimeZone30);
        boolean boolean34 = copticChronology7.equals((java.lang.Object) chronology33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField10", (durationField2.compareTo(durationField10) == 0) == durationField2.equals(durationField10));
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1183");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField8 = copticChronology0.centuries();
        org.joda.time.Chronology chronology9 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField3, and durationField8", !(durationField10.compareTo(durationField3) == 0) || (Math.signum(durationField10.compareTo(durationField8)) == Math.signum(durationField3.compareTo(durationField8))));
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1184");
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
        org.joda.time.DurationField durationField39 = copticChronology12.years();
        org.joda.time.DurationField durationField40 = copticChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology12.millisOfSecond();
        org.joda.time.DurationField durationField42 = copticChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField42, durationField1, and durationField2", !(durationField42.compareTo(durationField1) == 0) || (Math.signum(durationField42.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1185");
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
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField4", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1186");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        long long12 = copticChronology7.add(35L, 0L, (int) (byte) 100);
        long long16 = copticChronology7.add(10L, (long) (byte) 10, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField17 = copticChronology7.hourOfHalfday();
        int int18 = copticChronology7.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology7.monthOfYear();
        org.joda.time.DurationField durationField20 = copticChronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField1, and durationField2", !(durationField20.compareTo(durationField1) == 0) || (Math.signum(durationField20.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1187");
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
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField17 = copticChronology0.months();
        org.joda.time.DurationField durationField18 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField20 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField3, and durationField4", !(durationField20.compareTo(durationField3) == 0) || (Math.signum(durationField20.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1188");
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
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField9", Math.signum(durationField3.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField3)));
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1189");
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
        org.joda.time.DateTimeZone dateTimeZone13 = copticChronology0.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField12", (durationField6.compareTo(durationField12) == 0) == durationField6.equals(durationField12));
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1190");
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
        org.joda.time.DateTimeField dateTimeField21 = copticChronology7.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField16", (durationField2.compareTo(durationField16) == 0) == durationField2.equals(durationField16));
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1191");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.era();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.era();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology11.secondOfMinute();
        org.joda.time.DurationField durationField14 = copticChronology11.weeks();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology11.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology11.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology11.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = copticChronology11.add(readablePeriod18, (long) 0, (int) (short) -1);
        org.joda.time.DurationField durationField22 = copticChronology11.eras();
        boolean boolean23 = copticChronology7.equals((java.lang.Object) copticChronology11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField22", Math.signum(durationField1.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField1)));
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1192");
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
        java.lang.String str19 = copticChronology8.toString();
        org.joda.time.DateTimeZone dateTimeZone20 = copticChronology8.getZone();
        java.lang.String str21 = dateTimeZone20.toString();
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField23 = copticChronology22.seconds();
        org.joda.time.DurationField durationField24 = copticChronology22.hours();
        org.joda.time.DurationField durationField25 = copticChronology22.minutes();
        org.joda.time.DateTimeZone dateTimeZone26 = copticChronology22.getZone();
        long long28 = dateTimeZone26.nextTransition(5L);
        java.util.TimeZone timeZone29 = dateTimeZone26.toTimeZone();
        int int31 = dateTimeZone26.getOffset((-359999968L));
        java.lang.String str32 = dateTimeZone26.toString();
        java.lang.String str34 = dateTimeZone26.getNameKey((-35279991294L));
        int int36 = dateTimeZone26.getOffset(360000000L);
        long long40 = dateTimeZone26.convertLocalToUTC(36000010403L, false, 7200035L);
        java.lang.String str42 = dateTimeZone26.getName((-105L));
        org.joda.time.chrono.CopticChronology copticChronology43 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone26);
        long long45 = dateTimeZone20.getMillisKeepLocal(dateTimeZone26, (-726911631359790L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField24", (durationField18.compareTo(durationField24) == 0) == durationField18.equals(durationField24));
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1193");
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
        org.joda.time.DurationField durationField18 = copticChronology7.millis();
        org.joda.time.DurationField durationField19 = copticChronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField1, and durationField2", !(durationField19.compareTo(durationField1) == 0) || (Math.signum(durationField19.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1194");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, 1L, 3600000);
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.joda.time.DurationField durationField8 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.joda.time.DurationField durationField10 = copticChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField9", Math.signum(durationField8.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField8)));
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1195");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        long long9 = copticChronology0.add((long) 100, (long) (-1), 10);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.era();
        org.joda.time.Chronology chronology12 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.centuryOfEra();
        java.lang.String str14 = copticChronology0.toString();
        org.joda.time.DurationField durationField15 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField15", Math.signum(durationField3.compareTo(durationField15)) == -Math.signum(durationField15.compareTo(durationField3)));
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1196");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.minuteOfHour();
        org.joda.time.DurationField durationField9 = copticChronology7.weekyears();
        org.joda.time.DurationField durationField10 = copticChronology7.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField9", (durationField2.compareTo(durationField9) == 0) == durationField2.equals(durationField9));
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1197");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.years();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField1, and durationField2", !(durationField3.compareTo(durationField1) == 0) || (Math.signum(durationField3.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1198");
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
        org.joda.time.DateTimeField dateTimeField22 = copticChronology17.millisOfDay();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology17.yearOfCentury();
        org.joda.time.DurationField durationField24 = copticChronology17.years();
        org.joda.time.DurationField durationField25 = copticChronology17.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField24", (durationField2.compareTo(durationField24) == 0) == durationField2.equals(durationField24));
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1199");
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
        org.joda.time.DurationField durationField35 = copticChronology0.years();
        long long39 = copticChronology0.add((-8279899995L), (-8283598070L), 37920000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField35", (durationField11.compareTo(durationField35) == 0) == durationField11.equals(durationField35));
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1200");
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
        org.joda.time.DateTimeField dateTimeField36 = copticChronology0.era();
        org.joda.time.DurationField durationField37 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField37, durationField3, and durationField11", !(durationField37.compareTo(durationField3) == 0) || (Math.signum(durationField37.compareTo(durationField11)) == Math.signum(durationField3.compareTo(durationField11))));
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1201");
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
        org.joda.time.DateTimeField dateTimeField17 = copticChronology8.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField16", (durationField2.compareTo(durationField16) == 0) == durationField2.equals(durationField16));
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1202");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfMonth();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField9 = copticChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField9, and durationField3", !(durationField3.compareTo(durationField9) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField9.compareTo(durationField3))));
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1203");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = copticChronology0.eras();
        org.joda.time.DurationField durationField4 = copticChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField4, and durationField3", !(durationField3.compareTo(durationField4) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField4.compareTo(durationField3))));
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1204");
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
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1205");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        long long9 = copticChronology0.add((-82800000L), (long) 360000000, 1);
        org.joda.time.DurationField durationField10 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField12 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField16 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField1, and durationField2", !(durationField16.compareTo(durationField1) == 0) || (Math.signum(durationField16.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1206");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = copticChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfSecond();
        long long12 = copticChronology7.add(35L, 0L, (int) (byte) 100);
        long long16 = copticChronology7.add(10L, (long) (byte) 10, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField17 = copticChronology7.hourOfHalfday();
        org.joda.time.DurationField durationField18 = copticChronology7.years();
        org.joda.time.DurationField durationField19 = copticChronology7.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField18", (durationField2.compareTo(durationField18) == 0) == durationField2.equals(durationField18));
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1207");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.seconds();
        org.joda.time.DurationField durationField2 = copticChronology0.hours();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DurationField durationField4 = copticChronology0.weeks();
        org.joda.time.DurationField durationField5 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyearOfCentury();
        long long10 = copticChronology0.add(1179576364320001930L, (-241L), (int) (byte) 1);
        java.lang.String str11 = copticChronology0.toString();
        org.joda.time.DurationField durationField12 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField1, and durationField2", !(durationField12.compareTo(durationField1) == 0) || (Math.signum(durationField12.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1208");
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
        org.joda.time.DateTimeField dateTimeField20 = copticChronology7.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology7.clockhourOfDay();
        org.joda.time.DurationField durationField22 = copticChronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField1, and durationField2", !(durationField22.compareTo(durationField1) == 0) || (Math.signum(durationField22.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }
}

