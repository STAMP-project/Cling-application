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
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology6.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology6.secondOfMinute();
        org.joda.time.DurationField durationField9 = islamicChronology6.days();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology6.centuryOfEra();
        org.joda.time.DurationField durationField11 = islamicChronology6.days();
        org.joda.time.DurationField durationField12 = islamicChronology6.millis();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType13 = islamicChronology6.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology6.era();
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology15.dayOfWeek();
        boolean boolean18 = islamicChronology15.equals((java.lang.Object) (-1L));
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology15.dayOfYear();
        org.joda.time.chrono.IslamicChronology islamicChronology20 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology20.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = islamicChronology20.getZone();
        org.joda.time.Chronology chronology23 = islamicChronology15.withZone(dateTimeZone22);
        org.joda.time.Chronology chronology24 = islamicChronology6.withZone(dateTimeZone22);
        org.joda.time.chrono.IslamicChronology islamicChronology25 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology25.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology25.secondOfMinute();
        org.joda.time.DurationField durationField28 = islamicChronology25.days();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology25.minuteOfDay();
        int int30 = islamicChronology25.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology25.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone32 = islamicChronology25.getZone();
        org.joda.time.chrono.IslamicChronology islamicChronology33 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology33.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField35 = islamicChronology33.clockhourOfHalfday();
        org.joda.time.DurationField durationField36 = islamicChronology33.minutes();
        org.joda.time.DateTimeField dateTimeField37 = islamicChronology33.year();
        org.joda.time.DurationField durationField38 = islamicChronology33.seconds();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType39 = islamicChronology33.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology40 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone32, leapYearPatternType39);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType41 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
        org.joda.time.chrono.IslamicChronology islamicChronology42 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone32, leapYearPatternType41);
        org.joda.time.chrono.IslamicChronology islamicChronology43 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone22, leapYearPatternType41);
        org.joda.time.Chronology chronology44 = islamicChronology0.withZone(dateTimeZone22);
        org.joda.time.chrono.IslamicChronology islamicChronology45 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField46 = islamicChronology45.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField47 = islamicChronology45.secondOfMinute();
        org.joda.time.DurationField durationField48 = islamicChronology45.days();
        org.joda.time.DateTimeField dateTimeField49 = islamicChronology45.minuteOfDay();
        org.joda.time.DurationField durationField50 = islamicChronology45.millis();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType51 = islamicChronology45.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology52 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone22, leapYearPatternType51);
        org.joda.time.DateTimeField dateTimeField53 = islamicChronology52.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone54 = islamicChronology52.getZone();
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray57 = islamicChronology52.get(readablePeriod55, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(islamicChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(leapYearPatternType13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(islamicChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(islamicChronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(islamicChronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(islamicChronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(leapYearPatternType39);
        org.junit.Assert.assertNotNull(islamicChronology40);
        org.junit.Assert.assertNotNull(leapYearPatternType41);
        org.junit.Assert.assertNotNull(islamicChronology42);
        org.junit.Assert.assertNotNull(islamicChronology43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(islamicChronology45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(leapYearPatternType51);
        org.junit.Assert.assertNotNull(islamicChronology52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeZone54);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.year();
        org.joda.time.DurationField durationField6 = islamicChronology0.hours();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        boolean boolean3 = islamicChronology0.equals((java.lang.Object) (-1L));
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfYear();
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology5.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology5.getZone();
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone7);
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology9.yearOfCentury();
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology12.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology12.monthOfYear();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology12.monthOfYear();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology12.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = islamicChronology12.getZone();
        org.joda.time.Chronology chronology20 = islamicChronology9.withZone(dateTimeZone19);
        org.joda.time.Chronology chronology21 = islamicChronology0.withZone(dateTimeZone19);
        org.joda.time.chrono.IslamicChronology islamicChronology22 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone19);
        long long26 = islamicChronology22.add((-42238331990096L), 231549652L, 0);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(islamicChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(islamicChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(islamicChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(islamicChronology22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-42238331990096L) + "'", long26 == (-42238331990096L));
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.monthOfYear();
        org.joda.time.DurationField durationField6 = islamicChronology0.months();
        org.joda.time.DurationField durationField7 = islamicChronology0.minutes();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = islamicChronology0.get(readablePeriod8, (-84469948L), 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology1.clockhourOfDay();
        int int6 = islamicChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField7 = islamicChronology1.days();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology1.dayOfWeek();
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology0.getZone();
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology7.secondOfDay();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology7.set(readablePartial9, 600010L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(islamicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = islamicChronology0.seconds();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology0.centuries();
        org.joda.time.Chronology chronology6 = islamicChronology0.withUTC();
        java.lang.String str7 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IslamicChronology[Etc/UTC]" + "'", str7, "IslamicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField8 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField9 = islamicChronology0.millis();
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology10.dayOfWeek();
        boolean boolean13 = islamicChronology10.equals((java.lang.Object) (-1L));
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology10.dayOfYear();
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology15.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = islamicChronology15.getZone();
        org.joda.time.Chronology chronology18 = islamicChronology10.withZone(dateTimeZone17);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType19 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology20 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone17, leapYearPatternType19);
        org.joda.time.chrono.IslamicChronology islamicChronology21 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone17);
        org.joda.time.Chronology chronology22 = islamicChronology0.withZone(dateTimeZone17);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(islamicChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(islamicChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(leapYearPatternType19);
        org.junit.Assert.assertNotNull(islamicChronology20);
        org.junit.Assert.assertNotNull(islamicChronology21);
        org.junit.Assert.assertNotNull(chronology22);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology1.yearOfCentury();
        org.joda.time.DurationField durationField7 = islamicChronology1.centuries();
        org.joda.time.DurationField durationField8 = islamicChronology1.years();
        int int9 = islamicChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField10 = islamicChronology1.years();
        org.joda.time.DurationField durationField11 = islamicChronology1.days();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology1.clockhourOfDay();
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.centuries();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.yearOfEra();
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology7.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology7.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology7.secondOfMinute();
        org.joda.time.DurationField durationField12 = islamicChronology7.hours();
        boolean boolean13 = islamicChronology0.equals((java.lang.Object) islamicChronology7);
        org.joda.time.DurationField durationField14 = islamicChronology7.months();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology7.year();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(islamicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekOfWeekyear();
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology5.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology5.getZone();
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField9 = islamicChronology0.centuries();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(islamicChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField3 = islamicChronology0.months();
        org.joda.time.DurationField durationField4 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField6 = islamicChronology0.millis();
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology7.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology7.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = islamicChronology7.minutes();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology7.year();
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology12.dayOfWeek();
        org.joda.time.DurationField durationField14 = islamicChronology12.halfdays();
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology15.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = islamicChronology15.getZone();
        org.joda.time.Chronology chronology18 = islamicChronology12.withZone(dateTimeZone17);
        org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone17);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType20 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology21 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone17, leapYearPatternType20);
        org.joda.time.Chronology chronology22 = islamicChronology7.withZone(dateTimeZone17);
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone17);
        boolean boolean24 = islamicChronology0.equals((java.lang.Object) islamicChronology23);
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology23.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology23.weekyearOfCentury();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(islamicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(islamicChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(islamicChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(islamicChronology19);
        org.junit.Assert.assertNotNull(leapYearPatternType20);
        org.junit.Assert.assertNotNull(islamicChronology21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(islamicChronology23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        int int5 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = islamicChronology0.add(readablePeriod4, 3635100L, (int) (byte) 100);
        org.joda.time.DurationField durationField8 = islamicChronology0.months();
        java.lang.Class<?> wildcardClass9 = islamicChronology0.getClass();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3635100L + "'", long7 == 3635100L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField4 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = islamicChronology0.years();
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology8.yearOfCentury();
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology11.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology11.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology11.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology11.monthOfYear();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology11.monthOfYear();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology11.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = islamicChronology11.getZone();
        org.joda.time.Chronology chronology19 = islamicChronology8.withZone(dateTimeZone18);
        org.joda.time.Chronology chronology20 = islamicChronology0.withZone(dateTimeZone18);
        org.joda.time.chrono.IslamicChronology islamicChronology21 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone18);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(islamicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(islamicChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(islamicChronology21);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfMonth();
        long long8 = islamicChronology0.add(1070L, 600020L, (int) (short) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology9.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology9.secondOfMinute();
        org.joda.time.DurationField durationField12 = islamicChronology9.days();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology9.dayOfMonth();
        boolean boolean16 = islamicChronology0.equals((java.lang.Object) islamicChronology9);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = islamicChronology9.get(readablePeriod17, (-101L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 601090L + "'", long8 == 601090L);
        org.junit.Assert.assertNotNull(islamicChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.monthOfYear();
        org.joda.time.DurationField durationField6 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField9 = islamicChronology0.centuries();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial6 = null;
        int[] intArray7 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial6, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology1.minuteOfHour();
        org.joda.time.DurationField durationField6 = islamicChronology1.years();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology1.millisOfSecond();
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
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
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfHalfday();
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology8.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = islamicChronology8.getZone();
        org.joda.time.Chronology chronology11 = islamicChronology0.withZone(dateTimeZone10);
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology12.dayOfWeek();
        org.joda.time.DurationField durationField14 = islamicChronology12.halfdays();
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology15.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = islamicChronology15.getZone();
        org.joda.time.Chronology chronology18 = islamicChronology12.withZone(dateTimeZone17);
        org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology19.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField22 = islamicChronology19.minutes();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology19.year();
        org.joda.time.DurationField durationField24 = islamicChronology19.seconds();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType25 = islamicChronology19.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology26 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone17, leapYearPatternType25);
        org.joda.time.chrono.IslamicChronology islamicChronology27 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology27.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology27.secondOfMinute();
        org.joda.time.DurationField durationField30 = islamicChronology27.days();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology27.minuteOfDay();
        org.joda.time.DurationField durationField32 = islamicChronology27.hours();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology27.dayOfMonth();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType34 = islamicChronology27.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology35 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone17, leapYearPatternType34);
        org.joda.time.chrono.IslamicChronology islamicChronology36 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10, leapYearPatternType34);
        org.joda.time.chrono.IslamicChronology islamicChronology37 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField38 = islamicChronology37.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField39 = islamicChronology37.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology37.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField41 = islamicChronology37.weekOfWeekyear();
        org.joda.time.chrono.IslamicChronology islamicChronology42 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField43 = islamicChronology42.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone44 = islamicChronology42.getZone();
        org.joda.time.Chronology chronology45 = islamicChronology37.withZone(dateTimeZone44);
        org.joda.time.chrono.IslamicChronology islamicChronology46 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField47 = islamicChronology46.dayOfWeek();
        boolean boolean49 = islamicChronology46.equals((java.lang.Object) (-1L));
        org.joda.time.DateTimeField dateTimeField50 = islamicChronology46.dayOfYear();
        org.joda.time.chrono.IslamicChronology islamicChronology51 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField52 = islamicChronology51.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone53 = islamicChronology51.getZone();
        org.joda.time.Chronology chronology54 = islamicChronology46.withZone(dateTimeZone53);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType55 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology56 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone53, leapYearPatternType55);
        org.joda.time.chrono.IslamicChronology islamicChronology57 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone44, leapYearPatternType55);
        org.joda.time.chrono.IslamicChronology islamicChronology58 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10, leapYearPatternType55);
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        long long62 = islamicChronology58.add(readablePeriod59, 36044240L, 100);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(islamicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(islamicChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(islamicChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(islamicChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(leapYearPatternType25);
        org.junit.Assert.assertNotNull(islamicChronology26);
        org.junit.Assert.assertNotNull(islamicChronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(leapYearPatternType34);
        org.junit.Assert.assertNotNull(islamicChronology35);
        org.junit.Assert.assertNotNull(islamicChronology36);
        org.junit.Assert.assertNotNull(islamicChronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(islamicChronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(islamicChronology46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(islamicChronology51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(leapYearPatternType55);
        org.junit.Assert.assertNotNull(islamicChronology56);
        org.junit.Assert.assertNotNull(islamicChronology57);
        org.junit.Assert.assertNotNull(islamicChronology58);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 36044240L + "'", long62 == 36044240L);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.centuryOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology1.era();
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        boolean boolean3 = islamicChronology0.equals((java.lang.Object) (-1L));
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.era();
        org.joda.time.DurationField durationField6 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField5 = islamicChronology0.centuries();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology0.getZone();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = islamicChronology0.add(readablePeriod7, (long) 1, 4);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField2 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.secondOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone7);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology12.weekyearOfCentury();
        boolean boolean15 = islamicChronology1.equals((java.lang.Object) islamicChronology12);
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology1.millisOfDay();
        org.joda.time.DurationField durationField17 = islamicChronology1.seconds();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = islamicChronology1.getDateTimeMillis(0, 0, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for year must be in the range [1,292271022]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(islamicChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(islamicChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        int int5 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology0.getZone();
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology8.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology8.clockhourOfHalfday();
        org.joda.time.DurationField durationField11 = islamicChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology8.year();
        org.joda.time.DurationField durationField13 = islamicChronology8.seconds();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType14 = islamicChronology8.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7, leapYearPatternType14);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType16 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
        org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7, leapYearPatternType16);
        org.joda.time.DurationField durationField18 = islamicChronology17.years();
        org.joda.time.DurationField durationField19 = islamicChronology17.years();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = islamicChronology17.add(readablePeriod20, (long) '4', (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology17.minuteOfHour();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(islamicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(leapYearPatternType14);
        org.junit.Assert.assertNotNull(islamicChronology15);
        org.junit.Assert.assertNotNull(leapYearPatternType16);
        org.junit.Assert.assertNotNull(islamicChronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 52L + "'", long23 == 52L);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = islamicChronology0.add(readablePeriod7, 0L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        int int5 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology0.getZone();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType8 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7, leapYearPatternType8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = islamicChronology9.add(readablePeriod10, 1L, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            long long19 = islamicChronology9.getDateTimeMillis((long) (short) 10, (-1), 4, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(leapYearPatternType8);
        org.junit.Assert.assertNotNull(islamicChronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        long long9 = islamicChronology0.add((long) '#', (long) 10, (int) 'a');
        org.joda.time.DurationField durationField10 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1005L + "'", long9 == 1005L);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        org.joda.time.DurationField durationField10 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField11 = islamicChronology0.minutes();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(islamicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType6 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField9 = islamicChronology0.weekyears();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(leapYearPatternType6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology0.days();
        org.joda.time.DurationField durationField6 = islamicChronology0.millis();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType7 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DurationField durationField8 = islamicChronology0.halfdays();
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology9.dayOfWeek();
        org.joda.time.DurationField durationField11 = islamicChronology9.halfdays();
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology12.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = islamicChronology12.getZone();
        org.joda.time.Chronology chronology15 = islamicChronology9.withZone(dateTimeZone14);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType17 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology18 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14, leapYearPatternType17);
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology18.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology18.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology18.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone22 = islamicChronology18.getZone();
        org.joda.time.DurationField durationField23 = islamicChronology18.seconds();
        boolean boolean24 = islamicChronology0.equals((java.lang.Object) islamicChronology18);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(leapYearPatternType7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(islamicChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(islamicChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(islamicChronology16);
        org.junit.Assert.assertNotNull(leapYearPatternType17);
        org.junit.Assert.assertNotNull(islamicChronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology0.centuries();
        org.joda.time.Chronology chronology6 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.halfdayOfDay();
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology8.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology8.secondOfMinute();
        org.joda.time.DurationField durationField11 = islamicChronology8.days();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology8.centuryOfEra();
        org.joda.time.DurationField durationField13 = islamicChronology8.days();
        org.joda.time.DurationField durationField14 = islamicChronology8.millis();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType15 = islamicChronology8.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology8.era();
        org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology17.dayOfWeek();
        boolean boolean20 = islamicChronology17.equals((java.lang.Object) (-1L));
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology17.dayOfYear();
        org.joda.time.chrono.IslamicChronology islamicChronology22 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology22.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = islamicChronology22.getZone();
        org.joda.time.Chronology chronology25 = islamicChronology17.withZone(dateTimeZone24);
        org.joda.time.Chronology chronology26 = islamicChronology8.withZone(dateTimeZone24);
        org.joda.time.Chronology chronology27 = islamicChronology0.withZone(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField29 = islamicChronology0.millis();
        org.joda.time.DurationField durationField30 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(islamicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(leapYearPatternType15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(islamicChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(islamicChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = islamicChronology2.getZone();
        org.joda.time.Chronology chronology5 = islamicChronology0.withZone(dateTimeZone4);
        org.joda.time.DurationField durationField6 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = islamicChronology0.add(readablePeriod10, (long) '#', (int) '#');
        org.joda.time.DurationField durationField14 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField15 = islamicChronology0.years();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.millis();
        org.joda.time.DurationField durationField5 = islamicChronology0.years();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.monthOfYear();
        int int10 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField11 = islamicChronology0.millis();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.year();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology1.minutes();
        org.joda.time.DurationField durationField5 = islamicChronology1.years();
        long long9 = islamicChronology1.add(363510100L, 6100500L, (int) (short) 1);
        org.joda.time.DurationField durationField10 = islamicChronology1.centuries();
        org.joda.time.DateTimeZone dateTimeZone11 = islamicChronology1.getZone();
        org.joda.time.DurationField durationField12 = islamicChronology1.hours();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = islamicChronology1.getDateTimeMillis((-39467519999948L), (int) (short) 0, 1, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 369610600L + "'", long9 == 369610600L);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DurationField durationField5 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField7 = islamicChronology0.years();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType8 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeZone dateTimeZone9 = islamicChronology0.getZone();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(leapYearPatternType8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField5 = islamicChronology0.days();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField5 = islamicChronology0.days();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = islamicChronology1.days();
        long long8 = islamicChronology1.getDateTimeMillis(100L, (int) (byte) 0, (int) (byte) 10, (int) (byte) 0, (int) (byte) 10);
        org.joda.time.DurationField durationField9 = islamicChronology1.halfdays();
        org.joda.time.DurationField durationField10 = islamicChronology1.halfdays();
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600010L + "'", long8 == 600010L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField4 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField8 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField11 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.joda.time.Chronology chronology9 = islamicChronology0.withUTC();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = islamicChronology0.weeks();
        int int7 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        java.lang.String str9 = islamicChronology8.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology10.dayOfWeek();
        org.joda.time.DurationField durationField12 = islamicChronology10.halfdays();
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology13.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = islamicChronology13.getZone();
        org.joda.time.Chronology chronology16 = islamicChronology10.withZone(dateTimeZone15);
        org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology17.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology17.clockhourOfHalfday();
        org.joda.time.DurationField durationField20 = islamicChronology17.minutes();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology17.year();
        org.joda.time.DurationField durationField22 = islamicChronology17.seconds();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType23 = islamicChronology17.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology24 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15, leapYearPatternType23);
        org.joda.time.chrono.IslamicChronology islamicChronology25 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15);
        org.joda.time.Chronology chronology26 = islamicChronology8.withZone(dateTimeZone15);
        org.joda.time.Chronology chronology27 = islamicChronology0.withZone(dateTimeZone15);
        org.joda.time.chrono.IslamicChronology islamicChronology28 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology28.dayOfWeek();
        org.joda.time.DurationField durationField30 = islamicChronology28.halfdays();
        org.joda.time.chrono.IslamicChronology islamicChronology31 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology31.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone33 = islamicChronology31.getZone();
        org.joda.time.Chronology chronology34 = islamicChronology28.withZone(dateTimeZone33);
        org.joda.time.chrono.IslamicChronology islamicChronology35 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone33);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType36 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology37 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone33, leapYearPatternType36);
        org.joda.time.chrono.IslamicChronology islamicChronology38 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15, leapYearPatternType36);
        org.joda.time.DateTimeField dateTimeField39 = islamicChronology38.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology38.weekyearOfCentury();
        org.joda.time.DurationField durationField41 = islamicChronology38.minutes();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(islamicChronology8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IslamicChronology[UTC]" + "'", str9, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(islamicChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(islamicChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(islamicChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(leapYearPatternType23);
        org.junit.Assert.assertNotNull(islamicChronology24);
        org.junit.Assert.assertNotNull(islamicChronology25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(islamicChronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(islamicChronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(islamicChronology35);
        org.junit.Assert.assertNotNull(leapYearPatternType36);
        org.junit.Assert.assertNotNull(islamicChronology37);
        org.junit.Assert.assertNotNull(islamicChronology38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology18.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology18.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology18.monthOfYear();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology18.weekyear();
        org.joda.time.DurationField durationField26 = islamicChronology18.hours();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType27 = islamicChronology18.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology28 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14, leapYearPatternType27);
        org.joda.time.chrono.IslamicChronology islamicChronology29 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology29.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology29.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology29.dayOfWeek();
        org.joda.time.DurationField durationField33 = islamicChronology29.centuries();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology29.dayOfYear();
        org.joda.time.DateTimeField dateTimeField35 = islamicChronology29.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField36 = islamicChronology29.centuryOfEra();
        org.joda.time.Chronology chronology37 = islamicChronology29.withUTC();
        org.joda.time.DateTimeField dateTimeField38 = islamicChronology29.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField39 = islamicChronology29.minuteOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType40 = islamicChronology29.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology41 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14, leapYearPatternType40);
        org.joda.time.chrono.IslamicChronology islamicChronology42 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField43 = islamicChronology42.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField44 = islamicChronology42.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField45 = islamicChronology42.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField46 = islamicChronology42.weekOfWeekyear();
        org.joda.time.chrono.IslamicChronology islamicChronology47 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField48 = islamicChronology47.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone49 = islamicChronology47.getZone();
        org.joda.time.Chronology chronology50 = islamicChronology42.withZone(dateTimeZone49);
        org.joda.time.chrono.IslamicChronology islamicChronology51 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField52 = islamicChronology51.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField53 = islamicChronology51.secondOfMinute();
        org.joda.time.DurationField durationField54 = islamicChronology51.days();
        org.joda.time.DateTimeField dateTimeField55 = islamicChronology51.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField56 = islamicChronology51.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField57 = islamicChronology51.monthOfYear();
        org.joda.time.DateTimeField dateTimeField58 = islamicChronology51.weekyear();
        org.joda.time.DurationField durationField59 = islamicChronology51.hours();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType60 = islamicChronology51.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology61 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone49, leapYearPatternType60);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType62 = islamicChronology61.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology63 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14, leapYearPatternType62);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(islamicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(leapYearPatternType15);
        org.junit.Assert.assertNotNull(islamicChronology16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(islamicChronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(leapYearPatternType27);
        org.junit.Assert.assertNotNull(islamicChronology28);
        org.junit.Assert.assertNotNull(islamicChronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(leapYearPatternType40);
        org.junit.Assert.assertNotNull(islamicChronology41);
        org.junit.Assert.assertNotNull(islamicChronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(islamicChronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(islamicChronology51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(durationField54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(durationField59);
        org.junit.Assert.assertNotNull(leapYearPatternType60);
        org.junit.Assert.assertNotNull(islamicChronology61);
        org.junit.Assert.assertNotNull(leapYearPatternType62);
        org.junit.Assert.assertNotNull(islamicChronology63);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.year();
        org.joda.time.DurationField durationField4 = islamicChronology0.centuries();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology6.clockhourOfDay();
        org.joda.time.DurationField durationField8 = islamicChronology6.millis();
        org.joda.time.Chronology chronology9 = islamicChronology6.withUTC();
        boolean boolean10 = islamicChronology0.equals((java.lang.Object) chronology9);
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(islamicChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField4 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField4 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.year();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology1.era();
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DurationField durationField5 = islamicChronology0.months();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.year();
        int int4 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType8 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(leapYearPatternType8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.months();
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology7.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology7.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology7.millisOfSecond();
        org.joda.time.DurationField durationField11 = islamicChronology7.weeks();
        boolean boolean12 = islamicChronology0.equals((java.lang.Object) islamicChronology7);
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.secondOfDay();
        long long19 = islamicChronology0.getDateTimeMillis((-1L), 0, 0, (int) '#', 100);
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField21 = islamicChronology0.seconds();
        java.lang.String str22 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(islamicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-86364900L) + "'", long19 == (-86364900L));
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "IslamicChronology[Etc/UTC]" + "'", str22, "IslamicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        boolean boolean3 = islamicChronology0.equals((java.lang.Object) (-1L));
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.clockhourOfDay();
        long long13 = islamicChronology0.getDateTimeMillis((long) (byte) 10, (int) (short) 10, (int) (byte) 10, (int) (byte) 1, (int) '4');
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology14.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology14.secondOfMinute();
        org.joda.time.DurationField durationField17 = islamicChronology14.days();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology14.centuryOfEra();
        org.joda.time.DurationField durationField19 = islamicChronology14.days();
        org.joda.time.DurationField durationField20 = islamicChronology14.millis();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType21 = islamicChronology14.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology14.era();
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology23.dayOfWeek();
        boolean boolean26 = islamicChronology23.equals((java.lang.Object) (-1L));
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology23.dayOfYear();
        org.joda.time.chrono.IslamicChronology islamicChronology28 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology28.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone30 = islamicChronology28.getZone();
        org.joda.time.Chronology chronology31 = islamicChronology23.withZone(dateTimeZone30);
        org.joda.time.Chronology chronology32 = islamicChronology14.withZone(dateTimeZone30);
        org.joda.time.chrono.IslamicChronology islamicChronology33 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology33.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField35 = islamicChronology33.clockhourOfHalfday();
        org.joda.time.DurationField durationField36 = islamicChronology33.minutes();
        org.joda.time.DateTimeField dateTimeField37 = islamicChronology33.clockhourOfHalfday();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType38 = islamicChronology33.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology39 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone30, leapYearPatternType38);
        org.joda.time.Chronology chronology40 = islamicChronology0.withZone(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField41 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField42 = islamicChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 36601052L + "'", long13 == 36601052L);
        org.junit.Assert.assertNotNull(islamicChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(leapYearPatternType21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(islamicChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(islamicChronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(islamicChronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(leapYearPatternType38);
        org.junit.Assert.assertNotNull(islamicChronology39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology0.days();
        org.joda.time.DurationField durationField6 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.era();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField5 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.era();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology19.clockhourOfHalfday();
        org.joda.time.DurationField durationField22 = islamicChronology19.minutes();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology19.clockhourOfHalfday();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType24 = islamicChronology19.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology25 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16, leapYearPatternType24);
        org.joda.time.chrono.IslamicChronology islamicChronology26 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16);
        org.joda.time.chrono.IslamicChronology islamicChronology27 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16);
        long long33 = islamicChronology27.getDateTimeMillis((long) (byte) 100, 0, (int) (short) 0, 1, (int) ' ');
        org.joda.time.DurationField durationField34 = islamicChronology27.days();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(leapYearPatternType7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(islamicChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(islamicChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(islamicChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(leapYearPatternType24);
        org.junit.Assert.assertNotNull(islamicChronology25);
        org.junit.Assert.assertNotNull(islamicChronology26);
        org.junit.Assert.assertNotNull(islamicChronology27);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1032L + "'", long33 == 1032L);
        org.junit.Assert.assertNotNull(durationField34);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
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
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology19.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology19.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology19.secondOfMinute();
        org.joda.time.DurationField durationField24 = islamicChronology19.seconds();
        org.joda.time.DateTimeZone dateTimeZone25 = islamicChronology19.getZone();
        org.joda.time.chrono.IslamicChronology islamicChronology26 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone25);
        org.joda.time.chrono.IslamicChronology islamicChronology27 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology27.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology27.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology27.secondOfMinute();
        boolean boolean32 = islamicChronology27.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology27.dayOfMonth();
        org.joda.time.chrono.IslamicChronology islamicChronology34 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField35 = islamicChronology34.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField36 = islamicChronology34.secondOfMinute();
        org.joda.time.DurationField durationField37 = islamicChronology34.days();
        org.joda.time.DateTimeField dateTimeField38 = islamicChronology34.minuteOfDay();
        int int39 = islamicChronology34.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology34.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone41 = islamicChronology34.getZone();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType42 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology43 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone41, leapYearPatternType42);
        org.joda.time.Chronology chronology44 = islamicChronology27.withZone(dateTimeZone41);
        org.joda.time.chrono.IslamicChronology islamicChronology45 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField46 = islamicChronology45.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField47 = islamicChronology45.secondOfMinute();
        org.joda.time.DurationField durationField48 = islamicChronology45.days();
        org.joda.time.DateTimeField dateTimeField49 = islamicChronology45.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField50 = islamicChronology45.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField51 = islamicChronology45.monthOfYear();
        org.joda.time.DateTimeField dateTimeField52 = islamicChronology45.weekyear();
        org.joda.time.DurationField durationField53 = islamicChronology45.hours();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType54 = islamicChronology45.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology55 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone41, leapYearPatternType54);
        org.joda.time.chrono.IslamicChronology islamicChronology56 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone25, leapYearPatternType54);
        org.joda.time.chrono.IslamicChronology islamicChronology57 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone25);
        org.joda.time.Chronology chronology58 = islamicChronology0.withZone(dateTimeZone25);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(leapYearPatternType7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(islamicChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(islamicChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(islamicChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(islamicChronology26);
        org.junit.Assert.assertNotNull(islamicChronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(islamicChronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(leapYearPatternType42);
        org.junit.Assert.assertNotNull(islamicChronology43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(islamicChronology45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertNotNull(leapYearPatternType54);
        org.junit.Assert.assertNotNull(islamicChronology55);
        org.junit.Assert.assertNotNull(islamicChronology56);
        org.junit.Assert.assertNotNull(islamicChronology57);
        org.junit.Assert.assertNotNull(chronology58);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.weekOfWeekyear();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType3 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = islamicChronology0.minutes();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(leapYearPatternType3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.Chronology chronology5 = islamicChronology0.withUTC();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = islamicChronology0.add(readablePeriod6, 0L, (int) (short) 100);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
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
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology7.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = islamicChronology7.add(readablePeriod11, (-4L), (int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = islamicChronology7.get(readablePeriod15, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(islamicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-4L) + "'", long14 == (-4L));
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology0.days();
        int int6 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfHalfday();
        long long11 = islamicChronology0.add(0L, (-3035086L), 1);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-3035086L) + "'", long11 == (-3035086L));
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType7 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6, leapYearPatternType7);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology8.millisOfSecond();
        boolean boolean10 = islamicChronology0.equals((java.lang.Object) islamicChronology8);
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology11.dayOfWeek();
        org.joda.time.DurationField durationField13 = islamicChronology11.centuries();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology11.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology11.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone16 = islamicChronology11.getZone();
        org.joda.time.Chronology chronology17 = islamicChronology8.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology8.monthOfYear();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(leapYearPatternType7);
        org.junit.Assert.assertNotNull(islamicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(islamicChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology11.dayOfYear();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology11.yearOfCentury();
        boolean boolean14 = islamicChronology0.equals((java.lang.Object) dateTimeField13);
        org.joda.time.Chronology chronology15 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology0.year();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(islamicChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(islamicChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology1.dayOfMonth();
        org.joda.time.DurationField durationField4 = islamicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology1.minuteOfDay();
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology0.days();
        int int6 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField8 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = islamicChronology0.get(readablePeriod10, 1454892426L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = islamicChronology1.minutes();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = islamicChronology1.get(readablePeriod8, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7);
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7);
        org.joda.time.DurationField durationField13 = islamicChronology12.months();
        org.joda.time.DurationField durationField14 = islamicChronology12.days();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology12.clockhourOfDay();
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
        org.junit.Assert.assertNotNull(islamicChronology11);
        org.junit.Assert.assertNotNull(islamicChronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType12 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7, leapYearPatternType12);
        org.joda.time.DurationField durationField14 = islamicChronology13.weekyears();
        org.joda.time.DurationField durationField15 = islamicChronology13.seconds();
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
        org.junit.Assert.assertNotNull(islamicChronology11);
        org.junit.Assert.assertNotNull(leapYearPatternType12);
        org.junit.Assert.assertNotNull(islamicChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.year();
        org.joda.time.DurationField durationField12 = islamicChronology0.hours();
        org.joda.time.DurationField durationField13 = islamicChronology0.years();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(islamicChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology0.centuries();
        org.joda.time.Chronology chronology6 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology0.days();
        org.joda.time.DurationField durationField10 = islamicChronology0.weeks();
        long long16 = islamicChronology0.getDateTimeMillis((long) '4', 0, (int) '#', (int) (byte) 10, 10);
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2110010L + "'", long16 == 2110010L);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.dayOfWeek();
        org.joda.time.DurationField durationField5 = islamicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology1.centuryOfEra();
        org.joda.time.Chronology chronology9 = islamicChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology1.minuteOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType12 = islamicChronology1.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0, leapYearPatternType12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = islamicChronology13.get(readablePeriod14, (-42238368000096L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(leapYearPatternType12);
        org.junit.Assert.assertNotNull(islamicChronology13);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
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
        org.joda.time.DurationField durationField10 = islamicChronology0.months();
        org.joda.time.DurationField durationField11 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(islamicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.centuryOfEra();
        int int8 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.hours();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType7 = islamicChronology0.getLeapYearPatternType();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(leapYearPatternType7);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        boolean boolean3 = islamicChronology0.equals((java.lang.Object) (-1L));
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.secondOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.joda.time.DurationField durationField8 = islamicChronology0.millis();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.Chronology chronology3 = islamicChronology1.withUTC();
        org.joda.time.DurationField durationField4 = islamicChronology1.halfdays();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology1.add(readablePeriod5, (long) 4, (int) (byte) -1);
        org.joda.time.DurationField durationField9 = islamicChronology1.months();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology1.minuteOfDay();
        org.joda.time.DurationField durationField12 = islamicChronology1.days();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology1.year();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology1.millisOfSecond();
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 4L + "'", long8 == 4L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.monthOfYear();
        org.joda.time.DurationField durationField6 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.weekyear();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField10 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        long long8 = islamicChronology0.add((long) (byte) 0, 0L, (int) (byte) -1);
        org.joda.time.DurationField durationField9 = islamicChronology0.months();
        org.joda.time.DurationField durationField10 = islamicChronology0.halfdays();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology0.days();
        org.joda.time.DurationField durationField6 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfWeek();
        org.joda.time.Chronology chronology10 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = islamicChronology0.get(readablePartial12, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        org.joda.time.DurationField durationField13 = islamicChronology0.years();
        org.joda.time.DurationField durationField14 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology0.clockhourOfDay();
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
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        boolean boolean3 = islamicChronology0.equals((java.lang.Object) (-1L));
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.year();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField8 = islamicChronology0.years();
        org.joda.time.DurationField durationField9 = islamicChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = islamicChronology0.withZone(dateTimeZone10);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = islamicChronology0.add(readablePeriod6, 36010000L, 0);
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.halfdayOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType11 = islamicChronology0.getLeapYearPatternType();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 36010000L + "'", long9 == 36010000L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(leapYearPatternType11);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = islamicChronology0.add(readablePeriod7, (long) (short) 10, 0);
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.weekyear();
        org.joda.time.DurationField durationField12 = islamicChronology0.centuries();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.weekyear();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField4 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfHour();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType6 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = islamicChronology0.add(readablePeriod7, (-50329999L), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.era();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(leapYearPatternType6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-50329999L) + "'", long10 == (-50329999L));
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyear();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = islamicChronology0.add(readablePeriod4, 3635100L, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField9 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3635100L + "'", long7 == 3635100L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.year();
        int int4 = islamicChronology0.getMinimumDaysInFirstWeek();
        java.lang.String str5 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.monthOfYear();
        org.joda.time.DurationField durationField7 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = islamicChronology0.hours();
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology10.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology10.clockhourOfHalfday();
        org.joda.time.DurationField durationField13 = islamicChronology10.minutes();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology10.year();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology10.era();
        org.joda.time.DurationField durationField16 = islamicChronology10.seconds();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology10.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology10.monthOfYear();
        org.joda.time.DurationField durationField19 = islamicChronology10.centuries();
        boolean boolean20 = islamicChronology0.equals((java.lang.Object) islamicChronology10);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IslamicChronology[Etc/UTC]" + "'", str5, "IslamicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(islamicChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField3 = islamicChronology0.months();
        org.joda.time.DurationField durationField4 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField6 = islamicChronology0.millis();
        org.joda.time.DurationField durationField7 = islamicChronology0.weekyears();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = islamicChronology0.set(readablePartial8, 970L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.Chronology chronology3 = islamicChronology1.withUTC();
        org.joda.time.DurationField durationField4 = islamicChronology1.years();
        long long8 = islamicChronology1.add((long) 100, (long) (byte) 0, (int) (short) -1);
        org.joda.time.DurationField durationField9 = islamicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology1.era();
        org.joda.time.DurationField durationField11 = islamicChronology1.millis();
        org.joda.time.DurationField durationField12 = islamicChronology1.years();
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType1 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0, leapYearPatternType1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.minuteOfDay();
        org.joda.time.chrono.IslamicChronology islamicChronology4 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology4.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology4.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = islamicChronology4.months();
        org.joda.time.DurationField durationField8 = islamicChronology4.weekyears();
        boolean boolean9 = islamicChronology2.equals((java.lang.Object) durationField8);
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.year();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology2.millisOfSecond();
        org.junit.Assert.assertNotNull(leapYearPatternType1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(islamicChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = islamicChronology0.eras();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = islamicChronology0.get(readablePeriod7, 21099255L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.year();
        org.joda.time.DurationField durationField4 = islamicChronology0.years();
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
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology0.era();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = islamicChronology0.add(readablePeriod17, (-50329999L), (int) (short) 10);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(islamicChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(islamicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(islamicChronology12);
        org.junit.Assert.assertNotNull(leapYearPatternType13);
        org.junit.Assert.assertNotNull(islamicChronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-50329999L) + "'", long20 == (-50329999L));
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField3 = islamicChronology0.weeks();
        int int4 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfHalfday();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType7 = islamicChronology0.getLeapYearPatternType();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(leapYearPatternType7);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.year();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology1.minutes();
        org.joda.time.DurationField durationField5 = islamicChronology1.years();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology1.era();
        long long10 = islamicChronology1.add((-42238368000096L), 2460277104L, (-1));
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-42240828277200L) + "'", long10 == (-42240828277200L));
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology12.millisOfDay();
        org.joda.time.Chronology chronology14 = islamicChronology12.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology12.weekyearOfCentury();
        boolean boolean17 = islamicChronology0.equals((java.lang.Object) islamicChronology12);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(islamicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(islamicChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = islamicChronology2.getZone();
        org.joda.time.Chronology chronology5 = islamicChronology0.withZone(dateTimeZone4);
        org.joda.time.DurationField durationField6 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekOfWeekyear();
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology5.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology5.getZone();
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone7);
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology9.dayOfWeek();
        boolean boolean12 = islamicChronology9.equals((java.lang.Object) (-1L));
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology9.dayOfYear();
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology14.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = islamicChronology14.getZone();
        org.joda.time.Chronology chronology17 = islamicChronology9.withZone(dateTimeZone16);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType18 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16, leapYearPatternType18);
        org.joda.time.chrono.IslamicChronology islamicChronology20 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7, leapYearPatternType18);
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology20.minuteOfHour();
        org.joda.time.chrono.IslamicChronology islamicChronology22 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology22.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology22.secondOfMinute();
        org.joda.time.DurationField durationField25 = islamicChronology22.days();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology22.minuteOfDay();
        org.joda.time.DurationField durationField27 = islamicChronology22.millis();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType28 = islamicChronology22.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology29 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology29.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology29.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology29.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology29.weekOfWeekyear();
        org.joda.time.chrono.IslamicChronology islamicChronology34 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField35 = islamicChronology34.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone36 = islamicChronology34.getZone();
        org.joda.time.Chronology chronology37 = islamicChronology29.withZone(dateTimeZone36);
        org.joda.time.Chronology chronology38 = islamicChronology22.withZone(dateTimeZone36);
        org.joda.time.chrono.IslamicChronology islamicChronology39 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone36);
        org.joda.time.chrono.IslamicChronology islamicChronology40 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone36);
        org.joda.time.Chronology chronology41 = islamicChronology20.withZone(dateTimeZone36);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(islamicChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(islamicChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(islamicChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(leapYearPatternType18);
        org.junit.Assert.assertNotNull(islamicChronology19);
        org.junit.Assert.assertNotNull(islamicChronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(islamicChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(leapYearPatternType28);
        org.junit.Assert.assertNotNull(islamicChronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(islamicChronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(islamicChronology39);
        org.junit.Assert.assertNotNull(islamicChronology40);
        org.junit.Assert.assertNotNull(chronology41);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField4 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.weekyearOfCentury();
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
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.chrono.IslamicChronology islamicChronology4 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology4.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology4.secondOfMinute();
        org.joda.time.DurationField durationField7 = islamicChronology4.days();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology4.minuteOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology4.millis();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType10 = islamicChronology4.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology11.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology11.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology11.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology11.weekOfWeekyear();
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology16.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = islamicChronology16.getZone();
        org.joda.time.Chronology chronology19 = islamicChronology11.withZone(dateTimeZone18);
        org.joda.time.Chronology chronology20 = islamicChronology4.withZone(dateTimeZone18);
        org.joda.time.Chronology chronology21 = islamicChronology0.withZone(dateTimeZone18);
        org.joda.time.Chronology chronology22 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology0.dayOfYear();
        org.joda.time.chrono.IslamicChronology islamicChronology24 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology24.minuteOfHour();
        org.joda.time.DurationField durationField26 = islamicChronology24.hours();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology24.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology24.secondOfDay();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology24.clockhourOfDay();
        boolean boolean30 = islamicChronology0.equals((java.lang.Object) islamicChronology24);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(islamicChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(leapYearPatternType10);
        org.junit.Assert.assertNotNull(islamicChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(islamicChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(islamicChronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
        org.joda.time.DurationField durationField10 = islamicChronology0.years();
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
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology1.dayOfMonth();
        org.joda.time.DurationField durationField4 = islamicChronology1.hours();
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
        long long22 = islamicChronology0.add((long) (short) 0, (long) (byte) 10, (int) 'a');
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(leapYearPatternType7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(islamicChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(islamicChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 970L + "'", long22 == 970L);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology13.era();
        org.joda.time.DateTimeZone dateTimeZone15 = islamicChronology13.getZone();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(islamicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(islamicChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology0.getZone();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = islamicChronology0.get(readablePeriod9, 60952L, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology1.monthOfYear();
        org.joda.time.DurationField durationField4 = islamicChronology1.centuries();
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType1 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0, leapYearPatternType1);
        java.lang.String str3 = islamicChronology2.toString();
        org.joda.time.Chronology chronology4 = islamicChronology2.withUTC();
        org.junit.Assert.assertNotNull(leapYearPatternType1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IslamicChronology[Etc/UTC]" + "'", str3, "IslamicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology4);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.Chronology chronology3 = islamicChronology1.withUTC();
        org.joda.time.DurationField durationField4 = islamicChronology1.years();
        org.joda.time.DurationField durationField5 = islamicChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology1.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField7 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField8 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.year();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField4 = islamicChronology0.centuries();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField6 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.weekOfWeekyear();
        int int10 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DurationField durationField5 = islamicChronology0.millis();
        org.joda.time.DurationField durationField6 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        java.lang.String str1 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.secondOfDay();
        java.lang.String str5 = islamicChronology0.toString();
        org.joda.time.DurationField durationField6 = islamicChronology0.eras();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IslamicChronology[UTC]" + "'", str1, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IslamicChronology[UTC]" + "'", str5, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.months();
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology7.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology7.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology7.millisOfSecond();
        org.joda.time.DurationField durationField11 = islamicChronology7.weeks();
        boolean boolean12 = islamicChronology0.equals((java.lang.Object) islamicChronology7);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = islamicChronology7.add(readablePeriod13, (long) (byte) 100, 0);
        int int17 = islamicChronology7.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology7.weekOfWeekyear();
        java.lang.Class<?> wildcardClass19 = dateTimeField18.getClass();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(islamicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.months();
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology7.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology7.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology7.millisOfSecond();
        org.joda.time.DurationField durationField11 = islamicChronology7.weeks();
        boolean boolean12 = islamicChronology0.equals((java.lang.Object) islamicChronology7);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = islamicChronology7.add(readablePeriod13, (long) (byte) 100, 0);
        org.joda.time.DurationField durationField17 = islamicChronology7.weeks();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology7.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone19 = islamicChronology7.getZone();
        org.joda.time.chrono.IslamicChronology islamicChronology20 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone19);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(islamicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(islamicChronology20);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology0.halfdays();
        java.lang.String str4 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField7 = islamicChronology0.centuries();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IslamicChronology[UTC]" + "'", str4, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType1 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0, leapYearPatternType1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.minuteOfDay();
        int int4 = islamicChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.centuryOfEra();
        org.joda.time.ReadablePartial readablePartial6 = null;
        int[] intArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology2.validate(readablePartial6, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(leapYearPatternType1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.secondOfMinute();
        int int4 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField3 = islamicChronology0.months();
        org.joda.time.DurationField durationField4 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.era();
        org.joda.time.DurationField durationField6 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField6 = islamicChronology0.halfdays();
        org.joda.time.DurationField durationField7 = islamicChronology0.months();
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
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField7 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology0.days();
        org.joda.time.DurationField durationField6 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField9 = islamicChronology0.days();
        org.joda.time.DurationField durationField10 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = islamicChronology0.centuries();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology1.dayOfYear();
        org.joda.time.DurationField durationField6 = islamicChronology1.days();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology1.era();
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField4 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.monthOfYear();
        org.joda.time.DurationField durationField8 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField10 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        boolean boolean3 = islamicChronology0.equals((java.lang.Object) (-1L));
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfYear();
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology5.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology5.getZone();
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField9 = islamicChronology0.weekyears();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(islamicChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField4 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField8 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.weekyear();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology1.years();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology1.year();
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology1.dayOfMonth();
        org.joda.time.DurationField durationField4 = islamicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology1.months();
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField3 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology0.years();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfEra();
        org.joda.time.Chronology chronology6 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField3 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology5.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology5.secondOfMinute();
        org.joda.time.DurationField durationField8 = islamicChronology5.days();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology5.centuryOfEra();
        org.joda.time.DurationField durationField10 = islamicChronology5.days();
        org.joda.time.DurationField durationField11 = islamicChronology5.millis();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType12 = islamicChronology5.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology5.era();
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology14.dayOfWeek();
        boolean boolean17 = islamicChronology14.equals((java.lang.Object) (-1L));
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology14.dayOfYear();
        org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology19.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = islamicChronology19.getZone();
        org.joda.time.Chronology chronology22 = islamicChronology14.withZone(dateTimeZone21);
        org.joda.time.Chronology chronology23 = islamicChronology5.withZone(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology25 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology25.millisOfDay();
        org.joda.time.DurationField durationField27 = islamicChronology25.years();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology25.era();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType29 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        boolean boolean30 = islamicChronology25.equals((java.lang.Object) leapYearPatternType29);
        org.joda.time.chrono.IslamicChronology islamicChronology31 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone21, leapYearPatternType29);
        org.joda.time.Chronology chronology32 = islamicChronology0.withZone(dateTimeZone21);
        java.lang.String str33 = islamicChronology0.toString();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(islamicChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(leapYearPatternType12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(islamicChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(islamicChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(islamicChronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(leapYearPatternType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(islamicChronology31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "IslamicChronology[UTC]" + "'", str33, "IslamicChronology[UTC]");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        int int5 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology0.getZone();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType8 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7, leapYearPatternType8);
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology9.secondOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType11 = islamicChronology9.getLeapYearPatternType();
        org.joda.time.DurationField durationField12 = islamicChronology9.weeks();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology9.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = islamicChronology9.getDateTimeMillis(6100500L, (int) (byte) 100, (int) (byte) 10, (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(leapYearPatternType8);
        org.junit.Assert.assertNotNull(islamicChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(leapYearPatternType11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.dayOfMonth();
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology7.dayOfWeek();
        boolean boolean10 = islamicChronology7.equals((java.lang.Object) (-1L));
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology7.dayOfYear();
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology12.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = islamicChronology12.getZone();
        org.joda.time.Chronology chronology15 = islamicChronology7.withZone(dateTimeZone14);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType16 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14, leapYearPatternType16);
        org.joda.time.chrono.IslamicChronology islamicChronology18 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14);
        org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14);
        org.joda.time.Chronology chronology20 = islamicChronology0.withZone(dateTimeZone14);
        org.joda.time.chrono.IslamicChronology islamicChronology21 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14);
        org.joda.time.chrono.IslamicChronology islamicChronology22 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology22.dayOfYear();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology22.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology22.yearOfEra();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology22.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology28 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology28.millisOfDay();
        org.joda.time.chrono.IslamicChronology islamicChronology30 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology30.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology30.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology30.millisOfSecond();
        org.joda.time.DurationField durationField34 = islamicChronology30.weeks();
        org.joda.time.DateTimeField dateTimeField35 = islamicChronology30.secondOfMinute();
        org.joda.time.chrono.IslamicChronology islamicChronology36 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = islamicChronology36.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone38 = islamicChronology36.getZone();
        boolean boolean39 = islamicChronology30.equals((java.lang.Object) dateTimeZone38);
        org.joda.time.Chronology chronology40 = islamicChronology28.withZone(dateTimeZone38);
        org.joda.time.Chronology chronology41 = islamicChronology22.withZone(dateTimeZone38);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType42 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_16_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology43 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone38, leapYearPatternType42);
        org.joda.time.chrono.IslamicChronology islamicChronology44 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14, leapYearPatternType42);
        org.joda.time.chrono.IslamicChronology islamicChronology45 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField46 = islamicChronology45.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField47 = islamicChronology45.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField48 = islamicChronology45.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField49 = islamicChronology45.monthOfYear();
        org.joda.time.DateTimeField dateTimeField50 = islamicChronology45.monthOfYear();
        long long54 = islamicChronology45.add(1L, (-1L), (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone55 = islamicChronology45.getZone();
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType57 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology58 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone56, leapYearPatternType57);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType59 = islamicChronology58.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology60 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone55, leapYearPatternType59);
        org.joda.time.chrono.IslamicChronology islamicChronology61 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14, leapYearPatternType59);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(islamicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(islamicChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(leapYearPatternType16);
        org.junit.Assert.assertNotNull(islamicChronology17);
        org.junit.Assert.assertNotNull(islamicChronology18);
        org.junit.Assert.assertNotNull(islamicChronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(islamicChronology21);
        org.junit.Assert.assertNotNull(islamicChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(islamicChronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(islamicChronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(islamicChronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(leapYearPatternType42);
        org.junit.Assert.assertNotNull(islamicChronology43);
        org.junit.Assert.assertNotNull(islamicChronology44);
        org.junit.Assert.assertNotNull(islamicChronology45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(leapYearPatternType57);
        org.junit.Assert.assertNotNull(islamicChronology58);
        org.junit.Assert.assertNotNull(leapYearPatternType59);
        org.junit.Assert.assertNotNull(islamicChronology60);
        org.junit.Assert.assertNotNull(islamicChronology61);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekOfWeekyear();
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology5.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology5.getZone();
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone7);
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology9.dayOfWeek();
        boolean boolean12 = islamicChronology9.equals((java.lang.Object) (-1L));
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology9.dayOfYear();
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology14.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = islamicChronology14.getZone();
        org.joda.time.Chronology chronology17 = islamicChronology9.withZone(dateTimeZone16);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType18 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16, leapYearPatternType18);
        org.joda.time.chrono.IslamicChronology islamicChronology20 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7, leapYearPatternType18);
        org.joda.time.chrono.IslamicChronology islamicChronology21 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(islamicChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(islamicChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(islamicChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(leapYearPatternType18);
        org.junit.Assert.assertNotNull(islamicChronology19);
        org.junit.Assert.assertNotNull(islamicChronology20);
        org.junit.Assert.assertNotNull(islamicChronology21);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType1 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0, leapYearPatternType1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.minuteOfDay();
        org.joda.time.chrono.IslamicChronology islamicChronology4 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology4.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology4.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = islamicChronology4.months();
        org.joda.time.DurationField durationField8 = islamicChronology4.weekyears();
        boolean boolean9 = islamicChronology2.equals((java.lang.Object) durationField8);
        org.joda.time.DurationField durationField10 = islamicChronology2.millis();
        org.joda.time.DurationField durationField11 = islamicChronology2.minutes();
        org.junit.Assert.assertNotNull(leapYearPatternType1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(islamicChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.year();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.clockhourOfDay();
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField4 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField8 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField11 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField12 = islamicChronology0.millis();
        org.joda.time.DurationField durationField13 = islamicChronology0.hours();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.secondOfMinute();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.weekyear();
        org.joda.time.DurationField durationField9 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField11 = islamicChronology0.days();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekOfWeekyear();
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology5.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology5.getZone();
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone7);
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology9.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology9.secondOfMinute();
        org.joda.time.DurationField durationField12 = islamicChronology9.days();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology9.monthOfYear();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology9.weekyear();
        org.joda.time.DurationField durationField17 = islamicChronology9.hours();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType18 = islamicChronology9.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7, leapYearPatternType18);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType20 = islamicChronology19.getLeapYearPatternType();
        org.joda.time.DurationField durationField21 = islamicChronology19.hours();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(islamicChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(islamicChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(leapYearPatternType18);
        org.junit.Assert.assertNotNull(islamicChronology19);
        org.junit.Assert.assertNotNull(leapYearPatternType20);
        org.junit.Assert.assertNotNull(durationField21);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType1 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0, leapYearPatternType1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.year();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType6 = islamicChronology2.getLeapYearPatternType();
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
        org.joda.time.chrono.IslamicChronology islamicChronology26 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology26.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology26.clockhourOfHalfday();
        org.joda.time.DurationField durationField29 = islamicChronology26.minutes();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology26.clockhourOfHalfday();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType31 = islamicChronology26.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology32 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone23, leapYearPatternType31);
        org.joda.time.chrono.IslamicChronology islamicChronology33 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone23);
        org.joda.time.Chronology chronology34 = islamicChronology2.withZone(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField35 = islamicChronology2.era();
        org.junit.Assert.assertNotNull(leapYearPatternType1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(leapYearPatternType6);
        org.junit.Assert.assertNotNull(islamicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(leapYearPatternType14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(islamicChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(islamicChronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(islamicChronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(leapYearPatternType31);
        org.junit.Assert.assertNotNull(islamicChronology32);
        org.junit.Assert.assertNotNull(islamicChronology33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.secondOfMinute();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField7 = islamicChronology0.years();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.months();
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology7.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology7.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology7.millisOfSecond();
        org.joda.time.DurationField durationField11 = islamicChronology7.weeks();
        boolean boolean12 = islamicChronology0.equals((java.lang.Object) islamicChronology7);
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(islamicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
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
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType12 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7, leapYearPatternType12);
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology13.era();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology13.millisOfSecond();
        org.joda.time.DurationField durationField16 = islamicChronology13.days();
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
        org.junit.Assert.assertNotNull(islamicChronology11);
        org.junit.Assert.assertNotNull(leapYearPatternType12);
        org.junit.Assert.assertNotNull(islamicChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = islamicChronology0.months();
        org.joda.time.DurationField durationField4 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology1.dayOfMonth();
        org.joda.time.DurationField durationField4 = islamicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology1.yearOfCentury();
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.year();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology1.monthOfYear();
        org.joda.time.DurationField durationField6 = islamicChronology1.millis();
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology1.minuteOfHour();
        org.joda.time.DurationField durationField4 = islamicChronology1.weekyears();
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology5.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology5.secondOfMinute();
        org.joda.time.DurationField durationField8 = islamicChronology5.days();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology5.minuteOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology5.centuries();
        org.joda.time.Chronology chronology11 = islamicChronology5.withUTC();
        org.joda.time.DurationField durationField12 = islamicChronology5.weeks();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology5.secondOfDay();
        boolean boolean14 = islamicChronology1.equals((java.lang.Object) islamicChronology5);
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology5.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = islamicChronology5.add(readablePeriod16, 60952L, (-1));
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(islamicChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 60952L + "'", long19 == 60952L);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField2 = islamicChronology0.hours();
        org.joda.time.DurationField durationField3 = islamicChronology0.months();
        org.joda.time.chrono.IslamicChronology islamicChronology4 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology4.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology4.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology4.millisOfSecond();
        org.joda.time.DurationField durationField8 = islamicChronology4.weeks();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology4.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology4.secondOfMinute();
        org.joda.time.DurationField durationField11 = islamicChronology4.weekyears();
        boolean boolean12 = islamicChronology0.equals((java.lang.Object) durationField11);
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.weekOfWeekyear();
        java.lang.String str14 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology0.weekyear();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = islamicChronology0.add(readablePeriod17, 99L, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology0.year();
        int int22 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(islamicChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IslamicChronology[UTC]" + "'", str14, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 99L + "'", long20 == 99L);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.yearOfEra();
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology7.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology7.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology7.secondOfMinute();
        org.joda.time.DurationField durationField12 = islamicChronology7.hours();
        boolean boolean13 = islamicChronology0.equals((java.lang.Object) islamicChronology7);
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology7.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology7.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology7.centuryOfEra();
        org.joda.time.ReadablePartial readablePartial17 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = islamicChronology7.set(readablePartial17, 610004L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(islamicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfHalfday();
        int int7 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.year();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology1.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = islamicChronology1.add(readablePeriod6, (-86364900L), (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = islamicChronology1.getDateTimeMillis(360100004L, (-1), (int) '4', (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-86364900L) + "'", long9 == (-86364900L));
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology0.days();
        org.joda.time.DurationField durationField6 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfWeek();
        long long13 = islamicChronology0.add((long) (byte) -1, (-42238368000096L), (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField15 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology0.secondOfDay();
        org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology17.dayOfWeek();
        boolean boolean20 = islamicChronology17.equals((java.lang.Object) (-1L));
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology17.year();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology17.clockhourOfDay();
        org.joda.time.Chronology chronology23 = islamicChronology17.withUTC();
        org.joda.time.DateTimeZone dateTimeZone24 = islamicChronology17.getZone();
        org.joda.time.chrono.IslamicChronology islamicChronology25 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology25.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology25.secondOfMinute();
        org.joda.time.DurationField durationField28 = islamicChronology25.days();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology25.centuryOfEra();
        org.joda.time.DurationField durationField30 = islamicChronology25.days();
        org.joda.time.DurationField durationField31 = islamicChronology25.millis();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType32 = islamicChronology25.getLeapYearPatternType();
        org.joda.time.DurationField durationField33 = islamicChronology25.halfdays();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType34 = islamicChronology25.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology35 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone24, leapYearPatternType34);
        org.joda.time.Chronology chronology36 = islamicChronology0.withZone(dateTimeZone24);
        org.joda.time.ReadablePartial readablePartial37 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray39 = islamicChronology0.get(readablePartial37, 52L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-422383680000961L) + "'", long13 == (-422383680000961L));
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(islamicChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(islamicChronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(leapYearPatternType32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(leapYearPatternType34);
        org.junit.Assert.assertNotNull(islamicChronology35);
        org.junit.Assert.assertNotNull(chronology36);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfEra();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = islamicChronology0.get(readablePartial8, 970L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField7 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.dayOfMonth();
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology9.dayOfWeek();
        org.joda.time.DurationField durationField11 = islamicChronology9.halfdays();
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology12.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = islamicChronology12.getZone();
        org.joda.time.Chronology chronology15 = islamicChronology9.withZone(dateTimeZone14);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType17 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology18 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14, leapYearPatternType17);
        org.joda.time.Chronology chronology19 = islamicChronology0.withZone(dateTimeZone14);
        org.joda.time.DurationField durationField20 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField21 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField22 = islamicChronology0.centuries();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(islamicChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(islamicChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(islamicChronology16);
        org.junit.Assert.assertNotNull(leapYearPatternType17);
        org.junit.Assert.assertNotNull(islamicChronology18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.Chronology chronology3 = islamicChronology1.withUTC();
        org.joda.time.DurationField durationField4 = islamicChronology1.years();
        long long8 = islamicChronology1.add((long) 100, (long) (byte) 0, (int) (short) -1);
        org.joda.time.DurationField durationField9 = islamicChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology1.era();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology1.dayOfYear();
        int int12 = islamicChronology1.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.millisOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology1.minuteOfHour();
        org.joda.time.DurationField durationField6 = islamicChronology1.years();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology1.dayOfYear();
        org.joda.time.DurationField durationField8 = islamicChronology1.weeks();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = islamicChronology1.get(readablePeriod9, 3635100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.hourOfDay();
        org.joda.time.Chronology chronology5 = islamicChronology0.withUTC();
        long long9 = islamicChronology0.add(1070L, 970L, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10770L + "'", long9 == 10770L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }
}

