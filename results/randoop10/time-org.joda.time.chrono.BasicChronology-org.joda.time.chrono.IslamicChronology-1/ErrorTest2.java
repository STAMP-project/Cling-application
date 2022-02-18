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
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.minuteOfDay();
        long long6 = islamicChronology0.add(32L, (-440688900L), 1);
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.weekyear();
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology8.weekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = islamicChronology8.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int15 = dateTimeZone13.getStandardOffset((long) (short) 100);
        org.joda.time.Chronology chronology16 = islamicChronology8.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology8.weekyear();
        boolean boolean19 = islamicChronology0.equals((java.lang.Object) islamicChronology8);
        org.joda.time.DateTimeZone dateTimeZone20 = islamicChronology0.getZone();
        long long23 = dateTimeZone20.convertLocalToUTC(14460101L, true);
        org.joda.time.chrono.IslamicChronology islamicChronology24 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone20);
        org.joda.time.DurationField durationField25 = islamicChronology24.years();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology24.dayOfWeek();
        org.joda.time.chrono.IslamicChronology islamicChronology27 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField28 = islamicChronology27.weeks();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology27.yearOfEra();
        org.joda.time.DurationField durationField30 = islamicChronology27.millis();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology27.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology27.halfdayOfDay();
        org.joda.time.DurationField durationField33 = islamicChronology27.centuries();
        org.joda.time.DurationField durationField34 = islamicChronology27.weeks();
        org.joda.time.DurationField durationField35 = islamicChronology27.weekyears();
        org.joda.time.DateTimeField dateTimeField36 = islamicChronology27.hourOfHalfday();
        org.joda.time.DurationField durationField37 = islamicChronology27.weekyears();
        org.joda.time.DurationField durationField38 = islamicChronology27.hours();
        long long42 = islamicChronology27.add(14460100L, 132L, (-1));
        long long46 = islamicChronology27.add(187200000L, 1664L, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        long long50 = islamicChronology27.add(readablePeriod47, (long) (short) 10, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone51 = islamicChronology27.getZone();
        org.joda.time.Chronology chronology52 = islamicChronology24.withZone(dateTimeZone51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField25 and durationField35", (durationField25.compareTo(durationField35) == 0) == durationField25.equals(durationField35));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField4 = islamicChronology0.days();
        org.joda.time.DurationField durationField5 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField4", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField4)) == Math.signum(durationField1.compareTo(durationField4))));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        long long10 = islamicChronology3.add((long) 1, (long) (byte) 100, 36000000);
        org.joda.time.DurationField durationField11 = islamicChronology3.seconds();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField13 = islamicChronology3.seconds();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology3.minuteOfDay();
        org.joda.time.DurationField durationField15 = islamicChronology3.years();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology3.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField15", (durationField6.compareTo(durationField15) == 0) == durationField6.equals(durationField15));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyearOfCentury();
        int int4 = islamicChronology0.getMinimumDaysInFirstWeek();
        long long10 = islamicChronology0.getDateTimeMillis(0L, (int) (byte) 10, (int) '#', (int) (byte) 0, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField16 = islamicChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField16, and durationField2", !(durationField2.compareTo(durationField16) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField16.compareTo(durationField2))));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        long long9 = islamicChronology0.getDateTimeMillis(4, (int) (byte) 10, 1, 10);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str12 = dateTimeZone11.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology13.clockhourOfDay();
        org.joda.time.DurationField durationField15 = islamicChronology13.hours();
        java.lang.String str16 = islamicChronology13.toString();
        org.joda.time.DurationField durationField17 = islamicChronology13.years();
        org.joda.time.DateTimeZone dateTimeZone18 = islamicChronology13.getZone();
        org.joda.time.Chronology chronology19 = islamicChronology0.withZone(dateTimeZone18);
        org.joda.time.Chronology chronology20 = islamicChronology0.withUTC();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = islamicChronology0.add(readablePeriod21, (-36000001L), 10);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.Chronology chronology26 = islamicChronology0.withZone(dateTimeZone25);
        org.joda.time.DurationField durationField27 = chronology26.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField15, and durationField17", !(durationField27.compareTo(durationField15) == 0) || (Math.signum(durationField27.compareTo(durationField17)) == Math.signum(durationField15.compareTo(durationField17))));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.year();
        org.joda.time.DurationField durationField6 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField6", Math.signum(durationField4.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField4)));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
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
        org.joda.time.DateTimeZone dateTimeZone21 = islamicChronology16.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField19", (durationField1.compareTo(durationField19) == 0) == durationField1.equals(durationField19));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
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
        org.joda.time.DurationField durationField10 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField12 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField13 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology0.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField13", (durationField3.compareTo(durationField13) == 0) == durationField3.equals(durationField13));
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
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
        org.joda.time.Chronology chronology12 = islamicChronology3.withUTC();
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology13.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str17 = dateTimeZone16.toString();
        boolean boolean18 = dateTimeZone16.isFixed();
        org.joda.time.Chronology chronology19 = islamicChronology13.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology13.hourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology13.secondOfMinute();
        org.joda.time.DurationField durationField23 = islamicChronology13.hours();
        org.joda.time.DateTimeZone dateTimeZone24 = islamicChronology13.getZone();
        long long28 = dateTimeZone24.convertLocalToUTC((-360000L), false, (-2044528502394613L));
        org.joda.time.Chronology chronology29 = islamicChronology3.withZone(dateTimeZone24);
        org.joda.time.DurationField durationField30 = islamicChronology3.hours();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology3.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField30", (durationField23.compareTo(durationField30) == 0) == durationField23.equals(durationField30));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField4 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str7 = dateTimeZone6.toString();
        boolean boolean9 = dateTimeZone6.isStandardOffset((long) (byte) 10);
        java.util.TimeZone timeZone10 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        long long14 = dateTimeZone12.previousTransition((long) 36000000);
        int int16 = dateTimeZone12.getOffset((long) (short) 100);
        org.joda.time.Chronology chronology17 = islamicChronology0.withZone(dateTimeZone12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField4", Math.signum(durationField1.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField1)));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, (long) 10, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.monthOfYear();
        long long14 = islamicChronology0.add((-42406761599990L), (-41571691200000L), 4);
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone18 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField19 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField1, and durationField3", !(durationField19.compareTo(durationField1) == 0) || (Math.signum(durationField19.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        long long7 = islamicChronology0.add(100L, (-1L), (int) 'a');
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField11 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField1, and durationField3", !(durationField11.compareTo(durationField1) == 0) || (Math.signum(durationField11.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
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
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology3.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField10", Math.signum(durationField7.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField7)));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        java.lang.String str6 = islamicChronology0.toString();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
        java.lang.Class<?> wildcardClass8 = islamicChronology0.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField7", Math.signum(durationField1.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField1)));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField8 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField9 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField9", (durationField5.compareTo(durationField9) == 0) == durationField5.equals(durationField9));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        long long12 = islamicChronology0.add((-36000010L), 998L, 3600000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField8", Math.signum(durationField5.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField5)));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 4);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone11.getShortName((-35999900L), locale13);
        org.joda.time.Chronology chronology15 = islamicChronology0.withZone(dateTimeZone11);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone11);
        org.joda.time.Chronology chronology17 = islamicChronology16.withUTC();
        org.joda.time.DurationField durationField18 = islamicChronology16.years();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology16.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField18", (durationField6.compareTo(durationField18) == 0) == durationField6.equals(durationField18));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        long long7 = islamicChronology0.add(10L, 0L, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.secondOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField3", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = islamicChronology0.add(readablePeriod6, 1L, 4);
        org.joda.time.DurationField durationField10 = islamicChronology0.halfdays();
        java.lang.String str11 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology0.minuteOfHour();
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
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone23.getShortName(149579068L, locale40);
        long long45 = dateTimeZone23.convertLocalToUTC((-99118968L), false, (long) (byte) -1);
        java.lang.String str47 = dateTimeZone23.getNameKey((-80689901L));
        java.lang.String str48 = dateTimeZone23.toString();
        org.joda.time.Chronology chronology49 = islamicChronology0.withZone(dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField26", Math.signum(durationField3.compareTo(durationField26)) == -Math.signum(durationField26.compareTo(durationField3)));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.weekyear();
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.joda.time.DurationField durationField9 = islamicChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField9, and durationField8", !(durationField8.compareTo(durationField9) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField9.compareTo(durationField8))));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        long long10 = islamicChronology3.add((long) 1, (long) (byte) 100, 36000000);
        org.joda.time.DurationField durationField11 = islamicChronology3.seconds();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField13 = islamicChronology3.seconds();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology3.minuteOfDay();
        org.joda.time.DurationField durationField15 = islamicChronology3.years();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology3.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField15", (durationField6.compareTo(durationField15) == 0) == durationField6.equals(durationField15));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfCentury();
        org.joda.time.Chronology chronology8 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField9 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField11 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField12 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField3, and durationField4", !(durationField12.compareTo(durationField3) == 0) || (Math.signum(durationField12.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField7", Math.signum(durationField1.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField1)));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        long long10 = islamicChronology3.add((long) 1, (long) (byte) 100, 36000000);
        org.joda.time.Chronology chronology11 = islamicChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.monthOfYear();
        long long16 = chronology11.add((-11L), 2232000340L, 100);
        org.joda.time.DateTimeField dateTimeField17 = chronology11.monthOfYear();
        org.joda.time.DateTimeField dateTimeField18 = chronology11.clockhourOfDay();
        org.joda.time.DurationField durationField19 = chronology11.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField5, and durationField6", !(durationField19.compareTo(durationField5) == 0) || (Math.signum(durationField19.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField4 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField4", Math.signum(durationField1.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField1)));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getShortName((long) 10, locale4);
        int int7 = dateTimeZone1.getOffsetFromLocal((long) 0);
        boolean boolean9 = dateTimeZone1.isStandardOffset((-80689900L));
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology10.weekyearOfCentury();
        org.joda.time.DurationField durationField12 = islamicChronology10.eras();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str15 = dateTimeZone14.toString();
        boolean boolean16 = dateTimeZone14.isFixed();
        java.lang.String str17 = dateTimeZone14.getID();
        org.joda.time.Chronology chronology18 = islamicChronology10.withZone(dateTimeZone14);
        long long20 = dateTimeZone14.nextTransition(14460100L);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone14, 119040031L);
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone1.isLocalDateTimeGap(localDateTime23);
        org.joda.time.chrono.IslamicChronology islamicChronology25 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField26 = islamicChronology25.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField26, and durationField12", !(durationField12.compareTo(durationField26) == 0) || (Math.signum(durationField12.compareTo(durationField12)) == Math.signum(durationField26.compareTo(durationField12))));
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.millis();
        org.joda.time.DurationField durationField7 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField3", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.years();
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField7 = islamicChronology6.weeks();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology6.yearOfEra();
        org.joda.time.DurationField durationField9 = islamicChronology6.millis();
        boolean boolean11 = islamicChronology6.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology6.clockhourOfDay();
        org.joda.time.Chronology chronology13 = islamicChronology6.withUTC();
        java.lang.String str14 = islamicChronology6.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = islamicChronology6.getZone();
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone15.getOffset(readableInstant16);
        org.joda.time.Chronology chronology18 = islamicChronology0.withZone(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField5", (durationField2.compareTo(durationField5) == 0) == durationField2.equals(durationField5));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField6, and durationField7", !(durationField8.compareTo(durationField6) == 0) || (Math.signum(durationField8.compareTo(durationField7)) == Math.signum(durationField6.compareTo(durationField7))));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField3 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField5 = islamicChronology0.months();
        org.joda.time.DurationField durationField6 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField1, and durationField3", !(durationField6.compareTo(durationField1) == 0) || (Math.signum(durationField6.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
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
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField13 = islamicChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField5, and durationField6", !(durationField13.compareTo(durationField5) == 0) || (Math.signum(durationField13.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        long long6 = islamicChronology0.add((long) 10, (long) 100, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.millisOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType9 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.era();
        org.joda.time.DurationField durationField11 = islamicChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField11, and durationField2", !(durationField2.compareTo(durationField11) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField11.compareTo(durationField2))));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
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
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology12.yearOfEra();
        org.joda.time.DurationField durationField24 = islamicChronology12.weekyears();
        org.joda.time.Chronology chronology25 = islamicChronology12.withUTC();
        org.joda.time.DurationField durationField26 = islamicChronology12.seconds();
        org.joda.time.DurationField durationField27 = islamicChronology12.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField24", (durationField6.compareTo(durationField24) == 0) == durationField6.equals(durationField24));
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
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
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField16 = islamicChronology3.centuries();
        int int17 = islamicChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 0);
        java.lang.String str22 = dateTimeZone20.getShortName((long) 'a');
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone20.getName((long) '4', locale24);
        org.joda.time.Chronology chronology26 = islamicChronology3.withZone(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology3.centuryOfEra();
        org.joda.time.Chronology chronology28 = islamicChronology3.withUTC();
        org.joda.time.DurationField durationField29 = chronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField29, durationField5, and durationField6", !(durationField29.compareTo(durationField5) == 0) || (Math.signum(durationField29.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str4 = dateTimeZone3.toString();
        boolean boolean5 = dateTimeZone3.isFixed();
        org.joda.time.Chronology chronology6 = islamicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = islamicChronology0.add(readablePeriod8, 3600000001L, (int) (short) 10);
        org.joda.time.DurationField durationField12 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField14 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField15 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone17 = islamicChronology0.getZone();
        long long22 = islamicChronology0.getDateTimeMillis(10, (int) (short) 10, 1, 0);
        org.joda.time.DurationField durationField23 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField24 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField12, and durationField14", !(durationField24.compareTo(durationField12) == 0) || (Math.signum(durationField24.compareTo(durationField14)) == Math.signum(durationField12.compareTo(durationField14))));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology3.getZone();
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str9 = dateTimeZone8.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology10.clockhourOfDay();
        org.joda.time.DurationField durationField12 = islamicChronology10.hours();
        java.lang.String str13 = islamicChronology10.toString();
        org.joda.time.DurationField durationField14 = islamicChronology10.months();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology10.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology10.centuryOfEra();
        org.joda.time.DurationField durationField17 = islamicChronology10.minutes();
        org.joda.time.DurationField durationField18 = islamicChronology10.years();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology10.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology10.centuryOfEra();
        boolean boolean21 = dateTimeZone5.equals((java.lang.Object) dateTimeField20);
        org.joda.time.chrono.IslamicChronology islamicChronology22 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField23 = islamicChronology22.weeks();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology22.yearOfEra();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology22.hourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology22.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        long long32 = dateTimeZone29.convertLocalToUTC((long) (byte) 1, true);
        java.lang.String str33 = dateTimeZone29.getID();
        long long35 = dateTimeZone29.nextTransition((long) 36000000);
        org.joda.time.Chronology chronology36 = islamicChronology22.withZone(dateTimeZone29);
        java.lang.String str37 = dateTimeZone29.getID();
        java.lang.String str39 = dateTimeZone29.getNameKey((-35999999L));
        java.lang.String str41 = dateTimeZone29.getNameKey(187203139L);
        org.joda.time.chrono.IslamicChronology islamicChronology42 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField43 = islamicChronology42.weeks();
        org.joda.time.DateTimeField dateTimeField44 = islamicChronology42.yearOfEra();
        org.joda.time.DurationField durationField45 = islamicChronology42.weekyears();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str48 = dateTimeZone47.toString();
        org.joda.time.Chronology chronology49 = islamicChronology42.withZone(dateTimeZone47);
        int int51 = dateTimeZone47.getOffset(1L);
        org.joda.time.chrono.IslamicChronology islamicChronology52 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField53 = islamicChronology52.dayOfYear();
        org.joda.time.DateTimeField dateTimeField54 = islamicChronology52.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField55 = islamicChronology52.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField56 = islamicChronology52.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType57 = islamicChronology52.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology58 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone47, leapYearPatternType57);
        org.joda.time.chrono.IslamicChronology islamicChronology59 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone29, leapYearPatternType57);
        org.joda.time.DateTimeField dateTimeField60 = islamicChronology59.secondOfMinute();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType61 = islamicChronology59.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology62 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5, leapYearPatternType61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField45", (durationField18.compareTo(durationField45) == 0) == durationField18.equals(durationField45));
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        boolean boolean4 = dateTimeZone1.isStandardOffset((long) (byte) 10);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        long long8 = dateTimeZone6.nextTransition((long) 36000000);
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology9.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology9.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology9.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology9.yearOfEra();
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField15 = islamicChronology14.weeks();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology14.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology14.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology14.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology14.minuteOfHour();
        org.joda.time.DurationField durationField20 = islamicChronology14.halfdays();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology14.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology14.secondOfDay();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology14.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone24 = islamicChronology14.getZone();
        long long26 = dateTimeZone24.nextTransition((-41571691199998L));
        org.joda.time.Chronology chronology27 = islamicChronology9.withZone(dateTimeZone24);
        org.joda.time.DurationField durationField28 = islamicChronology9.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField15, and durationField20", !(durationField28.compareTo(durationField15) == 0) || (Math.signum(durationField28.compareTo(durationField20)) == Math.signum(durationField15.compareTo(durationField20))));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField4 = islamicChronology0.eras();
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology5.weekyear();
        org.joda.time.Chronology chronology7 = islamicChronology5.withUTC();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = islamicChronology5.add(readablePeriod8, (-844789680L), (int) (short) 10);
        boolean boolean12 = islamicChronology0.equals((java.lang.Object) islamicChronology5);
        org.joda.time.DurationField durationField13 = islamicChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField13, and durationField4", !(durationField4.compareTo(durationField13) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField13.compareTo(durationField4))));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        long long7 = islamicChronology0.add(100L, (-1L), (int) 'a');
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField12 = islamicChronology0.halfdays();
        org.joda.time.DurationField durationField13 = islamicChronology0.halfdays();
        org.joda.time.DurationField durationField14 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField1, and durationField3", !(durationField14.compareTo(durationField1) == 0) || (Math.signum(durationField14.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology5.weekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology5.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int12 = dateTimeZone10.getStandardOffset((long) (short) 100);
        org.joda.time.Chronology chronology13 = islamicChronology5.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology5.halfdayOfDay();
        org.joda.time.DurationField durationField15 = islamicChronology5.centuries();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology5.minuteOfDay();
        org.joda.time.DurationField durationField17 = islamicChronology5.years();
        org.joda.time.chrono.IslamicChronology islamicChronology18 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology18.weekyear();
        org.joda.time.DateTimeZone dateTimeZone20 = islamicChronology18.getZone();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int25 = dateTimeZone23.getStandardOffset((long) (short) 100);
        org.joda.time.Chronology chronology26 = islamicChronology18.withZone(dateTimeZone23);
        org.joda.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = dateTimeZone23.isLocalDateTimeGap(localDateTime27);
        org.joda.time.Chronology chronology29 = islamicChronology5.withZone(dateTimeZone23);
        long long33 = islamicChronology5.add(149579068L, 1867800001L, (int) (short) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology34 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField35 = islamicChronology34.weeks();
        org.joda.time.DateTimeField dateTimeField36 = islamicChronology34.yearOfEra();
        org.joda.time.DurationField durationField37 = islamicChronology34.millis();
        org.joda.time.DateTimeField dateTimeField38 = islamicChronology34.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField39 = islamicChronology34.halfdayOfDay();
        org.joda.time.DurationField durationField40 = islamicChronology34.centuries();
        org.joda.time.DurationField durationField41 = islamicChronology34.weeks();
        org.joda.time.DateTimeField dateTimeField42 = islamicChronology34.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField43 = islamicChronology34.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField44 = islamicChronology34.secondOfDay();
        org.joda.time.DateTimeField dateTimeField45 = islamicChronology34.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        long long49 = dateTimeZone46.getMillisKeepLocal(dateTimeZone47, (long) (byte) -1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone47);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str53 = dateTimeZone52.toString();
        boolean boolean55 = dateTimeZone52.isStandardOffset((long) (byte) 10);
        java.util.TimeZone timeZone56 = dateTimeZone52.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forTimeZone(timeZone56);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forTimeZone(timeZone56);
        long long61 = dateTimeZone58.adjustOffset((long) '4', true);
        java.util.TimeZone timeZone62 = dateTimeZone58.toTimeZone();
        long long64 = dateTimeZone47.getMillisKeepLocal(dateTimeZone58, 42406761605287L);
        org.joda.time.Chronology chronology65 = islamicChronology34.withZone(dateTimeZone47);
        org.joda.time.DateTimeField dateTimeField66 = chronology65.minuteOfHour();
        boolean boolean67 = islamicChronology5.equals((java.lang.Object) chronology65);
        boolean boolean68 = islamicChronology0.equals((java.lang.Object) boolean67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField17", (durationField2.compareTo(durationField17) == 0) == durationField2.equals(durationField17));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone9 = islamicChronology0.getZone();
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        long long13 = dateTimeZone9.convertLocalToUTC((-82559998L), false);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField15 = islamicChronology14.weeks();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology14.yearOfEra();
        org.joda.time.DurationField durationField17 = islamicChronology14.millis();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology14.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology14.halfdayOfDay();
        org.joda.time.DurationField durationField20 = islamicChronology14.centuries();
        org.joda.time.DurationField durationField21 = islamicChronology14.weeks();
        org.joda.time.DurationField durationField22 = islamicChronology14.weekyears();
        java.lang.String str23 = islamicChronology14.toString();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology14.minuteOfHour();
        org.joda.time.DurationField durationField25 = islamicChronology14.halfdays();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType26 = islamicChronology14.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology27 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone9, leapYearPatternType26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField22", (durationField6.compareTo(durationField22) == 0) == durationField6.equals(durationField22));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
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
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField17 = islamicChronology0.days();
        org.joda.time.DurationField durationField18 = islamicChronology0.years();
        org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField20 = islamicChronology19.weeks();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology19.yearOfEra();
        org.joda.time.DurationField durationField22 = islamicChronology19.millis();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology19.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology19.halfdayOfDay();
        org.joda.time.DurationField durationField25 = islamicChronology19.years();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology19.era();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology19.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology19.halfdayOfDay();
        org.joda.time.Chronology chronology29 = islamicChronology19.withUTC();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology19.yearOfEra();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology19.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology19.yearOfEra();
        org.joda.time.DurationField durationField33 = islamicChronology19.weekyears();
        boolean boolean34 = islamicChronology0.equals((java.lang.Object) islamicChronology19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField33", (durationField18.compareTo(durationField33) == 0) == durationField18.equals(durationField33));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.minuteOfDay();
        long long6 = islamicChronology0.add(32L, (-440688900L), 1);
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField12 = islamicChronology0.eras();
        org.joda.time.DurationField durationField13 = islamicChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField12", Math.signum(durationField1.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField1)));
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
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
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology16.millisOfDay();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology16.clockhourOfHalfday();
        org.joda.time.DurationField durationField23 = islamicChronology16.seconds();
        org.joda.time.DurationField durationField24 = islamicChronology16.months();
        org.joda.time.DurationField durationField25 = islamicChronology16.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField19", (durationField1.compareTo(durationField19) == 0) == durationField1.equals(durationField19));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
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
        org.joda.time.DateTimeField dateTimeField24 = chronology22.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField23", (durationField3.compareTo(durationField23) == 0) == durationField3.equals(durationField23));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
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
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology11.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology11.dayOfYear();
        org.joda.time.DurationField durationField14 = islamicChronology11.minutes();
        org.joda.time.DurationField durationField15 = islamicChronology11.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology11.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology11.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology11.yearOfEra();
        org.joda.time.DurationField durationField19 = islamicChronology11.seconds();
        org.joda.time.DurationField durationField20 = islamicChronology11.halfdays();
        org.joda.time.chrono.IslamicChronology islamicChronology21 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField22 = islamicChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology21.yearOfEra();
        org.joda.time.DurationField durationField24 = islamicChronology21.weekyears();
        org.joda.time.Chronology chronology25 = islamicChronology21.withUTC();
        org.joda.time.DateTimeZone dateTimeZone26 = islamicChronology21.getZone();
        org.joda.time.Chronology chronology27 = islamicChronology11.withZone(dateTimeZone26);
        org.joda.time.chrono.IslamicChronology islamicChronology28 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology28.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology28.dayOfYear();
        org.joda.time.DurationField durationField31 = islamicChronology28.minutes();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology28.yearOfEra();
        java.lang.String str33 = islamicChronology28.toString();
        boolean boolean34 = dateTimeZone26.equals((java.lang.Object) str33);
        org.joda.time.Chronology chronology35 = islamicChronology0.withZone(dateTimeZone26);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType36 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DurationField durationField37 = islamicChronology0.years();
        org.joda.time.DurationField durationField38 = islamicChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField24 and durationField37", (durationField24.compareTo(durationField37) == 0) == durationField24.equals(durationField37));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyearOfCentury();
        int int4 = islamicChronology0.getMinimumDaysInFirstWeek();
        long long8 = islamicChronology0.add((-844789680L), (-89L), (int) (short) -1);
        org.joda.time.DurationField durationField9 = islamicChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField9, and durationField2", !(durationField2.compareTo(durationField9) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField9.compareTo(durationField2))));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long4 = dateTimeZone1.adjustOffset(36000000L, true);
        boolean boolean6 = dateTimeZone1.isStandardOffset((long) (byte) 10);
        long long8 = dateTimeZone1.nextTransition((-40936320000000L));
        java.lang.String str10 = dateTimeZone1.getName((long) (byte) 10);
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology11.dayOfYear();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology11.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology11.weekyear();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology11.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology11.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology11.dayOfWeek();
        org.joda.time.chrono.IslamicChronology islamicChronology18 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField19 = islamicChronology18.weeks();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology18.yearOfEra();
        org.joda.time.DurationField durationField21 = islamicChronology18.millis();
        long long25 = islamicChronology18.add(100L, (-1L), (int) 'a');
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology18.yearOfEra();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology18.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology18.hourOfDay();
        boolean boolean29 = islamicChronology11.equals((java.lang.Object) dateTimeField28);
        org.joda.time.DurationField durationField30 = islamicChronology11.minutes();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str33 = dateTimeZone32.toString();
        org.joda.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = dateTimeZone32.isLocalDateTimeGap(localDateTime34);
        java.lang.String str37 = dateTimeZone32.getName(36000001L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone32);
        org.joda.time.Chronology chronology39 = islamicChronology11.withZone(dateTimeZone32);
        org.joda.time.chrono.IslamicChronology islamicChronology40 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField41 = islamicChronology40.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField42 = islamicChronology40.dayOfYear();
        org.joda.time.DurationField durationField43 = islamicChronology40.minutes();
        org.joda.time.DateTimeField dateTimeField44 = islamicChronology40.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean48 = dateTimeZone46.equals((java.lang.Object) (-1.0d));
        int int50 = dateTimeZone46.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime51 = null;
        boolean boolean52 = dateTimeZone46.isLocalDateTimeGap(localDateTime51);
        int int54 = dateTimeZone46.getStandardOffset((long) 100);
        org.joda.time.Chronology chronology55 = islamicChronology40.withZone(dateTimeZone46);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        long long59 = dateTimeZone56.getMillisKeepLocal(dateTimeZone57, (long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant60 = null;
        int int61 = dateTimeZone57.getOffset(readableInstant60);
        long long63 = dateTimeZone57.convertUTCToLocal(14460100L);
        org.joda.time.Chronology chronology64 = islamicChronology40.withZone(dateTimeZone57);
        long long66 = dateTimeZone32.getMillisKeepLocal(dateTimeZone57, 1819L);
        org.joda.time.chrono.IslamicChronology islamicChronology67 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone57);
        long long69 = dateTimeZone1.getMillisKeepLocal(dateTimeZone57, (-72000010L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField30 and durationField43", (durationField30.compareTo(durationField43) == 0) == durationField30.equals(durationField43));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
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
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.secondOfMinute();
        int int13 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField17 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField1, and durationField3", !(durationField17.compareTo(durationField1) == 0) || (Math.signum(durationField17.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str9 = dateTimeZone8.toString();
        boolean boolean10 = dateTimeZone8.isFixed();
        java.lang.String str11 = dateTimeZone8.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str15 = dateTimeZone14.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology16.clockhourOfDay();
        org.joda.time.DurationField durationField18 = islamicChronology16.hours();
        org.joda.time.DurationField durationField19 = islamicChronology16.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology16.dayOfYear();
        org.joda.time.DurationField durationField21 = islamicChronology16.minutes();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology16.millisOfSecond();
        org.joda.time.DurationField durationField23 = islamicChronology16.halfdays();
        org.joda.time.DurationField durationField24 = islamicChronology16.centuries();
        org.joda.time.DateTimeZone dateTimeZone25 = islamicChronology16.getZone();
        int int27 = dateTimeZone25.getOffsetFromLocal((long) (byte) 100);
        java.lang.String str29 = dateTimeZone25.getNameKey(1663L);
        long long31 = dateTimeZone8.getMillisKeepLocal(dateTimeZone25, 31L);
        org.joda.time.Chronology chronology32 = islamicChronology0.withZone(dateTimeZone25);
        long long35 = dateTimeZone25.adjustOffset((-404087429448000000L), false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField21", (durationField5.compareTo(durationField21) == 0) == durationField5.equals(durationField21));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology3.hourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology3.yearOfEra();
        org.joda.time.DurationField durationField12 = islamicChronology3.years();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology3.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField12", (durationField6.compareTo(durationField12) == 0) == durationField6.equals(durationField12));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        long long5 = islamicChronology0.add((long) (short) -1, (long) '4', (int) '#');
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = islamicChronology0.add(readablePeriod7, (long) 10, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Chronology chronology12 = islamicChronology0.withZone(dateTimeZone11);
        org.joda.time.DurationField durationField13 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField14 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField16 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField6, and durationField13", !(durationField16.compareTo(durationField6) == 0) || (Math.signum(durationField16.compareTo(durationField13)) == Math.signum(durationField6.compareTo(durationField13))));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.weekyear();
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField6", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField6)) == Math.signum(durationField1.compareTo(durationField6))));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) (short) 10);
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2);
        org.joda.time.DurationField durationField4 = islamicChronology3.eras();
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology5.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology5.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology5.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone10 = islamicChronology5.getZone();
        int int12 = dateTimeZone10.getOffset((-880789680L));
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str15 = dateTimeZone14.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology16.clockhourOfDay();
        org.joda.time.DurationField durationField18 = islamicChronology16.hours();
        org.joda.time.DurationField durationField19 = islamicChronology16.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology16.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology16.hourOfHalfday();
        org.joda.time.DurationField durationField23 = islamicChronology16.centuries();
        boolean boolean24 = dateTimeZone10.equals((java.lang.Object) durationField23);
        long long26 = dateTimeZone10.convertUTCToLocal(35L);
        long long29 = dateTimeZone10.adjustOffset(36000001L, true);
        long long33 = dateTimeZone10.convertLocalToUTC(97L, false, 71999999L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        java.lang.String str35 = dateTimeZone10.toString();
        org.joda.time.Chronology chronology36 = islamicChronology3.withZone(dateTimeZone10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField18", Math.signum(durationField4.compareTo(durationField18)) == -Math.signum(durationField18.compareTo(durationField4)));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology0.hours();
        org.joda.time.DurationField durationField11 = islamicChronology0.halfdays();
        org.joda.time.DurationField durationField12 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField3, and durationField4", !(durationField12.compareTo(durationField3) == 0) || (Math.signum(durationField12.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
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
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField14 = islamicChronology0.hours();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str17 = dateTimeZone16.toString();
        boolean boolean19 = dateTimeZone16.isStandardOffset((long) (byte) 10);
        java.util.TimeZone timeZone20 = dateTimeZone16.toTimeZone();
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone16.isLocalDateTimeGap(localDateTime21);
        boolean boolean23 = dateTimeZone16.isFixed();
        org.joda.time.chrono.IslamicChronology islamicChronology24 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16);
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone16.getOffset(readableInstant25);
        java.lang.String str28 = dateTimeZone16.getNameKey(117527810716800035L);
        org.joda.time.Chronology chronology29 = islamicChronology0.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField31 = islamicChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField1, and durationField3", !(durationField31.compareTo(durationField1) == 0) || (Math.signum(durationField31.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 4);
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField9 = chronology8.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField9, and durationField2", !(durationField2.compareTo(durationField9) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField9.compareTo(durationField2))));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField6 = islamicChronology5.weeks();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology5.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology5.year();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = islamicChronology5.add(readablePeriod10, (long) 10, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = islamicChronology5.getZone();
        java.lang.String str15 = dateTimeZone14.getID();
        org.joda.time.Chronology chronology16 = islamicChronology0.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology0.era();
        org.joda.time.DurationField durationField19 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField23 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField25 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology0.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField25", (durationField3.compareTo(durationField25) == 0) == durationField3.equals(durationField25));
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField9", (durationField6.compareTo(durationField9) == 0) == durationField6.equals(durationField9));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
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
        boolean boolean15 = dateTimeZone5.isStandardOffset(19815699872L);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField17 = islamicChronology16.weeks();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology16.yearOfEra();
        org.joda.time.DurationField durationField19 = islamicChronology16.weekyears();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str22 = dateTimeZone21.toString();
        org.joda.time.Chronology chronology23 = islamicChronology16.withZone(dateTimeZone21);
        int int25 = dateTimeZone21.getOffset(1L);
        org.joda.time.chrono.IslamicChronology islamicChronology26 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology26.dayOfYear();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology26.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology26.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology26.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType31 = islamicChronology26.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology32 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone21, leapYearPatternType31);
        java.lang.String str34 = dateTimeZone21.getShortName((-208693526399990L));
        org.joda.time.chrono.IslamicChronology islamicChronology35 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField36 = islamicChronology35.minuteOfDay();
        org.joda.time.DurationField durationField37 = islamicChronology35.centuries();
        org.joda.time.DateTimeField dateTimeField38 = islamicChronology35.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone39 = islamicChronology35.getZone();
        java.lang.String str40 = dateTimeZone39.getID();
        boolean boolean41 = dateTimeZone5.equals((java.lang.Object) str40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField17", Math.signum(durationField3.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField3)));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.millis();
        org.joda.time.DurationField durationField6 = islamicChronology3.eras();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField6", Math.signum(durationField5.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField5)));
    }
}

