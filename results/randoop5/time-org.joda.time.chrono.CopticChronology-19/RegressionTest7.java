import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology6.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        long long13 = copticChronology9.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField14 = copticChronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology9.weekOfWeekyear();
        org.joda.time.DurationField durationField16 = copticChronology9.days();
        boolean boolean17 = copticChronology6.equals((java.lang.Object) copticChronology9);
        org.joda.time.DateTimeZone dateTimeZone18 = copticChronology9.getZone();
        org.joda.time.Chronology chronology19 = copticChronology0.withZone(dateTimeZone18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = copticChronology0.add(readablePeriod20, (long) 0, 0);
        org.joda.time.DateTimeField dateTimeField24 = copticChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 98L + "'", long13 == 98L);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        java.lang.String str6 = copticChronology0.toString();
        org.joda.time.DurationField durationField7 = copticChronology0.millis();
        int int8 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.millisOfDay();
        org.joda.time.DurationField durationField11 = copticChronology9.seconds();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology9.add(readablePeriod12, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology9.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology9.minuteOfDay();
        boolean boolean18 = copticChronology0.equals((java.lang.Object) dateTimeField17);
        org.joda.time.DurationField durationField19 = copticChronology0.halfdays();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str6, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.monthOfYear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology6.clockhourOfDay();
        org.joda.time.DurationField durationField9 = copticChronology6.millis();
        org.joda.time.Chronology chronology10 = copticChronology6.withUTC();
        org.joda.time.DurationField durationField11 = copticChronology6.halfdays();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = copticChronology0.hours();
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = copticChronology0.centuries();
        org.joda.time.DurationField durationField9 = copticChronology0.weeks();
        org.joda.time.Chronology chronology10 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DurationField durationField7 = copticChronology0.hours();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = copticChronology0.get(readablePeriod8, 4235004L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.halfdayOfDay();
        java.lang.String str10 = copticChronology0.toString();
        org.joda.time.DurationField durationField11 = copticChronology0.seconds();
        org.joda.time.DurationField durationField12 = copticChronology0.weeks();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = copticChronology0.get(readablePeriod13, 35L, (-4727996799L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str10, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.era();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.millisOfSecond();
        org.joda.time.DurationField durationField11 = copticChronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology8.secondOfDay();
        long long17 = copticChronology8.getDateTimeMillis((int) (byte) 1, (int) (byte) 10, (int) (byte) 10, (int) ' ');
        org.joda.time.DurationField durationField18 = copticChronology8.minutes();
        boolean boolean19 = copticChronology0.equals((java.lang.Object) durationField18);
        org.joda.time.DateTimeZone dateTimeZone20 = copticChronology0.getZone();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-53160105599968L) + "'", long17 == (-53160105599968L));
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeZone20);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.Chronology chronology3 = copticChronology0.withUTC();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.millis();
        org.joda.time.DurationField durationField6 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.minuteOfHour();
        java.lang.String str9 = copticChronology0.toString();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str9, "CopticChronology[Etc/UTC]");
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.Chronology chronology3 = copticChronology0.withUTC();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.years();
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        long long9 = copticChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DurationField durationField10 = copticChronology0.weeks();
        org.joda.time.DurationField durationField11 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology0.add(readablePeriod12, 100L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField17 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField19 = copticChronology0.minutes();
        // The following exception was thrown during execution in test generation
        try {
            long long27 = copticChronology0.getDateTimeMillis((int) (short) 1, 10, (int) (byte) 0, (int) (short) 0, (int) (short) 100, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfHalfday();
        long long14 = copticChronology0.getDateTimeMillis((long) (byte) -1, (int) (short) 10, (int) '4', 0, (int) ' ');
        org.joda.time.DurationField durationField15 = copticChronology0.weeks();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean18 = copticChronology16.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField19 = copticChronology16.halfdayOfDay();
        org.joda.time.DurationField durationField20 = copticChronology16.millis();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology16.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology16.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = copticChronology16.add(readablePeriod23, 0L, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone27 = copticChronology16.getZone();
        org.joda.time.chrono.CopticChronology copticChronology28 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone27);
        org.joda.time.Chronology chronology29 = copticChronology0.withZone(dateTimeZone27);
        org.joda.time.DurationField durationField30 = copticChronology0.weeks();
        org.joda.time.DurationField durationField31 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone33 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology34 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone33);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-47279968L) + "'", long14 == (-47279968L));
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(copticChronology16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(copticChronology28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(copticChronology34);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        int int6 = copticChronology0.getMinimumDaysInFirstWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = copticChronology0.getDateTimeMillis((int) (short) 100, (int) ' ', (int) '#', (int) (short) 10, (int) ' ', (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField8 = copticChronology0.days();
        org.joda.time.DurationField durationField9 = copticChronology0.centuries();
        org.joda.time.DurationField durationField10 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.minuteOfHour();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean14 = copticChronology12.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology12.halfdayOfDay();
        org.joda.time.DurationField durationField16 = copticChronology12.millis();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology12.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology12.weekOfWeekyear();
        boolean boolean20 = copticChronology0.equals((java.lang.Object) copticChronology12);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField22 = copticChronology0.years();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfEra();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DurationField durationField6 = copticChronology0.hours();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.dayOfYear();
        org.joda.time.DurationField durationField9 = copticChronology7.millis();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology7.getZone();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone10);
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField13 = copticChronology12.weekyears();
        boolean boolean14 = copticChronology0.equals((java.lang.Object) copticChronology12);
        org.joda.time.DurationField durationField15 = copticChronology12.years();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (-1), (int) (byte) 100);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField11 = copticChronology7.millis();
        org.joda.time.DurationField durationField12 = copticChronology7.days();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.yearOfCentury();
        boolean boolean14 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.yearOfCentury();
        org.joda.time.Chronology chronology16 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField17 = copticChronology0.minutes();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField11 = copticChronology0.centuries();
        org.joda.time.DurationField durationField12 = copticChronology0.hours();
        org.joda.time.DurationField durationField13 = copticChronology0.days();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        long long14 = copticChronology0.add((long) 0, 0L, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = copticChronology0.add(readablePeriod17, (-61001L), 1);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-61001L) + "'", long20 == (-61001L));
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.monthOfYear();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.hourOfHalfday();
        java.lang.String str14 = copticChronology7.toString();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.clockhourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str14, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = copticChronology0.getZone();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = copticChronology0.set(readablePartial6, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.months();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology9.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance();
        long long16 = copticChronology12.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField17 = copticChronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology12.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = copticChronology12.days();
        boolean boolean20 = copticChronology9.equals((java.lang.Object) copticChronology12);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology9.centuryOfEra();
        org.joda.time.DurationField durationField22 = copticChronology9.months();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology9.year();
        boolean boolean24 = copticChronology0.equals((java.lang.Object) dateTimeField23);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 98L + "'", long16 == 98L);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.monthOfYear();
        org.joda.time.Chronology chronology5 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = copticChronology0.getDateTimeMillis(10, (int) (short) 100, (int) (byte) 100, (int) (byte) 1, (int) (short) 0, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField11 = copticChronology0.years();
        org.joda.time.DurationField durationField12 = copticChronology0.days();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone4);
        org.joda.time.DurationField durationField6 = copticChronology5.years();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = copticChronology5.add(readablePeriod7, (-50059728000000L), (int) (short) -1);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology5.era();
        org.joda.time.DurationField durationField12 = copticChronology5.hours();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(copticChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-50059728000000L) + "'", long10 == (-50059728000000L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField12 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = copticChronology0.add(readablePeriod14, (-99L), (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-99L) + "'", long17 == (-99L));
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (-1), (int) (byte) 100);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField11 = copticChronology7.millis();
        org.joda.time.DurationField durationField12 = copticChronology7.days();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.yearOfCentury();
        boolean boolean14 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology15.millisOfDay();
        org.joda.time.DurationField durationField17 = copticChronology15.seconds();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = copticChronology15.add(readablePeriod18, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField22 = copticChronology15.secondOfDay();
        org.joda.time.Chronology chronology23 = copticChronology15.withUTC();
        boolean boolean24 = copticChronology0.equals((java.lang.Object) copticChronology15);
        org.joda.time.DurationField durationField25 = copticChronology15.hours();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology15.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone27 = copticChronology15.getZone();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology15.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = copticChronology15.get(readablePeriod29, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(copticChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeField28);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = copticChronology0.add(readablePeriod6, 52L, (int) (byte) 10);
        org.joda.time.DurationField durationField10 = copticChronology0.halfdays();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.secondOfMinute();
        long long7 = copticChronology0.add((long) (-1), (long) (short) 100, 0);
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance();
        long long15 = copticChronology11.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField16 = copticChronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology11.weekOfWeekyear();
        org.joda.time.DurationField durationField18 = copticChronology11.days();
        boolean boolean19 = copticChronology8.equals((java.lang.Object) copticChronology11);
        org.joda.time.DateTimeZone dateTimeZone20 = copticChronology11.getZone();
        org.joda.time.Chronology chronology21 = copticChronology0.withZone(dateTimeZone20);
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone20);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 98L + "'", long15 == 98L);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(copticChronology22);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.monthOfYear();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DurationField durationField13 = copticChronology7.centuries();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.minuteOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = copticChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = copticChronology3.days();
        boolean boolean11 = copticChronology0.equals((java.lang.Object) copticChronology3);
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology3.dayOfWeek();
        org.joda.time.DurationField durationField14 = copticChronology3.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = copticChronology3.add(52L, (-5006042851047221145L), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -5006042851047221145 * 52");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DurationField durationField3 = copticChronology0.centuries();
        org.joda.time.DurationField durationField4 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField11 = copticChronology0.halfdays();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology0.add(readablePeriod12, (-1424L), (int) '4');
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1424L) + "'", long15 == (-1424L));
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.era();
        org.joda.time.DurationField durationField7 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone8, 4);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(copticChronology10);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.minuteOfDay();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = copticChronology0.set(readablePartial9, 250100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfHalfday();
        java.lang.String str6 = copticChronology0.toString();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str6, "CopticChronology[Etc/UTC]");
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        java.lang.String str4 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str4, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField11 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.Chronology chronology7 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.halfdayOfDay();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = copticChronology0.get(readablePartial9, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.seconds();
        org.joda.time.DurationField durationField9 = copticChronology0.months();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField6 = copticChronology0.days();
        boolean boolean8 = copticChronology0.equals((java.lang.Object) 1L);
        org.joda.time.DurationField durationField9 = copticChronology0.weeks();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = copticChronology0.get(readablePeriod10, 14692098L, 391158041L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = copticChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = copticChronology3.days();
        boolean boolean11 = copticChronology0.equals((java.lang.Object) copticChronology3);
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology3.getZone();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12, 4);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology14.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = copticChronology14.getDateTimeMillis((-1601911245496680L), (int) '#', 0, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.chrono.LimitChronology.LimitException; message: The instant is below the supported minimum of 0001-01-01T00:00:00.000Z (CopticChronology[UTC])");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(copticChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        java.lang.String str6 = copticChronology0.toString();
        org.joda.time.DurationField durationField7 = copticChronology0.millis();
        long long11 = copticChronology0.add((long) '#', 250100L, 0);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.minuteOfDay();
        long long16 = copticChronology0.add((long) (short) 100, (long) 1, 1);
        org.joda.time.DateTimeZone dateTimeZone17 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str6, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 101L + "'", long16 == 101L);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfMonth();
        long long11 = copticChronology0.add((-47279968L), 899L, (int) ' ');
        java.lang.String str12 = copticChronology0.toString();
        int int13 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField16 = copticChronology0.weekyears();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-47251200L) + "'", long11 == (-47251200L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str12, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = copticChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = copticChronology3.days();
        boolean boolean11 = copticChronology0.equals((java.lang.Object) copticChronology3);
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology3.getZone();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.secondOfMinute();
        org.joda.time.ReadablePartial readablePartial16 = null;
        int[] intArray18 = new int[] { 100 };
        // The following exception was thrown during execution in test generation
        try {
            copticChronology14.validate(readablePartial16, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(copticChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100]");
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField8 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.monthOfYear();
        int int11 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField12 = copticChronology0.hours();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField10 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.era();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = copticChronology6.halfdays();
        org.joda.time.DurationField durationField8 = copticChronology6.seconds();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology6.secondOfMinute();
        org.joda.time.DurationField durationField10 = copticChronology6.seconds();
        long long14 = copticChronology6.add((long) (short) 1, 102L, (int) '#');
        org.joda.time.DateTimeField dateTimeField15 = copticChronology6.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology6.monthOfYear();
        int int17 = copticChronology6.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3571L + "'", long14 == 3571L);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfHalfday();
        long long14 = copticChronology0.getDateTimeMillis((long) (byte) -1, (int) (short) 10, (int) '4', 0, (int) ' ');
        org.joda.time.DurationField durationField15 = copticChronology0.halfdays();
        long long19 = copticChronology0.add(35L, 13005232L, 10);
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField21 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-47279968L) + "'", long14 == (-47279968L));
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 130052355L + "'", long19 == 130052355L);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.clockhourOfDay();
        java.lang.String str4 = copticChronology0.toString();
        int int5 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6);
        org.joda.time.DurationField durationField8 = copticChronology7.halfdays();
        org.joda.time.DurationField durationField9 = copticChronology7.centuries();
        org.joda.time.Chronology chronology10 = copticChronology7.withUTC();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str4, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfDay();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DurationField durationField6 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = copticChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = copticChronology3.days();
        boolean boolean11 = copticChronology0.equals((java.lang.Object) copticChronology3);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone13 = copticChronology0.getZone();
        org.joda.time.DurationField durationField14 = copticChronology0.days();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
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
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = copticChronology0.get(readablePartial9, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = copticChronology0.get(readablePeriod11, 1663L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.era();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Chronology chronology12 = copticChronology9.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology9.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology9.minuteOfHour();
        org.joda.time.DurationField durationField15 = copticChronology9.days();
        boolean boolean16 = copticChronology0.equals((java.lang.Object) copticChronology9);
        org.joda.time.DurationField durationField17 = copticChronology9.weeks();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology9.halfdayOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = copticChronology0.add(readablePeriod9, (long) '4', (int) (short) 1);
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean15 = copticChronology13.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology13.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology13.monthOfYear();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology13.dayOfWeek();
        int int19 = copticChronology13.getMinimumDaysInFirstWeek();
        boolean boolean20 = copticChronology0.equals((java.lang.Object) copticChronology13);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = copticChronology0.add(readablePeriod21, (long) 'a', (int) '#');
        org.joda.time.DateTimeField dateTimeField25 = copticChronology0.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = copticChronology0.get(readablePeriod26, 62L, 487L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertNotNull(copticChronology13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField25);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = copticChronology0.add(readablePeriod11, (long) (short) 10, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone10, 1);
        org.joda.time.DurationField durationField13 = copticChronology12.days();
        org.joda.time.DurationField durationField14 = copticChronology12.centuries();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone9, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.dayOfWeek();
        org.joda.time.Chronology chronology13 = copticChronology11.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology11.clockhourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        java.lang.String str9 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str9, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DurationField durationField8 = copticChronology0.months();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.hourOfHalfday();
        int int11 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField12 = copticChronology0.days();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = copticChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean7 = copticChronology5.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology5.halfdayOfDay();
        org.joda.time.DurationField durationField9 = copticChronology5.millis();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology5.minuteOfHour();
        org.joda.time.DurationField durationField11 = copticChronology5.years();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology5.getZone();
        org.joda.time.Chronology chronology13 = copticChronology0.withZone(dateTimeZone12);
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.millisOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3501L + "'", long4 == 3501L);
        org.junit.Assert.assertNotNull(copticChronology5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(copticChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField10 = copticChronology0.minutes();
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = copticChronology0.get(readablePartial11, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.monthOfYear();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DurationField durationField13 = copticChronology7.centuries();
        org.joda.time.DurationField durationField14 = copticChronology7.centuries();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.minuteOfDay();
        java.lang.Class<?> wildcardClass16 = dateTimeField15.getClass();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = copticChronology0.weeks();
        org.joda.time.DurationField durationField8 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField10 = copticChronology0.months();
        org.junit.Assert.assertNotNull(copticChronology0);
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
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = copticChronology0.add(readablePeriod15, (long) (short) -1, 1);
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.year();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, 0L, (int) '#');
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = copticChronology0.get(readablePeriod8, 3152100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = copticChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = copticChronology0.seconds();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3501L + "'", long4 == 3501L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        java.lang.String str4 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str4, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.year();
        org.joda.time.DurationField durationField13 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField15 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyear();
        int int7 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField10 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField12 = copticChronology0.hours();
        org.joda.time.DurationField durationField13 = copticChronology0.years();
        org.joda.time.Chronology chronology14 = copticChronology0.withUTC();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        int int7 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        java.lang.String str9 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str9, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology0.getZone();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology0.add(readablePeriod10, 9L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.weekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9L + "'", long13 == 9L);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.year();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology8.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology8.yearOfCentury();
        org.joda.time.DurationField durationField13 = copticChronology8.seconds();
        boolean boolean14 = copticChronology0.equals((java.lang.Object) durationField13);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = copticChronology0.add(readablePeriod16, (-1L), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.minuteOfDay();
        long long24 = copticChronology0.add((long) (short) 10, (-71541331L), 0);
        org.joda.time.DurationField durationField25 = copticChronology0.centuries();
        org.joda.time.DurationField durationField26 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField28 = copticChronology0.years();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField7 = copticChronology0.seconds();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = copticChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = copticChronology3.days();
        boolean boolean11 = copticChronology0.equals((java.lang.Object) copticChronology3);
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology3.getZone();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12, 4);
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12);
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField17 = copticChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology16.hourOfHalfday();
        org.joda.time.DurationField durationField19 = copticChronology16.millis();
        org.joda.time.DurationField durationField20 = copticChronology16.seconds();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(copticChronology14);
        org.junit.Assert.assertNotNull(copticChronology15);
        org.junit.Assert.assertNotNull(copticChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = copticChronology7.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.dayOfWeek();
        java.lang.String str12 = copticChronology7.toString();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.millisOfDay();
        org.joda.time.DurationField durationField16 = copticChronology7.weekyears();
        boolean boolean17 = copticChronology0.equals((java.lang.Object) durationField16);
        long long21 = copticChronology0.add(0L, 250100L, (int) ' ');
        org.joda.time.DateTimeField dateTimeField22 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str12, "CopticChronology[Etc/UTC]");
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
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.year();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology8.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology8.yearOfCentury();
        org.joda.time.DurationField durationField13 = copticChronology8.seconds();
        boolean boolean14 = copticChronology0.equals((java.lang.Object) durationField13);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfDay();
        java.lang.String str7 = copticChronology0.toString();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (-1), (int) (byte) 100);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField11 = copticChronology7.millis();
        org.joda.time.DurationField durationField12 = copticChronology7.days();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.yearOfCentury();
        boolean boolean14 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.yearOfCentury();
        org.joda.time.Chronology chronology16 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField17 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.year();
        org.joda.time.DurationField durationField13 = copticChronology0.millis();
        org.joda.time.DurationField durationField14 = copticChronology0.halfdays();
        int int15 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField18 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.era();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.yearOfCentury();
        org.joda.time.DurationField durationField12 = copticChronology7.years();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.dayOfYear();
        boolean boolean14 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.era();
        org.joda.time.DateTimeZone dateTimeZone16 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone16);
        org.joda.time.DurationField durationField18 = copticChronology17.seconds();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DurationField durationField5 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology6.getZone();
        org.joda.time.Chronology chronology8 = copticChronology0.withZone(dateTimeZone7);
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.halfdayOfDay();
        long long14 = copticChronology9.add(32L, 250100L, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone15 = copticChronology9.getZone();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone15);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 13005232L + "'", long14 == 13005232L);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(copticChronology16);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = copticChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = copticChronology3.days();
        boolean boolean11 = copticChronology0.equals((java.lang.Object) copticChronology3);
        org.joda.time.DurationField durationField12 = copticChronology3.days();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology3.centuryOfEra();
        org.joda.time.DurationField durationField14 = copticChronology3.months();
        org.joda.time.ReadablePartial readablePartial15 = null;
        int[] intArray18 = new int[] { (short) 10, '#' };
        // The following exception was thrown during execution in test generation
        try {
            copticChronology3.validate(readablePartial15, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[10, 35]");
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        int int7 = copticChronology0.getMinimumDaysInFirstWeek();
        long long11 = copticChronology0.add(0L, (-52900214399999L), (int) ' ');
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1692806860799968L) + "'", long11 == (-1692806860799968L));
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstance();
        long long8 = copticChronology4.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str9 = copticChronology4.toString();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology10.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = copticChronology10.getZone();
        org.joda.time.Chronology chronology14 = copticChronology4.withZone(dateTimeZone13);
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone13);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone13, (int) (byte) 1);
        org.joda.time.Chronology chronology18 = copticChronology0.withZone(dateTimeZone13);
        int int19 = copticChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(copticChronology4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str9, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(copticChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(copticChronology15);
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField8 = copticChronology0.years();
        org.joda.time.DurationField durationField9 = copticChronology0.weeks();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = copticChronology0.hours();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.joda.time.DurationField durationField8 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField10 = copticChronology0.weekyears();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekyear();
        java.lang.String str10 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str10, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology6.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        long long13 = copticChronology9.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField14 = copticChronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology9.weekOfWeekyear();
        org.joda.time.DurationField durationField16 = copticChronology9.days();
        boolean boolean17 = copticChronology6.equals((java.lang.Object) copticChronology9);
        org.joda.time.DateTimeZone dateTimeZone18 = copticChronology9.getZone();
        org.joda.time.Chronology chronology19 = copticChronology0.withZone(dateTimeZone18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone18, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 98L + "'", long13 == 98L);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0, 1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology2.dayOfWeek();
        org.junit.Assert.assertNotNull(copticChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfHalfday();
        java.lang.String str9 = copticChronology0.toString();
        org.joda.time.DurationField durationField10 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str9, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField6 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = copticChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField4 = copticChronology0.hours();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = copticChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3501L + "'", long4 == 3501L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology0.getZone();
        org.joda.time.Chronology chronology9 = copticChronology0.withUTC();
        long long13 = copticChronology0.add((-937L), 487L, (int) (short) -1);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1424L) + "'", long13 == (-1424L));
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DurationField durationField7 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.Chronology chronology3 = copticChronology0.withUTC();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology10.year();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology10.millisOfSecond();
        java.lang.String str13 = copticChronology10.toString();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology10.getZone();
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone14);
        org.joda.time.Chronology chronology16 = copticChronology0.withZone(dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = copticChronology0.getDateTimeMillis((-1), 0, 4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(copticChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str13, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(copticChronology15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.monthOfYear();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DurationField durationField13 = copticChronology7.centuries();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology7.dayOfYear();
        org.joda.time.DurationField durationField17 = copticChronology7.weekyears();
        java.lang.String str18 = copticChronology7.toString();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str18, "CopticChronology[Etc/UTC]");
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
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
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = copticChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = copticChronology3.days();
        boolean boolean11 = copticChronology0.equals((java.lang.Object) copticChronology3);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField13 = copticChronology0.months();
        org.joda.time.DurationField durationField14 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone16 = copticChronology0.getZone();
        int int17 = copticChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField9 = copticChronology0.centuries();
        org.joda.time.DurationField durationField10 = copticChronology0.days();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = copticChronology0.add(readablePeriod5, 36604035L, (int) (byte) 1);
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        long long13 = copticChronology9.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology9.halfdayOfDay();
        org.joda.time.DurationField durationField15 = copticChronology9.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean18 = copticChronology16.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField19 = copticChronology16.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology16.monthOfYear();
        boolean boolean21 = copticChronology9.equals((java.lang.Object) copticChronology16);
        org.joda.time.DateTimeField dateTimeField22 = copticChronology9.weekyear();
        org.joda.time.DurationField durationField23 = copticChronology9.seconds();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology9.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone26 = copticChronology9.getZone();
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone26);
        org.joda.time.Chronology chronology28 = copticChronology0.withZone(dateTimeZone26);
        org.joda.time.DurationField durationField29 = copticChronology0.weekyears();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 36604035L + "'", long8 == 36604035L);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 98L + "'", long13 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(copticChronology16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(copticChronology27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(durationField29);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField7 = copticChronology0.halfdays();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.months();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean11 = copticChronology9.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology9.halfdayOfDay();
        boolean boolean14 = copticChronology0.equals((java.lang.Object) dateTimeField13);
        org.joda.time.DurationField durationField15 = copticChronology0.halfdays();
        org.joda.time.Chronology chronology16 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField17 = copticChronology0.weekyears();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField11 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.era();
        org.joda.time.DurationField durationField13 = copticChronology0.centuries();
        org.joda.time.DurationField durationField14 = copticChronology0.weekyears();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        long long11 = copticChronology0.add((long) (byte) 1, (long) (short) 100, (int) '#');
        org.joda.time.DurationField durationField12 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.halfdayOfDay();
        java.lang.String str15 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3501L + "'", long11 == 3501L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str15, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.yearOfEra();
        long long9 = copticChronology0.add((-1654800529584900L), 35014L, 100);
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = copticChronology0.set(readablePartial10, (-50059724847900L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1654800526083500L) + "'", long9 == (-1654800526083500L));
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.year();
        org.joda.time.DurationField durationField13 = copticChronology0.millis();
        org.joda.time.DurationField durationField14 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.era();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        long long9 = copticChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DurationField durationField10 = copticChronology0.weeks();
        org.joda.time.DurationField durationField11 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology0.add(readablePeriod12, 101L, (int) (byte) 10);
        org.joda.time.DurationField durationField16 = copticChronology0.weeks();
        org.joda.time.DurationField durationField17 = copticChronology0.minutes();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 101L + "'", long15 == 101L);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.year();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.hourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology8.yearOfEra();
        org.joda.time.DurationField durationField12 = copticChronology8.hours();
        org.joda.time.DurationField durationField13 = copticChronology8.months();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology8.weekOfWeekyear();
        java.lang.Class<?> wildcardClass16 = copticChronology8.getClass();
        boolean boolean17 = copticChronology0.equals((java.lang.Object) wildcardClass16);
        org.joda.time.DurationField durationField18 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.year();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        java.lang.String str4 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology0.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone9, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str4, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.monthOfYear();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DurationField durationField13 = copticChronology7.centuries();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.dayOfWeek();
        long long18 = copticChronology7.add(36635000L, 13005232L, (int) 'a');
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1298142504L + "'", long18 == 1298142504L);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField9 = copticChronology0.months();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        long long9 = copticChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.DurationField durationField11 = copticChronology0.days();
        org.joda.time.DurationField durationField12 = copticChronology0.millis();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = copticChronology0.getDateTimeMillis((int) (byte) 10, (int) (byte) 1, (int) '#', (int) (short) 1, 0, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.weekOfWeekyear();
        java.lang.String str12 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str12, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.yearOfCentury();
        int int11 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = copticChronology0.millis();
        org.joda.time.Chronology chronology3 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfHour();
        org.joda.time.Chronology chronology5 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField6 = copticChronology0.seconds();
        org.joda.time.DurationField durationField7 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfDay();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology7.getZone();
        org.joda.time.Chronology chronology11 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField12 = copticChronology0.years();
        org.joda.time.DurationField durationField13 = copticChronology0.millis();
        org.joda.time.DurationField durationField14 = copticChronology0.days();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        java.lang.String str4 = copticChronology0.toString();
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.joda.time.DurationField durationField6 = copticChronology0.millis();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str4, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.year();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone4 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = copticChronology1.set(readablePartial6, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = copticChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean7 = copticChronology5.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology5.halfdayOfDay();
        org.joda.time.DurationField durationField9 = copticChronology5.millis();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology5.minuteOfHour();
        org.joda.time.DurationField durationField11 = copticChronology5.years();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology5.getZone();
        org.joda.time.Chronology chronology13 = copticChronology0.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3501L + "'", long4 == 3501L);
        org.junit.Assert.assertNotNull(copticChronology5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.Chronology chronology2 = copticChronology0.withUTC();
        org.joda.time.Chronology chronology3 = copticChronology0.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = copticChronology0.getDateTimeMillis((-53089257600000L), 0, 1, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology3);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        java.lang.String str4 = copticChronology0.toString();
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str4, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        java.lang.String str4 = copticChronology0.toString();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str4, "CopticChronology[Etc/UTC]");
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField6 = copticChronology0.days();
        boolean boolean8 = copticChronology0.equals((java.lang.Object) 1L);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology0.getZone();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = copticChronology0.add(readablePeriod8, 619L, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 619L + "'", long11 == 619L);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = copticChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = copticChronology3.days();
        boolean boolean11 = copticChronology0.equals((java.lang.Object) copticChronology3);
        org.joda.time.DurationField durationField12 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.dayOfMonth();
        int int16 = copticChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = copticChronology6.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology6.millisOfSecond();
        org.joda.time.ReadablePartial readablePartial9 = null;
        int[] intArray16 = new int[] { (short) 10, (byte) 1, (byte) 10, 'a', '4', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            copticChronology6.validate(readablePartial9, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 1, 10, 97, 52, 100]");
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        long long10 = copticChronology0.add((long) '4', 0L, (int) (byte) 1);
        org.joda.time.DurationField durationField11 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.era();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.monthOfYear();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.centuryOfEra();
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean17 = copticChronology15.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology15.halfdayOfDay();
        org.joda.time.DurationField durationField19 = copticChronology15.millis();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology15.minuteOfHour();
        long long24 = copticChronology15.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DurationField durationField25 = copticChronology15.weeks();
        org.joda.time.DurationField durationField26 = copticChronology15.seconds();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        long long30 = copticChronology15.add(readablePeriod27, 100L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField31 = copticChronology15.millisOfDay();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology15.minuteOfHour();
        boolean boolean33 = copticChronology7.equals((java.lang.Object) copticChronology15);
        org.joda.time.DurationField durationField34 = copticChronology15.minutes();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(copticChronology15);
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
        org.junit.Assert.assertNotNull(durationField34);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        java.lang.String str1 = copticChronology0.toString();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str1, "CopticChronology[Etc/UTC]");
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField9 = copticChronology0.seconds();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        long long14 = copticChronology0.getDateTimeMillis(52L, 0, 4, (int) (short) 10, (int) (short) 100);
        org.joda.time.DurationField durationField15 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.hourOfDay();
        int int17 = copticChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 250100L + "'", long14 == 250100L);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = copticChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean7 = copticChronology5.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology5.halfdayOfDay();
        org.joda.time.DurationField durationField9 = copticChronology5.millis();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology5.minuteOfHour();
        org.joda.time.DurationField durationField11 = copticChronology5.years();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology5.getZone();
        org.joda.time.Chronology chronology13 = copticChronology0.withZone(dateTimeZone12);
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3501L + "'", long4 == 3501L);
        org.junit.Assert.assertNotNull(copticChronology5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(copticChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DurationField durationField7 = copticChronology0.hours();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = copticChronology0.weeks();
        org.joda.time.DurationField durationField11 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.monthOfYear();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DurationField durationField13 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField14 = copticChronology0.years();
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = copticChronology0.set(readablePartial15, 10200L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = copticChronology0.millis();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology3.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology3.getZone();
        boolean boolean7 = copticChronology0.equals((java.lang.Object) copticChronology3);
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance();
        long long15 = copticChronology11.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField16 = copticChronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology11.weekOfWeekyear();
        org.joda.time.DurationField durationField18 = copticChronology11.days();
        boolean boolean19 = copticChronology8.equals((java.lang.Object) copticChronology11);
        org.joda.time.DateTimeZone dateTimeZone20 = copticChronology11.getZone();
        org.joda.time.Chronology chronology21 = copticChronology3.withZone(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField22 = copticChronology3.millisOfDay();
        org.joda.time.DurationField durationField23 = copticChronology3.hours();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 98L + "'", long15 == 98L);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        java.lang.String str6 = copticChronology0.toString();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = copticChronology0.getDateTimeMillis((int) (byte) 1, (int) (short) 10, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str6, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        long long9 = copticChronology0.getDateTimeMillis((int) (byte) 1, (int) (byte) 10, (int) (byte) 10, (int) ' ');
        java.lang.String str10 = copticChronology0.toString();
        java.lang.Class<?> wildcardClass11 = copticChronology0.getClass();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53160105599968L) + "'", long9 == (-53160105599968L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str10, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (-1), (int) (byte) 100);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField11 = copticChronology7.millis();
        org.joda.time.DurationField durationField12 = copticChronology7.days();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.yearOfCentury();
        boolean boolean14 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.yearOfCentury();
        org.joda.time.Chronology chronology16 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.weekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(copticChronology7);
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
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = copticChronology0.set(readablePartial7, 500L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.monthOfYear();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DurationField durationField13 = copticChronology7.centuries();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology7.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology7.hourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        java.lang.String str3 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str3, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField9 = copticChronology0.centuries();
        java.lang.String str10 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField12 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField14 = copticChronology0.centuries();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str10, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField6 = copticChronology0.minutes();
        org.joda.time.DurationField durationField7 = copticChronology0.halfdays();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology0.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone8, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfWeek();
        long long11 = copticChronology0.add((long) (short) 0, 0L, (int) (byte) 0);
        long long15 = copticChronology0.add(7200L, 0L, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 7200L + "'", long15 == 7200L);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = copticChronology0.add(readablePeriod8, (long) '4', 1);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.hourOfHalfday();
        long long16 = copticChronology0.add(0L, 100L, 10);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.Chronology chronology20 = copticChronology17.withZone(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology17.dayOfWeek();
        java.lang.String str22 = copticChronology17.toString();
        org.joda.time.Chronology chronology23 = copticChronology17.withUTC();
        org.joda.time.DurationField durationField24 = copticChronology17.centuries();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology17.clockhourOfHalfday();
        long long31 = copticChronology17.getDateTimeMillis((long) (byte) -1, (int) (short) 10, (int) '4', 0, (int) ' ');
        org.joda.time.DurationField durationField32 = copticChronology17.weeks();
        org.joda.time.chrono.CopticChronology copticChronology33 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean35 = copticChronology33.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField36 = copticChronology33.halfdayOfDay();
        org.joda.time.DurationField durationField37 = copticChronology33.millis();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology33.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField39 = copticChronology33.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        long long43 = copticChronology33.add(readablePeriod40, 0L, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone44 = copticChronology33.getZone();
        org.joda.time.chrono.CopticChronology copticChronology45 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone44);
        org.joda.time.Chronology chronology46 = copticChronology17.withZone(dateTimeZone44);
        org.joda.time.DurationField durationField47 = copticChronology17.weeks();
        org.joda.time.DateTimeField dateTimeField48 = copticChronology17.minuteOfDay();
        org.joda.time.chrono.CopticChronology copticChronology49 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField50 = copticChronology49.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.Chronology chronology52 = copticChronology49.withZone(dateTimeZone51);
        org.joda.time.DateTimeField dateTimeField53 = copticChronology49.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField54 = copticChronology49.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField55 = copticChronology49.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField56 = copticChronology49.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone57 = copticChronology49.getZone();
        org.joda.time.Chronology chronology58 = copticChronology17.withZone(dateTimeZone57);
        org.joda.time.Chronology chronology59 = copticChronology0.withZone(dateTimeZone57);
        org.joda.time.DateTimeField dateTimeField60 = copticChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1000L + "'", long16 == 1000L);
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str22, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-47279968L) + "'", long31 == (-47279968L));
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(copticChronology33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(copticChronology45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(durationField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(copticChronology49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(dateTimeField60);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField8 = copticChronology0.days();
        org.joda.time.DurationField durationField9 = copticChronology0.days();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = copticChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean7 = copticChronology5.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology5.halfdayOfDay();
        org.joda.time.DurationField durationField9 = copticChronology5.millis();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology5.minuteOfHour();
        org.joda.time.DurationField durationField11 = copticChronology5.years();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology5.getZone();
        org.joda.time.Chronology chronology13 = copticChronology0.withZone(dateTimeZone12);
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.minuteOfHour();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3501L + "'", long4 == 3501L);
        org.junit.Assert.assertNotNull(copticChronology5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(copticChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone4 = copticChronology0.getZone();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology6.getZone();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = copticChronology6.add(readablePeriod9, 101L, 0);
        org.joda.time.DurationField durationField13 = copticChronology6.eras();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 101L + "'", long12 == 101L);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = copticChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = copticChronology3.days();
        boolean boolean11 = copticChronology0.equals((java.lang.Object) copticChronology3);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.weekyear();
        java.lang.String str13 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField17 = copticChronology16.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology18.millisOfDay();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology18.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology18.weekyearOfCentury();
        boolean boolean22 = copticChronology16.equals((java.lang.Object) copticChronology18);
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology23.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.Chronology chronology26 = copticChronology23.withZone(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField27 = copticChronology23.dayOfWeek();
        org.joda.time.DurationField durationField28 = copticChronology23.months();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology23.secondOfMinute();
        boolean boolean30 = copticChronology18.equals((java.lang.Object) dateTimeField29);
        org.joda.time.DurationField durationField31 = copticChronology18.days();
        boolean boolean32 = copticChronology0.equals((java.lang.Object) durationField31);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str13, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(copticChronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(copticChronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(copticChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField6 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = copticChronology0.getDateTimeMillis(0, (int) '#', (int) (short) 1, (int) '4', (int) (short) 1, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.joda.time.DurationField durationField6 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.year();
        org.joda.time.DurationField durationField8 = copticChronology0.centuries();
        org.joda.time.DurationField durationField9 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = copticChronology0.get(readablePeriod12, (-50130575995999L), (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.clockhourOfDay();
        java.lang.String str4 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = copticChronology0.getDateTimeMillis(35014L, (-1), (int) (short) 1, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str4, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = copticChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = copticChronology3.days();
        boolean boolean11 = copticChronology0.equals((java.lang.Object) copticChronology3);
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology3.getZone();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12, 4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(copticChronology14);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.monthOfYear();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.monthOfYear();
        org.joda.time.DurationField durationField14 = copticChronology7.months();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology7.secondOfDay();
        org.joda.time.DurationField durationField17 = copticChronology7.centuries();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        java.lang.String str4 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = copticChronology0.years();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str4, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.yearOfEra();
        java.lang.Class<?> wildcardClass11 = copticChronology0.getClass();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = copticChronology6.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology8.hourOfHalfday();
        org.joda.time.DurationField durationField12 = copticChronology8.days();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology8.millisOfSecond();
        org.joda.time.DurationField durationField15 = copticChronology8.days();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology8.hourOfHalfday();
        boolean boolean17 = copticChronology6.equals((java.lang.Object) dateTimeField16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = copticChronology6.get(readablePeriod18, (-1692806860799968L), (-36L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(copticChronology8);
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
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.era();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Chronology chronology12 = copticChronology9.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology9.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology9.minuteOfHour();
        org.joda.time.DurationField durationField15 = copticChronology9.days();
        boolean boolean16 = copticChronology0.equals((java.lang.Object) copticChronology9);
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfDay();
        java.lang.String str7 = copticChronology0.toString();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.joda.time.DurationField durationField9 = copticChronology0.millis();
        org.joda.time.DurationField durationField10 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.year();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = copticChronology0.getDateTimeMillis(102L, (int) (byte) 100, (int) '4', (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.minutes();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = copticChronology0.add(readablePeriod9, (long) (byte) 10, (int) (short) 1);
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = copticChronology0.get(readablePartial13, 1663L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekOfWeekyear();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.millisOfDay();
        org.joda.time.DurationField durationField11 = copticChronology9.seconds();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology9.add(readablePeriod12, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology9.hourOfHalfday();
        org.joda.time.DurationField durationField17 = copticChronology9.minutes();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology9.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = copticChronology9.getZone();
        org.joda.time.Chronology chronology20 = copticChronology0.withZone(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long29 = copticChronology0.getDateTimeMillis((int) (byte) 0, (int) (byte) 1, (int) (byte) 1, (int) (short) -1, (int) ' ', (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(copticChronology9);
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
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField8 = copticChronology0.days();
        org.joda.time.DurationField durationField9 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = copticChronology0.add(readablePeriod11, (-47279968L), (int) 'a');
        org.joda.time.DurationField durationField15 = copticChronology0.minutes();
        org.joda.time.DurationField durationField16 = copticChronology0.weekyears();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = copticChronology0.halfdays();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = copticChronology0.getDateTimeMillis((int) 'a', 0, (-1), 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        java.lang.String str4 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str4, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = copticChronology0.millis();
        org.joda.time.Chronology chronology3 = copticChronology0.withUTC();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.minutes();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DurationField durationField7 = copticChronology0.millis();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology8.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology8.dayOfWeek();
        java.lang.String str13 = copticChronology8.toString();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology8.secondOfDay();
        org.joda.time.DurationField durationField15 = copticChronology8.minutes();
        long long19 = copticChronology8.add((long) '#', (long) (short) 1, (int) ' ');
        org.joda.time.DurationField durationField20 = copticChronology8.centuries();
        org.joda.time.DateTimeZone dateTimeZone21 = copticChronology8.getZone();
        org.joda.time.Chronology chronology22 = copticChronology0.withZone(dateTimeZone21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone21, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str13, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 67L + "'", long19 == 67L);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(chronology22);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.monthOfYear();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DurationField durationField13 = copticChronology7.centuries();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology7.dayOfYear();
        org.joda.time.DurationField durationField17 = copticChronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology7.clockhourOfHalfday();
        org.joda.time.Chronology chronology19 = copticChronology7.withUTC();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        long long10 = copticChronology0.add((long) '4', 0L, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.minuteOfDay();
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = copticChronology0.get(readablePartial12, (-50059955632252L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.weekyearOfCentury();
        boolean boolean6 = copticChronology0.equals((java.lang.Object) copticChronology2);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology2.monthOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(copticChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField9 = copticChronology0.centuries();
        java.lang.String str10 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField12 = copticChronology0.days();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology13.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = copticChronology13.getZone();
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone16);
        org.joda.time.Chronology chronology18 = copticChronology0.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = copticChronology0.getDateTimeMillis(0L, (int) 'a', (int) (byte) 100, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str10, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(copticChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        long long14 = copticChronology0.add((long) 0, 0L, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.era();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = copticChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = copticChronology0.seconds();
        org.joda.time.DurationField durationField7 = copticChronology0.seconds();
        org.joda.time.DurationField durationField8 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField10 = copticChronology0.seconds();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3501L + "'", long4 == 3501L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.Chronology chronology3 = copticChronology0.withUTC();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = copticChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField9 = copticChronology0.halfdays();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3501L + "'", long4 == 3501L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfHalfday();
        long long14 = copticChronology0.getDateTimeMillis((long) (byte) -1, (int) (short) 10, (int) '4', 0, (int) ' ');
        org.joda.time.DurationField durationField15 = copticChronology0.weeks();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean18 = copticChronology16.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField19 = copticChronology16.halfdayOfDay();
        org.joda.time.DurationField durationField20 = copticChronology16.millis();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology16.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology16.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = copticChronology16.add(readablePeriod23, 0L, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone27 = copticChronology16.getZone();
        org.joda.time.chrono.CopticChronology copticChronology28 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone27);
        org.joda.time.Chronology chronology29 = copticChronology0.withZone(dateTimeZone27);
        org.joda.time.DurationField durationField30 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology0.minuteOfDay();
        org.joda.time.chrono.CopticChronology copticChronology32 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology32.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.Chronology chronology35 = copticChronology32.withZone(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField36 = copticChronology32.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology32.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology32.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField39 = copticChronology32.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone40 = copticChronology32.getZone();
        org.joda.time.Chronology chronology41 = copticChronology0.withZone(dateTimeZone40);
        org.joda.time.chrono.CopticChronology copticChronology42 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField43 = copticChronology42.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField44 = copticChronology42.minuteOfDay();
        org.joda.time.chrono.CopticChronology copticChronology45 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        long long49 = copticChronology45.add(readablePeriod46, 3501L, (int) 'a');
        org.joda.time.chrono.CopticChronology copticChronology50 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean52 = copticChronology50.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField53 = copticChronology50.halfdayOfDay();
        org.joda.time.DurationField durationField54 = copticChronology50.millis();
        org.joda.time.DateTimeField dateTimeField55 = copticChronology50.minuteOfHour();
        org.joda.time.DurationField durationField56 = copticChronology50.years();
        org.joda.time.DateTimeZone dateTimeZone57 = copticChronology50.getZone();
        org.joda.time.Chronology chronology58 = copticChronology45.withZone(dateTimeZone57);
        org.joda.time.chrono.CopticChronology copticChronology59 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone57);
        org.joda.time.chrono.CopticChronology copticChronology60 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone57);
        org.joda.time.Chronology chronology61 = copticChronology42.withZone(dateTimeZone57);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-47279968L) + "'", long14 == (-47279968L));
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(copticChronology16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(copticChronology28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(copticChronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(copticChronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(copticChronology45);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 3501L + "'", long49 == 3501L);
        org.junit.Assert.assertNotNull(copticChronology50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(durationField54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(durationField56);
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(copticChronology59);
        org.junit.Assert.assertNotNull(copticChronology60);
        org.junit.Assert.assertNotNull(chronology61);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.year();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology8.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology8.yearOfCentury();
        org.joda.time.DurationField durationField13 = copticChronology8.seconds();
        boolean boolean14 = copticChronology0.equals((java.lang.Object) durationField13);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.centuryOfEra();
        long long20 = copticChronology0.add(0L, (-1L), 4);
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstance();
        long long25 = copticChronology21.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str26 = copticChronology21.toString();
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology27.millisOfDay();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology27.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone30 = copticChronology27.getZone();
        org.joda.time.Chronology chronology31 = copticChronology21.withZone(dateTimeZone30);
        org.joda.time.Chronology chronology32 = copticChronology0.withZone(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField33 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-4L) + "'", long20 == (-4L));
        org.junit.Assert.assertNotNull(copticChronology21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 98L + "'", long25 == 98L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str26, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(copticChronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.hourOfDay();
        long long19 = copticChronology0.add((-5005995567899990L), (long) 10, (-1));
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-5005995567900000L) + "'", long19 == (-5005995567900000L));
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField8 = copticChronology0.days();
        org.joda.time.DurationField durationField9 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = copticChronology0.getDateTimeMillis((int) (byte) 100, (int) (short) 1, (int) '#', (int) (short) -1, (int) (short) -1, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.hourOfHalfday();
        long long17 = copticChronology0.getDateTimeMillis((long) 'a', (int) (byte) 10, 4, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 36241010L + "'", long17 == 36241010L);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField5 = copticChronology0.weeks();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(copticChronology0);
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
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.yearOfEra();
        org.joda.time.Chronology chronology7 = copticChronology0.withUTC();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        java.lang.String str1 = copticChronology0.toString();
        int int2 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CopticChronology[UTC]" + "'", str1, "CopticChronology[UTC]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfDay();
        java.lang.String str7 = copticChronology0.toString();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.joda.time.DurationField durationField9 = copticChronology0.millis();
        java.lang.Class<?> wildcardClass10 = durationField9.getClass();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        java.lang.String str7 = copticChronology0.toString();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = copticChronology0.years();
        org.joda.time.ReadablePartial readablePartial9 = null;
        int[] intArray14 = new int[] { (short) 0, 1, (short) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            copticChronology0.validate(readablePartial9, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 10, -1]");
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.DurationField durationField10 = copticChronology0.halfdays();
        org.joda.time.Chronology chronology11 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField12 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField4 = copticChronology0.seconds();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(copticChronology0);
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
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekOfWeekyear();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = copticChronology7.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.dayOfWeek();
        java.lang.String str12 = copticChronology7.toString();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.millisOfDay();
        org.joda.time.DurationField durationField16 = copticChronology7.weekyears();
        boolean boolean17 = copticChronology0.equals((java.lang.Object) durationField16);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str12, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.yearOfCentury();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology11.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology11.getZone();
        org.joda.time.Chronology chronology15 = copticChronology0.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField17 = copticChronology0.hours();
        org.joda.time.DurationField durationField18 = copticChronology0.days();
        java.lang.String str19 = copticChronology0.toString();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str19, "CopticChronology[Etc/UTC]");
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (-1), (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = copticChronology0.months();
        org.joda.time.DurationField durationField9 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
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
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        long long14 = copticChronology0.getDateTimeMillis(52L, 0, 4, (int) (short) 10, (int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = copticChronology0.add(readablePeriod15, (long) 10, 10);
        java.lang.String str19 = copticChronology0.toString();
        org.joda.time.DurationField durationField20 = copticChronology0.years();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 250100L + "'", long14 == 250100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str19, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.yearOfCentury();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology11.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology11.getZone();
        org.joda.time.Chronology chronology15 = copticChronology0.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.dayOfYear();
        org.joda.time.Chronology chronology17 = copticChronology0.withUTC();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(chronology17);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = copticChronology6.halfdays();
        org.joda.time.DurationField durationField8 = copticChronology6.months();
        org.joda.time.DurationField durationField9 = copticChronology6.years();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology6.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = copticChronology6.get(readablePeriod11, 198L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        long long11 = copticChronology0.add((-47250220L), 2501032L, 0);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = copticChronology0.getDateTimeMillis(14692001L, 4, (int) (byte) -1, 0, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-47250220L) + "'", long11 == (-47250220L));
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        long long9 = copticChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DurationField durationField10 = copticChronology0.weeks();
        org.joda.time.DurationField durationField11 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology0.add(readablePeriod12, 100L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField18 = copticChronology0.years();
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = copticChronology19.add(readablePeriod20, 3501L, (int) 'a');
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean26 = copticChronology24.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField27 = copticChronology24.halfdayOfDay();
        org.joda.time.DurationField durationField28 = copticChronology24.millis();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology24.minuteOfHour();
        org.joda.time.DurationField durationField30 = copticChronology24.years();
        org.joda.time.DateTimeZone dateTimeZone31 = copticChronology24.getZone();
        org.joda.time.Chronology chronology32 = copticChronology19.withZone(dateTimeZone31);
        org.joda.time.chrono.CopticChronology copticChronology33 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone31);
        org.joda.time.chrono.CopticChronology copticChronology35 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone31, 1);
        org.joda.time.Chronology chronology36 = copticChronology0.withZone(dateTimeZone31);
        org.joda.time.DurationField durationField37 = copticChronology0.millis();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(copticChronology19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 3501L + "'", long23 == 3501L);
        org.junit.Assert.assertNotNull(copticChronology24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(copticChronology33);
        org.junit.Assert.assertNotNull(copticChronology35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(durationField37);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (-1), (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfHalfday();
        java.lang.String str8 = copticChronology0.toString();
        int int9 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField10 = copticChronology0.days();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = copticChronology0.weeks();
        org.joda.time.DurationField durationField8 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField10 = copticChronology0.halfdays();
        org.junit.Assert.assertNotNull(copticChronology0);
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
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = copticChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = copticChronology0.seconds();
        org.joda.time.DurationField durationField7 = copticChronology0.seconds();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = copticChronology0.set(readablePartial8, 652000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3501L + "'", long4 == 3501L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField8 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = copticChronology0.get(readablePeriod13, 15412001L, 10100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
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
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = copticChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = copticChronology3.days();
        boolean boolean11 = copticChronology0.equals((java.lang.Object) copticChronology3);
        org.joda.time.DurationField durationField12 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
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
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.secondOfMinute();
        long long7 = copticChronology0.add((-472799679798L), (long) (byte) 10, (int) (short) 100);
        int int8 = copticChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-472799678798L) + "'", long7 == (-472799678798L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.era();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Chronology chronology12 = copticChronology9.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology9.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology9.minuteOfHour();
        org.joda.time.DurationField durationField15 = copticChronology9.days();
        boolean boolean16 = copticChronology0.equals((java.lang.Object) copticChronology9);
        org.joda.time.DurationField durationField17 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekOfWeekyear();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.millisOfDay();
        org.joda.time.DurationField durationField11 = copticChronology9.seconds();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology9.add(readablePeriod12, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology9.hourOfHalfday();
        org.joda.time.DurationField durationField17 = copticChronology9.minutes();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology9.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = copticChronology9.getZone();
        org.joda.time.Chronology chronology20 = copticChronology0.withZone(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology0.weekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.year();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology8.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology8.yearOfCentury();
        org.joda.time.DurationField durationField13 = copticChronology8.seconds();
        boolean boolean14 = copticChronology0.equals((java.lang.Object) durationField13);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = copticChronology0.add(readablePeriod16, 10L, (int) 'a');
        int int20 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField21 = copticChronology0.weeks();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(durationField21);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology0.getZone();
        org.joda.time.DurationField durationField9 = copticChronology0.weeks();
        org.joda.time.DurationField durationField10 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.era();
        int int12 = copticChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (-1), (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = copticChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = copticChronology3.days();
        boolean boolean11 = copticChronology0.equals((java.lang.Object) copticChronology3);
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology3.getZone();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.secondOfMinute();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean18 = copticChronology16.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField19 = copticChronology16.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology16.secondOfDay();
        org.joda.time.DurationField durationField21 = copticChronology16.millis();
        boolean boolean22 = copticChronology14.equals((java.lang.Object) copticChronology16);
        org.joda.time.DurationField durationField23 = copticChronology14.halfdays();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(copticChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(copticChronology16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        java.lang.String str6 = copticChronology0.toString();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = copticChronology8.add(readablePeriod9, 3501L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField13 = copticChronology8.weekOfWeekyear();
        org.joda.time.DurationField durationField14 = copticChronology8.seconds();
        org.joda.time.DurationField durationField15 = copticChronology8.days();
        org.joda.time.DateTimeZone dateTimeZone16 = copticChronology8.getZone();
        org.joda.time.Chronology chronology17 = copticChronology0.withZone(dateTimeZone16);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str6, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3501L + "'", long12 == 3501L);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField9 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = copticChronology0.days();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.monthOfYear();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DurationField durationField13 = copticChronology7.centuries();
        org.joda.time.DurationField durationField14 = copticChronology7.centuries();
        org.joda.time.DurationField durationField15 = copticChronology7.minutes();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology7.monthOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = copticChronology0.hours();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        java.lang.Class<?> wildcardClass4 = copticChronology0.getClass();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        long long9 = copticChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.minuteOfDay();
        int int13 = copticChronology11.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.hourOfHalfday();
        int int11 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField14 = copticChronology0.minutes();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = copticChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean7 = copticChronology5.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology5.halfdayOfDay();
        org.joda.time.DurationField durationField9 = copticChronology5.millis();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology5.minuteOfHour();
        org.joda.time.DurationField durationField11 = copticChronology5.years();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology5.getZone();
        org.joda.time.Chronology chronology13 = copticChronology0.withZone(dateTimeZone12);
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12);
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology15.dayOfWeek();
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance();
        long long21 = copticChronology17.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField22 = copticChronology17.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology17.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = copticChronology17.getZone();
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone24, (int) (short) 1);
        org.joda.time.Chronology chronology27 = copticChronology15.withZone(dateTimeZone24);
        org.joda.time.DateTimeField dateTimeField28 = copticChronology15.millisOfDay();
        org.joda.time.DurationField durationField29 = copticChronology15.weekyears();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3501L + "'", long4 == 3501L);
        org.junit.Assert.assertNotNull(copticChronology5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(copticChronology14);
        org.junit.Assert.assertNotNull(copticChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 98L + "'", long21 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(copticChronology26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfDay();
        org.joda.time.Chronology chronology4 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField5 = copticChronology0.seconds();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        java.lang.String str7 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.Chronology chronology5 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField6 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfHalfday();
        int int10 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField11 = copticChronology0.millis();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.Chronology chronology3 = copticChronology0.withUTC();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.millis();
        org.joda.time.DurationField durationField6 = copticChronology0.years();
        org.joda.time.DurationField durationField7 = copticChronology0.hours();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology0.getZone();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField8 = copticChronology0.months();
        org.joda.time.DurationField durationField9 = copticChronology0.seconds();
        org.joda.time.DurationField durationField10 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.weekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = copticChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = copticChronology3.days();
        boolean boolean11 = copticChronology0.equals((java.lang.Object) copticChronology3);
        org.joda.time.DurationField durationField12 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField15 = copticChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone16 = copticChronology0.getZone();
        int int17 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField19 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.monthOfYear();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DurationField durationField13 = copticChronology7.centuries();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.dayOfMonth();
        org.joda.time.DurationField durationField16 = copticChronology7.days();
        org.joda.time.DurationField durationField17 = copticChronology7.centuries();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology7.centuryOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.monthOfYear();
        long long13 = copticChronology6.getDateTimeMillis(2501032L, (int) (short) 10, (int) (byte) 10, (int) '#', (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology6.weekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 36635000L + "'", long13 == 36635000L);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.months();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean11 = copticChronology9.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology9.halfdayOfDay();
        boolean boolean14 = copticChronology0.equals((java.lang.Object) dateTimeField13);
        org.joda.time.DurationField durationField15 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = copticChronology0.getDateTimeMillis((int) ' ', (int) (short) 0, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology8.hourOfHalfday();
        org.joda.time.DurationField durationField12 = copticChronology8.days();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology8.minuteOfDay();
        org.joda.time.DurationField durationField14 = copticChronology8.millis();
        boolean boolean15 = copticChronology0.equals((java.lang.Object) copticChronology8);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology8.hourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(copticChronology8);
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
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
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
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField5 = copticChronology0.halfdays();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.hourOfHalfday();
        long long13 = copticChronology0.add(102L, (-4727996799L), 100);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-472799679798L) + "'", long13 == (-472799679798L));
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.secondOfDay();
        java.lang.String str11 = copticChronology0.toString();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str11, "CopticChronology[Etc/UTC]");
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DurationField durationField3 = copticChronology0.centuries();
        org.joda.time.DurationField durationField4 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.yearOfEra();
        int int7 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = copticChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = copticChronology3.days();
        boolean boolean11 = copticChronology0.equals((java.lang.Object) copticChronology3);
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology3.getZone();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology14.hourOfDay();
        org.joda.time.Chronology chronology17 = copticChronology14.withUTC();
        org.joda.time.DurationField durationField18 = copticChronology14.centuries();
        org.joda.time.DurationField durationField19 = copticChronology14.minutes();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(copticChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = copticChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField7 = copticChronology0.seconds();
        org.joda.time.DurationField durationField8 = copticChronology0.seconds();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3501L + "'", long4 == 3501L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField10 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.weekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DurationField durationField7 = copticChronology0.millis();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology8.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology8.dayOfWeek();
        java.lang.String str13 = copticChronology8.toString();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology8.secondOfDay();
        org.joda.time.DurationField durationField15 = copticChronology8.minutes();
        long long19 = copticChronology8.add((long) '#', (long) (short) 1, (int) ' ');
        org.joda.time.DurationField durationField20 = copticChronology8.centuries();
        org.joda.time.DateTimeZone dateTimeZone21 = copticChronology8.getZone();
        org.joda.time.Chronology chronology22 = copticChronology0.withZone(dateTimeZone21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone21, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str13, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 67L + "'", long19 == 67L);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(chronology22);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = copticChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        long long9 = copticChronology0.getDateTimeMillis((int) (byte) 1, (int) (byte) 10, (int) (byte) 10, (int) ' ');
        org.joda.time.DurationField durationField10 = copticChronology0.seconds();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53160105599968L) + "'", long9 == (-53160105599968L));
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        java.lang.String str6 = copticChronology0.toString();
        org.joda.time.DurationField durationField7 = copticChronology0.millis();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str6, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (-1), (int) (byte) 100);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField11 = copticChronology7.millis();
        org.joda.time.DurationField durationField12 = copticChronology7.days();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.yearOfCentury();
        boolean boolean14 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField16 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.millisOfDay();
        java.lang.String str18 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str18, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        java.lang.String str6 = copticChronology0.toString();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.weekyear();
        org.joda.time.DurationField durationField9 = copticChronology7.years();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology7.hourOfHalfday();
        org.joda.time.DurationField durationField13 = copticChronology7.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone15 = copticChronology7.getZone();
        org.joda.time.Chronology chronology16 = copticChronology0.withZone(dateTimeZone15);
        org.joda.time.DurationField durationField17 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField20 = copticChronology0.millis();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str6, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(copticChronology7);
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
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = copticChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField12 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField6 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        java.lang.String str8 = copticChronology0.toString();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.monthOfYear();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.hourOfHalfday();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean16 = copticChronology14.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField17 = copticChronology14.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = copticChronology14.getZone();
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone18);
        org.joda.time.Chronology chronology20 = copticChronology7.withZone(dateTimeZone18);
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone18);
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone18, (int) (short) 1);
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField25 = copticChronology24.weekyearOfCentury();
        java.lang.Class<?> wildcardClass26 = copticChronology24.getClass();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(copticChronology14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(copticChronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(copticChronology21);
        org.junit.Assert.assertNotNull(copticChronology23);
        org.junit.Assert.assertNotNull(copticChronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField10 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField6 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfMonth();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        long long13 = copticChronology9.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField14 = copticChronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology9.weekOfWeekyear();
        java.lang.String str16 = copticChronology9.toString();
        org.joda.time.DurationField durationField17 = copticChronology9.minutes();
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean20 = copticChronology18.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology18.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology18.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = copticChronology18.getZone();
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone23);
        org.joda.time.Chronology chronology25 = copticChronology9.withZone(dateTimeZone23);
        org.joda.time.Chronology chronology26 = copticChronology0.withZone(dateTimeZone23);
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone23);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 98L + "'", long13 == 98L);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str16, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(copticChronology18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(copticChronology24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(copticChronology27);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyear();
        int int7 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = copticChronology0.getDateTimeMillis((int) (short) 10, 10, (int) (short) -1, (int) (byte) 1, (int) '4', (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
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
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfDay();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        long long13 = copticChronology9.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField14 = copticChronology9.weekyears();
        org.joda.time.DateTimeZone dateTimeZone15 = copticChronology9.getZone();
        org.joda.time.Chronology chronology16 = copticChronology0.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.secondOfMinute();
        int int19 = copticChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 98L + "'", long13 == 98L);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField6 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField10 = copticChronology0.years();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.eras();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = copticChronology0.add(readablePeriod5, (long) (-1), 4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfWeek();
        org.joda.time.Chronology chronology10 = copticChronology0.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = copticChronology0.getDateTimeMillis(100, 10, (int) ' ', (int) (byte) 1, (int) (short) 100, (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DurationField durationField4 = copticChronology0.minutes();
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology5.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Chronology chronology8 = copticChronology5.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology5.dayOfWeek();
        java.lang.String str10 = copticChronology5.toString();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology5.secondOfDay();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology12.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = copticChronology12.getZone();
        org.joda.time.Chronology chronology16 = copticChronology5.withZone(dateTimeZone15);
        org.joda.time.DurationField durationField17 = copticChronology5.years();
        boolean boolean18 = copticChronology0.equals((java.lang.Object) durationField17);
        org.joda.time.DurationField durationField19 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(copticChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str10, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfWeek();
        int int6 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField7 = copticChronology0.halfdays();
        int int8 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField9 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = copticChronology0.getDateTimeMillis((int) (byte) 1, (int) (byte) 0, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField13 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.secondOfMinute();
        long long7 = copticChronology0.add((long) (-1), (long) (short) 100, 0);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.year();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.centuryOfEra();
        boolean boolean11 = copticChronology6.equals((java.lang.Object) copticChronology7);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.monthOfYear();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DurationField durationField13 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField14 = copticChronology0.years();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = copticChronology0.getDateTimeMillis((-47283507212945L), (int) (byte) 0, (int) (short) -1, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.era();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology0.add(readablePeriod10, 36601010L, (int) (short) -1);
        long long18 = copticChronology0.getDateTimeMillis(1, 4, (int) (byte) 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            long long24 = copticChronology0.getDateTimeMillis(0L, (int) ' ', (int) (short) 0, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 36601010L + "'", long13 == 36601010L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-53176435199948L) + "'", long18 == (-53176435199948L));
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField3 = copticChronology0.years();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.monthOfYear();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology10.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.Chronology chronology13 = copticChronology10.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology10.dayOfWeek();
        org.joda.time.DurationField durationField15 = copticChronology10.months();
        org.joda.time.DurationField durationField16 = copticChronology10.months();
        org.joda.time.DurationField durationField17 = copticChronology10.hours();
        org.joda.time.DateTimeZone dateTimeZone18 = copticChronology10.getZone();
        org.joda.time.Chronology chronology19 = copticChronology0.withZone(dateTimeZone18);
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone18);
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone18, 4);
        org.joda.time.DurationField durationField23 = copticChronology22.hours();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology22.weekyearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(copticChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(copticChronology20);
        org.junit.Assert.assertNotNull(copticChronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = copticChronology0.hours();
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.minuteOfHour();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology8.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology8.dayOfWeek();
        java.lang.String str13 = copticChronology8.toString();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology8.secondOfDay();
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology15.millisOfDay();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology15.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = copticChronology15.getZone();
        org.joda.time.Chronology chronology19 = copticChronology8.withZone(dateTimeZone18);
        boolean boolean20 = copticChronology0.equals((java.lang.Object) chronology19);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str13, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(copticChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = copticChronology0.add(readablePeriod9, (-5005995567899990L), (int) '4');
        org.joda.time.DurationField durationField13 = copticChronology0.days();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-5005995567899990L) + "'", long12 == (-5005995567899990L));
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfDay();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = copticChronology0.set(readablePartial5, 1696L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.days();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.year();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.secondOfDay();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField8 = copticChronology0.seconds();
        org.joda.time.DurationField durationField9 = copticChronology0.centuries();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfDay();
        java.lang.String str7 = copticChronology0.toString();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.joda.time.DurationField durationField9 = copticChronology0.millis();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology10.dayOfYear();
        org.joda.time.DurationField durationField12 = copticChronology10.millis();
        org.joda.time.DateTimeZone dateTimeZone13 = copticChronology10.getZone();
        org.joda.time.Chronology chronology14 = copticChronology0.withZone(dateTimeZone13);
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone13, (int) (short) 1);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(copticChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(copticChronology16);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.hourOfDay();
        org.joda.time.DurationField durationField11 = copticChronology8.weeks();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) copticChronology8);
        org.joda.time.Chronology chronology13 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField15 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = copticChronology6.months();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = copticChronology6.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology6.dayOfMonth();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.era();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = copticChronology0.add(readablePeriod8, (long) '#', (int) ' ');
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField13 = copticChronology0.weeks();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.millisOfDay();
        org.joda.time.DurationField durationField16 = copticChronology14.seconds();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = copticChronology14.add(readablePeriod17, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology14.hourOfHalfday();
        org.joda.time.DurationField durationField22 = copticChronology14.minutes();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology14.secondOfDay();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology14.monthOfYear();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology14.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone26 = copticChronology14.getZone();
        org.joda.time.Chronology chronology27 = copticChronology0.withZone(dateTimeZone26);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(copticChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(chronology27);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.weekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = copticChronology0.getDateTimeMillis((int) ' ', 1, (int) (short) 100, 0, (int) (short) 10, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DurationField durationField3 = copticChronology0.centuries();
        org.joda.time.DurationField durationField4 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.yearOfEra();
        org.joda.time.ReadablePartial readablePartial7 = null;
        int[] intArray13 = new int[] { '#', (short) 10, 4, 100, 1 };
        // The following exception was thrown during execution in test generation
        try {
            copticChronology0.validate(readablePartial7, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, 10, 4, 100, 1]");
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField7 = copticChronology0.eras();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfMonth();
        int int11 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField12 = copticChronology0.days();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = copticChronology0.add(readablePeriod13, (-53160105599967L), (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-53160105599967L) + "'", long16 == (-53160105599967L));
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = copticChronology0.getDateTimeMillis((int) ' ', 100, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6);
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology8.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology8.weekyear();
        int int15 = copticChronology8.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology8.yearOfEra();
        org.joda.time.DurationField durationField18 = copticChronology8.seconds();
        boolean boolean19 = copticChronology7.equals((java.lang.Object) copticChronology8);
        org.joda.time.DurationField durationField20 = copticChronology8.seconds();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology8.dayOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(copticChronology8);
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
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(copticChronology7);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        long long11 = copticChronology0.add((long) (byte) 1, (long) (short) 100, (int) '#');
        org.joda.time.DurationField durationField12 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.hourOfDay();
        org.joda.time.Chronology chronology16 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.era();
        org.joda.time.ReadablePartial readablePartial18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = copticChronology0.get(readablePartial18, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3501L + "'", long11 == 3501L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.weekyear();
        org.joda.time.DurationField durationField9 = copticChronology7.years();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology7.hourOfHalfday();
        org.joda.time.DurationField durationField13 = copticChronology7.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.yearOfCentury();
        boolean boolean15 = copticChronology0.equals((java.lang.Object) dateTimeField14);
        org.joda.time.DurationField durationField16 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.weekyear();
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology19.year();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology19.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology19.clockhourOfDay();
        java.lang.String str23 = copticChronology19.toString();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology19.weekyear();
        boolean boolean25 = copticChronology0.equals((java.lang.Object) dateTimeField24);
        org.joda.time.DateTimeField dateTimeField26 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology0.era();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(copticChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str23, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone9, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.dayOfWeek();
        org.joda.time.DurationField durationField13 = copticChronology11.minutes();
        java.lang.String str14 = copticChronology11.toString();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "CopticChronology[Etc/UTC,mdfw=1]" + "'", str14, "CopticChronology[Etc/UTC,mdfw=1]");
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        long long9 = copticChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DurationField durationField10 = copticChronology0.weeks();
        org.joda.time.DurationField durationField11 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology0.add(readablePeriod12, 101L, (int) (byte) 10);
        org.joda.time.DurationField durationField16 = copticChronology0.weeks();
        org.joda.time.DurationField durationField17 = copticChronology0.weeks();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 101L + "'", long15 == 101L);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.hourOfDay();
        org.joda.time.Chronology chronology10 = copticChronology0.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology11.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology11.getZone();
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone14);
        org.joda.time.Chronology chronology16 = copticChronology0.withZone(dateTimeZone14);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone14);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(copticChronology15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(copticChronology17);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField3 = copticChronology0.years();
        long long7 = copticChronology0.add((-47251200L), (-472799678798L), (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.halfdayOfDay();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = copticChronology0.get(readablePartial9, 500L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-47280015131000L) + "'", long7 == (-47280015131000L));
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.hours();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology0.hours();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = copticChronology0.getDateTimeMillis((int) (short) -1, (-1), 4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
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
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.minuteOfHour();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = copticChronology0.set(readablePartial10, (-1601911245500700L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.Chronology chronology3 = copticChronology0.withUTC();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.era();
        org.joda.time.DurationField durationField10 = copticChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone11 = copticChronology0.getZone();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.Chronology chronology3 = copticChronology0.withUTC();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.millis();
        org.joda.time.DurationField durationField6 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = copticChronology0.add(readablePeriod9, (-53176435199948L), (int) (short) 100);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-53176435199948L) + "'", long12 == (-53176435199948L));
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.Chronology chronology4 = copticChronology0.withUTC();
        org.joda.time.Chronology chronology5 = copticChronology0.withUTC();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology3.dayOfYear();
        boolean boolean5 = copticChronology0.equals((java.lang.Object) dateTimeField4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = copticChronology0.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField11 = copticChronology0.months();
        java.lang.Class<?> wildcardClass12 = durationField11.getClass();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (-1), (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        java.lang.String str6 = copticChronology0.toString();
        int int7 = copticChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str6, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.year();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.minuteOfDay();
        org.joda.time.DurationField durationField5 = copticChronology1.eras();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology1.halfdayOfDay();
        org.joda.time.Chronology chronology7 = copticChronology1.withUTC();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.hours();
        int int8 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean11 = copticChronology9.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology9.halfdayOfDay();
        org.joda.time.DurationField durationField13 = copticChronology9.millis();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology9.minuteOfHour();
        long long18 = copticChronology9.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DurationField durationField19 = copticChronology9.weeks();
        org.joda.time.DateTimeZone dateTimeZone20 = copticChronology9.getZone();
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone20);
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone20);
        org.joda.time.Chronology chronology23 = copticChronology0.withZone(dateTimeZone20);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1663L + "'", long18 == 1663L);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(copticChronology21);
        org.junit.Assert.assertNotNull(copticChronology22);
        org.junit.Assert.assertNotNull(chronology23);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.monthOfYear();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = copticChronology7.add(readablePeriod14, 0L, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology7.yearOfEra();
        org.joda.time.DurationField durationField19 = copticChronology7.centuries();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField8 = copticChronology0.days();
        org.joda.time.DurationField durationField9 = copticChronology0.centuries();
        org.joda.time.DurationField durationField10 = copticChronology0.centuries();
        long long14 = copticChronology0.add((-53160105599968L), (-1L), (int) (short) -1);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-53160105599967L) + "'", long14 == (-53160105599967L));
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.era();
        org.joda.time.DurationField durationField9 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField11 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.year();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekOfWeekyear();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.weekyear();
        org.joda.time.DurationField durationField11 = copticChronology9.years();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology9.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology9.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology9.hourOfDay();
        org.joda.time.DurationField durationField17 = copticChronology9.seconds();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology9.millisOfSecond();
        boolean boolean20 = copticChronology0.equals((java.lang.Object) dateTimeField19);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.weekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        long long11 = copticChronology7.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str12 = copticChronology7.toString();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology13.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = copticChronology13.getZone();
        org.joda.time.Chronology chronology17 = copticChronology7.withZone(dateTimeZone16);
        org.joda.time.Chronology chronology18 = copticChronology0.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 98L + "'", long11 == 98L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str12, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(copticChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.monthOfYear();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField14 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone17 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone17);
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField20 = copticChronology19.weekOfWeekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(copticChronology18);
        org.junit.Assert.assertNotNull(copticChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = copticChronology0.getDateTimeMillis((long) (-1), 0, (int) (short) 10, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        long long10 = copticChronology0.getDateTimeMillis((-171599980L), (int) (short) 10, 4, 1, 0);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-136559000L) + "'", long10 == (-136559000L));
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DurationField durationField5 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = copticChronology6.halfdays();
        org.joda.time.DurationField durationField8 = copticChronology6.seconds();
        org.joda.time.DurationField durationField9 = copticChronology6.minutes();
        org.joda.time.Chronology chronology10 = copticChronology6.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology6.yearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfDay();
        long long8 = copticChronology0.add(67L, (long) (byte) 1, (int) '#');
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 102L + "'", long8 == 102L);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfHalfday();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = copticChronology0.set(readablePartial6, (-85799990L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = copticChronology0.add(readablePeriod5, 20L, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField10 = copticChronology0.years();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 20L + "'", long8 == 20L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfHalfday();
        long long14 = copticChronology0.getDateTimeMillis((long) (byte) -1, (int) (short) 10, (int) '4', 0, (int) ' ');
        org.joda.time.DurationField durationField15 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.year();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-47279968L) + "'", long14 == (-47279968L));
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField11 = copticChronology0.minutes();
        org.joda.time.DurationField durationField12 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.weekyearOfCentury();
        boolean boolean6 = copticChronology0.equals((java.lang.Object) copticChronology2);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField9 = copticChronology2.millis();
        org.joda.time.DurationField durationField10 = copticChronology2.hours();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(copticChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        long long9 = copticChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.DurationField durationField11 = copticChronology0.days();
        org.joda.time.DurationField durationField12 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology0.add(readablePeriod10, 3274L, (int) ' ');
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField15 = copticChronology0.halfdays();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3274L + "'", long13 == 3274L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology8.hourOfHalfday();
        org.joda.time.DurationField durationField12 = copticChronology8.days();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology8.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology8.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone17 = copticChronology8.getZone();
        org.joda.time.Chronology chronology18 = copticChronology0.withZone(dateTimeZone17);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfMonth();
        long long10 = copticChronology0.add(0L, 10L, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = copticChronology0.add(readablePeriod8, (long) '4', 1);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField13 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.minuteOfDay();
        java.lang.Object obj15 = null;
        boolean boolean16 = copticChronology0.equals(obj15);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        java.lang.String str6 = copticChronology0.toString();
        org.joda.time.DurationField durationField7 = copticChronology0.minutes();
        org.joda.time.DurationField durationField8 = copticChronology0.centuries();
        org.joda.time.DurationField durationField9 = copticChronology0.seconds();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str6, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField3 = copticChronology0.years();
        java.lang.String str4 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str4, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.Chronology chronology3 = copticChronology0.withUTC();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.millis();
        org.joda.time.DurationField durationField6 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfMonth();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = copticChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField7 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = copticChronology0.getDateTimeMillis((int) 'a', (int) (short) 100, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3501L + "'", long4 == 3501L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        long long9 = copticChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DurationField durationField10 = copticChronology0.weeks();
        org.joda.time.DurationField durationField11 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology0.add(readablePeriod12, 100L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.DurationField durationField10 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField11 = copticChronology0.seconds();
        org.joda.time.DurationField durationField12 = copticChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone13 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.year();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology14.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology14.hourOfHalfday();
        boolean boolean18 = copticChronology0.equals((java.lang.Object) dateTimeField17);
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(copticChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.monthOfYear();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.hourOfHalfday();
        java.lang.String str14 = copticChronology7.toString();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = copticChronology7.add(readablePeriod16, (-99L), (int) '4');
        org.joda.time.Chronology chronology20 = copticChronology7.withUTC();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str14, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-99L) + "'", long19 == (-99L));
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.monthOfYear();
        org.joda.time.Chronology chronology10 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField11 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField8 = copticChronology0.days();
        org.joda.time.DurationField durationField9 = copticChronology0.centuries();
        org.joda.time.DurationField durationField10 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.minuteOfHour();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean14 = copticChronology12.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology12.halfdayOfDay();
        org.joda.time.DurationField durationField16 = copticChronology12.millis();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology12.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology12.weekOfWeekyear();
        boolean boolean20 = copticChronology0.equals((java.lang.Object) copticChronology12);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField23 = copticChronology0.months();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.monthOfYear();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.dayOfYear();
        long long17 = copticChronology7.add((long) (short) -1, 2501032L, (-1));
        org.joda.time.DateTimeField dateTimeField18 = copticChronology7.year();
        org.joda.time.DurationField durationField19 = copticChronology7.seconds();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology7.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone21 = copticChronology7.getZone();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-2501033L) + "'", long17 == (-2501033L));
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.hourOfDay();
        long long14 = copticChronology0.add((-83278990L), 97L, (int) (short) 0);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-83278990L) + "'", long14 == (-83278990L));
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        java.lang.String str6 = copticChronology0.toString();
        org.joda.time.DurationField durationField7 = copticChronology0.millis();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str6, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.months();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean11 = copticChronology9.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology9.halfdayOfDay();
        boolean boolean14 = copticChronology0.equals((java.lang.Object) dateTimeField13);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.minuteOfDay();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance();
        long long20 = copticChronology16.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField21 = copticChronology16.weekyears();
        org.joda.time.DateTimeZone dateTimeZone22 = copticChronology16.getZone();
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone22);
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology24.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.Chronology chronology27 = copticChronology24.withZone(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = copticChronology24.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology24.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology24.weekyear();
        int int31 = copticChronology24.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology24.monthOfYear();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology24.yearOfEra();
        org.joda.time.DurationField durationField34 = copticChronology24.seconds();
        boolean boolean35 = copticChronology23.equals((java.lang.Object) copticChronology24);
        org.joda.time.DateTimeField dateTimeField36 = copticChronology24.centuryOfEra();
        org.joda.time.Chronology chronology37 = copticChronology24.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology38 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean40 = copticChronology38.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField41 = copticChronology38.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField42 = copticChronology38.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone43 = copticChronology38.getZone();
        org.joda.time.chrono.CopticChronology copticChronology44 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone43);
        org.joda.time.chrono.CopticChronology copticChronology45 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone43);
        org.joda.time.DurationField durationField46 = copticChronology45.millis();
        org.joda.time.DurationField durationField47 = copticChronology45.weekyears();
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        long long51 = copticChronology45.add(readablePeriod48, 100L, (int) (short) -1);
        org.joda.time.chrono.CopticChronology copticChronology52 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField53 = copticChronology52.weekyear();
        org.joda.time.DateTimeField dateTimeField54 = copticChronology52.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology55 = org.joda.time.chrono.CopticChronology.getInstance();
        long long59 = copticChronology55.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField60 = copticChronology55.weekyears();
        org.joda.time.DateTimeField dateTimeField61 = copticChronology55.weekOfWeekyear();
        org.joda.time.DurationField durationField62 = copticChronology55.days();
        boolean boolean63 = copticChronology52.equals((java.lang.Object) copticChronology55);
        org.joda.time.DateTimeZone dateTimeZone64 = copticChronology55.getZone();
        org.joda.time.chrono.CopticChronology copticChronology66 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone64, (int) (byte) 1);
        org.joda.time.Chronology chronology67 = copticChronology45.withZone(dateTimeZone64);
        org.joda.time.chrono.CopticChronology copticChronology68 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone64);
        org.joda.time.Chronology chronology69 = copticChronology24.withZone(dateTimeZone64);
        org.joda.time.Chronology chronology70 = copticChronology0.withZone(dateTimeZone64);
        org.joda.time.DateTimeField dateTimeField71 = copticChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(copticChronology16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 98L + "'", long20 == 98L);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(copticChronology23);
        org.junit.Assert.assertNotNull(copticChronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(copticChronology38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(copticChronology44);
        org.junit.Assert.assertNotNull(copticChronology45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(durationField47);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 100L + "'", long51 == 100L);
        org.junit.Assert.assertNotNull(copticChronology52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(copticChronology55);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 98L + "'", long59 == 98L);
        org.junit.Assert.assertNotNull(durationField60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(durationField62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(dateTimeZone64);
        org.junit.Assert.assertNotNull(copticChronology66);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(copticChronology68);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertNotNull(chronology70);
        org.junit.Assert.assertNotNull(dateTimeField71);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField6 = copticChronology0.days();
        boolean boolean8 = copticChronology0.equals((java.lang.Object) 1L);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.secondOfMinute();
        long long7 = copticChronology0.add((-472799679798L), (long) (byte) 10, (int) (short) 100);
        org.joda.time.DurationField durationField8 = copticChronology0.days();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-472799678798L) + "'", long7 == (-472799678798L));
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        long long11 = copticChronology7.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str12 = copticChronology7.toString();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology13.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = copticChronology13.getZone();
        org.joda.time.Chronology chronology17 = copticChronology7.withZone(dateTimeZone16);
        org.joda.time.Chronology chronology18 = copticChronology0.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 98L + "'", long11 == 98L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str12, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(copticChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = copticChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = copticChronology3.days();
        boolean boolean11 = copticChronology0.equals((java.lang.Object) copticChronology3);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology3.yearOfCentury();
        org.joda.time.DurationField durationField13 = copticChronology3.weekyears();
        org.joda.time.DurationField durationField14 = copticChronology3.months();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = copticChronology7.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.dayOfWeek();
        java.lang.String str12 = copticChronology7.toString();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.millisOfDay();
        org.joda.time.DurationField durationField16 = copticChronology7.weekyears();
        boolean boolean17 = copticChronology0.equals((java.lang.Object) durationField16);
        long long21 = copticChronology0.add(0L, 250100L, (int) ' ');
        org.joda.time.DateTimeField dateTimeField22 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField24 = copticChronology0.days();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str12, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 8003200L + "'", long21 == 8003200L);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = copticChronology0.get(readablePeriod10, (-52103260797514L), (-50059727999999L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        long long14 = copticChronology0.getDateTimeMillis(52L, 0, 4, (int) (short) 10, (int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = copticChronology0.add(readablePeriod15, (long) 10, 10);
        long long22 = copticChronology0.add((long) (short) 10, 1L, (int) '4');
        org.joda.time.DateTimeField dateTimeField23 = copticChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 250100L + "'", long14 == 250100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 62L + "'", long22 == 62L);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology4.dayOfYear();
        org.joda.time.DurationField durationField6 = copticChronology4.millis();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology7.getZone();
        boolean boolean11 = copticChronology4.equals((java.lang.Object) copticChronology7);
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology7.getZone();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12);
        org.joda.time.Chronology chronology14 = copticChronology0.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = copticChronology0.getDateTimeMillis((int) (byte) 10, (int) (byte) 0, (int) (short) -1, (int) (short) -1, (int) '4', (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(copticChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(copticChronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        long long11 = copticChronology0.add((long) (byte) 1, (long) (short) 100, (int) '#');
        org.joda.time.DurationField durationField12 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField19 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField21 = copticChronology0.years();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.monthOfYear();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField15 = copticChronology0.centuries();
        org.joda.time.DurationField durationField16 = copticChronology0.days();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = copticChronology0.getDateTimeMillis((-1), 0, (int) (short) 100, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = copticChronology0.add(readablePeriod7, 0L, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone11);
        org.joda.time.DurationField durationField13 = copticChronology12.years();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology12.centuryOfEra();
        java.lang.Class<?> wildcardClass15 = copticChronology12.getClass();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekyear();
        java.lang.String str10 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField13 = copticChronology0.centuries();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str10, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DurationField durationField6 = copticChronology0.months();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = copticChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = copticChronology3.days();
        boolean boolean11 = copticChronology0.equals((java.lang.Object) copticChronology3);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField13 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField16 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.year();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        long long14 = copticChronology0.getDateTimeMillis(52L, 0, 4, (int) (short) 10, (int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = copticChronology0.add(readablePeriod15, (long) 10, 10);
        java.lang.String str19 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField21 = copticChronology0.millis();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 250100L + "'", long14 == 250100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str19, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = copticChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyearOfCentury();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3501L + "'", long4 == 3501L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = copticChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = copticChronology0.get(readablePartial9, (-24409382L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3501L + "'", long4 == 3501L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (-1), (int) (byte) 100);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField11 = copticChronology7.millis();
        org.joda.time.DurationField durationField12 = copticChronology7.days();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.yearOfCentury();
        boolean boolean14 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField16 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(copticChronology7);
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
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.monthOfYear();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField14 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.monthOfYear();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField11 = copticChronology7.millis();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = copticChronology7.add(readablePeriod14, 0L, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone18 = copticChronology7.getZone();
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone18);
        org.joda.time.Chronology chronology20 = copticChronology0.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology0.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = copticChronology0.add(readablePeriod23, 3492100495L, (int) (byte) 0);
        org.joda.time.DurationField durationField27 = copticChronology0.minutes();
        org.joda.time.DurationField durationField28 = copticChronology0.centuries();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(copticChronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3492100495L + "'", long26 == 3492100495L);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(durationField28);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfDay();
        java.lang.Class<?> wildcardClass7 = copticChronology0.getClass();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfWeek();
        int int11 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField14 = copticChronology0.eras();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField13 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField15 = copticChronology0.millis();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = copticChronology0.weeks();
        org.joda.time.DurationField durationField11 = copticChronology0.weekyears();
        long long17 = copticChronology0.getDateTimeMillis((long) ' ', 4, 10, (int) (byte) 1, (int) 'a');
        org.joda.time.DurationField durationField18 = copticChronology0.centuries();
        org.joda.time.DurationField durationField19 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
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
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField6 = copticChronology0.hours();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.era();
        org.joda.time.DurationField durationField14 = copticChronology0.years();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField11 = copticChronology0.halfdays();
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = copticChronology0.get(readablePartial12, 198L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology5.weekOfWeekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(copticChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (-1), (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfMinute();
        int int9 = copticChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.monthOfYear();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.weekyear();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.millisOfDay();
        org.joda.time.DurationField durationField16 = copticChronology14.seconds();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = copticChronology14.add(readablePeriod17, (long) (byte) 10, (int) (byte) 100);
        boolean boolean21 = copticChronology0.equals((java.lang.Object) copticChronology14);
        org.joda.time.DateTimeField dateTimeField22 = copticChronology0.yearOfCentury();
        long long26 = copticChronology0.add((long) 1, (long) (byte) 0, (int) 'a');
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        long long30 = copticChronology0.add(readablePeriod27, (-50367900L), (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField31 = copticChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(copticChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-50367900L) + "'", long30 == (-50367900L));
        org.junit.Assert.assertNotNull(dateTimeField31);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.hourOfDay();
        org.joda.time.DurationField durationField11 = copticChronology8.weeks();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) copticChronology8);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology8.year();
        org.joda.time.DurationField durationField14 = copticChronology8.months();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology8.hourOfHalfday();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DurationField durationField7 = copticChronology0.millis();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology8.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology8.dayOfWeek();
        java.lang.String str13 = copticChronology8.toString();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology8.secondOfDay();
        org.joda.time.DurationField durationField15 = copticChronology8.minutes();
        long long19 = copticChronology8.add((long) '#', (long) (short) 1, (int) ' ');
        org.joda.time.DurationField durationField20 = copticChronology8.centuries();
        org.joda.time.DateTimeZone dateTimeZone21 = copticChronology8.getZone();
        org.joda.time.Chronology chronology22 = copticChronology0.withZone(dateTimeZone21);
        java.lang.Class<?> wildcardClass23 = dateTimeZone21.getClass();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str13, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 67L + "'", long19 == 67L);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = copticChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = copticChronology3.days();
        boolean boolean11 = copticChronology0.equals((java.lang.Object) copticChronology3);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField13 = copticChronology0.months();
        org.joda.time.DurationField durationField14 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone16 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.minuteOfHour();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
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
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = copticChronology0.add(readablePeriod8, (long) '4', 1);
        long long15 = copticChronology0.add(7200L, (-71541331L), 10);
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean18 = copticChronology16.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField19 = copticChronology16.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = copticChronology16.getZone();
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone20);
        org.joda.time.DurationField durationField22 = copticChronology21.years();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = copticChronology21.add(readablePeriod23, (-50059728000000L), (int) (short) -1);
        org.joda.time.DateTimeField dateTimeField27 = copticChronology21.era();
        boolean boolean28 = copticChronology0.equals((java.lang.Object) copticChronology21);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-715406110L) + "'", long15 == (-715406110L));
        org.junit.Assert.assertNotNull(copticChronology16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(copticChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-50059728000000L) + "'", long26 == (-50059728000000L));
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField6 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.junit.Assert.assertNotNull(copticChronology0);
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
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfHalfday();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.minuteOfDay();
        org.joda.time.DurationField durationField11 = copticChronology9.halfdays();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) durationField11);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = copticChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = copticChronology0.seconds();
        org.joda.time.Chronology chronology7 = copticChronology0.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean10 = copticChronology8.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology8.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = copticChronology8.getZone();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = copticChronology14.getZone();
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone16);
        org.joda.time.Chronology chronology18 = copticChronology0.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3501L + "'", long4 == 3501L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(copticChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.yearOfCentury();
        org.joda.time.DurationField durationField12 = copticChronology7.years();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.dayOfYear();
        boolean boolean14 = copticChronology0.equals((java.lang.Object) copticChronology7);
        java.lang.String str15 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = copticChronology0.add(readablePeriod17, (-937L), 0);
        java.lang.Class<?> wildcardClass21 = copticChronology0.getClass();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str15, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-937L) + "'", long20 == (-937L));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField6 = copticChronology0.minutes();
        org.joda.time.DurationField durationField7 = copticChronology0.halfdays();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology0.getZone();
        org.joda.time.DurationField durationField9 = copticChronology0.weeks();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = copticChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = copticChronology0.add(readablePeriod9, (long) '4', (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        java.lang.String str4 = copticChronology0.toString();
        org.joda.time.Chronology chronology5 = copticChronology0.withUTC();
        org.joda.time.ReadablePartial readablePartial6 = null;
        int[] intArray8 = new int[] { 1 };
        // The following exception was thrown during execution in test generation
        try {
            copticChronology0.validate(readablePartial6, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str4, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1]");
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField8 = copticChronology0.days();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology0.getZone();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        int int7 = copticChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.year();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.millisOfDay();
        org.joda.time.DurationField durationField11 = copticChronology9.seconds();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology9.add(readablePeriod12, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology9.hourOfHalfday();
        boolean boolean17 = copticChronology0.equals((java.lang.Object) dateTimeField16);
        java.lang.String str18 = copticChronology0.toString();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str18, "CopticChronology[Etc/UTC]");
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekyear();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = copticChronology0.get(readablePeriod10, (-1654800526083500L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (-1), (int) (byte) 100);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean9 = copticChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField11 = copticChronology7.millis();
        org.joda.time.DurationField durationField12 = copticChronology7.days();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.yearOfCentury();
        boolean boolean14 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.yearOfCentury();
        org.joda.time.Chronology chronology16 = copticChronology0.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance();
        long long21 = copticChronology17.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str22 = copticChronology17.toString();
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology23.millisOfDay();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology23.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = copticChronology23.getZone();
        org.joda.time.Chronology chronology27 = copticChronology17.withZone(dateTimeZone26);
        org.joda.time.chrono.CopticChronology copticChronology28 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone26);
        org.joda.time.Chronology chronology29 = copticChronology0.withZone(dateTimeZone26);
        org.joda.time.chrono.CopticChronology copticChronology30 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone26);
        org.joda.time.chrono.CopticChronology copticChronology31 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone26);
        org.joda.time.chrono.CopticChronology copticChronology32 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone26);
        org.joda.time.chrono.CopticChronology copticChronology33 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone26);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 98L + "'", long21 == 98L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str22, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(copticChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(copticChronology28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(copticChronology30);
        org.junit.Assert.assertNotNull(copticChronology31);
        org.junit.Assert.assertNotNull(copticChronology32);
        org.junit.Assert.assertNotNull(copticChronology33);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology0.weeks();
        org.joda.time.DurationField durationField4 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        java.lang.String str3 = copticChronology0.toString();
        org.joda.time.DurationField durationField4 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str3, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        long long14 = copticChronology0.getDateTimeMillis(52L, 0, 4, (int) (short) 10, (int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = copticChronology0.add(readablePeriod15, (long) 10, 10);
        long long22 = copticChronology0.add((long) ' ', 250100L, (int) (byte) 10);
        org.joda.time.DurationField durationField23 = copticChronology0.weeks();
        int int24 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone25 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 250100L + "'", long14 == 250100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2501032L + "'", long22 == 2501032L);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DurationField durationField5 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField8 = copticChronology0.weeks();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology10.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology10.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = copticChronology10.add(readablePeriod13, (-938L), (int) (byte) 1);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(copticChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-938L) + "'", long16 == (-938L));
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.year();
        org.joda.time.DurationField durationField13 = copticChronology0.millis();
        org.joda.time.DurationField durationField14 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField15 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField16 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField19 = copticChronology0.weeks();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology3.dayOfYear();
        boolean boolean5 = copticChronology0.equals((java.lang.Object) dateTimeField4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfMinute();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance();
        long long14 = copticChronology10.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField15 = copticChronology10.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology10.weekOfWeekyear();
        java.lang.String str17 = copticChronology10.toString();
        java.lang.String str18 = copticChronology10.toString();
        org.joda.time.DateTimeZone dateTimeZone19 = copticChronology10.getZone();
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone19, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField22 = copticChronology21.dayOfWeek();
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology23.weekyear();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology23.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstance();
        long long30 = copticChronology26.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField31 = copticChronology26.weekyears();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology26.weekOfWeekyear();
        org.joda.time.DurationField durationField33 = copticChronology26.days();
        boolean boolean34 = copticChronology23.equals((java.lang.Object) copticChronology26);
        org.joda.time.DateTimeZone dateTimeZone35 = copticChronology26.getZone();
        org.joda.time.chrono.CopticChronology copticChronology37 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone35, (int) (byte) 1);
        org.joda.time.Chronology chronology38 = copticChronology21.withZone(dateTimeZone35);
        org.joda.time.Chronology chronology39 = copticChronology0.withZone(dateTimeZone35);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(copticChronology10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 98L + "'", long14 == 98L);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str17, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str18, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(copticChronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(copticChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(copticChronology26);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 98L + "'", long30 == 98L);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(copticChronology37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(chronology39);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.eras();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DurationField durationField6 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = copticChronology0.months();
        org.joda.time.DurationField durationField9 = copticChronology0.millis();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.DurationField durationField11 = copticChronology0.days();
        java.lang.Class<?> wildcardClass12 = copticChronology0.getClass();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        long long9 = copticChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.DurationField durationField11 = copticChronology0.days();
        org.joda.time.DurationField durationField12 = copticChronology0.millis();
        org.joda.time.DurationField durationField13 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField14 = copticChronology0.seconds();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = copticChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = copticChronology3.days();
        boolean boolean11 = copticChronology0.equals((java.lang.Object) copticChronology3);
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology3.getZone();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.secondOfMinute();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean18 = copticChronology16.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField19 = copticChronology16.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology16.secondOfDay();
        org.joda.time.DurationField durationField21 = copticChronology16.millis();
        boolean boolean22 = copticChronology14.equals((java.lang.Object) copticChronology16);
        org.joda.time.DateTimeField dateTimeField23 = copticChronology16.centuryOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(copticChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(copticChronology16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = copticChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = copticChronology3.days();
        boolean boolean11 = copticChronology0.equals((java.lang.Object) copticChronology3);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField14 = copticChronology0.halfdays();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        long long11 = copticChronology0.add((long) (byte) 1, (long) (short) 100, (int) '#');
        org.joda.time.DurationField durationField12 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.yearOfEra();
        org.joda.time.Chronology chronology16 = copticChronology0.withUTC();
        org.joda.time.ReadablePartial readablePartial17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = copticChronology0.get(readablePartial17, (-1692806860799968L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3501L + "'", long11 == 3501L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = copticChronology0.get(readablePeriod17, (long) '#', 102L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField3 = copticChronology0.hours();
        org.joda.time.DurationField durationField4 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology8.hourOfDay();
        org.joda.time.DurationField durationField11 = copticChronology8.weeks();
        boolean boolean12 = copticChronology0.equals((java.lang.Object) copticChronology8);
        org.joda.time.DurationField durationField13 = copticChronology0.weeks();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = copticChronology0.millis();
        org.joda.time.Chronology chronology3 = copticChronology0.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = copticChronology0.getDateTimeMillis((-53160105599968L), 1, (int) (short) -1, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.dayOfWeek();
        org.joda.time.Chronology chronology9 = copticChronology7.withUTC();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology10.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology10.hourOfHalfday();
        org.joda.time.DurationField durationField14 = copticChronology10.days();
        org.joda.time.Chronology chronology15 = copticChronology10.withUTC();
        org.joda.time.DurationField durationField16 = copticChronology10.millis();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology10.monthOfYear();
        boolean boolean18 = copticChronology7.equals((java.lang.Object) copticChronology10);
        org.joda.time.DurationField durationField19 = copticChronology10.hours();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(copticChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = copticChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField13 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField15 = copticChronology0.months();
        org.joda.time.DurationField durationField16 = copticChronology0.years();
        org.joda.time.DurationField durationField17 = copticChronology0.halfdays();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField9 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.era();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance();
        long long14 = copticChronology10.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology10.halfdayOfDay();
        org.joda.time.DurationField durationField16 = copticChronology10.halfdays();
        org.joda.time.DurationField durationField17 = copticChronology10.centuries();
        org.joda.time.DurationField durationField18 = copticChronology10.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology10.era();
        boolean boolean20 = copticChronology0.equals((java.lang.Object) copticChronology10);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(copticChronology10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 98L + "'", long14 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology6.getZone();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = copticChronology9.seconds();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = copticChronology0.seconds();
        org.joda.time.DurationField durationField11 = copticChronology0.minutes();
        java.lang.String str12 = copticChronology0.toString();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str12, "CopticChronology[Etc/UTC]");
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.era();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Chronology chronology12 = copticChronology9.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology9.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology9.minuteOfHour();
        org.joda.time.DurationField durationField15 = copticChronology9.days();
        boolean boolean16 = copticChronology0.equals((java.lang.Object) copticChronology9);
        int int17 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = copticChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = copticChronology3.days();
        boolean boolean11 = copticChronology0.equals((java.lang.Object) copticChronology3);
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology3.getZone();
        org.joda.time.DurationField durationField13 = copticChronology3.weeks();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology3.hourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField9 = copticChronology0.weeks();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField7 = copticChronology0.seconds();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = copticChronology0.hours();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfYear();
        java.lang.String str7 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = copticChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField13 = copticChronology0.eras();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfDay();
        java.lang.String str7 = copticChronology0.toString();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = copticChronology0.get(readablePartial9, 36001035L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField2 = copticChronology0.months();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (-85799990L), (int) '#');
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-85799990L) + "'", long6 == (-85799990L));
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.Chronology chronology3 = copticChronology0.withUTC();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.millisOfDay();
        org.joda.time.DurationField durationField10 = copticChronology8.seconds();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = copticChronology8.add(readablePeriod11, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology8.hourOfHalfday();
        org.joda.time.DurationField durationField16 = copticChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology8.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = copticChronology8.getZone();
        org.joda.time.Chronology chronology19 = copticChronology0.withZone(dateTimeZone18);
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology20.era();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(copticChronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DurationField durationField3 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = copticChronology0.add(readablePeriod5, (-50059728000000L), (-1));
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-50059728000000L) + "'", long8 == (-50059728000000L));
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfHalfday();
        java.lang.String str9 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField11 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.era();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str9, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField9 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.era();
        org.joda.time.DurationField durationField11 = copticChronology0.weekyears();
        long long15 = copticChronology0.add(1984119620L, (-71541331L), (int) (short) -1);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2055660951L + "'", long15 == 2055660951L);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField9 = copticChronology0.hours();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField8 = copticChronology0.days();
        org.joda.time.DurationField durationField9 = copticChronology0.centuries();
        org.joda.time.DurationField durationField10 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.minuteOfHour();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean14 = copticChronology12.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology12.halfdayOfDay();
        org.joda.time.DurationField durationField16 = copticChronology12.millis();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology12.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology12.weekOfWeekyear();
        boolean boolean20 = copticChronology0.equals((java.lang.Object) copticChronology12);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField22 = copticChronology0.centuries();
        org.joda.time.DurationField durationField23 = copticChronology0.halfdays();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.year();
        org.joda.time.DurationField durationField10 = copticChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = copticChronology0.add(readablePeriod11, 15001097L, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = copticChronology0.getDateTimeMillis(100, 100, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
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
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = copticChronology0.centuries();
        org.joda.time.DurationField durationField9 = copticChronology0.centuries();
        org.joda.time.DurationField durationField10 = copticChronology0.halfdays();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = copticChronology7.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology7.dayOfWeek();
        java.lang.String str12 = copticChronology7.toString();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.millisOfDay();
        org.joda.time.DurationField durationField16 = copticChronology7.weekyears();
        boolean boolean17 = copticChronology0.equals((java.lang.Object) durationField16);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField20 = copticChronology0.days();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str12, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = copticChronology0.millis();
        org.joda.time.Chronology chronology3 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField6 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.dayOfMonth();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.DurationField durationField6 = copticChronology0.days();
        long long12 = copticChronology0.getDateTimeMillis(1L, (int) (byte) 0, (int) '4', (int) ' ', (int) (short) 100);
        java.lang.String str13 = copticChronology0.toString();
        org.joda.time.DurationField durationField14 = copticChronology0.months();
        org.joda.time.Chronology chronology15 = copticChronology0.withUTC();
        long long19 = copticChronology0.add((-53160105599967L), 10200L, 4);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3152100L + "'", long12 == 3152100L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str13, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-53160105559167L) + "'", long19 == (-53160105559167L));
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfDay();
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean6 = copticChronology4.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology4.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology4.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology4.era();
        boolean boolean11 = copticChronology0.equals((java.lang.Object) copticChronology4);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField13 = copticChronology0.weekyears();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(copticChronology4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DurationField durationField5 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField8 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = copticChronology0.getZone();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DurationField durationField6 = copticChronology0.days();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.millisOfDay();
        org.joda.time.DurationField durationField9 = copticChronology7.seconds();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology7.add(readablePeriod10, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.secondOfDay();
        org.joda.time.Chronology chronology15 = copticChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology7.halfdayOfDay();
        boolean boolean17 = copticChronology0.equals((java.lang.Object) copticChronology7);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.millisOfDay();
        int int19 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology20.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.Chronology chronology23 = copticChronology20.withZone(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField24 = copticChronology20.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology20.millisOfSecond();
        org.joda.time.DurationField durationField26 = copticChronology20.minutes();
        org.joda.time.DurationField durationField27 = copticChronology20.halfdays();
        org.joda.time.DateTimeZone dateTimeZone28 = copticChronology20.getZone();
        org.joda.time.chrono.CopticChronology copticChronology29 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone28);
        org.joda.time.Chronology chronology30 = copticChronology0.withZone(dateTimeZone28);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(copticChronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(copticChronology29);
        org.junit.Assert.assertNotNull(chronology30);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        long long9 = copticChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DurationField durationField10 = copticChronology0.weeks();
        org.joda.time.DurationField durationField11 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.Chronology chronology6 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = copticChronology0.getDateTimeMillis((-1601918581727999L), (int) ' ', (int) '#', 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.chrono.LimitChronology.LimitException; message: The instant is below the supported minimum of 0001-01-01T00:00:00.000Z (CopticChronology[UTC])");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        long long9 = copticChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology11.dayOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.year();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology1.minuteOfDay();
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology5.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology5.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology5.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology5.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology5.minuteOfDay();
        boolean boolean11 = copticChronology1.equals((java.lang.Object) dateTimeField10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology1.weekyearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(copticChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = copticChronology0.get(readablePeriod11, (-171599980L), (-938L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
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
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        long long11 = copticChronology0.add((long) (byte) 1, (long) (short) 100, (int) '#');
        org.joda.time.DurationField durationField12 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField18 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.year();
        org.joda.time.Chronology chronology20 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.dayOfWeek();
        long long27 = copticChronology0.getDateTimeMillis(1000L, (int) (short) 1, 0, 0, 100);
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 3600100L + "'", long27 == 3600100L);
    }
}

