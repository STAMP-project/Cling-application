import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology1.years();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology1.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology1.getDateTimeMillis((int) 'a', (int) 'a', (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.year();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology1.minutes();
        org.joda.time.DurationField durationField5 = islamicChronology1.years();
        long long9 = islamicChronology1.add(363510100L, 6100500L, (int) (short) 1);
        org.joda.time.DurationField durationField10 = islamicChronology1.centuries();
        org.joda.time.DateTimeZone dateTimeZone11 = islamicChronology1.getZone();
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 369610600L + "'", long9 == 369610600L);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.Chronology chronology3 = islamicChronology1.withUTC();
        org.joda.time.DurationField durationField4 = islamicChronology1.years();
        org.joda.time.DurationField durationField5 = islamicChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology1.monthOfYear();
        org.joda.time.DurationField durationField9 = islamicChronology1.weeks();
        org.joda.time.DurationField durationField10 = islamicChronology1.centuries();
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField2 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfHalfday();
        int int6 = islamicChronology0.getMinimumDaysInFirstWeek();
        java.lang.String str7 = islamicChronology0.toString();
        org.joda.time.Chronology chronology8 = islamicChronology0.withUTC();
        int int9 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IslamicChronology[Etc/UTC]" + "'", str7, "IslamicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.weekOfWeekyear();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType3 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = islamicChronology0.add(readablePeriod4, 360100104L, (int) 'a');
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType8 = islamicChronology0.getLeapYearPatternType();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(leapYearPatternType3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 360100104L + "'", long7 == 360100104L);
        org.junit.Assert.assertNotNull(leapYearPatternType8);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.centuryOfEra();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = islamicChronology1.set(readablePartial5, 610004L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField4 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.year();
        int int4 = islamicChronology0.getMinimumDaysInFirstWeek();
        java.lang.String str5 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.monthOfYear();
        org.joda.time.DurationField durationField7 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IslamicChronology[Etc/UTC]" + "'", str5, "IslamicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField4 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = islamicChronology0.add(readablePeriod10, (long) (short) 100, (int) '4');
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology0.millis();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField6 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField7 = islamicChronology0.seconds();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology0.halfdays();
        java.lang.String str4 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IslamicChronology[UTC]" + "'", str4, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.millisOfDay();
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology5.dayOfWeek();
        boolean boolean8 = islamicChronology5.equals((java.lang.Object) (-1L));
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology5.year();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology5.clockhourOfDay();
        org.joda.time.Chronology chronology11 = islamicChronology5.withUTC();
        org.joda.time.DateTimeZone dateTimeZone12 = islamicChronology5.getZone();
        org.joda.time.Chronology chronology13 = islamicChronology0.withZone(dateTimeZone12);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology14.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology14.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology14.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology14.weekOfWeekyear();
        org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology19.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = islamicChronology19.getZone();
        org.joda.time.Chronology chronology22 = islamicChronology14.withZone(dateTimeZone21);
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology23.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology23.secondOfMinute();
        org.joda.time.DurationField durationField26 = islamicChronology23.days();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology23.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology23.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology23.monthOfYear();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology23.weekyear();
        org.joda.time.DurationField durationField31 = islamicChronology23.hours();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType32 = islamicChronology23.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology33 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone21, leapYearPatternType32);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType34 = islamicChronology33.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology35 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12, leapYearPatternType34);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(islamicChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(islamicChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(islamicChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(islamicChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(leapYearPatternType32);
        org.junit.Assert.assertNotNull(islamicChronology33);
        org.junit.Assert.assertNotNull(leapYearPatternType34);
        org.junit.Assert.assertNotNull(islamicChronology35);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField5 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField6 = islamicChronology0.hours();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField2 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfMonth();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType4 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(leapYearPatternType4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField4 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.weekOfWeekyear();
        long long11 = islamicChronology0.add((long) (byte) 100, 0L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.yearOfCentury();
        java.lang.Class<?> wildcardClass13 = islamicChronology0.getClass();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        boolean boolean3 = islamicChronology0.equals((java.lang.Object) (-1L));
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfYear();
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology5.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology5.getZone();
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone7);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType9 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7, leapYearPatternType9);
        org.joda.time.ReadablePartial readablePartial11 = null;
        int[] intArray18 = new int[] { 0, '4', (byte) 0, (byte) 10, (short) 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology10.validate(readablePartial11, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(islamicChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(leapYearPatternType9);
        org.junit.Assert.assertNotNull(islamicChronology10);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 52, 0, 10, 10, -1]");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology0.centuries();
        org.joda.time.Chronology chronology6 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.Chronology chronology9 = islamicChronology0.withUTC();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology9);
    }
}

