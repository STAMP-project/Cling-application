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
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField11 = copticChronology0.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = copticChronology0.getDateTimeMillis(35L, (int) (short) 100, (int) (byte) 100, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
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
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.era();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
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
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = copticChronology0.hours();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfDay();
        long long15 = copticChronology0.getDateTimeMillis(146920107L, (int) (byte) 10, (int) '4', (int) (byte) 0, (int) '4');
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 125520052L + "'", long15 == 125520052L);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekOfWeekyear();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.hourOfDay();
        org.joda.time.Chronology chronology11 = copticChronology0.withUTC();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology0.add(readablePeriod12, 52L, 1);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField7 = copticChronology0.centuries();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfSecond();
        java.lang.String str6 = copticChronology0.toString();
        org.joda.time.DurationField durationField7 = copticChronology0.millis();
        long long11 = copticChronology0.add((long) '#', 250100L, 0);
        org.joda.time.DurationField durationField12 = copticChronology0.seconds();
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = copticChronology0.get(readablePartial13, (-71541331L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str6, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology0);
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
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
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
        org.joda.time.DurationField durationField22 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology0.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long31 = copticChronology0.getDateTimeMillis((int) (byte) 0, (int) (short) 10, (int) (byte) -1, 0, (int) 'a', (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
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
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(copticChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial8 = null;
        int[] intArray13 = new int[] { 'a', 10, (short) 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            copticChronology0.validate(readablePartial8, intArray13);
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[97, 10, 100, 10]");
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyear();
        int int8 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.millisOfSecond();
        org.joda.time.Chronology chronology10 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField11 = copticChronology0.weekyears();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.Chronology chronology3 = copticChronology0.withUTC();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.millis();
        org.joda.time.DurationField durationField6 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        java.lang.String str4 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.minuteOfDay();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.dayOfYear();
        org.joda.time.DurationField durationField10 = copticChronology8.millis();
        org.joda.time.DateTimeZone dateTimeZone11 = copticChronology8.getZone();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone11);
        org.joda.time.Chronology chronology13 = copticChronology0.withZone(dateTimeZone11);
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone11, (int) (short) 1);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str4, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(copticChronology15);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField3 = copticChronology0.years();
        long long7 = copticChronology0.add((-47251200L), (-472799678798L), (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-47280015131000L) + "'", long7 == (-47280015131000L));
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField3 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField5 = copticChronology0.hours();
        org.joda.time.DurationField durationField6 = copticChronology0.years();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DurationField durationField7 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
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
        org.joda.time.ReadablePartial readablePartial27 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = copticChronology0.get(readablePartial27, 98L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfMonth();
        long long10 = copticChronology0.add(0L, 10L, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology0.add(readablePeriod12, 20L, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = copticChronology0.add(readablePeriod17, 10L, (-1));
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 20L + "'", long15 == 20L);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
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
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = copticChronology17.add(readablePeriod19, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField23 = copticChronology17.monthOfYear();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology17.millisOfSecond();
        long long28 = copticChronology17.add(1L, (long) (short) 0, 10);
        org.joda.time.DateTimeField dateTimeField29 = copticChronology17.halfdayOfDay();
        boolean boolean30 = copticChronology9.equals((java.lang.Object) dateTimeField29);
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
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = copticChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField15 = copticChronology0.hours();
        long long19 = copticChronology0.add((-47280066589999L), 619L, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField20 = copticChronology0.weekyearOfCentury();
        org.joda.time.Chronology chronology21 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
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
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
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
        org.joda.time.ReadablePartial readablePartial17 = null;
        int[] intArray24 = new int[] { (-1), (short) -1, '4', 100, (byte) 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            copticChronology0.validate(readablePartial17, intArray24);
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
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1, 52, 100, 1, 0]");
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology3.dayOfYear();
        boolean boolean5 = copticChronology0.equals((java.lang.Object) dateTimeField4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekOfWeekyear();
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
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
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
        int[] intArray14 = new int[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            copticChronology0.validate(readablePartial12, intArray14);
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
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[52]");
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
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
        org.joda.time.DateTimeField dateTimeField21 = copticChronology7.hourOfDay();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology7.clockhourOfDay();
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
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = copticChronology0.getDateTimeMillis(7200L, (int) '4', 0, 10, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
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
        org.joda.time.DateTimeField dateTimeField22 = copticChronology0.year();
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
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
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
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.weekyear();
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
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfEra();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DurationField durationField6 = copticChronology0.hours();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str5, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        java.lang.String str4 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.minuteOfDay();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.dayOfYear();
        org.joda.time.DurationField durationField10 = copticChronology8.millis();
        org.joda.time.DateTimeZone dateTimeZone11 = copticChronology8.getZone();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone11);
        org.joda.time.Chronology chronology13 = copticChronology0.withZone(dateTimeZone11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone11, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str4, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        java.lang.String str7 = copticChronology0.toString();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str7, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
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
        org.joda.time.DateTimeField dateTimeField19 = copticChronology16.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology16.yearOfEra();
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
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DurationField durationField3 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfHalfday();
        long long8 = copticChronology0.add((-1601911245500700L), 402L, (int) (short) 10);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1601911245496680L) + "'", long8 == (-1601911245496680L));
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = copticChronology0.getDateTimeMillis(14692001L, 0, (int) (short) 0, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DurationField durationField5 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
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
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = copticChronology0.seconds();
        org.joda.time.DurationField durationField4 = copticChronology0.years();
        org.joda.time.DurationField durationField5 = copticChronology0.weeks();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = copticChronology0.getDateTimeMillis(4, (int) (short) 0, (int) (short) 100, (-1), 4, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfMonth();
        long long10 = copticChronology0.add(0L, 10L, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField12 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
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
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.secondOfDay();
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
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = copticChronology0.add(readablePeriod2, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.minuteOfDay();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Chronology chronology12 = copticChronology9.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology9.dayOfWeek();
        java.lang.String str14 = copticChronology9.toString();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology9.secondOfDay();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology16.millisOfDay();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology16.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = copticChronology16.getZone();
        org.joda.time.Chronology chronology20 = copticChronology9.withZone(dateTimeZone19);
        boolean boolean21 = copticChronology0.equals((java.lang.Object) dateTimeZone19);
        int int22 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone23 = copticChronology0.getZone();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str14, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(copticChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone23);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField7 = copticChronology0.weeks();
        org.joda.time.DurationField durationField8 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean11 = copticChronology9.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology9.halfdayOfDay();
        org.joda.time.DurationField durationField13 = copticChronology9.millis();
        org.joda.time.DurationField durationField14 = copticChronology9.days();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology9.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone16 = copticChronology9.getZone();
        org.joda.time.Chronology chronology17 = copticChronology0.withZone(dateTimeZone16);
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone16);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(copticChronology18);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
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
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.secondOfDay();
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
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.weekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.DateTimeZone dateTimeZone9 = copticChronology0.getZone();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology8.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = copticChronology8.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology8.dayOfWeek();
        org.joda.time.DurationField durationField13 = copticChronology8.months();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology8.secondOfMinute();
        org.joda.time.DurationField durationField15 = copticChronology8.weeks();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology8.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology8.dayOfMonth();
        int int19 = copticChronology8.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField20 = copticChronology8.days();
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean23 = copticChronology21.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField24 = copticChronology21.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology21.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = copticChronology21.getZone();
        org.joda.time.DurationField durationField27 = copticChronology21.days();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology21.clockhourOfDay();
        org.joda.time.DurationField durationField29 = copticChronology21.centuries();
        org.joda.time.chrono.CopticChronology copticChronology30 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology30.millisOfDay();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology30.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone33 = copticChronology30.getZone();
        org.joda.time.Chronology chronology34 = copticChronology21.withZone(dateTimeZone33);
        org.joda.time.Chronology chronology35 = copticChronology8.withZone(dateTimeZone33);
        org.joda.time.chrono.CopticChronology copticChronology36 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone33);
        org.joda.time.Chronology chronology37 = copticChronology0.withZone(dateTimeZone33);
        long long41 = copticChronology0.add((long) (short) 0, (-938L), (int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray44 = copticChronology0.get(readablePeriod42, (-36L));
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
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(copticChronology8);
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
        org.junit.Assert.assertNotNull(copticChronology21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(copticChronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(copticChronology36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.centuryOfEra();
        org.joda.time.DurationField durationField11 = copticChronology0.millis();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
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
        org.joda.time.DateTimeField dateTimeField27 = copticChronology0.weekyearOfCentury();
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
        org.junit.Assert.assertNotNull(dateTimeField27);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField10 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.year();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology9.millisOfSecond();
        java.lang.String str12 = copticChronology9.toString();
        org.joda.time.DateTimeZone dateTimeZone13 = copticChronology9.getZone();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone13);
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone13);
        org.joda.time.Chronology chronology16 = copticChronology0.withZone(dateTimeZone13);
        org.joda.time.DurationField durationField17 = copticChronology0.seconds();
        org.joda.time.DurationField durationField18 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str12, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(copticChronology14);
        org.junit.Assert.assertNotNull(copticChronology15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
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
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        long long10 = copticChronology0.add((-47280066589999L), 98L, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-47280066589019L) + "'", long10 == (-47280066589019L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.Chronology chronology3 = copticChronology0.withUTC();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.millis();
        org.joda.time.DurationField durationField6 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField11 = copticChronology0.hours();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
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
        org.joda.time.DurationField durationField11 = copticChronology0.millis();
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = copticChronology0.set(readablePartial12, (-1424L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
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
        org.joda.time.DateTimeField dateTimeField30 = copticChronology0.minuteOfDay();
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
        org.junit.Assert.assertNotNull(dateTimeField30);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = copticChronology0.weeks();
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology2.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField7 = copticChronology2.years();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology2.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = copticChronology2.add(readablePeriod9, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology2.hourOfDay();
        org.joda.time.DurationField durationField17 = copticChronology2.hours();
        boolean boolean18 = copticChronology0.equals((java.lang.Object) durationField17);
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(copticChronology2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 98L + "'", long6 == 98L);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
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
        org.joda.time.DateTimeField dateTimeField30 = copticChronology0.dayOfWeek();
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
        org.junit.Assert.assertNotNull(dateTimeField30);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology3.dayOfYear();
        boolean boolean5 = copticChronology0.equals((java.lang.Object) dateTimeField4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.millisOfSecond();
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
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
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
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.millis();
        org.junit.Assert.assertNotNull(copticChronology0);
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
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfYear();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = copticChronology0.set(readablePartial7, (-4L));
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
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField3 = copticChronology0.years();
        int int4 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.year();
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
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField7 = copticChronology0.halfdays();
        int int8 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField9 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.millisOfDay();
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
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
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
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfDay();
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
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
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
        org.joda.time.DateTimeZone dateTimeZone19 = copticChronology16.getZone();
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
        org.junit.Assert.assertNotNull(dateTimeZone19);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
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
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField17 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology0.era();
        org.joda.time.DurationField durationField20 = copticChronology0.halfdays();
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
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.year();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
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
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.weeks();
        org.joda.time.DurationField durationField9 = copticChronology0.years();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean12 = copticChronology10.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology10.halfdayOfDay();
        org.joda.time.DurationField durationField14 = copticChronology10.millis();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology10.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology10.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = copticChronology10.add(readablePeriod17, 0L, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone21 = copticChronology10.getZone();
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone21);
        org.joda.time.Chronology chronology23 = copticChronology0.withZone(dateTimeZone21);
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone21, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(copticChronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(copticChronology22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(copticChronology24);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.weekyearOfCentury();
        boolean boolean6 = copticChronology0.equals((java.lang.Object) copticChronology2);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology0.getZone();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(copticChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.era();
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
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
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
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.DurationField durationField6 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.year();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology1.millisOfSecond();
        java.lang.String str4 = copticChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = copticChronology1.get(readablePeriod5, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str4, "CopticChronology[Etc/UTC]");
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.millis();
        org.joda.time.DurationField durationField6 = copticChronology0.millis();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = copticChronology0.add(readablePeriod7, 0L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
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
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
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
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology11.millisOfSecond();
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
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.minuteOfHour();
        org.joda.time.DurationField durationField9 = copticChronology0.months();
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
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
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
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology25.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology25.minuteOfHour();
        boolean boolean28 = copticChronology15.equals((java.lang.Object) dateTimeField27);
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
        org.junit.Assert.assertNotNull(copticChronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = copticChronology6.halfdays();
        org.joda.time.DurationField durationField8 = copticChronology6.seconds();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology6.clockhourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = copticChronology0.halfdays();
        org.joda.time.DurationField durationField4 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfDay();
        org.joda.time.Chronology chronology7 = copticChronology0.withUTC();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
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
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField22 = copticChronology0.minutes();
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
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfHour();
        long long9 = copticChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DateTimeZone dateTimeZone10 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.year();
        java.lang.Class<?> wildcardClass13 = copticChronology0.getClass();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone4);
        org.joda.time.DurationField durationField6 = copticChronology5.years();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology5.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology5.dayOfWeek();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(copticChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.secondOfMinute();
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
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = copticChronology0.millis();
        org.joda.time.Chronology chronology3 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.minuteOfHour();
        org.joda.time.Chronology chronology5 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField6 = copticChronology0.seconds();
        org.joda.time.DurationField durationField7 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(copticChronology0);
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
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = copticChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.millisOfSecond();
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
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.secondOfMinute();
        long long7 = copticChronology0.add((long) (-1), (long) (short) 100, 0);
        java.lang.Class<?> wildcardClass8 = copticChronology0.getClass();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology3.dayOfYear();
        boolean boolean5 = copticChronology0.equals((java.lang.Object) dateTimeField4);
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.minuteOfHour();
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
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        java.lang.String str4 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = copticChronology0.years();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str4, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
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
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology7.hourOfHalfday();
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
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.hours();
        org.junit.Assert.assertNotNull(copticChronology0);
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
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
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
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.era();
        int int16 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField17 = copticChronology0.weeks();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = copticChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = copticChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField9 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField10 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = copticChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.era();
        org.joda.time.DurationField durationField9 = copticChronology0.hours();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.yearOfEra();
        long long9 = copticChronology0.add((-1654800529584900L), 35014L, 100);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1654800526083500L) + "'", long9 == (-1654800526083500L));
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        long long11 = copticChronology0.add((long) (byte) 1, (long) (short) 100, (int) '#');
        org.joda.time.DurationField durationField12 = copticChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField14 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField15 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField16 = copticChronology0.halfdays();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3501L + "'", long11 == 3501L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField10 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = copticChronology0.get(readablePartial12, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
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
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
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
        org.joda.time.DateTimeZone dateTimeZone11 = copticChronology0.getZone();
        org.joda.time.DurationField durationField12 = copticChronology0.years();
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
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = copticChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.dayOfYear();
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
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
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
        org.joda.time.DurationField durationField12 = copticChronology0.centuries();
        org.joda.time.DurationField durationField13 = copticChronology0.months();
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
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long4 = copticChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology0.getZone();
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7);
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology9.millisOfSecond();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
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
        org.joda.time.DateTimeField dateTimeField26 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField27 = copticChronology0.months();
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
        org.junit.Assert.assertNotNull(durationField27);
    }
}

