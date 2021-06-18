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
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.yearOfEra();
        org.joda.time.DurationField durationField6 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.minuteOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.dayOfMonth();
        long long11 = julianChronology0.add((long) 1, (long) (short) 1, (int) (short) -1);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField11 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.era();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = julianChronology0.get(readablePeriod14, 7200L, (-47280066589999L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.secondOfMinute();
        java.lang.String str4 = julianChronology0.toString();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = julianChronology0.add(readablePeriod5, (-83278990L), (int) ' ');
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str4, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-83278990L) + "'", long8 == (-83278990L));
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        java.lang.String str5 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.secondOfDay();
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology7.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology7.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = julianChronology7.getZone();
        org.joda.time.Chronology chronology11 = julianChronology0.withZone(dateTimeZone10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.JulianChronology julianChronology13 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str5, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = julianChronology0.years();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = julianChronology0.getDateTimeMillis((int) (byte) 1, (-1), (int) ' ', (int) (short) 100, (int) (short) 10, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = julianChronology6.getZone();
        org.joda.time.Chronology chronology8 = julianChronology0.withZone(dateTimeZone7);
        org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField10 = julianChronology9.halfdayOfDay();
        org.joda.time.DurationField durationField11 = julianChronology9.millis();
        org.joda.time.DurationField durationField12 = julianChronology9.weekyears();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(julianChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField8 = julianChronology0.minutes();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        long long9 = julianChronology0.add((long) (byte) 1, 899L, (int) '#');
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.era();
        org.joda.time.DurationField durationField11 = julianChronology0.halfdays();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 31466L + "'", long9 == 31466L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        java.lang.String str1 = julianChronology0.toString();
        int int2 = julianChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JulianChronology[UTC]" + "'", str1, "JulianChronology[UTC]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology6.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = julianChronology6.getZone();
        org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone8, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(julianChronology9);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = julianChronology7.minuteOfDay();
        org.joda.time.DurationField durationField9 = julianChronology7.millis();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        java.lang.String str4 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField6 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.minuteOfDay();
        org.joda.time.chrono.JulianChronology julianChronology8 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology8.dayOfYear();
        org.joda.time.DurationField durationField10 = julianChronology8.millis();
        org.joda.time.DateTimeZone dateTimeZone11 = julianChronology8.getZone();
        org.joda.time.chrono.JulianChronology julianChronology12 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone11);
        org.joda.time.Chronology chronology13 = julianChronology0.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField14 = julianChronology0.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = julianChronology0.getDateTimeMillis(0, (int) (short) 10, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str4, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(julianChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(julianChronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = julianChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField7 = julianChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3501L + "'", long4 == 3501L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = julianChronology0.days();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = julianChronology0.get(readablePeriod10, (-59081875195999L), (-2501033L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str8, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = julianChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance();
        long long7 = julianChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = julianChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = julianChronology3.days();
        boolean boolean11 = julianChronology0.equals((java.lang.Object) julianChronology3);
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.weekyear();
        java.lang.String str13 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology0.weekyear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str13, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = julianChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.dayOfMonth();
        org.joda.time.DurationField durationField11 = julianChronology0.minutes();
        org.joda.time.DurationField durationField12 = julianChronology0.hours();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = julianChronology0.getDateTimeMillis((int) (short) -1, (int) (byte) 10, 0, (int) '#', (int) (byte) -1, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.yearOfCentury();
        org.joda.time.Chronology chronology16 = julianChronology0.withUTC();
        org.joda.time.chrono.JulianChronology julianChronology17 = org.joda.time.chrono.JulianChronology.getInstance();
        long long21 = julianChronology17.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str22 = julianChronology17.toString();
        org.joda.time.chrono.JulianChronology julianChronology23 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField24 = julianChronology23.millisOfDay();
        org.joda.time.DateTimeField dateTimeField25 = julianChronology23.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = julianChronology23.getZone();
        org.joda.time.Chronology chronology27 = julianChronology17.withZone(dateTimeZone26);
        org.joda.time.chrono.JulianChronology julianChronology28 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone26);
        org.joda.time.Chronology chronology29 = julianChronology0.withZone(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone30 = julianChronology0.getZone();
        org.joda.time.DurationField durationField31 = julianChronology0.weekyears();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(julianChronology17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 98L + "'", long21 == 98L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str22, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(julianChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(julianChronology28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(durationField31);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.minuteOfHour();
        org.joda.time.DurationField durationField3 = julianChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfMinute();
        org.joda.time.DurationField durationField5 = julianChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        org.joda.time.DateTimeField dateTimeField14 = julianChronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology7.dayOfMonth();
        org.joda.time.DurationField durationField16 = julianChronology7.days();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.minuteOfDay();
        org.joda.time.chrono.JulianChronology julianChronology4 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean6 = julianChronology4.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology4.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology4.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology4.era();
        boolean boolean11 = julianChronology0.equals((java.lang.Object) julianChronology4);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = julianChronology4.get(readablePeriod12, 14723467L, (-45861568940306L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(julianChronology4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.Chronology chronology3 = julianChronology0.withUTC();
        int int4 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = julianChronology0.millis();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = julianChronology0.getDateTimeMillis(1, (int) (byte) 10, (int) (byte) -1, (int) (short) 0, 0, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = julianChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField11 = julianChronology0.years();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.year();
        org.joda.time.chrono.JulianChronology julianChronology8 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology8.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = julianChronology8.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = julianChronology8.yearOfCentury();
        org.joda.time.DurationField durationField13 = julianChronology8.seconds();
        boolean boolean14 = julianChronology0.equals((java.lang.Object) durationField13);
        org.joda.time.Chronology chronology15 = julianChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(julianChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = julianChronology0.weeks();
        java.lang.String str4 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str4, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = julianChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.millisOfDay();
        java.lang.String str5 = julianChronology0.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = julianChronology0.getZone();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str5, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = julianChronology0.hours();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = julianChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.era();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.weekyear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        org.joda.time.chrono.JulianChronology julianChronology12 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone10, 1);
        org.joda.time.chrono.JulianChronology julianChronology13 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone10);
        org.joda.time.chrono.JulianChronology julianChronology14 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone10);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = julianChronology14.getDateTimeMillis(36001035L, (int) '4', 0, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(julianChronology12);
        org.junit.Assert.assertNotNull(julianChronology13);
        org.junit.Assert.assertNotNull(julianChronology14);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = julianChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField6 = julianChronology0.eras();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.minuteOfDay();
        org.joda.time.DurationField durationField9 = julianChronology0.weekyears();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.millisOfDay();
        long long9 = julianChronology0.add((long) 1, (-47279968L), 100);
        org.joda.time.DurationField durationField10 = julianChronology0.eras();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-4727996799L) + "'", long9 == (-4727996799L));
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = julianChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5, (int) (short) 1);
        org.joda.time.DurationField durationField8 = julianChronology7.days();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = julianChronology0.add(readablePeriod2, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.millisOfSecond();
        org.joda.time.DurationField durationField9 = julianChronology0.millis();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        java.lang.String str5 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.dayOfMonth();
        org.joda.time.Chronology chronology8 = julianChronology0.withUTC();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str5, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        org.joda.time.chrono.JulianChronology julianChronology15 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField16 = julianChronology15.dayOfWeek();
        org.joda.time.DurationField durationField17 = julianChronology15.weeks();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3501L + "'", long4 == 3501L);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(julianChronology14);
        org.junit.Assert.assertNotNull(julianChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = julianChronology0.get(readablePeriod8, 500L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        java.lang.String str4 = julianChronology0.toString();
        org.joda.time.DurationField durationField5 = julianChronology0.seconds();
        org.joda.time.DurationField durationField6 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str4, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField8 = julianChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.weekyearOfCentury();
        java.lang.String str10 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str10, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        long long12 = julianChronology0.add((-1L), 62L, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.era();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str8, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 619L + "'", long12 == 619L);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.JulianChronology julianChronology1 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = julianChronology1.year();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology1.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone4 = julianChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology1.yearOfCentury();
        org.junit.Assert.assertNotNull(julianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = julianChronology0.seconds();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology4 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone3);
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone3);
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology6.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.Chronology chronology9 = julianChronology6.withZone(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = julianChronology6.year();
        boolean boolean11 = julianChronology5.equals((java.lang.Object) dateTimeField10);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(julianChronology4);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.monthOfYear();
        org.joda.time.DurationField durationField8 = julianChronology0.months();
        org.joda.time.DurationField durationField9 = julianChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DurationField durationField3 = julianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.halfdayOfDay();
        org.joda.time.Chronology chronology5 = julianChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = julianChronology6.halfdays();
        org.joda.time.DurationField durationField8 = julianChronology6.months();
        org.joda.time.DurationField durationField9 = julianChronology6.years();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology6.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology6.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology6.year();
        java.lang.Class<?> wildcardClass13 = julianChronology6.getClass();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.DurationField durationField9 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str8, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = julianChronology0.add(readablePeriod10, 3274L, (int) ' ');
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3274L + "'", long13 == 3274L);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        org.joda.time.DurationField durationField11 = julianChronology0.minutes();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.monthOfYear();
        org.joda.time.DurationField durationField7 = julianChronology0.weeks();
        org.joda.time.DurationField durationField8 = julianChronology0.weekyears();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = julianChronology0.halfdays();
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean9 = julianChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = julianChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology7.monthOfYear();
        boolean boolean12 = julianChronology0.equals((java.lang.Object) julianChronology7);
        org.joda.time.DateTimeField dateTimeField13 = julianChronology7.monthOfYear();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology7.era();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        java.lang.String str5 = julianChronology0.toString();
        org.joda.time.Chronology chronology6 = julianChronology0.withUTC();
        org.joda.time.DurationField durationField7 = julianChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.clockhourOfHalfday();
        long long14 = julianChronology0.getDateTimeMillis((long) (byte) -1, (int) (short) 10, (int) '4', 0, (int) ' ');
        org.joda.time.DurationField durationField15 = julianChronology0.halfdays();
        long long19 = julianChronology0.add(35L, 13005232L, 10);
        org.joda.time.DurationField durationField20 = julianChronology0.halfdays();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str5, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-47279968L) + "'", long14 == (-47279968L));
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 130052355L + "'", long19 == 130052355L);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField11 = julianChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str8, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DurationField durationField1 = julianChronology0.halfdays();
        org.joda.time.DurationField durationField2 = julianChronology0.months();
        java.lang.Class<?> wildcardClass3 = julianChronology0.getClass();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        long long9 = julianChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DateTimeZone dateTimeZone10 = julianChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.year();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = julianChronology0.weekyears();
        long long10 = julianChronology0.add((-47280066589999L), 98L, (int) (byte) 10);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-47280066589019L) + "'", long10 == (-47280066589019L));
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        org.joda.time.DurationField durationField5 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.millisOfDay();
        org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology9.hourOfDay();
        org.joda.time.chrono.JulianChronology julianChronology12 = org.joda.time.chrono.JulianChronology.getInstance();
        long long16 = julianChronology12.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField17 = julianChronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField18 = julianChronology12.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = julianChronology12.days();
        boolean boolean20 = julianChronology9.equals((java.lang.Object) julianChronology12);
        org.joda.time.DateTimeField dateTimeField21 = julianChronology9.centuryOfEra();
        org.joda.time.DurationField durationField22 = julianChronology9.months();
        org.joda.time.DateTimeField dateTimeField23 = julianChronology9.secondOfDay();
        boolean boolean24 = julianChronology0.equals((java.lang.Object) julianChronology9);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(julianChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(julianChronology12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 98L + "'", long16 == 98L);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance();
        long long7 = julianChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = julianChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = julianChronology3.days();
        boolean boolean11 = julianChronology0.equals((java.lang.Object) julianChronology3);
        org.joda.time.DateTimeZone dateTimeZone12 = julianChronology3.getZone();
        org.joda.time.chrono.JulianChronology julianChronology14 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone12, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField15 = julianChronology14.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology14.monthOfYear();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology14.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = julianChronology14.minuteOfHour();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(julianChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = julianChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = julianChronology0.getDateTimeMillis((int) (byte) 1, (int) (byte) 0, (int) (byte) 1, 10, (int) (byte) -1, (int) (byte) 1, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField11 = julianChronology0.months();
        org.joda.time.DurationField durationField12 = julianChronology0.months();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = julianChronology0.seconds();
        int int4 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.dayOfMonth();
        org.joda.time.DurationField durationField6 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = julianChronology0.getZone();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology5.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = julianChronology5.add(readablePeriod7, (long) (byte) -1, (int) '4');
        org.joda.time.DurationField durationField11 = julianChronology5.centuries();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.year();
        org.joda.time.chrono.JulianChronology julianChronology8 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology8.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = julianChronology8.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = julianChronology8.yearOfCentury();
        org.joda.time.DurationField durationField13 = julianChronology8.seconds();
        boolean boolean14 = julianChronology0.equals((java.lang.Object) durationField13);
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = julianChronology0.getZone();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(julianChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        long long10 = julianChronology0.getDateTimeMillis((int) (byte) 100, 1, (int) (short) 1, 0);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = julianChronology0.get(readablePeriod12, (long) (short) 1, (-59011632000100L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-59011632000000L) + "'", long10 == (-59011632000000L));
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = julianChronology0.getZone();
        org.joda.time.DurationField durationField6 = julianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.centuryOfEra();
        org.joda.time.ReadablePartial readablePartial8 = null;
        int[] intArray11 = new int[] { (short) 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            julianChronology0.validate(readablePartial8, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10]");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.monthOfYear();
        org.joda.time.DurationField durationField10 = julianChronology0.seconds();
        org.joda.time.ReadablePartial readablePartial11 = null;
        int[] intArray18 = new int[] { (-1), (short) 100, 4, 1, (byte) 0, 10 };
        // The following exception was thrown during execution in test generation
        try {
            julianChronology0.validate(readablePartial11, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 100, 4, 1, 0, 10]");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.dayOfMonth();
        long long10 = julianChronology0.add(0L, 10L, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        java.lang.String str5 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.dayOfMonth();
        long long11 = julianChronology0.add((-47279968L), 899L, (int) ' ');
        java.lang.String str12 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str5, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-47251200L) + "'", long11 == (-47251200L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str12, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = julianChronology0.add(readablePeriod2, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.clockhourOfDay();
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean7 = julianChronology5.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField8 = julianChronology5.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = julianChronology5.getZone();
        boolean boolean10 = julianChronology0.equals((java.lang.Object) julianChronology5);
        org.joda.time.DurationField durationField11 = julianChronology5.months();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.monthOfYear();
        org.joda.time.DurationField durationField7 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.weekyear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        java.lang.String str4 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str4, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.secondOfDay();
        org.joda.time.Chronology chronology8 = julianChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.millisOfSecond();
        org.joda.time.DurationField durationField10 = julianChronology0.millis();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.DurationField durationField9 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.centuryOfEra();
        org.joda.time.DurationField durationField12 = julianChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = julianChronology0.add(readablePeriod14, (-99L), (int) (byte) 10);
        org.joda.time.chrono.JulianChronology julianChronology18 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField19 = julianChronology18.millisOfDay();
        org.joda.time.DateTimeField dateTimeField20 = julianChronology18.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = julianChronology18.getZone();
        org.joda.time.Chronology chronology22 = julianChronology0.withZone(dateTimeZone21);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str8, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-99L) + "'", long17 == (-99L));
        org.junit.Assert.assertNotNull(julianChronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(chronology22);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = julianChronology0.getZone();
        org.joda.time.DurationField durationField7 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.secondOfDay();
        java.lang.Class<?> wildcardClass10 = dateTimeField9.getClass();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.DurationField durationField9 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.year();
        org.joda.time.DurationField durationField13 = julianChronology0.millis();
        org.joda.time.DurationField durationField14 = julianChronology0.halfdays();
        int int15 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology0.era();
        org.joda.time.DateTimeZone dateTimeZone17 = julianChronology0.getZone();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str8, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        org.joda.time.DurationField durationField10 = julianChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.minuteOfHour();
        org.joda.time.chrono.JulianChronology julianChronology12 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean14 = julianChronology12.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField15 = julianChronology12.halfdayOfDay();
        org.joda.time.DurationField durationField16 = julianChronology12.millis();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology12.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = julianChronology12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField19 = julianChronology12.weekOfWeekyear();
        boolean boolean20 = julianChronology0.equals((java.lang.Object) julianChronology12);
        org.joda.time.DateTimeField dateTimeField21 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField22 = julianChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(julianChronology12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        org.joda.time.chrono.JulianChronology julianChronology14 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology14.millisOfDay();
        org.joda.time.DurationField durationField16 = julianChronology14.seconds();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = julianChronology14.add(readablePeriod17, (long) (byte) 10, (int) (byte) 100);
        boolean boolean21 = julianChronology0.equals((java.lang.Object) julianChronology14);
        org.joda.time.DateTimeField dateTimeField22 = julianChronology0.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = julianChronology0.get(readablePeriod23, 101L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(julianChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = julianChronology0.getDateTimeMillis((int) (byte) 100, (int) (short) 0, (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = julianChronology0.add(readablePeriod7, 0L, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = julianChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
        org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone10);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(julianChronology11);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.dayOfYear();
        org.joda.time.chrono.JulianChronology julianChronology8 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology8.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = julianChronology8.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = julianChronology8.dayOfWeek();
        org.joda.time.DurationField durationField13 = julianChronology8.months();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology8.secondOfMinute();
        org.joda.time.DurationField durationField15 = julianChronology8.weeks();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology8.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField18 = julianChronology8.dayOfMonth();
        int int19 = julianChronology8.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField20 = julianChronology8.days();
        org.joda.time.chrono.JulianChronology julianChronology21 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean23 = julianChronology21.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField24 = julianChronology21.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField25 = julianChronology21.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = julianChronology21.getZone();
        org.joda.time.DurationField durationField27 = julianChronology21.days();
        org.joda.time.DateTimeField dateTimeField28 = julianChronology21.clockhourOfDay();
        org.joda.time.DurationField durationField29 = julianChronology21.centuries();
        org.joda.time.chrono.JulianChronology julianChronology30 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField31 = julianChronology30.millisOfDay();
        org.joda.time.DateTimeField dateTimeField32 = julianChronology30.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone33 = julianChronology30.getZone();
        org.joda.time.Chronology chronology34 = julianChronology21.withZone(dateTimeZone33);
        org.joda.time.Chronology chronology35 = julianChronology8.withZone(dateTimeZone33);
        org.joda.time.chrono.JulianChronology julianChronology36 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone33);
        org.joda.time.Chronology chronology37 = julianChronology0.withZone(dateTimeZone33);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(julianChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(julianChronology21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(julianChronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(julianChronology36);
        org.junit.Assert.assertNotNull(chronology37);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
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
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = julianChronology0.add(readablePeriod20, (long) 0, 0);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(julianChronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 98L + "'", long13 == 98L);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.DurationField durationField9 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.era();
        org.joda.time.DurationField durationField12 = julianChronology0.weekyears();
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = julianChronology0.get(readablePartial13, 62L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str8, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.year();
        org.joda.time.chrono.JulianChronology julianChronology8 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology8.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = julianChronology8.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = julianChronology8.yearOfCentury();
        org.joda.time.DurationField durationField13 = julianChronology8.seconds();
        boolean boolean14 = julianChronology0.equals((java.lang.Object) durationField13);
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.year();
        int int16 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField18 = julianChronology0.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = julianChronology0.get(readablePeriod19, 67L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(julianChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = julianChronology0.days();
        long long11 = julianChronology0.add((long) (byte) 1, (long) (short) 100, (int) '#');
        org.joda.time.DurationField durationField12 = julianChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.secondOfMinute();
        org.joda.time.DurationField durationField14 = julianChronology0.weekyears();
        org.joda.time.DurationField durationField15 = julianChronology0.weekyears();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3501L + "'", long11 == 3501L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology6.monthOfYear();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology6.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology6.minuteOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.year();
        org.joda.time.chrono.JulianChronology julianChronology8 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology8.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = julianChronology8.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = julianChronology8.yearOfCentury();
        org.joda.time.DurationField durationField13 = julianChronology8.seconds();
        boolean boolean14 = julianChronology0.equals((java.lang.Object) durationField13);
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology0.centuryOfEra();
        long long20 = julianChronology0.add(0L, (-1L), 4);
        org.joda.time.chrono.JulianChronology julianChronology21 = org.joda.time.chrono.JulianChronology.getInstance();
        long long25 = julianChronology21.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str26 = julianChronology21.toString();
        org.joda.time.chrono.JulianChronology julianChronology27 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField28 = julianChronology27.millisOfDay();
        org.joda.time.DateTimeField dateTimeField29 = julianChronology27.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone30 = julianChronology27.getZone();
        org.joda.time.Chronology chronology31 = julianChronology21.withZone(dateTimeZone30);
        org.joda.time.Chronology chronology32 = julianChronology0.withZone(dateTimeZone30);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(julianChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-4L) + "'", long20 == (-4L));
        org.junit.Assert.assertNotNull(julianChronology21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 98L + "'", long25 == 98L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str26, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(julianChronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(chronology32);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField5 = julianChronology0.eras();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = julianChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.weekOfWeekyear();
        org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology9.millisOfDay();
        org.joda.time.DurationField durationField11 = julianChronology9.seconds();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = julianChronology9.add(readablePeriod12, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField16 = julianChronology9.hourOfHalfday();
        org.joda.time.DurationField durationField17 = julianChronology9.minutes();
        org.joda.time.DateTimeField dateTimeField18 = julianChronology9.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = julianChronology9.getZone();
        org.joda.time.Chronology chronology20 = julianChronology0.withZone(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField21 = julianChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(julianChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.yearOfCentury();
        org.joda.time.DurationField durationField16 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology0.millisOfDay();
        java.lang.String str18 = julianChronology0.toString();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str18, "JulianChronology[Etc/UTC]");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        java.lang.String str4 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = julianChronology0.days();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str4, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = julianChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = julianChronology6.halfdays();
        org.joda.time.chrono.JulianChronology julianChronology8 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology8.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology8.hourOfHalfday();
        org.joda.time.DurationField durationField12 = julianChronology8.days();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology8.millisOfSecond();
        org.joda.time.DurationField durationField15 = julianChronology8.days();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology8.hourOfHalfday();
        boolean boolean17 = julianChronology6.equals((java.lang.Object) dateTimeField16);
        org.joda.time.DurationField durationField18 = julianChronology6.weekyears();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(julianChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField11 = julianChronology0.centuries();
        java.lang.String str12 = julianChronology0.toString();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str8, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str12, "JulianChronology[Etc/UTC]");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = julianChronology0.months();
        org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean11 = julianChronology9.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField12 = julianChronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology9.halfdayOfDay();
        boolean boolean14 = julianChronology0.equals((java.lang.Object) dateTimeField13);
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.secondOfDay();
        org.joda.time.chrono.JulianChronology julianChronology16 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology16.weekyear();
        org.joda.time.DurationField durationField18 = julianChronology16.years();
        org.joda.time.DateTimeField dateTimeField19 = julianChronology16.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField20 = julianChronology16.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField21 = julianChronology16.hourOfHalfday();
        org.joda.time.DurationField durationField22 = julianChronology16.halfdays();
        org.joda.time.DateTimeField dateTimeField23 = julianChronology16.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField24 = julianChronology16.centuryOfEra();
        org.joda.time.DurationField durationField25 = julianChronology16.months();
        boolean boolean26 = julianChronology0.equals((java.lang.Object) julianChronology16);
        // The following exception was thrown during execution in test generation
        try {
            long long34 = julianChronology16.getDateTimeMillis((int) (short) -1, (int) (byte) 100, 100, 0, (int) (short) 100, 0, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(julianChronology9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(julianChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = julianChronology0.weeks();
        org.joda.time.DurationField durationField8 = julianChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField10 = julianChronology0.millis();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.millisOfDay();
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology7.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = julianChronology7.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology7.dayOfWeek();
        java.lang.String str12 = julianChronology7.toString();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology7.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology7.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology7.millisOfDay();
        org.joda.time.DurationField durationField16 = julianChronology7.weekyears();
        boolean boolean17 = julianChronology0.equals((java.lang.Object) durationField16);
        org.joda.time.DateTimeField dateTimeField18 = julianChronology0.era();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str12, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.DurationField durationField9 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str8, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.Chronology chronology8 = julianChronology7.withUTC();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = julianChronology7.withZone(dateTimeZone9);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.secondOfMinute();
        org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology9.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Chronology chronology12 = julianChronology9.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = julianChronology9.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology9.weekyear();
        int int16 = julianChronology9.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology9.centuryOfEra();
        org.joda.time.chrono.JulianChronology julianChronology18 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField19 = julianChronology18.weekyear();
        org.joda.time.DurationField durationField20 = julianChronology18.years();
        org.joda.time.Chronology chronology21 = julianChronology18.withUTC();
        int int22 = julianChronology18.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField23 = julianChronology18.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone24 = julianChronology18.getZone();
        org.joda.time.Chronology chronology25 = julianChronology9.withZone(dateTimeZone24);
        org.joda.time.chrono.JulianChronology julianChronology26 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone24);
        org.joda.time.Chronology chronology27 = julianChronology0.withZone(dateTimeZone24);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(julianChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(julianChronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(julianChronology26);
        org.junit.Assert.assertNotNull(chronology27);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField4 = julianChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        org.joda.time.DurationField durationField5 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField8 = julianChronology0.weeks();
        org.joda.time.DateTimeZone dateTimeZone9 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology10.minuteOfDay();
        org.joda.time.DurationField durationField12 = julianChronology10.hours();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.joda.time.Chronology chronology5 = julianChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = julianChronology0.millis();
        int int3 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField4 = julianChronology0.days();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = julianChronology0.get(readablePeriod5, 530L, 130052355L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.yearOfCentury();
        org.joda.time.DurationField durationField5 = julianChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.secondOfMinute();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = julianChronology0.set(readablePartial7, 899L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.dayOfMonth();
        org.joda.time.DurationField durationField3 = julianChronology0.days();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField5 = julianChronology0.seconds();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = julianChronology0.getZone();
        org.joda.time.DurationField durationField6 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.yearOfCentury();
        org.joda.time.DurationField durationField9 = julianChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField3 = julianChronology0.years();
        java.lang.String str4 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str4, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = julianChronology0.getDateTimeMillis((long) (short) 10, (int) (short) 100, (int) (byte) 100, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = julianChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.dayOfMonth();
        java.lang.Class<?> wildcardClass16 = julianChronology0.getClass();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = julianChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = julianChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.era();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = julianChronology0.get(readablePeriod11, 7200L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.centuryOfEra();
        org.joda.time.DurationField durationField10 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.hourOfDay();
        org.joda.time.DurationField durationField12 = julianChronology0.weeks();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
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
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str5, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str10, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        long long9 = julianChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DurationField durationField10 = julianChronology0.weeks();
        org.joda.time.DurationField durationField11 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = julianChronology0.add(readablePeriod12, 100L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField16 = julianChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = julianChronology0.halfdays();
        org.joda.time.DurationField durationField7 = julianChronology0.centuries();
        org.joda.time.DurationField durationField8 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.era();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField11 = julianChronology0.days();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.year();
        org.joda.time.DurationField durationField10 = julianChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = julianChronology0.add(readablePeriod11, 15001097L, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 15001097L + "'", long14 == 15001097L);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.era();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = julianChronology6.halfdays();
        org.joda.time.DurationField durationField8 = julianChronology6.halfdays();
        org.joda.time.DurationField durationField9 = julianChronology6.millis();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.era();
        org.joda.time.DurationField durationField10 = julianChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = julianChronology0.millis();
        org.joda.time.DateTimeZone dateTimeZone3 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology4 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone3);
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone3);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(julianChronology4);
        org.junit.Assert.assertNotNull(julianChronology5);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.millisOfSecond();
        org.joda.time.DurationField durationField6 = julianChronology0.minutes();
        org.joda.time.DurationField durationField7 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = julianChronology0.weeks();
        java.lang.String str4 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str4, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.minuteOfDay();
        org.joda.time.chrono.JulianChronology julianChronology4 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean6 = julianChronology4.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology4.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology4.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology4.era();
        boolean boolean11 = julianChronology0.equals((java.lang.Object) julianChronology4);
        org.joda.time.DurationField durationField12 = julianChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.era();
        int int14 = julianChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(julianChronology4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = julianChronology0.halfdays();
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean9 = julianChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = julianChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology7.monthOfYear();
        boolean boolean12 = julianChronology0.equals((java.lang.Object) julianChronology7);
        org.joda.time.DateTimeField dateTimeField13 = julianChronology7.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology7.centuryOfEra();
        org.joda.time.chrono.JulianChronology julianChronology15 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean17 = julianChronology15.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField18 = julianChronology15.halfdayOfDay();
        org.joda.time.DurationField durationField19 = julianChronology15.millis();
        org.joda.time.DateTimeField dateTimeField20 = julianChronology15.minuteOfHour();
        long long24 = julianChronology15.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DurationField durationField25 = julianChronology15.weeks();
        org.joda.time.DurationField durationField26 = julianChronology15.seconds();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        long long30 = julianChronology15.add(readablePeriod27, 100L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField31 = julianChronology15.millisOfDay();
        org.joda.time.DateTimeField dateTimeField32 = julianChronology15.minuteOfHour();
        boolean boolean33 = julianChronology7.equals((java.lang.Object) julianChronology15);
        org.joda.time.DateTimeField dateTimeField34 = julianChronology7.monthOfYear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(julianChronology15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1663L + "'", long24 == 1663L);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 100L + "'", long30 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(dateTimeField34);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekyear();
        int int7 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = julianChronology0.get(readablePeriod10, 67L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DurationField durationField1 = julianChronology0.halfdays();
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology2.weekyearOfCentury();
        boolean boolean6 = julianChronology0.equals((java.lang.Object) julianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology2.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone8 = julianChronology2.getZone();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        java.lang.String str6 = julianChronology0.toString();
        org.joda.time.Chronology chronology7 = julianChronology0.withUTC();
        int int8 = julianChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str6, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.millisOfSecond();
        java.lang.String str6 = julianChronology0.toString();
        org.joda.time.DurationField durationField7 = julianChronology0.millis();
        long long11 = julianChronology0.add((long) '#', 250100L, 0);
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str6, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.DurationField durationField9 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.year();
        org.joda.time.DurationField durationField13 = julianChronology0.millis();
        org.joda.time.DurationField durationField14 = julianChronology0.halfdays();
        org.joda.time.DurationField durationField15 = julianChronology0.days();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str8, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
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
        org.joda.time.chrono.JulianChronology julianChronology14 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology14.millisOfDay();
        org.joda.time.DurationField durationField16 = julianChronology14.seconds();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = julianChronology14.add(readablePeriod17, (long) (byte) 10, (int) (byte) 100);
        boolean boolean21 = julianChronology0.equals((java.lang.Object) julianChronology14);
        org.joda.time.DateTimeField dateTimeField22 = julianChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField23 = julianChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(julianChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = julianChronology0.weeks();
        long long9 = julianChronology0.add((-59081875195999L), (-2501033L), (int) (short) -1);
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology10.weekyear();
        org.joda.time.DurationField durationField12 = julianChronology10.years();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology10.halfdayOfDay();
        org.joda.time.DurationField durationField14 = julianChronology10.millis();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology10.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology10.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology10.yearOfCentury();
        boolean boolean18 = julianChronology0.equals((java.lang.Object) julianChronology10);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-59081872694966L) + "'", long9 == (-59081872694966L));
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = julianChronology0.getZone();
        org.joda.time.DurationField durationField4 = julianChronology0.months();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone4);
        org.joda.time.DurationField durationField6 = julianChronology5.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = julianChronology5.getDateTimeMillis(10, (int) (byte) -1, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
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
        long long22 = julianChronology0.add((long) ' ', 250100L, (int) (byte) 10);
        org.joda.time.DurationField durationField23 = julianChronology0.weeks();
        java.lang.String str24 = julianChronology0.toString();
        org.joda.time.ReadablePartial readablePartial25 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long27 = julianChronology0.set(readablePartial25, (-47250220L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 250100L + "'", long14 == 250100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2501032L + "'", long22 == 2501032L);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str24, "JulianChronology[Etc/UTC]");
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = julianChronology0.getDateTimeMillis(4, (int) '4', (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.yearOfCentury();
        org.joda.time.DurationField durationField16 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField18 = julianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField19 = julianChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.eras();
        java.lang.String str5 = julianChronology0.toString();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str5, "JulianChronology[Etc/UTC]");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfDay();
        java.lang.String str3 = julianChronology0.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = julianChronology0.getDateTimeMillis(0, 4, (int) (byte) 100, (int) (byte) -1, (int) (short) 0, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str3, "JulianChronology[Etc/UTC]");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.era();
        org.joda.time.DurationField durationField10 = julianChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField5 = julianChronology0.halfdays();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = julianChronology0.get(readablePartial6, 3152100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        long long9 = julianChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.secondOfDay();
        org.joda.time.DurationField durationField11 = julianChronology0.months();
        org.joda.time.DurationField durationField12 = julianChronology0.years();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance();
        long long7 = julianChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = julianChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = julianChronology3.days();
        boolean boolean11 = julianChronology0.equals((java.lang.Object) julianChronology3);
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone13 = julianChronology0.getZone();
        org.joda.time.DurationField durationField14 = julianChronology0.millis();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        java.lang.String str4 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.monthOfYear();
        org.joda.time.DurationField durationField7 = julianChronology0.weeks();
        org.joda.time.DurationField durationField8 = julianChronology0.centuries();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str4, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = julianChronology0.add(readablePeriod2, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.monthOfYear();
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean9 = julianChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = julianChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField11 = julianChronology7.millis();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology7.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = julianChronology7.add(readablePeriod14, 0L, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone18 = julianChronology7.getZone();
        org.joda.time.chrono.JulianChronology julianChronology19 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone18);
        org.joda.time.Chronology chronology20 = julianChronology0.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField21 = julianChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField22 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = julianChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(julianChronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = julianChronology0.set(readablePartial7, (-45861568940306L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.minuteOfHour();
        org.joda.time.DurationField durationField3 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
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
        org.joda.time.DurationField durationField13 = julianChronology0.months();
        org.joda.time.DurationField durationField14 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology0.dayOfYear();
        org.joda.time.DurationField durationField17 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField18 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = julianChronology0.era();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = julianChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = julianChronology0.seconds();
        long long10 = julianChronology0.add((long) (short) 100, 36001035L, (int) 'a');
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3501L + "'", long4 == 3501L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3492100495L + "'", long10 == 3492100495L);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.monthOfYear();
        org.joda.time.Chronology chronology5 = julianChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = julianChronology0.halfdays();
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean9 = julianChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = julianChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology7.monthOfYear();
        boolean boolean12 = julianChronology0.equals((java.lang.Object) julianChronology7);
        org.joda.time.DateTimeField dateTimeField13 = julianChronology7.dayOfYear();
        org.joda.time.chrono.JulianChronology julianChronology14 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean16 = julianChronology14.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField17 = julianChronology14.halfdayOfDay();
        org.joda.time.DurationField durationField18 = julianChronology14.millis();
        org.joda.time.DateTimeField dateTimeField19 = julianChronology14.minuteOfHour();
        long long23 = julianChronology14.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DateTimeZone dateTimeZone24 = julianChronology14.getZone();
        org.joda.time.chrono.JulianChronology julianChronology25 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone24);
        org.joda.time.Chronology chronology26 = julianChronology7.withZone(dateTimeZone24);
        // The following exception was thrown during execution in test generation
        try {
            long long31 = julianChronology7.getDateTimeMillis((int) (byte) 100, 1, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(julianChronology14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1663L + "'", long23 == 1663L);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(julianChronology25);
        org.junit.Assert.assertNotNull(chronology26);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
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
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.yearOfCentury();
        org.joda.time.Chronology chronology16 = julianChronology0.withUTC();
        org.joda.time.chrono.JulianChronology julianChronology17 = org.joda.time.chrono.JulianChronology.getInstance();
        long long21 = julianChronology17.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str22 = julianChronology17.toString();
        org.joda.time.chrono.JulianChronology julianChronology23 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField24 = julianChronology23.millisOfDay();
        org.joda.time.DateTimeField dateTimeField25 = julianChronology23.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = julianChronology23.getZone();
        org.joda.time.Chronology chronology27 = julianChronology17.withZone(dateTimeZone26);
        org.joda.time.chrono.JulianChronology julianChronology28 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone26);
        org.joda.time.Chronology chronology29 = julianChronology0.withZone(dateTimeZone26);
        org.joda.time.chrono.JulianChronology julianChronology30 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone26);
        org.joda.time.chrono.JulianChronology julianChronology31 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.JulianChronology julianChronology33 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone26, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(julianChronology17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 98L + "'", long21 == 98L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str22, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(julianChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(julianChronology28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(julianChronology30);
        org.junit.Assert.assertNotNull(julianChronology31);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.monthOfYear();
        org.joda.time.DurationField durationField8 = julianChronology0.months();
        org.joda.time.DurationField durationField9 = julianChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.weekyear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = julianChronology6.halfdays();
        org.joda.time.DurationField durationField8 = julianChronology6.seconds();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology6.weekyear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.monthOfYear();
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology10.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.Chronology chronology13 = julianChronology10.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = julianChronology10.dayOfWeek();
        org.joda.time.DurationField durationField15 = julianChronology10.months();
        org.joda.time.DurationField durationField16 = julianChronology10.months();
        org.joda.time.DurationField durationField17 = julianChronology10.hours();
        org.joda.time.DateTimeZone dateTimeZone18 = julianChronology10.getZone();
        org.joda.time.Chronology chronology19 = julianChronology0.withZone(dateTimeZone18);
        org.joda.time.chrono.JulianChronology julianChronology20 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone18);
        org.joda.time.chrono.JulianChronology julianChronology22 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone18, 4);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(julianChronology20);
        org.junit.Assert.assertNotNull(julianChronology22);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.era();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = julianChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField14 = julianChronology0.years();
        org.joda.time.DurationField durationField15 = julianChronology0.centuries();
        int int16 = julianChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = julianChronology0.getDateTimeMillis((-1), (int) (byte) 0, (int) 'a', 10, (int) (short) 10, 0, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        long long10 = julianChronology0.add((long) '4', 0L, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = julianChronology0.add(readablePeriod12, (-59011372800000L), (int) (byte) 1);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-59011372800000L) + "'", long15 == (-59011372800000L));
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = julianChronology0.add(readablePeriod7, 0L, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology12 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone11);
        org.joda.time.DurationField durationField13 = julianChronology12.years();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = julianChronology12.getDateTimeMillis((-62111404558900L), 100, (-1), (-1), 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(julianChronology12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.centuryOfEra();
        org.joda.time.DurationField durationField9 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField11 = julianChronology0.months();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = julianChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        long long9 = julianChronology0.getDateTimeMillis((int) (byte) 1, (int) (byte) 10, (int) (byte) 10, (int) ' ');
        org.joda.time.DurationField durationField10 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.minuteOfHour();
        org.joda.time.DurationField durationField12 = julianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-62111404799968L) + "'", long9 == (-62111404799968L));
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        java.lang.String str4 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.millisOfDay();
        int int6 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.ReadablePartial readablePartial7 = null;
        int[] intArray10 = new int[] { 4, 4 };
        // The following exception was thrown during execution in test generation
        try {
            julianChronology0.validate(readablePartial7, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str4, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[4, 4]");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.Chronology chronology3 = julianChronology0.withUTC();
        int int4 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = julianChronology0.millis();
        org.joda.time.DurationField durationField6 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.secondOfDay();
        org.joda.time.chrono.JulianChronology julianChronology8 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology8.weekyear();
        org.joda.time.DurationField durationField10 = julianChronology8.years();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = julianChronology8.add(readablePeriod11, (long) (-1), (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField15 = julianChronology8.weekyear();
        org.joda.time.DateTimeZone dateTimeZone16 = julianChronology8.getZone();
        org.joda.time.Chronology chronology17 = julianChronology0.withZone(dateTimeZone16);
        org.joda.time.chrono.JulianChronology julianChronology18 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone16);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(julianChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(julianChronology18);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DurationField durationField4 = julianChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.millisOfSecond();
        org.joda.time.DurationField durationField6 = julianChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone6);
        org.joda.time.chrono.JulianChronology julianChronology8 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology8.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = julianChronology8.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = julianChronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology8.weekyear();
        int int15 = julianChronology8.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology8.yearOfEra();
        org.joda.time.DurationField durationField18 = julianChronology8.seconds();
        boolean boolean19 = julianChronology7.equals((java.lang.Object) julianChronology8);
        org.joda.time.DateTimeField dateTimeField20 = julianChronology8.era();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(julianChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }
}

