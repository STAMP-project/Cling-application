import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = julianChronology0.millis();
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology3.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = julianChronology3.getZone();
        boolean boolean7 = julianChronology0.equals((java.lang.Object) julianChronology3);
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.monthOfYear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.hourOfHalfday();
        long long13 = julianChronology0.add(102L, (-4727996799L), 100);
        org.joda.time.DateTimeField dateTimeField14 = julianChronology0.secondOfDay();
        java.lang.Class<?> wildcardClass15 = julianChronology0.getClass();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-472799679798L) + "'", long13 == (-472799679798L));
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.DurationField durationField9 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.year();
        long long14 = julianChronology0.add((long) 0, 0L, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str8, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
        org.joda.time.DateTimeField dateTimeField17 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = julianChronology0.hourOfHalfday();
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
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = julianChronology0.millis();
        org.joda.time.Chronology chronology3 = julianChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.minuteOfHour();
        org.joda.time.Chronology chronology5 = julianChronology0.withUTC();
        org.joda.time.DurationField durationField6 = julianChronology0.seconds();
        org.joda.time.DurationField durationField7 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.secondOfMinute();
        long long7 = julianChronology0.add((long) (-1), (long) (short) 100, 0);
        org.joda.time.chrono.JulianChronology julianChronology8 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology8.hourOfDay();
        org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance();
        long long15 = julianChronology11.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField16 = julianChronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology11.weekOfWeekyear();
        org.joda.time.DurationField durationField18 = julianChronology11.days();
        boolean boolean19 = julianChronology8.equals((java.lang.Object) julianChronology11);
        org.joda.time.DateTimeZone dateTimeZone20 = julianChronology11.getZone();
        org.joda.time.Chronology chronology21 = julianChronology0.withZone(dateTimeZone20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.JulianChronology julianChronology23 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone20, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(julianChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(julianChronology11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 98L + "'", long15 == 98L);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        int int14 = julianChronology0.getMinimumDaysInFirstWeek();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        java.lang.String str5 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.yearOfEra();
        org.joda.time.DurationField durationField8 = julianChronology0.months();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str5, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = julianChronology0.getDateTimeMillis((-45861568940306L), (int) '4', 0, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        org.joda.time.chrono.JulianChronology julianChronology14 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean16 = julianChronology14.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField17 = julianChronology14.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = julianChronology14.getZone();
        org.joda.time.chrono.JulianChronology julianChronology19 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone18);
        org.joda.time.Chronology chronology20 = julianChronology7.withZone(dateTimeZone18);
        org.joda.time.chrono.JulianChronology julianChronology21 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone18);
        org.joda.time.chrono.JulianChronology julianChronology23 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone18, (int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology24 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone18);
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
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(julianChronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(julianChronology21);
        org.junit.Assert.assertNotNull(julianChronology23);
        org.junit.Assert.assertNotNull(julianChronology24);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        org.joda.time.DurationField durationField8 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField7 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.era();
        org.joda.time.DurationField durationField9 = julianChronology0.days();
        org.joda.time.DurationField durationField10 = julianChronology0.hours();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.centuryOfEra();
        org.joda.time.DurationField durationField10 = julianChronology0.minutes();
        org.joda.time.ReadablePartial readablePartial11 = null;
        int[] intArray13 = new int[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            julianChronology0.validate(readablePartial11, intArray13);
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52]");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
        org.joda.time.chrono.JulianChronology julianChronology14 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone12, 4);
        org.joda.time.DateTimeField dateTimeField15 = julianChronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology14.dayOfMonth();
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
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = julianChronology0.getDateTimeMillis(1, (int) (byte) 0, (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField16 = julianChronology0.centuries();
        org.joda.time.DurationField durationField17 = julianChronology0.seconds();
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
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.JulianChronology julianChronology22 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone18, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.DateTimeZone dateTimeZone9 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone9, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField12 = julianChronology11.year();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str8, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(julianChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        org.joda.time.DurationField durationField8 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = julianChronology0.weeks();
        org.joda.time.DurationField durationField11 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.dayOfYear();
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
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.year();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = julianChronology0.seconds();
        org.joda.time.DurationField durationField4 = julianChronology0.years();
        org.joda.time.DurationField durationField5 = julianChronology0.weeks();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = julianChronology0.getDateTimeMillis((int) (byte) 100, 0, 10, (int) (byte) 1, (int) (byte) 1, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
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
        org.joda.time.DurationField durationField21 = julianChronology0.days();
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
        org.junit.Assert.assertNotNull(durationField21);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.secondOfMinute();
        long long7 = julianChronology0.add((long) (-1), (long) (short) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = julianChronology0.getDateTimeMillis((int) 'a', 1, 0, (int) (short) 0, (int) (short) 10, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
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
        org.joda.time.DateTimeField dateTimeField14 = julianChronology7.dayOfMonth();
        org.joda.time.chrono.JulianChronology julianChronology15 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology15.weekyear();
        org.joda.time.DurationField durationField17 = julianChronology15.years();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = julianChronology15.add(readablePeriod18, (long) (-1), (int) (byte) 100);
        org.joda.time.chrono.JulianChronology julianChronology22 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean24 = julianChronology22.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField25 = julianChronology22.halfdayOfDay();
        org.joda.time.DurationField durationField26 = julianChronology22.millis();
        org.joda.time.DurationField durationField27 = julianChronology22.days();
        org.joda.time.DateTimeField dateTimeField28 = julianChronology22.yearOfCentury();
        boolean boolean29 = julianChronology15.equals((java.lang.Object) julianChronology22);
        org.joda.time.chrono.JulianChronology julianChronology30 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField31 = julianChronology30.millisOfDay();
        org.joda.time.DurationField durationField32 = julianChronology30.seconds();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        long long36 = julianChronology30.add(readablePeriod33, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField37 = julianChronology30.secondOfDay();
        org.joda.time.Chronology chronology38 = julianChronology30.withUTC();
        boolean boolean39 = julianChronology15.equals((java.lang.Object) julianChronology30);
        org.joda.time.DurationField durationField40 = julianChronology30.hours();
        org.joda.time.DateTimeField dateTimeField41 = julianChronology30.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone42 = julianChronology30.getZone();
        org.joda.time.Chronology chronology43 = julianChronology7.withZone(dateTimeZone42);
        org.joda.time.DateTimeField dateTimeField44 = julianChronology7.dayOfMonth();
        long long48 = julianChronology7.add((long) (byte) 0, 61001L, (int) (short) -1);
        org.joda.time.ReadablePartial readablePartial49 = null;
        int[] intArray51 = new int[] { 4 };
        // The following exception was thrown during execution in test generation
        try {
            julianChronology7.validate(readablePartial49, intArray51);
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
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(julianChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(julianChronology22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(julianChronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-61001L) + "'", long48 == (-61001L));
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[4]");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = julianChronology0.add(readablePeriod2, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
        org.joda.time.DurationField durationField12 = julianChronology0.centuries();
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
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.JulianChronology julianChronology1 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = julianChronology1.year();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology1.minuteOfDay();
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology5.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology5.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology5.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology5.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology5.minuteOfDay();
        boolean boolean11 = julianChronology1.equals((java.lang.Object) dateTimeField10);
        org.joda.time.DateTimeField dateTimeField12 = julianChronology1.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = julianChronology1.getDateTimeMillis(100, (int) (short) 100, (int) (byte) 0, (int) (short) 0, (int) (byte) 100, 4, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        org.joda.time.DurationField durationField5 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone7 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology8 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone7);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(julianChronology8);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField8 = julianChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.weekyearOfCentury();
        java.lang.String str10 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.clockhourOfHalfday();
        java.lang.String str12 = julianChronology0.toString();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str10, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str12, "JulianChronology[Etc/UTC]");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.DateTimeZone dateTimeZone9 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone9, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField12 = julianChronology11.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = julianChronology11.get(readablePeriod13, (long) (byte) 1, 0L);
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
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(julianChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = julianChronology0.days();
        long long11 = julianChronology0.add((long) (byte) 1, (long) (short) 100, (int) '#');
        org.joda.time.DurationField durationField12 = julianChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.secondOfMinute();
        org.joda.time.DurationField durationField14 = julianChronology0.weekyears();
        long long18 = julianChronology0.add(3152100L, 0L, (int) (byte) -1);
        org.joda.time.chrono.JulianChronology julianChronology19 = org.joda.time.chrono.JulianChronology.getInstance();
        long long23 = julianChronology19.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField24 = julianChronology19.halfdayOfDay();
        org.joda.time.DurationField durationField25 = julianChronology19.halfdays();
        org.joda.time.chrono.JulianChronology julianChronology26 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean28 = julianChronology26.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField29 = julianChronology26.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField30 = julianChronology26.monthOfYear();
        boolean boolean31 = julianChronology19.equals((java.lang.Object) julianChronology26);
        org.joda.time.DurationField durationField32 = julianChronology26.centuries();
        org.joda.time.DurationField durationField33 = julianChronology26.centuries();
        org.joda.time.DateTimeField dateTimeField34 = julianChronology26.minuteOfDay();
        boolean boolean35 = julianChronology0.equals((java.lang.Object) julianChronology26);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3501L + "'", long11 == 3501L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3152100L + "'", long18 == 3152100L);
        org.junit.Assert.assertNotNull(julianChronology19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 98L + "'", long23 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(julianChronology26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
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
        org.joda.time.chrono.JulianChronology julianChronology14 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone12, 4);
        org.joda.time.DateTimeField dateTimeField15 = julianChronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology14.centuryOfEra();
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
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField8 = julianChronology0.seconds();
        java.lang.String str9 = julianChronology0.toString();
        int int10 = julianChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str9, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        long long26 = julianChronology0.add((long) 1, (long) (byte) 0, (int) 'a');
        org.joda.time.DateTimeField dateTimeField27 = julianChronology0.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        long long31 = julianChronology0.add(readablePeriod28, (-61039267200000L), (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-61039267200000L) + "'", long31 == (-61039267200000L));
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField6 = julianChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = julianChronology0.get(readablePeriod7, 4235004L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        long long25 = julianChronology0.add(readablePeriod22, (-59011372800000L), (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-59011372800000L) + "'", long25 == (-59011372800000L));
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.secondOfMinute();
        long long7 = julianChronology0.add((long) (-1), (long) (short) 100, 0);
        org.joda.time.DurationField durationField8 = julianChronology0.eras();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField7 = julianChronology0.weekyears();
        org.joda.time.DurationField durationField8 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        java.lang.String str4 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.secondOfMinute();
        org.joda.time.DurationField durationField8 = julianChronology0.halfdays();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str4, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DurationField durationField3 = julianChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology3.dayOfYear();
        boolean boolean5 = julianChronology0.equals((java.lang.Object) dateTimeField4);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone3, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology5.yearOfEra();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = julianChronology0.add(readablePeriod11, (-47279968L), (int) 'a');
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-47279968L) + "'", long14 == (-47279968L));
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.DurationField durationField6 = julianChronology0.months();
        org.joda.time.DurationField durationField7 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = julianChronology0.getDateTimeMillis((-1L), (int) (short) 10, 4, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = julianChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.era();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone0, 1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.weekyear();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = julianChronology2.add(readablePeriod4, 9700L, (int) '4');
        org.joda.time.DurationField durationField8 = julianChronology2.eras();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology2.halfdayOfDay();
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9700L + "'", long7 == 9700L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.year();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = julianChronology0.minutes();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        java.lang.String str4 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = julianChronology0.get(readablePartial6, (-61039267200000L));
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
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
        org.joda.time.DateTimeField dateTimeField14 = julianChronology7.dayOfMonth();
        org.joda.time.chrono.JulianChronology julianChronology15 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology15.weekyear();
        org.joda.time.DurationField durationField17 = julianChronology15.years();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = julianChronology15.add(readablePeriod18, (long) (-1), (int) (byte) 100);
        org.joda.time.chrono.JulianChronology julianChronology22 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean24 = julianChronology22.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField25 = julianChronology22.halfdayOfDay();
        org.joda.time.DurationField durationField26 = julianChronology22.millis();
        org.joda.time.DurationField durationField27 = julianChronology22.days();
        org.joda.time.DateTimeField dateTimeField28 = julianChronology22.yearOfCentury();
        boolean boolean29 = julianChronology15.equals((java.lang.Object) julianChronology22);
        org.joda.time.chrono.JulianChronology julianChronology30 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField31 = julianChronology30.millisOfDay();
        org.joda.time.DurationField durationField32 = julianChronology30.seconds();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        long long36 = julianChronology30.add(readablePeriod33, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField37 = julianChronology30.secondOfDay();
        org.joda.time.Chronology chronology38 = julianChronology30.withUTC();
        boolean boolean39 = julianChronology15.equals((java.lang.Object) julianChronology30);
        org.joda.time.DurationField durationField40 = julianChronology30.hours();
        org.joda.time.DateTimeField dateTimeField41 = julianChronology30.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone42 = julianChronology30.getZone();
        org.joda.time.Chronology chronology43 = julianChronology7.withZone(dateTimeZone42);
        org.joda.time.DateTimeField dateTimeField44 = julianChronology7.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        long long48 = julianChronology7.add(readablePeriod45, (-4L), (int) 'a');
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
        org.junit.Assert.assertNotNull(julianChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(julianChronology22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(julianChronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-4L) + "'", long48 == (-4L));
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = julianChronology0.add(readablePeriod8, (long) '4', 1);
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.hourOfDay();
        org.joda.time.chrono.JulianChronology julianChronology13 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology13.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.Chronology chronology16 = julianChronology13.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = julianChronology13.dayOfWeek();
        org.joda.time.DurationField durationField18 = julianChronology13.months();
        org.joda.time.DateTimeField dateTimeField19 = julianChronology13.year();
        org.joda.time.DateTimeField dateTimeField20 = julianChronology13.era();
        org.joda.time.DateTimeField dateTimeField21 = julianChronology13.weekyear();
        org.joda.time.chrono.JulianChronology julianChronology22 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean24 = julianChronology22.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField25 = julianChronology22.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField26 = julianChronology22.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone27 = julianChronology22.getZone();
        org.joda.time.chrono.JulianChronology julianChronology28 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone27);
        org.joda.time.chrono.JulianChronology julianChronology29 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone27);
        org.joda.time.DurationField durationField30 = julianChronology29.millis();
        org.joda.time.DurationField durationField31 = julianChronology29.weekyears();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        long long35 = julianChronology29.add(readablePeriod32, 100L, (int) (short) -1);
        org.joda.time.chrono.JulianChronology julianChronology36 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField37 = julianChronology36.weekyear();
        org.joda.time.DateTimeField dateTimeField38 = julianChronology36.hourOfDay();
        org.joda.time.chrono.JulianChronology julianChronology39 = org.joda.time.chrono.JulianChronology.getInstance();
        long long43 = julianChronology39.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField44 = julianChronology39.weekyears();
        org.joda.time.DateTimeField dateTimeField45 = julianChronology39.weekOfWeekyear();
        org.joda.time.DurationField durationField46 = julianChronology39.days();
        boolean boolean47 = julianChronology36.equals((java.lang.Object) julianChronology39);
        org.joda.time.DateTimeZone dateTimeZone48 = julianChronology39.getZone();
        org.joda.time.chrono.JulianChronology julianChronology50 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone48, (int) (byte) 1);
        org.joda.time.Chronology chronology51 = julianChronology29.withZone(dateTimeZone48);
        org.joda.time.chrono.JulianChronology julianChronology52 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone48);
        org.joda.time.Chronology chronology53 = julianChronology13.withZone(dateTimeZone48);
        org.joda.time.Chronology chronology54 = julianChronology0.withZone(dateTimeZone48);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(julianChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(julianChronology22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(julianChronology28);
        org.junit.Assert.assertNotNull(julianChronology29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35 == 100L);
        org.junit.Assert.assertNotNull(julianChronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(julianChronology39);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 98L + "'", long43 == 98L);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(julianChronology50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(julianChronology52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(chronology54);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = julianChronology0.millis();
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology3.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = julianChronology3.getZone();
        boolean boolean7 = julianChronology0.equals((java.lang.Object) julianChronology3);
        org.joda.time.chrono.JulianChronology julianChronology8 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology8.hourOfDay();
        org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance();
        long long15 = julianChronology11.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField16 = julianChronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology11.weekOfWeekyear();
        org.joda.time.DurationField durationField18 = julianChronology11.days();
        boolean boolean19 = julianChronology8.equals((java.lang.Object) julianChronology11);
        org.joda.time.DateTimeZone dateTimeZone20 = julianChronology11.getZone();
        org.joda.time.Chronology chronology21 = julianChronology3.withZone(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField22 = julianChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField23 = julianChronology3.centuryOfEra();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(julianChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(julianChronology11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 98L + "'", long15 == 98L);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = julianChronology0.getZone();
        org.joda.time.DurationField durationField6 = julianChronology0.days();
        long long12 = julianChronology0.getDateTimeMillis(1L, (int) (byte) 0, (int) '4', (int) ' ', (int) (short) 100);
        java.lang.String str13 = julianChronology0.toString();
        org.joda.time.DurationField durationField14 = julianChronology0.months();
        org.joda.time.Chronology chronology15 = julianChronology0.withUTC();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3152100L + "'", long12 == 3152100L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str13, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.minuteOfHour();
        org.joda.time.DurationField durationField7 = julianChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = julianChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.dayOfWeek();
        int int11 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.centuryOfEra();
        java.lang.String str13 = julianChronology0.toString();
        org.joda.time.DurationField durationField14 = julianChronology0.eras();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str13, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = julianChronology0.getDateTimeMillis((-4L), (int) (byte) 10, (int) ' ', (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.era();
        org.joda.time.DurationField durationField10 = julianChronology0.seconds();
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
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.joda.time.DurationField durationField5 = julianChronology0.centuries();
        java.lang.String str6 = julianChronology0.toString();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str6, "JulianChronology[Etc/UTC]");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DurationField durationField1 = julianChronology0.halfdays();
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology2.weekyearOfCentury();
        boolean boolean6 = julianChronology0.equals((java.lang.Object) julianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology2.hourOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
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
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = julianChronology0.get(readablePeriod12, 3571L, 402L);
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
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField3 = julianChronology0.millis();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = julianChronology0.getDateTimeMillis((int) (byte) 10, (int) (byte) 100, 1, 0, 1, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = julianChronology0.halfdays();
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean9 = julianChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = julianChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology7.monthOfYear();
        boolean boolean12 = julianChronology0.equals((java.lang.Object) julianChronology7);
        org.joda.time.DurationField durationField13 = julianChronology0.weekyears();
        org.joda.time.DurationField durationField14 = julianChronology0.years();
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
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.minuteOfHour();
        org.joda.time.DurationField durationField7 = julianChronology0.halfdays();
        int int8 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField9 = julianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.era();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance();
        long long7 = julianChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = julianChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = julianChronology3.days();
        boolean boolean11 = julianChronology0.equals((java.lang.Object) julianChronology3);
        org.joda.time.DurationField durationField12 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField15 = julianChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone16 = julianChronology0.getZone();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekOfWeekyear();
        org.joda.time.Chronology chronology8 = julianChronology0.withUTC();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = julianChronology0.get(readablePeriod9, (-99L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.millisOfSecond();
        org.joda.time.DurationField durationField7 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.era();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        java.lang.String str4 = julianChronology0.toString();
        org.joda.time.DurationField durationField5 = julianChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str4, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
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
        org.joda.time.DurationField durationField13 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology0.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = julianChronology0.get(readablePeriod15, (long) (byte) -1, 62003435L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology0.clockhourOfDay();
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
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.era();
        org.joda.time.DurationField durationField7 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField9 = julianChronology0.minutes();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        org.joda.time.DurationField durationField8 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = julianChronology0.weeks();
        org.joda.time.DurationField durationField11 = julianChronology0.weekyears();
        long long17 = julianChronology0.getDateTimeMillis((long) ' ', 4, 10, (int) (byte) 1, (int) 'a');
        org.joda.time.DurationField durationField18 = julianChronology0.centuries();
        org.joda.time.DurationField durationField19 = julianChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField20 = julianChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 15001097L + "'", long17 == 15001097L);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = julianChronology0.add(readablePeriod8, (long) '4', 1);
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField13 = julianChronology0.weeks();
        org.joda.time.DurationField durationField14 = julianChronology0.seconds();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.dayOfMonth();
        long long10 = julianChronology0.add(0L, 10L, (int) (short) 0);
        org.joda.time.Chronology chronology11 = julianChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.secondOfDay();
        org.joda.time.Chronology chronology13 = julianChronology0.withUTC();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        java.lang.String str5 = julianChronology0.toString();
        org.joda.time.Chronology chronology6 = julianChronology0.withUTC();
        org.joda.time.DurationField durationField7 = julianChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.era();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str5, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField16 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology0.minuteOfDay();
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
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
        org.joda.time.DurationField durationField15 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
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
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.secondOfDay();
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
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = julianChronology0.years();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = julianChronology0.hours();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.dayOfYear();
        org.joda.time.DurationField durationField7 = julianChronology0.seconds();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DurationField durationField1 = julianChronology0.halfdays();
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology2.weekyearOfCentury();
        boolean boolean6 = julianChronology0.equals((java.lang.Object) julianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology2.dayOfMonth();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
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
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.yearOfEra();
        org.joda.time.DurationField durationField14 = julianChronology0.days();
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
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        org.joda.time.DurationField durationField8 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.yearOfCentury();
        java.lang.Class<?> wildcardClass10 = dateTimeField9.getClass();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        java.lang.String str4 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str4, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = julianChronology0.add(readablePeriod2, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = julianChronology0.eras();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekyearOfCentury();
        long long13 = julianChronology0.getDateTimeMillis(9L, 10, (int) (short) 0, (int) (byte) 1, (int) '#');
        org.joda.time.DateTimeField dateTimeField14 = julianChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 36001035L + "'", long13 == 36001035L);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.era();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = julianChronology0.get(readablePeriod7, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = julianChronology0.millis();
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology3.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = julianChronology3.getZone();
        boolean boolean7 = julianChronology0.equals((java.lang.Object) julianChronology3);
        org.joda.time.chrono.JulianChronology julianChronology8 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology8.hourOfDay();
        org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance();
        long long15 = julianChronology11.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField16 = julianChronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology11.weekOfWeekyear();
        org.joda.time.DurationField durationField18 = julianChronology11.days();
        boolean boolean19 = julianChronology8.equals((java.lang.Object) julianChronology11);
        org.joda.time.DateTimeZone dateTimeZone20 = julianChronology11.getZone();
        org.joda.time.Chronology chronology21 = julianChronology3.withZone(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField22 = julianChronology3.millisOfDay();
        org.joda.time.chrono.JulianChronology julianChronology23 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean25 = julianChronology23.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField26 = julianChronology23.halfdayOfDay();
        org.joda.time.DurationField durationField27 = julianChronology23.millis();
        org.joda.time.DateTimeField dateTimeField28 = julianChronology23.minuteOfHour();
        long long32 = julianChronology23.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DurationField durationField33 = julianChronology23.weeks();
        org.joda.time.DateTimeZone dateTimeZone34 = julianChronology23.getZone();
        org.joda.time.Chronology chronology35 = julianChronology3.withZone(dateTimeZone34);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(julianChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(julianChronology11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 98L + "'", long15 == 98L);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(julianChronology23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1663L + "'", long32 == 1663L);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(chronology35);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = julianChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone14 = julianChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.year();
        long long19 = julianChronology0.add((long) 1, (long) (short) -1, 0);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        org.joda.time.DurationField durationField8 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = julianChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.yearOfEra();
        org.joda.time.DurationField durationField13 = julianChronology0.weeks();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
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
        int int11 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField12 = julianChronology0.days();
        org.joda.time.chrono.JulianChronology julianChronology13 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean15 = julianChronology13.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField16 = julianChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology13.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = julianChronology13.getZone();
        org.joda.time.DurationField durationField19 = julianChronology13.days();
        org.joda.time.DateTimeField dateTimeField20 = julianChronology13.clockhourOfDay();
        org.joda.time.DurationField durationField21 = julianChronology13.centuries();
        org.joda.time.chrono.JulianChronology julianChronology22 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField23 = julianChronology22.millisOfDay();
        org.joda.time.DateTimeField dateTimeField24 = julianChronology22.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone25 = julianChronology22.getZone();
        org.joda.time.Chronology chronology26 = julianChronology13.withZone(dateTimeZone25);
        org.joda.time.Chronology chronology27 = julianChronology0.withZone(dateTimeZone25);
        org.joda.time.DurationField durationField28 = julianChronology0.halfdays();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(julianChronology13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(julianChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(durationField28);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
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
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.clockhourOfHalfday();
        org.joda.time.Chronology chronology14 = julianChronology0.withUTC();
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
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
        org.joda.time.DurationField durationField15 = julianChronology0.halfdays();
        org.joda.time.Chronology chronology16 = julianChronology0.withUTC();
        org.joda.time.DurationField durationField17 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField18 = julianChronology0.yearOfCentury();
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
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = julianChronology6.halfdays();
        long long11 = julianChronology6.add(500L, 67L, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = julianChronology6.get(readablePeriod12, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 7200L + "'", long11 == 7200L);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.secondOfDay();
        org.joda.time.Chronology chronology8 = julianChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.year();
        java.lang.String str11 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.weekOfWeekyear();
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = julianChronology0.set(readablePartial13, (-61039267200000L));
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
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str11, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        long long9 = julianChronology0.getDateTimeMillis((int) (byte) 1, (int) (byte) 10, (int) (byte) 10, (int) ' ');
        org.joda.time.DurationField durationField10 = julianChronology0.minutes();
        int int11 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.chrono.JulianChronology julianChronology12 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology12.weekyear();
        org.joda.time.DurationField durationField14 = julianChronology12.years();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = julianChronology12.add(readablePeriod15, (long) (-1), (int) (byte) 100);
        org.joda.time.chrono.JulianChronology julianChronology19 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean21 = julianChronology19.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField22 = julianChronology19.halfdayOfDay();
        org.joda.time.DurationField durationField23 = julianChronology19.millis();
        org.joda.time.DurationField durationField24 = julianChronology19.days();
        org.joda.time.DateTimeField dateTimeField25 = julianChronology19.yearOfCentury();
        boolean boolean26 = julianChronology12.equals((java.lang.Object) julianChronology19);
        org.joda.time.DateTimeField dateTimeField27 = julianChronology12.yearOfCentury();
        org.joda.time.Chronology chronology28 = julianChronology12.withUTC();
        org.joda.time.chrono.JulianChronology julianChronology29 = org.joda.time.chrono.JulianChronology.getInstance();
        long long33 = julianChronology29.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str34 = julianChronology29.toString();
        org.joda.time.chrono.JulianChronology julianChronology35 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField36 = julianChronology35.millisOfDay();
        org.joda.time.DateTimeField dateTimeField37 = julianChronology35.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone38 = julianChronology35.getZone();
        org.joda.time.Chronology chronology39 = julianChronology29.withZone(dateTimeZone38);
        org.joda.time.chrono.JulianChronology julianChronology40 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone38);
        org.joda.time.Chronology chronology41 = julianChronology12.withZone(dateTimeZone38);
        org.joda.time.chrono.JulianChronology julianChronology42 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone38);
        org.joda.time.chrono.JulianChronology julianChronology43 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone38);
        org.joda.time.Chronology chronology44 = julianChronology0.withZone(dateTimeZone38);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-62111404799968L) + "'", long9 == (-62111404799968L));
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(julianChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(julianChronology19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(julianChronology29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 98L + "'", long33 == 98L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str34, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(julianChronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(julianChronology40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(julianChronology42);
        org.junit.Assert.assertNotNull(julianChronology43);
        org.junit.Assert.assertNotNull(chronology44);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        org.joda.time.DateTimeField dateTimeField20 = julianChronology8.centuryOfEra();
        org.joda.time.Chronology chronology21 = julianChronology8.withUTC();
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
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
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
        long long21 = julianChronology7.getDateTimeMillis(0L, (int) (byte) 0, (int) (byte) 0, 0, (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
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
        long long21 = julianChronology0.add(0L, 250100L, (int) ' ');
        org.joda.time.DateTimeField dateTimeField22 = julianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField23 = julianChronology0.clockhourOfDay();
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 8003200L + "'", long21 == 8003200L);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.JulianChronology julianChronology1 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = julianChronology1.year();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology1.minuteOfDay();
        org.joda.time.DurationField durationField5 = julianChronology1.eras();
        org.junit.Assert.assertNotNull(julianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone6 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = julianChronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = julianChronology7.years();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = julianChronology7.get(readablePeriod10, 61001L, 899L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekyear();
        int int7 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.year();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = julianChronology0.getDateTimeMillis((int) '#', (int) 'a', 0, (int) 'a', (int) (byte) 100, 0, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
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
        org.joda.time.DateTimeField dateTimeField14 = julianChronology7.weekyear();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology7.millisOfSecond();
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
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = julianChronology0.months();
        org.joda.time.DurationField durationField7 = julianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology6.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = julianChronology6.getZone();
        org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = julianChronology9.add(readablePeriod10, (-59011632000100L), (int) (byte) 0);
        org.joda.time.DurationField durationField14 = julianChronology9.weekyears();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(julianChronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-59011632000100L) + "'", long13 == (-59011632000100L));
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone0, 1);
        org.joda.time.DurationField durationField3 = julianChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology2.dayOfMonth();
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
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
        org.joda.time.DateTimeZone dateTimeZone15 = julianChronology9.getZone();
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
        org.junit.Assert.assertNotNull(dateTimeZone15);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.year();
        org.joda.time.chrono.JulianChronology julianChronology8 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean10 = julianChronology8.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology8.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = julianChronology8.getZone();
        boolean boolean14 = julianChronology0.equals((java.lang.Object) dateTimeZone13);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(julianChronology8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = julianChronology0.days();
        org.joda.time.Chronology chronology5 = julianChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
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
        org.joda.time.DateTimeField dateTimeField18 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField19 = julianChronology0.hourOfDay();
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
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance();
        long long11 = julianChronology7.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str12 = julianChronology7.toString();
        org.joda.time.chrono.JulianChronology julianChronology13 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology13.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology13.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = julianChronology13.getZone();
        org.joda.time.Chronology chronology17 = julianChronology7.withZone(dateTimeZone16);
        org.joda.time.Chronology chronology18 = julianChronology0.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField19 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField20 = julianChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 98L + "'", long11 == 98L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str12, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(julianChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        java.lang.String str6 = julianChronology0.toString();
        org.joda.time.Chronology chronology7 = julianChronology0.withUTC();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str6, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = julianChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField6 = julianChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
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
        org.joda.time.ReadablePartial readablePartial18 = null;
        int[] intArray24 = new int[] { (byte) -1, (short) -1, '#', 4, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            julianChronology0.validate(readablePartial18, intArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1, 35, 4, -1]");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.era();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        org.joda.time.DurationField durationField16 = julianChronology0.halfdays();
        java.lang.Class<?> wildcardClass17 = julianChronology0.getClass();
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
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField8 = julianChronology0.seconds();
        org.joda.time.DurationField durationField9 = julianChronology0.weekyears();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = julianChronology6.halfdays();
        org.joda.time.DurationField durationField8 = julianChronology6.months();
        org.joda.time.DurationField durationField9 = julianChronology6.years();
        long long13 = julianChronology6.add(35014L, (-472799679798L), 0);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35014L + "'", long13 == 35014L);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = julianChronology0.months();
        org.joda.time.DurationField durationField9 = julianChronology0.millis();
        org.joda.time.DateTimeZone dateTimeZone10 = julianChronology0.getZone();
        org.joda.time.DurationField durationField11 = julianChronology0.seconds();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
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
        org.joda.time.DateTimeZone dateTimeZone13 = julianChronology0.getZone();
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
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = julianChronology0.getDateTimeMillis((int) (short) 10, (int) '4', 1, 4, (int) '4', (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = julianChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.weekOfWeekyear();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = julianChronology0.set(readablePartial9, 31466L);
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
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = julianChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = julianChronology0.add(readablePeriod9, (long) '4', (int) (short) 1);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        org.joda.time.DurationField durationField8 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = julianChronology0.seconds();
        org.joda.time.DurationField durationField11 = julianChronology0.years();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = julianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.millisOfDay();
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
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.hourOfHalfday();
        long long13 = julianChronology0.add(102L, (-4727996799L), 100);
        org.joda.time.DateTimeField dateTimeField14 = julianChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-472799679798L) + "'", long13 == (-472799679798L));
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = julianChronology0.getDateTimeMillis((int) ' ', (int) 'a', (int) (short) 10, (int) '#', 10, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
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
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = julianChronology0.millis();
        org.joda.time.Chronology chronology3 = julianChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = julianChronology0.getZone();
        org.joda.time.DurationField durationField6 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.secondOfMinute();
        java.lang.String str6 = julianChronology0.toString();
        org.joda.time.DurationField durationField7 = julianChronology0.months();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str6, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField7 = julianChronology0.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = julianChronology0.getDateTimeMillis(97L, (int) '#', (int) (short) 1, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
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
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfMinute();
        org.joda.time.Chronology chronology5 = julianChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.dayOfMonth();
        long long10 = julianChronology0.add(0L, 10L, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = julianChronology0.add(readablePeriod12, (long) (byte) 0, (int) (short) 0);
        org.joda.time.DurationField durationField16 = julianChronology0.seconds();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
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
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = julianChronology0.getZone();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = julianChronology0.get(readablePeriod17, 1663L);
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
        org.junit.Assert.assertNotNull(julianChronology9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
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
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField16 = julianChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology0.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = julianChronology0.getDateTimeMillis(1, (int) 'a', (-1), (int) (short) 1, (int) '4', (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
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
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.eras();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = julianChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.era();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
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
        org.joda.time.DateTimeField dateTimeField17 = julianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField18 = julianChronology0.centuryOfEra();
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
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance();
        long long7 = julianChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = julianChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = julianChronology3.days();
        boolean boolean11 = julianChronology0.equals((java.lang.Object) julianChronology3);
        org.joda.time.DurationField durationField12 = julianChronology3.weekyears();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
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
        org.joda.time.DateTimeField dateTimeField14 = julianChronology7.dayOfMonth();
        org.joda.time.chrono.JulianChronology julianChronology15 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology15.weekyear();
        org.joda.time.DurationField durationField17 = julianChronology15.years();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = julianChronology15.add(readablePeriod18, (long) (-1), (int) (byte) 100);
        org.joda.time.chrono.JulianChronology julianChronology22 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean24 = julianChronology22.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField25 = julianChronology22.halfdayOfDay();
        org.joda.time.DurationField durationField26 = julianChronology22.millis();
        org.joda.time.DurationField durationField27 = julianChronology22.days();
        org.joda.time.DateTimeField dateTimeField28 = julianChronology22.yearOfCentury();
        boolean boolean29 = julianChronology15.equals((java.lang.Object) julianChronology22);
        org.joda.time.chrono.JulianChronology julianChronology30 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField31 = julianChronology30.millisOfDay();
        org.joda.time.DurationField durationField32 = julianChronology30.seconds();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        long long36 = julianChronology30.add(readablePeriod33, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField37 = julianChronology30.secondOfDay();
        org.joda.time.Chronology chronology38 = julianChronology30.withUTC();
        boolean boolean39 = julianChronology15.equals((java.lang.Object) julianChronology30);
        org.joda.time.DurationField durationField40 = julianChronology30.hours();
        org.joda.time.DateTimeField dateTimeField41 = julianChronology30.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone42 = julianChronology30.getZone();
        org.joda.time.Chronology chronology43 = julianChronology7.withZone(dateTimeZone42);
        org.joda.time.DateTimeField dateTimeField44 = julianChronology7.dayOfMonth();
        int int45 = julianChronology7.getMinimumDaysInFirstWeek();
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
        org.junit.Assert.assertNotNull(julianChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(julianChronology22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(julianChronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.minuteOfHour();
        org.joda.time.Chronology chronology7 = julianChronology0.withUTC();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = julianChronology6.months();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology6.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology6.dayOfYear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = julianChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3501L + "'", long4 == 3501L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
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
        org.joda.time.DurationField durationField15 = julianChronology0.months();
        org.joda.time.DurationField durationField16 = julianChronology0.years();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DurationField durationField3 = julianChronology0.hours();
        org.joda.time.DurationField durationField4 = julianChronology0.weekyears();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = julianChronology0.get(readablePeriod15, 2501032L);
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
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance();
        long long11 = julianChronology7.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str12 = julianChronology7.toString();
        org.joda.time.chrono.JulianChronology julianChronology13 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology13.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology13.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = julianChronology13.getZone();
        org.joda.time.Chronology chronology17 = julianChronology7.withZone(dateTimeZone16);
        org.joda.time.Chronology chronology18 = julianChronology0.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField19 = julianChronology0.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long27 = julianChronology0.getDateTimeMillis((int) (byte) 10, (int) (byte) -1, 100, (int) (byte) -1, (int) (byte) 100, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 98L + "'", long11 == 98L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str12, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(julianChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.era();
        java.lang.Class<?> wildcardClass3 = dateTimeField2.getClass();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str5 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str5, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.minuteOfHour();
        org.joda.time.DurationField durationField7 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.millisOfSecond();
        java.lang.String str6 = julianChronology0.toString();
        org.joda.time.DurationField durationField7 = julianChronology0.millis();
        long long11 = julianChronology0.add((long) '#', 250100L, 0);
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.minuteOfDay();
        long long16 = julianChronology0.add((long) (short) 100, (long) 1, 1);
        org.joda.time.DateTimeZone dateTimeZone17 = julianChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField18 = julianChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str6, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 101L + "'", long16 == 101L);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.minuteOfDay();
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
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.DurationField durationField6 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.era();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.Chronology chronology3 = julianChronology0.withUTC();
        org.joda.time.DurationField durationField4 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = julianChronology0.months();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.hourOfDay();
        org.joda.time.DurationField durationField9 = julianChronology0.days();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = julianChronology0.add(readablePeriod1, (long) 0, 4);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField3 = julianChronology0.millis();
        org.joda.time.DurationField durationField4 = julianChronology0.seconds();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = julianChronology0.hours();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.dayOfYear();
        java.lang.String str7 = julianChronology0.toString();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        org.joda.time.DateTimeField dateTimeField21 = julianChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField22 = julianChronology0.clockhourOfDay();
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
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        long long9 = julianChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DurationField durationField10 = julianChronology0.weeks();
        org.joda.time.DateTimeZone dateTimeZone11 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology12 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone11);
        org.joda.time.chrono.JulianChronology julianChronology13 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone11);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = julianChronology13.getDateTimeMillis(3152100L, (-1), 0, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(julianChronology12);
        org.junit.Assert.assertNotNull(julianChronology13);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.millisOfSecond();
        org.joda.time.DurationField durationField6 = julianChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.era();
        org.joda.time.DurationField durationField8 = julianChronology0.seconds();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        long long10 = julianChronology0.add((long) '4', 0L, (int) (byte) 1);
        org.joda.time.DurationField durationField11 = julianChronology0.hours();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone0, 1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.weekyear();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = julianChronology2.add(readablePeriod4, 9700L, (int) '4');
        long long11 = julianChronology2.add((-59011632000000L), (long) (-1), 100);
        org.joda.time.ReadablePartial readablePartial12 = null;
        int[] intArray18 = new int[] { '4', 1, (short) 0, (short) 1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            julianChronology2.validate(readablePartial12, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9700L + "'", long7 == 9700L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-59011632000100L) + "'", long11 == (-59011632000100L));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[52, 1, 0, 1, -1]");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = julianChronology0.add(readablePeriod8, (long) '4', 1);
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField13 = julianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField5 = julianChronology0.hours();
        java.lang.Class<?> wildcardClass6 = julianChronology0.getClass();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField7 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.era();
        org.joda.time.DurationField durationField9 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.dayOfYear();
        org.joda.time.DurationField durationField11 = julianChronology0.hours();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField8 = julianChronology7.millis();
        org.joda.time.Chronology chronology9 = julianChronology7.withUTC();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
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
        org.joda.time.DurationField durationField20 = julianChronology8.seconds();
        org.joda.time.DateTimeField dateTimeField21 = julianChronology8.minuteOfHour();
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
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = julianChronology0.millis();
        org.joda.time.Chronology chronology3 = julianChronology0.withUTC();
        org.joda.time.chrono.JulianChronology julianChronology4 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology4.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology4.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = julianChronology4.getZone();
        org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone7, (int) (short) 1);
        org.joda.time.Chronology chronology10 = julianChronology0.withZone(dateTimeZone7);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(julianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(julianChronology9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        long long9 = julianChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DateTimeZone dateTimeZone10 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = julianChronology11.minuteOfDay();
        org.joda.time.DurationField durationField13 = julianChronology11.days();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(julianChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.DurationField durationField9 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.year();
        long long14 = julianChronology0.add((long) 0, 0L, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.dayOfYear();
        org.joda.time.DurationField durationField16 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField18 = julianChronology0.year();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str8, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = julianChronology0.hours();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.minuteOfDay();
        org.joda.time.DurationField durationField7 = julianChronology0.weekyears();
        org.joda.time.DurationField durationField8 = julianChronology0.seconds();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.monthOfYear();
        org.joda.time.DurationField durationField7 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.JulianChronology julianChronology16 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone14, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 10");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-47280066589999L) + "'", long13 == (-47280066589999L));
        org.junit.Assert.assertNotNull(dateTimeZone14);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = julianChronology0.hours();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.era();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = julianChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.centuryOfEra();
        org.joda.time.DurationField durationField11 = julianChronology0.centuries();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
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
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = julianChronology0.add(readablePeriod13, 10L, (int) '#');
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = julianChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = julianChronology0.days();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3501L + "'", long4 == 3501L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        java.lang.String str4 = julianChronology0.toString();
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = julianChronology0.set(readablePartial6, 500L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str4, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekyear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
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
        org.joda.time.DateTimeField dateTimeField14 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.secondOfMinute();
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
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = julianChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField7 = julianChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.millisOfSecond();
        org.joda.time.DurationField durationField9 = julianChronology0.eras();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3501L + "'", long4 == 3501L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
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
        org.joda.time.DateTimeField dateTimeField14 = julianChronology0.monthOfYear();
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
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance();
        long long7 = julianChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = julianChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = julianChronology3.days();
        boolean boolean11 = julianChronology0.equals((java.lang.Object) julianChronology3);
        org.joda.time.DateTimeField dateTimeField12 = julianChronology3.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology3.millisOfDay();
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
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
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
        org.joda.time.DateTimeField dateTimeField21 = julianChronology0.dayOfMonth();
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
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = julianChronology9.year();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology9.millisOfSecond();
        java.lang.String str12 = julianChronology9.toString();
        org.joda.time.DateTimeZone dateTimeZone13 = julianChronology9.getZone();
        org.joda.time.chrono.JulianChronology julianChronology14 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone13);
        org.joda.time.chrono.JulianChronology julianChronology15 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone13);
        org.joda.time.Chronology chronology16 = julianChronology0.withZone(dateTimeZone13);
        org.joda.time.DurationField durationField17 = julianChronology0.years();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(julianChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str12, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(julianChronology14);
        org.junit.Assert.assertNotNull(julianChronology15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance();
        long long11 = julianChronology7.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str12 = julianChronology7.toString();
        org.joda.time.chrono.JulianChronology julianChronology13 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology13.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology13.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = julianChronology13.getZone();
        org.joda.time.Chronology chronology17 = julianChronology7.withZone(dateTimeZone16);
        org.joda.time.Chronology chronology18 = julianChronology0.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField19 = julianChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 98L + "'", long11 == 98L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str12, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(julianChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        java.lang.String str5 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str5, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = julianChronology6.halfdays();
        org.joda.time.DurationField durationField8 = julianChronology6.months();
        org.joda.time.DurationField durationField9 = julianChronology6.years();
        org.joda.time.Chronology chronology10 = julianChronology6.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology6.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology6.millisOfDay();
        org.joda.time.DurationField durationField13 = julianChronology6.seconds();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = julianChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekyear();
        int int7 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.centuryOfEra();
        long long12 = julianChronology0.add((long) (short) -1, (-47280066589999L), (int) (short) 10);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-472800665899991L) + "'", long12 == (-472800665899991L));
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
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
        org.joda.time.DurationField durationField11 = julianChronology0.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = julianChronology0.getDateTimeMillis((int) (byte) 100, (int) (short) -1, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
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
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        long long10 = julianChronology0.getDateTimeMillis((int) (byte) 100, 1, (int) (short) 1, 0);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.year();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-59011632000000L) + "'", long10 == (-59011632000000L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
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
        org.joda.time.ReadablePartial readablePartial23 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long25 = julianChronology0.set(readablePartial23, 35014L);
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
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.minuteOfHour();
        org.joda.time.DurationField durationField7 = julianChronology0.centuries();
        org.joda.time.DurationField durationField8 = julianChronology0.centuries();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
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
        org.joda.time.DurationField durationField11 = julianChronology0.hours();
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
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = julianChronology0.add(readablePeriod2, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.centuryOfEra();
        org.joda.time.DurationField durationField8 = julianChronology0.seconds();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
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
        org.joda.time.DateTimeField dateTimeField17 = julianChronology0.era();
        org.joda.time.DateTimeField dateTimeField18 = julianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = julianChronology0.millisOfSecond();
        org.joda.time.DurationField durationField20 = julianChronology0.weekyears();
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
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
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
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = julianChronology0.add(readablePeriod16, (long) '4', (int) (short) -1);
        org.joda.time.DateTimeField dateTimeField20 = julianChronology0.secondOfDay();
        org.joda.time.DurationField durationField21 = julianChronology0.weekyears();
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        java.lang.String str4 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone6);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str4, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(julianChronology7);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.DurationField durationField9 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.year();
        long long14 = julianChronology0.add((long) 0, 0L, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str8, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        java.lang.String str4 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str4, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = julianChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField9 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3501L + "'", long4 == 3501L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        java.lang.String str5 = julianChronology0.toString();
        org.joda.time.Chronology chronology6 = julianChronology0.withUTC();
        org.joda.time.DurationField durationField7 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str5, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
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
        org.joda.time.DurationField durationField14 = julianChronology7.halfdays();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology7.minuteOfDay();
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
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = julianChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.minuteOfDay();
        org.joda.time.DurationField durationField12 = julianChronology0.weekyears();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
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
        org.joda.time.DurationField durationField10 = julianChronology0.hours();
        org.joda.time.DurationField durationField11 = julianChronology0.millis();
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
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        org.joda.time.DurationField durationField8 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.hourOfDay();
        org.joda.time.DurationField durationField11 = julianChronology0.months();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
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
        org.joda.time.DurationField durationField18 = julianChronology0.weekyears();
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
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField7 = julianChronology0.weekyears();
        org.joda.time.DurationField durationField8 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField11 = julianChronology0.months();
        org.junit.Assert.assertNotNull(julianChronology0);
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
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        java.lang.String str4 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.monthOfYear();
        org.joda.time.DurationField durationField7 = julianChronology0.weeks();
        org.joda.time.chrono.JulianChronology julianChronology8 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology8.secondOfMinute();
        int int12 = julianChronology8.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology8.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone14 = julianChronology8.getZone();
        org.joda.time.Chronology chronology15 = julianChronology0.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = julianChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str4, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(julianChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = julianChronology0.add(readablePeriod2, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.millisOfSecond();
        long long11 = julianChronology0.add(1L, (long) (short) 0, 10);
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone6 = julianChronology0.getZone();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = julianChronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology6.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology6.year();
        org.joda.time.DurationField durationField10 = julianChronology6.hours();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.millisOfDay();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = julianChronology0.get(readablePartial10, 8003200L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.yearOfCentury();
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean9 = julianChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = julianChronology7.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = julianChronology7.getZone();
        org.joda.time.chrono.JulianChronology julianChronology12 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone11);
        org.joda.time.Chronology chronology13 = julianChronology0.withZone(dateTimeZone11);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(julianChronology12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        org.joda.time.DurationField durationField15 = julianChronology0.halfdays();
        org.joda.time.Chronology chronology16 = julianChronology0.withUTC();
        org.joda.time.DurationField durationField17 = julianChronology0.millis();
        org.joda.time.DurationField durationField18 = julianChronology0.millis();
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
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        org.joda.time.DateTimeField dateTimeField13 = julianChronology8.year();
        java.lang.String str14 = julianChronology8.toString();
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
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str14, "JulianChronology[Etc/UTC]");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField8 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = julianChronology0.getZone();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = julianChronology0.add(readablePeriod11, (long) (short) 10, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.era();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        java.lang.String str5 = julianChronology0.toString();
        org.joda.time.Chronology chronology6 = julianChronology0.withUTC();
        org.joda.time.DurationField durationField7 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str5, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
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
        org.joda.time.DurationField durationField14 = julianChronology7.months();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology7.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology7.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology7.millisOfDay();
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
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = julianChronology0.days();
        org.joda.time.chrono.JulianChronology julianChronology8 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology8.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology8.hourOfHalfday();
        org.joda.time.DurationField durationField12 = julianChronology8.days();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology8.minuteOfDay();
        org.joda.time.DurationField durationField14 = julianChronology8.millis();
        boolean boolean15 = julianChronology0.equals((java.lang.Object) julianChronology8);
        org.joda.time.DateTimeField dateTimeField16 = julianChronology8.secondOfMinute();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(julianChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = julianChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.era();
        org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology9.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Chronology chronology12 = julianChronology9.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = julianChronology9.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology9.minuteOfHour();
        org.joda.time.DurationField durationField15 = julianChronology9.days();
        boolean boolean16 = julianChronology0.equals((java.lang.Object) julianChronology9);
        int int17 = julianChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(julianChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField3 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.weekyear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
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
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = julianChronology0.getZone();
        org.joda.time.DurationField durationField6 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = julianChronology0.millis();
        org.joda.time.DurationField durationField9 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.minuteOfHour();
        org.joda.time.Chronology chronology11 = julianChronology0.withUTC();
        org.joda.time.DurationField durationField12 = julianChronology0.centuries();
        org.joda.time.DurationField durationField13 = julianChronology0.halfdays();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.secondOfMinute();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        java.lang.String str5 = julianChronology0.toString();
        org.joda.time.DurationField durationField6 = julianChronology0.eras();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str5, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.DurationField durationField9 = julianChronology0.minutes();
        org.joda.time.DurationField durationField10 = julianChronology0.halfdays();
        org.joda.time.DurationField durationField11 = julianChronology0.seconds();
        org.joda.time.DurationField durationField12 = julianChronology0.seconds();
        org.joda.time.DurationField durationField13 = julianChronology0.weeks();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str8, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
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
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = julianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.millisOfSecond();
        java.lang.String str11 = julianChronology0.toString();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str11, "JulianChronology[Etc/UTC]");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = julianChronology0.months();
        org.joda.time.DurationField durationField7 = julianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
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
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.minuteOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.monthOfYear();
        org.joda.time.DurationField durationField4 = julianChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
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
        org.joda.time.chrono.JulianChronology julianChronology18 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone14, 1);
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
        org.junit.Assert.assertNotNull(julianChronology18);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.minuteOfHour();
        org.joda.time.DurationField durationField4 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = julianChronology0.getDateTimeMillis((int) (short) 100, 100, (int) (byte) -1, (int) (byte) 10, (int) '4', (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
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
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology0.secondOfMinute();
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
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
        org.joda.time.DurationField durationField12 = julianChronology10.months();
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
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField8 = julianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.Chronology chronology3 = julianChronology0.withUTC();
        int int4 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.minuteOfDay();
        org.joda.time.DurationField durationField7 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology10.year();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology10.millisOfSecond();
        java.lang.String str13 = julianChronology10.toString();
        org.joda.time.DateTimeZone dateTimeZone14 = julianChronology10.getZone();
        org.joda.time.chrono.JulianChronology julianChronology15 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone14);
        org.joda.time.Chronology chronology16 = julianChronology0.withZone(dateTimeZone14);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str13, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(julianChronology15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = julianChronology0.getDateTimeMillis((-59081875195999L), (int) 'a', 4, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.halfdayOfDay();
        java.lang.String str6 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekyear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str6, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.era();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.DurationField durationField9 = julianChronology0.minutes();
        org.joda.time.DurationField durationField10 = julianChronology0.halfdays();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = julianChronology0.add(readablePeriod11, (-59011632000100L), (int) (short) 1);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str8, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-59011632000100L) + "'", long14 == (-59011632000100L));
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField7 = julianChronology0.hours();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
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
        org.joda.time.DurationField durationField16 = julianChronology0.halfdays();
        int int17 = julianChronology0.getMinimumDaysInFirstWeek();
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
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.millisOfSecond();
        java.lang.String str6 = julianChronology0.toString();
        org.joda.time.DurationField durationField7 = julianChronology0.millis();
        long long11 = julianChronology0.add((long) '#', 250100L, 0);
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = julianChronology0.add(readablePeriod13, (-4727996799L), (int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = julianChronology0.add(readablePeriod17, 36001035L, 0);
        org.joda.time.DateTimeField dateTimeField21 = julianChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str6, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-4727996799L) + "'", long16 == (-4727996799L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 36001035L + "'", long20 == 36001035L);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
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
        org.joda.time.DurationField durationField30 = julianChronology0.millis();
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
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.centuryOfEra();
        int int10 = julianChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = julianChronology6.getZone();
        org.joda.time.Chronology chronology8 = julianChronology0.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
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
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology0.era();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.yearOfEra();
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
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
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
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology0.millisOfDay();
        org.joda.time.ReadablePartial readablePartial18 = null;
        int[] intArray24 = new int[] { (byte) 10, 100, 100, (byte) 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            julianChronology0.validate(readablePartial18, intArray24);
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
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 100, 100, 1, 10]");
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = julianChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone4 = julianChronology0.getZone();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.year();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.DateTimeZone dateTimeZone9 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone9, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField12 = julianChronology11.dayOfWeek();
        org.joda.time.DurationField durationField13 = julianChronology11.minutes();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = julianChronology11.add(readablePeriod14, 10L, 1);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str8, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(julianChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = julianChronology0.days();
        long long11 = julianChronology0.add((long) (byte) 1, (long) (short) 100, (int) '#');
        org.joda.time.DurationField durationField12 = julianChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology0.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = julianChronology0.get(readablePeriod17, (long) (short) 10, (-472799678798L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3501L + "'", long11 == 3501L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = julianChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(julianChronology7);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = julianChronology0.halfdays();
        org.joda.time.DurationField durationField4 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.minuteOfDay();
        org.joda.time.DurationField durationField7 = julianChronology0.hours();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
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
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.halfdayOfDay();
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
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
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
        org.joda.time.chrono.JulianChronology julianChronology14 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean16 = julianChronology14.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField17 = julianChronology14.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = julianChronology14.getZone();
        org.joda.time.chrono.JulianChronology julianChronology19 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone18);
        org.joda.time.Chronology chronology20 = julianChronology7.withZone(dateTimeZone18);
        org.joda.time.ReadablePartial readablePartial21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = julianChronology7.get(readablePartial21, (-47279968L));
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(julianChronology19);
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.year();
        org.joda.time.DurationField durationField10 = julianChronology0.centuries();
        java.lang.String str11 = julianChronology0.toString();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str11, "JulianChronology[Etc/UTC]");
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
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
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology0.weekyearOfCentury();
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
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
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
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField16 = julianChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField18 = julianChronology0.weekOfWeekyear();
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
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
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
        org.joda.time.DateTimeField dateTimeField25 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField26 = julianChronology0.hourOfDay();
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
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DurationField durationField3 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.DurationField durationField3 = julianChronology0.centuries();
        org.joda.time.DurationField durationField4 = julianChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.yearOfEra();
        int int7 = julianChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        long long9 = julianChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DurationField durationField10 = julianChronology0.weeks();
        org.joda.time.DurationField durationField11 = julianChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        java.lang.String str5 = julianChronology0.toString();
        org.joda.time.Chronology chronology6 = julianChronology0.withUTC();
        org.joda.time.DurationField durationField7 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str5, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone0, 1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology2.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = julianChronology2.getZone();
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = julianChronology0.halfdays();
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean9 = julianChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = julianChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology7.monthOfYear();
        boolean boolean12 = julianChronology0.equals((java.lang.Object) julianChronology7);
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.secondOfDay();
        java.lang.Class<?> wildcardClass14 = julianChronology0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.minuteOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.centuryOfEra();
        org.joda.time.DurationField durationField5 = julianChronology0.eras();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str5 = julianChronology0.toString();
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology6.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology6.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = julianChronology6.getZone();
        org.joda.time.Chronology chronology10 = julianChronology0.withZone(dateTimeZone9);
        org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone9);
        org.joda.time.chrono.JulianChronology julianChronology13 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone9, (int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = julianChronology13.add(readablePeriod14, 899L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField18 = julianChronology13.hourOfHalfday();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str5, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(julianChronology11);
        org.junit.Assert.assertNotNull(julianChronology13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 899L + "'", long17 == 899L);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = julianChronology0.add(readablePeriod2, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField11 = julianChronology0.months();
        org.joda.time.DurationField durationField12 = julianChronology0.minutes();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        java.lang.String str4 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField6 = julianChronology0.weekyears();
        long long10 = julianChronology0.add(2501032L, 97L, 0);
        org.joda.time.DurationField durationField11 = julianChronology0.centuries();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str4, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2501032L + "'", long10 == 2501032L);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.millisOfSecond();
        java.lang.String str6 = julianChronology0.toString();
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology7.weekyear();
        org.joda.time.DurationField durationField9 = julianChronology7.years();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology7.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology7.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology7.hourOfHalfday();
        org.joda.time.DurationField durationField13 = julianChronology7.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology7.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone15 = julianChronology7.getZone();
        org.joda.time.Chronology chronology16 = julianChronology0.withZone(dateTimeZone15);
        org.joda.time.DurationField durationField17 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField18 = julianChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str6, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.millisOfSecond();
        org.joda.time.DurationField durationField6 = julianChronology0.minutes();
        org.joda.time.DurationField durationField7 = julianChronology0.hours();
        org.joda.time.DurationField durationField8 = julianChronology0.weekyears();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        org.joda.time.DurationField durationField8 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.hourOfDay();
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = julianChronology0.set(readablePartial11, 3152100L);
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
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.year();
        int int7 = julianChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.dayOfYear();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = julianChronology0.get(readablePartial6, 67L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
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
        org.joda.time.DurationField durationField15 = julianChronology0.weekyears();
        org.joda.time.DurationField durationField16 = julianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology0.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = julianChronology0.get(readablePeriod18, 25009383L);
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
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.yearOfCentury();
        int int10 = julianChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        long long9 = julianChronology0.getDateTimeMillis((int) (byte) 1, (int) (byte) 10, (int) (byte) 10, (int) ' ');
        org.joda.time.DurationField durationField10 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-62111404799968L) + "'", long9 == (-62111404799968L));
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.minuteOfHour();
        org.joda.time.DurationField durationField9 = julianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.weekOfWeekyear();
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
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.dayOfMonth();
        org.joda.time.DurationField durationField3 = julianChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DurationField durationField3 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.weekyearOfCentury();
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance();
        long long10 = julianChronology6.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField11 = julianChronology6.weekyears();
        org.joda.time.DateTimeZone dateTimeZone12 = julianChronology6.getZone();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology6.era();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology6.minuteOfDay();
        boolean boolean15 = julianChronology0.equals((java.lang.Object) julianChronology6);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 98L + "'", long10 == 98L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        java.lang.String str5 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.millisOfSecond();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = julianChronology0.get(readablePartial10, (-99L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str5, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekyearOfCentury();
        long long13 = julianChronology0.getDateTimeMillis(9L, 10, (int) (short) 0, (int) (byte) 1, (int) '#');
        org.joda.time.DurationField durationField14 = julianChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone15 = julianChronology0.getZone();
        org.joda.time.DurationField durationField16 = julianChronology0.weekyears();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 36001035L + "'", long13 == 36001035L);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = julianChronology0.getZone();
        org.joda.time.DurationField durationField6 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.millisOfSecond();
        org.joda.time.DurationField durationField12 = julianChronology0.years();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.era();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField7 = julianChronology0.weekyears();
        org.joda.time.DurationField durationField8 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.hourOfHalfday();
        int int11 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(julianChronology0);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
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
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = julianChronology0.add(readablePeriod16, (-1L), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField20 = julianChronology0.minuteOfDay();
        org.joda.time.ReadablePartial readablePartial21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = julianChronology0.get(readablePartial21, (-59011632000100L));
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = julianChronology0.hours();
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.Chronology chronology6 = julianChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField11 = julianChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.halfdayOfDay();
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
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.millisOfSecond();
        java.lang.String str6 = julianChronology0.toString();
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology7.weekyear();
        org.joda.time.DurationField durationField9 = julianChronology7.years();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology7.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology7.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology7.hourOfHalfday();
        org.joda.time.DurationField durationField13 = julianChronology7.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology7.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone15 = julianChronology7.getZone();
        org.joda.time.Chronology chronology16 = julianChronology0.withZone(dateTimeZone15);
        org.joda.time.DurationField durationField17 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField18 = julianChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str6, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField8 = julianChronology7.millis();
        org.joda.time.DurationField durationField9 = julianChronology7.weekyears();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = julianChronology7.add(readablePeriod10, 100L, (int) (short) -1);
        org.joda.time.chrono.JulianChronology julianChronology14 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology14.hourOfDay();
        org.joda.time.chrono.JulianChronology julianChronology17 = org.joda.time.chrono.JulianChronology.getInstance();
        long long21 = julianChronology17.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField22 = julianChronology17.weekyears();
        org.joda.time.DateTimeField dateTimeField23 = julianChronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField24 = julianChronology17.days();
        boolean boolean25 = julianChronology14.equals((java.lang.Object) julianChronology17);
        org.joda.time.DateTimeZone dateTimeZone26 = julianChronology17.getZone();
        org.joda.time.chrono.JulianChronology julianChronology28 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone26, (int) (byte) 1);
        org.joda.time.Chronology chronology29 = julianChronology7.withZone(dateTimeZone26);
        org.joda.time.chrono.JulianChronology julianChronology30 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone26);
        org.joda.time.DurationField durationField31 = julianChronology30.years();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(julianChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(julianChronology17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 98L + "'", long21 == 98L);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(julianChronology28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(julianChronology30);
        org.junit.Assert.assertNotNull(durationField31);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str5 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = julianChronology0.getDateTimeMillis((int) (byte) 100, (int) (short) -1, 1, (int) 'a', 1, 4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str5, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.era();
        org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology9.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Chronology chronology12 = julianChronology9.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = julianChronology9.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology9.minuteOfHour();
        org.joda.time.DurationField durationField15 = julianChronology9.days();
        boolean boolean16 = julianChronology0.equals((java.lang.Object) julianChronology9);
        org.joda.time.DurationField durationField17 = julianChronology0.weeks();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(julianChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
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
        org.joda.time.DateTimeField dateTimeField16 = julianChronology7.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology7.year();
        org.joda.time.DateTimeField dateTimeField18 = julianChronology7.year();
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
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.JulianChronology julianChronology1 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = julianChronology1.year();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology1.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone4 = julianChronology1.getZone();
        long long8 = julianChronology1.add((long) '#', 899L, (int) (byte) 10);
        org.junit.Assert.assertNotNull(julianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9025L + "'", long8 == 9025L);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = julianChronology0.halfdays();
        org.joda.time.DurationField durationField7 = julianChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.dayOfMonth();
        org.joda.time.DurationField durationField9 = julianChronology0.minutes();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekOfWeekyear();
        org.joda.time.Chronology chronology8 = julianChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = julianChronology6.halfdays();
        org.joda.time.DurationField durationField8 = julianChronology6.seconds();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology6.secondOfMinute();
        org.joda.time.DurationField durationField10 = julianChronology6.seconds();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology6.weekyear();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology6.dayOfMonth();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
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
        org.joda.time.DurationField durationField14 = julianChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.weekyear();
        org.joda.time.ReadablePartial readablePartial16 = null;
        int[] intArray23 = new int[] { 'a', 'a', 0, ' ', (short) 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            julianChronology0.validate(readablePartial16, intArray23);
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
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, 97, 0, 32, 10, 1]");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
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
        org.joda.time.DurationField durationField11 = julianChronology0.minutes();
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
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.secondOfMinute();
        java.lang.String str4 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str4, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        long long9 = julianChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DurationField durationField10 = julianChronology0.weeks();
        org.joda.time.DurationField durationField11 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = julianChronology0.add(readablePeriod12, 101L, (int) (byte) 10);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 101L + "'", long15 == 101L);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        long long9 = julianChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DurationField durationField10 = julianChronology0.weeks();
        org.joda.time.DurationField durationField11 = julianChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.dayOfYear();
        java.lang.String str13 = julianChronology0.toString();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str13, "JulianChronology[Etc/UTC]");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.year();
        org.joda.time.DurationField durationField5 = julianChronology0.millis();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        java.lang.String str5 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.year();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str5, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField9 = julianChronology0.eras();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.millisOfSecond();
        java.lang.String str6 = julianChronology0.toString();
        org.joda.time.DurationField durationField7 = julianChronology0.millis();
        int int8 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.weekyear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str6, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.DurationField durationField9 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.weekOfWeekyear();
        org.joda.time.Chronology chronology11 = julianChronology0.withUTC();
        org.joda.time.DurationField durationField12 = julianChronology0.months();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str8, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.yearOfEra();
        org.joda.time.Chronology chronology5 = julianChronology0.withUTC();
        org.joda.time.DurationField durationField6 = julianChronology0.days();
        org.joda.time.DurationField durationField7 = julianChronology0.seconds();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekyearOfCentury();
        long long13 = julianChronology0.getDateTimeMillis(9L, 10, (int) (short) 0, (int) (byte) 1, (int) '#');
        org.joda.time.DurationField durationField14 = julianChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone15 = julianChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 36001035L + "'", long13 == 36001035L);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.DurationField durationField9 = julianChronology0.minutes();
        org.joda.time.DurationField durationField10 = julianChronology0.halfdays();
        org.joda.time.Chronology chronology11 = julianChronology0.withUTC();
        org.joda.time.DurationField durationField12 = julianChronology0.years();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str8, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = julianChronology0.add(readablePeriod8, (long) '4', 1);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = julianChronology0.getDateTimeMillis((-59011372800000L), (int) (byte) -1, (int) (short) 0, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField8 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.weekOfWeekyear();
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
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField6 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.secondOfMinute();
        org.joda.time.DurationField durationField9 = julianChronology0.seconds();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = julianChronology0.getDateTimeMillis(97L, 1, 1, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = julianChronology0.add(readablePeriod8, (long) '4', 1);
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = julianChronology0.getDateTimeMillis((int) (byte) 1, 1, (int) (short) 10, 0, (int) '4', (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = julianChronology0.days();
        long long11 = julianChronology0.add((long) (byte) 1, (long) (short) 100, (int) '#');
        org.joda.time.DurationField durationField12 = julianChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.year();
        org.joda.time.DurationField durationField16 = julianChronology0.centuries();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3501L + "'", long11 == 3501L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = julianChronology0.halfdays();
        org.joda.time.DurationField durationField7 = julianChronology0.centuries();
        org.joda.time.DurationField durationField8 = julianChronology0.weekyears();
        org.joda.time.DurationField durationField9 = julianChronology0.hours();
        org.joda.time.ReadablePartial readablePartial10 = null;
        int[] intArray11 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            julianChronology0.validate(readablePartial10, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
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
        org.joda.time.DurationField durationField15 = julianChronology0.halfdays();
        org.joda.time.Chronology chronology16 = julianChronology0.withUTC();
        org.joda.time.DurationField durationField17 = julianChronology0.halfdays();
        int int18 = julianChronology0.getMinimumDaysInFirstWeek();
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
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = julianChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Chronology chronology6 = julianChronology0.withZone(dateTimeZone5);
        int int7 = julianChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekyear();
        int int7 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField8 = julianChronology0.weekyears();
        long long12 = julianChronology0.add((long) (byte) 10, 102L, (int) ' ');
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3274L + "'", long12 == 3274L);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = julianChronology0.centuries();
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
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = julianChronology0.weeks();
        org.joda.time.DurationField durationField8 = julianChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.era();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        java.lang.String str6 = julianChronology0.toString();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str6, "JulianChronology[Etc/UTC]");
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
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
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = julianChronology0.getDateTimeMillis(250100L, (int) (short) 100, 100, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.minuteOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.halfdays();
        org.joda.time.DurationField durationField3 = julianChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, 0L, (int) '#');
        org.joda.time.DurationField durationField7 = julianChronology0.eras();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = julianChronology0.millis();
        int int3 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField5 = julianChronology0.weeks();
        org.joda.time.DurationField durationField6 = julianChronology0.weeks();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = julianChronology0.hours();
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DurationField durationField6 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = julianChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = julianChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField13 = julianChronology0.years();
        org.joda.time.DurationField durationField14 = julianChronology0.millis();
        org.joda.time.DurationField durationField15 = julianChronology0.halfdays();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = julianChronology0.weekyears();
        long long14 = julianChronology0.getDateTimeMillis(52L, 0, 4, (int) (short) 10, (int) (short) 100);
        org.joda.time.DurationField durationField15 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField17 = julianChronology0.hours();
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
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekyear();
        int int7 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.halfdayOfDay();
        org.joda.time.chrono.JulianChronology julianChronology12 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology12.millisOfDay();
        org.joda.time.DurationField durationField15 = julianChronology12.years();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology12.clockhourOfHalfday();
        boolean boolean17 = julianChronology0.equals((java.lang.Object) julianChronology12);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(julianChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = julianChronology0.eras();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = julianChronology0.getZone();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        java.lang.String str6 = julianChronology0.toString();
        org.joda.time.DateTimeZone dateTimeZone7 = julianChronology0.getZone();
        org.joda.time.DurationField durationField8 = julianChronology0.millis();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str6, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = julianChronology6.getZone();
        org.joda.time.Chronology chronology8 = julianChronology0.withZone(dateTimeZone7);
        org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField10 = julianChronology9.millisOfSecond();
        org.joda.time.DurationField durationField11 = julianChronology9.seconds();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology9.dayOfYear();
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
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.yearOfCentury();
        org.joda.time.DurationField durationField5 = julianChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.hourOfHalfday();
        org.joda.time.ReadablePartial readablePartial7 = null;
        int[] intArray10 = new int[] { (short) 0, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            julianChronology0.validate(readablePartial7, intArray10);
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
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, -1]");
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
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
        org.joda.time.DateTimeField dateTimeField26 = julianChronology15.year();
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
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = julianChronology0.millis();
        int int3 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField5 = julianChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
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
        org.joda.time.DurationField durationField14 = julianChronology7.halfdays();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology7.weekyear();
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
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        java.lang.String str3 = julianChronology0.toString();
        org.joda.time.DurationField durationField4 = julianChronology0.weekyears();
        org.joda.time.ReadablePartial readablePartial5 = null;
        int[] intArray11 = new int[] { (byte) 0, (byte) 10, (short) -1, (short) 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            julianChronology0.validate(readablePartial5, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str3, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10, -1, 10, 0]");
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.era();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (-1), (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = julianChronology0.getDateTimeMillis(0, (int) (short) 100, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = julianChronology0.halfdays();
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean9 = julianChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = julianChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology7.monthOfYear();
        boolean boolean12 = julianChronology0.equals((java.lang.Object) julianChronology7);
        org.joda.time.DurationField durationField13 = julianChronology0.weekyears();
        org.joda.time.chrono.JulianChronology julianChronology14 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology14.millisOfDay();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology14.millisOfSecond();
        java.lang.String str17 = julianChronology14.toString();
        org.joda.time.DurationField durationField18 = julianChronology14.months();
        boolean boolean19 = julianChronology0.equals((java.lang.Object) durationField18);
        org.joda.time.DateTimeField dateTimeField20 = julianChronology0.minuteOfDay();
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
        org.junit.Assert.assertNotNull(julianChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str17, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.yearOfCentury();
        org.joda.time.DurationField durationField11 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = julianChronology0.add(readablePeriod6, 52L, (int) (byte) 10);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        long long9 = julianChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
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
        org.joda.time.DateTimeField dateTimeField18 = julianChronology0.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = julianChronology0.get(readablePeriod19, 10L, 3152100L);
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
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
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
        org.joda.time.DateTimeField dateTimeField14 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField15 = julianChronology0.centuries();
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
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
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
        org.joda.time.DateTimeZone dateTimeZone16 = julianChronology0.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.JulianChronology julianChronology18 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone16, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        long long10 = julianChronology0.getDateTimeMillis((int) (byte) 100, 1, (int) (short) 1, 0);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField13 = julianChronology0.eras();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-59011632000000L) + "'", long10 == (-59011632000000L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = julianChronology0.add(readablePeriod7, 0L, (int) 'a');
        org.joda.time.DurationField durationField11 = julianChronology0.halfdays();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = julianChronology0.add(readablePeriod1, (long) 0, 4);
        org.joda.time.Chronology chronology5 = julianChronology0.withUTC();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        long long9 = julianChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DateTimeZone dateTimeZone10 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = julianChronology11.months();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(julianChronology11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
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
        org.joda.time.DateTimeField dateTimeField14 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField15 = julianChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology0.yearOfCentury();
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
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
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
        org.joda.time.DateTimeZone dateTimeZone16 = julianChronology0.getZone();
        org.joda.time.DurationField durationField17 = julianChronology0.months();
        org.joda.time.DurationField durationField18 = julianChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField19 = julianChronology0.dayOfWeek();
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
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.eras();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance();
        long long7 = julianChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = julianChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = julianChronology3.days();
        boolean boolean11 = julianChronology0.equals((java.lang.Object) julianChronology3);
        org.joda.time.DurationField durationField12 = julianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekyear();
        int int7 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = julianChronology0.weeks();
        org.joda.time.DurationField durationField8 = julianChronology0.weeks();
        long long12 = julianChronology0.add((long) (byte) 1, (-938L), (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.weekyear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-937L) + "'", long12 == (-937L));
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.chrono.JulianChronology julianChronology4 = org.joda.time.chrono.JulianChronology.getInstance();
        long long8 = julianChronology4.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str9 = julianChronology4.toString();
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology10.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = julianChronology10.getZone();
        org.joda.time.Chronology chronology14 = julianChronology4.withZone(dateTimeZone13);
        org.joda.time.chrono.JulianChronology julianChronology15 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone13);
        org.joda.time.chrono.JulianChronology julianChronology17 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone13, (int) (byte) 1);
        org.joda.time.Chronology chronology18 = julianChronology0.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField19 = julianChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(julianChronology4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str9, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(julianChronology15);
        org.junit.Assert.assertNotNull(julianChronology17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
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
        org.joda.time.DateTimeField dateTimeField15 = julianChronology14.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology14.hourOfDay();
        org.joda.time.Chronology chronology17 = julianChronology14.withUTC();
        org.joda.time.DurationField durationField18 = julianChronology14.weeks();
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
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
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
        org.joda.time.DateTimeField dateTimeField16 = julianChronology0.hourOfHalfday();
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
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone6 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = julianChronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = julianChronology7.years();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology7.yearOfEra();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.Chronology chronology3 = julianChronology0.withUTC();
        int int4 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = julianChronology0.eras();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekOfWeekyear();
        org.joda.time.Chronology chronology8 = julianChronology0.withUTC();
        org.joda.time.DurationField durationField9 = julianChronology0.months();
        long long13 = julianChronology0.add(100L, (-472799679798L), (int) 'a');
        org.joda.time.DurationField durationField14 = julianChronology0.millis();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-45861568940306L) + "'", long13 == (-45861568940306L));
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.era();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.hourOfDay();
        org.joda.time.DurationField durationField8 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField10 = julianChronology0.years();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
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
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField12 = julianChronology0.hours();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = julianChronology0.get(readablePeriod13, (-83278990L), (-472799678798L));
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
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        java.lang.String str5 = julianChronology0.toString();
        org.joda.time.Chronology chronology6 = julianChronology0.withUTC();
        org.joda.time.DurationField durationField7 = julianChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = julianChronology0.minutes();
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology10.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.Chronology chronology13 = julianChronology10.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = julianChronology10.seconds();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology10.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology10.hourOfHalfday();
        org.joda.time.DurationField durationField17 = julianChronology10.centuries();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = julianChronology10.add(readablePeriod18, (-61001L), 4);
        boolean boolean22 = julianChronology0.equals((java.lang.Object) 4);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str5, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-61001L) + "'", long21 == (-61001L));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = julianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = julianChronology0.months();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = julianChronology0.getDateTimeMillis(0, 0, (int) ' ', 1, 10, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
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
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.hourOfDay();
        org.joda.time.DurationField durationField16 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology0.weekOfWeekyear();
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
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
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
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.millisOfDay();
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
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        java.lang.String str4 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.millisOfDay();
        int int6 = julianChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str4, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
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
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
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
        org.joda.time.DateTimeField dateTimeField16 = julianChronology0.dayOfWeek();
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
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = julianChronology0.getZone();
        org.joda.time.DurationField durationField7 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.dayOfWeek();
        int int9 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.halfdayOfDay();
        java.lang.String str10 = julianChronology0.toString();
        org.joda.time.DurationField durationField11 = julianChronology0.seconds();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str10, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.secondOfDay();
        org.joda.time.Chronology chronology8 = julianChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.clockhourOfHalfday();
        int int10 = julianChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone6);
        org.joda.time.chrono.JulianChronology julianChronology8 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone6);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(julianChronology8);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.halfdayOfDay();
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean9 = julianChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = julianChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology7.yearOfCentury();
        org.joda.time.DurationField durationField12 = julianChronology7.years();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology7.dayOfYear();
        boolean boolean14 = julianChronology0.equals((java.lang.Object) julianChronology7);
        java.lang.String str15 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField16 = julianChronology0.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = julianChronology0.add(readablePeriod17, (-937L), 0);
        org.joda.time.DateTimeField dateTimeField21 = julianChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str15, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-937L) + "'", long20 == (-937L));
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.secondOfMinute();
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance();
        long long7 = julianChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.halfdayOfDay();
        org.joda.time.DurationField durationField9 = julianChronology3.halfdays();
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean12 = julianChronology10.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField13 = julianChronology10.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology10.monthOfYear();
        boolean boolean15 = julianChronology3.equals((java.lang.Object) julianChronology10);
        org.joda.time.DateTimeField dateTimeField16 = julianChronology10.hourOfHalfday();
        org.joda.time.chrono.JulianChronology julianChronology17 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean19 = julianChronology17.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField20 = julianChronology17.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = julianChronology17.getZone();
        org.joda.time.chrono.JulianChronology julianChronology22 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone21);
        org.joda.time.Chronology chronology23 = julianChronology10.withZone(dateTimeZone21);
        org.joda.time.Chronology chronology24 = julianChronology0.withZone(dateTimeZone21);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray28 = julianChronology0.get(readablePeriod25, (-85799990L), 530L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(julianChronology17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(julianChronology22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(chronology24);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
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
        org.joda.time.DurationField durationField23 = julianChronology0.weeks();
        org.joda.time.DurationField durationField24 = julianChronology0.days();
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
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
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
        org.joda.time.DateTimeField dateTimeField13 = julianChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology3.era();
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = julianChronology3.get(readablePartial15, (-85799990L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = julianChronology0.getZone();
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = julianChronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology6.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology6.year();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = julianChronology6.set(readablePartial10, (-62111404799968L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = julianChronology0.seconds();
        int int4 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.dayOfMonth();
        org.joda.time.DurationField durationField6 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.minuteOfDay();
        org.joda.time.DurationField durationField8 = julianChronology0.years();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
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
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
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
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
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
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
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
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
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
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
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
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
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
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
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
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
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
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
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
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
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
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
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
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
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
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
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
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
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
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
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
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
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
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
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
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
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
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
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
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
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
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
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
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
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
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
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
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
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
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
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
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
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
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
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
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
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
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
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
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
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
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
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
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
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
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
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
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
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

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = julianChronology0.weeks();
        org.joda.time.DurationField durationField8 = julianChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.weekOfWeekyear();
        org.joda.time.Chronology chronology8 = julianChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = julianChronology0.getDateTimeMillis((long) (short) 1, (int) (byte) 0, (int) (short) 1, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.millisOfSecond();
        java.lang.String str6 = julianChronology0.toString();
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology7.weekyear();
        org.joda.time.DurationField durationField9 = julianChronology7.years();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology7.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology7.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology7.hourOfHalfday();
        org.joda.time.DurationField durationField13 = julianChronology7.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology7.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone15 = julianChronology7.getZone();
        org.joda.time.Chronology chronology16 = julianChronology0.withZone(dateTimeZone15);
        long long22 = julianChronology0.getDateTimeMillis((long) (byte) 100, (int) (byte) 0, (int) (byte) 1, (int) (byte) 1, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField23 = julianChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str6, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 61001L + "'", long22 == 61001L);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
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
        org.joda.time.DurationField durationField11 = julianChronology0.months();
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
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = julianChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = julianChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.year();
        java.lang.String str11 = julianChronology0.toString();
        org.joda.time.ReadablePartial readablePartial12 = null;
        int[] intArray15 = new int[] { '#', (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            julianChronology0.validate(readablePartial12, intArray15);
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
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str11, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[35, -1]");
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
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
        org.joda.time.DateTimeField dateTimeField23 = julianChronology0.hourOfHalfday();
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
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.year();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.clockhourOfDay();
        java.lang.String str4 = julianChronology0.toString();
        int int5 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone6 = julianChronology0.getZone();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str4, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.Chronology chronology3 = julianChronology0.withUTC();
        int int4 = julianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone6 = julianChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.era();
        org.joda.time.DurationField durationField10 = julianChronology0.months();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.secondOfDay();
        org.joda.time.DurationField durationField5 = julianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
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
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField8 = julianChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.weekyearOfCentury();
        java.lang.String str10 = julianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField12 = julianChronology0.days();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str10, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
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
        org.joda.time.DurationField durationField23 = julianChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField24 = julianChronology0.yearOfCentury();
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
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = julianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = julianChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology0.monthOfYear();
        org.joda.time.DurationField durationField8 = julianChronology0.months();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = julianChronology0.add(readablePeriod9, (-45861568940306L), 10);
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-45861568940306L) + "'", long12 == (-45861568940306L));
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        org.joda.time.DurationField durationField8 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = julianChronology0.weeks();
        org.joda.time.DurationField durationField11 = julianChronology0.weekyears();
        long long17 = julianChronology0.getDateTimeMillis((long) ' ', 4, 10, (int) (byte) 1, (int) 'a');
        org.joda.time.DurationField durationField18 = julianChronology0.centuries();
        org.joda.time.DurationField durationField19 = julianChronology0.centuries();
        org.joda.time.ReadablePartial readablePartial20 = null;
        int[] intArray27 = new int[] { 10, (byte) -1, (byte) 1, '4', (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            julianChronology0.validate(readablePartial20, intArray27);
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 15001097L + "'", long17 == 15001097L);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[10, -1, 1, 52, 0, 0]");
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
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
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = julianChronology0.set(readablePartial14, (-47280066583809L));
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
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(julianChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(julianChronology12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DurationField durationField2 = julianChronology0.years();
        org.joda.time.DurationField durationField3 = julianChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        boolean boolean2 = julianChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = julianChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.era();
        org.joda.time.DurationField durationField7 = julianChronology0.seconds();
        org.joda.time.DurationField durationField8 = julianChronology0.centuries();
        org.joda.time.DurationField durationField9 = julianChronology0.minutes();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = julianChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = julianChronology0.hours();
        org.joda.time.DurationField durationField5 = julianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.yearOfCentury();
        org.joda.time.DurationField durationField7 = julianChronology0.minutes();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        long long4 = julianChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = julianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology0.weekOfWeekyear();
        java.lang.String str7 = julianChronology0.toString();
        java.lang.String str8 = julianChronology0.toString();
        org.joda.time.DurationField durationField9 = julianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology0.year();
        long long14 = julianChronology0.add((long) 0, 0L, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField15 = julianChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str7, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JulianChronology[Etc/UTC]" + "'", str8, "JulianChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
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
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
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
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
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
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
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
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
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
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
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
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
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
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
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
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
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
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
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
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
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
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
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
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
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
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
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
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
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
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
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
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
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
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
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
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
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
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
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
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
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
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
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
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
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
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
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
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
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
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
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
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
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
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
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
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
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
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
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
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
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
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
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
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
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
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
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
}

