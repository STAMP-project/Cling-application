import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.Ignore;
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
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.millisOfSecond();
        org.joda.time.DurationField durationField6 = julianChronology0.minutes();
        org.joda.time.DurationField durationField7 = julianChronology0.hours();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = julianChronology0.getDateTimeMillis(0, (-1), (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.millisOfSecond();
        org.joda.time.DurationField durationField9 = julianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.era();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = julianChronology0.hours();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekOfWeekyear();
        java.lang.Class<?> wildcardClass8 = julianChronology0.getClass();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology8 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone7);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = julianChronology8.getDateTimeMillis((-47251200L), 100, 0, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(julianChronology8);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        org.joda.time.DateTimeField dateTimeField16 = julianChronology0.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.Chronology chronology18 = julianChronology0.withZone(dateTimeZone17);
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
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = julianChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.era();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.year();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        org.joda.time.DurationField durationField19 = julianChronology0.minutes();
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
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = julianChronology0.set(readablePartial11, (-472800665899991L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        org.joda.time.DurationField durationField25 = julianChronology15.hours();
        org.joda.time.chrono.JulianChronology julianChronology26 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean28 = julianChronology26.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField29 = julianChronology26.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField30 = julianChronology26.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone31 = julianChronology26.getZone();
        org.joda.time.Chronology chronology32 = julianChronology15.withZone(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField33 = julianChronology15.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField34 = julianChronology15.era();
        org.joda.time.DateTimeField dateTimeField35 = julianChronology15.millisOfSecond();
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
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(julianChronology26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.DurationField durationField6 = julianChronology0.months();
        org.joda.time.DurationField durationField7 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = julianChronology0.weekyears();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.weekyearOfCentury();
        org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance();
        long long13 = julianChronology9.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField14 = julianChronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology9.weekOfWeekyear();
        org.joda.time.DurationField durationField16 = julianChronology9.days();
        long long20 = julianChronology9.add((long) (byte) 1, (long) (short) 100, (int) '#');
        org.joda.time.DurationField durationField21 = julianChronology9.weeks();
        org.joda.time.DateTimeField dateTimeField22 = julianChronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField23 = julianChronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField24 = julianChronology9.yearOfEra();
        boolean boolean25 = julianChronology0.equals((java.lang.Object) julianChronology9);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(julianChronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 98L + "'", long13 == 98L);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3501L + "'", long20 == 3501L);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField8 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.secondOfMinute();
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean12 = julianChronology10.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField13 = julianChronology10.halfdayOfDay();
        org.joda.time.DurationField durationField14 = julianChronology10.millis();
        org.joda.time.DurationField durationField15 = julianChronology10.days();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology10.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology10.weekyear();
        org.joda.time.DateTimeField dateTimeField18 = julianChronology10.clockhourOfDay();
        boolean boolean19 = julianChronology0.equals((java.lang.Object) dateTimeField18);
        org.joda.time.ReadablePartial readablePartial20 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long22 = julianChronology0.set(readablePartial20, 4235004L);
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
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = julianChronology0.centuries();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    @Ignore
  public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        org.joda.time.DurationField durationField8 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = julianChronology0.weeks();
        org.joda.time.DurationField durationField11 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField13 = julianChronology0.months();
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = julianChronology0.get(readablePartial14, 402L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        org.joda.time.DurationField durationField22 = julianChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField23 = julianChronology0.centuryOfEra();
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
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = julianChronology0.centuries();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = julianChronology0.hours();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.minuteOfDay();
        org.joda.time.DurationField durationField7 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.yearOfCentury();
        long long12 = julianChronology0.add((-59011372800000L), (long) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-59011372800000L) + "'", long12 == (-59011372800000L));
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        org.joda.time.DateTimeField dateTimeField14 = julianChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology7.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology7.dayOfYear();
        org.joda.time.DurationField durationField17 = julianChronology7.weekyears();
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
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        org.joda.time.ReadablePartial readablePartial26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray28 = julianChronology15.get(readablePartial26, 8003200L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = julianChronology0.millis();
        org.joda.time.Chronology chronology3 = julianChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.minuteOfHour();
        org.joda.time.Chronology chronology5 = julianChronology0.withUTC();
        java.lang.Class<?> wildcardClass6 = chronology5.getClass();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    @Ignore
  public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        org.joda.time.DurationField durationField8 = julianChronology0.minutes();
        org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean11 = julianChronology9.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField12 = julianChronology9.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology9.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = julianChronology9.getZone();
        org.joda.time.chrono.JulianChronology julianChronology15 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone14);
        org.joda.time.Chronology chronology16 = julianChronology0.withZone(dateTimeZone14);
        org.joda.time.DurationField durationField17 = julianChronology0.seconds();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = julianChronology0.getDateTimeMillis((int) ' ', 0, 4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(julianChronology9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(julianChronology15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = julianChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField13 = julianChronology0.years();
        long long17 = julianChronology0.add((-937L), 2501032L, (int) (short) 10);
        org.joda.time.DurationField durationField18 = julianChronology0.hours();
        org.joda.time.DurationField durationField19 = julianChronology0.centuries();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 25009383L + "'", long17 == 25009383L);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = julianChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField13 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField16 = julianChronology0.weekyears();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    @Ignore
  public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.DurationField durationField9 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.yearOfCentury();
        org.joda.time.DurationField durationField13 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.clockhourOfDay();
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
    }

    @Test
    @Ignore
  public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = julianChronology0.weekyears();
        long long14 = julianChronology0.getDateTimeMillis(52L, 0, 4, (int) (short) 10, (int) (short) 100);
        org.joda.time.DurationField durationField15 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology0.centuryOfEra();
        org.joda.time.DurationField durationField17 = julianChronology0.halfdays();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 250100L + "'", long14 == 250100L);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.yearOfCentury();
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
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.joda.time.Chronology chronology5 = julianChronology0.withUTC();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField7 = julianChronology0.millis();
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
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.monthOfYear();
        org.joda.time.DurationField durationField6 = julianChronology0.days();
        boolean boolean8 = julianChronology0.equals((java.lang.Object) 1L);
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.minuteOfHour();
        long long10 = julianChronology0.add(10L, 1L, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = julianChronology0.getDateTimeMillis(2501032L, (int) ' ', 1, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9L + "'", long10 == 9L);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = julianChronology0.add(readablePeriod10, (-47280066589999L), (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology15 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone14);
        org.joda.time.Chronology chronology16 = julianChronology15.withUTC();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-47280066589999L) + "'", long13 == (-47280066589999L));
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(julianChronology15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.clockhourOfHalfday();
        org.joda.time.Chronology chronology8 = julianChronology0.withUTC();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = julianChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = julianChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.year();
        org.joda.time.DurationField durationField7 = julianChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = julianChronology0.hours();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = julianChronology0.getZone();
        java.lang.Object obj8 = null;
        boolean boolean9 = julianChronology0.equals(obj8);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = julianChronology0.halfdays();
        org.joda.time.chrono.JulianChronology julianChronology8 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology8.hourOfDay();
        org.joda.time.DurationField durationField11 = julianChronology8.weeks();
        boolean boolean12 = julianChronology0.equals((java.lang.Object) julianChronology8);
        org.joda.time.Chronology chronology13 = julianChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField15 = julianChronology0.halfdays();
        org.joda.time.ReadablePartial readablePartial16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long18 = julianChronology0.set(readablePartial16, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(julianChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    @Ignore
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
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str5, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = julianChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField6 = julianChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.monthOfYear();
        org.joda.time.DurationField durationField8 = julianChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    @Ignore
  public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.minuteOfHour();
        org.joda.time.DurationField durationField4 = julianChronology0.months();
        java.lang.String str5 = julianChronology0.toString();
        org.joda.time.DurationField durationField6 = julianChronology0.halfdays();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str5, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = julianChronology0.add(readablePeriod7, (long) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    @Ignore
  public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
        long long22 = julianChronology0.add((long) (short) 10, 1L, (int) '4');
        org.joda.time.ReadablePartial readablePartial23 = null;
        int[] intArray27 = new int[] { (short) -1, 1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            julianChronology0.validate(readablePartial23, intArray27);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 62L + "'", long22 == 62L);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 1, 100]");
    }

    @Test
    @Ignore
  public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.DurationField durationField9 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.dayOfMonth();
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
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    @Ignore
  public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str5 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.era();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = julianChronology0.add(readablePeriod8, (long) '#', (int) ' ');
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.dayOfYear();
        org.joda.time.DurationField durationField13 = julianChronology0.months();
        org.joda.time.DurationField durationField14 = julianChronology0.minutes();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str5, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField9 = julianChronology0.centuries();
        org.joda.time.DateTimeZone dateTimeZone10 = julianChronology0.getZone();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.clockhourOfHalfday();
        long long11 = julianChronology0.add((long) (byte) 10, (long) 1, 10);
        org.joda.time.DurationField durationField12 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 20L + "'", long11 == 20L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    @Ignore
  public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        org.joda.time.DurationField durationField8 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    @Ignore
  public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str5 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.dayOfYear();
        org.joda.time.DurationField durationField7 = julianChronology0.seconds();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str5, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = julianChronology0.halfdays();
        org.joda.time.chrono.JulianChronology julianChronology8 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology8.hourOfDay();
        org.joda.time.DurationField durationField11 = julianChronology8.weeks();
        boolean boolean12 = julianChronology0.equals((java.lang.Object) julianChronology8);
        org.joda.time.DurationField durationField13 = julianChronology8.minutes();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = julianChronology8.get(readablePeriod14, (-938L), 500L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(julianChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        org.joda.time.DateTimeField dateTimeField14 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.dayOfYear();
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
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    @Ignore
  public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.clockhourOfDay();
        java.lang.String str4 = julianChronology0.toString();
        int int5 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.Chronology chronology6 = julianChronology0.withUTC();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str4, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        java.lang.Class<?> wildcardClass42 = dateTimeZone39.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = julianChronology0.add(readablePeriod2, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.millisOfSecond();
        long long11 = julianChronology0.add(1L, (long) (short) 0, 10);
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = julianChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.millisOfDay();
        long long8 = julianChronology0.add(67L, (long) (byte) 1, (int) '#');
        org.joda.time.DurationField durationField9 = julianChronology0.minutes();
        org.joda.time.DurationField durationField10 = julianChronology0.months();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 102L + "'", long8 == 102L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology3.dayOfYear();
        boolean boolean5 = julianChronology0.equals((java.lang.Object) dateTimeField4);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekyear();
        int int7 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.centuryOfEra();
        org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology9.weekyear();
        org.joda.time.DurationField durationField11 = julianChronology9.years();
        org.joda.time.Chronology chronology12 = julianChronology9.withUTC();
        int int13 = julianChronology9.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology9.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone15 = julianChronology9.getZone();
        org.joda.time.Chronology chronology16 = julianChronology0.withZone(dateTimeZone15);
        org.joda.time.chrono.JulianChronology julianChronology17 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone15);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(julianChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(julianChronology17);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        long long14 = julianChronology9.add(32L, 250100L, (int) '4');
        org.joda.time.chrono.JulianChronology julianChronology15 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology15.millisOfDay();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology15.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField18 = julianChronology15.hourOfHalfday();
        org.joda.time.DurationField durationField19 = julianChronology15.days();
        org.joda.time.DateTimeField dateTimeField20 = julianChronology15.weekyearOfCentury();
        org.joda.time.DurationField durationField21 = julianChronology15.years();
        org.joda.time.DateTimeField dateTimeField22 = julianChronology15.millisOfDay();
        org.joda.time.DateTimeField dateTimeField23 = julianChronology15.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField24 = julianChronology15.era();
        org.joda.time.DateTimeField dateTimeField25 = julianChronology15.hourOfHalfday();
        boolean boolean26 = julianChronology9.equals((java.lang.Object) dateTimeField25);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(julianChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 13005232L + "'", long14 == 13005232L);
        org.junit.Assert.assertNotNull(julianChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = julianChronology0.hours();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.minuteOfDay();
        org.joda.time.DurationField durationField7 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    @Ignore
  public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
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
        org.joda.time.DurationField durationField15 = julianChronology0.weeks();
        org.joda.time.chrono.JulianChronology julianChronology16 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean18 = julianChronology16.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField19 = julianChronology16.halfdayOfDay();
        org.joda.time.DurationField durationField20 = julianChronology16.millis();
        org.joda.time.DateTimeField dateTimeField21 = julianChronology16.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField22 = julianChronology16.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = julianChronology16.add(readablePeriod23, 0L, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone27 = julianChronology16.getZone();
        org.joda.time.chrono.JulianChronology julianChronology28 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone27);
        org.joda.time.Chronology chronology29 = julianChronology0.withZone(dateTimeZone27);
        org.joda.time.DurationField durationField30 = julianChronology0.weeks();
        org.joda.time.DurationField durationField31 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField32 = julianChronology0.clockhourOfDay();
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
        org.junit.Assert.assertNotNull(julianChronology16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(julianChronology28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = julianChronology0.getZone();
        org.joda.time.DurationField durationField6 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.secondOfDay();
        org.joda.time.ReadablePartial readablePartial8 = null;
        int[] intArray11 = new int[] { (short) 10, 0 };
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 0]");
    }

    @Test
    @Ignore
  public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        java.lang.String str6 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.year();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str6, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = julianChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.centuryOfEra();
        int int5 = julianChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    @Ignore
  public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        java.lang.String str5 = julianChronology0.toString();
        org.joda.time.Chronology chronology6 = julianChronology0.withUTC();
        org.joda.time.DurationField durationField7 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.centuryOfEra();
        org.joda.time.DurationField durationField9 = julianChronology0.minutes();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str5, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    @Ignore
  public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.DateTimeZone dateTimeZone9 = julianChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.centuryOfEra();
        java.lang.Object obj11 = null;
        boolean boolean12 = julianChronology0.equals(obj11);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str8, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.Chronology chronology3 = julianChronology0.withUTC();
        int int4 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = julianChronology0.add(readablePeriod7, (long) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = julianChronology0.getDateTimeMillis(1, (-1), (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
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
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
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
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
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
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
    @Ignore
  public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
    @Ignore
  public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
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
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
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
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        java.lang.String str1 = julianChronology0.toString();
        int int2 = julianChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JulianChronology[UTC]" + "'", str1, "JulianChronology[UTC]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
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
    @Ignore
  public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
    @Ignore
  public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
    @Ignore
  public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
    @Ignore
  public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
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
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
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
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
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
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
}

