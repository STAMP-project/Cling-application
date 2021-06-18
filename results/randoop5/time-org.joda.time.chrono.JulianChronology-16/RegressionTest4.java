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
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.year();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfDay();
        org.joda.time.ReadablePartial readablePartial4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = julianChronology0.get(readablePartial4, 25009383L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.minuteOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.halfdays();
        org.joda.time.DurationField durationField3 = julianChronology0.centuries();
        org.joda.time.chrono.JulianChronology julianChronology4 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology4.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology4.hourOfDay();
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance();
        long long11 = julianChronology7.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField12 = julianChronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology7.weekOfWeekyear();
        org.joda.time.DurationField durationField14 = julianChronology7.days();
        boolean boolean15 = julianChronology4.equals((java.lang.Object) julianChronology7);
        org.joda.time.DateTimeField dateTimeField16 = julianChronology4.weekyear();
        org.joda.time.DurationField durationField17 = julianChronology4.millis();
        boolean boolean18 = julianChronology0.equals((java.lang.Object) durationField17);
        org.joda.time.DateTimeField dateTimeField19 = julianChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(julianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 98L + "'", long11 == 98L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeField19);
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
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = julianChronology0.getZone();
        org.joda.time.DurationField durationField9 = julianChronology0.weeks();
        org.joda.time.DurationField durationField10 = julianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.era();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.minuteOfHour();
        long long10 = julianChronology0.add(10L, 1L, (int) (byte) -1);
        org.joda.time.DurationField durationField11 = julianChronology0.seconds();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9L + "'", long10 == 9L);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField3 = julianChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.minuteOfDay();
        org.joda.time.DurationField durationField7 = julianChronology0.days();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = julianChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.era();
        org.joda.time.DurationField durationField7 = julianChronology0.seconds();
        org.joda.time.DurationField durationField8 = julianChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = julianChronology0.millis();
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology3.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = julianChronology3.getZone();
        boolean boolean7 = julianChronology0.equals((java.lang.Object) julianChronology3);
        org.joda.time.DateTimeZone dateTimeZone8 = julianChronology3.getZone();
        org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = julianChronology9.centuries();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(julianChronology9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.weekyear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.DurationField durationField9 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.weekyear();
        java.lang.Object obj13 = null;
        boolean boolean14 = julianChronology0.equals(obj13);
        org.joda.time.DurationField durationField15 = julianChronology0.months();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance();
        long long7 = julianChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = julianChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = julianChronology3.days();
        boolean boolean11 = julianChronology0.equals((java.lang.Object) julianChronology3);
        org.joda.time.DateTimeField dateTimeField12 = julianChronology3.yearOfCentury();
        org.joda.time.DurationField durationField13 = julianChronology3.weekyears();
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
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = julianChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology0.hourOfDay();
        org.joda.time.DurationField durationField15 = julianChronology0.hours();
        long long19 = julianChronology0.add((-47280066589999L), 619L, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField20 = julianChronology0.era();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-47280066583809L) + "'", long19 == (-47280066583809L));
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        org.joda.time.DurationField durationField22 = julianChronology14.seconds();
        org.joda.time.DateTimeField dateTimeField23 = julianChronology14.minuteOfHour();
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
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        java.lang.String str14 = julianChronology7.toString();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology7.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology7.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = julianChronology7.getDateTimeMillis(4235004L, (int) (short) 10, (-1), (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str14, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        java.lang.String str5 = julianChronology0.toString();
        org.joda.time.Chronology chronology6 = julianChronology0.withUTC();
        org.joda.time.DurationField durationField7 = julianChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.secondOfMinute();
        int int10 = julianChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str5, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField10 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = julianChronology0.get(readablePeriod11, (long) 10);
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
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        org.joda.time.chrono.JulianChronology julianChronology15 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology15.millisOfDay();
        org.joda.time.DurationField durationField17 = julianChronology15.seconds();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = julianChronology15.add(readablePeriod18, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField22 = julianChronology15.secondOfDay();
        org.joda.time.Chronology chronology23 = julianChronology15.withUTC();
        boolean boolean24 = julianChronology0.equals((java.lang.Object) julianChronology15);
        org.joda.time.Chronology chronology25 = julianChronology15.withUTC();
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
        org.junit.Assert.assertNotNull(julianChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(chronology25);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        org.joda.time.DateTimeField dateTimeField18 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField19 = julianChronology0.dayOfWeek();
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
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.clockhourOfDay();
        java.lang.String str7 = julianChronology0.toString();
        org.joda.time.DurationField durationField8 = julianChronology0.minutes();
        org.joda.time.DurationField durationField9 = julianChronology0.millis();
        org.joda.time.DurationField durationField10 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        java.lang.String str4 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.year();
        org.joda.time.Chronology chronology7 = julianChronology0.withUTC();
        org.joda.time.DurationField durationField8 = julianChronology0.millis();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str4, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
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
        java.lang.String str5 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = julianChronology0.add(readablePeriod8, (long) (short) 100, (int) '#');
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.year();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str5, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DurationField durationField3 = julianChronology0.weeks();
        org.joda.time.DurationField durationField4 = julianChronology0.minutes();
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology5.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Chronology chronology8 = julianChronology5.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = julianChronology5.dayOfWeek();
        java.lang.String str10 = julianChronology5.toString();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology5.secondOfDay();
        org.joda.time.chrono.JulianChronology julianChronology12 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology12.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = julianChronology12.getZone();
        org.joda.time.Chronology chronology16 = julianChronology5.withZone(dateTimeZone15);
        org.joda.time.DurationField durationField17 = julianChronology5.years();
        boolean boolean18 = julianChronology0.equals((java.lang.Object) durationField17);
        org.joda.time.DateTimeField dateTimeField19 = julianChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str10, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(julianChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfDay();
        org.joda.time.Chronology chronology4 = julianChronology0.withUTC();
        org.joda.time.DurationField durationField5 = julianChronology0.seconds();
        org.joda.time.Chronology chronology6 = julianChronology0.withUTC();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = julianChronology0.set(readablePartial7, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.hourOfDay();
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology10.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology10.hourOfHalfday();
        java.lang.String str14 = julianChronology10.toString();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology10.weekyear();
        org.joda.time.DurationField durationField16 = julianChronology10.eras();
        boolean boolean17 = julianChronology0.equals((java.lang.Object) durationField16);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str14, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.minuteOfDay();
        java.lang.Class<?> wildcardClass4 = julianChronology0.getClass();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone6);
        org.joda.time.DurationField durationField8 = julianChronology7.seconds();
        org.joda.time.DurationField durationField9 = julianChronology7.weekyears();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        int int13 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = julianChronology0.add(readablePeriod14, 130052355L, (int) (short) 1);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str5, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-47251200L) + "'", long11 == (-47251200L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str12, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 130052355L + "'", long17 == 130052355L);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (-1), (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = julianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = julianChronology0.getDateTimeMillis((int) (short) 100, 0, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        org.joda.time.DateTimeField dateTimeField14 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField16 = julianChronology0.halfdays();
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
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.era();
        org.joda.time.DurationField durationField7 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField10 = julianChronology0.months();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = julianChronology0.add(readablePeriod7, 0L, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = julianChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.yearOfCentury();
        java.lang.String str14 = julianChronology0.toString();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str14, "JulianChronology[Etc/UTC]");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = julianChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology0.hourOfDay();
        org.joda.time.DurationField durationField15 = julianChronology0.hours();
        long long19 = julianChronology0.add((-47280066589999L), 619L, (int) (byte) 10);
        org.joda.time.chrono.JulianChronology julianChronology20 = org.joda.time.chrono.JulianChronology.getInstance();
        long long24 = julianChronology20.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField25 = julianChronology20.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField26 = julianChronology20.dayOfMonth();
        org.joda.time.DurationField durationField27 = julianChronology20.days();
        org.joda.time.DateTimeField dateTimeField28 = julianChronology20.weekOfWeekyear();
        org.joda.time.chrono.JulianChronology julianChronology29 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField30 = julianChronology29.millisOfDay();
        org.joda.time.DurationField durationField31 = julianChronology29.seconds();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        long long35 = julianChronology29.add(readablePeriod32, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField36 = julianChronology29.hourOfHalfday();
        org.joda.time.DurationField durationField37 = julianChronology29.minutes();
        org.joda.time.DateTimeField dateTimeField38 = julianChronology29.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone39 = julianChronology29.getZone();
        org.joda.time.Chronology chronology40 = julianChronology20.withZone(dateTimeZone39);
        org.joda.time.Chronology chronology41 = julianChronology0.withZone(dateTimeZone39);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-47280066583809L) + "'", long19 == (-47280066583809L));
        org.junit.Assert.assertNotNull(julianChronology20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 98L + "'", long24 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(julianChronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L + "'", long35 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(chronology41);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.DurationField durationField9 = julianChronology0.minutes();
        org.joda.time.DurationField durationField10 = julianChronology0.halfdays();
        org.joda.time.Chronology chronology11 = julianChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str8, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField7 = julianChronology0.weeks();
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
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.centuries();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = julianChronology0.get(readablePartial6, 1663L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.millisOfSecond();
        java.lang.String str6 = julianChronology0.toString();
        org.joda.time.DurationField durationField7 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str6, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField9 = julianChronology0.years();
        org.joda.time.DurationField durationField10 = julianChronology0.years();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
    }
}

